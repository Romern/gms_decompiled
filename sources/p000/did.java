package p000;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: did */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class did extends Service implements Service.ProxyCallbacks, dju, dfx {

    /* renamed from: e */
    public static final dic f13205e = new dic();

    /* renamed from: f */
    public static final String[] f13206f = {"com.google.android.gms.common.internal.ISharedPreferencesService", "android.content.ISyncAdapter", "android.service.notification.IConditionProvider", "android.hardware.location.IActivityRecognitionHardwareClient", "android.hardware.location.IActivityRecognitionHardwareWatcher", "android.location.IFusedProvider", "android.location.IGeocodeProvider", "android.location.IGeofenceProvider", "com.android.internal.location.ILocationProvider"};

    /* renamed from: a */
    public com.google.android.chimera.Service f13207a = null;

    /* renamed from: b */
    public Context f13208b = null;

    /* renamed from: c */
    public List f13209c;

    /* renamed from: d */
    public C1225nr f13210d = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9047a(Intent intent) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null && intent != null) {
            intent.setExtrasClassLoader(service.getClassLoader());
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9048a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!mo9048a()) {
            dfy.m8329a((Context) this).mo8886a((dfx) this);
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1225nr nrVar = this.f13210d;
        if (nrVar != null) {
            printWriter.println("NullBinders:");
            for (int i = 0; i < nrVar.f26758b; i++) {
                String valueOf = String.valueOf((String) nrVar.mo15513b(i));
                printWriter.println(valueOf.length() == 0 ? new String("  ") : "  ".concat(valueOf));
            }
            printWriter.println();
        }
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.publicDump(fileDescriptor, printWriter, strArr);
        }
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        Binder binder;
        String interfaceDescriptor;
        com.google.android.chimera.Service service = this.f13207a;
        if (service == null) {
            Log.e("ChimeraSrvcProxy", "Proxy without impl failing onBind()");
            iBinder = null;
        } else {
            mo9047a(intent);
            iBinder = service.onBind(intent);
        }
        if (iBinder == null) {
            String action = intent.getAction();
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33 + String.valueOf(action).length());
            sb.append(name);
            sb.append(" returning NullBinder for action ");
            sb.append(action);
            Log.i("ChimeraSrvcProxy", sb.toString());
            if (this.f13210d == null) {
                this.f13210d = new C1225nr();
            }
            this.f13210d.add(action);
            return new dib(this, action);
        }
        if ((iBinder instanceof Binder) && (interfaceDescriptor = (binder = (Binder) iBinder).getInterfaceDescriptor()) != null) {
            String[] strArr = f13206f;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(interfaceDescriptor)) {
                    i++;
                }
            }
            dfr dfr = new dfr(binder, interfaceDescriptor);
            if (this.f13209c == null) {
                this.f13209c = new ArrayList(1);
            }
            this.f13209c.add(new WeakReference(dfr));
            return dfr;
        }
        return iBinder;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext;
        Context context = this.f13208b;
        if (context != null) {
            moduleContext = ModuleContext.getModuleContext(context);
        } else {
            moduleContext = null;
        }
        if (moduleContext != null) {
            moduleContext.updateModuleConfiguration(configuration);
        }
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.onConfigurationChanged(configuration);
        }
    }

    public void onCreate() {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.onCreate();
        } else {
            super.onCreate();
        }
    }

    public void onDestroy() {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.onDestroy();
        }
        List list = this.f13209c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dfr dfr = (dfr) ((WeakReference) list.get(i)).get();
                if (dfr != null) {
                    dfr.close();
                }
            }
        }
    }

    public void onLowMemory() {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.onLowMemory();
        }
    }

    public void onRebind(Intent intent) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            mo9047a(intent);
            service.onRebind(intent);
        }
    }

    public void onStart(Intent intent, int i) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service == null) {
            Log.e("ChimeraSrvcProxy", "Proxy without impl dropping onStart()");
            stopSelf(i);
            return;
        }
        mo9047a(intent);
        service.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service == null) {
            return super.onStartCommand(intent, i, i2);
        }
        mo9047a(intent);
        return service.onStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            mo9047a(intent);
            service.onTaskRemoved(intent);
        }
    }

    public void onTrimMemory(int i) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service != null) {
            service.onTrimMemory(i);
        }
    }

    public boolean onUnbind(Intent intent) {
        com.google.android.chimera.Service service = this.f13207a;
        if (service == null) {
            return false;
        }
        mo9047a(intent);
        return service.onUnbind(intent);
    }

    public final void superOnCreate() {
        super.onCreate();
    }

    public final void superOnDestroy() {
        super.onDestroy();
    }

    public final int superOnStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public final void superStopSelf() {
        super.stopSelf();
    }

    public final boolean superStopSelfResult(int i) {
        return super.stopSelfResult(i);
    }

    public final void superStopSelf(int i) {
        super.stopSelf(i);
    }

    /* renamed from: a */
    public final boolean mo8842a(djz djz) {
        return djz.mo9181f().mo69920b(dmv.m8834a(djz.mo9181f().mo69896E(), getClass().getName())) != null;
    }
}
