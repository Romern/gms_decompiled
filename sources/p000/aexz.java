package p000;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.util.TextViewUtils$3;

/* renamed from: aexz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexz {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static void m52670a(TextView textView) {
        Context context = textView.getContext();
        Uri a = aexs.m52660a(context, context.getString(C0126R.string.location_sharing_url_param_help_location));
        Spannable spannable = (Spannable) Html.fromHtml(context.getString(C0126R.string.location_sharing_footer_text_maps, a.toString()));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannable.setSpan(new TextViewUtils$3(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        sre.m36087g(context);
        textView.setOnClickListener(new aexy(context, a));
    }
}
