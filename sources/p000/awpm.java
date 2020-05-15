package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* renamed from: awpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awpm extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awpn f94807a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awpm(awpn awpn, String str) {
        super(str);
        this.f94807a = awpn;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        synchronized (this.f94807a) {
            if (this.f94807a.f94809b.getCount() == 0) {
                this.f94807a.f94809b = new CountDownLatch(1);
            }
            this.f94807a.f94810c = null;
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bjfs bjfs;
        synchronized (this.f94807a) {
            awpn awpn = this.f94807a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.wallet.bender3.framework.actions.IActionExecutorService");
                bjfs = !(queryLocalInterface instanceof bjfs) ? new bjfq(iBinder) : (bjfs) queryLocalInterface;
            } else {
                bjfs = null;
            }
            awpn.f94810c = bjfs;
            this.f94807a.f94809b.countDown();
        }
    }
}
