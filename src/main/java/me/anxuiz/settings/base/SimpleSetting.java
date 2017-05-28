package me.anxuiz.settings.base;

import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import me.anxuiz.settings.Setting;
import me.anxuiz.settings.Type;

import com.google.common.collect.ImmutableSortedSet;

public class SimpleSetting implements Setting {
    protected final @Nonnull String name;
    protected final @Nonnull Set<String> aliases;
    protected final @Nonnull String summary;
    protected final @Nullable String description;

    protected final @Nonnull Type type;
    protected final @Nullable Object defaultValue;
    protected final @Nullable Object extra;

    public SimpleSetting(@Nonnull String name,
                         @Nonnull Set<String> aliases,
                         @Nonnull String summary,
                         @Nullable String description,
                         @Nonnull Type type,
                         @Nullable Object defaultValue,
                         @Nullable Object extra) {
        this.name = name;
        this.aliases = ImmutableSortedSet.copyOf(aliases);
        this.summary = summary;
        this.description = description;
        this.type = type;
        this.defaultValue = defaultValue;
        this.extra = extra;
    }

    public @Nonnull String getName() {
        return this.name;
    }

    public @Nonnull Set<String> getAliases() {
        return this.aliases;
    }

    public @Nonnull String getSummary() {
        return this.summary;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    public @Nonnull String getDescription() {
        if(this.description != null) {
            return this.description;
        } else {
            return this.summary;
        }
    }

    public @Nonnull Type getType() {
        return this.type;
    }

    public boolean hasDefaultValue() {
        return this.defaultValue != null;
    }

    public @Nullable Object getDefaultValue() {
        return this.defaultValue;
    }

    public @Nullable Object getExtra() {
        return this.extra;
    }

    @Override
    public @Nonnull String toString() {
        return "SimpleSetting{name='" + this.name + "',type='" + this.type.getName() + "'}";
    }
}
