package p000;

/* renamed from: bkom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkom {

    /* renamed from: a */
    public final bkol f125023a;

    /* renamed from: b */
    public final Exception f125024b;

    /* renamed from: c */
    public final int f125025c;

    /* renamed from: d */
    public final int f125026d;

    public bkom(bkol bkol, int i, Exception exc, int i2) {
        this.f125023a = bkol;
        this.f125024b = exc;
        this.f125026d = i;
        this.f125025c = i2;
        if (bkol == null) {
            throw null;
        } else if (bkol != bkol.FAIL) {
            if (exc != null || i != 0) {
                throw new IllegalArgumentException("failureCause and errorType must not be set when result is not FAIL");
            }
        } else if (exc == null || i == 0) {
            throw new NullPointerException("failureCause and errorType must be set when result is FAIL");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkom)) {
            bkom bkom = (bkom) obj;
            if (this.f125026d == bkom.f125026d) {
                Exception exc = this.f125024b;
                if (exc != null) {
                    if (!exc.equals(bkom.f125024b)) {
                        return false;
                    }
                } else if (bkom.f125024b != null) {
                    return false;
                }
                if (this.f125023a == bkom.f125023a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f125026d;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        Exception exc = this.f125024b;
        int hashCode = (i3 + (exc != null ? exc.hashCode() : 0)) * 31;
        bkol bkol = this.f125023a;
        if (bkol != null) {
            i2 = bkol.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        if (this.f125024b != null) {
            String valueOf = String.valueOf(this.f125023a);
            String valueOf2 = String.valueOf(this.f125024b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42 + String.valueOf(valueOf2).length());
            sb.append("TestCompleteEvent [status=");
            sb.append(valueOf);
            sb.append(", failureCause=");
            sb.append(valueOf2);
            sb.append("]");
            return sb.toString();
        }
        String valueOf3 = String.valueOf(this.f125023a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
        sb2.append("TestCompleteEvent [status=");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }
}
