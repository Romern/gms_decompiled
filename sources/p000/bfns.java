package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: bfns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfns extends bfmz {

    /* renamed from: a */
    public final int f114508a;

    /* renamed from: b */
    public final bfoa f114509b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfns(int i, bfni bfni, bfmy bfmy, long j, bfoa bfoa, boolean z) {
        super(bfni, bfmy, bfoa != null ? bfoa.mo62009d() : j, z);
        this.f114508a = i;
        this.f114509b = bfoa;
    }

    /* renamed from: a */
    public static bfns m97356a(int i, bfni bfni, long j, bfoa bfoa) {
        return new bfns(i, bfni, bfmy.OK, j, bfoa, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        m97358a(sb, this);
        return sb.toString();
    }

    /* renamed from: a */
    public static bfns m97357a(bfmy bfmy, long j, bfoa bfoa) {
        return new bfns(0, null, bfmy, j, bfoa, false);
    }

    /* renamed from: a */
    public static void m97358a(StringBuilder sb, bfns bfns) {
        String str;
        String str2 = "null";
        if (bfns != null) {
            sb.append("WifiLocatorResult [type=");
            int i = bfns.f114508a;
            if (i != 5) {
                str = i != 6 ? "UNKNOWN" : "RTT";
            } else {
                str = "Frewle";
            }
            sb.append(str);
            sb.append(",wifiScan=");
            bfoa bfoa = bfns.f114509b;
            if (bfoa != null) {
                str2 = bfoa.toString();
            }
            sb.append(str2);
            bfmz.m97298a(sb, bfns);
            sb.append("]");
            return;
        }
        sb.append(str2);
    }
}
