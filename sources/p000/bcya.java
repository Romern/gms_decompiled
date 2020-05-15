package p000;

/* renamed from: bcya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcya extends bcyc {

    /* renamed from: a */
    private final bczx f105116a;

    /* renamed from: a */
    public final bczx mo57656a() {
        return this.f105116a;
    }

    /* renamed from: b */
    public final bczv mo57657b() {
        return bczv.STACK_COMPONENT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bczy) {
            bczy bczy = (bczy) obj;
            if (bczv.STACK_COMPONENT != bczy.mo57657b() || !this.f105116a.equals(bczy.mo57656a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105116a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105116a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("UiComponent{stackComponent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcya(bczx bczx) {
        this.f105116a = bczx;
    }
}
