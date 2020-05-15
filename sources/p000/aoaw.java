package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aoaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoaw extends aeaa {

    /* renamed from: a */
    final /* synthetic */ antp f78055a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoaw(antp antp, String str) {
        super(str);
        this.f78055a = antp;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        idb idb;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
            if (queryLocalInterface instanceof idb) {
                idb = (idb) queryLocalInterface;
            } else {
                idb = new icz(iBinder);
            }
            try {
                idb.mo12931a();
            } catch (RemoteException e) {
                Log.w("PlusService", "Could not invoke revokeAccess on IRevocationService", e);
            } catch (Throwable th) {
                skh.m35531a().mo25689a(this.f78055a.f77720a, this);
                throw th;
            }
            skh.m35531a().mo25689a(this.f78055a.f77720a, this);
        }
    }
}
