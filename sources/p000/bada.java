package p000;

/* renamed from: bada */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bada extends badj {

    /* renamed from: c */
    private final bngx f100510c;

    public bada(bngx bngx) {
        this.f100510c = bngx;
    }

    /* renamed from: a */
    public final bngx mo55608a() {
        return this.f100510c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof badj) {
            return bnkn.m109669a(this.f100510c, ((badj) obj).mo55608a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f100510c.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f100510c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("CoreLatestFootprintsFilter{secondaryIdMatchers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
