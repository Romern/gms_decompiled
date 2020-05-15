package p000;

import android.util.Pair;

/* renamed from: qti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qti implements qtx {

    /* renamed from: a */
    public static final qti f42099a = new qti();

    private qti() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "facet_group_index";
    }

    /* renamed from: b */
    public final Pair[] mo24257b() {
        return new Pair[]{Pair.create("facet_id", "TEXT NOT NULL"), Pair.create("id", "TEXT NOT NULL")};
    }

    /* renamed from: c */
    public final String[] mo24258c() {
        return new String[]{"PRIMARY KEY (facet_id)"};
    }

    /* renamed from: d */
    public final String[][] mo24259d() {
        return new String[][]{new String[]{"facet_id"}};
    }
}
