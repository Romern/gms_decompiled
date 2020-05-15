package p000;

/* renamed from: bcyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyr extends bczo {

    /* renamed from: b */
    private final bngx f105141b;

    /* renamed from: c */
    private final int f105142c;

    public bcyr(bngx bngx, int i) {
        this.f105141b = bngx;
        this.f105142c = i;
    }

    /* renamed from: a */
    public final bngx mo57724a() {
        return this.f105141b;
    }

    /* renamed from: b */
    public final int mo57725b() {
        return this.f105142c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczo) {
            bczo bczo = (bczo) obj;
            return bnkn.m109669a(this.f105141b, bczo.mo57724a()) && this.f105142c == bczo.mo57725b();
        }
    }

    public final int hashCode() {
        return ((this.f105141b.hashCode() ^ 1000003) * 1000003) ^ this.f105142c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105141b);
        int i = this.f105142c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("RichCardButtons{buttons=");
        sb.append(valueOf);
        sb.append(", orientation=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
