# Build the React app using Node 24.1.0
FROM node:24.1.0 AS builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

# Serve the app with Nginx
FROM nginx:alpine
COPY --from=builder /app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

