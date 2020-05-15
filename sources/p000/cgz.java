package p000;

/* renamed from: cgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgz implements che {

    /* renamed from: a */
    int f6832a;

    /* renamed from: b */
    public Class f6833b;

    /* renamed from: c */
    private final cha f6834c;

    public cgz(cha cha) {
        this.f6834c = cha;
    }

    /* renamed from: a */
    public final void mo3889a() {
        this.f6834c.mo3876a(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cgz) {
            cgz cgz = (cgz) obj;
            return this.f6832a == cgz.f6832a && this.f6833b == cgz.f6833b;
        }
    }

    public final int hashCode() {
        int i = this.f6832a * 31;
        Class cls = this.f6833b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f6832a;
        String valueOf = String.valueOf(this.f6833b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
