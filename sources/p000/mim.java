package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: mim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mim extends aeaa {

    /* renamed from: a */
    final /* synthetic */ mio f33781a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mim(mio mio) {
        super("backup");
        this.f33781a = mio;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f33781a.f33787f = null;
        this.f33781a.f33782a.mo25412b("PlayP2pRestoreService disconnected", new Object[0]);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bnk bnk;
        mio mio = this.f33781a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.setup.IPlayP2pRestoreService");
            bnk = queryLocalInterface instanceof bnk ? (bnk) queryLocalInterface : new bnk(iBinder);
        } else {
            bnk = null;
        }
        mio.f33787f = bnk;
        this.f33781a.f33782a.mo25412b("PlayP2pRestoreService connected", new Object[0]);
        this.f33781a.mo20076b();
    }
}
