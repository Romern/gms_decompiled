package p000;

import java.util.Arrays;

/* renamed from: dhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class dhr {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo8997a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo8998b();

    public final boolean equals(Object obj) {
        if (obj instanceof dhr) {
            dhr dhr = (dhr) obj;
            if (!bmxi.m108538a(mo8997a(), dhr.mo8997a()) || !bmxi.m108538a(mo8998b(), dhr.mo8998b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo8997a(), mo8998b()});
    }

    public final String toString() {
        String a = mo8997a();
        String b = mo8998b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 3 + String.valueOf(b).length());
        sb.append("[");
        sb.append(a);
        sb.append(":");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
