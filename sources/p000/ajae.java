package p000;

import java.util.Arrays;

/* renamed from: ajae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajae {

    /* renamed from: a */
    private final byys f70221a;

    /* renamed from: b */
    private final String f70222b;

    public ajae(byys byys) {
        sdo.m34959a(byys);
        this.f70221a = byys;
        this.f70222b = null;
    }

    /* renamed from: a */
    public final byte[] mo38353a() {
        String str = this.f70222b;
        return str == null ? this.f70221a.serializeToBytes() : str.getBytes();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajae) {
            ajae ajae = (ajae) obj;
            return sdg.m34949a(this.f70221a, ajae.f70221a) && sdg.m34949a(this.f70222b, ajae.f70222b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70221a, this.f70222b});
    }

    public final String toString() {
        String str = this.f70222b;
        return str == null ? aizs.m58301a(this.f70221a) : str;
    }

    public ajae(String str) {
        this.f70221a = null;
        sdo.m34959a((Object) str);
        this.f70222b = str;
    }
}
