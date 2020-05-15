package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: nny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nny extends aeaa {

    /* renamed from: a */
    public ouc f36125a;

    /* renamed from: b */
    public boolean f36126b = true;

    /* renamed from: c */
    final /* synthetic */ noj f36127c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nny(noj noj) {
        super("car");
        this.f36127c = noj;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        ouc ouc;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ICarSetupBinder");
            ouc = queryLocalInterface instanceof ouc ? (ouc) queryLocalInterface : new oua(iBinder);
        } else {
            ouc = null;
        }
        this.f36125a = ouc;
        synchronized (this.f36127c.f36170O) {
            this.f36126b = false;
            this.f36127c.f36170O.notify();
        }
    }
}
