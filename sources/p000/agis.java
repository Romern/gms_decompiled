package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: agis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agis implements ServiceConnection {

    /* renamed from: a */
    public final String f65644a;

    /* renamed from: b */
    final /* synthetic */ agit f65645b;

    public agis(agit agit, String str) {
        this.f65645b = agit;
        this.f65644a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        emk emk;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (!(queryLocalInterface instanceof emk)) {
                    emk = new emk(iBinder);
                } else {
                    emk = (emk) queryLocalInterface;
                }
                if (emk != null) {
                    this.f65645b.f65646a.mo35497E().f65572k.mo35435a("Install Referrer Service connected");
                    this.f65645b.f65646a.mo35498F().mo35492a(new agir(this, emk, this));
                    return;
                }
                this.f65645b.f65646a.mo35497E().f65567f.mo35435a("Install Referrer Service implementation was not found");
            } catch (Exception e) {
                this.f65645b.f65646a.mo35497E().f65567f.mo35436a("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f65645b.f65646a.mo35497E().f65567f.mo35435a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f65645b.f65646a.mo35497E().f65572k.mo35435a("Install Referrer Service disconnected");
    }
}
