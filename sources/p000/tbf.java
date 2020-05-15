package p000;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.constellation.p038ui.ConstellationWebSettingsChimeraActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: tbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tbf extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ ConstellationWebSettingsChimeraActivity f45606a;

    /* renamed from: b */
    private final Set f45607b = new HashSet();

    public tbf(ConstellationWebSettingsChimeraActivity constellationWebSettingsChimeraActivity) {
        this.f45606a = constellationWebSettingsChimeraActivity;
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cdfz.f180729a.mo6606a().mo77477n())) {
            this.f45607b.add(Uri.parse(str).getHost());
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        ConstellationWebSettingsChimeraActivity.f30567b.mo25412b("Checking whitelist", new Object[0]);
        if (this.f45607b.contains(parse.getHost())) {
            return false;
        }
        this.f45606a.startActivity(new Intent("android.intent.action.VIEW", parse));
        return true;
    }
}
