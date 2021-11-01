# ENVIRONMENT VARIABLES:

## Postgres related:
NIMBO_CORE_POSTGRES_URL<br>
NIMBO_CORE_POSTGRES_USERNAME<br>
NIMBO_CORE_POSTGRES_PASSWORD

# DOCKER CONTAINERS:

O projeto depende do banco de dados postgresSQL, dito isso esse comando vai subir um container com o banco de dados.

```docker run --name postgres-c -p 5432:5432 -e POSTGRES_PASSWORD=$NIMBO_CORE_POSTGRES_PASSWORD -d postgres```