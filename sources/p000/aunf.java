package p000;

import android.provider.BaseColumns;

/* renamed from: aunf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunf implements BaseColumns {

    /* renamed from: a */
    public static final String f92127a = aumt.f92105m.f92120a;

    /* renamed from: b */
    public static final String f92128b = aumt.f92097c.f92120a;

    /* renamed from: c */
    public static final String f92129c = aumt.f92098f.f92120a;

    /* renamed from: d */
    public static final String f92130d = aumt.f92099g.f92120a;

    /* renamed from: e */
    public static final String f92131e = aumt.f92100h.f92120a;

    /* renamed from: f */
    public static final String f92132f = aumt.f92101i.f92120a;

    /* renamed from: g */
    public static final String f92133g = aumt.f92102j.f92120a;

    /* renamed from: h */
    public static final String f92134h = aumt.f92103k.f92120a;

    /* renamed from: i */
    public static final String f92135i;

    /* renamed from: j */
    public static final String f92136j;

    static {
        String str = aumt.f92104l.f92120a;
        f92135i = str;
        String str2 = f92127a;
        String str3 = f92128b;
        String str4 = f92129c;
        String str5 = f92130d;
        String str6 = f92131e;
        String str7 = f92132f;
        String str8 = f92133g;
        String str9 = f92134h;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        int length5 = String.valueOf(str6).length();
        int length6 = String.valueOf(str7).length();
        int length7 = String.valueOf(str8).length();
        StringBuilder sb = new StringBuilder(length + 143 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str9).length() + String.valueOf(str).length());
        sb.append("CREATE TABLE SmartLock_status_model (_id INTEGER PRIMARY KEY,__id__ TEXT,");
        sb.append(str2);
        sb.append(" TEXT,");
        sb.append(str3);
        sb.append(" TEXT,");
        sb.append(str4);
        sb.append(" TEXT,");
        sb.append(str5);
        sb.append(" INTEGER,");
        sb.append(str6);
        sb.append(" INTEGER,");
        sb.append(str7);
        sb.append(" INTEGER,");
        sb.append(str8);
        sb.append(" INTEGER,");
        sb.append(str9);
        sb.append(" INTEGER,");
        sb.append(str);
        sb.append(" TEXT )");
        f92136j = sb.toString();
    }
}
