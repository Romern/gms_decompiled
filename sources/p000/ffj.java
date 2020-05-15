package p000;

import com.google.android.chimera.FragmentManager;
import com.google.android.gms.accountsettings.p007mg.p009ui.main.MainChimeraActivity;

/* renamed from: ffj */
public final /* synthetic */ class ffj implements C0038ax {

    /* renamed from: a */
    private final MainChimeraActivity f16455a;

    public ffj(MainChimeraActivity mainChimeraActivity) {
        this.f16455a = mainChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        bsxn bsxn;
        MainChimeraActivity mainChimeraActivity = this.f16455a;
        fdt fdt = (fdt) obj;
        if (fbt.m11412a(mainChimeraActivity, "navigation")) {
            return;
        }
        if (fdt == fdt.PENDING) {
            if (fbt.m11412a(mainChimeraActivity, "onboarding")) {
                FragmentManager supportFragmentManager = mainChimeraActivity.getSupportFragmentManager();
                supportFragmentManager.beginTransaction().remove(supportFragmentManager.findFragmentByTag("onboarding")).commitNow();
            }
        } else if (fdt == fdt.SPLASH && !fbt.m11412a(mainChimeraActivity, "splashScreen")) {
            mainChimeraActivity.mo6338a(new fbr(), "splashScreen", fbs.FADE_IN);
        } else if (fdt != fdt.ONBOARDING || fbt.m11412a(mainChimeraActivity, "onboarding")) {
            if (fdt == fdt.NAVIGATION) {
                if (fbt.m11412a(mainChimeraActivity, "onboarding")) {
                    bsxn = mainChimeraActivity.f7789c.f16347d.mo10737d();
                    if (bsxn == null) {
                        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
                        if (bsxl.f164950c) {
                            bsxl.mo74035c();
                            bsxl.f164950c = false;
                        }
                        bsxn bsxn2 = (bsxn) bsxl.f164949b;
                        bsxn2.f147588a = 1 | bsxn2.f147588a;
                        bsxn2.f147589b = 0;
                        bsxn = (bsxn) bsxl.mo74062i();
                    }
                } else {
                    bsxn = MainChimeraActivity.f7788b;
                }
                mainChimeraActivity.setRequestedOrientation(-1);
                mainChimeraActivity.mo6338a(faa.m11352a(bsxn), "navigation", mainChimeraActivity.mo6341e());
            }
        } else if (mainChimeraActivity.getResources().getConfiguration().orientation == 1) {
            mainChimeraActivity.setRequestedOrientation(1);
            mainChimeraActivity.mo6338a(new fak(), "onboarding", fbs.CROSS_FADE);
        } else {
            mainChimeraActivity.mo6338a(faa.m11352a(MainChimeraActivity.f7788b), "navigation", mainChimeraActivity.mo6341e());
        }
    }
}
