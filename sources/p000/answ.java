package p000;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: answ */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class answ {
    /* renamed from: a */
    public static void m65135a(Resources resources, TextView textView, int i) {
        int i2;
        int i3;
        ansv ansv = new ansv();
        if (i == 1) {
            i2 = resources.getColor(C0126R.color.talladega_text_white);
            i3 = 1;
        } else if (i == 2) {
            i2 = resources.getColor(C0126R.color.talladega_text_white);
            i3 = 0;
        } else if (i == 3) {
            i2 = resources.getColor(C0126R.color.talladega_text_dark);
            i3 = 1;
        } else if (i != 4) {
            i2 = resources.getColor(C0126R.color.talladega_text_gray);
            i3 = 1;
        } else {
            i2 = resources.getColor(C0126R.color.talladega_text_dark);
            i3 = 0;
        }
        ansv.f77649a = i2;
        ansv.f77650b = i3;
        if (textView != null) {
            textView.setTextSize(0, resources.getDimension(C0126R.dimen.talladega_text_size_14));
            textView.setTextColor(ansv.f77649a);
            if (ansv.f77650b != 1) {
                textView.setTypeface(Typeface.DEFAULT);
            } else {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }
}
