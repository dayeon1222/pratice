package me.dayeon.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.dayeon.springbootdeveloper.domain.Article;
import me.dayeon.springbootdeveloper.domain.Comment;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddCommentRequest {
    private Long articleId;
    private String content;

    public Comment toEntity(String author, Article article) {
        return Comment.builder()
                .article(article)
                .content(content)
                .author(author)
                .build();
    }
}
