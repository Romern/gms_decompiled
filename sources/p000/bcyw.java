package p000;

/* renamed from: bcyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyw extends bczx {

    /* renamed from: a */
    private final bngx f105156a;

    public bcyw(bngx bngx) {
        this.f105156a = bngx;
    }

    /* renamed from: a */
    public final bngx mo57754a() {
        return this.f105156a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczx) {
            return bnkn.m109669a(this.f105156a, ((bczx) obj).mo57754a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105156a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105156a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("StackComponent{elements=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
