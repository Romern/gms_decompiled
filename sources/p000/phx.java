package p000;

import java.util.Locale;

/* renamed from: phx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phx {

    /* renamed from: a */
    public final long f39150a;

    /* renamed from: b */
    final boolean f39151b;

    public phx(long j, boolean z) {
        this.f39150a = j;
        this.f39151b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phx) {
            phx phx = (phx) obj;
            return phx.f39150a == this.f39150a && phx.f39151b == this.f39151b;
        }
    }

    public final int hashCode() {
        long j = this.f39150a;
        return (int) ((j & 65535) | (j >> 32));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "LocalNetworkId code:%d isDefaultGatewayLanAddr:%b", Long.valueOf(this.f39150a), Boolean.valueOf(this.f39151b));
    }
}
