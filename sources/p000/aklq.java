package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: aklq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aklq extends aeaa {

    /* renamed from: a */
    public final CountDownLatch f72216a = new CountDownLatch(1);

    /* renamed from: b */
    private final akln f72217b = new aklp(this);

    public aklq() {
        super("netrec");
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        int i = eoa.f15378a;
    }

    /* renamed from: a */
    public abstract void mo39546a(Messenger messenger, akln akln);

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        int i = eoa.f15378a;
        try {
            mo39546a(new Messenger(iBinder), this.f72217b);
        } catch (RemoteException e) {
            eoa.m10824a("NetRec", "Error when messaging wfa", new Object[0]);
        }
    }
}
