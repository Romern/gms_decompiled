package p000;

import android.net.RssiCurve;
import com.google.android.gms.netrec.scoring.RssiScoreCurve;

/* renamed from: akkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkx {
    /* renamed from: a */
    public static RssiScoreCurve m59943a(RssiCurve rssiCurve) {
        if (rssiCurve == null) {
            return null;
        }
        int i = rssiCurve.start;
        int i2 = rssiCurve.bucketWidth;
        byte[] bArr = rssiCurve.rssiBuckets;
        aknh.m60081a();
        return new RssiScoreCurve(i, i2, bArr, rssiCurve.activeNetworkRssiBoost);
    }
}
