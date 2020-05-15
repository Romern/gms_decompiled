package p000;

import android.view.View;
import java.util.List;
import java.util.Locale;

/* renamed from: bjwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwn implements bjwm {

    /* renamed from: a */
    final View f123521a;

    public bjwn(View view) {
        this.f123521a = view;
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            this.f123521a.setVisibility(0);
        } else if (i != 11) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 == 0) {
                a2 = 1;
            }
            objArr[0] = Integer.valueOf(a2 - 1);
            objArr[1] = Long.valueOf(bmmv.f130059e);
            throw new IllegalArgumentException(String.format(locale, "Unsupported resulting action type: %s for %d", objArr));
        } else {
            this.f123521a.setVisibility(8);
        }
    }
}
