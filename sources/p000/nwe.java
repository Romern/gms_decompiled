package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.SingleDisplayCarActivityManagerService$3;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: nwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwe extends nip {

    /* renamed from: H */
    private static final ComponentName f36729H = new ComponentName("com.google.android.car.mockup", "com.google.android.car.mockup.MockupService");

    /* renamed from: I */
    private static final ComponentName f36730I = new ComponentName("com.google.androidux.boomcar", "com.google.androidux.boom.CarService");

    /* renamed from: e */
    static final Map f36731e = new HashMap();

    /* renamed from: u */
    public static final /* synthetic */ int f36732u = 0;

    /* renamed from: A */
    private final ComponentName f36733A;

    /* renamed from: B */
    private final ComponentName f36734B;

    /* renamed from: C */
    private final ComponentName f36735C;

    /* renamed from: D */
    private final ComponentName f36736D;

    /* renamed from: E */
    private final ComponentName f36737E;

    /* renamed from: F */
    private final ComponentName f36738F;

    /* renamed from: G */
    private ComponentName f36739G;

    /* renamed from: J */
    private final ComponentName f36740J;

    /* renamed from: K */
    private final nio f36741K;

    /* renamed from: L */
    private final nlm f36742L;

    /* renamed from: M */
    private final olo f36743M;

    /* renamed from: N */
    private final oei f36744N;

    /* renamed from: O */
    private final olr f36745O;

    /* renamed from: P */
    private final npd f36746P;

    /* renamed from: Q */
    private final olt f36747Q;

    /* renamed from: R */
    private final nqu f36748R;

    /* renamed from: S */
    private final nri f36749S;

    /* renamed from: T */
    private final nia f36750T;

    /* renamed from: U */
    private final oeh f36751U;

    /* renamed from: V */
    private final bmzi f36752V;

    /* renamed from: W */
    private final nug f36753W;

    /* renamed from: X */
    private final nqm f36754X;

    /* renamed from: Y */
    private final SparseArray f36755Y = new SparseArray();

    /* renamed from: Z */
    private boolean f36756Z;

    /* renamed from: aa */
    private final boolean f36757aa;

    /* renamed from: ab */
    private boolean f36758ab;

    /* renamed from: ac */
    private ComponentName f36759ac;

    /* renamed from: ad */
    private final ComponentName f36760ad;

    /* renamed from: ae */
    private nvx f36761ae;

    /* renamed from: af */
    private boolean f36762af;

    /* renamed from: ag */
    private boolean f36763ag;

    /* renamed from: ah */
    private final Set f36764ah;

    /* renamed from: ai */
    private final Handler f36765ai;

    /* renamed from: aj */
    private int f36766aj;

    /* renamed from: ak */
    private Queue f36767ak;

    /* renamed from: al */
    private int f36768al;

    /* renamed from: am */
    private Map f36769am;

    /* renamed from: an */
    private final Runnable f36770an;

    /* renamed from: ao */
    private final List f36771ao;

    /* renamed from: ap */
    private List f36772ap;

    /* renamed from: aq */
    private final Set f36773aq;

    /* renamed from: ar */
    private final List f36774ar;

    /* renamed from: as */
    private int f36775as;

    /* renamed from: at */
    private final boolean f36776at;

    /* renamed from: au */
    private ComponentName f36777au;

    /* renamed from: av */
    private ComponentName f36778av;

    /* renamed from: d */
    public final ComponentName f36779d;

    /* renamed from: f */
    public final Context f36780f;

    /* renamed from: g */
    public final niw f36781g;

    /* renamed from: h */
    public final oqa f36782h;

    /* renamed from: i */
    public final bnkd f36783i = bndu.m109109r();

    /* renamed from: j */
    public final C1223np f36784j = new C1223np();

    /* renamed from: k */
    public final SparseArray f36785k = new SparseArray();

    /* renamed from: l */
    final nwd f36786l;

    /* renamed from: m */
    public final Semaphore f36787m = new Semaphore(0);

    /* renamed from: n */
    public nij f36788n;

    /* renamed from: o */
    public volatile boolean f36789o;

    /* renamed from: p */
    public ComponentName f36790p;

    /* renamed from: q */
    public nln f36791q;

    /* renamed from: r */
    public final Handler f36792r;

    /* renamed from: s */
    final HandlerThread f36793s;

    /* renamed from: t */
    public ComponentName f36794t;

    /* renamed from: v */
    private final String f36795v;

    /* renamed from: w */
    private final ComponentName f36796w;

    /* renamed from: x */
    private final ComponentName f36797x;

    /* renamed from: y */
    private final ComponentName f36798y;

    /* renamed from: z */
    private final ComponentName f36799z;

    public nwe(nio nio, Context context, niw niw, nlm nlm, olo olo, oei oei, olr olr, npa npa, npd npd, olt olt, nqu nqu, nri nri, nia nia, oeh oeh, oqa oqa, bmzi bmzi, nug nug, nqm nqm, boolean z, nmi nmi) {
        nln nln;
        npd npd2 = npd;
        ComponentName componentName = null;
        this.f36790p = null;
        this.f36762af = false;
        this.f36764ah = new HashSet();
        this.f36765ai = new adzt(Looper.getMainLooper());
        this.f36766aj = 0;
        this.f36770an = new nvz(this);
        this.f36771ao = new ArrayList();
        this.f36773aq = new HashSet();
        this.f36793s = new HandlerThread("WaitForStopThenStartClient", -2);
        this.f36774ar = new ArrayList();
        this.f36775as = -1;
        this.f36741K = nio;
        this.f36780f = context;
        this.f36781g = niw;
        this.f36742L = nlm;
        this.f36743M = olo;
        this.f36744N = oei;
        this.f36745O = olr;
        this.f36746P = npd2;
        this.f36747Q = olt;
        this.f36748R = nqu;
        if (ccto.m131545b()) {
            this.f36749S = null;
            this.f36750T = nia;
        } else {
            this.f36749S = nri;
            this.f36750T = null;
        }
        this.f36751U = oeh;
        this.f36753W = nug;
        this.f36754X = nqm;
        this.f36776at = z;
        this.f36752V = bmzi;
        this.f36782h = oqa;
        this.f36795v = npe.m27161b(context);
        nip.f35748a.setPackage(this.f36795v);
        this.f36779d = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.rail.RailService");
        this.f36796w = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.notifications.NotificationService");
        this.f36797x = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.demand.DemandActivityService");
        this.f36799z = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.setup.TutorialService");
        this.f36733A = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.input.RotaryImeService");
        this.f36734B = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.input.RotaryInputMethodService");
        this.f36735C = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.input.CarScreenKeyboardService");
        this.f36736D = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.input.TouchInputMethodService");
        this.f36798y = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.media.MediaService");
        this.f36737E = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.telecom.TelecomService");
        this.f36738F = new ComponentName(this.f36795v, "com.google.android.projection.gearhead.stream.StreamService");
        f36731e.put(this.f36779d, 2);
        f36731e.put(this.f36796w, 7);
        f36731e.put(this.f36799z, 3);
        f36731e.put(f36729H, 3);
        f36731e.put(f36730I, 3);
        if (ccps.f179712a.mo6606a().mo76609c()) {
            ComponentName componentName2 = new ComponentName(this.f36795v, "com.google.android.apps.auto.components.frx.car.CakewalkCarActivityService");
            this.f36739G = componentName2;
            f36731e.put(componentName2, 3);
        }
        f36731e.put(this.f36797x, 6);
        this.f36757aa = m27953a(this.f36744N, this.f36743M.mo21346p(), this.f36743M.mo21349s(), nip.f35748a);
        String a = npa.mo21372a("gmm_package_name");
        if (!TextUtils.isEmpty(a)) {
            this.f36740J = new ComponentName(a, "com.google.android.apps.gmm.car.GmmCarProjectionService");
        } else {
            this.f36740J = null;
        }
        nwd nwd = new nwd(this);
        this.f36786l = nwd;
        nwd.start();
        this.f36793s.start();
        this.f36792r = new nvt(null, this.f36793s.getLooper());
        this.f36789o = true;
        if ("Demo".equals(npd2.f36296c.getString("car_app_mode", "Release"))) {
            f36731e.remove(f36729H);
        }
        if (this.f36747Q.mo21350t() == 0 && this.f36741K.mo20796b() != null) {
            componentName = this.f36741K.mo20796b();
        } else if (this.f36757aa) {
            if (this.f36743M.mo21349s().f29370b) {
                if (ccuf.m131596g() && m27959e(this.f36736D)) {
                    this.f36758ab = true;
                    componentName = this.f36736D;
                } else {
                    componentName = this.f36735C;
                }
            } else if (ccuf.m131596g() && m27959e(this.f36734B)) {
                this.f36758ab = true;
                componentName = this.f36734B;
            } else {
                componentName = this.f36733A;
            }
        }
        this.f36760ad = componentName;
        if (componentName != null) {
            f36731e.put(componentName, 5);
            if (this.f36758ab) {
                nln = new nlq(this.f36780f, this.f36760ad, skh.m35531a(), this.f36742L.mo21044d().mo21070a());
            } else {
                nln = new ntn(this, this.f36760ad, skh.m35531a(), this.f36742L.mo21044d().mo21070a());
            }
            this.f36791q = nln;
        }
        if (nmi.mo21151b()) {
            nvx nvx = new nvx(nmi, this.f36742L.mo21046f());
            this.f36761ae = nvx;
            nvx.mo21729a();
        }
    }

    /* renamed from: a */
    private final void m27946a(biro biro) {
        ComponentName componentName = null;
        if (this.f36741K.mo20795a() != null) {
            componentName = this.f36741K.mo20795a();
            bnsi d = nip.f35749b.mo68390d();
            d.mo68432a("nwe", "a", 979, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Using app key override %s", componentName);
        } else {
            int i = biro.f121436b;
            if (i != 3) {
                if (i != 209) {
                    if (i != 65540) {
                        switch (i) {
                            case 65538:
                                ComponentName componentName2 = this.f36740J;
                                if (componentName2 != null) {
                                    componentName = componentName2;
                                    break;
                                }
                                break;
                        }
                    } else {
                        componentName = this.f36737E;
                    }
                }
                componentName = this.f36798y;
            } else {
                componentName = ccpp.f179704a.mo6606a().mo76604e() ? this.f36794t : this.f36738F;
            }
        }
        if (!ccpp.m131165c()) {
            if (this.f36778av != null) {
                this.f36778av = componentName;
            } else if (componentName != null) {
                mo21744d(componentName);
            }
        } else if (componentName != null) {
            mo21744d(componentName);
        }
    }

    /* renamed from: b */
    private final synchronized void m27954b(Intent intent, Bundle bundle, int i) {
        m27950a(intent, bundle, this, null, i, true);
    }

    /* renamed from: c */
    private final void m27956c(Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (nqv nqv : this.f36764ah) {
            try {
                nqv.mo21470a(intent);
            } catch (RemoteException e) {
                bnsi c = nip.f35749b.mo68388c();
                c.mo68437a(e);
                c.mo68432a("nwe", "c", 1336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Error calling onActivityStarted with intent: %s. Listener will be removed.", intent);
                arrayList.add(nqv);
            }
        }
        this.f36764ah.removeAll(arrayList);
    }

    /* renamed from: d */
    private final synchronized void m27957d(Intent intent) {
        m27954b(intent, null, 1);
    }

    /* renamed from: e */
    private final boolean m27959e(ComponentName componentName) {
        Intent intent = new Intent("com.google.android.gms.car.BIND_CAR_INPUT");
        intent.setComponent(componentName);
        return m27953a(this.f36744N, this.f36743M.mo21346p(), this.f36743M.mo21349s(), intent);
    }

    /* renamed from: h */
    private final void m27960h(nij nij) {
        m27951a(new Intent().setComponent(nij.f35707d).addFlags(1048576), this, nij.f35706c, nij.mo20773b(), false);
    }

    /* renamed from: i */
    private final void m27961i(nij nij) {
        nij b = nij.f35706c.mo20846b();
        Intent component = new Intent().setComponent(b.f35720q.f35741a);
        nin nin = b.f35720q;
        Intent intent = nin.f35742b;
        Bundle bundle = nin.f35743c;
        if (!m27955b(nij.f35706c)) {
            component = intent;
        } else if (!intent.filterEquals(component) || intent.getExtras() != null) {
            bundle = null;
        } else if (nij.mo20773b() == 1) {
            ComponentName componentName = b.f35707d;
            b.f35706c.mo20847c();
            m27948a("crashloop");
            return;
        } else {
            bnsi c = nip.f35749b.mo68388c();
            c.mo68432a("nwe", "i", 1540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Crashloop detected in non-content layer");
            bundle = null;
        }
        component.setComponent(b.f35720q.f35741a);
        if (b.mo20773b() != 1) {
            b.mo20781g();
        } else {
            b.f35706c.mo20847c();
        }
        m27954b(component, bundle, b.mo20773b());
    }

    /* renamed from: j */
    private final void m27962j(nij nij) {
        nij.f35706c.mo20847c();
        bnsi d = nip.f35749b.mo68390d();
        d.mo68432a("nwe", "j", 1587, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Default component crash #%d", this.f36768al);
        int i = this.f36768al;
        if (i > 7) {
            this.f36759ac = new ComponentName(this.f36780f, nqo.class);
            mo21742a(new ArrayList(), new Intent().setComponent(this.f36759ac), this);
            return;
        }
        long j = ((long) (i - 2)) * 2500;
        if (j < 0) {
            j = 0;
        }
        this.f36765ai.postDelayed(this.f36770an, j);
    }

    /* renamed from: k */
    private final void m27963k(nij nij) {
        if (nij == this.f36788n) {
            this.f36788n = null;
            nwp.m28033a(this.f36787m);
        }
    }

    /* renamed from: p */
    private final void m27964p() {
        if (!this.f36771ao.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            List list = this.f36771ao;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list.get(i);
                if (((Long) pair.first).longValue() + 2500 >= elapsedRealtime || this.f36741K.mo20795a() != null) {
                    m27946a((biro) pair.second);
                } else {
                    int i2 = ((biro) pair.second).f121436b;
                }
            }
            this.f36771ao.clear();
        }
    }

    /* renamed from: q */
    private final boolean m27965q() {
        nij nij = (nij) this.f36785k.get(3);
        return nij != null && nij.f35707d.equals(this.f36799z) && nij.mo20788n();
    }

    /* renamed from: a */
    public final Context mo20797a() {
        return this.f36780f;
    }

    /* renamed from: c */
    public final oqa mo20823c() {
        return this.f36782h;
    }

    /* renamed from: d */
    public final niw mo20827d() {
        return this.f36781g;
    }

    /* renamed from: e */
    public final olo mo20829e() {
        return this.f36743M;
    }

    /* renamed from: f */
    public final npd mo20831f() {
        return this.f36746P;
    }

    /* renamed from: g */
    public final olt mo20833g() {
        return this.f36747Q;
    }

    /* renamed from: h */
    public final nqu mo20835h() {
        return this.f36748R;
    }

    /* renamed from: l */
    public final synchronized void mo20839l() {
        if (this.f36789o) {
            if (!this.f36762af) {
                m27964p();
            }
            if (!this.f36762af) {
                this.f36762af = true;
            }
            if (this.f36756Z) {
                nij nij = null;
                for (nij nij2 : this.f36783i.mo67317p()) {
                    if (nij2.mo20788n()) {
                        if (nij2.mo20773b() != this.f36775as) {
                            nij2.mo20784j();
                        } else {
                            nij = nij2;
                        }
                    }
                }
                if (nij != null) {
                    nij.mo20784j();
                }
            } else {
                nln nln = this.f36791q;
                if (nln != null) {
                    nln.mo21050a(true);
                }
                niv niv = (niv) this.f36784j.get(this.f36797x);
                if (niv != null && niv.mo20844a().mo20788n()) {
                    niv.mo20844a().mo20784j();
                }
                nij nij3 = null;
                for (nij nij4 : this.f36773aq) {
                    if (nij4 != null && (!nij4.f35707d.equals(this.f36760ad) || this.f36791q.mo21052b())) {
                        if (this.f36775as != -1) {
                            if (mo21743b(nij4.f35720q.f35742b) == this.f36775as) {
                                nij3 = nij4;
                            }
                        }
                        m27960h(nij4);
                    }
                }
                if (nij3 != null) {
                    m27960h(nij3);
                }
            }
            if (this.f36778av != null) {
                if (this.f36755Y.size() == 0) {
                    mo21744d(this.f36778av);
                }
                this.f36778av = null;
            }
            int size = this.f36755Y.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f36755Y.keyAt(i);
                for (nin nin : (List) this.f36755Y.valueAt(i)) {
                    m27951a(nin.f35742b, nin.f35744d, nin.f35746f, keyAt, false);
                }
            }
            this.f36755Y.clear();
            m27964p();
        }
    }

    /* renamed from: m */
    public final void mo20840m() {
        this.f36782h.mo21688g();
    }

    /* renamed from: n */
    public final void mo20841n() {
        this.f36782h.mo21686f();
    }

    /* renamed from: o */
    public final void mo21745o() {
        try {
            if (!nwp.m28037b(this.f36787m)) {
                bnsi c = nip.f35749b.mo68388c();
                c.mo68432a("nwe", "o", 2491, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Timeout waiting for previous client to stop!");
            }
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: b */
    private final boolean m27955b(niv niv) {
        return ((Integer) ((Pair) this.f36769am.get(niv.f35779d)).second).intValue() >= 4;
    }

    /* renamed from: d */
    private final boolean m27958d(int i) {
        this.f36781g.mo20862b(i);
        bnsi d = nip.f35749b.mo68390d();
        d.mo68432a("nwe", "d", 2053, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        String a = bpef.m111826a(i);
        if (i != 0) {
            d.mo68420a("Starting assistant %s", a);
            return true;
        }
        throw null;
    }

    /* renamed from: f */
    public final void mo20832f(nij nij) {
        this.f36783i.mo67310c(nij.f35707d, nij);
        int b = nij.mo20773b();
        if (this.f36785k.get(b) == nij) {
            this.f36785k.delete(b);
        }
    }

    /* renamed from: g */
    public final void mo20834g(nij nij) {
        nln nln = this.f36791q;
        if (nln == null) {
            bnsi b = nip.f35749b.mo68387b();
            b.mo68432a("nwe", "g", 1675, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("No ImeManager; can't stop input");
            return;
        }
        nln.mo21048a(nij);
    }

    /* renamed from: k */
    public final int mo20838k() {
        return this.f36782h.mo21703p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21743b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (!ccoy.m131100c() || intent == null || !intent.getBooleanExtra("assistant_activity", false)) {
            if (intent != null && nip.f35748a.getAction().equals(intent.getAction()) && nip.f35748a.getPackage().equals(intent.getPackage()) && intent.getCategories() != null && intent.getCategories().containsAll(nip.f35748a.getCategories())) {
                return 3;
            }
            if (!f36731e.containsKey(component)) {
                return 1;
            }
            return ((Integer) f36731e.get(component)).intValue();
        } else if (cctl.m131524b()) {
            bnsi d = nip.f35749b.mo68390d();
            d.mo68432a("nwe", "b", 2518, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Placing activity in system ui layer");
            return 4;
        } else {
            bnsi d2 = nip.f35749b.mo68390d();
            d2.mo68432a("nwe", "b", 2521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Placing activity in assistant layer");
            return 6;
        }
    }

    /* renamed from: d */
    public final void mo21744d(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        if (!this.f36762af) {
            this.f36774ar.add(intent);
        } else {
            m27957d(intent);
        }
    }

    /* renamed from: e */
    public final void mo20830e(nij nij) {
        this.f36786l.mo21740a(nij);
        if (nij.mo20773b() != 1) {
            this.f36782h.mo21687f(nij.mo20776c());
        }
        m27963k(nij);
        nln nln = this.f36791q;
        if (nln != null) {
            nln.mo21051b(nij);
            if (nij.f35707d.equals(this.f36760ad)) {
                this.f36791q.mo21054d();
            }
        }
    }

    /* renamed from: j */
    public final int mo20837j() {
        return (char) this.f36751U.mo22054d();
    }

    /* renamed from: a */
    private final void m27947a(biro biro, int i, int i2) {
        KeyEvent a = nlv.m26757a(biro, i, i2);
        Intent intent = new Intent("android.intent.action.projected.KEY_EVENT");
        intent.setPackage(this.f36795v);
        intent.putExtra("android.intent.extra.KEY_EVENT", a);
        this.f36780f.sendBroadcast(intent);
    }

    /* renamed from: c */
    public final synchronized void mo20824c(ComponentName componentName) {
        componentName.getClassName();
        Iterator it = this.f36783i.mo67124a(componentName).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            nij nij = (nij) it.next();
            if (nij.mo20788n()) {
                nij.mo20771a((nij) null);
                break;
            }
        }
    }

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
    /* renamed from: c */
    public final void mo20825c(nij nij) {
        nln nln;
        if (this.f36789o) {
            if (!this.f36763ag && nij.mo20773b() == 1) {
                this.f36763ag = true;
                if (this.f36772ap != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    List list = this.f36772ap;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        nim nim = (nim) list.get(i);
                        if (nim.f35737a + 2500 > elapsedRealtime) {
                            mo20804a(CarDisplayId.f29492a, nim.f35738b, nim.f35739c, nim.f35740d);
                        }
                    }
                }
            }
            int b = nij.mo20773b();
            nij nij2 = (nij) this.f36785k.get(b);
            this.f36785k.put(b, nij);
            this.f36786l.mo21740a(nij);
            if (!(nij instanceof nqo)) {
                m27956c(nij.f35720q.f35742b);
            }
            if (nij.mo20773b() != 1) {
                this.f36782h.mo21665a(nij.mo20776c(), true);
            }
            if (this.f36782h.mo21693i()) {
                this.f36773aq.remove(nij);
            }
            if (nij.f35707d.equals(this.f36760ad) && (nln = this.f36791q) != null) {
                nln.mo21053c();
            }
            if (nij.f35707d.equals(this.f36794t)) {
                this.f36768al = 0;
                return;
            }
            return;
        }
        nij.mo20780f();
    }

    /* renamed from: d */
    public final void mo20828d(nij nij) {
        m27956c(nij.f35720q.f35742b);
    }

    /* renamed from: a */
    private final void m27948a(String str) {
        bnsi c = nip.f35749b.mo68388c();
        c.mo68432a("nwe", "a", 1612, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("fallbackToDefaultComponent(). Reason: %s", str);
        niv niv = (niv) this.f36784j.get(this.f36794t);
        if (niv == null || niv.mo20844a() == null) {
            mo21744d(this.f36794t);
            return;
        }
        nij a = niv.mo20844a();
        niv.mo20844a().mo20772a(new nil(a.f35720q, a, true));
    }

    /* renamed from: b */
    public final ComponentName mo20817b(int i) {
        synchronized (this.f36783i) {
            ComponentName componentName = null;
            for (nij nij : this.f36783i.mo67317p()) {
                if (nij.f35713j == i) {
                    if (nij.mo20788n()) {
                        ComponentName x = nij.mo20792x();
                        return x;
                    } else if (componentName == null) {
                        componentName = nij.mo20792x();
                    }
                }
            }
            return componentName;
        }
    }

    /* renamed from: i */
    public final Configuration mo20836i() {
        return (Configuration) this.f36752V.mo6606a();
    }

    /* renamed from: a */
    private final void m27949a(nij nij, nik nik, boolean z) {
        bnsi d = nip.f35749b.mo68390d();
        d.mo68432a("nwe", "a", 1444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Crashed ActivityManager: %s", nij);
        if (nik.f35731b != null) {
            bnsi d2 = nip.f35749b.mo68390d();
            d2.mo68437a(nik.f35731b);
            d2.mo68432a("nwe", "a", 1446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("FATAL onActivityManagerCrash called. Message: %s", nik.f35731b.getMessage());
        }
        bnsi d3 = nip.f35749b.mo68390d();
        d3.mo68404a(bnsk.MEDIUM);
        d3.mo68432a("nwe", "a", 1449, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68405a("onActivityManagerCrash called from: ");
        if (!this.f36776at) {
            if (this.f36767ak == null) {
                this.f36767ak = new ArrayDeque();
            }
            this.f36766aj++;
            this.f36767ak.add(nik);
            if (this.f36766aj > 5) {
                this.f36767ak.remove();
            }
            ComponentName componentName = nij.f35706c.f35779d;
            if (componentName.equals(this.f36794t)) {
                this.f36768al++;
            }
            if (this.f36769am == null) {
                this.f36769am = new HashMap();
            }
            Pair pair = (Pair) this.f36769am.get(componentName);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (pair == null || elapsedRealtime - ((Long) pair.first).longValue() > 30000) {
                this.f36769am.put(componentName, new Pair(Long.valueOf(elapsedRealtime), 1));
            } else {
                this.f36769am.put(componentName, new Pair(Long.valueOf(elapsedRealtime), Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            }
            boolean z2 = nij.mo20788n() || this.f36773aq.remove(nij);
            if (this.f36789o) {
                ComponentName componentName2 = nij.f35707d;
                int intValue = f36731e.containsKey(componentName2) ? ((Integer) f36731e.get(componentName2)).intValue() : 1;
                if (z) {
                    if (componentName2.equals(this.f36794t)) {
                        m27962j(nij);
                    } else if (intValue == 1) {
                        nij.f35706c.mo20847c();
                        m27948a("Crash");
                    } else if (intValue == 2 || intValue == 7) {
                        nij.mo20781g();
                        nin nin = nij.f35720q;
                        m27954b(nin.f35742b, nin.f35743c, nij.mo20773b());
                    }
                } else if (!z2 || intValue == 5) {
                    nij.f35706c.mo20847c();
                } else if (!componentName2.equals(this.f36794t)) {
                    nij b = nij.f35706c.mo20846b();
                    Intent component = new Intent().setComponent(b.f35720q.f35741a);
                    nin nin2 = b.f35720q;
                    Intent intent = nin2.f35742b;
                    Bundle bundle = nin2.f35743c;
                    if (!m27955b(nij.f35706c)) {
                        component = intent;
                    } else if (!intent.filterEquals(component) || intent.getExtras() != null) {
                        bundle = null;
                    } else if (nij.mo20773b() == 1) {
                        ComponentName componentName3 = b.f35707d;
                        b.f35706c.mo20847c();
                        m27948a("crashloop");
                        return;
                    } else {
                        bnsi c = nip.f35749b.mo68388c();
                        c.mo68432a("nwe", "i", 1540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Crashloop detected in non-content layer");
                        bundle = null;
                    }
                    component.setComponent(b.f35720q.f35741a);
                    if (b.mo20773b() != 1) {
                        b.mo20781g();
                    } else {
                        b.f35706c.mo20847c();
                    }
                    m27954b(component, bundle, b.mo20773b());
                } else {
                    m27962j(nij);
                }
            }
        } else {
            throw ((RuntimeException) ooe.m29303a(nik.f35731b).mo22382a((bmzi) new nvy(nij)));
        }
    }

    /* renamed from: b */
    public final synchronized void mo20818b() {
        this.f36789o = false;
        nvx nvx = this.f36761ae;
        if (nvx != null) {
            nvx.mo21732b();
            this.f36761ae = null;
        }
        synchronized (this.f36783i) {
            Iterator it = new ArrayList(this.f36783i.mo67317p()).iterator();
            while (it.hasNext()) {
                ((nij) it.next()).mo20780f();
            }
            this.f36783i.mo67270d();
        }
        this.f36765ai.removeCallbacks(this.f36770an);
        nln nln = this.f36791q;
        if (nln != null) {
            nln.mo21047a();
        }
        nwd nwd = this.f36786l;
        nwd.f36724e = false;
        synchronized (nwd.f36723d) {
            nwd.f36725f = null;
        }
        nwd.interrupt();
        this.f36793s.quit();
    }

    /* renamed from: c */
    public final synchronized boolean mo20826c(int i) {
        synchronized (this.f36783i) {
            for (nij nij : this.f36783i.mo67317p()) {
                if (nij.f35713j == i && nij.f35707d.equals(this.f36790p)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized void mo20819b(MotionEvent motionEvent) {
        if (this.f36789o) {
            nvx nvx = this.f36761ae;
            if (nvx != null) {
                nvx.mo21733c();
            }
            this.f36782h.mo21672b(motionEvent);
        }
    }

    /* renamed from: b */
    public final void mo20820b(nij nij) {
        nij.f35707d.getShortClassName();
        this.f36786l.mo21740a(nij);
        nij.mo20771a((nij) null);
    }

    /* renamed from: b */
    public final void mo20821b(nqv nqv) {
        this.f36764ah.remove(nqv);
    }

    /* renamed from: b */
    public final boolean mo20822b(ComponentName componentName) {
        return componentName != null && componentName.equals(this.f36740J);
    }

    /* renamed from: a */
    private final boolean m27950a(Intent intent, Bundle bundle, niu niu, niv niv, int i, boolean z) {
        return m27952a(this.f36744N.mo22060b(this.f36743M.mo21346p(), this.f36743M.mo21349s(), intent), intent, bundle, niu, niv, i, z, 1);
    }

    /* renamed from: a */
    private final boolean m27951a(Intent intent, niu niu, niv niv, int i, boolean z) {
        return m27950a(intent, null, niu, niv, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return false;
     */
    /* renamed from: a */
    private final synchronized boolean m27952a(List list, Intent intent, Bundle bundle, niu niu, niv niv, int i, boolean z, int i2) {
        nug nug;
        ComponentName componentName;
        nij nij;
        String str;
        int i3 = i;
        int i4 = i2;
        synchronized (this) {
            if (!this.f36789o) {
                return false;
            }
            if (!list.isEmpty()) {
                nug nug2 = this.f36753W;
                ServiceInfo serviceInfo = ((ResolveInfo) list.get(0)).serviceInfo;
                nug = nug2;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                ComponentName componentName2 = this.f36759ac;
                if (componentName2 != null) {
                    if (componentName2.equals(intent.getComponent())) {
                        nug = this.f36754X;
                        componentName = this.f36759ac;
                    }
                }
                ComponentName component = intent.getComponent();
                bnsi d = nip.f35749b.mo68390d();
                d.mo68432a("nwe", "a", 1877, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                if (component == null) {
                    str = "null";
                } else {
                    str = component.getShortClassName();
                }
                d.mo68420a("No matching Projection Clients found for %s", str);
                if (this.f36785k.get(2) == null) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    this.f36780f.registerReceiver(new SingleDisplayCarActivityManagerService$3(this, "car"), intentFilter);
                }
            }
            if (this.f36797x.equals(componentName)) {
                this.f36781g.mo20862b(i4);
                bnsi d2 = nip.f35749b.mo68390d();
                d2.mo68432a("nwe", "d", 2053, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String a = bpef.m111826a(i2);
                if (i4 != 0) {
                    d2.mo68420a("Starting assistant %s", a);
                } else {
                    throw null;
                }
            }
            if (!ccoy.m131100c()) {
                if (z) {
                    nij = (nij) this.f36785k.get(6);
                } else {
                    nij = null;
                }
                if (!(nij == null || !nij.mo20788n() || i3 == 7)) {
                    nij.mo20771a((nij) null);
                    if (this.f36797x.equals(componentName)) {
                        return true;
                    }
                }
            }
            intent.setComponent(componentName);
            if (componentName.equals(this.f36796w)) {
                if (m27965q()) {
                    bnsi d3 = nip.f35749b.mo68390d();
                    d3.mo68432a("nwe", "a", 1932, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68405a("Notification while tutorial is running, ignoring.");
                    return false;
                }
            }
            if (i3 == 1) {
                this.f36765ai.removeCallbacks(this.f36770an);
            }
            Parcelable.Creator creator = CarRegionId.CREATOR;
            nin nin = new nin(componentName, intent, bundle, niu, nug, niv);
            nwd nwd = this.f36786l;
            synchronized (nwd.f36723d) {
                nwc nwc = (nwc) nwd.f36720a.get(i3);
                if (nwc == null) {
                    nwc = new nwc(nwd);
                    nwd.f36720a.put(i3, nwc);
                    nwd.f36721b.add(Integer.valueOf(i));
                    nwd.f36722c.release();
                }
                nwc.f36715b = nin;
                nwc.f36716c = i3;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m27953a(oei oei, CarInfo carInfo, CarUiInfo carUiInfo, Intent intent) {
        return !oei.mo22060b(carInfo, carUiInfo, intent.cloneFilter()).isEmpty();
    }

    /* renamed from: a */
    public final void mo20798a(int i, nin nin) {
        Integer valueOf = Integer.valueOf(i);
        List list = (List) this.f36755Y.get(valueOf.intValue());
        if (list == null) {
            list = new ArrayList();
            this.f36755Y.put(valueOf.intValue(), list);
        }
        list.add(nin);
    }

    /* renamed from: a */
    public final void mo21269a(int i, boolean z) {
        if (z) {
            char c = (char) i;
            synchronized (this.f36783i) {
                for (nij nij : this.f36783i.mo67317p()) {
                    nij.mo20777c(c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20799a(ComponentName componentName) {
        this.f36794t = (ComponentName) ooe.m29303a(componentName).mo22383a(this.f36738F);
    }

    /* renamed from: a */
    public final synchronized void mo20800a(Intent intent, Bundle bundle, int i) {
        m27950a(intent, bundle, this, null, i, true);
    }

    /* renamed from: a */
    public final void mo20801a(Configuration configuration, int i) {
        int i2 = i & 519;
        if (i2 != 0) {
            synchronized (this.f36783i) {
                for (nij nij : this.f36783i.mo67317p()) {
                    nij.mo20766a(configuration, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20802a(KeyEvent keyEvent) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        intent.setPackage(this.f36798y.getPackageName());
        this.f36780f.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final synchronized void mo20803a(MotionEvent motionEvent) {
        if (this.f36789o) {
            nvx nvx = this.f36761ae;
            if (nvx != null) {
                nvx.mo21733c();
            }
            this.f36782h.mo21656a(motionEvent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x013d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo20804a(CarDisplayId carDisplayId, biro biro, int i, int i2) {
        if (this.f36789o) {
            if (!this.f36763ag) {
                if (biro.f121436b == 84) {
                    nim nim = new nim();
                    nim.f35737a = SystemClock.elapsedRealtime();
                    nim.f35738b = biro;
                    nim.f35739c = i;
                    nim.f35740d = i2;
                    if (this.f36772ap == null) {
                        this.f36772ap = new ArrayList();
                    }
                    this.f36772ap.add(nim);
                    mo20841n();
                }
            }
            nvx nvx = this.f36761ae;
            if (nvx != null) {
                nvx.mo21733c();
            }
            int i3 = biro.f121436b;
            if (i3 != 84) {
                if (i3 == 65538) {
                    if (ccuf.f179931a.mo6606a().mo76814y()) {
                        m27947a(biro, i, i2);
                        return;
                    }
                }
                int i4 = biro.f121436b;
                if (i4 != 65537) {
                    if (i4 != 209) {
                        if (!(i4 == 65538 || i4 == 65540 || i4 == 3)) {
                            if (i4 < 65535) {
                                KeyEvent a = nlv.m26757a(biro, i, i2);
                                a.getKeyCode();
                                if (npe.m27156a(a.getKeyCode())) {
                                    mo20802a(a);
                                    return;
                                } else if (npe.m27164b(a.getKeyCode())) {
                                    a.getKeyCode();
                                    if (ccto.m131545b()) {
                                        nia nia = this.f36750T;
                                        if (nia == null) {
                                            bnsi d = nip.f35749b.mo68390d();
                                            d.mo68432a("nwe", "a", 944, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            d.mo68405a("Couldn't dispatch phone key, null CallClient");
                                        } else {
                                            nia.mo24732b(new nhz(a));
                                        }
                                    } else {
                                        try {
                                            nri nri = this.f36749S;
                                            if (nri == null) {
                                                bnsi d2 = nip.f35749b.mo68390d();
                                                d2.mo68432a("nwe", "a", 951, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                d2.mo68405a("Couldn't dispatch phone key, null CarCallService");
                                            } else {
                                                nri.mo20992a(a);
                                            }
                                        } catch (RemoteException e) {
                                            bnsi d3 = nip.f35749b.mo68390d();
                                            d3.mo68437a(e);
                                            d3.mo68432a("nwe", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            d3.mo68405a("Couldn't dispatch phone key, RemoteException thrown");
                                        }
                                    }
                                    nme e2 = this.f36742L.mo21045e();
                                    if (e2 != null) {
                                        synchronized (e2.f36014b) {
                                            int i5 = 0;
                                            while (true) {
                                                C1245ok okVar = e2.f36014b;
                                                if (i5 >= okVar.f26809h) {
                                                    break;
                                                }
                                                try {
                                                    nmd nmd = (nmd) okVar.mo15621c(i5);
                                                    if (nmd.f36010a > 0) {
                                                        nmd.f36012c.mo21506a(a);
                                                    }
                                                } catch (RemoteException e3) {
                                                    bnsi c = nme.f36013a.mo68388c();
                                                    c.mo68437a(e3);
                                                    c.mo68432a("nme", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    c.mo68405a("Error calling onInput()");
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                } else {
                                    oqa oqa = this.f36782h;
                                    int i6 = carDisplayId.f29493b;
                                    oqa.mo21655a(a);
                                }
                            }
                        }
                    }
                }
                if (!biro.f121437c) {
                    if (m27965q()) {
                        bnsi d4 = nip.f35749b.mo68390d();
                        d4.mo68432a("nwe", "a", 910, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d4.mo68405a("Keycode to start app before accepting tutorial, ignoring.");
                    } else if (!this.f36782h.mo21693i()) {
                        int i7 = biro.f121436b;
                        this.f36771ao.add(new Pair(Long.valueOf(SystemClock.elapsedRealtime()), biro));
                        mo20841n();
                    } else {
                        m27946a(biro);
                    }
                }
            } else {
                m27947a(biro, i, i2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20805a(CarDisplayId carDisplayId, oeq oeq) {
        if (this.f36789o) {
            nvx nvx = this.f36761ae;
            if (nvx != null) {
                nvx.mo21733c();
            }
            oqa oqa = this.f36782h;
            int i = carDisplayId.f29493b;
            oqa.mo21659a(oeq);
        }
    }

    /* renamed from: a */
    public final void mo20806a(PrintWriter printWriter) {
        printWriter.print("CarActivityManagerService ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        printWriter.print("mConnected=");
        printWriter.print(this.f36789o);
        printWriter.print(" mGearheadExists=");
        printWriter.print(this.f36757aa);
        printWriter.print(" mImeManager=");
        nln nln = this.f36791q;
        printWriter.print(nln != null ? nln.toString() : "null");
        printWriter.println();
        nvx nvx = this.f36761ae;
        if (nvx != null) {
            printWriter.println("**ShowcaseController**");
            printWriter.print(" mIsRunning");
            printWriter.print(nvx.f36703d);
            printWriter.print(" mIsShowcaseActivated");
            printWriter.print(nvx.f36702c);
            printWriter.print(" mLastInputTimeStamp");
            printWriter.print(nvx.f36701b);
        }
        printWriter.println();
        printWriter.println("Active Clients: ");
        try {
            for (nij nij : this.f36783i.mo67317p()) {
                printWriter.print("CarActivityManager ");
                printWriter.print(Integer.toHexString(System.identityHashCode(nij)));
                printWriter.print(" ");
                printWriter.println(nij.f35707d);
                printWriter.print("clientVersion=");
                printWriter.print(nij.f35717n);
                printWriter.print(" mPid=");
                printWriter.println(nij.f35713j);
                nin nin = nij.f35720q;
                if (nin != null) {
                    printWriter.print("mStartInfo=");
                    printWriter.print(nin.toString());
                }
                printWriter.print("enterAnimation=");
                printWriter.print(nij.f35721r);
                printWriter.print("mResumed=");
                printWriter.println(nij.f35719p);
                nij.mo20767a(printWriter);
            }
        } catch (ConcurrentModificationException e) {
            printWriter.println();
            printWriter.println("ConcurrentModificationException caught");
        }
        printWriter.println("Tasks: ");
        int i = 0;
        while (true) {
            C1223np npVar = this.f36784j;
            if (i >= npVar.f26809h) {
                break;
            }
            niv niv = (niv) npVar.mo15621c(i);
            printWriter.print("CarActivityTask{#");
            printWriter.print(niv.f35777b);
            printWriter.print(": mRoot=");
            printWriter.print(niv.f35779d.flattenToShortString());
            printWriter.print(", mActivities=[");
            for (int i2 = 0; i2 < niv.f35780e.size(); i2++) {
                printWriter.print(((nij) niv.f35780e.get(i2)).f35711h);
                if (i2 < niv.f35780e.size() - 1) {
                    printWriter.print(", ");
                }
            }
            printWriter.println("]}");
            i++;
        }
        printWriter.println();
        printWriter.println("Crash Report");
        printWriter.print("Total Crashes: ");
        printWriter.println(this.f36766aj);
        if (this.f36767ak != null) {
            printWriter.println("Latest Crashes:");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            for (nik nik : this.f36767ak) {
                printWriter.print(simpleDateFormat.format(new Date(nik.f35730a)));
                printWriter.print(": ");
                RuntimeException runtimeException = nik.f35731b;
                if (runtimeException == null) {
                    printWriter.println("<no exception>");
                } else {
                    printWriter.println(runtimeException.getMessage());
                    bqye.m113760a(nik.f35731b, printWriter);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20807a(List list, Intent intent, Bundle bundle) {
        m27952a(list, intent, bundle, this, null, mo21743b(intent), true, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo21742a(List list, Intent intent, niu niu) {
        m27952a(list, intent, null, niu, null, 1, false, 1);
    }

    /* renamed from: a */
    public final void mo20808a(nij nij) {
        if (!this.f36789o) {
            nij.mo20780f();
        } else if (nij.mo20773b() != 1) {
            this.f36782h.mo21685e(nij.mo20776c());
        }
    }

    /* renamed from: a */
    public final void mo20809a(nij nij, nik nik) {
        nij nij2 = nij;
        nik nik2 = nik;
        if (this.f36789o) {
            nln nln = this.f36791q;
            if (nln != null) {
                nln.mo21051b(nij2);
                if (nij2.f35707d.equals(this.f36760ad)) {
                    this.f36791q.mo21054d();
                }
            }
            boolean a = this.f36786l.mo21740a(nij2);
            m27963k(nij);
            int b = nij.mo20773b();
            if (b != 1) {
                this.f36782h.mo21687f(nij.mo20776c());
            }
            boolean z = false;
            Bundle bundle = null;
            if (nik2 == null) {
                if (nij.mo20788n() || this.f36773aq.remove(nij2)) {
                    z = true;
                }
                if (nij.mo20785k()) {
                    nij.mo20780f();
                } else {
                    nij.mo20781g();
                }
                if (z) {
                    nij a2 = nij2.f35706c.mo20844a();
                    if (a2 != null) {
                        this.f36785k.put(a2.mo20773b(), a2);
                        a2.f35719p = true;
                    } else if (b == 1) {
                        this.f36782h.mo21681d((oos) null);
                        m27948a("No task available");
                    }
                }
            } else {
                if (b == 1 && this.f36785k.get(1) == nij2) {
                    this.f36782h.mo21681d((oos) null);
                }
                bnsi d = nip.f35749b.mo68390d();
                d.mo68432a("nwe", "a", 1444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("Crashed ActivityManager: %s", nij2);
                if (nik2.f35731b != null) {
                    bnsi d2 = nip.f35749b.mo68390d();
                    d2.mo68437a(nik2.f35731b);
                    d2.mo68432a("nwe", "a", 1446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("FATAL onActivityManagerCrash called. Message: %s", nik2.f35731b.getMessage());
                }
                bnsi d3 = nip.f35749b.mo68390d();
                d3.mo68404a(bnsk.MEDIUM);
                d3.mo68432a("nwe", "a", 1449, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68405a("onActivityManagerCrash called from: ");
                if (!this.f36776at) {
                    if (this.f36767ak == null) {
                        this.f36767ak = new ArrayDeque();
                    }
                    this.f36766aj++;
                    this.f36767ak.add(nik2);
                    if (this.f36766aj > 5) {
                        this.f36767ak.remove();
                    }
                    ComponentName componentName = nij2.f35706c.f35779d;
                    if (componentName.equals(this.f36794t)) {
                        this.f36768al++;
                    }
                    if (this.f36769am == null) {
                        this.f36769am = new HashMap();
                    }
                    Pair pair = (Pair) this.f36769am.get(componentName);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (pair == null || elapsedRealtime - ((Long) pair.first).longValue() > 30000) {
                        this.f36769am.put(componentName, new Pair(Long.valueOf(elapsedRealtime), 1));
                    } else {
                        this.f36769am.put(componentName, new Pair(Long.valueOf(elapsedRealtime), Integer.valueOf(((Integer) pair.second).intValue() + 1)));
                    }
                    if (nij.mo20788n() || this.f36773aq.remove(nij2)) {
                        z = true;
                    }
                    if (this.f36789o) {
                        ComponentName componentName2 = nij2.f35707d;
                        int intValue = f36731e.containsKey(componentName2) ? ((Integer) f36731e.get(componentName2)).intValue() : 1;
                        if (a) {
                            if (componentName2.equals(this.f36794t)) {
                                m27962j(nij);
                            } else if (intValue == 1) {
                                nij2.f35706c.mo20847c();
                                m27948a("Crash");
                            } else if (intValue == 2 || intValue == 7) {
                                nij.mo20781g();
                                nin nin = nij2.f35720q;
                                m27954b(nin.f35742b, nin.f35743c, nij.mo20773b());
                            }
                        } else if (!z || intValue == 5) {
                            nij2.f35706c.mo20847c();
                        } else if (!componentName2.equals(this.f36794t)) {
                            nij b2 = nij2.f35706c.mo20846b();
                            Intent component = new Intent().setComponent(b2.f35720q.f35741a);
                            nin nin2 = b2.f35720q;
                            Intent intent = nin2.f35742b;
                            Bundle bundle2 = nin2.f35743c;
                            if (((Integer) ((Pair) this.f36769am.get(nij2.f35706c.f35779d)).second).intValue() < 4) {
                                bundle = bundle2;
                                component = intent;
                            } else if (intent.filterEquals(component) && intent.getExtras() == null) {
                                if (nij.mo20773b() == 1) {
                                    ComponentName componentName3 = b2.f35707d;
                                    b2.f35706c.mo20847c();
                                    m27948a("crashloop");
                                    return;
                                }
                                bnsi c = nip.f35749b.mo68388c();
                                c.mo68432a("nwe", "i", 1540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c.mo68405a("Crashloop detected in non-content layer");
                            }
                            component.setComponent(b2.f35720q.f35741a);
                            if (b2.mo20773b() != 1) {
                                b2.mo20781g();
                            } else {
                                b2.f35706c.mo20847c();
                            }
                            m27954b(component, bundle, b2.mo20773b());
                        } else {
                            m27962j(nij);
                        }
                    }
                } else {
                    throw ((RuntimeException) ooe.m29303a(nik2.f35731b).mo22382a((bmzi) new nvy(nij2)));
                }
            }
        } else {
            nij.mo20780f();
        }
    }

    /* renamed from: a */
    public final void mo20810a(niv niv) {
        this.f36784j.remove(niv.f35779d);
    }

    /* renamed from: a */
    public final void mo20811a(nqv nqv) {
        nij nij;
        nin nin;
        this.f36764ah.add(nqv);
        if (!this.f36774ar.isEmpty()) {
            try {
                for (Intent intent : this.f36774ar) {
                    Parcel bj = nqv.mo8529bj();
                    dcl.m8165a(bj, intent);
                    nqv.mo8530c(2, bj);
                }
            } catch (RemoteException e) {
                bnsi c = nip.f35749b.mo68388c();
                c.mo68437a(e);
                c.mo68432a("nwe", "a", 1693, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("onNewActivityRequest failed");
            }
            this.f36774ar.clear();
        }
        if (ccpp.f179704a.mo6606a().mo76602c() && (nij = (nij) this.f36785k.get(1)) != null && (nin = nij.f35720q) != null) {
            Intent intent2 = nin.f35742b;
            try {
                nqv.mo21470a(intent2);
            } catch (RemoteException e2) {
                bnsi c2 = nip.f35749b.mo68388c();
                c2.mo68437a(e2);
                c2.mo68432a("nwe", "a", 1708, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68420a("Error calling onActivityStarted with intent: %s", intent2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20812a(obu obu, EditorInfo editorInfo, nij nij) {
        int i = editorInfo.imeOptions;
        if (!nij.mo20788n()) {
            bnsi b = nip.f35749b.mo68387b();
            b.mo68432a("nwe", "a", 1656, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Can't start input on an unstarted activity");
        } else if (this.f36791q != null) {
            this.f36782h.mo21653a(editorInfo.inputType & 15);
            this.f36791q.mo21049a(obu, editorInfo, nij);
        } else {
            bnsi b2 = nip.f35749b.mo68387b();
            b2.mo68432a("nwe", "a", 1660, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("No ImeManager; can't start input");
        }
    }

    /* renamed from: a */
    public final synchronized void mo20813a(boolean z) {
        if (this.f36789o) {
            Iterator it = this.f36783i.mo67317p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nij nij = (nij) it.next();
                if (nij.mo20788n() && nij.f35717n < 3) {
                    z = false;
                    break;
                }
            }
            this.f36775as = this.f36782h.mo21708u();
            this.f36756Z = z;
            if (!z) {
                nln nln = this.f36791q;
                if (nln != null) {
                    nln.mo21050a(false);
                }
                for (nij nij2 : this.f36783i.mo67317p()) {
                    if (nij2.mo20788n() && !this.f36797x.equals(nij2.f35707d)) {
                        nij2.mo20771a((nij) null);
                        boolean z2 = nij2.f35715l;
                        nij2.f35715l = false;
                        if (!z2) {
                            this.f36773aq.add(nij2);
                        } else if (ccpp.m131165c()) {
                            niv niv = (niv) this.f36784j.get(this.f36777au);
                            if (niv == null) {
                                mo21744d((ComponentName) ooe.m29303a(this.f36777au).mo22383a(this.f36794t));
                            } else {
                                this.f36773aq.add(niv.mo20844a());
                            }
                        } else {
                            niv niv2 = (niv) this.f36784j.get(this.f36794t);
                            if (niv2 != null) {
                                this.f36773aq.add(niv2.mo20844a());
                            }
                        }
                    }
                }
            }
            nwd nwd = this.f36786l;
            synchronized (nwd.f36723d) {
                for (Integer num : nwd.f36721b) {
                    nwd.f36726g.mo20798a(num.intValue(), ((nwc) nwd.f36720a.get(num.intValue())).f36715b);
                    nwd.f36720a.remove(num.intValue());
                }
                nwd.f36721b.clear();
                nwd.f36722c.drainPermits();
            }
        }
    }

    /* renamed from: a */
    public final void mo20814a(boolean z, ComponentName componentName) {
        if (componentName == null) {
            ComponentName componentName2 = this.f36794t;
            if (componentName2 != this.f36738F) {
                this.f36777au = componentName2;
                this.f36778av = componentName2;
            } else if (!this.f36757aa) {
                this.f36745O.mo21273a(bpdn.NO_LAUNCHER, bpdo.MISSING_LAUNCHER, "No launcher projection client installed.");
            } else if (this.f36747Q.mo21351u() == 0) {
                Intent intent = new Intent();
                intent.setComponent(this.f36779d);
                mo20816a(intent);
            } else {
                Intent intent2 = (Intent) nip.f35748a.clone();
                intent2.putExtra("first_connection_with_this_car", z);
                mo20816a(intent2);
            }
        } else {
            this.f36777au = componentName;
            this.f36778av = componentName;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo20815a(int i) {
        synchronized (this.f36783i) {
            for (nij nij : this.f36783i.mo67317p()) {
                if (nij.f35713j == i && nij.mo20788n()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo20816a(Intent intent) {
        return m27951a(intent, this, null, mo21743b(intent), true);
    }
}
