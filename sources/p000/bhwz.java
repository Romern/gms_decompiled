package p000;

/* renamed from: bhwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwz {

    /* renamed from: a */
    public final bpol f119765a;

    /* renamed from: b */
    public final long f119766b;

    /* renamed from: c */
    public final bhub f119767c;

    /* renamed from: d */
    public final bhts f119768d;

    private bhwz(bpol bpol, long j, bhub bhub, bhts bhts) {
        this.f119765a = bpol;
        this.f119766b = j;
        this.f119767c = bhub;
        this.f119768d = bhts;
    }

    /* renamed from: a */
    public static bhwz m101679a(long j) {
        return new bhwz(bpol.IN_TRANSIT, j, null, null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119765a);
        long j = this.f119766b;
        String valueOf2 = String.valueOf(this.f119767c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("Segment {type=");
        sb.append(valueOf);
        sb.append(" beginTimeEpochMillis=");
        sb.append(j);
        sb.append(" centroid=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static bhwz m101680a(long j, bhub bhub, bhts bhts) {
        return new bhwz(bpol.AT_PLACE, j, bhub, bhts);
    }
}
