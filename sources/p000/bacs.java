package p000;

/* renamed from: bacs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bacs extends bacx {

    /* renamed from: a */
    private final boolean f100495a;

    /* renamed from: b */
    private final int f100496b;

    public bacs(boolean z, int i) {
        this.f100495a = z;
        this.f100496b = i;
    }

    /* renamed from: a */
    public final boolean mo55587a() {
        return this.f100495a;
    }

    /* renamed from: b */
    public final int mo55588b() {
        return this.f100496b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bacx) {
            bacx bacx = (bacx) obj;
            return this.f100495a == bacx.mo55587a() && this.f100496b == bacx.mo55588b();
        }
    }

    public final int hashCode() {
        return (((!this.f100495a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f100496b;
    }

    public final String toString() {
        boolean z = this.f100495a;
        int i = this.f100496b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("CoreSyncSubPolicy{enabled=");
        sb.append(z);
        sb.append(", throttleDelaySeconds=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
