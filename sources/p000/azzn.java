package p000;

/* renamed from: azzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzn extends azzv {

    /* renamed from: a */
    public final boolean f100334a;

    /* renamed from: b */
    public final int f100335b;

    public azzn(boolean z, int i) {
        this.f100334a = z;
        this.f100335b = i;
    }

    /* renamed from: a */
    public final boolean mo55513a() {
        return this.f100334a;
    }

    /* renamed from: b */
    public final int mo55514b() {
        return this.f100335b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azzv) {
            azzv azzv = (azzv) obj;
            return this.f100334a == azzv.mo55513a() && this.f100335b == azzv.mo55514b();
        }
    }

    public final int hashCode() {
        return (((!this.f100334a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f100335b;
    }

    public final String toString() {
        boolean z = this.f100334a;
        int i = this.f100335b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("SyncSubPolicy{enabled=");
        sb.append(z);
        sb.append(", throttleDelaySeconds=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
