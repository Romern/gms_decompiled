package p000;

/* renamed from: azzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzk extends azzq {

    /* renamed from: a */
    private final Object f100321a;

    /* renamed from: b */
    private final azzt f100322b;

    public azzk(Object obj, azzt azzt) {
        if (obj != null) {
            this.f100321a = obj;
            this.f100322b = azzt;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final Object mo55491a() {
        return this.f100321a;
    }

    /* renamed from: b */
    public final azzt mo55492b() {
        return this.f100322b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azzq) {
            azzq azzq = (azzq) obj;
            return this.f100321a.equals(azzq.mo55491a()) && this.f100322b.equals(azzq.mo55492b());
        }
    }

    public final int hashCode() {
        return ((this.f100321a.hashCode() ^ 1000003) * 1000003) ^ this.f100322b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f100321a);
        String valueOf2 = String.valueOf(this.f100322b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("MdhReadResult{value=");
        sb.append(valueOf);
        sb.append(", syncStatus=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
