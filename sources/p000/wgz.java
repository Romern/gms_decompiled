package p000;

import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.google.android.gms.family.common.StringUtil$1;

/* renamed from: wgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgz {
    /* renamed from: a */
    public static void m41939a(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableString.setSpan(new StringUtil$1(), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            }
            if (uRLSpanArr.length > 0) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(spannableString);
            return;
        }
        textView.setText((CharSequence) null);
    }

    /* renamed from: a */
    public static void m41940a(TextView textView, String str, Html.TagHandler tagHandler) {
        m41939a(textView, Html.fromHtml(stm.m36299a(str), null, tagHandler));
    }
}
