package p000;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abar */
public final /* synthetic */ class abar implements Runnable {

    /* renamed from: a */
    private final HelpChimeraActivity f56954a;

    public abar(HelpChimeraActivity helpChimeraActivity) {
        this.f56954a = helpChimeraActivity;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.f56954a;
        if (helpChimeraActivity.f78961h.getVisibility() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(helpChimeraActivity.f56986y.mo43211F())) {
            HelpConfig helpConfig = helpChimeraActivity.f56986y;
            bxvd da = bzqp.f171047j.mo74144da();
            bxvd da2 = bzqt.f171068c.mo74144da();
            String e = helpChimeraActivity.f56986y.mo43230e();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzqt bzqt = (bzqt) da2.f164949b;
            e.getClass();
            bzqt.f171070a |= 4;
            bzqt.f171071b = e;
            bzqt bzqt2 = (bzqt) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzqp bzqp = (bzqp) da.f164949b;
            bzqt2.getClass();
            bzqp.f171056h = bzqt2;
            bzqp.f171049a |= 2048;
            helpConfig.mo43218a((bzqp) da.mo74062i());
            aasz.m46954a(helpChimeraActivity);
            if (aaya.m47229b(cehp.m136861d())) {
                helpChimeraActivity.f78961h.setVisibility(0);
            } else {
                helpChimeraActivity.finish();
            }
        } else if (helpChimeraActivity.mo43353o()) {
            helpChimeraActivity.mo43354p();
        } else {
            helpChimeraActivity.mo43355q();
        }
    }
}
