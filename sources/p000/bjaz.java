package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: bjaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjaz {
    /* renamed from: a */
    public static void m103133a(TextView textView, bjay bjay) {
        Typeface create;
        int a;
        int a2;
        Context context = textView.getContext();
        if (!(bjay.f122452a == null || (a2 = biyk.m102977a(context).mo64868a(context, bjay.f122452a)) == 0)) {
            textView.setTextColor(a2);
        }
        if (!(bjay.f122453b == null || (a = biyk.m102977a(context).mo64868a(context, bjay.f122453b)) == 0)) {
            textView.setLinkTextColor(a);
        }
        if (bjay.f122454c != null) {
            float e = biyk.m102977a(context).mo64873e(context, bjay.f122454c);
            if (e > 0.0f) {
                textView.setTextSize(0, e);
            }
        }
        if (!(bjay.f122455d == null || (create = Typeface.create(biyk.m102977a(context).mo64871c(context, bjay.f122455d), 0)) == null)) {
            textView.setTypeface(create);
        }
        textView.setGravity(bjay.f122456e);
    }
}
