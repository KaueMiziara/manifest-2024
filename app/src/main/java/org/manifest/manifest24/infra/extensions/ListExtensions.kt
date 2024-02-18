package org.manifest.manifest24.infra.extensions

fun List<String>.formatAsString(): String {
    return joinToString(", ")
}
