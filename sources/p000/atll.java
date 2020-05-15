package p000;

import android.view.View;

/* renamed from: atll */
final /* synthetic */ class atll implements View.OnClickListener {

    /* renamed from: a */
    private final atln f90446a;

    public atll(atln atln) {
        this.f90446a = atln;
    }

    public void onClick(View view) {
        atln atln = this.f90446a;
        atln.mo9306a();
        atam atam = atln.f90448a;
        if (atam != null) {
            atam.mo49756b(atln.f90449b);
        } else {
            atln.f90451d = true;
        }
    }
}
