package p000;

import android.view.View;

/* renamed from: atlm */
final /* synthetic */ class atlm implements View.OnClickListener {

    /* renamed from: a */
    private final atln f90447a;

    public atlm(atln atln) {
        this.f90447a = atln;
    }

    public void onClick(View view) {
        atln atln = this.f90447a;
        atam atam = atln.f90448a;
        if (atam != null) {
            atam.mo49761c(atln.f90449b);
        } else {
            atln.f90452e = true;
        }
        atln.dismiss();
    }
}
