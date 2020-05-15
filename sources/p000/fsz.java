package p000;

/* renamed from: fsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsz {

    /* renamed from: d */
    private static final fsz f17205d = new fsz(-1, -1, -1);

    /* renamed from: a */
    public final long f17206a;

    /* renamed from: b */
    public final long f17207b;

    /* renamed from: c */
    private final int f17208c;

    private fsz(int i, long j, long j2) {
        if (!(i == -1 || i == 0)) {
            i = 1;
        }
        sdo.m34974b(true);
        this.f17208c = i;
        this.f17206a = j;
        this.f17207b = j2;
    }

    /* renamed from: a */
    public static fsz m12266a(String[] strArr) {
        int i;
        if (strArr != null && strArr.length >= 3) {
            if ("documents".equals(strArr[0])) {
                i = 0;
            } else if ("tags".equals(strArr[0])) {
                i = 1;
            }
            try {
                long parseLong = Long.parseLong(strArr[1]);
                long parseLong2 = Long.parseLong(strArr[2]);
                return (parseLong < 0 || parseLong2 < 1) ? f17205d : new fsz(i, parseLong, parseLong2);
            } catch (NumberFormatException e) {
            }
        }
        return f17205d;
    }

    /* renamed from: a */
    public final boolean mo11274a() {
        return this.f17208c == 0;
    }

    /* renamed from: b */
    public final boolean mo11275b() {
        return this.f17208c == 1;
    }

    /* renamed from: c */
    public final boolean mo11276c() {
        return this.f17206a == 0 && (mo11274a() || mo11275b());
    }

    public final String toString() {
        int i = this.f17208c;
        if (i == -1) {
            return "SyncQuery[type=Unrecognized]";
        }
        String str = i != 0 ? "Tags" : "Documents";
        long j = this.f17206a;
        long j2 = this.f17207b;
        StringBuilder sb = new StringBuilder(str.length() + 76);
        sb.append("SyncQuery[type=");
        sb.append(str);
        sb.append(", lastSeqNo=");
        sb.append(j);
        sb.append(", limit=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
