package p000;

import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;

/* renamed from: tuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tuw {

    /* renamed from: a */
    public static final Uri f46703a = Uri.parse("https://support.google.com/chrome/answer/95606").buildUpon().appendQueryParameter("hl", C1189mi.m19638a(tux.m37507a()).mo15464b()).appendQueryParameter("co", "co=GENIE.Platform=Android").build();

    /* renamed from: a */
    public static void m37506a(TextView textView, int i, Uri uri) {
        String string = textView.getContext().getString(i);
        String uri2 = uri.toString();
        String string2 = textView.getResources().getString(C0126R.string.common_learn_more);
        StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 13 + String.valueOf(string2).length());
        sb.append("<a href=");
        sb.append(uri2);
        sb.append(">");
        sb.append(string2);
        sb.append("</a>");
        textView.setText(URLSpanNoUnderline.m22736a(Html.fromHtml(TextUtils.expandTemplate(string, sb.toString()).toString())));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
