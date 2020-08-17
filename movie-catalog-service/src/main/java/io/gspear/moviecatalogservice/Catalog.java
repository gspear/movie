package io.gspear.moviecatalogservice;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Catalog {
    String name;
    String description;
    float rating;
}