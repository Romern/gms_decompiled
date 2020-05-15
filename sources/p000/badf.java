package p000;

/* renamed from: badf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class badf extends badr {

    /* renamed from: b */
    private final int f100522b;

    /* renamed from: c */
    private final Long f100523c;

    /* renamed from: d */
    private final Long f100524d;

    public badf(int i, Long l, Long l2) {
        this.f100522b = i;
        this.f100523c = l;
        this.f100524d = l2;
    }

    /* renamed from: a */
    public final int mo55635a() {
        return this.f100522b;
    }

    /* renamed from: b */
    public final Long mo55636b() {
        return this.f100523c;
    }

    /* renamed from: c */
    public final Long mo55637c() {
        return this.f100524d;
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof badr)) {
            return false;
        }
        badr badr = (badr) obj;
        return this.f100522b == badr.mo55635a() && ((l = this.f100523c) == null ? badr.mo55636b() == null : l.equals(badr.mo55636b())) && ((l2 = this.f100524d) == null ? badr.mo55637c() == null : l2.equals(badr.mo55637c()));
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f100522b ^ 1000003) * 1000003;
        Long l = this.f100523c;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Long l2 = this.f100524d;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f100522b;
        String valueOf = String.valueOf(this.f100523c);
        String valueOf2 = String.valueOf(this.f100524d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 121 + String.valueOf(valueOf2).length());
        sb.append("CoreTimeSeriesFootprintsFilter{numFootprints=");
        sb.append(i);
        sb.append(", relativeNowMinTimestampMicros=");
        sb.append(valueOf);
        sb.append(", relativeNowMaxTimestampMicros=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
