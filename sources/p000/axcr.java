package p000;

import android.webkit.ValueCallback;

/* renamed from: axcr */
final /* synthetic */ class axcr implements ValueCallback {

    /* renamed from: a */
    private final axcs f95792a;

    /* renamed from: b */
    private final String f95793b;

    public axcr(axcs axcs, String str) {
        this.f95792a = axcs;
        this.f95793b = str;
    }

    public final void onReceiveValue(Object obj) {
        axcs axcs = this.f95792a;
        Boolean bool = (Boolean) obj;
        axcs.f95794a.loadUrl(this.f95793b);
    }
}
