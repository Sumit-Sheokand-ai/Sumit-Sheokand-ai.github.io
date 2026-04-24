<div align="center">

```
      ╔═══════════════════════════════════════════╗
      ║   ⚔  SURVEY CORPS — PERSONAL PORTFOLIO  ⚔  ║
      ╚═══════════════════════════════════════════╝
```

# SUMIT SHEOKAND
### *— beyond the walls —*

[![Live](https://img.shields.io/badge/LIVE-sumit--sheokand--ai.github.io-c92a2a?style=for-the-badge&labelColor=0a0806)](https://sumit-sheokand-ai.github.io/)
[![Leashly](https://img.shields.io/badge/LEASHLY-leashly.dev-b8935a?style=for-the-badge&labelColor=0a0806)](https://leashly.dev)
[![GitHub](https://img.shields.io/badge/GitHub-Sumit--Sheokand--ai-8a7a5d?style=for-the-badge&labelColor=0a0806&logo=github)](https://github.com/Sumit-Sheokand-ai)

> *"Shinzou wo Sasageyo — Dedicate your heart."*

</div>

---

## ◆ Overview

Personal portfolio — AOT-themed, golden-ratio-designed, built with Three.js 3D effects, glassmorphism, skeleton loaders, and zero frameworks. Single self-contained `index.html`. Deployed on GitHub Pages.

---

## ◆ Design System

Built around **φ = 1.618033…** (the golden ratio). Every spacing, font size, column width, and timing value is derived from this scale — not arbitrary.

| Token | Value | Formula |
|---|---|---|
| `--sp-xs` | 0.382rem | φ⁻² |
| `--sp-sm` | 0.618rem | φ⁻¹ |
| `--sp-md` | 1rem | base |
| `--sp-lg` | 1.618rem | φ¹ |
| `--sp-xl` | 2.618rem | φ² |
| `--sp-2xl` | 4.236rem | φ³ |
| `--sp-3xl` | 6.854rem | φ⁴ |
| `--sp-4xl` | 11.09rem | φ⁵ |

**Grid:** Hero layout is a strict **61.8% / 38.2%** major/minor split.  
**Cards:** Each dossier card's `height = width × φ⁻¹` — golden rectangles.  
**Timing:** Preloader delay = 1618ms (φ × 1000).  
**Orb rings:** Radii at φ¹, φ², φ³ — harmonically spaced.

---

## ◆ Features

```
  Three.js 3D   →  Full-page dust field + rising embers + Wall Rose silhouettes
                   Hero ODM wireframe blade + φ-radius orbital rings
  Glassmorphism →  backdrop-filter panels, dossier cards, nav pill
  Skeleton UX   →  Shimmer loaders on every mission card, stagger-revealed
  Custom Cursor →  Targeting reticle with lag ring + spin animation
  Magnetic Btns →  φ⁻² dampened pull on hover
  Scroll Reveal →  IntersectionObserver, φ-staggered delays
  Creed Marquee →  Infinite scroll tech strip
  Preloader     →  Wings of Freedom SVG sigil, animated bar
```

---

## ◆ Stack

```
HTML · CSS · Vanilla JS · Three.js r128
No build step. No npm. No framework.
```

---

## ◆ Project Structure

```
sumit-sheokand-ai.github.io/
└── index.html     ← everything. self-contained.
```

---

## ◆ Missions Listed

| № | Mission | Status |
|---|---|---|
| 01 | **Leashly** — AI API cost-control SaaS | 🟢 Live |
| 02 | **Poster Designer** — browser image editor | 🟢 Live |
| 03 | **JARVIS Skill** — adaptive Claude layer | 🟢 Live |
| 04 | **Data Viz** — interactive dashboard | 🟢 Live |
| 05 | **Expense Tracker** — Java desktop app | 🟢 Live |
| 06 | **Typing Booster** — WPM test | 🟢 Live |

---

## ◆ Local Preview

```bash
# No build step needed. Just open it.
open index.html

# Or serve it locally
npx serve .
python -m http.server 8080
```

---

## ◆ Deploy

This repo is directly served by **GitHub Pages** from the `main` branch root.

```bash
git add index.html
git commit -m "update portfolio"
git push origin main
# → live at sumit-sheokand-ai.github.io in ~60s
```

---

<div align="center">

*© 2026 Sumit Sheokand · Hamilton, Canada*

**Shinzou wo sasageyo.**

</div>
