package p000;

/* renamed from: bcsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcsa extends bcuq {

    /* renamed from: a */
    private final bcuo f104770a;

    public bcsa(bcuo bcuo) {
        this.f104770a = bcuo;
    }

    /* renamed from: a */
    public final bcuo mo57402a() {
        return this.f104770a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcuq) {
            return this.f104770a.equals(((bcuq) obj).mo57402a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f104770a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104770a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("RichTextContentModel{content=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
