package com.fasterxml.jackson.module.paramnames;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Make this do nothing
 */
public class ParameterNamesModule extends SimpleModule
{
    private static final long serialVersionUID = 1L;

    public ParameterNamesModule(JsonCreator.Mode creatorBinding) {
        this();
    }

    public ParameterNamesModule() {
        super(PackageVersion.VERSION);
    }

    @Override
    public void setupModule(SetupContext context) {}
    
    @Override
    public int hashCode() { return getClass().hashCode(); }

    @Override
    public boolean equals(Object o) { return this == o; }
}
