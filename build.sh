#!/usr/bin/env bash
set -e
cd -- "$(dirname "$0")"

versions=()

for pathname in ./props/*.properties; do
  filename="$(basename -- "$pathname")"
  versions+=("${filename%.*}")
done

for version in "${versions[@]}"; do
  ./gradlew -q -Pminecraft="${version}" assemble
done
