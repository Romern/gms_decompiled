package p000;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.growth.p048ui.webview.GrowthWebViewChimeraActivity;

/* renamed from: abkl */
public final /* synthetic */ class abkl implements Runnable {

    /* renamed from: a */
    private final GrowthWebViewChimeraActivity f57624a;

    /* renamed from: b */
    private final int f57625b;

    /* renamed from: c */
    private final int f57626c;

    /* renamed from: d */
    private final String f57627d;

    public abkl(GrowthWebViewChimeraActivity growthWebViewChimeraActivity, int i, int i2, String str) {
        this.f57624a = growthWebViewChimeraActivity;
        this.f57625b = i;
        this.f57626c = i2;
        this.f57627d = str;
    }

    public final void run() {
        GrowthWebViewChimeraActivity growthWebViewChimeraActivity = this.f57624a;
        int i = this.f57625b;
        int i2 = this.f57626c;
        String str = this.f57627d;
        WebView webView = growthWebViewChimeraActivity.f79032c;
        String a = ceka.f182818a.mo6606a().mo79203a();
        String join = TextUtils.join(",", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 3 + String.valueOf(join).length());
        sb.append(a);
        sb.append('(');
        sb.append(join);
        sb.append(");");
        webView.evaluateJavascript(sb.toString(), null);
    }
}
