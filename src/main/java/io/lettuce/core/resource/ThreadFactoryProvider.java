package io.lettuce.core.resource;

import java.util.concurrent.ThreadFactory;

@FunctionalInterface
public interface ThreadFactoryProvider {
    ThreadFactory forName(String name);
}
