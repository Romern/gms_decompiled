package p000;

import android.util.Pair;

/* renamed from: qtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtf implements qtx {

    /* renamed from: a */
    public static final qtf f42095a = new qtf();

    private qtf() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "affiliation_data";
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
