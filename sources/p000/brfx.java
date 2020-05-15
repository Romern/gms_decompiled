package p000;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.DeviceList;
import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.FelicaEventListener;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: brfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brfx implements FelicaEventListener {

    /* renamed from: a */
    final /* synthetic */ FSC f142787a;

    /* renamed from: b */
    final /* synthetic */ brfy f142788b;

    public brfx(brfy brfy, FSC fsc) {
        this.f142788b = brfy;
        this.f142787a = fsc;
    }

    public final void errorOccurred(int i, String str, AppInfo appInfo) {
        this.f142788b.f142790b.f142794d.mo69503a(i, str, appInfo);
        brfy brfy = this.f142788b;
        brfy.f142790b.f142794d.mo69506a(brfy.f142789a);
        brfz brfz = this.f142788b.f142790b;
        brfz.f142794d.f142819g.execute(new brft(brfz.f142791a, i, str, appInfo));
        this.f142788b.f142790b.f142794d.mo69514e(5);
        this.f142788b.f142790b.f142794d.mo69509c();
    }

    public final void finished() {
        this.f142788b.f142790b.f142794d.mo69507b(2);
        try {
            this.f142788b.f142789a.open();
            this.f142788b.f142789a.select(65024);
            if (this.f142788b.f142790b.f142791a.mo69485a()) {
                this.f142787a.setFelica(this.f142788b.f142789a);
                this.f142787a.setFSCEventListener(new brfw(this));
                this.f142787a.setDeviceList(new DeviceList());
                this.f142787a.start(this.f142788b.f142790b.f142793c);
                return;
            }
            brfy brfy = this.f142788b;
            brfy.f142790b.f142794d.mo69506a(brfy.f142789a);
            this.f142788b.f142790b.f142794d.mo69509c();
        } catch (FelicaException e) {
            this.f142788b.f142790b.f142794d.mo69502a(10, e);
            brfy brfy2 = this.f142788b;
            brfy2.f142790b.f142794d.mo69506a(brfy2.f142789a);
            brfz brfz = this.f142788b.f142790b;
            brfz.f142794d.f142819g.execute(new brfs(brfz.f142791a, e));
            this.f142788b.f142790b.f142794d.mo69514e(6);
            this.f142788b.f142790b.f142794d.mo69509c();
        }
    }
}
