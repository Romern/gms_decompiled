package p000;

import java.util.Arrays;

/* renamed from: bkpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpq {

    /* renamed from: a */
    public final bkpp f125082a;

    /* renamed from: b */
    public final Object f125083b;

    public bkpq(bkpp bkpp, Object obj) {
        bkww.m106781a(bkpp, "type cannot be null");
        boolean equals = bkpp.equals(bkpp.UNKNOWN);
        String valueOf = String.valueOf(bkpp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("We do not support the type: ");
        sb.append(valueOf);
        bkww.m106782a(!equals, sb.toString());
        this.f125082a = bkpp;
        this.f125083b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkpq)) {
            return false;
        }
        bkpq bkpq = (bkpq) obj;
        return bkwv.m106780a(this.f125082a, bkpq.f125082a, this.f125083b, bkpq.f125083b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125082a, this.f125083b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125082a);
        String valueOf2 = String.valueOf(this.f125083b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("AttributeUpdate [type=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
