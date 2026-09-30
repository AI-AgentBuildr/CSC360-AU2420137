# Lecture 14 Reflection: ASCII Tree Project – Integration & Final Testing

**Session Date:** 29/09/26  
**Entry Date:** 29/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Write `AsciiTree.java` — the `main` method tying all modules together
- [ ] Debug an accidentally empty committed file ("cannot access TreeNode")
- [ ] Resolve "Could not find or load main class" caused by a stale local clone
- [ ] Understand why UTF-8 encoding matters for the `├── └── │` characters
- [ ] Verify the final output against the expected target output

---

## ❓ Class Questions & Detailed Answers

### Q1: How does `AsciiTree.java` tie the project together?

* **Context:** Final integration and testing day, with all four modules merged into `main`.
* **Role:** `AsciiTree.java` holds the `main` method that ties everything together: read input, build the tree, print it.

### Q2: What caused the "cannot access TreeNode" compile error?

* **Cause:** One of our early files (`TreeNode.java`) had accidentally been committed empty due to an editor save issue, causing a confusing compile error on a teammate's branch.
* **Fix:** We traced it back to the source and fixed it directly on `main`.

### Q3: Why did `java AsciiTree` fail with "Could not find or load main class"?

* **Cause:** A stale, outdated local clone (stuck on the very first commit) — even though the real code was correctly merged on GitHub.
* **Fix:** Cloning fresh into a clean folder resolved it immediately.
* **Takeaway:** The error had nothing to do with the code itself. Starting from a fresh clone is often faster than debugging a confused one.

### Q4: Why does character encoding matter for this program?

* **UTF-8:** We confirmed the `├── └── │` characters print correctly because of UTF-8 encoding.
* **Caution:** Worth remembering if the program is ever run in an environment with a different default character encoding.
* **Takeaway:** Character encoding, JDK versions, and local Git state can all silently break a "correct" program, and are worth checking explicitly rather than assumed.

### Q5: How did we verify the project was done?

After resolving these issues, we ran the program end-to-end with our target input and got an exact match to our expected output:

```
CEO
├── VP_Sales
│   ├── Manager_1
│   │   └── Sales_Rep
│   └── Manager_2
└── VP_Eng
    ├── Dev_1
    ├── Dev_2
    └── Dev_3
```

* **Code that "looks right" isn't the same as code that runs right:** Every issue today was invisible from just reading the source — an empty file, a stale clone, an encoding quirk. Actually compiling and running the program was what caught them.
* **Verification is the real final step:** Getting an exact match against our target output was the point where the project actually felt done — not when the last pull request merged.
