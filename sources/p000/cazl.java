package p000;

/* renamed from: cazl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazl extends cazm {

    /* renamed from: a */
    private final Object f176451a;

    /* renamed from: a */
    public final Object mo75194a() {
        return this.f176451a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cazl) {
            return bmxi.m108538a(this.f176451a, ((cazl) obj).f176451a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f176451a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f176451a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("Produced[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public cazl(Object obj) {
        this.f176451a = obj;
    }
}
