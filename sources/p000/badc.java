package p000;

import java.util.List;

/* renamed from: badc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class badc extends badl {

    /* renamed from: b */
    private final List f100514b;

    /* renamed from: c */
    private final bacv f100515c;

    public badc(List list, bacv bacv) {
        if (list != null) {
            this.f100514b = list;
            if (bacv != null) {
                this.f100515c = bacv;
                return;
            }
            throw new NullPointerException("Null syncStatus");
        }
        throw new NullPointerException("Null footprints");
    }

    /* renamed from: a */
    public final List mo55618a() {
        return this.f100514b;
    }

    /* renamed from: b */
    public final bacv mo55619b() {
        return this.f100515c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof badl) {
            badl badl = (badl) obj;
            return this.f100514b.equals(badl.mo55618a()) && this.f100515c.equals(badl.mo55619b());
        }
    }

    public final int hashCode() {
        return ((this.f100514b.hashCode() ^ 1000003) * 1000003) ^ this.f100515c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f100514b);
        String valueOf2 = String.valueOf(this.f100515c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("CoreMdhFootprintsReadResult{footprints=");
        sb.append(valueOf);
        sb.append(", syncStatus=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
