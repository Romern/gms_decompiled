package p000;

import android.content.Context;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: fgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgl {

    /* renamed from: a */
    public final WebView f16514a;

    /* renamed from: b */
    public final List f16515b = Arrays.asList(cbrr.f178191a.mo6606a().mo75304a().split(Pattern.quote("|")));

    /* renamed from: c */
    public bmza f16516c;

    public fgl(Context context) {
        WebView webView = new WebView(context);
        this.f16514a = webView;
        webView.getSettings().setAllowFileAccess(false);
    }
}
