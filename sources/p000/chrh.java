package p000;

/* renamed from: chrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrh {

    /* renamed from: a */
    public final chrg f189033a;

    /* renamed from: b */
    public final chuv f189034b;

    public chrh(chrg chrg, chuv chuv) {
        bmxy.m108582a(chrg, "state is null");
        this.f189033a = chrg;
        bmxy.m108582a(chuv, "status is null");
        this.f189034b = chuv;
    }

    /* renamed from: a */
    public static chrh m149449a(chrg chrg) {
        boolean z;
        if (chrg != chrg.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "state is TRANSIENT_ERROR. Use forError() instead");
        return new chrh(chrg, chuv.f189215b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chrh) {
            chrh chrh = (chrh) obj;
            if (!this.f189033a.equals(chrh.f189033a) || !this.f189034b.equals(chrh.f189034b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f189033a.hashCode() ^ this.f189034b.hashCode();
    }

    public final String toString() {
        if (this.f189034b.mo85689a()) {
            return this.f189033a.toString();
        }
        String valueOf = String.valueOf(this.f189033a);
        String valueOf2 = String.valueOf(this.f189034b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
