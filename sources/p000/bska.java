package p000;

/* renamed from: bska */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bska extends bskh {

    /* renamed from: a */
    private final bsqg f144865a;

    public bska(bsqg bsqg) {
        if (bsqg != null) {
            this.f144865a = bsqg;
            return;
        }
        throw new NullPointerException("Null plainPassword");
    }

    /* renamed from: a */
    public final bsqg mo70649a() {
        return this.f144865a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bskh) {
            return this.f144865a.equals(((bskh) obj).mo70649a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f144865a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f144865a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("PlainPasswordGroupingKey{plainPassword=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
