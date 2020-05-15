package p000;

import java.util.Arrays;

/* renamed from: uog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uog {

    /* renamed from: a */
    public final String f48389a;

    /* renamed from: b */
    public final bngx f48390b;

    public uog(String str, bngx bngx) {
        sdo.m34959a((Object) str);
        this.f48389a = str;
        sdo.m34959a(bngx);
        this.f48390b = bngx;
    }

    /* renamed from: a */
    public final String[] mo27762a() {
        return (String[]) this.f48390b.toArray(new String[this.f48390b.size()]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uog uog = (uog) obj;
            return this.f48389a.equals(uog.f48389a) && bnkn.m109669a(this.f48390b, uog.f48390b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48389a, this.f48390b});
    }

    public uog(String str, String str2) {
        this(str, bngx.m109356a(str2));
    }
}
