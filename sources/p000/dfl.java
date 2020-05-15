package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: dfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dfl extends Service {

    /* renamed from: a */
    final dfk f13013a = new dfk(this);

    /* renamed from: a */
    protected static final void m8291a(Intent intent, BoundService boundService) {
        intent.setExtrasClassLoader(boundService.getClassLoader());
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (BoundService boundService : this.f13013a.mo8854a()) {
            printWriter.append((CharSequence) String.valueOf(boundService.getClass().getName()).concat(":"));
            boundService.publicDump(fileDescriptor, printWriter, strArr);
        }
    }

    public IBinder onBind(Intent intent) {
        BoundService boundService;
        int i;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("onBind: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("Loading bound service for intent: ");
        sb2.append(valueOf2);
        sb2.toString();
        String action = intent.getAction();
        if (action == null) {
            Log.e("BoundBrokerSvc", "Intent doesn't have action specified");
            boundService = null;
        } else {
            boundService = (BoundService) this.f13013a.f13010a.get(action);
            if (boundService == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    dfy a = dfy.m8329a(this);
                    djz f = a.mo8898f();
                    String E = f.mo9181f().mo69896E();
                    boolean z = !aytw.m84815b(this);
                    brtm f2 = f.mo9181f();
                    dmy d = f2.mo69924d(dmv.m8834a(f2.mo69896E(), action));
                    if (d == null) {
                        Log.w("BoundBrokerSvc", action.length() == 0 ? new String("No bound-service is registered for action: ") : "No bound-service is registered for action: ".concat(action));
                        d = null;
                    } else if (z) {
                        int __offset = d.__offset(10);
                        if (__offset == 0 || d.f143329bb.get(__offset + d.bb_pos) == 0) {
                            Log.w("BoundBrokerSvc", action.length() == 0 ? new String("Bound-service for action is not direct boot aware: ") : "Bound-service for action is not direct boot aware: ".concat(action));
                            d = null;
                        }
                    }
                    if (d != null) {
                        String c = d.mo9291c();
                        if (!getContainerService().getClass().getName().equals(dmv.m8840b(E, c))) {
                            String valueOf3 = String.valueOf(c);
                            throw new InvalidConfigException(valueOf3.length() == 0 ? new String("Bound-service is registered with wrong container service: ") : "Bound-service is registered with wrong container service: ".concat(valueOf3));
                        }
                        int __offset2 = d.__offset(12);
                        if (__offset2 != 0) {
                            i = d.f143329bb.getInt(__offset2 + d.bb_pos);
                        } else {
                            i = 0;
                        }
                        Context a2 = a.mo8882a(this, f, i);
                        if (a2 != null) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            String b = dmv.m8840b(E, d.mo9292e());
                            dfk dfk = this.f13013a;
                            BoundService boundService2 = (BoundService) dfk.f13011b.get(b);
                            if (boundService2 != null) {
                                dfk.f13010a.put(action, boundService2);
                                boundService = boundService2;
                            } else {
                                BoundService a3 = dfk.f13012c.mo8855a(a2, b);
                                if (a3 != null) {
                                    dfk.f13012c.mo8856a(a3, a2);
                                    a3.onCreate();
                                    dfk.f13010a.put(action, a3);
                                    dfk.f13011b.put(b, a3);
                                }
                                boundService = a3;
                            }
                        } else {
                            String valueOf4 = String.valueOf(d.mo9292e());
                            Log.e("BoundBrokerSvc", valueOf4.length() == 0 ? new String("Failed to load module for ") : "Failed to load module for ".concat(valueOf4));
                        }
                    }
                } catch (InvalidConfigException e) {
                    Log.e("BoundBrokerSvc", "Chimera module config error", e);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                boundService = null;
            }
        }
        if (boundService == null) {
            String valueOf5 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 37);
            sb3.append("Proxy without impl failing onBind(): ");
            sb3.append(valueOf5);
            Log.e("BoundBrokerSvc", sb3.toString());
            return null;
        }
        m8291a(intent, boundService);
        return boundService.onBind(intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        for (BoundService boundService : this.f13013a.mo8854a()) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(boundService);
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            boundService.onConfigurationChanged(configuration);
        }
    }

    public void onDestroy() {
        for (BoundService boundService : this.f13013a.mo8854a()) {
            boundService.onDestroy();
        }
        dfk dfk = this.f13013a;
        dfk.f13010a.clear();
        dfk.f13011b.clear();
    }

    public final void onLowMemory() {
        for (BoundService boundService : this.f13013a.mo8854a()) {
            boundService.onLowMemory();
        }
    }

    public final void onRebind(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("onRebind: ");
        sb.append(valueOf);
        sb.toString();
        BoundService a = this.f13013a.mo8853a(intent);
        if (a != null) {
            a.onRebind(intent);
            return;
        }
        String valueOf2 = String.valueOf(intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb2.append("Rebinding a non-existent BoundService: ");
        sb2.append(valueOf2);
        Log.e("BoundBrokerSvc", sb2.toString());
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.e("BoundBrokerSvc", "onStartCommand is not supported");
        stopSelf(i2);
        return 2;
    }

    public final void onTrimMemory(int i) {
        for (BoundService boundService : this.f13013a.mo8854a()) {
            boundService.onTrimMemory(i);
        }
    }

    public final boolean onUnbind(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("onUnbind: ");
        sb.append(valueOf);
        sb.toString();
        BoundService a = this.f13013a.mo8853a(intent);
        if (a == null) {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            sb2.append("unbind a non-existent BoundService: ");
            sb2.append(valueOf2);
            Log.e("BoundBrokerSvc", sb2.toString());
            return false;
        }
        m8291a(intent, a);
        return a.onUnbind(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BoundService mo8855a(Context context, String str) {
        return (BoundService) dgc.m8381a(context.getClassLoader(), str, BoundService.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8856a(BoundService boundService, Context context) {
        boundService.setModuleContext(context);
    }
}
