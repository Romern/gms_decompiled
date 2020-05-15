package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aosk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aosk implements Runnable {

    /* renamed from: a */
    final Context f83512a;

    /* renamed from: b */
    final DataHolder f83513b;

    public aosk(Context context, DataHolder dataHolder) {
        this.f83512a = context;
        this.f83513b = dataHolder;
    }

    /* renamed from: a */
    private static final aosu m69450a(rex rex) {
        try {
            IBinder a = rex.mo24568a((long) ((Integer) aoss.f83536O.mo58455c()).intValue(), TimeUnit.SECONDS);
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersListener");
            if (!(queryLocalInterface instanceof aosu)) {
                return new aosu(a);
            }
            return (aosu) queryLocalInterface;
        } catch (IllegalStateException | InterruptedException | TimeoutException e) {
            aowu.m69734a("RemindersClientOp", e, "Failed to obtain binder", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo46827a();

    public final void run() {
        try {
            mo46827a();
        } finally {
            this.f83513b.close();
        }
    }

    /* renamed from: a */
    private static final void m69451a(aosj aosj, aosu aosu, String str) {
        try {
            aosj.mo46826a(aosu, str);
        } catch (InterruptedException e) {
            aowu.m69734a("RemindersClientOp", e, "InterruptedException", new Object[0]);
        } catch (RemoteException e2) {
            aowu.m69734a("RemindersClientOp", e2, "RemoteException", new Object[0]);
        } catch (BadParcelableException | NetworkOnMainThreadException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e3) {
            aowu.m69734a("RemindersClientOp", e3, "BinderException", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46828a(String str, aosj aosj) {
        Intent intent = new Intent("com.google.android.gms.reminders.BIND_LISTENER");
        if (str != null) {
            intent.setPackage(str);
        }
        List<ResolveInfo> queryIntentServices = this.f83512a.getPackageManager().queryIntentServices(intent, 4);
        if (queryIntentServices != null && queryIntentServices.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo == null) {
                    aowu.m69733a("RemindersClientOp", "Listener implemented by a non-service", new Object[0]);
                } else {
                    String str2 = serviceInfo.name;
                    String str3 = serviceInfo.packageName;
                    if (!rfz.m33557a(this.f83512a).mo24610b(str3)) {
                        aowu.m69733a("RemindersClientOp", "Package %s not signed by Google", str3);
                    } else {
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName(str3, str2));
                        intent2.setAction("com.google.android.gms.reminders.BIND_LISTENER");
                        rex rex = new rex();
                        if (!skh.m35531a().mo25690a(this.f83512a, intent2, rex, 1)) {
                            aowu.m69733a("RemindersClientOp", "Failed to bind to package %s", str3);
                        } else {
                            aosu a = m69450a(rex);
                            if (a != null) {
                                m69451a(aosj, a, str3);
                            }
                            skh.m35531a().mo25689a(this.f83512a, rex);
                        }
                    }
                }
            }
        }
    }
}
