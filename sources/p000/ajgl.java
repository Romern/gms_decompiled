package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgl extends LinearLayout {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ajgl, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public ajgl(Context context, String str) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.messages_opt_in_custom_title, (ViewGroup) this, true);
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("<b><font color=#17170435>");
        sb.append(str);
        sb.append("</font></b>");
        ((TextView) findViewById(C0126R.C0129id.title)).setText(Html.fromHtml(resources.getString(C0126R.string.messages_opt_in_dialog_title, sb.toString())));
    }
}
