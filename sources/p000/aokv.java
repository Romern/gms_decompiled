package p000;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: aokv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokv extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ aokw f78369a;

    public aokv(aokw aokw) {
        this.f78369a = aokw;
    }

    public void onClick(View view) {
        aokw aokw = this.f78369a;
        aokw.f78372c = aokw.f78374e.isChecked();
        aokw aokw2 = this.f78369a;
        aokw2.f78373d = aokw2.f78374e.isEnabled();
        this.f78369a.f78378i.mo43010l();
    }
}
