# Etapa 1: Build do projeto
FROM node:18 AS build

# Criar e usar o diretório de trabalho
WORKDIR /app

# Copiar os arquivos de configuração primeiro
COPY package.json package-lock.json ./

# Instalar dependências
RUN npm install

# Copiar o restante do código para dentro do container
COPY . .

# Gerar o build do Angular
RUN npm run build

# Etapa 2: Servir o app usando nginx
FROM nginx:stable-alpine

# Remover o conteúdo padrão do nginx
RUN rm -rf /usr/share/nginx/html/*

# Copiar o build do projeto para o nginx
COPY --from=build /app/dist/frontend-angular-produtos-v14 /usr/share/nginx/html

# (Opcional) Copiar um nginx.conf customizado se quiser
# COPY nginx.conf /etc/nginx/nginx.conf

# Expor a porta 80
EXPOSE 80

# Rodar nginx em modo foreground
CMD ["nginx", "-g", "daemon off;"]
