package p000;

/* renamed from: oau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oau extends oba {

    /* renamed from: a */
    private final boolean f37097a;

    /* renamed from: b */
    private final int f37098b;

    /* renamed from: c */
    private final obn f37099c;

    public oau(boolean z, int i, obn obn) {
        this.f37097a = z;
        this.f37098b = i;
        this.f37099c = obn;
    }

    /* renamed from: a */
    public final boolean mo21920a() {
        return this.f37097a;
    }

    /* renamed from: b */
    public final int mo21921b() {
        return this.f37098b;
    }

    /* renamed from: c */
    public final obn mo21922c() {
        return this.f37099c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oba) {
            oba oba = (oba) obj;
            return this.f37097a == oba.mo21920a() && this.f37098b == oba.mo21921b() && this.f37099c.equals(oba.mo21922c());
        }
    }

    public final int hashCode() {
        return (((((!this.f37097a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f37098b) * 1000003) ^ this.f37099c.hashCode();
    }

    public final String toString() {
        boolean z = this.f37097a;
        int i = this.f37098b;
        String valueOf = String.valueOf(this.f37099c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("GalSnoopSettings{isEnabled=");
        sb.append(z);
        sb.append(", bufferSize=");
        sb.append(i);
        sb.append(", galMessageFilter=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
