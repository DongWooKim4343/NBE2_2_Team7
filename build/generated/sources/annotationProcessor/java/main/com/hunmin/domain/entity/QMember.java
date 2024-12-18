package com.hunmin.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -38509397L;

    public static final QMember member = new QMember("member1");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<Bookmark, QBookmark> bookmarks = this.<Bookmark, QBookmark>createList("bookmarks", Bookmark.class, QBookmark.class, PathInits.DIRECT2);

    public final StringPath country = createString("country");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final SetPath<Follow, QFollow> followees = this.<Follow, QFollow>createSet("followees", Follow.class, QFollow.class, PathInits.DIRECT2);

    public final SetPath<Follow, QFollow> followers = this.<Follow, QFollow>createSet("followers", Follow.class, QFollow.class, PathInits.DIRECT2);

    public final StringPath image = createString("image");

    public final EnumPath<MemberLevel> level = createEnum("level", MemberLevel.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final EnumPath<MemberRole> memberRole = createEnum("memberRole", MemberRole.class);

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

