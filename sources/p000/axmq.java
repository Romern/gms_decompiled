package p000;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import com.google.android.gms.walletp2p.infra.text.HtmlUtils$1;

/* renamed from: axmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmq {
    /* renamed from: a */
    public static void m82730a(TextView textView, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        SpannableString spannableString = new SpannableString(fromHtml);
        Linkify.addLinks(spannableString, 15);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanEnd = fromHtml.getSpanEnd(uRLSpan);
            int spanStart = fromHtml.getSpanStart(uRLSpan);
            spannableString.setSpan(uRLSpan, spanStart, spanEnd, 0);
            spannableString.setSpan(new HtmlUtils$1(), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
