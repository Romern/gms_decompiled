package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;

/* renamed from: eyo */
final /* synthetic */ class eyo implements bhdz {

    /* renamed from: a */
    private final eyu f16036a;

    public eyo(eyu eyu) {
        this.f16036a = eyu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo10589a(AppBarLayout appBarLayout, int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        eyu eyu = this.f16036a;
        if (eyu.f16049c != i2) {
            eyu.f16049c = i2;
            float abs = 1.0f - Math.abs(((float) i2) / ((float) appBarLayout.mo70975c()));
            if (eyu.f16068v != 2) {
                eyu.f16058l.setAlpha((float) Math.pow((double) abs, 4.0d));
            } else if (eyu.f16054h.getLineCount() <= 1) {
                View findViewById = eyu.f16058l.findViewById(C0126R.C0129id.account_spinner);
                View findViewById2 = eyu.f16058l.findViewById(C0126R.C0129id.action_chip);
                TextView textView = (TextView) eyu.f16058l.findViewById(C0126R.C0129id.welcome);
                double d = (double) abs;
                findViewById.setAlpha((float) Math.pow(d, 16.0d));
                findViewById2.setAlpha((float) Math.pow(d, 16.0d));
                float f = eyu.f16066t;
                textView.setTextSize(0, f + ((eyu.f16065s - f) * abs));
                float round = (float) Math.round(((float) (appBarLayout.mo70975c() - eyu.f16064r)) * (1.0f - abs));
                View view = eyu.f16052f;
                if (view != null) {
                    view.setTranslationY(round);
                    eyu.f16051e.setTranslationY(-round);
                } else {
                    textView.setTranslationY(round);
                }
            } else {
                eyu.f16055i.setTranslationY((float) (-i2));
                float f2 = 1.0f - abs;
                eyu.f16058l.setAlpha((float) Math.pow((double) Math.max(1.0f - (1.5f * f2), 0.0f), 4.0d));
                TextView textView2 = eyu.f16055i;
                float pow = (float) Math.pow((double) f2, 2.0d);
                textView2.setAlpha(Math.min(pow + pow, 1.0f));
            }
            View view2 = eyu.f16052f;
            if (view2 == null) {
                eyu.f16051e.setClickable(((double) abs) > 0.5d);
            } else {
                if (((double) abs) > 0.5d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view2.setClickable(z2);
            }
            Chip chip = eyu.f16056j;
            if (chip != null) {
                if (((double) abs) > 0.5d) {
                    z = true;
                } else {
                    z = false;
                }
                chip.setClickable(z);
            }
            if (eyu.f16060n) {
                eyu.mo10593a((int) (((float) eyu.f16067u) * (1.0f - abs)));
            }
            if (eyu.f16059m.f16046e) {
                eyu.f16059m = abs < 1.0E-4f ? eyt.EXPANDABLE_MINIMIZED : abs <= 0.9999f ? eyt.EXPANDABLE_IN_TRANSITION : eyt.EXPANDABLE_MAXIMIZED;
            }
            bhdz bhdz = eyu.f16062p;
            if (bhdz != null) {
                bhdz.mo10589a(appBarLayout, i2);
            }
        }
    }
}
