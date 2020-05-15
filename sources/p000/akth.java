package p000;

/* renamed from: akth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akth extends akti {

    /* renamed from: a */
    private final char f72742a;

    /* renamed from: b */
    private final char f72743b;

    public akth(char c, char c2) {
        this.f72742a = c;
        this.f72743b = c2;
    }

    /* renamed from: a */
    public final char mo39840a() {
        return this.f72742a;
    }

    /* renamed from: b */
    public final char mo39841b() {
        return this.f72743b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akti) {
            akti akti = (akti) obj;
            return this.f72742a == akti.mo39840a() && this.f72743b == akti.mo39841b();
        }
    }

    public final int hashCode() {
        return ((this.f72742a ^ 16963) * 16963) ^ this.f72743b;
    }

    public final String toString() {
        char c = this.f72742a;
        char c2 = this.f72743b;
        StringBuilder sb = new StringBuilder(61);
        sb.append("CharacterSubstitution{ocrCharacter=");
        sb.append(c);
        sb.append(", replacementCharacter=");
        sb.append(c2);
        sb.append("}");
        return sb.toString();
    }
}
