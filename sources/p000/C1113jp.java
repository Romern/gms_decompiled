package p000;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: jp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1113jp implements Handler.Callback, ServiceConnection {

    /* renamed from: a */
    public final Handler f22954a;

    /* renamed from: b */
    private final Context f22955b;

    /* renamed from: c */
    private final HandlerThread f22956c;

    /* renamed from: d */
    private final Map f22957d = new HashMap();

    /* renamed from: e */
    private Set f22958e = new HashSet();

    public C1113jp(Context context) {
        this.f22955b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.f22956c = handlerThread;
        handlerThread.start();
        this.f22954a = new Handler(this.f22956c.getLooper(), this);
    }

    /* renamed from: a */
    private final void m17053a(C1112jo joVar) {
        if (joVar.f22919b) {
            this.f22955b.unbindService(this);
            joVar.f22919b = false;
        }
        joVar.f22922e = null;
    }

    /* renamed from: b */
    private final void m17054b(C1112jo joVar) {
        if (!this.f22954a.hasMessages(3, joVar.f22918a)) {
            int i = joVar.f22921d + 1;
            joVar.f22921d = i;
            if (i > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + joVar.f22920c.size() + " tasks to " + joVar.f22918a + " after " + joVar.f22921d + " retries");
                joVar.f22920c.clear();
                return;
            }
            this.f22954a.sendMessageDelayed(this.f22954a.obtainMessage(3, joVar.f22918a), (long) ((1 << (i - 1)) * 1000));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r10.f22919b != false) goto L_0x004a;
     */
    /* renamed from: c */
    private final void m17055c(C1112jo joVar) {
        Parcel obtain;
        if (!joVar.f22920c.isEmpty()) {
            if (!joVar.f22919b) {
                boolean bindService = this.f22955b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(joVar.f22918a), this, 33);
                joVar.f22919b = bindService;
                if (!bindService) {
                    Log.w("NotifManCompat", "Unable to bind to listener " + joVar.f22918a);
                    this.f22955b.unbindService(this);
                } else {
                    joVar.f22921d = 0;
                }
            }
            if (joVar.f22922e != null) {
                while (true) {
                    C1110jm jmVar = (C1110jm) joVar.f22920c.peek();
                    if (jmVar == null) {
                        break;
                    }
                    try {
                        C1080il ilVar = joVar.f22922e;
                        String str = jmVar.f22783a;
                        int i = jmVar.f22784b;
                        String str2 = jmVar.f22785c;
                        Notification notification = jmVar.f22786d;
                        obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                        obtain.writeString(str);
                        obtain.writeInt(i);
                        obtain.writeString(str2);
                        if (notification != null) {
                            obtain.writeInt(1);
                            notification.writeToParcel(obtain, 0);
                        } else {
                            obtain.writeInt(0);
                        }
                        ilVar.f21275a.transact(1, obtain, null, 1);
                        obtain.recycle();
                        joVar.f22920c.remove();
                    } catch (DeadObjectException e) {
                    } catch (RemoteException e2) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + joVar.f22918a, e2);
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                }
                if (!joVar.f22920c.isEmpty()) {
                    m17054b(joVar);
                    return;
                }
                return;
            }
            m17054b(joVar);
        }
    }

    public final boolean handleMessage(Message message) {
        C1080il ilVar;
        int i = message.what;
        if (i == 0) {
            C1110jm jmVar = (C1110jm) message.obj;
            Set a = C1114jq.m17100a(this.f22955b);
            if (!a.equals(this.f22958e)) {
                this.f22958e = a;
                List<ResolveInfo> queryIntentServices = this.f22955b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (a.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f22957d.containsKey(componentName2)) {
                        this.f22957d.put(componentName2, new C1112jo(componentName2));
                    }
                }
                Iterator it = this.f22957d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        m17053a((C1112jo) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (C1112jo joVar : this.f22957d.values()) {
                joVar.f22920c.add(jmVar);
                m17055c(joVar);
            }
            return true;
        } else if (i == 1) {
            C1111jn jnVar = (C1111jn) message.obj;
            ComponentName componentName3 = jnVar.f22850a;
            IBinder iBinder = jnVar.f22851b;
            C1112jo joVar2 = (C1112jo) this.f22957d.get(componentName3);
            if (joVar2 != null) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    ilVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C1080il)) ? new C1080il(iBinder) : (C1080il) queryLocalInterface;
                } else {
                    ilVar = null;
                }
                joVar2.f22922e = ilVar;
                joVar2.f22921d = 0;
                m17055c(joVar2);
            }
            return true;
        } else if (i == 2) {
            C1112jo joVar3 = (C1112jo) this.f22957d.get((ComponentName) message.obj);
            if (joVar3 != null) {
                m17053a(joVar3);
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            C1112jo joVar4 = (C1112jo) this.f22957d.get((ComponentName) message.obj);
            if (joVar4 != null) {
                m17055c(joVar4);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22954a.obtainMessage(1, new C1111jn(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22954a.obtainMessage(2, componentName).sendToTarget();
    }
}
