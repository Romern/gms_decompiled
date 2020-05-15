package p000;

/* renamed from: bacz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacz extends badh {

    /* renamed from: a */
    private final boolean f100508a;

    /* renamed from: b */
    private final Long f100509b;

    public bacz(boolean z, Long l) {
        this.f100508a = z;
        this.f100509b = l;
    }

    /* renamed from: a */
    public final boolean mo55603a() {
        return this.f100508a;
    }

    /* renamed from: b */
    public final Long mo55604b() {
        return this.f100509b;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof badh) {
            badh badh = (badh) obj;
            return this.f100508a == badh.mo55603a() && ((l = this.f100509b) == null ? badh.mo55604b() == null : l.equals(badh.mo55604b()));
        }
    }

    public final int hashCode() {
        int i = ((!this.f100508a ? 1237 : 1231) ^ 1000003) * 1000003;
        Long l = this.f100509b;
        return i ^ (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.f100508a;
        String valueOf = String.valueOf(this.f100509b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77);
        sb.append("CoreFootprintsPendingChangeResponse{accepted=");
        sb.append(z);
        sb.append(", serverAssignedTimestamp=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
