package p000;

import android.util.Pair;

/* renamed from: qtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qtb implements qtx {

    /* renamed from: a */
    static final qtb f42090a = new qtb();

    private qtb() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "account_data";
    }

    /* renamed from: b */
    public final Pair[] mo24257b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("key", "TEXT NOT NULL"), Pair.create("value", "BLOB")};
    }

    /* renamed from: c */
    public final String[] mo24258c() {
        return new String[]{"PRIMARY KEY (account, key)"};
    }

    /* renamed from: d */
    public final String[][] mo24259d() {
        return new String[][]{new String[]{"key"}};
    }
}
