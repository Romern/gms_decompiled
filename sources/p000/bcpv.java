package p000;

/* renamed from: bcpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpv extends bcpz {

    /* renamed from: a */
    private final bcth f104667a;

    /* renamed from: a */
    public final int mo57180a() {
        return 3;
    }

    /* renamed from: b */
    public final bcth mo57184b() {
        return this.f104667a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcti) {
            bcti bcti = (bcti) obj;
            return bcti.mo57180a() == 3 && this.f104667a.equals(bcti.mo57184b());
        }
    }

    public final int hashCode() {
        return this.f104667a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104667a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("MessageContent{custom=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpv(bcth bcth) {
        this.f104667a = bcth;
    }
}
