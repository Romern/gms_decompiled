package p000;

/* renamed from: bfnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnb {

    /* renamed from: a */
    public final bfmz f114456a;

    /* renamed from: b */
    public final bfns f114457b;

    /* renamed from: c */
    public final bfml f114458c;

    /* renamed from: d */
    public final boolean f114459d;

    public bfnb(bfmz bfmz, bfns bfns) {
        this(bfmz, bfns, null, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(5000);
        sb.append("NetworkLocation [bestResult=");
        bfmz bfmz = this.f114456a;
        if (bfmz == null) {
            sb.append("null");
        } else if (bfmz == this.f114457b) {
            sb.append("WIFI");
        } else if (bfmz == this.f114458c) {
            sb.append("CELL");
        }
        sb.append(" wifiResult=");
        bfns.m97358a(sb, this.f114457b);
        sb.append(" cellResult=");
        bfml.m97251a(sb, this.f114458c);
        sb.append(" isLowPower=");
        sb.append(this.f114459d);
        sb.append("]");
        return sb.toString();
    }

    public bfnb(bfmz bfmz, bfns bfns, bfml bfml, boolean z) {
        this.f114456a = bfmz;
        this.f114457b = bfns;
        this.f114458c = bfml;
        this.f114459d = z;
        if (bfmz != null && bfmz.f114450d != bfmy.OK) {
            throw new RuntimeException("Invalid Args");
        }
    }
}
