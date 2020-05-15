package p000;

import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkhg extends bkgj {

    /* renamed from: a */
    double f124218a = Double.NEGATIVE_INFINITY;

    /* renamed from: e */
    double f124219e = Double.POSITIVE_INFINITY;

    public bkhg(double d, double d2, String str) {
        super(str);
        if (d <= d2) {
            this.f124218a = d;
            this.f124219e = d2;
            return;
        }
        throw new IllegalArgumentException(String.format("Minimum %f is greater than maximum %f.", Double.valueOf(d), Double.valueOf(d2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        String m = ((FormEditText) textView).mo71937m();
        if (TextUtils.isEmpty(m)) {
            return true;
        }
        try {
            double parseDouble = Double.parseDouble(m);
            if (parseDouble < this.f124218a || parseDouble > this.f124219e) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(m);
            Log.e("NumValueValidator", valueOf.length() == 0 ? new String("Could not parse numeric value for string: ") : "Could not parse numeric value for string: ".concat(valueOf), e);
            return false;
        }
    }
}
