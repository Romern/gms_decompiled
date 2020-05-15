package p000;

/* renamed from: bcrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcrb extends bcrc {

    /* renamed from: a */
    private final bcnw f104683a;

    /* renamed from: a */
    public final bcnw mo57274a() {
        return this.f104683a;
    }

    /* renamed from: b */
    public final int mo57275b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuw) {
            bcuw bcuw = (bcuw) obj;
            return bcuw.mo57275b() == 2 && this.f104683a.equals(bcuw.mo57274a());
        }
    }

    public final int hashCode() {
        return this.f104683a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104683a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("LighterVisualElementMetadata{suggestionChip=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcrb(bcnw bcnw) {
        this.f104683a = bcnw;
    }
}
