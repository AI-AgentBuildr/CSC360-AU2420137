# Lecture 06 Reflection — Aug 25, 2026

## Table of Contents
1. [Topics Covered (TODO Checklist)](#topics-covered-todo-checklist)
2. [Key Discussion Summary](#key-discussion-summary)
3. [Course Progression Tracker](#course-progression-tracker)

---

## Topics Covered (TODO Checklist)

- [ ] Understand the 3-tier drawing complexity roadmap (Square $\rightarrow$ Triangle $\rightarrow$ Trees / Fractals)
- [ ] Practice Git workflow hygiene: Always pull upstream changes before coding to avoid merge conflicts
- [ ] Articulate the core role and architecture of `pom.xml` in Maven repositories
- [ ] Understand Process vs. Thread fundamentals from an Operating Systems perspective
- [ ] Explain why GUI toolkits (Swing / JavaFX) are single-threaded and not thread-safe
- [ ] Use IntelliJ IDEA Maven lifecycle tools effectively (clean, compile, package, reload)
- [ ] Understand Java's JVM "cold start" latency and why it is avoided for quick scripting

---

## Key Discussion Summary

### 1. Git Workflow Best Practice
* **Upstream Pull Rule:** Always execute `git pull` before beginning local development to ensure parity with the remote branch and prevent divergence/merge conflicts.

### 2. Maven Architecture & `pom.xml`
* The `pom.xml` (Project Object Model) serves as the single source of truth for the project, declaring external dependencies (e.g., JavaFX), compiler source/target versions, and build plugin lifecycles.

### 3. OS Concepts: Process vs. Thread
* **Process:** An independent execution unit allocated its own dedicated memory address space by the OS.
* **Thread:** A lightweight unit of execution within a process that shares heap memory and open resources with sibling threads.

### 4. Why GUIs are Not Thread-Safe
* UI toolkits use a single-threaded Event Dispatch Thread (EDT) to handle event loops and component rendering.
* Making GUI components thread-safe with internal locks causes significant performance overhead and deadlock risks when coordinating animations and user inputs.

### 5. Java JVM "Cold Start"
* Java applications require the JVM to load classes, initialize memory, and JIT-compile bytecode at startup. This cold start delay makes Java impractical for lightweight shell/scripting tasks compared to interpreted scripts.

---

## Course Progression Tracker

* **Level 1 (Basic Primitives):** Square (Completed)
* **Level 2 (Geometric Math):** Triangle & Transformations (In Progress)
* **Level 3 (Recursive Structures):** Fractal Trees & Procedural Graphics (Upcoming)
