package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
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

/* renamed from: qlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qlb extends did {

    /* renamed from: g */
    private rpg f41632g;

    /* renamed from: h */
    private aabl f41633h = null;

    protected qlb() {
        qlp.m32393a();
    }

    /* renamed from: a */
    private final void m32323a(Intent intent, int i) {
        ssh.m36214e();
        rpr.m34216b();
        Service service = this.f13207a;
        if (service == null) {
            Log.e("ChimeraSrvcProxy", "Proxy without impl dropping onStart()");
            stopSelf(i);
            return;
        }
        mo9047a(intent);
        service.onStart(intent, i);
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        blji a = aabl.m21058a(this.f41633h, "dump");
        try {
            C1225nr nrVar = this.f13210d;
            if (nrVar != null) {
                printWriter.println("NullBinders:");
                for (int i = 0; i < nrVar.f26758b; i++) {
                    String valueOf = String.valueOf((String) nrVar.mo15513b(i));
                    printWriter.println(valueOf.length() == 0 ? new String("  ") : "  ".concat(valueOf));
                }
                printWriter.println();
            }
            Service service = this.f13207a;
            if (service != null) {
                service.publicDump(fileDescriptor, printWriter, strArr);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public IBinder onBind(Intent intent) {
        aacg aacg;
        Binder binder;
        String interfaceDescriptor;
        blji a = aabl.m21058a(this.f41633h, "onBind");
        try {
            rpr.m34216b();
            Service service = this.f13207a;
            if (service == null) {
                Log.e("ChimeraSrvcProxy", "Proxy without impl failing onBind()");
                aacg = null;
            } else {
                mo9047a(intent);
                aacg = service.onBind(intent);
            }
            if (aacg == null) {
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
                aacg = new dib(this, action);
            } else if ((aacg instanceof Binder) && (interfaceDescriptor = (binder = (Binder) aacg).getInterfaceDescriptor()) != null) {
                String[] strArr = did.f13206f;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (strArr[i].equals(interfaceDescriptor)) {
                            break;
                        }
                        i++;
                    } else {
                        aacg = new dfr(binder, interfaceDescriptor);
                        if (this.f13209c == null) {
                            this.f13209c = new ArrayList(1);
                        }
                        this.f13209c.add(new WeakReference(aacg));
                    }
                }
            }
            Service service2 = this.f13207a;
            if (!(service2 instanceof dfl)) {
                if (service2 != null && aacg.m21082a(aacg)) {
                    aacg = new aacg(service2, (Binder) aacg);
                }
            }
            if (a != null) {
                a.close();
            }
            return aacg;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ModuleContext moduleContext;
        blji a = aabl.m21058a(this.f41633h, "onConfigurationChanged");
        try {
            rpg rpg = this.f41632g;
            if (rpg != null) {
                rpg.mo24981a(configuration);
            }
            Context context = this.f13208b;
            if (context != null) {
                moduleContext = ModuleContext.getModuleContext(context);
            } else {
                moduleContext = null;
            }
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            Service service = this.f13207a;
            if (service != null) {
                service.onConfigurationChanged(configuration);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        blji a = aabl.m21058a(this.f41633h, "onCreate");
        try {
            ssh.m36214e();
            rpr.m34216b();
            super.onCreate();
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        blji a = aabl.m21058a(this.f41633h, "onDestroy");
        try {
            rpr.m34216b();
            Service service = this.f13207a;
            if (service != null) {
                service.onDestroy();
            }
            List<WeakReference> list = this.f13209c;
            if (list != null) {
                for (WeakReference weakReference : list) {
                    dfr dfr = (dfr) weakReference.get();
                    if (dfr != null) {
                        dfr.close();
                    }
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onLowMemory() {
        blji a = aabl.m21058a(this.f41633h, "onLowMemory");
        try {
            Service service = this.f13207a;
            if (service != null) {
                service.onLowMemory();
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onRebind(Intent intent) {
        blji a = aabl.m21058a(this.f41633h, "onRebind");
        try {
            rpr.m34216b();
            Service service = this.f13207a;
            if (service != null) {
                mo9047a(intent);
                service.onRebind(intent);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onStart(Intent intent, int i) {
        blji blji;
        if (cdoz.f181455a.mo6606a().mo78121n()) {
            aabl aabl = this.f41633h;
            if (aabl != null) {
                blji = aabl.mo16695a("onStartCommand", intent);
            } else {
                blji = null;
            }
            try {
                m32323a(intent, i);
                if (blji != null) {
                    blji.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            m32323a(intent, i);
            return;
        }
        throw th;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        blji blji;
        aabl aabl = this.f41633h;
        if (aabl != null) {
            blji = aabl.mo16695a("onStartCommand", intent);
        } else {
            blji = null;
        }
        try {
            ssh.m36214e();
            rpr.m34216b();
            int onStartCommand = super.onStartCommand(intent, i, i2);
            if (blji != null) {
                blji.close();
            }
            return onStartCommand;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onTaskRemoved(Intent intent) {
        blji a = aabl.m21058a(this.f41633h, "onTaskRemoved");
        try {
            Service service = this.f13207a;
            if (service != null) {
                mo9047a(intent);
                service.onTaskRemoved(intent);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onTrimMemory(int i) {
        blji a = aabl.m21058a(this.f41633h, "onTrimMemory");
        try {
            Service service = this.f13207a;
            if (service != null) {
                service.onTrimMemory(i);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        boolean z;
        blji a = aabl.m21058a(this.f41633h, "onUnbind");
        try {
            rpr.m34216b();
            Service service = this.f13207a;
            if (service != null) {
                mo9047a(intent);
                z = service.onUnbind(intent);
            } else {
                z = false;
            }
            if (a != null) {
                a.close();
            }
            return z;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final boolean mo9146c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, name), 128);
            if (!(serviceInfo.metaData == null || (string = serviceInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
                qlp a = qlp.m32393a();
                StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
                sb.append(string);
                sb.append(" ");
                sb.append(name);
                a.mo8861a(context, 82, sb.toString());
                qmc.m32416a();
                qmc.m32420a(context, string);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        Service service = (Service) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            rpg rpg = new rpg(context);
            this.f41632g = rpg;
            context = rpg;
        }
        this.f41633h = new aabl(context, service.getClass(), 7);
        Context a = aabj.m21054a(context);
        if (this.f13207a == null) {
            this.f13207a = service;
            this.f13207a.setProxy(this, a);
            this.f13208b = a;
            return;
        }
        throw new IllegalStateException("Service implementation already set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo9048a() {
        if (!rpr.m34216b().getInSafeBoot()) {
            return did.f13205e.mo9147a(this, this);
        }
        return false;
    }
}
