package p000;

import android.util.Pair;

/* renamed from: qtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtl implements qtx {

    /* renamed from: a */
    public static final qtl f42103a = new qtl();

    private qtl() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "facet_group_data";
    }

    /* renamed from: b */
    public final Pair[] mo24257b() {
        return new Pair[]{Pair.create("id", "TEXT NOT NULL"), Pair.create("value", "BLOB DEFAULT NULL")};
    }

    /* renamed from: c */
    public final String[] mo24258c() {
        return new String[]{"PRIMARY KEY (id)"};
    }

    /* renamed from: d */
    public final String[][] mo24259d() {
        return new String[][]{new String[]{"id"}};
    }
}
