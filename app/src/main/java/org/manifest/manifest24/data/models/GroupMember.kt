package org.manifest.manifest24.data.models

import org.manifest.manifest24.extensions.formatAsString

data class GroupMember(
    val name: String,
    private val _stacks: List<String>,
    private val _languages: List<String>,
) {
    val stacks: String
        get() = _stacks.formatAsString()

    val languages: String
        get() = _languages.formatAsString()
}
