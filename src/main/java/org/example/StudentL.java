package org.example;

import lombok.*;

@RequiredArgsConstructor
@Getter @Setter
public class StudentL {
    private @NonNull String name;
    private @NonNull String surname;
    private @NonNull int age;
    private @NonNull String index;
    private @NonNull int year;
}
