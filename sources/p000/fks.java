package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: fks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fks implements ServiceConnection {

    /* renamed from: a */
    public volatile fno f16812a;

    /* renamed from: b */
    public volatile boolean f16813b;

    /* renamed from: c */
    final /* synthetic */ fkt f16814c;

    protected fks(fkt fkt) {
        this.f16814c = fkt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053 A[SYNTHETIC, Splitter:B:28:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC, Splitter:B:31:0x0067] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fnm fnm;
        sdo.m34967a("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                try {
                    this.f16814c.mo10942g("Service connected with null binder");
                    notifyAll();
                    return;
                } catch (Throwable th) {
                    notifyAll();
                    throw th;
                }
            } else {
                fnm = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        if (!(queryLocalInterface instanceof fno)) {
                            fnm = new fnm(iBinder);
                        } else {
                            fnm = (fno) queryLocalInterface;
                        }
                        try {
                            this.f16814c.mo10933d("Bound to IAnalyticsService interface");
                        } catch (RemoteException e) {
                        }
                    } else {
                        this.f16814c.mo10938e("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e2) {
                }
                if (fnm != null) {
                    try {
                        skh.m35531a().mo25689a(this.f16814c.mo10939f(), this.f16814c.f16815a);
                    } catch (IllegalArgumentException e3) {
                    }
                } else if (!this.f16813b) {
                    this.f16814c.mo10940f("onServiceConnected received after the timeout limit");
                    this.f16814c.mo10944i().mo10886a(new fkq(this, fnm));
                } else {
                    this.f16812a = fnm;
                }
                notifyAll();
            }
        }
        this.f16814c.mo10942g("Service connect failed to get IAnalyticsService");
        if (fnm != null) {
        }
        notifyAll();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        sdo.m34967a("AnalyticsServiceConnection.onServiceDisconnected");
        this.f16814c.mo10944i().mo10886a(new fkr(this, componentName));
    }
}
