package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Animation;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: num */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class num extends nij implements oor {

    /* renamed from: v */
    public static final bnsn f36518v = odk.m28481a("CAR.CAM");

    /* renamed from: w */
    static final SparseArray f36519w;

    /* renamed from: A */
    public int f36520A = 0;

    /* renamed from: B */
    protected int f36521B = 0;

    /* renamed from: C */
    public volatile boolean f36522C = false;

    /* renamed from: D */
    public Intent f36523D;

    /* renamed from: E */
    public final oos f36524E;

    /* renamed from: F */
    boolean f36525F = false;

    /* renamed from: G */
    public Bundle f36526G;

    /* renamed from: H */
    public volatile boolean f36527H = false;

    /* renamed from: I */
    public volatile boolean f36528I = false;

    /* renamed from: J */
    public boolean f36529J = false;

    /* renamed from: K */
    public final Object f36530K = new Object();

    /* renamed from: L */
    public final Queue f36531L = new ArrayDeque();

    /* renamed from: M */
    public final Queue f36532M = new ArrayDeque();

    /* renamed from: N */
    public InputFocusChangedEvent f36533N;

    /* renamed from: O */
    public final nwx f36534O;

    /* renamed from: P */
    public int f36535P;

    /* renamed from: Q */
    public Configuration f36536Q;

    /* renamed from: R */
    public Configuration f36537R;

    /* renamed from: S */
    public boolean f36538S = true;

    /* renamed from: T */
    final ServiceConnection f36539T;

    /* renamed from: U */
    public volatile nse f36540U;

    /* renamed from: V */
    private final Object f36541V = new Object();

    /* renamed from: W */
    private volatile boolean f36542W;

    /* renamed from: X */
    private boolean f36543X;

    /* renamed from: Y */
    private int f36544Y = -1;

    /* renamed from: Z */
    private int f36545Z = -1;

    /* renamed from: aa */
    private boolean f36546aa;

    /* renamed from: x */
    public final nuf f36547x;

    /* renamed from: y */
    final nuk f36548y;

    /* renamed from: z */
    public final Runnable f36549z = new nue(this);

    static {
        SparseArray sparseArray = new SparseArray();
        f36519w = sparseArray;
        sparseArray.put(-1, "INVALID");
        f36519w.put(0, "SETUP");
        f36519w.put(1, "SETUP_COMPLETE");
        f36519w.put(2, "START");
        f36519w.put(3, "START_WINDOW_READY");
        f36519w.put(4, "START_COMPLETE");
        f36519w.put(5, "STOP");
        f36519w.put(6, "STOP_COMPLETE");
        f36519w.put(7, "RESUME");
        f36519w.put(8, "RESUME_COMPLETE");
        f36519w.put(9, "VIDEO_CONFIG_CHANGE");
        f36519w.put(10, "VIDEO_CONFIG_CHANGE_COMPLETE");
        f36519w.put(11, "PAUSE");
        f36519w.put(12, "PAUSE_COMPLETE");
        f36519w.put(13, "NEW_INTENT");
        f36519w.put(14, "NEW_INTENT_COMPLETE");
        f36519w.put(15, "PRE_FINISH");
        f36519w.put(16, "FINISH");
        f36519w.put(17, "ON_CRASH");
        f36519w.put(18, "RELINQUISH_VIDEO_FOCUS");
        f36519w.put(19, "REQUEST_VIDEO_FOCUS");
        f36519w.put(20, "INPUT_FOCUS_CHANGE");
        f36519w.put(21, "INPUT_FOCUS_CHANGE_COMPLETE");
        f36519w.put(22, "START_INPUT");
        f36519w.put(23, "STOP_INPUT");
        f36519w.put(24, "ON_STOP_IME_INPUT");
        f36519w.put(25, "SET_CRASH_REPORTING_ENABLED");
        f36519w.put(26, "INPUT_EVENT");
        f36519w.put(27, "WINDOW_REATTACH");
        f36519w.put(28, "WINDOW_REATTACH_COMPLETE");
        f36519w.put(47, "BOUND_TO_CLIENT");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public num(nip nip, niv niv, ComponentName componentName, int i, oqa oqa, CarRegionId carRegionId) {
        super(nip, niv, componentName, oqa, carRegionId);
        nzl nzl = new nzl();
        m26407a(componentName);
        this.f36537R = nip.mo20836i();
        this.f36547x = new nuf(this);
        this.f36548y = new nuk(this, Looper.getMainLooper(), componentName);
        this.f36534O = new nwx(nip.mo20797a());
        bnsi d = f36518v.mo68390d();
        d.mo68432a("num", "<init>", 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Lifetime-aware CarActivityManager enabled.");
        this.f36539T = new ocd(new nul(this), nip.mo20797a(), ccsq.m131458c(), ccuz.f180014a.mo6606a().mo76865e(), ccuz.f180014a.mo6606a().mo76862b());
        ccux.m131754c();
        if (this.f35723t.mo21679c()) {
            Pair a = m27735a(nip.mo20797a(), this.f35723t.mo21671b(), nzl, componentName);
            this.f36524E = this.f35723t.mo21651a(i, this, (Animation) a.first, (Animation) a.second);
        } else {
            this.f36524E = this.f35723t.mo21650a(i, this);
        }
        if (this.f36524E == null) {
            throw null;
        }
    }

    /* renamed from: a */
    private static Pair m27735a(Context context, opo opo, nzl nzl, ComponentName componentName) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        try {
            Context createPackageContext = context.createPackageContext(componentName.getPackageName(), 0);
            try {
                Bundle bundle = createPackageContext.getPackageManager().getServiceInfo(componentName, 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", nzl.mo21868a(createPackageContext));
                } else {
                    i = nzl.mo21868a(createPackageContext);
                }
            } catch (PackageManager.NameNotFoundException e) {
                bnsi b = nzl.f37012a.mo68387b();
                b.mo68432a("nzl", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68420a("Could not get windowAnimationStyle for component %s", componentName);
                i = 0;
            }
            if (i != 0) {
                Pair a = nzl.mo21870a(createPackageContext, i);
                int intValue = ((Integer) a.first).intValue();
                int intValue2 = ((Integer) a.second).intValue();
                if (intValue != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (intValue2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2) {
                    bnsi c = f36518v.mo68388c();
                    c.mo68432a("num", "a", 368, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null.");
                    return Pair.create(null, null);
                } else if (intValue != 0) {
                    Animation a2 = opo.mo22480a(createPackageContext, intValue);
                    Animation a3 = opo.mo22480a(createPackageContext, intValue2);
                    if (a2 != null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (a3 != null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z3 == z4) {
                        z5 = true;
                    }
                    bmxy.m108601b(z5, "enterAnimation and exitAnimation need to both be null or both be non-null.");
                    return Pair.create(a2, a3);
                }
            }
            return Pair.create(null, null);
        } catch (PackageManager.NameNotFoundException e2) {
            bnsi b2 = f36518v.mo68387b();
            b2.mo68437a(e2);
            b2.mo68432a("num", "a", 353, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68420a("Failed to load window animations for componentName %s", componentName);
            return Pair.create(null, null);
        }
    }

    /* renamed from: b */
    static String m27737b(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "S_RESUMED" : "S_STOPPED" : "S_INIT" : "S_FINISHED";
    }

    /* renamed from: w */
    private final void m27738w() {
        this.f36534O.mo21770a();
        synchronized (this.f36541V) {
            if (this.f36527H) {
                this.f36527H = false;
                skh.m35531a().mo25689a(this.f35705b.mo20797a(), this.f36539T);
                nwp.m28031a(this.f36548y, this.f36549z);
            }
        }
    }

    /* renamed from: a */
    public final String mo21456a() {
        return this.f35711h;
    }

    /* renamed from: c */
    public final oos mo20776c() {
        return this.f36524E;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: num.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      num.a(android.view.InputEvent, boolean):int
      num.a(android.content.res.Configuration, int):void
      num.a(oos, android.view.KeyEvent):void
      num.a(oos, android.view.MotionEvent):void
      nij.a(android.content.res.Configuration, int):void
      nij.a(java.lang.RuntimeException, boolean):void
      oor.a(oos, android.view.KeyEvent):void
      oor.a(oos, android.view.MotionEvent):void
      num.a(boolean, boolean):void */
    /* renamed from: d */
    public final void mo21465d(oos oos) {
        m27736a(false, false);
    }

    /* renamed from: d */
    public final boolean mo20778d() {
        return this.f36521B == 0;
    }

    /* renamed from: e */
    public final void mo20779e() {
        if (this.f36521B == 0) {
            this.f36548y.mo20762d(0);
            this.f36521B = 1;
            return;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Initing initialized client ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public final void mo20780f() {
        super.mo20780f();
        this.f36548y.mo20757b();
        m27738w();
        this.f36521B = -1;
        this.f36526G = null;
        this.f36523D = null;
    }

    /* renamed from: g */
    public final synchronized void mo20781g() {
        super.mo20781g();
        this.f36548y.mo20757b();
        this.f36521B = 0;
        this.f36540U = null;
        this.f36525F = false;
        m27738w();
        this.f36528I = false;
        this.f36529J = false;
        this.f36542W = false;
        this.f36545Z = -1;
        this.f36544Y = -1;
        synchronized (this.f36530K) {
            this.f36531L.clear();
            this.f36532M.clear();
            this.f36533N = null;
        }
        this.f36546aa = false;
        this.f36536Q = null;
        this.f36538S = false;
    }

    /* renamed from: h */
    public final void mo20782h() {
        if (mo21610d("kill")) {
            try {
                nse nse = this.f36540U;
                nse.mo8530c(11, nse.mo8529bj());
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: i */
    public final void mo20783i() {
        this.f36548y.mo20762d(24);
    }

    /* renamed from: j */
    public final void mo20784j() {
        if (this.f35717n < 3) {
            bnsi c = f36518v.mo68388c();
            c.mo68432a("num", "j", 731, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Client version too low; ignoring reattach");
        } else if (this.f36524E.mo22405A()) {
            this.f36542W = true;
            this.f35723t.mo21675b(this.f36524E);
        } else {
            bnsi c2 = f36518v.mo68388c();
            c2.mo68432a("num", "j", 738, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68409a("reattachWindow called with window in state %d", this.f36524E.mo22436c());
        }
    }

    /* renamed from: k */
    public final boolean mo20785k() {
        return this.f36522C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo20786l() {
        this.f36540U = null;
        this.f36528I = false;
        this.f36525F = false;
        this.f36524E.mo22459x();
        this.f36548y.mo20748a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo20787m() {
        nuk nuk = this.f36548y;
        if (nuk == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        nuk.mo20753a(sb);
        return sb.toString();
    }

    /* renamed from: r */
    public final void mo21468r() {
        this.f36548y.mo20748a();
        RuntimeException runtimeException = null;
        this.f36540U = null;
        this.f36528I = false;
        this.f35708e = true;
        toString();
        if (!this.f35722s && !this.f36522C) {
            if (this.f35712i || this.f35718o) {
                nwp.m28031a(this.f35710g, this.f35709f);
                super.mo20791q();
            } else if (!mo20788n()) {
                this.f35705b.mo20809a(this, new nik(null));
            } else {
                boolean a = ccqu.f179773a.mo6606a().mo76658a();
                if (a) {
                    bnsi c = nij.f35704a.mo68388c();
                    c.mo68432a("nij", "r", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Binder died.");
                    if (ccql.m131267b()) {
                        this.f35705b.mo20827d().mo20858a(bpdi.CAR_SERVICE, bpdh.CAR_ACTIVITY_MANAGER_BINDER_DIED, this.f35707d.getPackageName());
                    }
                }
                if (this.f35707d.getPackageName().equals(npe.m27161b(this.f35705b.mo20797a()))) {
                    runtimeException = new RuntimeException(String.valueOf(this.f35707d.flattenToShortString()).concat(" unexpectedly disconnected"));
                }
                mo20769a(runtimeException, a);
            }
        }
    }

    /* renamed from: s */
    public final boolean mo21611s() {
        synchronized (this.f36541V) {
            if (this.f36527H) {
                return true;
            }
            Context a = this.f35705b.mo20797a();
            this.f36534O.mo21771b(this.f35707d);
            this.f36527H = skh.m35531a().mo25692a(a, "CarService", new Intent().setComponent(this.f35707d), this.f36539T, 33, false);
            if (this.f36527H) {
                nwp.m28032a(this.f36548y, this.f36549z, 5000);
            } else {
                bnsi c = f36518v.mo68388c();
                c.mo68432a("num", "s", 572, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68424a("component: %s; bindService failed %s", this.f35711h, this.f36539T);
            }
            boolean z = this.f36527H;
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo21612t() {
        return !this.f35712i && this.f36521B != -1;
    }

    public final String toString() {
        return "CarActivityManager: " + Integer.toHexString(System.identityHashCode(this)) + "\n Component: " + this.f35707d.toShortString() + "\n State: " + m27737b(this.f36521B) + "\n ProjectionClientMessageHandler: " + this.f36548y.toString() + "\n";
    }

    /* renamed from: u */
    public final int mo21614u() {
        DrawingSpec w;
        if (!mo21609c("doWindowReattach") || (w = this.f36524E.mo22458w()) == null) {
            return 3;
        }
        nse nse = this.f36540U;
        Parcel bj = nse.mo8529bj();
        dcl.m8165a(bj, w);
        nse.mo8530c(17, bj);
        return 1;
    }

    /* renamed from: v */
    public final void mo21615v() {
        this.f35723t.mo21673b(this.f36524E, this.f35720q.f35742b.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
    }

    /* renamed from: x */
    public final ComponentName mo20792x() {
        return this.f35707d;
    }

    /* renamed from: y */
    public final void mo21467y() {
    }

    /* renamed from: b */
    public final int mo20773b() {
        return this.f36524E.mo22439d();
    }

    /* renamed from: c */
    public final void mo20777c(int i) {
        if (mo21609c("onPowerStateChange") && this.f36521B != 0 && this.f35717n > 1) {
            try {
                nse nse = this.f36540U;
                Parcel bj = nse.mo8529bj();
                bj.writeInt(i);
                nse.mo8530c(16, bj);
            } catch (RemoteException e) {
                this.f36548y.mo21602a(new RuntimeException(e));
            }
        }
    }

    /* renamed from: b */
    public final int mo21608b(InputFocusChangedEvent inputFocusChangedEvent) {
        nse nse = this.f36540U;
        if (nse == null) {
            bnsi d = f36518v.mo68390d();
            d.mo68432a("num", "b", 1049, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("component: %s; Service is null, ignoring sendInputFocusChange", this.f35711h);
            return 3;
        }
        if (this.f35717n < 4) {
            boolean z = this.f36525F;
            Parcel bj = nse.mo8529bj();
            dcl.m8166a(bj, z);
            nse.mo8530c(10, bj);
        } else if (this.f35717n < 7) {
            boolean z2 = this.f36525F;
            boolean z3 = inputFocusChangedEvent.f29410b;
            Parcel bj2 = nse.mo8529bj();
            dcl.m8166a(bj2, z2);
            dcl.m8166a(bj2, !z3);
            nse.mo8530c(18, bj2);
        } else {
            Parcel bj3 = nse.mo8529bj();
            dcl.m8165a(bj3, inputFocusChangedEvent);
            nse.mo8530c(20, bj3);
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo21610d(String str) {
        if (this.f36527H && this.f36528I) {
            return true;
        }
        bnsi d = f36518v.mo68390d();
        d.mo68432a("num", "d", 858, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("component: %s; Callback not connected yet, ignoring %s", this.f35711h, str);
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(android.view.InputEvent, boolean):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* renamed from: e */
    public final void mo21466e(oos oos) {
        if (this.f36543X) {
            this.f36543X = false;
            this.f35705b.mo20820b(this);
            this.f36548y.mo20752a(2, false);
        } else if (this.f36542W) {
            this.f36542W = false;
            this.f36548y.mo21605e();
        }
    }

    /* renamed from: c */
    public final void mo21464c(oos oos) {
        if (this.f35717n >= 7) {
            nse nse = this.f36540U;
            if (nse == null) {
                bnsi d = f36518v.mo68390d();
                d.mo68432a("num", "c", 515, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("%s: service is null in onWindowAttributesChanged", this.f35711h);
                return;
            }
            try {
                CarWindowManagerLayoutParams e = oos.mo22440e();
                Parcel bj = nse.mo8529bj();
                dcl.m8165a(bj, e);
                nse.mo8530c(21, bj);
            } catch (RemoteException e2) {
                bnsi b = f36518v.mo68387b();
                b.mo68437a(e2);
                b.mo68432a("num", "c", 521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error calling onWindowAttributesChanged");
            }
        }
    }

    /* renamed from: b */
    public final void mo20774b(nil nil) {
        if (!nil.f35734c) {
            this.f35720q = nil.f35732a;
            this.f36548y.mo21599a(nil.f35732a.f35742b);
        }
    }

    /* renamed from: b */
    public final void mo21463b(oos oos) {
        nse nse = this.f36540U;
        if (nse == null) {
            bnsi d = f36518v.mo68390d();
            d.mo68432a("num", "b", 480, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("%s: service is null in onWindowRemoved", this.f35711h);
        } else {
            try {
                nse.mo8530c(14, nse.mo8529bj());
                if (this.f35717n >= 5) {
                    return;
                }
            } catch (RemoteException e) {
                bnsi b = f36518v.mo68387b();
                b.mo68437a(e);
                b.mo68432a("num", "b", 486, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error calling onWindowRemoved");
            }
        }
        this.f36524E.mo22459x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo21609c(String str) {
        if (this.f36527H && this.f36540U != null) {
            return true;
        }
        bnsi d = f36518v.mo68390d();
        d.mo68432a("num", "c", 848, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("component: %s; Service is null, ignoring %s", this.f35711h, str);
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, android.os.Message, boolean):void
     arg types: [int, android.os.Message, int]
     candidates:
      nih.a(int, int, java.lang.Throwable):void
      nih.a(int, android.os.Message, boolean):void */
    /* renamed from: a */
    private final void m27736a(boolean z, boolean z2) {
        if (this.f36529J) {
            this.f36529J = false;
            if (z) {
                nuk nuk = this.f36548y;
                nuk.mo20751a(2, Message.obtain(nuk, 3, z2 ? 1 : 0, 0), true);
                return;
            }
            this.f36548y.mo21604a(false);
        } else if (!this.f36542W) {
        } else {
            if (z) {
                this.f36548y.mo20762d(27);
            } else {
                this.f36542W = false;
            }
        }
    }

    /* renamed from: a */
    public final int mo21606a(InputEvent inputEvent, boolean z) {
        if (!mo21609c("doInputEvent")) {
            return 3;
        }
        if (!this.f36525F && z && inputEvent.isFromSource(4098) && !this.f36538S) {
            this.f36525F = true;
        }
        if (!this.f36525F) {
            return 3;
        }
        synchronized (this.f36530K) {
            if (z) {
                MotionEvent motionEvent = (MotionEvent) inputEvent;
                this.f36532M.add(motionEvent);
                nse nse = this.f36540U;
                Parcel bj = nse.mo8529bj();
                bj.writeInt(0);
                dcl.m8165a(bj, motionEvent);
                nse.mo8530c(7, bj);
            } else {
                KeyEvent keyEvent = (KeyEvent) inputEvent;
                this.f36531L.add(keyEvent);
                nse nse2 = this.f36540U;
                Parcel bj2 = nse2.mo8529bj();
                bj2.writeInt(0);
                dcl.m8165a(bj2, keyEvent);
                nse2.mo8530c(8, bj2);
            }
        }
        return 1;
    }

    num(nzl nzl, nip nip, niv niv, ComponentName componentName, int i, oqa oqa, CarRegionId carRegionId, CarWindowLayoutParams carWindowLayoutParams) {
        super(nip, niv, componentName, oqa, carRegionId);
        m26407a(componentName);
        this.f36537R = nip.mo20836i();
        this.f36547x = new nuf(this);
        this.f36548y = new nuk(this, Looper.getMainLooper(), componentName);
        this.f36534O = new nwx(nip.mo20797a());
        bnsi d = f36518v.mo68390d();
        d.mo68432a("num", "<init>", 285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Lifetime-aware CarActivityManager enabled.");
        this.f36539T = new ocd(new nul(this), nip.mo20797a(), ccsq.m131458c(), ccuz.f180014a.mo6606a().mo76865e(), ccuz.f180014a.mo6606a().mo76862b());
        ccux.m131754c();
        if (this.f35723t.mo21679c()) {
            Pair a = m27735a(nip.mo20797a(), this.f35723t.mo21671b(), nzl, componentName);
            this.f36524E = this.f35723t.mo21651a(i, this, (Animation) a.first, (Animation) a.second);
        } else {
            this.f36524E = this.f35723t.mo21650a(i, this);
        }
        if (this.f36524E == null) {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo21457a(int i) {
        if (mo21609c("onFrameRateChange") && this.f36521B == 2 && this.f35717n > 1) {
            try {
                nse nse = this.f36540U;
                Parcel bj = nse.mo8529bj();
                bj.writeInt(i);
                nse.mo8530c(15, bj);
            } catch (RemoteException e) {
                this.f36548y.mo21602a(new RuntimeException(e));
            }
        }
    }

    /* renamed from: a */
    public final void mo20766a(Configuration configuration, int i) {
        if (this.f36536Q != null) {
            int i2 = i | this.f36535P;
            this.f36535P = i2;
            int diff = i2 & this.f36537R.diff(configuration);
            this.f36535P = diff;
            if (diff == 0) {
                this.f36536Q = null;
            } else {
                this.f36536Q = configuration;
            }
        } else {
            this.f36536Q = configuration;
            this.f36535P = i;
            this.f36548y.mo20762d(9);
        }
    }

    /* renamed from: a */
    public final void mo21458a(InputFocusChangedEvent inputFocusChangedEvent) {
        this.f36548y.mo21601a(inputFocusChangedEvent);
    }

    /* renamed from: a */
    public final void mo20767a(PrintWriter printWriter) {
        printWriter.print("State=");
        printWriter.print(m27737b(this.f36521B));
        Intent intent = this.f36523D;
        printWriter.print(" mCurrentIntent=");
        if (intent != null) {
            printWriter.print(intent.toString());
        } else {
            printWriter.print("null");
        }
        printWriter.print(" mHasFocus=");
        printWriter.print(this.f36525F);
        printWriter.print(" mWindow=");
        printWriter.println(Integer.toHexString(System.identityHashCode(this.f36524E)));
    }

    /* renamed from: a */
    public final void mo20770a(String str) {
        nuk nuk = this.f36548y;
        nuu.m27795b(nuk.getLooper(), new nuj(nuk, str));
    }

    /* renamed from: a */
    public final void mo20771a(nij nij) {
        super.mo20771a(nij);
        if (this.f36521B != 2) {
            bnsi d = f36518v.mo68390d();
            d.mo68432a("num", "a", 677, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Spurious stop for %s", nij);
            return;
        }
        this.f36548y.mo20762d(11);
        this.f36548y.mo21601a(new InputFocusChangedEvent(false, true, -1, null));
        this.f36548y.mo20762d(5);
        this.f36521B = 1;
    }

    /* renamed from: a */
    public final void mo20772a(nil nil) {
        nin nin = this.f35720q;
        super.mo20772a(nil);
        boolean z = true;
        if (this.f36521B == 1) {
            if (nin != null) {
                if (nin.f35742b == nil.f35732a.f35742b || nil.f35734c) {
                    z = false;
                }
                this.f36546aa = z;
            } else {
                this.f36523D = nil.f35732a.f35742b;
            }
            this.f36548y.mo20762d(2);
            this.f36521B = 2;
            return;
        }
        bnsi d = f36518v.mo68390d();
        d.mo68432a("num", "a", 663, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Spurious resume for %s", this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(android.view.InputEvent, boolean):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean):void
     arg types: [oos, int]
     candidates:
      oqa.a(int, oor):oos
      oqa.a(oos, int):void
      oqa.a(oos, android.view.animation.Animation):void
      oqa.a(oos, android.view.KeyEvent):boolean
      oef.a(int, boolean):void
      oqa.a(oos, boolean):void */
    /* renamed from: a */
    public final void mo21459a(oos oos) {
        if (this.f36543X) {
            this.f36543X = false;
            this.f36548y.mo20752a(2, true);
        } else if (this.f36542W) {
            this.f35723t.mo21665a(this.f36524E, false);
            this.f36542W = false;
            this.f36548y.mo21605e();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: num.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      num.a(android.view.InputEvent, boolean):int
      num.a(android.content.res.Configuration, int):void
      num.a(oos, android.view.KeyEvent):void
      num.a(oos, android.view.MotionEvent):void
      nij.a(android.content.res.Configuration, int):void
      nij.a(java.lang.RuntimeException, boolean):void
      oor.a(oos, android.view.KeyEvent):void
      oor.a(oos, android.view.MotionEvent):void
      num.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo21460a(oos oos, int i, int i2) {
        int i3;
        toString();
        int i4 = this.f36545Z;
        boolean z = false;
        if (!(i4 == -1 || (i3 = this.f36544Y) == -1 || (i4 == i2 && i3 == i))) {
            z = true;
        }
        this.f36545Z = i2;
        this.f36544Y = i;
        m27736a(true, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nuk.a(android.view.InputEvent, boolean):void
     arg types: [android.view.KeyEvent, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(int, boolean):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nuk.a(android.view.InputEvent, boolean):void */
    /* renamed from: a */
    public final void mo21461a(oos oos, KeyEvent keyEvent) {
        this.f36548y.mo21600a((InputEvent) keyEvent, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nuk.a(android.view.InputEvent, boolean):void
     arg types: [android.view.MotionEvent, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(int, boolean):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nuk.a(android.view.InputEvent, boolean):void */
    /* renamed from: a */
    public final void mo21462a(oos oos, MotionEvent motionEvent) {
        this.f36548y.mo21600a((InputEvent) motionEvent, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo21607a(boolean z) {
        if (z && this.f36521B == 2) {
            this.f36543X = true;
            this.f35705b.mo20808a(this);
            if (this.f36524E.mo22439d() == 1) {
                this.f35723t.mo21662a(this.f36524E, this.f35720q.f35742b.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
            }
            boolean z2 = this.f36546aa;
            this.f36546aa = false;
            if (z2) {
                this.f36548y.mo21599a(this.f35720q.f35742b);
            }
            this.f36548y.mo20762d(7);
            return true;
        }
        bnsi c = f36518v.mo68388c();
        c.mo68432a("num", "a", 937, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("component: %s; Start complete but state is not resumed", this.f35711h);
        this.f35705b.mo20820b(this);
        return false;
    }
}
