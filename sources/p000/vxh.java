package p000;

import android.util.Log;

/* renamed from: vxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vxh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vxi f50185a;

    public vxh(vxi vxi) {
        this.f50185a = vxi;
    }

    public final void run() {
        if (this.f50185a.f50186a != null) {
            vxi vxi = this.f50185a;
            vxj vxj = vxi.f50188c;
            vxj.f50193b--;
            try {
                vxi.f50186a.mo28938a();
            } catch (Exception e) {
                Log.e("DGProcessor", "Error while closing handle.");
            }
            this.f50185a.f50186a = null;
            this.f50185a.f50188c.mo28930a();
        }
    }
}
