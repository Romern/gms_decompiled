package p000;

import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.Arrays;

/* renamed from: tcc */
final /* synthetic */ class tcc implements Runnable {

    /* renamed from: a */
    static final Runnable f45631a = new tcc();

    private tcc() {
    }

    public final void run() {
        Logger Logger = ConstellationDebugChimeraActivity.f30575b;
        cbqw cbqw = (cbqw) cbqy.f178081i.mo74144da();
        if (cbqw.f164950c) {
            cbqw.mo74035c();
            cbqw.f164950c = false;
        }
        ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(3);
        bxvd da = cbqz.f178091c.mo74144da();
        cbqm cbqm = (cbqm) cbqn.f178043d.mo74144da();
        cbqo cbqo = (cbqo) cbqp.f178048c.mo74144da();
        cbqo.mo75242a("1234567891234");
        if (cbqm.f164950c) {
            cbqm.mo74035c();
            cbqm.f164950c = false;
        }
        cbqp cbqp = (cbqp) cbqo.mo74062i();
        cbqp.getClass();
        ((cbqn) cbqm.f164949b).f178045a = cbqp;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbqz cbqz = (cbqz) da.f164949b;
        cbqn cbqn = (cbqn) cbqm.mo74062i();
        cbqn.getClass();
        cbqz.f178094b = cbqn;
        cbqz.f178093a = 1;
        if (cbqw.f164950c) {
            cbqw.mo74035c();
            cbqw.f164950c = false;
        }
        cbqz cbqz2 = (cbqz) da.mo74062i();
        cbqz2.getClass();
        ((cbqy) cbqw.f164949b).f178085c = cbqz2;
        cbqy cbqy = (cbqy) cbqw.mo74062i();
        try {
            szr.m36692a();
            szr.m36695a(Arrays.asList(cbqy));
        } catch (tdw e) {
            ConstellationDebugChimeraActivity.f30575b.mo25417e("Error updating IMSI", e, new Object[0]);
        }
    }
}
