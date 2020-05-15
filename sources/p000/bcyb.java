package p000;

/* renamed from: bcyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyb extends bcyc {

    /* renamed from: a */
    private final bdad f105117a;

    /* renamed from: b */
    public final bczv mo57657b() {
        return bczv.UI_ELEMENT;
    }

    /* renamed from: c */
    public final bdad mo57661c() {
        return this.f105117a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bczy) {
            bczy bczy = (bczy) obj;
            if (bczv.UI_ELEMENT != bczy.mo57657b() || !this.f105117a.equals(bczy.mo57661c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105117a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105117a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("UiComponent{uiElement=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcyb(bdad bdad) {
        this.f105117a = bdad;
    }
}
