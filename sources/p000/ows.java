package p000;

import android.view.View;

/* renamed from: ows */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ows implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ owx f38529a;

    public ows(owx owx) {
        this.f38529a = owx;
    }

    public void onClick(View view) {
        this.f38529a.mo22762a(bpea.FRX_SCREEN_ACCEPT);
        this.f38529a.mo22763b().mo22754a("EVENT_APPLICATION_INSTALLATION_ALLOWED");
    }
}
