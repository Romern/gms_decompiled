package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rnm implements Handler.Callback {

    /* renamed from: a */
    public static final Status f43391a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    public static final Status f43392b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: f */
    public static final Object f43393f = new Object();

    /* renamed from: g */
    public static rnm f43394g;

    /* renamed from: c */
    public final long f43395c = 5000;

    /* renamed from: d */
    public final long f43396d = 120000;

    /* renamed from: e */
    public long f43397e = 10000;

    /* renamed from: h */
    public final Context f43398h;

    /* renamed from: i */
    public final rfi f43399i;

    /* renamed from: j */
    public final sby f43400j;

    /* renamed from: k */
    public final AtomicInteger f43401k = new AtomicInteger(0);

    /* renamed from: l */
    public final Map f43402l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m */
    public rmd f43403m = null;

    /* renamed from: n */
    public final Set f43404n = new C1225nr();

    /* renamed from: o */
    public final Handler f43405o;

    /* renamed from: p */
    public volatile boolean f43406p = true;

    /* renamed from: q */
    private final AtomicInteger f43407q = new AtomicInteger(1);

    /* renamed from: r */
    private final Set f43408r = new C1225nr();

    private rnm(Context context, Looper looper, rfi rfi) {
        this.f43398h = context;
        this.f43405o = new adzt(looper, this);
        this.f43399i = rfi;
        this.f43400j = new sby(rfi);
        sre.m36087g(context);
        Handler handler = this.f43405o;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static rnm m34128a(Context context) {
        rnm rnm;
        synchronized (f43393f) {
            if (f43394g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f43394g = new rnm(context.getApplicationContext(), handlerThread.getLooper(), rfi.f42868a);
            }
            rnm = f43394g;
        }
        return rnm;
    }

    /* renamed from: b */
    private final void m34129b(rjx rjx) {
        rkz rkz = rjx.f43162A;
        rni rni = (rni) this.f43402l.get(rkz);
        if (rni == null) {
            rni = new rni(this, rjx);
            this.f43402l.put(rkz, rni);
        }
        if (rni.mo24937i()) {
            this.f43408r.add(rkz);
        }
        rni.mo24936h();
    }

    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] a;
        long j = 300000;
        rni rni = null;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f43397e = j;
                this.f43405o.removeMessages(12);
                for (rkz rkz : this.f43402l.keySet()) {
                    Handler handler = this.f43405o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, rkz), this.f43397e);
                }
                break;
            case 2:
                rlc rlc = (rlc) message.obj;
                Iterator it = rlc.f43209a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        rkz rkz2 = (rkz) it.next();
                        rni rni2 = (rni) this.f43402l.get(rkz2);
                        if (rni2 == null) {
                            rlc.mo24845a(rkz2, new ConnectionResult(13), null);
                            break;
                        } else if (rni2.f43369b.mo24648p()) {
                            rlc.mo24845a(rkz2, ConnectionResult.f30063a, rni2.f43369b.mo24651s());
                        } else if (rni2.mo24934f() != null) {
                            rlc.mo24845a(rkz2, rni2.mo24934f(), null);
                        } else {
                            sdo.m34964a(rni2.f43375h.f43405o);
                            rni2.f43370c.add(rlc);
                            rni2.mo24936h();
                        }
                    }
                }
            case 3:
                for (rni rni3 : this.f43402l.values()) {
                    rni3.mo24933e();
                    rni3.mo24936h();
                }
                break;
            case 4:
            case 8:
            case 13:
                rog rog = (rog) message.obj;
                rni rni4 = (rni) this.f43402l.get(rog.f43434c.f43162A);
                if (rni4 == null) {
                    m34129b(rog.f43434c);
                    rni4 = (rni) this.f43402l.get(rog.f43434c.f43162A);
                }
                if (rni4.mo24937i() && this.f43401k.get() != rog.f43433b) {
                    rog.f43432a.mo24834a(f43391a);
                    rni4.mo24932d();
                    break;
                } else {
                    rni4.mo24928a(rog.f43432a);
                    break;
                }
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f43402l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        rni rni5 = (rni) it2.next();
                        if (rni5.f43372e == i) {
                            rni = rni5;
                        }
                    }
                }
                if (rni == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String a2 = rfy.m33542a(connectionResult.f30065c);
                    String str = connectionResult.f30067e;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a2);
                    sb2.append(": ");
                    sb2.append(str);
                    rni.mo24927a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f43398h.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f43398h.getApplicationContext();
                    synchronized (rld.f43214a) {
                        if (!rld.f43214a.f43218e) {
                            application.registerActivityLifecycleCallbacks(rld.f43214a);
                            application.registerComponentCallbacks(rld.f43214a);
                            rld.f43214a.f43218e = true;
                        }
                    }
                    rld rld = rld.f43214a;
                    rnd rnd = new rnd(this);
                    synchronized (rld.f43214a) {
                        rld.f43217d.add(rnd);
                    }
                    rld rld2 = rld.f43214a;
                    if (!rld2.f43216c.get()) {
                        int i2 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!rld2.f43216c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            rld2.f43215b.set(true);
                        }
                    }
                    if (!rld2.f43215b.get()) {
                        this.f43397e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m34129b((rjx) message.obj);
                break;
            case 9:
                if (this.f43402l.containsKey(message.obj)) {
                    rni rni6 = (rni) this.f43402l.get(message.obj);
                    sdo.m34964a(rni6.f43375h.f43405o);
                    if (rni6.f43373f) {
                        rni6.mo24936h();
                        break;
                    }
                }
                break;
            case 10:
                for (rkz rkz3 : this.f43408r) {
                    ((rni) this.f43402l.remove(rkz3)).mo24932d();
                }
                this.f43408r.clear();
                break;
            case 11:
                if (this.f43402l.containsKey(message.obj)) {
                    rni rni7 = (rni) this.f43402l.get(message.obj);
                    sdo.m34964a(rni7.f43375h.f43405o);
                    if (rni7.f43373f) {
                        rni7.mo24935g();
                        rnm rnm = rni7.f43375h;
                        if (rnm.f43399i.mo24590b(rnm.f43398h) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        rni7.mo24927a(status);
                        rni7.f43369b.mo14032j();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f43402l.containsKey(message.obj)) {
                    ((rni) this.f43402l.get(message.obj)).mo24929a(true);
                    break;
                }
                break;
            case 14:
                rme rme = (rme) message.obj;
                rkz rkz4 = rme.f43275a;
                if (this.f43402l.containsKey(rkz4)) {
                    rme.f43276b.mo50391a(Boolean.valueOf(((rni) this.f43402l.get(rkz4)).mo24929a(false)));
                    break;
                } else {
                    rme.f43276b.mo50391a((Object) false);
                    break;
                }
            case 15:
                rnj rnj = (rnj) message.obj;
                Map map = this.f43402l;
                rkz rkz5 = rnj.f43381a;
                if (map.containsKey(null)) {
                    Map map2 = this.f43402l;
                    rkz rkz6 = rnj.f43381a;
                    rni rni8 = (rni) map2.get(null);
                    if (rni8.f43374g.contains(rnj) && !rni8.f43373f) {
                        if (rni8.f43369b.mo24648p()) {
                            rni8.mo24931c();
                            break;
                        } else {
                            rni8.mo24936h();
                            break;
                        }
                    }
                }
                break;
            case 16:
                rnj rnj2 = (rnj) message.obj;
                Map map3 = this.f43402l;
                rkz rkz7 = rnj2.f43381a;
                if (map3.containsKey(null)) {
                    Map map4 = this.f43402l;
                    rkz rkz8 = rnj2.f43381a;
                    rni rni9 = (rni) map4.get(null);
                    if (rni9.f43374g.remove(rnj2)) {
                        rni9.f43375h.f43405o.removeMessages(15, rnj2);
                        rni9.f43375h.f43405o.removeMessages(16, rnj2);
                        Feature feature = rnj2.f43382b;
                        ArrayList arrayList = new ArrayList(rni9.f43368a.size());
                        for (rkx rkx : rni9.f43368a) {
                            if ((rkx instanceof rkr) && (a = ((rkr) rkx).mo24833a(rni9)) != null && sqc.m35963b(a, null)) {
                                arrayList.add(rkx);
                            }
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            rkx rkx2 = (rkx) arrayList.get(i3);
                            rni9.f43368a.remove(rkx2);
                            rkx2.mo24835a(new rkq(null));
                        }
                        break;
                    }
                }
                break;
            default:
                int i4 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i4);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo24944a() {
        return this.f43407q.getAndIncrement();
    }

    /* renamed from: b */
    public final void mo24949b() {
        Handler handler = this.f43405o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: a */
    public final aucb mo24945a(rjx rjx, roh roh, rpf rpf, Runnable runnable) {
        aucf aucf = new aucf();
        rku rku = new rku(new roi(roh, rpf, runnable), aucf);
        Handler handler = this.f43405o;
        handler.sendMessage(handler.obtainMessage(8, new rog(rku, this.f43401k.get(), rjx)));
        return aucf.f91388a;
    }

    /* renamed from: b */
    public final void mo24950b(ConnectionResult connectionResult, int i) {
        if (!mo24948a(connectionResult, i)) {
            Handler handler = this.f43405o;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: a */
    public final void mo24946a(rjx rjx) {
        Handler handler = this.f43405o;
        handler.sendMessage(handler.obtainMessage(7, rjx));
    }

    /* renamed from: a */
    public final void mo24947a(rmd rmd) {
        synchronized (f43393f) {
            if (this.f43403m != rmd) {
                this.f43403m = rmd;
                this.f43404n.clear();
            }
            this.f43404n.addAll(rmd.f43273a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo24948a(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        rfi rfi = this.f43399i;
        Context context = this.f43398h;
        if (!connectionResult.mo17670a()) {
            pendingIntent = rfi.mo24592c(context, connectionResult.f30065c, null);
        } else {
            pendingIntent = connectionResult.f30066d;
        }
        if (pendingIntent == null) {
            return false;
        }
        rfi.mo24588a(context, connectionResult.f30065c, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m22484a(context, pendingIntent, i, true), 134217728));
        return true;
    }
}
