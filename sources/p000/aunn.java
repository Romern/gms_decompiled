package p000;

import android.provider.BaseColumns;

/* renamed from: aunn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunn implements BaseColumns {

    /* renamed from: a */
    public static final String f92155a = aunq.f92163c.f92120a;

    /* renamed from: b */
    public static final String f92156b = aunq.f92164f.f92120a;

    /* renamed from: c */
    public static final String f92157c = aunq.f92165g.f92120a;

    /* renamed from: d */
    public static final String f92158d;

    /* renamed from: e */
    public static final String f92159e;

    static {
        String str = aunq.f92166h.f92120a;
        f92158d = str;
        String str2 = f92155a;
        String str3 = f92156b;
        String str4 = f92157c;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 99 + length2 + String.valueOf(str4).length() + String.valueOf(str).length());
        sb.append("CREATE TABLE test_model_SQLite (_id INTEGER PRIMARY KEY,__id__ TEXT,");
        sb.append(str2);
        sb.append(" TEXT,");
        sb.append(str3);
        sb.append(" TEXT,");
        sb.append(str4);
        sb.append(" INTEGER,");
        sb.append(str);
        sb.append(" INTEGER )");
        f92159e = sb.toString();
    }
}
