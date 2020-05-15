package p000;

import android.view.View;

/* renamed from: acvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ acvp f60883a;

    public acvj(acvp acvp) {
        this.f60883a = acvp;
    }

    public void onClick(View view) {
        acvp acvp = this.f60883a;
        if (acvp.f60909s != null) {
            new acvl(acvp).execute(this.f60883a.f60909s);
        }
    }
}
