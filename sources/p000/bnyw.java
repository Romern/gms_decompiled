package p000;

import java.io.Serializable;
import java.util.zip.Checksum;

/* renamed from: bnyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyw extends bnyp implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final bnzk f132386a;

    /* renamed from: b */
    private final String f132387b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public bnyw(bnzk bnzk, String str) {
        bmxy.m108581a(bnzk);
        this.f132386a = bnzk;
        bmxy.m108591a(true, "bits (%s) must be either 32 or 64", 32);
        bmxy.m108581a(str);
        this.f132387b = str;
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        return new bnyv((Checksum) this.f132386a.mo6606a());
    }

    public final String toString() {
        return this.f132387b;
    }
}
