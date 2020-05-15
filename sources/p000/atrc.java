package p000;

import android.view.View;

/* renamed from: atrc */
final /* synthetic */ class atrc implements View.OnClickListener {

    /* renamed from: a */
    private final atrd f90699a;

    public atrc(atrd atrd) {
        this.f90699a = atrd;
    }

    public void onClick(View view) {
        attc attc = this.f90699a.f90700a;
        if (attc != null) {
            attc.f90864a.dismissAllowingStateLoss();
            attc.f90867d.mo50170b(attc.f90865b);
        }
    }
}
