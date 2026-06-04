# TODO

## Critical

- [ ] **Add loot tables** — Create `loot_tables/blocks/*.json` for all 18 blocks. Without them, blocks drop nothing when mined.
- [ ] **Add tool tier tag** — Add `tags/block/needs_stone_tool.json` (or `needs_iron_tool`/`needs_diamond_tool`) so `requiresCorrectToolForDrops()` actually works. Currently blocks are unbreakable in survival.

## Moderate

- [ ] **Tone down ore generation** — All 18 ores use `count: 15`, `size: 8`, full -64..320 range. That's 270+ veins per chunk. Vary rates and height distributions per tier.
- [ ] **Differentiate ore generation** — Give each ore unique vein size, spawn rate, and Y range so they feel distinct.

## Minor

- [ ] **Add recipes** — Crafting, smelting, or stonecutting recipes for the blocks.
- [ ] **Add advancements** — Basic progression advancements.
- [ ] **Loosen version range** — Change `minecraft_version_range` from `[26.1.2]` to `[26.1.2,26.2.0)` to allow minor updates.
- [ ] **Use full namespaced parent paths** — Change `"parent": "block/cube_all"` to `"parent": "minecraft:block/cube_all"` in block models.
- [ ] **Reorder creative tab** — Put `son` (the tab icon) first in the tab display order. - organize by alphabetical order
