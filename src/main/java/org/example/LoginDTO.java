package org.example;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class LoginDTO {
    private final @NonNull String login;
    private final @NonNull String password;
}
