package com.google.android.wallet.p097ui.encryption;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.encryption.HtmlSnippetView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HtmlSnippetView extends WebView implements bjwm, bjxz {

    /* renamed from: a */
    public String f152301a;

    /* renamed from: b */
    public String f152302b;

    /* renamed from: c */
    private bmdp f152303c;

    /* renamed from: d */
    private bkdb f152304d;

    public HtmlSnippetView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118826a(String str) {
        loadDataWithBaseURL(null, str, "text/html", null, null);
    }

    public final void addJavascriptInterface(Object obj, String str) {
    }

    /* renamed from: f */
    public final void mo65408f(String str) {
        this.f152302b = Uri.parse(str).getQuery();
        this.f152304d.mo51905a(8, Bundle.EMPTY);
    }

    public final WebSettings getSettings() {
        if (bjvb.m104682a()) {
            return super.getSettings();
        }
        return null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            String string = bundle.getString("htmlContent");
            this.f152301a = string;
            m118826a(string);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putString("htmlContent", this.f152301a);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(!z ? 0.3f : 1.0f);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
    }

    public HtmlSnippetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HtmlSnippetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo72152a(bmdp bmdp, bjwk bjwk, bkdb bkdb) {
        super.getSettings().setAllowContentAccess(false);
        super.getSettings().setCacheMode(2);
        this.f152303c = bmdp;
        this.f152304d = bkdb;
        bwio bwio = bmdp.f128849b;
        if (bwio == null) {
            bwio = bwio.f159659d;
        }
        bwip bwip = bwio.f159663c;
        if (bwip == null) {
            bwip = bwip.f159664e;
        }
        String str = bwip.f159668c;
        this.f152301a = str;
        m118826a(str);
        bjya bjya = new bjya();
        bjya.f123618a = this;
        super.setWebViewClient(bjya);
        bwio bwio2 = bmdp.f128849b;
        if (bwio2 == null) {
            bwio2 = bwio.f159659d;
        }
        bjwl.m104784a(this, bwio2.f159662b, bjwk);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmu bmmu;
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 14) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "HtmlSnippetView does not handle resulting action type %s", objArr));
        }
        long j = bmmv.f130059e;
        bwio bwio = this.f152303c.f128849b;
        if (bwio == null) {
            bwio = bwio.f159659d;
        }
        if (j == bwio.f159662b) {
            if (bmmv.f130056b == 10) {
                bmmu = (bmmu) bmmv.f130057c;
            } else {
                bmmu = bmmu.f130049b;
            }
            bwip bwip = bmmu.f130051a;
            if (bwip == null) {
                bwip = bwip.f159664e;
            }
            String str = bwip.f159668c;
            this.f152301a = str;
            m118826a(str);
        }
    }
}
