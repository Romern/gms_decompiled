package p000;

import android.view.View;

/* renamed from: etn */
final /* synthetic */ class etn implements View.OnClickListener {

    /* renamed from: a */
    private final eto f15679a;

    /* renamed from: b */
    private final bsui f15680b;

    public etn(eto eto, bsui bsui) {
        this.f15679a = eto;
        this.f15680b = bsui;
    }

    public void onClick(View view) {
        eto eto = this.f15679a;
        bsui bsui = this.f15680b;
        if ((bsui.f147130a & 4) != 0) {
            evl evl = eto.f15682t.f15935g;
            bsxn bsxn = bsui.f147133d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            evl.mo10501a(bsxn);
            return;
        }
        eto.f15682t.f15690a.performClick();
    }
}
