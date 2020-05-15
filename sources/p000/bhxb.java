package p000;

/* renamed from: bhxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxb {

    /* renamed from: a */
    public final int f119774a;

    /* renamed from: b */
    public final bhwz f119775b;

    /* renamed from: c */
    public final bhwz f119776c;

    public bhxb(int i, bhwz bhwz, bhwz bhwz2) {
        this.f119774a = i;
        this.f119775b = bhwz;
        this.f119776c = bhwz2;
    }

    public final String toString() {
        int i = this.f119774a;
        String bhwz = this.f119775b.toString();
        bhwz bhwz2 = this.f119776c;
        String bhwz3 = bhwz2 != null ? bhwz2.toString() : "null";
        StringBuilder sb = new StringBuilder(String.valueOf(bhwz).length() + 69 + String.valueOf(bhwz3).length());
        sb.append("SegmenterResult {action=");
        sb.append(i);
        sb.append(" currentSegment=");
        sb.append(bhwz);
        sb.append(" previousSegment=");
        sb.append(bhwz3);
        sb.append("}");
        return sb.toString();
    }
}
