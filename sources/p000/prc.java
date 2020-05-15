package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: prc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prc {

    /* renamed from: a */
    public final String f40101a;

    /* renamed from: b */
    public final String f40102b;

    /* renamed from: c */
    public final int f40103c;

    /* renamed from: d */
    public final double f40104d;

    /* renamed from: e */
    private final boolean f40105e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public prc(String str, String str2, int i, double d, boolean z) {
        sdo.m34969a(str, (Object) "deviceId cannot be null or empty");
        sdo.m34969a(str2, (Object) "name cannot be null or empty");
        this.f40101a = str;
        this.f40102b = str2;
        this.f40103c = i;
        double d2 = 0.0d;
        if (d >= 0.0d) {
            d2 = 1.0d;
            if (d <= 1.0d) {
                this.f40104d = d;
                this.f40105e = z;
            }
        }
        this.f40104d = d2;
        this.f40105e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof prc) {
            prc prc = (prc) obj;
            return ptk.m31236a(this.f40101a, prc.f40101a) && ptk.m31236a(this.f40102b, prc.f40102b) && this.f40103c == prc.f40103c && ptk.m31235a(this.f40104d, prc.f40104d, 0.001d) && this.f40105e == prc.f40105e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40101a, this.f40102b, Integer.valueOf(this.f40103c), Double.valueOf(this.f40104d), Boolean.valueOf(this.f40105e)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "id: \"%s\" name: \"%s\" capabilities: %d volume: %.2f muted: %b", this.f40101a, this.f40102b, Integer.valueOf(this.f40103c), Double.valueOf(this.f40104d), Boolean.valueOf(this.f40105e));
    }
}
