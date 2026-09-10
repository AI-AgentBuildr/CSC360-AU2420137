# Personal Reflection: Session 9 – Headless Servers, TDD Methodology, and Thread Safety

**Session Date:** 03/09/26  


---

## What I Learned & Key Takeaways

In Session 9, we continued project reviews and explored key engineering practices. We clarified the difference between console ASCII printing (character layout) and JavaFX canvas rendering (coordinate mapping). Sketching our project tree on paper first saved significant coding time.

We then covered headless systems—servers operating without a physical display or GUI. Since cloud infrastructure runs headlessly, SSH key authentication is essential, giving direct command-line access without the overhead of remote desktop software.

We also introduced Test-Driven Development (TDD) and its Red-Green-Refactor cycle:

1. **RED:** Write a failing test before writing implementation code.
2. **GREEN:** Write the minimal code needed to pass the test.
3. **REFACTOR:** Clean up code while keeping tests passing.

Writing tests first acts as a functional spec, clarifying requirements early in the process.

Finally, we discussed thread safety. Force-stopping active threads risks corrupting shared memory. Using graceful cancellation flags signals background tasks to stop safely at predefined checkpoints.

---

## Core Takeaways

* **Text vs. Pixel Rendering:** Console ASCII formatting and graphical coordinate rendering require distinct programming methods.
* **Headless Architecture:** Remote servers operate without displays; SSH key authentication is the standard tool for command-line management.
* **TDD Approach:** Writing unit tests first clarifies requirements and ensures verified behavior during development.
* **Safe Concurrency:** Use graceful thread cancellation flags rather than force-stopping active background tasks.
