package p000;

import android.util.Pair;

/* renamed from: qtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qtw implements qtx {

    /* renamed from: a */
    static final qtw f42131a = new qtw();

    private qtw() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "sync_entities";
    }

    /* renamed from: b */
    public final Pair[] mo24257b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("type", "INT NOT NULL"), Pair.create("id", "TEXT NOT NULL"), Pair.create("value", "BLOB DEFAULT NULL"), Pair.create("is_dirty", "BOOLEAN DEFAULT FALSE"), Pair.create("version", "BLOB DEFAULT NULL"), Pair.create("is_deleted_locally", "BOOLEAN DEFAULT FALSE")};
    }

    /* renamed from: c */
    public final String[] mo24258c() {
        return new String[]{"PRIMARY KEY (account, type, id)"};
    }

    /* renamed from: d */
    public final String[][] mo24259d() {
        return new String[][]{new String[]{"type", "is_deleted_locally", "account"}};
    }
}
