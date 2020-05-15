package p000;

import android.view.View;

/* renamed from: atrb */
final /* synthetic */ class atrb implements View.OnClickListener {

    /* renamed from: a */
    private final atrd f90698a;

    public atrb(atrd atrd) {
        this.f90698a = atrd;
    }

    public void onClick(View view) {
        attc attc = this.f90698a.f90700a;
        if (attc != null) {
            asvi.m74896a(attc.f90866c, 1500);
            attc.f90864a.dismissAllowingStateLoss();
        }
    }
}
