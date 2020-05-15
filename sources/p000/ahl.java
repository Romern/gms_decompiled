package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ahl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahl implements ServiceConnection {

    /* renamed from: a */
    public Context f546a;

    /* renamed from: a */
    public abstract void mo707a(ahi ahi);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0995fp fpVar;
        if (this.f546a != null) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                fpVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0995fp)) ? new C0995fp(iBinder) : (C0995fp) queryLocalInterface;
            } else {
                fpVar = null;
            }
            mo707a(new ahi(fpVar, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
