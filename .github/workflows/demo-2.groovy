
# This is a basic workflow to help you get started with Actions

name: App Workflow

# Controls when the workflow will run
on:
  # Triggers the workflow on push or pull request events but only for the "main" branch
  push:
    branches: [ "sanjai" ]
  pull_request:
    branches: [ "sanjai" ]

  # Allows you to run this workflow manually from the Actions tab
  workflow_dispatch:

# A workflow run is made up of one or more jobs that can run sequentially or in parallel
jobs:
  # This workflow contains a single job called "build"
  build:
    # The type of runner that the job will run on
    runs-on: ubuntu-latest

    # Steps represent a sequence of tasks that will be executed as part of the job
    steps:
      # Checks-out your repository under $GITHUB_WORKSPACE, so your job can access it
      - uses: actions/checkout@v4

      # Runs a single command using the runners shell
      - name: Run a one-line script
        run: echo Hello, world!

      # Runs a set of commands using the runners shell
      - name: Run a multi-line script
        run: |
          echo Add other actions to build,
          echo test, and deploy your project.
          
  test:
      runs-on: ubuntu-latest
      needs: [ build ]
      steps:
        - uses: actions/checkout@v4
        - name: test verify
          run: echo "Hostname is `hostname`" 
          run: echo "Ip is `hostname -I`"
  deploy:
      runs-on: ubuntu-latest
      needs: [ build,test]
      steps:
        - uses: actions/checkout@v4
        - name: deploy verify
          run: echo "deploy stage successful "
