package com.deploygate.gradle.plugins.entities

import org.gradle.api.Named

class DeployTarget implements Named {
    String name

    File sourceFile
    String message
    String distributionKey
    String distributionName
    String releaseNote
    String visibility
    boolean noAssemble

    DeployTarget() {}

    DeployTarget(String name) {
        this.name = name
    }

    public HashMap<String, String> toParams() {
        HashMap<String, String> params = new HashMap<String, String>()
        if (message != null) {
            params.put("message", message)
        }
        if (distributionKey != null) {
            params.put("distribution_key", distributionKey)
        }
        if (distributionName != null) {
            params.put("distribution_name", distributionName)
        }
        if (releaseNote != null) {
            params.put("release_note", releaseNote)
        }
        if (visibility != null) {
            params.put("visibility", visibility)
        }
        return params
    }
}
