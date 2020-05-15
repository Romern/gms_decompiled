package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqsb {

    /* renamed from: a */
    private final View f86676a;

    /* renamed from: b */
    private final Context f86677b;

    public aqsb(View view, Context context) {
        this.f86676a = view;
        this.f86677b = context;
    }

    /* renamed from: a */
    public final bhnh mo48121a() {
        return mo48122a(C0126R.string.common_something_went_wrong, 0, null);
    }

    /* renamed from: a */
    public final bhnh mo48122a(int i, int i2, aqsa aqsa) {
        boolean z;
        if (i2 == 0 && aqsa == null) {
            z = true;
        } else {
            z = (i2 == 0 || aqsa == null) ? false : true;
        }
        sdo.m34974b(z);
        int c = (int) cgor.m146364c();
        if (cgnz.m146325b()) {
            if (cgnk.f187363a.mo6606a().mo84160c()) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f86677b.getSystemService("accessibility");
                if (accessibilityManager.isEnabled() && !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) {
                    c = -2;
                }
            }
            View view = this.f86676a;
            SpannableString spannableString = new SpannableString(this.f86677b.getResources().getString(i));
            spannableString.setSpan(new ForegroundColorSpan(thh.m36969e(this.f86677b)), 0, spannableString.length(), 0);
            bhnh a = bhnh.m101202a(view, spannableString, c);
            if (aqsa != null) {
                a.mo64030a(i2, new aqry(aqsa));
                a.mo64033b(thh.m36968d(this.f86677b));
            }
            a.mo64034c(thh.m36967c(this.f86677b));
            return a;
        }
        bhnh a2 = bhnh.m101201a(this.f86676a, i, c);
        if (aqsa != null) {
            a2.mo64030a(i2, new aqrz(aqsa));
            a2.mo64033b(C1133kh.m17843b(this.f86677b, C0126R.color.snackbar_button_color));
        }
        return a2;
    }
}
