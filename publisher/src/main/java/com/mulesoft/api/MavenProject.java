package com.mulesoft.api;

public class MavenProject
{

    String groupId;
    String artifactId;
    String version;

    public MavenProject(String groupId, String artifactId, String version)
    {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public String getArtifactId()
    {
        return artifactId;
    }

    public String getVersion()
    {
        return version;
    }
}
