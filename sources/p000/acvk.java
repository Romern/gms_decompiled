package p000;

import android.view.View;

/* renamed from: acvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ acvp f60884a;

    public acvk(acvp acvp) {
        this.f60884a = acvp;
    }

    public void onClick(View view) {
        acvp acvp = this.f60884a;
        if (acvp.f60909s != null) {
            new acvo(acvp).execute(this.f60884a.f60909s);
        }
    }
}
