package p000;

import android.view.View;

/* renamed from: bhha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhha implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhhp f118637a;

    /* renamed from: b */
    final /* synthetic */ bhhb f118638b;

    public bhha(bhhb bhhb, bhhp bhhp) {
        this.f118638b = bhhb;
        this.f118637a = bhhp;
    }

    public void onClick(View view) {
        int q = this.f118638b.mo63753j().mo84q() - 1;
        if (q >= 0) {
            this.f118638b.mo63751a(this.f118637a.mo63774f(q));
        }
    }
}
