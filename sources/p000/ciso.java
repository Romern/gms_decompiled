package p000;

import org.chromium.net.UrlResponseInfo;

/* renamed from: ciso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciso implements cisy {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f191336a;

    /* renamed from: b */
    final /* synthetic */ String f191337b;

    /* renamed from: c */
    final /* synthetic */ cisu f191338c;

    public ciso(cisu cisu, UrlResponseInfo urlResponseInfo, String str) {
        this.f191338c = cisu;
        this.f191336a = urlResponseInfo;
        this.f191337b = str;
    }

    /* renamed from: a */
    public final void mo86442a() {
        cisu cisu = this.f191338c;
        cisu.f191350a.onRedirectReceived(cisu.f191353d, this.f191336a, this.f191337b);
    }
}
