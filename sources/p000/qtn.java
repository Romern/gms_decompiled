package p000;

import android.util.Pair;

/* renamed from: qtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtn extends qtm {

    /* renamed from: a */
    public static final qtn f42104a = new qtn();

    private qtn() {
    }

    /* renamed from: a */
    public final String mo24256a() {
        return "password_index";
    }

    /* renamed from: b */
    public final Pair[] mo24257b() {
        return new Pair[]{Pair.create("account", "TEXT NOT NULL"), Pair.create("idx_origin", "TEXT NOT NULL"), Pair.create("idx_signon_realm", "TEXT NOT NULL"), Pair.create("idx_username", "TEXT NOT NULL"), Pair.create("id", "TEXT NOT NULL")};
    }

    /* renamed from: c */
    public final String[] mo24258c() {
        return new String[]{"PRIMARY KEY (account, id)"};
    }

    /* renamed from: d */
    public final String[][] mo24259d() {
        return new String[][]{new String[]{"idx_origin", "account"}, new String[]{"idx_signon_realm", "account"}, new String[]{"idx_username", "account"}};
    }

    /* renamed from: e */
    public final long mo24266e() {
        return 1;
    }
}
