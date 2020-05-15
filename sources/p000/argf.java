package p000;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: argf */
final /* synthetic */ class argf implements Runnable {

    /* renamed from: a */
    private final argg f87651a;

    /* renamed from: b */
    private final arai f87652b;

    public argf(argg argg, arai arai) {
        this.f87651a = argg;
        this.f87652b = arai;
    }

    public final void run() {
        int i;
        argg argg = this.f87651a;
        arai arai = this.f87652b;
        armn armn = argg.f87654a;
        armn.f87914e.mo48676b();
        try {
            armg.m73111a(armn.f87911b, armn.f87922m);
        } catch (InvalidConfigException e) {
            armn.f87910a.mo25410a((Throwable) e);
        }
        armn armn2 = argg.f87654a;
        Context context = arai.f87197a;
        sre.m36088h(context);
        sre.m36087g(context);
        if (!sre.m36081a(context.getResources())) {
            sre.m36089i(context);
            i = 2;
        } else {
            i = 5;
        }
        bxvd bxvd = armn2.f87913d.f87925a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boue boue = (boue) bxvd.f164949b;
        boue boue2 = boue.f134915f;
        boue.f134921e = i - 1;
        boue.f134917a |= 8;
    }
}
