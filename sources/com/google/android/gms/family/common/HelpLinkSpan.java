package com.google.android.gms.family.common;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class HelpLinkSpan extends URLSpan {

    /* renamed from: a */
    private final String f31277a;

    /* renamed from: b */
    private final String f31278b;

    /* renamed from: c */
    private final String f31279c;

    /* renamed from: d */
    private final wgr f31280d;

    public HelpLinkSpan(wgr wgr, String str, String str2, String str3) {
        super(str2);
        this.f31280d = wgr;
        this.f31277a = str;
        this.f31278b = str2;
        this.f31279c = str3;
    }

    public void onClick(View view) {
        GoogleHelp googleHelp = new GoogleHelp(this.f31277a);
        googleHelp.f78774q = Uri.parse(this.f31278b);
        googleHelp.f78760c = new Account(this.f31279c, "com.google");
        TypedValue typedValue = new TypedValue();
        if (this.f31280d.getActivity().getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true)) {
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.f31623a = 2132018595;
            themeSettings.f31624b = typedValue.data;
            googleHelp.f78776s = themeSettings;
        }
        new aarh(this.f31280d.getActivity()).mo31646a(googleHelp.mo43194a());
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
