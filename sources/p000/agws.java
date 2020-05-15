package p000;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.util.TimeTextUtils$URLSpanMediumNoUnderline;

/* renamed from: agws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agws extends acm {

    /* renamed from: s */
    public final TextView f66749s;

    /* renamed from: t */
    public final TextView f66750t;

    public agws(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.primary_text);
        this.f66749s = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.secondary_text);
        this.f66750t = textView2;
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public static Spannable m55206a(Spanned spanned) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new TimeTextUtils$URLSpanMediumNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return newSpannable;
    }
}
