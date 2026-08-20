# Java Database Engine Roadmap

This roadmap tracks the incremental development of the Java Database Engine.

The project intentionally begins with fundamental Java data structures and gradually introduces database internals, backend engineering, AI retrieval, and distributed systems concepts.

---

## Phase 0 — Engineering Foundation

- [x] Create Maven project
- [x] Configure Java 25
- [x] Initialize Git repository
- [x] Configure repository ignore rules
- [x] Add Maven Wrapper
- [x] Verify reproducible Maven build
- [ ] Create initial repository documentation
- [ ] Create GitHub repository
- [ ] Configure branch-based development workflow

---

## Phase 1 — ArrayDB

Build the first in-memory key-value database using Java arrays.

Planned capabilities:

- PUT
- GET
- UPDATE
- DELETE
- EXISTS
- SIZE
- DISPLAY

Primary learning areas:

- Arrays
- Searching
- Capacity management
- Key-value storage
- Time complexity
- Database CRUD concepts

---

## Phase 2 — Object-Oriented MiniDB

Refactor the prototype using object-oriented Java.

Primary learning areas:

- Classes
- Objects
- Constructors
- Encapsulation
- Methods
- Separation of responsibilities

---

## Phase 3 — Hash-Based Key-Value Store

Replace linear array lookup with hash-based storage.

Primary learning areas:

- Hashing
- Hash maps
- Collision concepts
- Lookup complexity

---

## Phase 4 — Persistent Storage

Persist database records to disk.

Primary learning areas:

- Files
- Bytes
- Serialization
- Java I/O
- Java NIO
- FileChannel
- ByteBuffer

---

## Phase 5 — Durability and Crash Recovery

Introduce Write-Ahead Logging (WAL).

Primary learning areas:

- Durability
- Write-ahead logging
- Recovery
- Atomic operations
- Failure scenarios

---

## Phase 6 — Storage Engine

Develop more realistic disk-storage mechanisms.

Planned areas:

- SSTables
- Indexes
- Compaction
- Page-oriented storage
- Caching

---

## Phase 7 — Graph Database

Extend the engine with graph-oriented storage.

Planned areas:

- Nodes
- Edges
- Adjacency lists
- BFS
- DFS
- Shortest-path traversal
- Graph query execution

---

## Phase 8 — Transactions and Concurrency

Introduce concurrent database access and transaction management.

Planned areas:

- ACID
- Locks
- Isolation
- MVCC
- Concurrent transactions
- Recovery

---

## Phase 9 — Vector Search

Add semantic-vector storage and retrieval.

Planned areas:

- Embeddings
- Cosine similarity
- Brute-force vector search
- Approximate nearest-neighbor search
- HNSW

---

## Phase 10 — Network and API Layer

Expose the database to external applications.

Planned areas:

- HTTP
- REST
- JSON
- Client/server architecture
- Networking

---

## Phase 11 — GenAI and GraphRAG

Integrate language models with database retrieval.

Planned areas:

- LangChain4j
- Natural-language queries
- NL2Query
- Retrieval-Augmented Generation
- GraphRAG
- Hybrid graph + vector retrieval

---

## Phase 12 — Workflow Automation

Integrate the database with external automation systems.

Planned areas:

- n8n
- Webhooks
- Automated ingestion
- Document processing pipelines

---

## Phase 13 — Distributed Database

Evolve the engine into a multi-node system.

Planned areas:

- Replication
- Leader election
- Raft
- Network partitions
- Fault tolerance
- Sharding

---

## Project Principle

Each phase should solve a limitation discovered in the previous phase.

New abstractions and technologies should be introduced only after the need for them is understood.