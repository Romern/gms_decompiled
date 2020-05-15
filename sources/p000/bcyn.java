package p000;

/* renamed from: bcyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyn extends bczd {

    /* renamed from: a */
    private final bngx f105128a;

    public bcyn(bngx bngx) {
        this.f105128a = bngx;
    }

    /* renamed from: a */
    public final bngx mo57699a() {
        return this.f105128a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczd) {
            return bnkn.m109669a(this.f105128a, ((bczd) obj).mo57699a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105128a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105128a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("HorizontalLayoutButtons{verticalLayoutButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
