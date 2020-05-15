package p000;

/* renamed from: bfml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfml extends bfmz {

    /* renamed from: a */
    public final int f114405a;

    /* renamed from: b */
    public final bfmn f114406b;

    private bfml(int i, bfni bfni, bfmy bfmy, long j, bfmn bfmn, boolean z) {
        super(bfni, bfmy, j, z);
        this.f114405a = i;
        this.f114406b = bfmn;
    }

    /* renamed from: a */
    public static bfml m97248a(int i, bfmy bfmy, bfmn bfmn) {
        return new bfml(i, null, bfmy, 0, bfmn, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m97251a(sb, this);
        return sb.toString();
    }

    /* renamed from: a */
    public static bfml m97249a(int i, bfni bfni, long j, bfmn bfmn) {
        return new bfml(i, bfni, bfmy.OK, j, bfmn, false);
    }

    /* renamed from: a */
    public static bfml m97250a(bfmy bfmy, long j, bfmn bfmn) {
        return new bfml(0, null, bfmy, j, bfmn, false);
    }

    /* renamed from: a */
    public static void m97251a(StringBuilder sb, bfml bfml) {
        if (bfml != null) {
            sb.append("CellLocatorResult [type=");
            int i = bfml.f114405a;
            sb.append(i != 1 ? i != 2 ? "None" : "CellFingerprint" : "CellPrimaryOnly");
            sb.append(", primary=");
            bfmn.m97257a(sb, bfml.f114406b);
            sb.append("], Cache={}, ");
            bfmz.m97298a(sb, bfml);
            sb.append("]");
            return;
        }
        sb.append("null");
    }
}
