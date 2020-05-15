package com.google.android.wallet.shared.common;

import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClickSpan extends URLSpan {

    /* renamed from: a */
    private final bjxu f151844a;

    protected ClickSpan(String str, bjxu bjxu) {
        super(str);
        if (bjxu != null) {
            this.f151844a = bjxu;
            return;
        }
        throw new IllegalStateException("listener should not be null");
    }

    /* renamed from: a */
    public static void m118372a(TextView textView, String str, bjxu bjxu, boolean z) {
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ClickSpan(url, bjxu), spanStart, spanEnd, spanFlags);
        }
        textView.setText(spannableString);
        if (uRLSpanArr.length > 0) {
            if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            int i = Build.VERSION.SDK_INT;
            if (z) {
                textView.setImportantForAccessibility(1);
            }
        }
    }

    public void onClick(View view) {
        this.f151844a.mo52355a(view, getURL());
    }
}
