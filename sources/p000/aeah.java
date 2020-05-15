package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.scheduler.PendingCallback;
import java.util.ArrayList;

/* renamed from: aeah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aeah extends Service implements aebd {

    /* renamed from: f */
    final bmzi f62986f = bmzn.m108681a((bmzi) new aeag(this));

    /* renamed from: a */
    public int mo6269a(aecc aecc) {
        throw null;
    }

    /* renamed from: aZ */
    public void mo7135aZ() {
    }

    /* renamed from: c */
    public final boolean mo33980c(String str) {
        return "com.google.android.gms.gcm.ACTION_TASK_READY".equals(str);
    }

    public IBinder onBind(Intent intent) {
        String action;
        aebc aebc = (aebc) this.f62986f.mo6606a();
        IInterface iInterface = null;
        if (intent == null || (action = intent.getAction()) == null || !aebc.f63045m.mo33980c(action)) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        Binder binder = (Binder) aebc.f63037e.getBinder();
        aeci aeci = new aeci(aebc, binder);
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            iInterface = binder.queryLocalInterface(interfaceDescriptor);
        }
        aeci.attachInterface(iInterface, interfaceDescriptor);
        return aeci;
    }

    public void onCreate() {
        super.onCreate();
        aebc aebc = (aebc) this.f62986f.mo6606a();
        aebc.f63039g = aeat.m51532a(aebc);
        aebc.f63037e = new Messenger(new aeay(aebc, Looper.getMainLooper()));
        aebc.f63038f = new ComponentName(aebc, aebc.mo34003c().getClass());
        aebc.f63040h = adzw.f62971d.mo16698a(aebc.f63045m.getClass(), aebc);
    }

    public void onDestroy() {
        super.onDestroy();
        ((aebc) this.f62986f.mo6606a()).mo33997a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        aebb aebb;
        aalm aalm;
        aebe aebe;
        aebc aebc = (aebc) this.f62986f.mo6606a();
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    if (stringExtra != null) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                        Bundle bundleExtra = intent.getBundleExtra("extras");
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                        intent.getLongExtra("max_exec_duration", 180);
                        aeaf a = aeaf.m51513a(intent.getBundleExtra("engine_flags"));
                        if (parcelableExtra instanceof PendingCallback) {
                            IBinder iBinder = ((PendingCallback) parcelableExtra).f79289a;
                            if (iBinder != null) {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
                                aebe = !(queryLocalInterface instanceof aebg) ? new aebe(iBinder) : (aebg) queryLocalInterface;
                            } else {
                                aebe = null;
                            }
                            aebb = new aebb(aebc, stringExtra, aebe, bundleExtra, parcelableArrayListExtra, a);
                        } else if (!(parcelableExtra instanceof com.google.android.gms.gcm.PendingCallback)) {
                            String packageName = aebc.getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + stringExtra.length());
                            sb.append(packageName);
                            sb.append(" ");
                            sb.append(stringExtra);
                            sb.append(": Could not process request, invalid callback.");
                            Log.e("GmsTaskChimeraService", sb.toString());
                        } else {
                            IBinder iBinder2 = ((com.google.android.gms.gcm.PendingCallback) parcelableExtra).f32802a;
                            if (iBinder2 != null) {
                                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                                aalm = !(queryLocalInterface2 instanceof aalo) ? new aalm(iBinder2) : (aalo) queryLocalInterface2;
                            } else {
                                aalm = null;
                            }
                            aebb = new aebb(aebc, stringExtra, aalm, bundleExtra, parcelableArrayListExtra, a);
                        }
                        if (!aebc.mo34000a(stringExtra)) {
                            aebc.mo33999a(aebb);
                        }
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                    sb2.append("Unknown action received ");
                    sb2.append(action);
                    sb2.append(", terminating");
                    Log.e("GmsTaskChimeraService", sb2.toString());
                } else {
                    aebc.mo34001b();
                }
            } catch (Throwable th) {
                aebc.mo33998a(i2);
                throw th;
            }
        }
        aebc.mo33998a(i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        String action;
        aebc aebc = (aebc) this.f62986f.mo6606a();
        if (intent != null && (action = intent.getAction()) != null && aebc.f63045m.mo33980c(action) && ((aebc.mo34003c() instanceof BoundService) || cdnj.f181319a.mo6606a().mo78008l())) {
            aebc.mo33997a();
        }
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    public final bqgg mo33979a(aecc aecc, aebu aebu) {
        bqgg bqgg;
        aebc aebc = (aebc) this.f62986f.mo6606a();
        sdo.m34959a(aebu);
        synchronized (aebc.f63035c) {
            bqgj bqgj = aebc.f63036d;
            if (bqgj == null) {
                Log.e("GmsTaskChimeraService", "Executor service has been shutdown before running the task.");
                bqgg = bqga.m112775a((Object) 1);
            } else {
                bqgg = bqgj.mo25819b(new aeaw(aebc, aecc));
            }
        }
        return bqgg;
    }
}
