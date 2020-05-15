package com.google.android.gms.mobiledataplan.p055ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mobiledataplan.ui.ConsentWebView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConsentWebView extends WebView {

    /* renamed from: b */
    public static final srn f80319b = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public agtu f80320a;

    /* renamed from: c */
    private WebViewClient f80321c;

    public ConsentWebView(Context context) {
        super(context);
        m67299a(this);
    }

    /* renamed from: a */
    private final void m67299a(WebView webView) {
        agtt agtt = new agtt(this, new beca(new ArrayList()));
        this.f80321c = agtt;
        webView.setWebViewClient(agtt);
        webView.setOnLongClickListener(agts.f66515a);
        webView.setLongClickable(false);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        m67300a(this, this.f80320a);
    }

    public ConsentWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67299a(this);
    }

    public ConsentWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67299a(this);
    }

    /* renamed from: a */
    public static void m67300a(WebView webView, agtu agtu) {
        if (!webView.canScrollVertically(1) && agtu != null) {
            agtu.mo36091a();
        }
    }

    /* renamed from: a */
    public final void mo44110a(ConsentAgreementText consentAgreementText) {
        String str;
        SafeHtml safeHtml;
        if (!TextUtils.isEmpty(agqg.m54866u())) {
            str = agqg.m54866u();
        } else {
            SafeHtml[] safeHtmlArr = consentAgreementText.f80263b;
            if (safeHtmlArr == null || safeHtmlArr.length == 0 || (safeHtml = safeHtmlArr[0]) == null) {
                f80319b.mo26019b(agyt.m55307c()).mo68405a("consent paragraph is empty");
                str = "";
            } else {
                str = safeHtml.f80282a;
            }
        }
        loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
    }
}
