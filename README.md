# Project Kimberlite

An auditable immutable datastore with extreme write performance

## What is it?

Kimberlite is a thin application wrapper in front of a Cassandra database 
that turns Cassandra into an append-only database with an HMAC-based data 
consistency mechanism and optional Blockchain notary functionality.

## Configuration

- Cluster Definition
- CDDL
- HMAC Algorithm

## Features

- Insert-only
- Sharding key based row consistency
- Arbitrary Queries

## Maybe-Features

- Multiple Column Groups

## Non-Features

- Schema changes
