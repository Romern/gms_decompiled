package p000;

/* renamed from: ruk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ruk {

    /* renamed from: a */
    public final String f43702a;

    /* renamed from: b */
    public final String f43703b;

    /* renamed from: c */
    public final String f43704c;

    /* renamed from: d */
    public final long f43705d;

    /* renamed from: e */
    public final long f43706e;

    /* renamed from: f */
    public final byte[] f43707f;

    /* renamed from: g */
    public final long f43708g;

    /* renamed from: h */
    public final bpun f43709h;

    /* renamed from: i */
    public final boolean f43710i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public ruk(String str, String str2, String str3, long j, long j2, long j3, bpun bpun, boolean z, byte[] bArr) {
        boolean z2;
        long j4 = j;
        long j5 = j2;
        boolean z3 = true;
        if (j4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "executionTimeSeconds must be greater than 0");
        sdo.m34971a(j5 < 0 ? false : z3, (Object) "ttl must not be negative");
        sdo.m34977c(str);
        this.f43702a = str;
        sdo.m34977c(str2);
        this.f43703b = str2;
        sdo.m34977c(str3);
        this.f43704c = str3;
        this.f43705d = j4;
        this.f43706e = j5;
        this.f43707f = bArr == null ? new byte[0] : bArr;
        this.f43708g = j3;
        this.f43709h = bpun;
        this.f43710i = z;
    }
}
