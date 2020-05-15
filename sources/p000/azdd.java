package p000;

import android.database.Cursor;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdd {

    /* renamed from: a */
    public final long f99045a;

    /* renamed from: b */
    public final String f99046b;

    /* renamed from: c */
    public final String f99047c;

    /* renamed from: d */
    public final int f99048d;

    /* renamed from: e */
    public final String f99049e;

    /* renamed from: f */
    public final byte[] f99050f;

    /* renamed from: g */
    public final String f99051g;

    /* renamed from: h */
    public final String f99052h;

    /* renamed from: i */
    public final long f99053i;

    /* renamed from: j */
    public final long f99054j;

    /* renamed from: k */
    public final aznz f99055k;

    /* renamed from: l */
    public final int f99056l;

    /* renamed from: m */
    public final long f99057m;

    /* renamed from: n */
    public final String f99058n;

    /* renamed from: o */
    public final byte[] f99059o;

    /* renamed from: p */
    public final int f99060p;

    /* renamed from: q */
    public final byte[] f99061q;

    /* renamed from: r */
    public final LocalEntityId f99062r;

    public azdd(long j, String str, String str2, int i, String str3, long j2, long j3, byte[] bArr, String str4, String str5, long j4, String str6, int i2, String str7, byte[] bArr2, int i3, byte[] bArr3) {
        boolean z;
        LocalEntityId localEntityId;
        int i4 = i;
        long j5 = j2;
        this.f99045a = j;
        this.f99046b = str;
        boolean z2 = true;
        if (j5 != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        aznz a = aznz.m85891a(str6);
        bmxy.m108581a(a);
        this.f99055k = a;
        this.f99057m = j5;
        this.f99047c = str2;
        this.f99048d = i4;
        if (j5 == 0 || j5 == -2) {
            localEntityId = null;
        } else {
            bmxy.m108581a(str2);
            bmxy.m108588a(i4 < 0 ? false : z2);
            localEntityId = new LocalEntityId(this.f99047c, this.f99048d, this.f99055k.f99775b);
        }
        this.f99062r = localEntityId;
        this.f99049e = str3;
        this.f99053i = j3;
        this.f99050f = bArr;
        this.f99051g = str4;
        this.f99052h = str5;
        this.f99054j = j4;
        this.f99056l = i2;
        this.f99058n = str7;
        this.f99059o = bArr2;
        this.f99060p = i3;
        this.f99061q = bArr3;
    }

    /* renamed from: a */
    public static azdd m85387a(Cursor cursor) {
        azdb a = azdb.m85385a(cursor);
        a.f99038l = null;
        a.f99039m = 0;
        return a.mo54711a();
    }

    /* renamed from: a */
    public static boolean m85388a(int i) {
        return i > 0 && i <= 19;
    }

    /* renamed from: b */
    public static boolean m85389b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static boolean m85390c(int i) {
        return i >= 30 && i <= 39;
    }

    /* renamed from: b */
    public final String mo54713b() {
        String str = this.f99051g;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public final String mo54714c() {
        return this.f99055k.f99774a;
    }

    /* renamed from: a */
    public final byte[] mo54712a() {
        byte[] bArr = this.f99050f;
        return bArr == null ? new byte[0] : bArr;
    }
}
