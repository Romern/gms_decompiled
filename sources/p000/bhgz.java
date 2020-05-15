package p000;

import android.view.View;

/* renamed from: bhgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgz implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhhp f118635a;

    /* renamed from: b */
    final /* synthetic */ bhhb f118636b;

    public bhgz(bhhb bhhb, bhhp bhhp) {
        this.f118636b = bhhb;
        this.f118635a = bhhp;
    }

    public void onClick(View view) {
        int p = this.f118636b.mo63753j().mo83p() + 1;
        if (p < this.f118636b.f118642aa.getAdapter().mo161a()) {
            this.f118636b.mo63751a(this.f118635a.mo63774f(p));
        }
    }
}
