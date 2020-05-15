package p000;

/* renamed from: bcyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyt extends bczq {

    /* renamed from: a */
    private final bngx f105150a;

    public bcyt(bngx bngx) {
        this.f105150a = bngx;
    }

    /* renamed from: a */
    public final bngx mo57739a() {
        return this.f105150a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczq) {
            return bnkn.m109669a(this.f105150a, ((bczq) obj).mo57739a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105150a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105150a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("StackCard{components=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
