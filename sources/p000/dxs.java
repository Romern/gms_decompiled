package p000;

import java.util.HashSet;

/* renamed from: dxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxs {

    /* renamed from: a */
    public final dyd f14372a;

    /* renamed from: b */
    public final HashSet f14373b = new HashSet();

    public dxs(dyd dyd) {
        sdo.m34959a(dyd);
        this.f14372a = dyd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dxs) {
            return this.f14372a.equals(((dxs) obj).f14372a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14372a.hashCode();
    }
}
