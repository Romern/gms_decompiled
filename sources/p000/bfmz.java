package p000;

/* renamed from: bfmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfmz {

    /* renamed from: c */
    public final bfni f114449c;

    /* renamed from: d */
    public final bfmy f114450d;

    /* renamed from: e */
    public final long f114451e;

    /* renamed from: f */
    public final boolean f114452f;

    public bfmz(bfni bfni, bfmy bfmy, long j, boolean z) {
        this.f114449c = bfni;
        this.f114450d = bfmy;
        this.f114451e = j;
        this.f114452f = z;
        if ((bfmy == bfmy.OK) != (bfni != null)) {
            throw new RuntimeException("Invalid Args");
        }
    }

    /* renamed from: a */
    public static void m97298a(StringBuilder sb, bfmz bfmz) {
        sb.append("LocatorResult [position=");
        bfni.m97320a(sb, bfmz.f114449c);
        sb.append(", status=");
        sb.append(bfmz.f114450d);
        sb.append(", reportTime=");
        sb.append(bfmz.f114451e);
        sb.append(", wantsGlsModels=");
        sb.append(bfmz.f114452f);
        sb.append("]");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m97298a(sb, this);
        return sb.toString();
    }
}
