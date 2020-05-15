package p000;

import android.view.View;

/* renamed from: owf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class owf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ owh f38521a;

    public owf(owh owh) {
        this.f38521a = owh;
    }

    public void onClick(View view) {
        owh owh = this.f38521a;
        bpea bpea = bpea.FRX_SCREEN_EXIT;
        bnsn bnsn = owh.f38523a;
        owh.mo22762a(bpea);
        bnsi b = owh.f38523a.mo68387b();
        b.mo68432a("owf", "onClick", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user aborted apps installation");
        this.f38521a.mo22763b().mo22754a("EVENT_APPLICATION_INSTALLATION_CANCELLED");
    }
}
