package p000;

import android.content.Context;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmc extends rjx {

    /* renamed from: a */
    public static final /* synthetic */ int f57693a = 0;

    /* renamed from: b */
    private static final rjo f57694b = new rjo("LightweightNetworkQuality.API", f57696d, f57695c);

    /* renamed from: c */
    private static final rje f57695c = new rje();

    /* renamed from: d */
    private static final rjl f57696d = new abmb();

    public abmc(Context context) {
        super(context, f57694b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo32210a(NetworkQualityReport networkQualityReport) {
        roz b = rpa.m34196b();
        b.f43472a = new abma(networkQualityReport);
        b.mo24979b();
        return super.mo24677a(2, b.mo24977a());
    }
}
