package p000;

import android.view.View;

/* renamed from: ezj */
final /* synthetic */ class ezj implements View.OnClickListener {

    /* renamed from: a */
    private final ezm f16090a;

    /* renamed from: b */
    private final bsys f16091b;

    public ezj(ezm ezm, bsys bsys) {
        this.f16090a = ezm;
        this.f16091b = bsys;
    }

    public void onClick(View view) {
        ezm ezm = this.f16090a;
        bsys bsys = this.f16091b;
        fde fde = ezm.f16100a;
        bsxn aU = ezm.mo10584aU();
        bsxn bsxn = bsys.f147713c;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        fde.mo10732a(aU, bsxn);
    }
}
