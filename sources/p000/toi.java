package p000;

import android.view.View;

/* renamed from: toi */
final /* synthetic */ class toi implements View.OnClickListener {

    /* renamed from: a */
    private final tol f46396a;

    /* renamed from: b */
    private final bskf f46397b;

    public toi(tol tol, bskf bskf) {
        this.f46396a = tol;
        this.f46397b = bskf;
    }

    public void onClick(View view) {
        tol tol = this.f46396a;
        bskf bskf = this.f46397b;
        if (!bskf.mo70660f().isEmpty()) {
            tol.mo26688a(bskf, 1);
        }
    }
}
