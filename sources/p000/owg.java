package p000;

import android.view.View;

/* renamed from: owg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class owg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ owh f38522a;

    public owg(owh owh) {
        this.f38522a = owh;
    }

    public void onClick(View view) {
        this.f38522a.mo22762a(bpea.FRX_SCREEN_ACCEPT);
        this.f38522a.mo22763b().mo22754a("EVENT_APPLICATION_INSTALLATION_ALLOWED");
    }
}
