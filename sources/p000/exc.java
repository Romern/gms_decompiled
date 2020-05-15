package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: exc */
final /* synthetic */ class exc implements C0038ax {

    /* renamed from: a */
    private final exf f15965a;

    public exc(exf exf) {
        this.f15965a = exf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        exf exf = this.f15965a;
        ept ept = (ept) obj;
        exx exx = (exx) exf.getChildFragmentManager().findFragmentByTag("bottom_drawer");
        if (exx != null) {
            exf.getChildFragmentManager().beginTransaction().remove(exx).commitNow();
            fcc.m11455b(exf.getView().findViewById(C0126R.C0129id.bottom_nav_ui_container));
        }
    }
}
