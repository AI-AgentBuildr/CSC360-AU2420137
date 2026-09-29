# Personal Reflection: ASCII Tree Project – Integration & Final Testing

**Session Date:** 29/09/26  
**Entry Date:** 29/09/26  

---

## What I Learned & Key Takeaways

Final integration and testing day. With all four modules merged into
`main`, I wrote `AsciiTree.java` — the `main` method that ties everything
together: read input, build the tree, print it.

Along the way we hit a few environment issues that took real debugging,
separate from the project's core logic:

- One of our early files (`TreeNode.java`) had accidentally been committed
  empty due to an editor save issue, which caused a confusing "cannot
  access TreeNode" compile error on a teammate's branch. We traced it back
  to the source and fixed it directly on `main`.
- A stale, outdated local clone (stuck on the very first commit) caused
  `java AsciiTree` to fail with "Could not find or load main class," even
  though the real code was correctly merged on GitHub. Cloning fresh into a
  clean folder resolved it immediately.
- We confirmed the `├── └── │` characters print correctly because of UTF-8
  encoding — worth remembering if the program is ever run in an
  environment with a different default character encoding.

After resolving these, we ran the program end-to-end with our target input
and got an exact match to our expected output:

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

---

## Core Takeaways

* **Code that "looks right" isn't the same as code that runs right:**
  Every issue today was invisible from just reading the source — an empty
  file, a stale clone, an encoding quirk. Actually compiling and running
  the program was what caught them.
* **Stale local clones cause confusing errors:** "Could not find or load
  main class" had nothing to do with the code itself — it was a leftover,
  out-of-date working directory. Starting from a fresh clone is often
  faster than debugging a confused one.
* **Environment details count:** Character encoding, JDK versions, and
  local Git state are all things that can silently break a "correct"
  program, and are worth checking explicitly rather than assumed.
* **Verification is the real final step:** Getting an exact match against
  our target output was the point where the project actually felt done —
  not when the last pull request merged.
