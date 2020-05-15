package p000;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.hardware.usb.UsbManager;
import android.media.AudioManager;
import android.media.audiopolicy.AudioPolicy;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarServiceBinderImpl$UsbDisconnectReceiver;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.power.BatteryStateMonitor;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.common.Feature;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: noj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class noj extends nqt implements nmw, npy, nxb, nxd, nio, nlm, olo, olp, olr, olt, ohq, oef, nuq {

    /* renamed from: W */
    public static volatile boolean f36154W;

    /* renamed from: b */
    public static final bnsn f36155b = odk.m28481a("CAR.SERVICE");

    /* renamed from: A */
    public ody f36156A;

    /* renamed from: B */
    public ojq f36157B;

    /* renamed from: C */
    public nip f36158C;

    /* renamed from: D */
    public final oeh f36159D;

    /* renamed from: E */
    public final Context f36160E;

    /* renamed from: F */
    public HandlerThread f36161F;

    /* renamed from: G */
    public CarInfoInternal f36162G;

    /* renamed from: H */
    public volatile bpdn f36163H;

    /* renamed from: I */
    public volatile boolean f36164I;

    /* renamed from: J */
    public boolean f36165J;

    /* renamed from: K */
    public ComponentName f36166K;

    /* renamed from: L */
    public ComponentName f36167L;

    /* renamed from: M */
    public final niw f36168M;

    /* renamed from: N */
    public ofn f36169N;

    /* renamed from: O */
    public final Object f36170O;

    /* renamed from: P */
    public final oei f36171P;

    /* renamed from: Q */
    public final omx f36172Q;

    /* renamed from: R */
    public ouf f36173R;

    /* renamed from: S */
    public long f36174S;

    /* renamed from: T */
    public final Runnable f36175T;

    /* renamed from: U */
    public boolean f36176U;

    /* renamed from: V */
    public boolean f36177V;

    /* renamed from: X */
    public int f36178X;

    /* renamed from: Y */
    private volatile boolean f36179Y;

    /* renamed from: Z */
    private CountDownLatch f36180Z;

    /* renamed from: a */
    final oln f36181a;

    /* renamed from: aA */
    private final nuu f36182aA;

    /* renamed from: aB */
    private final nzl f36183aB;

    /* renamed from: aC */
    private final nhf f36184aC;

    /* renamed from: aD */
    private int f36185aD;

    /* renamed from: aE */
    private final Object f36186aE;

    /* renamed from: aF */
    private nur f36187aF;

    /* renamed from: aG */
    private ScheduledExecutorService f36188aG;

    /* renamed from: aH */
    private ntc f36189aH;

    /* renamed from: aa */
    private final npa f36190aa;

    /* renamed from: ab */
    private noh f36191ab;

    /* renamed from: ac */
    private volatile boolean f36192ac = false;

    /* renamed from: ad */
    private boolean f36193ad;

    /* renamed from: ae */
    private volatile boolean f36194ae;

    /* renamed from: af */
    private CarServiceBinderImpl$UsbDisconnectReceiver f36195af;

    /* renamed from: ag */
    private int f36196ag;

    /* renamed from: ah */
    private volatile njp f36197ah;

    /* renamed from: ai */
    private nma f36198ai;

    /* renamed from: aj */
    private odm f36199aj;

    /* renamed from: ak */
    private nme f36200ak;

    /* renamed from: al */
    private final nkw f36201al;

    /* renamed from: am */
    private final boolean f36202am;

    /* renamed from: an */
    private nmg f36203an;

    /* renamed from: ao */
    private final Object f36204ao;

    /* renamed from: ap */
    private volatile boolean f36205ap;

    /* renamed from: aq */
    private volatile boolean f36206aq;

    /* renamed from: ar */
    private volatile boolean f36207ar;

    /* renamed from: as */
    private final Set f36208as;

    /* renamed from: at */
    private OutputStream f36209at;

    /* renamed from: au */
    private int f36210au;

    /* renamed from: av */
    private final oae f36211av;

    /* renamed from: aw */
    private nzv f36212aw;

    /* renamed from: ax */
    private final Object f36213ax;

    /* renamed from: ay */
    private long f36214ay;

    /* renamed from: az */
    private nny f36215az;

    /* renamed from: c */
    public final Map f36216c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Set f36217d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: e */
    public final noz f36218e;

    /* renamed from: f */
    public final Context f36219f;

    /* renamed from: g */
    public final npd f36220g;

    /* renamed from: h */
    public final ozl f36221h = new ozo();

    /* renamed from: i */
    public nwj f36222i;

    /* renamed from: j */
    final nzk f36223j;

    /* renamed from: k */
    public oha f36224k;

    /* renamed from: l */
    public final Handler f36225l = new adzt(Looper.getMainLooper());

    /* renamed from: m */
    public final SparseBooleanArray f36226m = new SparseBooleanArray();

    /* renamed from: n */
    public final Object f36227n = new Object();

    /* renamed from: o */
    public int f36228o;

    /* renamed from: p */
    public int f36229p;

    /* renamed from: q */
    public boolean f36230q;

    /* renamed from: r */
    public volatile int f36231r;

    /* renamed from: s */
    public volatile boolean f36232s;

    /* renamed from: t */
    public volatile njj f36233t;

    /* renamed from: u */
    public nmv f36234u;

    /* renamed from: v */
    public nmi f36235v;

    /* renamed from: w */
    public final List f36236w;

    /* renamed from: x */
    public nkq f36237x;

    /* renamed from: y */
    public npk f36238y;

    /* renamed from: z */
    public final Map f36239z;

    public noj(noz noz, Context context, npd npd, oei oei) {
        oei oei2;
        int i = -1;
        this.f36228o = -1;
        this.f36193ad = false;
        this.f36178X = 1;
        this.f36229p = -1;
        this.f36194ae = false;
        this.f36230q = false;
        this.f36236w = new CopyOnWriteArrayList();
        this.f36239z = new ConcurrentHashMap();
        this.f36204ao = new Object();
        this.f36163H = bpdn.UNKNOWN_CODE;
        this.f36205ap = false;
        this.f36206aq = false;
        this.f36207ar = false;
        this.f36208as = Collections.synchronizedSet(EnumSet.noneOf(olq.class));
        this.f36164I = false;
        this.f36213ax = new Object();
        this.f36170O = new Object();
        this.f36185aD = 0;
        this.f36186aE = new Object();
        this.f36218e = noz;
        this.f36219f = context;
        this.f36220g = npd;
        if (cctv.f179911a.mo6606a().mo76770b()) {
            m26947a(this.f36220g);
        }
        this.f36160E = context.getApplicationContext();
        this.f36159D = new oeh(this.f36160E);
        this.f36171P = oei;
        this.f36175T = new nmz(this);
        this.f36190aa = new npa(context, this, this.f36171P);
        this.f36168M = new nja(this, this.f36190aa, npd, context);
        if (ccsn.f179851a.mo6606a().mo76723c() && (oei2 = this.f36171P) != null) {
            oei2.mo22058a(this.f36168M);
        }
        Context context2 = this.f36160E;
        niw niw = this.f36168M;
        PackageManager packageManager = context2.getPackageManager();
        try {
            int i2 = Build.VERSION.SDK_INT;
            i = packageManager.getPackageUid("com.google.android.projection.gearhead", 0);
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f36155b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("noj", "a", 808, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Gearhead package not found. Disabling lifecycle exceptions.");
        }
        this.f36181a = new olw(i, niw);
        this.f36182aA = new nuu();
        bnsn bnsn = npe.f36300a;
        nzc nzc = nzc.INSTANCE;
        this.f36202am = true;
        this.f36201al = new nkw(this.f36160E);
        if (ccwg.m131922b() > 0) {
            this.f36211av = new nna(this);
        } else {
            this.f36211av = nnb.f36081a;
        }
        this.f36172Q = omx.m29200a(context);
        this.f36223j = new nzk();
        this.f36183aB = new nzl();
        this.f36184aC = new nit(context, ccsq.f179858a.mo6606a().mo76731e(), new nnc(this));
        new oao(this);
    }

    /* renamed from: a */
    private static List m26943a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CarInfoInternal) it.next()).f29539a);
        }
        return arrayList;
    }

    /* renamed from: aA */
    private final void m26949aA() {
        bpea bpea;
        if (this.f36231r != 1) {
            this.f36208as.remove(olq.FRAMER_READER_THREAD);
        }
        synchronized (this.f36208as) {
            for (olq olq : this.f36208as) {
                bnsi c = f36155b.mo68388c();
                c.mo68432a("noj", "aA", 2826, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Thread %s stuck in disconnect. Will kill process.", olq);
                niw niw = this.f36168M;
                bpeb bpeb = bpeb.CAR_SERVICE;
                olq olq2 = olq.FRAMER_READER_THREAD;
                int ordinal = olq.ordinal();
                if (ordinal == 0) {
                    bpea = bpea.FRAMER_READER_THREAD_STUCK;
                } else if (ordinal == 1) {
                    bpea = bpea.AUDIO_CAPTURE_THREAD_STUCK;
                } else if (ordinal == 2) {
                    bpea = bpea.VIDEO_FOCUS_HANDLING_THREAD_STUCK;
                } else if (ordinal == 3) {
                    bpea = bpea.VIDEO_ENCODER_THREAD_STUCK;
                } else if (ordinal == 4) {
                    bpea = bpea.WINDOW_MANAGER_COMPOSITION_THREAD_STUCK;
                } else {
                    String valueOf = String.valueOf(olq);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("unknown thread type: ");
                    sb.append(valueOf);
                    throw new AssertionError(sb.toString());
                }
                niw.mo20860a(bpeb, bpea);
            }
            if (!this.f36208as.isEmpty()) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    /* renamed from: aB */
    private final String[] m26950aB() {
        String a = this.f36190aa.mo21372a("gmm_package_name");
        if (a.equals("")) {
            String valueOf = String.valueOf(ccuf.m131591b());
            return (valueOf.length() == 0 ? new String("com.google.android.projection.top,com.google.android.googlequicksearchbox,com.android.vending,com.google.android.apps.autoresponder,") : "com.google.android.projection.top,com.google.android.googlequicksearchbox,com.android.vending,com.google.android.apps.autoresponder,".concat(valueOf)).split(",");
        }
        String b = ccuf.m131591b();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 133 + String.valueOf(b).length());
        sb.append("com.google.android.projection.top,com.google.android.googlequicksearchbox,com.android.vending,com.google.android.apps.autoresponder,");
        sb.append(a);
        sb.append(",");
        sb.append(b);
        return sb.toString().split(",");
    }

    /* renamed from: ax */
    static final ExecutorService m26951ax() {
        return adzl.f62962b.mo25879b(2);
    }

    /* renamed from: az */
    private final ScheduledExecutorService m26952az() {
        if (this.f36188aG == null) {
            this.f36188aG = adzl.f62962b.mo25877a(1, 1);
        }
        return this.f36188aG;
    }

    /* renamed from: b */
    private final void m26953b(nrk nrk) {
        try {
            nrk.mo21484a(null);
        } catch (RemoteException e) {
            bnsi b = f36155b.mo68387b();
            b.mo68432a("noj", "b", 1555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Client died whilst trying to indicate that screenshot wasn't available");
        }
    }

    /* renamed from: A */
    public final nrz mo21238A() {
        mo21255R();
        nma nma = this.f36198ai;
        if (nma != null) {
            return nma;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: B */
    public final nrt mo21239B() {
        ols.m29101a(this);
        odm odm = this.f36199aj;
        if (odm != null) {
            return odm;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: C */
    public final nrr mo21240C() {
        ols.m29101a(this);
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: D */
    public final nsc mo21241D() {
        ols.m29101a(this);
        if (this.f36200ak.f36015c) {
            return this.f36200ak;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: E */
    public final nsc mo21242E() {
        ols.m29101a(this);
        return this.f36200ak;
    }

    /* renamed from: F */
    public final boolean mo21243F() {
        nuu nuu = this.f36182aA;
        Context context = this.f36219f;
        int callingUid = Binder.getCallingUid();
        boolean b = ccqx.m131305b();
        if (!nuu.mo21622a(context, callingUid)) {
            return false;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        return packagesForUid != null && sqc.m35963b(packagesForUid, nuu.m27790a(context, b));
    }

    /* renamed from: G */
    public final nrw mo21244G() {
        mo21255R();
        ody ody = this.f36156A;
        if (ody != null) {
            return ody;
        }
        throw new IllegalStateException("CarNotConnected");
    }

    /* renamed from: H */
    public final nre mo21245H() {
        mo21256S();
        mo21305aj();
        nkq nkq = this.f36237x;
        if (nkq != null) {
            return nkq;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: I */
    public final nsi mo21246I() {
        ols.m29101a(this);
        nmg nmg = this.f36203an;
        if (nmg != null) {
            return nmg;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: K */
    public final oap mo21248K() {
        ccux.m131754c();
        throw new IllegalStateException("Unsupported API usage.");
    }

    /* renamed from: L */
    public final nzv mo21249L() {
        nzv nzv;
        mo21305aj();
        Context context = this.f36160E;
        int callingUid = Binder.getCallingUid();
        Collection collection = nzr.f37016a;
        String s = ccuf.f179931a.mo6606a().mo76808s();
        if (!TextUtils.isEmpty(s)) {
            collection = new HashSet(nzr.f37016a);
            Collections.addAll(collection, s.split(","));
        }
        if (!Collections.disjoint(Arrays.asList(context.getPackageManager().getPackagesForUid(callingUid)), collection)) {
            synchronized (this.f36213ax) {
                if (this.f36212aw == null) {
                    this.f36212aw = new nlg(this.f36160E, this.f36181a);
                }
                nzv = this.f36212aw;
            }
            return nzv;
        }
        throw new SecurityException("Calling package not whitelisted.");
    }

    /* renamed from: M */
    public final void mo21250M() {
        this.f36164I = false;
        this.f36163H = bpdn.UNKNOWN_CODE;
        synchronized (this.f36226m) {
            this.f36226m.clear();
        }
        this.f36205ap = false;
        this.f36206aq = false;
        this.f36207ar = false;
        this.f36208as.clear();
    }

    /* renamed from: N */
    public final void mo21251N() {
        if (this.f36231r == 2) {
            if (ccql.f179756a.mo6606a().mo76647d()) {
                this.f36224k = new nof(this, this.f36223j);
            } else {
                this.f36224k = new nog(this);
            }
        } else if (ccwa.f180080a.mo6606a().mo76922d()) {
            this.f36224k = new nog(this);
        } else {
            this.f36224k = new ojd();
        }
    }

    /* renamed from: O */
    public final void mo21252O() {
        noh noh = new noh(this);
        this.f36191ab = noh;
        if (!noh.f36338c) {
            noh.f36338c = true;
            noh.f36337b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(noh);
        }
    }

    /* renamed from: P */
    public final void mo21253P() {
        this.f36195af = new CarServiceBinderImpl$UsbDisconnectReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        this.f36219f.registerReceiver(this.f36195af, intentFilter);
    }

    /* renamed from: Q */
    public final void mo21254Q() {
        HandlerThread handlerThread = new HandlerThread("Looper");
        this.f36161F = handlerThread;
        handlerThread.start();
    }

    /* renamed from: R */
    public final void mo21255R() {
        this.f36181a.mo22279c();
        if (!ccuz.m131757b() && !this.f36194ae) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo21256S() {
        this.f36181a.mo22280d();
        if (!ccuz.m131757b() && !mo21257T()) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    /* renamed from: T */
    public final boolean mo21257T() {
        if (!ccuz.m131757b()) {
            return this.f36192ac;
        }
        olm a = this.f36181a.mo22275a();
        return a.equals(olm.CONNECTED) || a.equals(olm.CONNECTING);
    }

    /* renamed from: U */
    public final void mo21258U() {
        Object obj;
        nri nri;
        nwe nwe;
        nwe nwe2;
        boolean z;
        noj noj = this;
        npk npk = noj.f36238y;
        if (npk != null) {
            npk.f36336f = new nnn(noj);
            npk npk2 = noj.f36238y;
            npk2.f36335e.mo22280d();
            if (npk2.f36333c) {
                oki oki = npk2.f36332b;
                if (oki == null) {
                    bnsi c = npk.f36331a.mo68388c();
                    c.mo68432a("npk", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Tried to send a wifi credentials request before the end point was ready.");
                } else if (!oki.f37852b) {
                    bnsi d = oki.f37850a.mo68390d();
                    d.mo68432a("oki", "c", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("sendWifiCredentialsRequest on closed channel");
                } else {
                    oki.mo22206a(32769, biws.f122120a);
                }
            } else {
                throw new IllegalStateException("CarNotConnected");
            }
        }
        if (cctv.f179911a.mo6606a().mo76771c()) {
            m26947a(noj.f36220g);
        }
        noj.f36220g.mo21381a(0);
        Object obj2 = noj.f36227n;
        synchronized (obj2) {
            try {
                if (!mo21257T()) {
                    return;
                }
                if (noj.f36193ad && noj.f36178X == 2) {
                    bnsi d2 = f36155b.mo68390d();
                    d2.mo68432a("noj", "W", 2035, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68405a("We do not have a display source service, so bail out");
                } else if (!noj.f36230q) {
                    noj.f36230q = true;
                    noj.f36222i.mo21750a();
                    for (noe noe : noj.f36236w) {
                        Context context = noj.f36219f;
                        noj noj2 = noe.f36144e;
                        npd npd = noj2.f36220g;
                        oad oad = noe.f36141b;
                        noe.f36142c = new nvk(noe, context, noj2, noj2, noj2, npd, noj2, oad, noj2.f36159D, oad.mo21891a());
                        noj = noj;
                        obj2 = obj2;
                    }
                    Context context2 = noj.f36219f;
                    nug nug = new nug();
                    nqm nqm = new nqm();
                    boolean z2 = noj.f36231r != 0 && ActivityManager.isUserAMonkey();
                    nmi nmi = noj.f36235v;
                    ccux.m131754c();
                    niw niw = noj.f36168M;
                    oei oei = noj.f36171P;
                    npa npa = noj.f36190aa;
                    npd npd2 = noj.f36220g;
                    if (noj.f36202am) {
                        nri = mo21300ae();
                    } else {
                        nri = null;
                    }
                    nia a = nhx.m26366a(context2);
                    oeh oeh = noj.f36159D;
                    oqa oqa = mo21344n().f36142c;
                    noz noz = noj.f36218e;
                    noz.getClass();
                    nwe nwe3 = nwe;
                    obj = obj2;
                    try {
                        nwe = new nwe(this, context2, niw, this, this, oei, this, npa, npd2, this, this, nri, a, oeh, oqa, new nmy(noz), nug, nqm, z2, nmi);
                        try {
                            synchronized (this.f36204ao) {
                                nwe2 = nwe3;
                                this.f36158C = nwe2;
                            }
                            this.f36159D.mo22051a(nwe2);
                            noe n = mo21344n();
                            bngx b = n.f36141b.mo21894b();
                            niw niw2 = this.f36168M;
                            int i = this.f36231r;
                            ((nja) niw2).f35787e = null;
                            PackageManager packageManager = ((nja) niw2).f35785c.getApplicationContext().getPackageManager();
                            List a2 = nja.m26517a(Arrays.asList((biwg[]) b.toArray(new biwg[b.size()])));
                            bxvd da = bpcu.f135860f.mo74144da();
                            String a3 = okb.m28991a(nja.m26516a(packageManager, "com.google.android.googlequicksearchbox"));
                            if (!da.f164950c) {
                                z = false;
                            } else {
                                da.mo74035c();
                                z = false;
                                da.f164950c = false;
                            }
                            bpcu bpcu = (bpcu) da.f164949b;
                            a3.getClass();
                            bpcu.f135862a |= 1;
                            bpcu.f135863b = a3;
                            String a4 = okb.m28991a(nja.m26516a(packageManager, ((nja) niw2).f35784b.mo21372a("gmm_package_name")));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            bpcu bpcu2 = (bpcu) da.f164949b;
                            a4.getClass();
                            bpcu2.f135862a |= 2;
                            bpcu2.f135864c = a4;
                            String a5 = okb.m28991a(nja.m26516a(packageManager, "com.google.android.music"));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            bpcu bpcu3 = (bpcu) da.f164949b;
                            a5.getClass();
                            bpcu3.f135862a |= 4;
                            bpcu3.f135865d = a5;
                            String a6 = okb.m28991a(nja.m26516a(packageManager, npe.m27161b(((nja) niw2).f35785c.getApplicationContext())));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            bpcu bpcu4 = (bpcu) da.f164949b;
                            a6.getClass();
                            bpcu4.f135862a |= 8;
                            bpcu4.f135866e = a6;
                            bpcu bpcu5 = (bpcu) da.mo74062i();
                            bpcq bpcq = (bpcq) bpcv.f135867i.mo74144da();
                            if (bpcq.f164950c) {
                                bpcq.mo74035c();
                                bpcq.f164950c = z;
                            }
                            bpcv bpcv = (bpcv) bpcq.f164949b;
                            bpcu5.getClass();
                            bpcv.f135870b = bpcu5;
                            int i2 = bpcv.f135869a | 1;
                            bpcv.f135869a = i2;
                            bpcv.f135869a = i2 | 4;
                            bpcv.f135872d = i;
                            bpcq.mo68937a(a2);
                            bpcv bpcv2 = (bpcv) bpcq.mo74062i();
                            bxvd c2 = ((nja) niw2).mo20870c();
                            if (c2.f164950c) {
                                c2.mo74035c();
                                c2.f164950c = z;
                            }
                            bpcl bpcl = (bpcl) c2.f164949b;
                            bpcl bpcl2 = bpcl.f135759L;
                            bpcv2.getClass();
                            bpcl.f135775c = bpcv2;
                            bpcl.f135773a |= 1;
                            ((nja) niw2).mo20868a(c2, 2);
                            for (noe noe2 : this.f36236w) {
                                if (!noe2.mo21233c()) {
                                    bngx b2 = noe2.f36141b.mo21894b();
                                    niw niw3 = this.f36168M;
                                    CarUiInfo carUiInfo = noe2.f36143d.f35983h;
                                    int i3 = noe2.f36140a.f29493b;
                                    int i4 = noe2.f36145f;
                                    List a7 = nja.m26517a(b2);
                                    bpcq bpcq2 = (bpcq) bpcv.f135867i.mo74144da();
                                    if (bpcq2.f164950c) {
                                        bpcq2.mo74035c();
                                        bpcq2.f164950c = z;
                                    }
                                    bpcv bpcv3 = (bpcv) bpcq2.f164949b;
                                    int i5 = bpcv3.f135869a | 16;
                                    bpcv3.f135869a = i5;
                                    bpcv3.f135875g = i3;
                                    int i6 = i4 - 1;
                                    if (i4 != 0) {
                                        bpcv3.f135869a = i5 | 32;
                                        bpcv3.f135876h = i6;
                                        bpcq2.mo68937a(a7);
                                        if (carUiInfo != null) {
                                            bpct a8 = nja.m26515a(carUiInfo);
                                            if (bpcq2.f164950c) {
                                                bpcq2.mo74035c();
                                                bpcq2.f164950c = z;
                                            }
                                            bpcv bpcv4 = (bpcv) bpcq2.f164949b;
                                            a8.getClass();
                                            bpcv4.f135874f = a8;
                                            bpcv4.f135869a |= 8;
                                        }
                                        bxvd c3 = ((nja) niw3).mo20870c();
                                        if (c3.f164950c) {
                                            c3.mo74035c();
                                            c3.f164950c = z;
                                        }
                                        bpcl bpcl3 = (bpcl) c3.f164949b;
                                        bpcv bpcv5 = (bpcv) bpcq2.mo74062i();
                                        bpcv5.getClass();
                                        bpcl3.f135775c = bpcv5;
                                        bpcl3.f135773a |= 1;
                                        ((nja) niw3).mo20868a(c3, 66);
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                            this.f36214ay = SystemClock.elapsedRealtime();
                            if (this.f36231r == 2) {
                                m26952az().scheduleAtFixedRate(new nnd(this), 0, ccql.f179756a.mo6606a().mo76651h(), TimeUnit.MILLISECONDS);
                            }
                            for (noe noe3 : this.f36236w) {
                                noe3.f36141b.mo21892a(m26952az());
                                oab d3 = noe3.f36141b.mo21895d();
                                if (d3 != null) {
                                    noe3.f36146g.mo21906a(d3);
                                    noe3.f36142c.mo21658a(d3);
                                }
                            }
                            if (n.f36141b.mo21895d() != null) {
                                mo21261X();
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: V */
    public final boolean mo21259V() {
        if (ccse.f179831a.mo6606a().mo76704a()) {
            return true;
        }
        if (ccse.f179831a.mo6606a().mo76705b()) {
            return false;
        }
        CarInfoInternal carInfoInternal = this.f36162G;
        int i = carInfoInternal.f29550l;
        if (i > 1) {
            return true;
        }
        if (i <= 0 || carInfoInternal.f29551m <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo21260W() {
        Object obj;
        nri nri;
        nwe nwe;
        nwe nwe2;
        boolean z;
        noj noj = this;
        noj.f36220g.mo21381a(0);
        Object obj2 = noj.f36227n;
        synchronized (obj2) {
            try {
                if (!mo21257T()) {
                    return;
                }
                if (noj.f36193ad && noj.f36178X == 2) {
                    bnsi d = f36155b.mo68390d();
                    d.mo68432a("noj", "W", 2035, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("We do not have a display source service, so bail out");
                } else if (!noj.f36230q) {
                    noj.f36230q = true;
                    noj.f36222i.mo21750a();
                    for (noe noe : noj.f36236w) {
                        Context context = noj.f36219f;
                        noj noj2 = noe.f36144e;
                        npd npd = noj2.f36220g;
                        oad oad = noe.f36141b;
                        noe.f36142c = new nvk(noe, context, noj2, noj2, noj2, npd, noj2, oad, noj2.f36159D, oad.mo21891a());
                        noj = noj;
                        obj2 = obj2;
                    }
                    Context context2 = noj.f36219f;
                    nug nug = new nug();
                    nqm nqm = new nqm();
                    boolean z2 = noj.f36231r != 0 && ActivityManager.isUserAMonkey();
                    nmi nmi = noj.f36235v;
                    ccux.m131754c();
                    niw niw = noj.f36168M;
                    oei oei = noj.f36171P;
                    npa npa = noj.f36190aa;
                    npd npd2 = noj.f36220g;
                    if (noj.f36202am) {
                        nri = mo21300ae();
                    } else {
                        nri = null;
                    }
                    nia a = nhx.m26366a(context2);
                    oeh oeh = noj.f36159D;
                    oqa oqa = mo21344n().f36142c;
                    noz noz = noj.f36218e;
                    noz.getClass();
                    nwe nwe3 = nwe;
                    obj = obj2;
                    try {
                        nwe = new nwe(this, context2, niw, this, this, oei, this, npa, npd2, this, this, nri, a, oeh, oqa, new nmy(noz), nug, nqm, z2, nmi);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                    try {
                        synchronized (this.f36204ao) {
                            nwe2 = nwe3;
                            this.f36158C = nwe2;
                        }
                        this.f36159D.mo22051a(nwe2);
                        noe n = mo21344n();
                        bngx b = n.f36141b.mo21894b();
                        niw niw2 = this.f36168M;
                        int i = this.f36231r;
                        ((nja) niw2).f35787e = null;
                        PackageManager packageManager = ((nja) niw2).f35785c.getApplicationContext().getPackageManager();
                        List a2 = nja.m26517a(Arrays.asList((biwg[]) b.toArray(new biwg[b.size()])));
                        bxvd da = bpcu.f135860f.mo74144da();
                        String a3 = okb.m28991a(nja.m26516a(packageManager, "com.google.android.googlequicksearchbox"));
                        if (!da.f164950c) {
                            z = false;
                        } else {
                            da.mo74035c();
                            z = false;
                            da.f164950c = false;
                        }
                        bpcu bpcu = (bpcu) da.f164949b;
                        a3.getClass();
                        bpcu.f135862a |= 1;
                        bpcu.f135863b = a3;
                        String a4 = okb.m28991a(nja.m26516a(packageManager, ((nja) niw2).f35784b.mo21372a("gmm_package_name")));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bpcu bpcu2 = (bpcu) da.f164949b;
                        a4.getClass();
                        bpcu2.f135862a |= 2;
                        bpcu2.f135864c = a4;
                        String a5 = okb.m28991a(nja.m26516a(packageManager, "com.google.android.music"));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bpcu bpcu3 = (bpcu) da.f164949b;
                        a5.getClass();
                        bpcu3.f135862a |= 4;
                        bpcu3.f135865d = a5;
                        String a6 = okb.m28991a(nja.m26516a(packageManager, npe.m27161b(((nja) niw2).f35785c.getApplicationContext())));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bpcu bpcu4 = (bpcu) da.f164949b;
                        a6.getClass();
                        bpcu4.f135862a |= 8;
                        bpcu4.f135866e = a6;
                        bpcu bpcu5 = (bpcu) da.mo74062i();
                        bpcq bpcq = (bpcq) bpcv.f135867i.mo74144da();
                        if (bpcq.f164950c) {
                            bpcq.mo74035c();
                            bpcq.f164950c = z;
                        }
                        bpcv bpcv = (bpcv) bpcq.f164949b;
                        bpcu5.getClass();
                        bpcv.f135870b = bpcu5;
                        int i2 = bpcv.f135869a | 1;
                        bpcv.f135869a = i2;
                        bpcv.f135869a = i2 | 4;
                        bpcv.f135872d = i;
                        bpcq.mo68937a(a2);
                        bpcv bpcv2 = (bpcv) bpcq.mo74062i();
                        bxvd c = ((nja) niw2).mo20870c();
                        if (c.f164950c) {
                            c.mo74035c();
                            c.f164950c = z;
                        }
                        bpcl bpcl = (bpcl) c.f164949b;
                        bpcl bpcl2 = bpcl.f135759L;
                        bpcv2.getClass();
                        bpcl.f135775c = bpcv2;
                        bpcl.f135773a |= 1;
                        ((nja) niw2).mo20868a(c, 2);
                        for (noe noe2 : this.f36236w) {
                            if (!noe2.mo21233c()) {
                                bngx b2 = noe2.f36141b.mo21894b();
                                niw niw3 = this.f36168M;
                                CarUiInfo carUiInfo = noe2.f36143d.f35983h;
                                int i3 = noe2.f36140a.f29493b;
                                int i4 = noe2.f36145f;
                                List a7 = nja.m26517a(b2);
                                bpcq bpcq2 = (bpcq) bpcv.f135867i.mo74144da();
                                if (bpcq2.f164950c) {
                                    bpcq2.mo74035c();
                                    bpcq2.f164950c = z;
                                }
                                bpcv bpcv3 = (bpcv) bpcq2.f164949b;
                                int i5 = bpcv3.f135869a | 16;
                                bpcv3.f135869a = i5;
                                bpcv3.f135875g = i3;
                                int i6 = i4 - 1;
                                if (i4 != 0) {
                                    bpcv3.f135869a = i5 | 32;
                                    bpcv3.f135876h = i6;
                                    bpcq2.mo68937a(a7);
                                    if (carUiInfo != null) {
                                        bpct a8 = nja.m26515a(carUiInfo);
                                        if (bpcq2.f164950c) {
                                            bpcq2.mo74035c();
                                            bpcq2.f164950c = z;
                                        }
                                        bpcv bpcv4 = (bpcv) bpcq2.f164949b;
                                        a8.getClass();
                                        bpcv4.f135874f = a8;
                                        bpcv4.f135869a |= 8;
                                    }
                                    bxvd c2 = ((nja) niw3).mo20870c();
                                    if (c2.f164950c) {
                                        c2.mo74035c();
                                        c2.f164950c = z;
                                    }
                                    bpcl bpcl3 = (bpcl) c2.f164949b;
                                    bpcv bpcv5 = (bpcv) bpcq2.mo74062i();
                                    bpcv5.getClass();
                                    bpcl3.f135775c = bpcv5;
                                    bpcl3.f135773a |= 1;
                                    ((nja) niw3).mo20868a(c2, 66);
                                } else {
                                    throw null;
                                }
                            }
                        }
                        this.f36214ay = SystemClock.elapsedRealtime();
                        if (this.f36231r == 2) {
                            m26952az().scheduleAtFixedRate(new nnd(this), 0, ccql.f179756a.mo6606a().mo76651h(), TimeUnit.MILLISECONDS);
                        }
                        for (noe noe3 : this.f36236w) {
                            noe3.f36141b.mo21892a(m26952az());
                            oab d2 = noe3.f36141b.mo21895d();
                            if (d2 != null) {
                                noe3.f36146g.mo21906a(d2);
                                noe3.f36142c.mo21658a(d2);
                            }
                        }
                        if (n.f36141b.mo21895d() != null) {
                            mo21261X();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo21261X() {
        boolean z;
        this.f36194ae = true;
        this.f36181a.mo22276a(olm.CONNECTED);
        this.f36187aF = new nur(this, this, this, this.f36219f);
        nhf nhf = this.f36184aC;
        nit nit = (nit) nhf;
        boolean z2 = false;
        if (nit.f35764e) {
            bmxy.m108600b(Looper.myLooper() == ((Handler) nit.f35766g.mo6606a()).getLooper());
            synchronized (nit.f35768i) {
                for (String str : ((nit) nhf).f35765f) {
                    ((nit) nhf).f35771l.put(str, bnfd.m109230a(10));
                    ((nit) nhf).f35772m.put(str, new nis());
                }
                ((nit) nhf).f35774o = true;
            }
            ((Handler) nit.f35766g.mo6606a()).post(nit.f35767h);
        }
        nur nur = this.f36187aF;
        String b = npe.m27161b(nur.f36558e);
        boolean a = sre.m36079a();
        int u = nur.f36556c.mo21351u();
        if (!(!a)) {
            z = false;
        } else {
            z = u == 0;
        }
        if (TextUtils.isEmpty(b)) {
            if (z) {
                bnsi d = nur.f36554a.mo68390d();
                d.mo68432a("nur", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Using emulator configuration");
                b = "com.google.android.gms.apitest.car";
            } else {
                bnsi c = nur.f36554a.mo68388c();
                c.mo68432a("nur", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("No projection lifecycle services installed");
                return;
            }
        }
        nur.f36560g = new Intent();
        nur.f36560g.addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFECYCLE_SERVICE");
        nur.f36560g.setPackage(b);
        if (nur.f36558e.getPackageManager().resolveService(nur.f36560g, 0) != null) {
            z2 = true;
        } else if (!z) {
            nur.f36560g = new Intent().setComponent(new ComponentName(b, "com.google.android.projection.gearhead.service.GearHeadService"));
        } else {
            nur.f36560g = null;
            bnsi d2 = nur.f36554a.mo68390d();
            d2.mo68432a("nur", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("No appropriate service found");
        }
        nur.mo21618b();
        if (!z2 || !nur.f36561h) {
            nur.f36563j = true;
            nur.f36555b.mo21271a(new Bundle());
        }
        ofd.m28611a(nur.f36558e, "com.google.android.gms.car.PROJECTION_STARTED", nur.m27785a(u));
    }

    /* renamed from: Y */
    public final nrp mo21262Y() {
        mo21305aj();
        synchronized (this.f36170O) {
            if (this.f36215az == null) {
                Intent action = new Intent().setComponent((ComponentName) nzg.f37000b.mo6606a()).setAction("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE");
                this.f36215az = new nny(this);
                skh.m35531a().mo25690a(this.f36160E, action, this.f36215az, 1);
                nny nny = this.f36215az;
                while (nny.f36126b) {
                    try {
                        nny.f36127c.f36170O.wait();
                    } catch (InterruptedException e) {
                    }
                }
                nny nny2 = this.f36215az;
                if (nny2 != null) {
                    try {
                        this.f36169N = new ofn(nny2.f36125a.mo22651a());
                    } catch (RemoteException e2) {
                    }
                    ojq ojq = this.f36157B;
                    if (ojq != null) {
                        ojq.mo22217a((ofo) this.f36169N);
                    }
                } else {
                    throw new IllegalStateException("Teardown before connect");
                }
            }
        }
        return this.f36169N;
    }

    /* renamed from: Z */
    public final void mo21263Z() {
        this.f36225l.post(new nnv(this));
    }

    /* renamed from: a */
    public final ComponentName mo20795a() {
        return this.f36167L;
    }

    /* renamed from: aa */
    public final void mo21296aa() {
        bnsi c = f36155b.mo68388c();
        c.mo68432a("noj", "aa", 2541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("onReaderThreadStuck");
        this.f36205ap = true;
        this.f36208as.add(olq.FRAMER_READER_THREAD);
    }

    /* renamed from: ab */
    public final void mo21297ab() {
        bnsi c = f36155b.mo68388c();
        c.mo68432a("noj", "ab", 2553, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("onAudioCaptureThreadStuck");
        this.f36206aq = true;
    }

    /* renamed from: ac */
    public final void mo21298ac() {
        bnsi c = f36155b.mo68388c();
        c.mo68432a("noj", "ac", 2559, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("onGenericThreadStuck");
        this.f36207ar = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: ad */
    public final void mo21299ad() {
        boolean z;
        if (Looper.myLooper() == this.f36225l.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Tear down must happen in default handler thread.");
        if (!this.f36179Y) {
            bnsi d = f36155b.mo68390d();
            d.mo68432a("noj", "ad", 2613, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Skip, no clients bound.");
            return;
        }
        this.f36179Y = false;
        synchronized (this.f36170O) {
            nny nny = this.f36215az;
            if (nny != null) {
                ouc ouc = nny.f36125a;
                if (ouc != null) {
                    try {
                        ouc.mo22652c();
                    } catch (RemoteException e) {
                    }
                }
                nny nny2 = this.f36215az;
                nny2.f36126b = false;
                nny2.f36127c.f36170O.notify();
                skh.m35531a().mo25689a(this.f36160E, this.f36215az);
                this.f36215az = null;
                ojq ojq = this.f36157B;
                if (ojq != null) {
                    ojq.mo22217a((ofo) null);
                }
                this.f36169N = null;
            }
        }
    }

    /* renamed from: ae */
    public final nri mo21300ae() {
        mo21305aj();
        if (this.f36202am) {
            return this.f36201al;
        }
        throw new UnsupportedOperationException("Unreachable code.");
    }

    /* renamed from: af */
    public final List mo21301af() {
        orf ai;
        mo21305aj();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ai = mo21304ai();
            List a = m26943a(ai.f38270b.mo22648d());
            ai.close();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        throw th;
    }

    /* renamed from: ag */
    public final List mo21302ag() {
        orf ai;
        mo21305aj();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ai = mo21304ai();
            List a = m26943a(ai.f38270b.mo22649e());
            ai.close();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        throw th;
    }

    /* renamed from: ah */
    public final void mo21303ah() {
        orf ai;
        mo21305aj();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ai = mo21304ai();
            ai.f38270b.mo22650f();
            ai.close();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            if (mo21257T()) {
                mo21327b(bipi.USER_SELECTION);
                return;
            }
            return;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final orf mo21304ai() {
        return new orf(this.f36219f);
    }

    /* renamed from: aj */
    public final void mo21305aj() {
        if (!mo21306ak()) {
            throw new SecurityException("Wrong signature - go/gearhead-retail-device");
        }
    }

    /* renamed from: ak */
    public final boolean mo21306ak() {
        return this.f36182aA.mo21622a(this.f36219f, Binder.getCallingUid());
    }

    /* renamed from: al */
    public final void mo21307al() {
        this.f36225l.post(new nnj(this));
    }

    /* renamed from: am */
    public final int mo21308am() {
        return this.f36162G.f29552n;
    }

    /* renamed from: an */
    public final boolean mo21309an() {
        return this.f36238y != null;
    }

    /* renamed from: ao */
    public final void mo21310ao() {
        synchronized (this.f36216c) {
            bnsi d = f36155b.mo68390d();
            d.mo68432a("noj", "ao", 3518, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Notifying car connection listeners of setup failure (%d listeners)", this.f36216c.size());
            for (nnw nnw : this.f36216c.values()) {
                try {
                    nrl nrl = nnw.f36123c;
                    Parcel bj = nrl.mo8529bj();
                    bj.writeInt(1);
                    nrl.mo8530c(3, bj);
                } catch (RemoteException e) {
                    bnsi c = f36155b.mo68388c();
                    c.mo68432a("noj", "ao", 3527, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68409a("Unable to notify setup failure on listener(pid=%d)", nnw.f36122b);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x022c  */
    /* renamed from: ap */
    public final boolean mo21311ap() {
        boolean z;
        nkq nkq;
        sdo.m34971a(this.f36225l.getLooper() == Looper.myLooper(), (Object) "startRequiredServices must be called from the default handler thread.");
        if (this.f36185aD != 1) {
            ogs ogs = this.f36157B.f37794d;
            synchronized (ogs.f37580d) {
                ogs.f37581e = true;
                for (int i = 1; i < 255; i++) {
                    oga oga = ogs.f37579c[i];
                    if (oga != null) {
                        oga.mo22114b();
                    }
                }
            }
            synchronized (this.f36227n) {
                z = this.f36193ad;
            }
            if (!this.f36234u.mo21185g()) {
                if (this.f36157B.mo22212a((ojn) this.f36234u) == 0) {
                    mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_SENSORS2, "No sensors");
                    if (!z) {
                        ccux.m131754c();
                        oaf oaf = new oaf(new nmx(new noe(this, CarDisplayId.f29492a, 1)), this.f36168M, this, this, this.f36220g, this, this.f36219f, this.f36211av, this.f36225l);
                        this.f36236w.clear();
                        this.f36157B.mo22212a((ojn) oaf);
                        bngx a = bngx.m109368a((Collection) oaf.f37038a);
                        if (a.isEmpty()) {
                            mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_DISPLAY, "No display");
                        } else {
                            ccux.m131754c();
                            Pair pair = (Pair) bnjd.m109595d(a);
                            noe noe = (noe) pair.first;
                            oad oad = (oad) pair.second;
                            sdo.m34959a(oad);
                            noe.f36141b = oad;
                            this.f36236w.add(noe);
                            nne nne = new nne(this);
                            CarDisplayId carDisplayId = noe.f36140a;
                            noj noj = noe.f36144e;
                            noe.f36143d = new nlv(noe, carDisplayId, noj, noj.f36220g, nne);
                            if (this.f36157B.mo22212a((ojn) noe.f36143d) == 0) {
                                mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_INPUT, "No input");
                            } else {
                                ccux.m131754c();
                                niw niw = this.f36168M;
                                CarUiInfo s = mo21349s();
                                nja nja = (nja) niw;
                                bxvd c = nja.mo20870c();
                                bpcq bpcq = (bpcq) bpcv.f135867i.mo74144da();
                                bpct a2 = nja.m26515a(s);
                                if (bpcq.f164950c) {
                                    bpcq.mo74035c();
                                    bpcq.f164950c = false;
                                }
                                bpcv bpcv = (bpcv) bpcq.f164949b;
                                a2.getClass();
                                bpcv.f135874f = a2;
                                bpcv.f135869a |= 8;
                                bpcv bpcv2 = (bpcv) bpcq.mo74062i();
                                if (c.f164950c) {
                                    c.mo74035c();
                                    c.f164950c = false;
                                }
                                bpcl bpcl = (bpcl) c.f164949b;
                                bpcl bpcl2 = bpcl.f135759L;
                                bpcv2.getClass();
                                bpcl.f135775c = bpcv2;
                                bpcl.f135773a |= 1;
                                nja.mo20868a(c, 50);
                                nma nma = new nma(this, this, this.f36181a, this.f36219f);
                                if (this.f36157B.mo22212a((ojn) nma) > 0) {
                                    this.f36198ai = nma;
                                }
                                odm odm = new odm(this.f36181a);
                                if (this.f36157B.mo22212a((ojn) odm) > 0) {
                                    this.f36199aj = odm;
                                }
                                nme nme = new nme(this.f36219f, this.f36182aA, this.f36181a);
                                this.f36200ak = nme;
                                this.f36157B.mo22212a((ojn) nme);
                                nmg nmg = new nmg(this.f36181a);
                                if (this.f36157B.mo22212a((ojn) nmg) > 0) {
                                    this.f36203an = nmg;
                                }
                                npk npk = new npk(this.f36181a);
                                if (this.f36157B.mo22212a((ojn) npk) > 0) {
                                    this.f36238y = npk;
                                }
                                this.f36157B.mo22212a((ojn) new nnf(this));
                            }
                        }
                    }
                    nkq = new nkq(this.f36160E, this.f36168M, this, this, this.f36181a);
                    if (this.f36157B.mo22212a((ojn) nkq) > 0) {
                        this.f36237x = nkq;
                    }
                    return true;
                }
                this.f36234u.f36066d = new npx(this.f36220g, this.f36219f, this.f36222i, this.f36161F);
            }
            this.f36197ah = new njp(this, this, this.f36168M, this, this, this.f36220g, this, this.f36233t, this.f36219f, this.f36218e.mo17317a(), !z);
            this.f36157B.mo22212a((ojn) this.f36197ah);
            njp njp = this.f36197ah;
            boolean z2 = njp.f35851h;
            boolean z3 = !z2;
            if (z2) {
                nxe[] nxeArr = njp.f35847d;
                int length = nxeArr.length;
                for (int i2 = 0; i2 < 3; i2++) {
                    if (nxeArr[i2] != null) {
                        z3 = true;
                    }
                }
            }
            if (njp.f35852i ? !z3 || njp.f35848e == null : !z3) {
                mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_AUDIO_MIC, "No audio/mic");
            }
            if (!z) {
            }
            nkq = new nkq(this.f36160E, this.f36168M, this, this, this.f36181a);
            if (this.f36157B.mo22212a((ojn) nkq) > 0) {
            }
            return true;
        }
        this.f36185aD = 2;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public final void mo21312aq() {
        if (this.f36231r == 1 && mo21257T()) {
            UsbManager usbManager = (UsbManager) this.f36219f.getSystemService("usb");
            try {
                int i = Build.VERSION.SDK_INT;
                UsbManager.class.getMethod("setCurrentFunction", String.class).invoke(usbManager, null);
            } catch (Exception e) {
                bnsi c = f36155b.mo68388c();
                c.mo68437a(e);
                c.mo68432a("noj", "aq", 4073, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Error resetting USB current function");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public final nmv mo21313ar() {
        return new nmv(this, this, this.f36181a, this.f36219f);
    }

    /* renamed from: as */
    public final njj mo21314as() {
        return new njj(this.f36168M, this, this, this.f36219f);
    }

    /* renamed from: at */
    public final ody mo21315at() {
        return new ody(this, this, this.f36219f);
    }

    /* renamed from: au */
    public final nmi mo21316au() {
        return new nmi(this.f36220g);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: av */
    public final void mo21317av() {
        sdo.m34971a(!this.f36236w.isEmpty(), (Object) "No displays added. Likely that DisplaySourceService not yet discovered.");
    }

    /* renamed from: aw */
    public final void mo21318aw() {
        ols.m29101a(this);
    }

    /* renamed from: ay */
    public final void mo21319ay() {
    }

    /* renamed from: b */
    public final ComponentName mo20796b() {
        return this.f36166K;
    }

    @Deprecated
    /* renamed from: c */
    public final int mo21335c(String str, int i) {
        if (this.f36220g.mo21385a(str)) {
            return this.f36220g.mo21378a(str, i);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append("Setting");
        sb.append(str);
        sb.append(" is not accessible by third party");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public final int mo21340d(String str, int i) {
        nyu a = nyu.m28208a();
        Pair a2 = nyu.m28207a(str, Integer.valueOf(i));
        bdyx bdyx = (bdyx) a.f36990d.get(a2);
        if (bdyx == null) {
            a.f36990d.putIfAbsent(a2, bdyx.m91606a(a.f36987a, (String) a2.first, i));
            bdyx = (bdyx) a.f36990d.get(a2);
        }
        return ((Integer) bdyx.mo58455c()).intValue();
    }

    /* renamed from: e */
    public final nme mo21045e() {
        return this.f36200ak;
    }

    /* renamed from: f */
    public final nmv mo21046f() {
        return this.f36234u;
    }

    /* renamed from: g */
    public final nip mo21194g() {
        nip nip;
        synchronized (this.f36204ao) {
            nip = this.f36158C;
        }
        return nip;
    }

    /* renamed from: h */
    public final nmw mo21195h() {
        return this;
    }

    /* renamed from: i */
    public final oeh mo21196i() {
        return this.f36159D;
    }

    /* renamed from: j */
    public final void mo21197j() {
        mo21329b(CriticalError.m22086a(bpdn.UNKNOWN_CODE, bpdo.UNKNOWN_DETAIL));
        mo21299ad();
        if (this.f36202am) {
            this.f36201al.mo20989a();
        }
        this.f36218e.mo17318b();
    }

    /* renamed from: k */
    public final ntd mo21198k() {
        ntc ntc;
        mo21305aj();
        synchronized (this.f36186aE) {
            if (this.f36189aH == null) {
                this.f36189aH = new ntc(this);
            }
            ntc = this.f36189aH;
        }
        return ntc;
    }

    /* renamed from: l */
    public final boolean mo21199l() {
        return this.f36181a.mo22275a().equals(olm.CONNECTED);
    }

    /* renamed from: m */
    public final void mo21200m() {
        this.f36172Q.mo22345a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final noe mo21344n() {
        return (noe) bnjd.m109591c(this.f36236w, (Object) null);
    }

    /* renamed from: o */
    public final CarInfo mo21345o() {
        if (mo21306ak()) {
            mo21256S();
            return mo21346p();
        }
        mo21255R();
        CarInfo p = mo21346p();
        return new CarInfo(p.f29332a, p.f29333b, p.f29334c, p.f29335d, 0, 0, false, p.f29339h, p.f29340i, p.f29341j, p.f29342k, p.f29343l, false, false, false, null, p.f29348q);
    }

    /* renamed from: p */
    public final CarInfo mo21346p() {
        CarInfoInternal carInfoInternal = this.f36162G;
        if (carInfoInternal != null) {
            return carInfoInternal.f29539a;
        }
        return null;
    }

    /* renamed from: q */
    public final String mo21347q() {
        CarInfoInternal carInfoInternal = this.f36162G;
        if (carInfoInternal != null) {
            return carInfoInternal.f29549k;
        }
        return null;
    }

    /* renamed from: r */
    public final CarUiInfo mo21348r() {
        mo21255R();
        CarUiInfo s = mo21349s();
        if (s != null) {
            return s;
        }
        CarUiInfo carUiInfo = new CarUiInfo(false, 1, false, false, null, false, false, 0, 0);
        bnsi b = f36155b.mo68387b();
        b.mo68432a("noj", "r", 986, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("Car UI info wasn't set. Using all false values: %s", carUiInfo);
        return carUiInfo;
    }

    /* renamed from: s */
    public final CarUiInfo mo21349s() {
        noe n = mo21344n();
        if (n == null) {
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "s", 996, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Could not get primary display CarUiInfo - no primary display");
            return null;
        }
        nlv nlv = n.f36143d;
        if (nlv != null) {
            return nlv.f35983h;
        }
        bnsi c2 = f36155b.mo68388c();
        c2.mo68432a("noj", "s", 1001, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c2.mo68405a("Could not get primary display CarUiInfo - no primary input service");
        return null;
    }

    /* renamed from: t */
    public final int mo21350t() {
        mo21256S();
        return this.f36231r;
    }

    /* renamed from: u */
    public final int mo21351u() {
        return this.f36231r;
    }

    /* renamed from: v */
    public final nqx mo21352v() {
        mo21255R();
        njp njp = this.f36197ah;
        if (njp != null) {
            return njp;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: w */
    public final ntb mo21353w() {
        ols.m29101a(this);
        noe n = mo21344n();
        if (n != null) {
            oqa oqa = n.f36142c;
            if (oqa != null) {
                return ((nvk) oqa).f36660f;
            }
            throw new IllegalStateException("CarNotSupported");
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: x */
    public final void mo21354x() {
        if (this.f36179Y) {
            bnsi d = f36155b.mo68390d();
            d.mo68432a("noj", "x", 1193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Already connected");
            return;
        }
        this.f36179Y = true;
        if (this.f36202am && mo21257T()) {
            this.f36201al.mo21004b();
        }
    }

    /* renamed from: y */
    public final nso mo21355y() {
        mo21256S();
        nmv nmv = this.f36234u;
        if (nmv != null && nmv.mo21185g()) {
            return nmv;
        }
        throw new IllegalStateException("CarNotConnected");
    }

    /* renamed from: z */
    public final nsl mo21356z() {
        ols.m29101a(this);
        return this.f36235v;
    }

    /* renamed from: a */
    private static oln m26944a(Context context, niw niw) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        try {
            int i2 = Build.VERSION.SDK_INT;
            i = packageManager.getPackageUid("com.google.android.projection.gearhead", 0);
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f36155b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("noj", "a", 808, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Gearhead package not found. Disabling lifecycle exceptions.");
            i = -1;
        }
        return new olw(i, niw);
    }

    /* renamed from: J */
    public final boolean mo21247J() {
        if (mo21243F()) {
            bnsi d = f36155b.mo68390d();
            d.mo68432a("noj", "J", 1484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Deleting saved Android Auto module data");
            if (ooa.m29295a(npe.m27153a(this.f36160E))) {
                return true;
            }
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "J", 1487, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to delete all saved Android Auto module data");
            return false;
        }
        throw new SecurityException("Calling package must be Gearhead.");
    }

    /* renamed from: e */
    public final boolean mo21342e(String str, int i) {
        return this.f36171P.mo22059a(mo21346p(), mo21349s(), str, nhg.values()[i]);
    }

    /* renamed from: f */
    public final boolean mo21343f(String str, int i) {
        return this.f36171P.mo22061b(mo21346p(), mo21349s(), str, nhg.values()[i]);
    }

    /* renamed from: c */
    public final String mo21336c(String str) {
        if (!ccsq.f179858a.mo6606a().mo76730d()) {
            mo21305aj();
            return this.f36190aa.mo21372a(str);
        }
        throw new IllegalStateException("getStringCarServiceProperty is disabled");
    }

    /* renamed from: b */
    public final ComponentName mo21320b(int i) {
        nip g = mo21194g();
        if (g != null) {
            return g.mo20817b(i);
        }
        return null;
    }

    /* renamed from: a */
    private final void m26945a(CarInfoInternal carInfoInternal, ojq ojq, int i, boolean z) {
        this.f36181a.mo22276a(olm.CONNECTING);
        this.f36162G = carInfoInternal;
        this.f36157B = ojq;
        this.f36231r = i;
        this.f36232s = z;
        mo21254Q();
        this.f36222i = mo21326b(i, this.f36218e.mo17317a());
        if (i == 1) {
            mo21253P();
        }
        mo21252O();
    }

    /* renamed from: b */
    public final String mo21321b(String str, String str2) {
        if (!this.f36220g.mo21385a(str)) {
            mo21305aj();
        }
        return this.f36220g.mo21379a(str, str2);
    }

    /* renamed from: c */
    public final String mo21337c(String str, String str2) {
        nyu a = nyu.m28208a();
        Pair a2 = nyu.m28207a(str, str2);
        bdyx bdyx = (bdyx) a.f36989c.get(a2);
        if (bdyx == null) {
            a.f36989c.putIfAbsent(a2, bdyx.m91609a(a.f36987a, (String) a2.first, str2));
            bdyx = (bdyx) a.f36989c.get(a2);
        }
        return (String) bdyx.mo58455c();
    }

    /* renamed from: d */
    public final nlv mo21044d() {
        noe n = mo21344n();
        if (n != null) {
            return n.f36143d;
        }
        return null;
    }

    /* renamed from: b */
    public final List mo21322b(Intent intent) {
        return this.f36171P.mo22055a(mo21346p(), mo21349s(), intent);
    }

    /* renamed from: d */
    public final boolean mo21341d(String str, boolean z) {
        nyu a = nyu.m28208a();
        Pair a2 = nyu.m28207a(str, Boolean.valueOf(z));
        bdyx bdyx = (bdyx) a.f36988b.get(a2);
        if (bdyx == null) {
            a.f36988b.putIfAbsent(a2, bdyx.m91610a(a.f36987a, (String) a2.first, z));
            bdyx = (bdyx) a.f36988b.get(a2);
        }
        return ((Boolean) bdyx.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final List mo21323b(Intent intent, int i) {
        return this.f36171P.mo22056a(mo21346p(), mo21349s(), intent, nhg.values()[i]);
    }

    /* renamed from: a */
    private final void m26946a(noe noe, String str) {
        boolean z;
        try {
            boolean z2 = false;
            Context createPackageContext = this.f36219f.createPackageContext(str, 0);
            int a = this.f36183aB.mo21868a(createPackageContext);
            if (a != 0) {
                opo opo = ((nvk) noe.f36142c).f36621V;
                if (a != 0) {
                    opu opu = (opu) opo;
                    Pair a2 = opu.f38197d.mo21870a(createPackageContext, a);
                    int intValue = ((Integer) a2.first).intValue();
                    int intValue2 = ((Integer) a2.second).intValue();
                    if (intValue != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (intValue2 == 0) {
                        z2 = true;
                    }
                    if (z != z2) {
                        bnsi c = opu.f38192a.mo68388c();
                        c.mo68432a("opu", "b", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null. Not setting default content window animations.");
                    } else if (intValue != 0) {
                        opu.f38202i = intValue;
                        opu.f38203j = intValue2;
                        opu.f38204k = opu.mo22480a(createPackageContext, intValue);
                        opu.f38205l = opu.mo22480a(createPackageContext, intValue2);
                    }
                } else {
                    bnsi c2 = opu.f38192a.mo68388c();
                    c2.mo68432a("opu", "b", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("windowAnimationStyleRes is 0. Not setting default content window animations.");
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f36155b.mo68387b();
            b.mo68437a(e);
            b.mo68432a("noj", "a", 2273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Failed to initialize default content window animations for package: %s", str);
        }
    }

    /* renamed from: b */
    public final List mo21324b(String str, List list) {
        if (!this.f36220g.mo21385a(str)) {
            mo21305aj();
        }
        return new ArrayList(this.f36220g.mo21380a(str, list != null ? new HashSet(list) : Collections.emptySet()));
    }

    /* renamed from: c */
    public final njp mo21043c() {
        mo21255R();
        njp njp = this.f36197ah;
        if (njp != null) {
            return njp;
        }
        throw new IllegalStateException("CarNotSupported");
    }

    /* renamed from: b */
    public final npj mo21325b(String str) {
        npj npj;
        mo21255R();
        if (mo21243F() || npe.m27165c(this.f36219f, "com.google.android.gms.permission.CAR_VENDOR_EXTENSION") == 0) {
            if (str.startsWith("com.google")) {
                mo21305aj();
            }
            synchronized (this.f36239z) {
                npj = (npj) this.f36239z.get(str);
                if (npj == null) {
                    throw new IllegalStateException("CarNotSupported");
                }
            }
            Context context = this.f36219f;
            String[] strArr = npj.f36311b;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.retainAll(Arrays.asList(packagesForUid));
            if (hashSet.size() > 0) {
                return npj;
            }
            String valueOf = String.valueOf(str);
            throw new SecurityException(valueOf.length() == 0 ? new String("Package not permitted to access ") : "Package not permitted to access ".concat(valueOf));
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(96);
        sb.append("UID: ");
        sb.append(callingUid);
        sb.append(" does not have permission com.google.android.gms.permission.CAR_VENDOR_EXTENSION");
        throw new SecurityException(sb.toString());
    }

    /* renamed from: c */
    public final boolean mo21338c(int i) {
        nip g = mo21194g();
        if (g != null) {
            return g.mo20826c(i);
        }
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo21339c(String str, boolean z) {
        if (this.f36220g.mo21385a(str)) {
            return this.f36220g.mo21386a(str, z);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append("Setting");
        sb.append(str);
        sb.append(" is not accessible by third party");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: npd.b(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      npd.b(java.lang.String, int):void
      npd.b(java.lang.String, java.util.Set):void
      npd.b(java.lang.String, boolean):void */
    /* renamed from: a */
    private static void m26947a(npd npd) {
        npd.f36296c.edit().putBoolean("rotary_use_focus_finder", ccuf.f179931a.mo6606a().mo76810u()).apply();
        npd.mo21391b("toll_card_sensor_enabled", true);
        npd.mo21389b("touchpad_focus_navigation_history_max_size", (int) ccvu.f180046a.mo6606a().mo76890d());
        npd.mo21389b("touchpad_focus_navigation_history_max_age_ms", (int) ccvu.f180046a.mo6606a().mo76889c());
        bnha bnha = new bnha();
        bnha.mo67695b(ntr.RESERVED_1, false);
        bnha.mo67695b(ntr.RESERVED_2, false);
        bnha.mo67695b(ntr.CAR_WINDOW_RESIZABLE, true);
        bnha.mo67695b(ntr.INT_SETTINGS_AVAILABLE, true);
        bnha.mo67695b(ntr.THIRD_PARTY_ACCESSIBLE_SETTINGS, true);
        bnha.mo67695b(ntr.CLIENT_SIDE_FLAGS, true);
        bnha.mo67695b(ntr.CONTENT_WINDOW_INSETS, true);
        bnha.mo67695b(ntr.ASSISTANT_Z, Boolean.valueOf(ccoy.m131100c()));
        bnha.mo67695b(ntr.START_CAR_ACTIVITY_WITH_OPTIONS, true);
        bnha.mo67695b(ntr.STICKY_WINDOW_FOCUS, true);
        bnha.mo67695b(ntr.NON_CONTENT_WINDOW_ANIMATIONS_SAFE, true);
        bnha.mo67695b(ntr.WINDOW_REQUIRES_ONE_TEXTURE_UPDATE_TO_DRAW, true);
        bnha.mo67695b(ntr.CONNECTION_STATE_HISTORY, true);
        bnha.mo67695b(ntr.CLEAR_DATA, true);
        bnha.mo67695b(ntr.START_DUPLEX_CONNECTION, true);
        bnha.mo67695b(ntr.WINDOW_OUTSIDE_TOUCHES, Boolean.valueOf(cctl.m131528f()));
        bnha.mo67695b(ntr.CAR_WINDOW_REQUEST_FOCUS, Boolean.valueOf(cctl.m131527e()));
        bnha.mo67695b(ntr.SUPPORTS_SELF_MANAGED_CALLS, Boolean.valueOf(ccwj.m131930b()));
        bnha.mo67695b(ntr.START_FIRST_CAR_ACTIVITY_ON_FOCUS_GAINED, Boolean.valueOf(ccpp.m131165c()));
        ntr ntr = ntr.MULTI_DISPLAY;
        ccux.m131754c();
        bnha.mo67695b(ntr, false);
        bnhe b = bnha.mo67618b();
        C1225nr nrVar = new C1225nr(ntr.values().length);
        ntr[] values = ntr.values();
        for (ntr ntr2 : values) {
            sdo.m34972a(b.containsKey(ntr2), "Feature %s is not in moduleFeatureEnabledMap", ntr2.name());
            if (((Boolean) b.get(ntr2)).booleanValue()) {
                nrVar.add(ntr2.name());
            }
        }
        npd.mo21390b("car_module_feature_set", nrVar);
    }

    /* renamed from: b */
    public final nwj mo21326b(int i, boolean z) {
        return new nwj(this.f36220g, this.f36219f, i, z);
    }

    /* renamed from: b */
    public final void mo21327b(bipi bipi) {
        if (ccpv.m131196e()) {
            this.f36218e.mo17315a(bipi);
        } else {
            mo21187a(bipi);
        }
    }

    /* renamed from: b */
    public final void mo21328b(bpdn bpdn, bpdo bpdo, String str) {
        sdo.m34966a(bpdn, "errorCode is necessary");
        synchronized (this.f36226m) {
            this.f36226m.put(bpdn.f136282v, true);
        }
        if (bpdn == bpdn.CONNECTION_ERROR && this.f36231r == 1) {
            synchronized (this.f36226m) {
                if (!this.f36226m.get(3, false)) {
                    this.f36225l.postDelayed(new nnu(this, bpdn, bpdo, str), 1500);
                    return;
                }
                return;
            }
        }
        mo21273a(bpdn, bpdo, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0228, code lost:
        if (r4 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r4.mo8530c(2, r4.mo8529bj());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.f36192ac = false;
        r5 = r1.f36181a.mo22275a();
        r1.f36181a.mo22277a(p000.olm.f37918d, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r6 = r1.f36216c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0336, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4 = r1.f36194ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (p000.ccuz.m131757b() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r4 = r5.equals(p000.olm.f37917c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r4 != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = p000.noj.f36155b.mo68390d();
        r4.mo68432a("noj", "a", 3485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r4.mo68409a("Not ready for clients, so not notifying car connection listeners of disconnection (%d listeners)", r1.f36216c.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0474, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r4 = p000.noj.f36155b.mo68390d();
        r4.mo68432a("noj", "a", 3480, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r4.mo68409a("Notifying car connection listeners of disconnection (%d listeners)", r1.f36216c.size());
        r1.f36194ae = false;
        r4 = r1.f36216c.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0499, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r4.hasNext() == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x04e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        ((p000.nnw) r1.f36216c.get((android.os.IBinder) r4.next())).f36123c.mo21485a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x04ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r9 = p000.noj.f36155b.mo68387b();
        r9.mo68432a("noj", "a", 3499, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r9.mo68405a("Remote exception calling onDisconnected, removing from list");
        r4.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x051b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r4 = m26950aB();
        r5 = r4.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (r6 >= r5) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        r1.f36219f.sendBroadcast(new android.content.Intent("com.google.android.gms.car.DISCONNECTED").setFlags(32).setPackage(r4[r6]));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r4 = mo21194g();
        r5 = r1.f36227n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0642, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r1.f36214ay <= 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0672, code lost:
        if (r1.f36207ar != false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r6 = r1.f36168M;
        r9 = android.os.SystemClock.elapsedRealtime() - r1.f36214ay;
        r7 = r1.f36233t.f35814n;
        r15 = r1.f36233t.f35813m;
        ((p000.nja) r6).f35787e = null;
        r11 = p000.bpcw.f135877e.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x06b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        if (r11.f164950c != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x06b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x06ba, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x06bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x06be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x06bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x06c0, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x06c2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        r14 = (p000.bpcw) r11.f164949b;
        r3 = r14.f135879a | 1;
        r14.f135879a = r3;
        r14.f135880b = r9;
        r3 = r3 | 2;
        r14.f135879a = r3;
        r14.f135881c = r7;
        r14.f135879a = r3 | 4;
        r14.f135882d = r15;
        r3 = (p000.bpcw) r11.mo74062i();
        r7 = ((p000.nja) r6).mo20870c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (r7.f164950c != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        r7.mo74035c();
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        r9 = (p000.bpcl) r7.f164949b;
        r10 = p000.bpcl.f135759L;
        r3.getClass();
        r9.f135776d = r3;
        r9.f135773a |= 2;
        ((p000.nja) r6).mo20868a(r7, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014e, code lost:
        r1.f36214ay = 0;
        r3 = r1.f36184aC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0159, code lost:
        if (((p000.nit) r3).f35764e == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016e, code lost:
        if (android.os.Looper.myLooper() != ((android.os.Handler) ((p000.nit) r3).f35766g.mo6606a()).getLooper()) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0170, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0172, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0173, code lost:
        p000.bmxy.m108600b(r6);
        ((android.os.Handler) ((p000.nit) r3).f35766g.mo6606a()).removeCallbacks(((p000.nit) r3).f35767h);
        r6 = ((p000.nit) r3).f35768i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        ((p000.nit) r3).f35772m.clear();
        ((p000.nit) r3).f35771l.clear();
        ((p000.nit) r3).f35773n.clear();
        ((p000.nit) r3).f35774o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ac, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1.f36225l.removeCallbacks(r1.f36175T);
        r4 = r1.f36227n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        if (r4 != null) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        r4.mo20802a(new android.view.KeyEvent(0, 127));
        r4.mo20802a(new android.view.KeyEvent(1, 127));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c8, code lost:
        r1.f36181a.mo22277a(p000.olm.f37919e, r2);
        r1.f36228o = -1;
        r1.f36227n.notifyAll();
        r3 = mo21344n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01db, code lost:
        if (r3 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01dd, code lost:
        r3 = r3.f36141b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01df, code lost:
        if (r3 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e2, code lost:
        r3.mo21898g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e9, code lost:
        if (p000.cctc.m131510b() != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01eb, code lost:
        r3 = r1.f36188aG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ed, code lost:
        if (r3 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ef, code lost:
        r3.shutdownNow();
        r1.f36188aG = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f9, code lost:
        if (p000.cctv.m131557b() != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fb, code lost:
        r1.f36168M.mo20849a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
        if (r1.f36173R == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0204, code lost:
        r1.f36173R = null;
        r1.f36234u.mo20658c();
        r1.f36234u = null;
        r1.f36196ag = r1.f36231r;
        r1.f36231r = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0214, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0215, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0216, code lost:
        r1.f36222i.mo21752b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021b, code lost:
        if (r4 != null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021e, code lost:
        r4.mo20818b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0221, code lost:
        r3 = r1.f36187aF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0223, code lost:
        if (r3 != null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0226, code lost:
        r4 = r3.f36564k;
     */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0573 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0574 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0590 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0591 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x05a5 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0646 A[Catch:{ all -> 0x06b3, all -> 0x0642, all -> 0x051b, all -> 0x04f0, all -> 0x04ec, all -> 0x04e8, all -> 0x04c1, all -> 0x0499, all -> 0x0474, all -> 0x03ca, all -> 0x03c6, all -> 0x035d, all -> 0x0336, all -> 0x01ae, all -> 0x06b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x06a5  */
    /* renamed from: b */
    public final void mo21329b(CriticalError criticalError) {
        Object obj;
        int i;
        nur nur;
        noh noh;
        bpea bpea;
        ScheduledExecutorService scheduledExecutorService;
        int i2;
        CriticalError criticalError2 = criticalError;
        synchronized (this.f36227n) {
            try {
                if (!mo21257T()) {
                    return;
                }
            } finally {
                Throwable th = th;
            }
        }
        this.f36222i = null;
        this.f36161F.quit();
        this.f36161F = null;
        noh = this.f36191ab;
        if (noh.f36338c) {
            noh.f36338c = false;
            Thread.setDefaultUncaughtExceptionHandler(noh.f36337b);
        }
        this.f36224k = null;
        this.f36230q = false;
        if (cctv.m131557b()) {
            if (this.f36231r != 1) {
                this.f36208as.remove(olq.FRAMER_READER_THREAD);
            }
            synchronized (this.f36208as) {
                for (olq olq : this.f36208as) {
                    bnsi c = f36155b.mo68388c();
                    c.mo68432a("noj", "aA", 2826, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Thread %s stuck in disconnect. Will kill process.", olq);
                    niw niw = this.f36168M;
                    bpeb bpeb = bpeb.CAR_SERVICE;
                    olq olq2 = olq.FRAMER_READER_THREAD;
                    int ordinal = olq.ordinal();
                    if (ordinal == 0) {
                        bpea = bpea.FRAMER_READER_THREAD_STUCK;
                    } else if (ordinal == 1) {
                        bpea = bpea.AUDIO_CAPTURE_THREAD_STUCK;
                    } else if (ordinal == i) {
                        bpea = bpea.VIDEO_FOCUS_HANDLING_THREAD_STUCK;
                    } else if (ordinal == 3) {
                        bpea = bpea.VIDEO_ENCODER_THREAD_STUCK;
                    } else if (ordinal == 4) {
                        bpea = bpea.WINDOW_MANAGER_COMPOSITION_THREAD_STUCK;
                    } else {
                        String valueOf = String.valueOf(olq);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("unknown thread type: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                    niw.mo20860a(bpeb, bpea);
                    i = 2;
                }
                if (!this.f36208as.isEmpty()) {
                    Process.killProcess(Process.myPid());
                }
            }
            this.f36168M.mo20849a();
        } else {
            if (this.f36231r == 1) {
                if (this.f36205ap) {
                    bnsi c2 = f36155b.mo68388c();
                    c2.mo68432a("noj", "b", 2791, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("reader thread stuck after cable removal. will kill process.");
                    Process.killProcess(Process.myPid());
                }
            }
            if (this.f36206aq) {
            }
            bnsi c3 = f36155b.mo68388c();
            c3.mo68432a("noj", "b", 2795, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68435a("thread stuck in disconnect. will kill process. audio:%b other:%b", this.f36206aq, this.f36207ar);
            Process.killProcess(Process.myPid());
        }
        this.f36205ap = false;
        this.f36206aq = false;
        this.f36207ar = false;
        this.f36208as.clear();
        this.f36196ag = this.f36231r;
        this.f36231r = -1;
        synchronized (this.f36204ao) {
            try {
                this.f36158C = null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f36172Q.mo22343a(this);
        return;
        this.f36209at = null;
        this.f36218e.mo17321e();
        if (this.f36231r != 1) {
            this.f36219f.unregisterReceiver(this.f36195af);
            try {
                mo21312aq();
            } catch (Exception e) {
            }
        }
        this.f36222i = null;
        this.f36161F.quit();
        this.f36161F = null;
        noh = this.f36191ab;
        if (noh.f36338c) {
        }
        this.f36224k = null;
        this.f36230q = false;
        if (cctv.m131557b()) {
        }
        this.f36205ap = false;
        this.f36206aq = false;
        this.f36207ar = false;
        this.f36208as.clear();
        this.f36196ag = this.f36231r;
        this.f36231r = -1;
        synchronized (this.f36204ao) {
        }
        nur.f36564k = null;
        if (nur.f36561h) {
            nur.f36561h = false;
            skh.m35531a().mo25689a(nur.f36558e, nur.f36562i);
        }
        ofd.m28611a(nur.f36558e, "com.google.android.gms.car.PROJECTION_ENDED", nur.m27785a(nur.f36556c.mo21351u()));
        this.f36187aF = null;
        this.f36157B.mo22222c();
        oeh oeh = this.f36159D;
        oeh.f37363m.mo22046b();
        BatteryStateMonitor batteryStateMonitor = oeh.f37358h;
        if (batteryStateMonitor.f29502e.getAndSet(false)) {
            batteryStateMonitor.f29500c.unregisterReceiver(batteryStateMonitor);
        }
        oeh.f37359i.clear();
        for (noe noe : this.f36236w) {
            th2 = noe.f36142c;
            if (th2 != null) {
                ((nvk) th2).f36661g = true;
                ((nvk) th2).mo21684e();
                synchronized (((nvk) th2).f36660f.f36587a) {
                    for (nvd nvd : ((nvk) th2).f36660f.f36589c) {
                        nvd.f36585a.f12819a.unlinkToDeath(nvd, 0);
                    }
                    ((nvk) th2).f36660f.f36589c.clear();
                    if (((nvk) th2).f36660f.f36588b != null) {
                        ((nvk) th2).f36660f.f36588b.f36583a.f12819a.unlinkToDeath(((nvk) th2).f36660f.f36588b, 0);
                    }
                    ((nvk) th2).f36660f.f36588b = null;
                }
                opo opo = ((nvk) th2).f36621V;
                ((opu) opo).f38196c.mo21648a().getContentResolver().unregisterContentObserver(((opu) opo).f38195b);
                ((nvk) th2).f36658d.mo21388b(((nvk) th2).f36633ac);
            }
            oad oad = noe.f36141b;
            if (oad != null) {
                oad.mo20658c();
            }
            nlv nlv = noe.f36143d;
            if (nlv != null) {
                nlv.f35981f.mo21388b(nlv.f35982g);
            }
        }
        this.f36236w.clear();
        if (this.f36197ah != null) {
            njp njp = this.f36197ah;
            ntq ntq = njp.f35848e;
            if (ntq != null) {
                ntq.f36458f = false;
                ntq.mo21573b();
                synchronized (ntq.f36456d) {
                    ntq.f36456d.clear();
                }
                njp.f35848e = null;
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (true) {
                nxc[] nxcArr = njp.f35846c;
                int length = nxcArr.length;
                if (i2 >= 3) {
                    break;
                }
                nxc nxc = nxcArr[i2];
                if (nxc != null) {
                    nxc.mo20679c();
                    njp.f35846c[i2] = null;
                }
                nxe nxe = njp.f35847d[i2];
                if (nxe != null) {
                    nxe.mo20658c();
                    njp.f35847d[i2] = null;
                }
                i2++;
            }
            nxg nxg = njp.f35853j;
            if (nxg != null) {
                ((AudioManager) nxg.f36859d.getSystemService("audio")).unregisterAudioPolicyAsync((AudioPolicy) nxg.f36856a);
            }
            synchronized (njp.f35845b) {
                njp.f35845b.clear();
            }
            synchronized (njp.f35844a) {
                for (njk njk : njp.f35844a) {
                    njk.mo20897b();
                }
                njp.f35844a.clear();
            }
            this.f36197ah = null;
        }
        nmv nmv = this.f36234u;
        if (nmv != null) {
            nmv.mo20658c();
            this.f36234u = null;
        }
        nkq nkq = this.f36237x;
        if (nkq != null) {
            nkq.f35909k.mo20944b();
            nkq.f35907i = true;
            for (nkp nkp : nkq.f35904f) {
                nkp.mo20957a();
            }
            nkq.f35904f.clear();
            nyh nyh = nkq.f35903e;
            nyh.f36940p = true;
            nyh.f36933i.removeCallbacksAndMessages(nyh.f36929e);
            nyh.f36933i.removeCallbacksAndMessages(nyh.f36930f);
            nyh.f36933i.removeCallbacksAndMessages(nyh.f36931g);
            nyh.f36933i.removeCallbacksAndMessages(nyh.f36932h);
            nyr nyr = nkq.f35902d;
            if (nyr != null && nyr.f36977n == 0) {
                nyr.f36977n = -1;
                nyr.f36965b.unregisterReceiver(nyr.f36972i);
                nyr.f36965b.unregisterReceiver(nyr.f36973j);
                nyr.f36965b.unregisterReceiver(nyr.f36974k);
                nyr.f36965b.unregisterReceiver(nyr.f36975l);
                nyr.f36965b.unregisterReceiver(nyr.f36976m);
                nyl nyl = nyr.f36978o;
                if (nyl != null) {
                    nyl.mo21849e();
                }
            }
            this.f36237x = null;
        }
        npk npk = this.f36238y;
        if (npk != null) {
            npk.f36333c = false;
            this.f36238y = null;
        }
        nma nma = this.f36198ai;
        if (nma != null) {
            nma.f36003d = false;
            synchronized (nma.f36001b) {
                nma.f36001b.clear();
            }
            this.f36198ai = null;
        }
        odm odm = this.f36199aj;
        if (odm != null) {
            odm.f37279c = false;
            synchronized (odm.f37277a) {
                odl odl = odm.f37278b;
                if (odl != null) {
                    IBinder iBinder = odl.f37275b.f12819a;
                    bmxy.m108581a(odl);
                    iBinder.unlinkToDeath(odl, 0);
                    odm.f37278b = null;
                }
            }
            this.f36199aj = null;
        }
        nme nme = this.f36200ak;
        if (nme != null) {
            nme.f36015c = false;
            synchronized (nme.f36014b) {
                while (!nme.f36014b.isEmpty()) {
                    nme.mo21107a((nmd) nme.f36014b.mo15621c(0));
                }
            }
            this.f36200ak = null;
        }
        nmg nmg = this.f36203an;
        if (nmg != null) {
            synchronized (nmg.f36025b) {
                nmg.f36025b.clear();
            }
            nmg.f36024a = false;
            synchronized (nmg.f36026c) {
                nmg.f36026c.clear();
            }
            synchronized (nmg.f36027d) {
                nmg.f36028e = null;
            }
            this.f36203an = null;
        }
        nmi nmi = this.f36235v;
        if (nmi != null) {
            synchronized (nmi.f36034a) {
                for (nmh nmh : nmi.f36035b) {
                    nmh.mo21143a();
                }
                nmi.f36035b.clear();
            }
            this.f36235v = null;
        }
        synchronized (this.f36239z) {
            for (npj npj : this.f36239z.values()) {
                npj.f36313d = false;
                npj.mo21410b();
                npj.mo21415d();
            }
        }
        this.f36157B.mo22223d();
        this.f36157B = null;
        this.f36233t = null;
        if (cctc.m131510b() && (scheduledExecutorService = this.f36188aG) != null) {
            scheduledExecutorService.shutdownNow();
            this.f36188aG = null;
        }
        OutputStream outputStream = this.f36209at;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
            }
            this.f36209at = null;
        }
        this.f36218e.mo17321e();
        if (this.f36231r != 1) {
        }
        this.f36222i = null;
        this.f36161F.quit();
        this.f36161F = null;
        noh = this.f36191ab;
        if (noh.f36338c) {
        }
        this.f36224k = null;
        this.f36230q = false;
        if (cctv.m131557b()) {
        }
        this.f36205ap = false;
        this.f36206aq = false;
        this.f36207ar = false;
        this.f36208as.clear();
        this.f36196ag = this.f36231r;
        this.f36231r = -1;
        synchronized (this.f36204ao) {
        }
    }

    /* renamed from: a */
    private final boolean m26948a(Intent intent, Bundle bundle, int i) {
        mo21255R();
        if (mo21194g() == null) {
            return false;
        }
        List a = this.f36171P.mo22055a(mo21346p(), mo21349s(), intent);
        if (a.isEmpty()) {
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "a", 2868, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Package in intent not found: %s is the service exported?", intent);
            return false;
        } else if (intent != null && intent.hasFileDescriptors()) {
            throw new IllegalArgumentException("File descriptors passed in Intent");
        } else {
            this.f36225l.post(new nng(this, i, a, intent, bundle));
            return true;
        }
    }

    /* renamed from: a */
    public final double mo21264a(String str, double d) {
        nyu a = nyu.m28208a();
        Pair a2 = nyu.m28207a(str, Double.valueOf(d));
        bdyx bdyx = (bdyx) a.f36991e.get(a2);
        if (bdyx == null) {
            a.f36991e.putIfAbsent(a2, bdyx.m91605a(a.f36987a, (String) a2.first, d));
            bdyx = (bdyx) a.f36991e.get(a2);
        }
        return ((Double) bdyx.mo58455c()).doubleValue();
    }

    /* renamed from: a */
    public final int mo21265a(String str, int i) {
        if (!this.f36220g.mo21385a(str)) {
            mo21305aj();
        }
        return this.f36220g.mo21378a(str, i);
    }

    /* renamed from: a */
    public final nsu mo21266a(String str) {
        mo21255R();
        npj b = mo21325b(str);
        b.mo21408a(this.f36157B);
        b.mo21406a();
        return b;
    }

    /* renamed from: a */
    public final void mo21267a(int i, int i2, bivd bivd) {
        throw new RuntimeException("Received car info while already running");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21268a(int i, bpdh bpdh) {
        String str;
        if (ccql.m131267b()) {
            String[] packagesForUid = this.f36219f.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                str = packagesForUid[0];
            } else {
                str = "unknown";
            }
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "a", 4485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Binder died: %s", str);
            this.f36168M.mo20858a(bpdi.CAR_SERVICE, bpdh, str);
        }
    }

    /* renamed from: a */
    public final void mo21269a(int i, boolean z) {
        ojq ojq;
        if (!((this.f36210au & 2) != 0 || (i & 2) == 0 || (ojq = this.f36157B) == null)) {
            oeh oeh = this.f36159D;
            int i2 = oeh.f37353c;
            int abs = Math.abs(i2 - oeh.f37351a);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - oeh.f37352b);
            int i3 = oeh.f37353c;
            ohc ohc = ojq.f37794d.f37583g;
            double d = (double) i3;
            double d2 = (double) abs;
            double d3 = (double) seconds;
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d);
            int i4 = (int) (d / (d2 / d3));
            if (!ohc.mo22144c()) {
                bnsi d4 = ohc.f37607a.mo68390d();
                d4.mo68432a("ohc", "a", 749, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d4.mo68405a("Unable to send battery status (protocol version too old)");
            } else {
                bxvd da = bioy.f121118e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bioy bioy = (bioy) da.f164949b;
                int i5 = bioy.f121120a | 1;
                bioy.f121120a = i5;
                bioy.f121121b = i2;
                int i6 = i5 | 2;
                bioy.f121120a = i6;
                bioy.f121122c = i4;
                bioy.f121120a = i6 | 4;
                bioy.f121123d = true;
                ohc.mo22206a(23, (bioy) da.mo74062i());
            }
        }
        this.f36210au = i;
    }

    /* renamed from: a */
    public final void mo21270a(long j, boolean z, byte[] bArr) {
        if (this.f36157B == null) {
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "a", 3969, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Tried to send Ping request to null controller");
        } else if (!mo21257T()) {
            bnsi c2 = f36155b.mo68388c();
            c2.mo68432a("noj", "a", 3973, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Not connected to car");
        } else if (bArr != null) {
            ohc ohc = this.f36157B.f37794d.f37583g;
            bxvd da = bitp.f121689e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bitp bitp = (bitp) da.f164949b;
            int i = bitp.f121691a | 1;
            bitp.f121691a = i;
            bitp.f121692b = j;
            bitp.f121691a = i | 2;
            bitp.f121693c = z;
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bitp bitp2 = (bitp) da.f164949b;
            a.getClass();
            bitp2.f121691a |= 4;
            bitp2.f121694d = a;
            ohc.mo22206a(11, (bitp) da.mo74062i());
        } else {
            this.f36157B.mo22214a(j, z);
        }
    }

    /* renamed from: a */
    public final void mo21186a(Configuration configuration, int i) {
        nip g = mo21194g();
        if (g != null) {
            g.mo20801a(configuration, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02a2, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo21271a(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        Intent intent;
        Bundle bundle2 = bundle;
        synchronized (this.f36227n) {
            if (mo21257T()) {
                this.f36176U = bundle2.getBoolean("use_car_activity_animations");
                this.f36177V = bundle2.getBoolean("use_sticky_window_focus", false);
                noe n = mo21344n();
                ccux.m131754c();
                oqa oqa = n.f36142c;
                int i2 = bundle2.getInt("pillar_width", -1);
                if (i2 == -1) {
                    if ("720p".equals(this.f36220g.mo21387b()) || "1080p".equals(this.f36220g.mo21387b())) {
                        i2 = 0;
                    }
                }
                ccux.m131754c();
                sdo.m34971a(true, (Object) "Multi-display does not support pillars.");
                if (i2 == -1) {
                    int i3 = (((nvk) oqa).f36668n.f38091a.f37029g * 1024) / 160;
                    if (((nvk) oqa).f36668n.f38096f > i3) {
                        i = ((nvk) oqa).f36668n.f38096f - i3;
                    } else {
                        i = 0;
                    }
                } else {
                    i = i2;
                }
                ((nvk) oqa).f36668n = new ooq(((nvk) oqa).f36668n.f38091a, ((nvk) oqa).f36668n.f38096f, ((nvk) oqa).f36668n.f38097g, ((nvk) oqa).f36668n.f38094d, i, ((nvk) oqa).f36668n.f38100j, ((nvk) oqa).f36668n.f38101k, ((nvk) oqa).f36668n.f38102l, ((nvk) oqa).f36668n.f38103m);
                if (bundle2.containsKey("content_bounds")) {
                    ((nvk) n.f36142c).f36669o = (Rect) bundle2.getParcelable("content_bounds");
                }
                if (bundle2.containsKey("content_insets")) {
                    ((nvk) n.f36142c).f36670p = (Rect) bundle2.getParcelable("content_insets");
                }
                mo21194g().mo20799a((ComponentName) bundle2.getParcelable("default_component"));
                if (n.mo21231a()) {
                    sdo.m34959a(this.f36187aF);
                    nur nur = this.f36187aF;
                    String str = null;
                    if (nur.f36561h && (intent = nur.f36560g) != null) {
                        if (intent.getPackage() != null) {
                            str = nur.f36560g.getPackage();
                        } else if (nur.f36560g.getComponent() != null) {
                            str = nur.f36560g.getComponent().getPackageName();
                        }
                    }
                    if (str != null) {
                        try {
                            Context createPackageContext = this.f36219f.createPackageContext(str, 0);
                            int a = this.f36183aB.mo21868a(createPackageContext);
                            if (a != 0) {
                                opo opo = ((nvk) n.f36142c).f36621V;
                                if (a != 0) {
                                    Pair a2 = ((opu) opo).f38197d.mo21870a(createPackageContext, a);
                                    int intValue = ((Integer) a2.first).intValue();
                                    int intValue2 = ((Integer) a2.second).intValue();
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
                                        bnsi c = opu.f38192a.mo68388c();
                                        c.mo68432a("opu", "b", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null. Not setting default content window animations.");
                                    } else if (intValue != 0) {
                                        ((opu) opo).f38202i = intValue;
                                        ((opu) opo).f38203j = intValue2;
                                        ((opu) opo).f38204k = ((opu) opo).mo22480a(createPackageContext, intValue);
                                        ((opu) opo).f38205l = ((opu) opo).mo22480a(createPackageContext, intValue2);
                                    }
                                } else {
                                    bnsi c2 = opu.f38192a.mo68388c();
                                    c2.mo68432a("opu", "b", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    c2.mo68405a("windowAnimationStyleRes is 0. Not setting default content window animations.");
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            bnsi b = f36155b.mo68387b();
                            b.mo68437a(e);
                            b.mo68432a("noj", "a", 2273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b.mo68420a("Failed to initialize default content window animations for package: %s", str);
                        }
                    }
                }
                for (noe noe : this.f36236w) {
                    noe.f36141b.mo21897f();
                }
                if (ccoy.m131100c()) {
                    ((nvk) n.f36142c).f36671q = bundle2.getInt("assistant_activity_z", 0);
                }
                int i4 = this.f36231r;
                synchronized (this.f36216c) {
                    this.f36216c.size();
                    this.f36181a.mo22276a(olm.CONNECTED);
                    this.f36194ae = true;
                    for (nnw nnw : this.f36216c.values()) {
                        try {
                            nnw.f36123c.mo21486a(i4);
                        } catch (RemoteException e2) {
                        }
                    }
                }
                if (this.f36232s) {
                    for (String str2 : m26950aB()) {
                        this.f36219f.sendBroadcast(new Intent("com.google.android.gms.car.CONNECTED").setFlags(32).setPackage(str2));
                    }
                }
                ExecutorService ax = m26951ax();
                ax.execute(new nnk(this));
                ax.shutdown();
                if (this.f36232s) {
                    ccux.m131754c();
                    mo21194g().mo20814a(this.f36165J, (ComponentName) bundle2.getParcelable("initial_component"));
                }
                if (this.f36231r != 0 && this.f36165J && n.f36141b != null && !this.f36220g.mo21394e()) {
                    n.f36141b.mo21896e();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo21272a(IBinder iBinder) {
        synchronized (this.f36216c) {
            nnw nnw = (nnw) this.f36216c.get(iBinder);
            if (nnw != null) {
                this.f36216c.remove(iBinder);
                iBinder.unlinkToDeath(nnw.f36121a, 0);
                if (this.f36216c.isEmpty()) {
                    this.f36180Z = null;
                    nuu.m27796b(new nnr(this));
                }
            } else {
                bnsi d = f36155b.mo68390d();
                d.mo68432a("noj", "a", 1133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("listener not found in list");
            }
        }
    }

    /* renamed from: a */
    public final void mo21187a(bipi bipi) {
        ojq ojq = this.f36157B;
        if (ojq != null && mo21257T()) {
            ojq.mo22215a(bipi);
            return;
        }
        bnsi c = f36155b.mo68388c();
        c.mo68432a("noj", "a", 3962, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Tried to send ByeBye request to null controller");
    }

    /* renamed from: a */
    public final void mo21273a(bpdn bpdn, bpdo bpdo, String str) {
        sdo.m34966a(bpdn, "errorCode is necessary");
        this.f36225l.post(new nno(this, bpdn, bpdo, str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nja.a(int, boolean):int
     arg types: [int, int]
     candidates:
      nja.a(android.content.pm.PackageManager, java.lang.String):java.lang.String
      nja.a(int, java.io.OutputStream):void
      nja.a(bios, int):void
      nja.a(bpdi, bpdh):void
      nja.a(bpeb, bpea):void
      nja.a(bxvd, int):void
      nja.a(byte[], int):void
      niw.a(int, java.io.OutputStream):void
      niw.a(bios, int):void
      niw.a(bpdi, bpdh):void
      niw.a(bpeb, bpea):void
      nja.a(int, boolean):int */
    /* renamed from: a */
    public final void mo21274a(CarFacet carFacet) {
        mo21305aj();
        niw niw = this.f36168M;
        if (carFacet != null) {
            long currentTimeMillis = System.currentTimeMillis();
            nja nja = (nja) niw;
            CarFacet carFacet2 = nja.f35787e;
            if (carFacet2 != null) {
                int a = nja.m26514a(bpdb.m111794a(carFacet2.f29318a), true);
                bxvd da = bpcz.f135895c.mo74144da();
                String str = nja.f35787e.f29319b;
                if (str != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpcz bpcz = (bpcz) da.f164949b;
                    str.getClass();
                    bpcz.f135897a |= 2;
                    bpcz.f135898b = str;
                }
                bxvd da2 = bpda.f135899d.mo74144da();
                bpcz bpcz2 = (bpcz) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpda bpda = (bpda) da2.f164949b;
                bpcz2.getClass();
                bpda.f135903c = bpcz2;
                int i = bpda.f135901a | 8;
                bpda.f135901a = i;
                long j = nja.f35788f;
                bpda.f135901a = i | 4;
                bpda.f135902b = currentTimeMillis - j;
                bpda bpda2 = (bpda) da2.mo74062i();
                bxvd c = nja.mo20870c();
                if (c.f164950c) {
                    c.mo74035c();
                    c.f164950c = false;
                }
                bpcl bpcl = (bpcl) c.f164949b;
                bpcl bpcl2 = bpcl.f135759L;
                bpda2.getClass();
                bpcl.f135777e = bpda2;
                bpcl.f135773a |= 4;
                nja.mo20868a(c, a);
            }
            nja.f35787e = carFacet;
            nja.f35788f = currentTimeMillis;
            int a2 = nja.m26514a(bpdb.m111794a(carFacet.f29318a), false);
            bxvd da3 = bpcz.f135895c.mo74144da();
            String str2 = carFacet.f29319b;
            if (str2 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpcz bpcz3 = (bpcz) da3.f164949b;
                str2.getClass();
                bpcz3.f135897a |= 2;
                bpcz3.f135898b = str2;
            }
            bxvd da4 = bpda.f135899d.mo74144da();
            bpcz bpcz4 = (bpcz) da3.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpda bpda3 = (bpda) da4.f164949b;
            bpcz4.getClass();
            bpda3.f135903c = bpcz4;
            bpda3.f135901a |= 8;
            bpda bpda4 = (bpda) da4.mo74062i();
            bxvd c2 = nja.mo20870c();
            if (c2.f164950c) {
                c2.mo74035c();
                c2.f164950c = false;
            }
            bpcl bpcl3 = (bpcl) c2.f164949b;
            bpcl bpcl4 = bpcl.f135759L;
            bpda4.getClass();
            bpcl3.f135777e = bpda4;
            bpcl3.f135773a |= 4;
            nja.mo20868a(c2, a2);
        }
    }

    /* renamed from: b */
    public final void mo21330b(String str, int i) {
        mo21305aj();
        this.f36220g.mo21389b(str, i);
    }

    /* renamed from: b */
    public final void mo21331b(nqv nqv) {
        mo21305aj();
        if (mo21194g() != null) {
            this.f36225l.post(new nni(this, nqv));
        }
    }

    /* renamed from: b */
    public final void mo21332b(nrl nrl) {
        mo21272a(nrl.f12819a);
    }

    /* renamed from: b */
    public final void mo21333b(nss nss) {
        this.f36217d.remove(nss);
    }

    /* renamed from: b */
    public final boolean mo21334b(String str, boolean z) {
        if (!this.f36220g.mo21385a(str)) {
            mo21305aj();
        }
        if ("car_force_logging".equals(str) && this.f36231r == 0) {
            return true;
        }
        return this.f36220g.mo21386a(str, z);
    }

    /* renamed from: a */
    public final void mo21275a(CarFrxEvent carFrxEvent) {
        mo21305aj();
        niw niw = this.f36168M;
        bxvd da = bpdc.f135904e.mo74144da();
        int i = carFrxEvent.f29320a;
        if (i >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc = (bpdc) da.f164949b;
            bpdc.f135906a |= 1;
            bpdc.f135907b = i;
        }
        int i2 = carFrxEvent.f29321b;
        if (i2 >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc2 = (bpdc) da.f164949b;
            bpdc2.f135906a |= 2;
            bpdc2.f135908c = i2;
        }
        int i3 = carFrxEvent.f29322c;
        if (i3 >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc3 = (bpdc) da.f164949b;
            bpdc3.f135906a |= 4;
            bpdc3.f135909d = i3;
        }
        nja nja = (nja) niw;
        bxvd c = nja.mo20870c();
        bpdc bpdc4 = (bpdc) da.mo74062i();
        if (c.f164950c) {
            c.mo74035c();
            c.f164950c = false;
        }
        bpcl bpcl = (bpcl) c.f164949b;
        bpcl bpcl2 = bpcl.f135759L;
        bpdc4.getClass();
        bpcl.f135779g = bpdc4;
        bpcl.f135773a |= 16;
        nja.mo20868a(c, 19);
    }

    /* renamed from: a */
    public final void mo21276a(CarInfo carInfo) {
        orf ai;
        CarInfo carInfo2;
        mo21305aj();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ai = mo21304ai();
            ai.f38270b.mo22644a(carInfo.f29335d, carInfo.f29332a);
            ai.close();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            if (mo21257T() && (carInfo2 = this.f36162G.f29539a) != null && carInfo.f29335d.equals(carInfo2.f29335d) && carInfo.f29332a.equals(carInfo2.f29332a)) {
                mo21327b(bipi.USER_SELECTION);
                return;
            }
            return;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo21277a(CarInfo carInfo, String str) {
        orf ai;
        mo21305aj();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ai = mo21304ai();
            ai.f38270b.mo22645a(carInfo.f29335d, carInfo.f29332a, str);
            ai.close();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo21278a(CarUiInfo carUiInfo) {
        ArrayList arrayList = new ArrayList();
        for (nss nss : this.f36217d) {
            try {
                nss.mo21545a(carUiInfo);
            } catch (RemoteException e) {
                bnsi c = f36155b.mo68388c();
                c.mo68437a(e);
                c.mo68432a("noj", "a", 4327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Exception notifying carUiInfo changed");
                arrayList.add(nss);
            }
        }
        this.f36217d.removeAll(arrayList);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo21188a(CriticalError criticalError) {
        boolean z;
        if (Looper.myLooper() == this.f36225l.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Teardown should happen in the default handler thread.");
        mo21329b(criticalError);
        if (!this.f36179Y) {
            this.f36218e.mo17318b();
        }
    }

    /* renamed from: a */
    public final void mo21279a(CarInfoInternal carInfoInternal, ojq ojq, int i, int i2, int i3, boolean z, omi omi) {
        synchronized (this.f36227n) {
            if (!mo21257T()) {
                this.f36192ac = true;
                m26945a(carInfoInternal, ojq, i, z);
            }
            this.f36193ad = false;
            this.f36178X = 2;
            nmv ar = mo21313ar();
            this.f36234u = ar;
            ar.mo21177a(omi);
        }
    }

    /* renamed from: a */
    public final void mo21189a(PrintWriter printWriter) {
        oei oei;
        int i;
        String str;
        String str2;
        String str3;
        String hashMap;
        String str4;
        String str5;
        PrintWriter printWriter2 = printWriter;
        boolean T = mo21257T();
        boolean z = this.f36194ae;
        StringBuilder sb = new StringBuilder(53);
        sb.append("connected in service:");
        sb.append(T);
        sb.append(", connected in client:");
        sb.append(z);
        printWriter2.println(sb.toString());
        int size = this.f36216c.size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("num car connection listeners:");
        sb2.append(size);
        printWriter2.println(sb2.toString());
        try {
            for (Map.Entry entry : this.f36216c.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                Context context = this.f36160E;
                int i2 = ((nnw) entry.getValue()).f36122b;
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str5 = "unknown";
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == i2) {
                        str5 = next.processName;
                        break;
                    }
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(str5).length());
                sb3.append("listener ");
                sb3.append(valueOf);
                sb3.append(":");
                sb3.append(str5);
                printWriter2.println(sb3.toString());
            }
        } catch (ConcurrentModificationException e) {
        }
        ofn ofn = this.f36169N;
        if (ofn != null) {
            printWriter2.println("*CarGalMonitor*");
            ofn.mo22104a(printWriter2);
        }
        if (mo21257T()) {
            int i3 = this.f36231r;
            StringBuilder sb4 = new StringBuilder(27);
            sb4.append("connection type:");
            sb4.append(i3);
            printWriter2.println(sb4.toString());
        } else {
            int i4 = this.f36196ag;
            StringBuilder sb5 = new StringBuilder(32);
            sb5.append("last connection type:");
            sb5.append(i4);
            printWriter2.println(sb5.toString());
        }
        if (this.f36162G != null) {
            if (!mo21257T()) {
                str4 = "last car info:";
            } else {
                str4 = "car info:";
            }
            String valueOf2 = String.valueOf(this.f36162G);
            StringBuilder sb6 = new StringBuilder(str4.length() + String.valueOf(valueOf2).length());
            sb6.append(str4);
            sb6.append(valueOf2);
            printWriter2.println(sb6.toString());
        }
        printWriter2.println("\nCarServiceSettings");
        for (Map.Entry<String, ?> entry2 : this.f36220g.f36296c.getAll().entrySet()) {
            String key = entry2.getKey();
            String valueOf3 = String.valueOf(entry2.getValue());
            StringBuilder sb7 = new StringBuilder(String.valueOf(key).length() + 2 + String.valueOf(valueOf3).length());
            sb7.append(key);
            sb7.append(": ");
            sb7.append(valueOf3);
            printWriter2.println(sb7.toString());
        }
        this.f36172Q.mo22342a(printWriter2);
        if (mo21257T()) {
            njp njp = this.f36197ah;
            if (njp != null) {
                printWriter2.println("\nCarAudioService");
                printWriter2.println("Audio Sources");
                boolean z2 = njp.f35850g;
                StringBuilder sb8 = new StringBuilder(36);
                sb8.append("force single channel capturing:");
                sb8.append(z2);
                printWriter2.println(sb8.toString());
                nxc[] nxcArr = njp.f35846c;
                int length = nxcArr.length;
                for (int i5 = 0; i5 < 3; i5++) {
                    nxc nxc = nxcArr[i5];
                    if (nxc != null) {
                        nxc.mo20672a(printWriter2);
                    } else {
                        printWriter2.println("null source service");
                    }
                }
                printWriter2.println("Audio Source BHs");
                nxe[] nxeArr = njp.f35847d;
                int length2 = nxeArr.length;
                for (int i6 = 0; i6 < 3; i6++) {
                    nxe nxe = nxeArr[i6];
                    if (nxe != null) {
                        nxe.mo20649a(printWriter2);
                    } else {
                        printWriter2.println("null source service BH");
                    }
                }
                printWriter2.println("Audio Source Clients");
                ntq ntq = njp.f35848e;
                if (ntq != null) {
                    printWriter2.println("Microphone Input");
                    boolean z3 = ntq.f36453a;
                    boolean z4 = ntq.f36458f;
                    StringBuilder sb9 = new StringBuilder(33);
                    sb9.append("discovered:");
                    sb9.append(z3);
                    sb9.append(" mic opened:");
                    sb9.append(z4);
                    printWriter2.println(sb9.toString());
                    StringBuilder sb10 = new StringBuilder(23);
                    sb10.append("stream type:0");
                    printWriter2.println(sb10.toString());
                    int size2 = ntq.f36456d.size();
                    StringBuilder sb11 = new StringBuilder(23);
                    sb11.append("num clients:");
                    sb11.append(size2);
                    printWriter2.println(sb11.toString());
                    printWriter2.println("Audio Configs");
                    CarAudioConfiguration[] carAudioConfigurationArr = ntq.f36454b;
                    if (carAudioConfigurationArr != null) {
                        for (CarAudioConfiguration carAudioConfiguration : carAudioConfigurationArr) {
                            if (carAudioConfiguration != null) {
                                printWriter2.println(carAudioConfiguration.toString());
                            } else {
                                printWriter2.println("null config");
                            }
                        }
                    } else {
                        printWriter2.println("null configs");
                    }
                    int i7 = ntq.f36457e.get();
                    StringBuilder sb12 = new StringBuilder(27);
                    sb12.append("frames received ");
                    sb12.append(i7);
                    printWriter2.println(sb12.toString());
                }
                printWriter2.println("Audio Focus");
                njj njj = njp.f35849f;
                String a = nxs.m28140a(njj.f35807g);
                String a2 = nxs.m28139a(njj.f35808h);
                StringBuilder sb13 = new StringBuilder(a.length() + 39 + a2.length());
                sb13.append("car focus state:");
                sb13.append(a);
                sb13.append(" focusRequestSentToCar:");
                sb13.append(a2);
                printWriter2.println(sb13.toString());
                nxr nxr = ((nxp) njj.f35805e).f36884c;
                synchronized (nxr.f36896e) {
                    hashMap = nxr.f36895d.toString();
                }
                String valueOf4 = String.valueOf(hashMap);
                printWriter2.println(valueOf4.length() == 0 ? new String("Audio focus grants: ") : "Audio focus grants: ".concat(valueOf4));
                printWriter2.print("per channel focus states:");
                nhw nhw = njj.f35802b;
                printWriter2.print("AudioStreamsManagerImpl per channel focus states:");
                int[] iArr = nhw.f35678c;
                for (int i8 : iArr) {
                    printWriter2.print(" ");
                    printWriter2.print(Integer.toHexString(i8));
                }
                printWriter2.println(" ");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i9 = njj.f35814n;
                long j = njj.f35815o;
                StringBuilder sb14 = new StringBuilder(121);
                sb14.append("num focus response fails:");
                sb14.append(i9);
                sb14.append(" last focus response fail time:");
                sb14.append(j);
                sb14.append(" while now is:");
                sb14.append(elapsedRealtime);
                printWriter2.println(sb14.toString());
            }
            nmv nmv = this.f36234u;
            if (nmv != null) {
                printWriter2.println("\nCarSensorService");
                nmv.mo20649a(printWriter2);
            }
            nmi nmi = this.f36235v;
            if (nmi != null) {
                printWriter2.println("\nCarRetailModeService");
                nmi.mo21147a(printWriter2);
            }
            for (noe noe : this.f36236w) {
                noe.mo21227a(printWriter2);
            }
            nip nip = this.f36158C;
            if (nip != null) {
                printWriter2.println("\nCarActivityManagerService");
                nip.mo20806a(printWriter2);
            }
            nkq nkq = this.f36237x;
            if (nkq != null) {
                printWriter2.println("\nBluetoothService");
                String valueOf5 = String.valueOf(nkq.f35901c);
                StringBuilder sb15 = new StringBuilder(String.valueOf(valueOf5).length() + 26);
                sb15.append("Preferred pairing method: ");
                sb15.append(valueOf5);
                printWriter2.println(sb15.toString());
                nyr nyr = nkq.f35902d;
                if (nyr != null) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("Phone MAC addr=");
                    nxy nxy = nyr.f36966c;
                    if (nxy != null) {
                        str2 = nxy.mo21818a();
                    } else {
                        str2 = "null";
                    }
                    sb16.append(str2);
                    sb16.append(", peer MAC addr=");
                    nxz nxz = nyr.f36968e;
                    if (nxz != null) {
                        str3 = nxz.f36910a.getAddress();
                    } else {
                        str3 = "null";
                    }
                    sb16.append(str3);
                    sb16.append(", init status=");
                    sb16.append(nyr.f36977n);
                    sb16.append(", ProfileUtil=");
                    sb16.append(nyr.f36978o);
                    sb16.append(", reqd pairing method=");
                    sb16.append(nyr.f36979p);
                    sb16.append(", reqd pairing key=");
                    sb16.append(nyr.f36980q);
                    sb16.append(", auth data from client=");
                    sb16.append(nyr.f36981r);
                    str = sb16.toString();
                } else {
                    str = "null";
                }
                String valueOf6 = String.valueOf(str);
                printWriter2.println(valueOf6.length() == 0 ? new String("BluetoothUtil info: ") : "BluetoothUtil info: ".concat(valueOf6));
                nyh nyh = nkq.f35903e;
                String b = nyh.m28165b(nyh.f36935k);
                String valueOf7 = String.valueOf(nyh.f36936l);
                int i10 = nyh.f36941q;
                int i11 = nyh.f36942r;
                StringBuilder sb17 = new StringBuilder(String.valueOf(b).length() + 98 + String.valueOf(valueOf7).length());
                sb17.append("mState=");
                sb17.append(b);
                sb17.append(", mPreviousTransition=");
                sb17.append(valueOf7);
                sb17.append(", mUnpairAttempts=");
                sb17.append(i10);
                sb17.append(", mConsecutiveUnpairAttempts=");
                sb17.append(i11);
                String valueOf8 = String.valueOf(sb17.toString());
                printWriter2.println(valueOf8.length() == 0 ? new String("BluetoothFsm info: ") : "BluetoothFsm info: ".concat(valueOf8));
                for (nkp nkp : nkq.f35904f) {
                    String valueOf9 = String.valueOf(nkp.f35897b.f12819a);
                    StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf9).length() + 8);
                    sb18.append("Client: ");
                    sb18.append(valueOf9);
                    printWriter2.println(sb18.toString());
                }
                int i12 = nkq.f35900b;
                StringBuilder sb19 = new StringBuilder(34);
                sb19.append("Initialization status: ");
                sb19.append(i12);
                printWriter2.println(sb19.toString());
            }
            if (this.f36198ai != null) {
                printWriter2.println("\nNavigationStatusService");
            }
            nmg nmg = this.f36203an;
            if (nmg != null) {
                printWriter2.println("\nRadioService");
                boolean z5 = nmg.f36024a;
                StringBuilder sb20 = new StringBuilder(28);
                sb20.append("connected to car radio:");
                sb20.append(z5);
                printWriter2.println(sb20.toString());
                synchronized (nmg.f36027d) {
                    if (nmg.f36028e != null) {
                        printWriter2.println("current radio state:");
                        printWriter2.print("  radio source enabled:");
                        printWriter2.print(nmg.f36028e.f29430a);
                        printWriter2.print("  muted:");
                        printWriter2.print(nmg.f36028e.f29431b);
                        printWriter2.print("  active radio id:");
                        printWriter2.print(nmg.f36028e.f29432c);
                        printWriter2.print("  station:");
                        printWriter2.print(nmg.f36028e.f29433d.f29437b);
                        printWriter2.print("  program list size:");
                        printWriter2.print(nmg.f36028e.f29434e.size());
                        int size3 = nmg.f36028e.f29435f.size();
                        StringBuilder sb21 = new StringBuilder(42);
                        sb21.append("  car station preset list size:");
                        sb21.append(size3);
                        printWriter2.print(sb21.toString());
                    } else {
                        printWriter2.println("current radio state: null");
                    }
                }
            }
            npk npk = this.f36238y;
            if (npk != null) {
                printWriter2.println("\nWifiProjectionService");
                printWriter2.println("**CarWifiProjectionService**");
                String valueOf10 = String.valueOf(npk.f36334d);
                printWriter2.println(valueOf10.length() == 0 ? new String("Car wifi MAC address is ") : "Car wifi MAC address is ".concat(valueOf10));
            }
            ArrayList arrayList = new ArrayList(this.f36239z.values());
            printWriter2.println("\nVendorExtensions");
            int size4 = arrayList.size();
            int i13 = 0;
            while (i13 < size4) {
                npj npj = (npj) arrayList.get(i13);
                String valueOf11 = String.valueOf(npj.f36310a);
                printWriter2.println(valueOf11.length() == 0 ? new String("Service Name: ") : "Service Name: ".concat(valueOf11));
                printWriter2.println("Package White List:");
                String[] strArr = npj.f36311b;
                int length3 = strArr.length;
                int i14 = 0;
                while (true) {
                    i = i13 + 1;
                    if (i14 >= length3) {
                        break;
                    }
                    printWriter2.println(strArr[i14]);
                    i14++;
                }
                i13 = i;
            }
            ojq ojq = this.f36157B;
            if (ojq != null) {
                printWriter2.println("\nProtocolManager");
                if (ojq.f37794d != null) {
                    printWriter2.println("\nChannelManager");
                    ogs ogs = ojq.f37794d;
                    if (ogs.f37594r.f37106f) {
                        printWriter2.println("\nGalSnoop message buffer:");
                        oaw oaw = ogs.f37594r;
                        SparseArray sparseArray = ogs.f37595s;
                        synchronized (oaw.f37102b) {
                            Iterator it2 = oaw.f37104d.iterator();
                            while (it2.hasNext()) {
                                oay oay = (oay) it2.next();
                                obe obe = (obe) sparseArray.get(oay.mo21912a());
                                if (obe == null || oay.mo21913b() == null || oay.mo21913b().remaining() < 2) {
                                    printWriter2.println(oay.toString());
                                } else {
                                    obe.mo21936a(oay.mo21931g(), oay.f37112a, oay.mo21916e(), oay.mo21913b(), printWriter);
                                }
                            }
                            oaw.f37104d.clear();
                        }
                    } else {
                        printWriter2.println("\nGalSnoop disabled");
                    }
                }
            }
            printWriter2.println("\nPowerManager");
            oeh oeh = this.f36159D;
            int i15 = oeh.f37360j;
            StringBuilder sb22 = new StringBuilder(31);
            sb22.append("useractivity status:");
            sb22.append(i15);
            printWriter2.println(sb22.toString());
            String hexString = Integer.toHexString(oeh.f37362l);
            int i16 = oeh.f37351a;
            float f = oeh.f37354d;
            int i17 = oeh.f37353c;
            boolean z6 = oeh.f37355e;
            boolean z7 = oeh.f37356f;
            boolean z8 = oeh.f37357g;
            StringBuilder sb23 = new StringBuilder(String.valueOf(hexString).length() + 131);
            sb23.append("powerState:0x");
            sb23.append(hexString);
            sb23.append(",initialLevel:");
            sb23.append(i16);
            sb23.append(",lasTemp:");
            sb23.append(f);
            sb23.append(",lastLevel:");
            sb23.append(i17);
            sb23.append(",tooHot:");
            sb23.append(z6);
            sb23.append(",tooLow:");
            sb23.append(z7);
            sb23.append(",droppedTooMuch:");
            sb23.append(z8);
            printWriter2.println(sb23.toString());
            printWriter2.println("BatteryTemperatureMonitor");
            BatteryStateMonitor batteryStateMonitor = oeh.f37358h;
            printWriter2.println("Temperature history in C");
            List list = batteryStateMonitor.f29499b;
            int size5 = list.size();
            for (int i18 = 0; i18 < size5; i18++) {
                Pair pair = (Pair) list.get(i18);
                String format = batteryStateMonitor.f29498a.format((Date) pair.first);
                String valueOf12 = String.valueOf(pair.second);
                StringBuilder sb24 = new StringBuilder(String.valueOf(format).length() + 1 + String.valueOf(valueOf12).length());
                sb24.append(format);
                sb24.append(" ");
                sb24.append(valueOf12);
                printWriter2.println(sb24.toString());
            }
            ody ody = this.f36156A;
            if (ody != null) {
                printWriter2.println("\nCarMessageService");
                int i19 = 0;
                while (true) {
                    odx[] odxArr = ody.f37321c;
                    int length4 = odxArr.length;
                    if (i19 >= 3) {
                        break;
                    }
                    odx odx = odxArr[i19];
                    if (odx != null) {
                        String valueOf13 = String.valueOf(odx.f37315d);
                        StringBuilder sb25 = new StringBuilder(String.valueOf(valueOf13).length() + 27);
                        sb25.append("category ");
                        sb25.append(i19);
                        sb25.append(" owner ");
                        sb25.append(valueOf13);
                        printWriter2.println(sb25.toString());
                    }
                    i19++;
                }
                boolean z9 = ody.f37323e;
                boolean z10 = ody.f37324f;
                StringBuilder sb26 = new StringBuilder(43);
                sb26.append("mNavigationFocusSet ");
                sb26.append(z9);
                sb26.append(" mVrFocusSet ");
                sb26.append(z10);
                printWriter2.println(sb26.toString());
            }
            nhf nhf = this.f36184aC;
            nit nit = (nit) nhf;
            if (nit.f35764e) {
                printWriter2.println("Dumping History of projecting process");
                synchronized (nit.f35768i) {
                    for (Map.Entry entry3 : ((nit) nhf).f35771l.entrySet()) {
                        String valueOf14 = String.valueOf((String) entry3.getKey());
                        printWriter2.println(valueOf14.length() == 0 ? new String("For process ") : "For process ".concat(valueOf14));
                        Iterator it3 = ((bnfd) entry3.getValue()).iterator();
                        while (it3.hasNext()) {
                            printWriter2.println((String) it3.next());
                        }
                    }
                }
            }
            oln oln = this.f36181a;
            printWriter2.println("Dumping history of connection state for Car Module:");
            olw olw = (olw) oln;
            List b2 = olw.mo22278b();
            int size6 = b2.size();
            for (int i20 = 0; i20 < size6; i20++) {
                ConnectionState connectionState = (ConnectionState) b2.get(i20);
                long j2 = connectionState.f29472a;
                String valueOf15 = String.valueOf(olm.values()[connectionState.f29473b]);
                StringBuilder sb27 = new StringBuilder(String.valueOf(valueOf15).length() + 21);
                sb27.append(j2);
                sb27.append(":");
                sb27.append(valueOf15);
                printWriter2.println(sb27.toString());
            }
            printWriter2.println("Dumping history of connection state for Car Module (human readable timestamps):");
            List b3 = olw.mo22278b();
            int size7 = b3.size();
            for (int i21 = 0; i21 < size7; i21++) {
                ConnectionState connectionState2 = (ConnectionState) b3.get(i21);
                String valueOf16 = String.valueOf(DateFormat.format("yyyy-MM-dd kk:mm:ss.SSS", connectionState2.f29472a));
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = connectionState2.f29475d;
                String valueOf17 = String.valueOf(olm.values()[connectionState2.f29473b]);
                StringBuilder sb28 = new StringBuilder(String.valueOf(valueOf16).length() + 48 + String.valueOf(valueOf17).length());
                sb28.append(valueOf16);
                sb28.append(" (");
                sb28.append(elapsedRealtime2 - j3);
                sb28.append(" elapsed realtime millis):");
                sb28.append(valueOf17);
                printWriter2.println(sb28.toString());
            }
            if (ccsn.f179851a.mo6606a().mo76722b() && (oei = this.f36171P) != null) {
                oei.mo22057a(printWriter2);
            }
        }
    }

    /* renamed from: a */
    public final void mo21190a(String str, String str2) {
        mo21305aj();
        this.f36220g.f36296c.edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final void mo21280a(String str, String str2, biww biww, int[] iArr) {
        orf orf;
        nkq nkq = this.f36237x;
        if (nkq != null) {
            CarInfoInternal carInfoInternal = this.f36162G;
            carInfoInternal.f29544f = nkq.f35908j;
            carInfoInternal.f29546h = this.f36238y.f36334d;
            carInfoInternal.f29545g = str;
            carInfoInternal.f29547i = str2;
            if (biww == null) {
                biww = biww.UNKNOWN_SECURITY_MODE;
            }
            this.f36162G.f29548j = biww.f122145k;
            try {
                orf = new orf(this.f36219f);
                orf.f38270b.mo22643a(this.f36162G);
                orf.close();
                return;
            } catch (RemoteException e) {
                bnsi b = f36155b.mo68387b();
                b.mo68432a("noj", "a", 4052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error while updating car wifi info");
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo21191a(String str, List list) {
        mo21305aj();
        this.f36220g.mo21390b(str, new HashSet(list));
    }

    /* renamed from: a */
    public final void mo21192a(String str, boolean z) {
        mo21305aj();
        this.f36220g.mo21391b(str, z);
    }

    /* renamed from: a */
    public final void mo21281a(nqv nqv) {
        ols.m29101a(this);
        if (mo21194g() != null) {
            this.f36225l.post(new nnh(this, nqv));
            return;
        }
        throw new IllegalStateException("CarNotConnected");
    }

    /* renamed from: a */
    public final void mo21282a(nrk nrk) {
        ols.m29101a(this);
        nns nns = new nns(this, nrk);
        nvg nvg = ((nvk) mo21344n().f36142c).f36665k;
        if (nvg == null) {
            try {
                nrk.mo21484a(null);
            } catch (RemoteException e) {
                bnsi b = f36155b.mo68387b();
                b.mo68432a("noj", "b", 1555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Client died whilst trying to indicate that screenshot wasn't available");
            }
        } else {
            nvg.mo21634a(nns);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r0.getCount() == 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        mo21354x();
        r0.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (r0.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS) != false) goto L_0x0085;
     */
    /* renamed from: a */
    public final void mo21283a(nrl nrl) {
        nnw nnw;
        CountDownLatch countDownLatch;
        int callingUid = Binder.getCallingUid();
        synchronized (this.f36216c) {
            nnw = new nnw(nrl, new nnp(this, nrl, callingUid));
            boolean isEmpty = this.f36216c.isEmpty();
            if (this.f36216c.put(nrl.f12819a, nnw) != null) {
                bnsi d = f36155b.mo68390d();
                d.mo68432a("noj", "a", 1060, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("listener already on list");
                return;
            } else if (isEmpty) {
                countDownLatch = new CountDownLatch(1);
                this.f36180Z = countDownLatch;
                nuu.m27796b(new nnq(this, countDownLatch));
            } else {
                countDownLatch = this.f36180Z;
            }
        }
        bnsi b = f36155b.mo68387b();
        b.mo68432a("noj", "a", 1100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Failed to wait for initialization...");
        synchronized (this.f36216c) {
            try {
                if (mo21199l()) {
                    nrl.mo21486a(this.f36231r);
                }
                nrl.f12819a.linkToDeath(nnw.f36121a, 0);
            } catch (RemoteException e) {
                mo21272a(nrl.f12819a);
            }
        }
    }

    /* renamed from: a */
    public final void mo21284a(nss nss) {
        mo21255R();
        this.f36217d.add(nss);
    }

    /* renamed from: a */
    public final void mo21285a(ohb ohb, String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        r8 = m26950aB();
        r0 = r8.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r1 >= r0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r7.f36219f.sendBroadcast(new android.content.Intent("com.google.android.gms.car.DISCONNECTED").setFlags(32).setPackage(r8[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo21286a(olm olm) {
        synchronized (this.f36216c) {
            boolean z = this.f36194ae;
            if (ccuz.m131757b()) {
                z = olm.equals(olm.CONNECTED);
            }
            if (!z) {
                bnsi d = f36155b.mo68390d();
                d.mo68432a("noj", "a", 3485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68409a("Not ready for clients, so not notifying car connection listeners of disconnection (%d listeners)", this.f36216c.size());
                return;
            }
            bnsi d2 = f36155b.mo68390d();
            d2.mo68432a("noj", "a", 3480, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68409a("Notifying car connection listeners of disconnection (%d listeners)", this.f36216c.size());
            int i = 0;
            this.f36194ae = false;
            Iterator it = this.f36216c.keySet().iterator();
            while (it.hasNext()) {
                try {
                    ((nnw) this.f36216c.get((IBinder) it.next())).f36123c.mo21485a();
                } catch (RemoteException e) {
                    bnsi b = f36155b.mo68387b();
                    b.mo68432a("noj", "a", 3499, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Remote exception calling onDisconnected, removing from list");
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21287a(olq olq) {
        bnsi c = f36155b.mo68388c();
        c.mo68432a("noj", "a", 2565, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("onGenericThreadStuck: %s", olq);
        this.f36208as.add(olq);
    }

    /* renamed from: a */
    public final void mo21193a(ouf ouf) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        synchronized (this.f36227n) {
            if (!mo21257T()) {
                this.f36173R = ouf;
                try {
                    this.f36162G = ouf.mo17429b();
                    this.f36231r = this.f36173R.mo17430c();
                    this.f36192ac = true;
                    this.f36181a.mo22276a(olm.CONNECTING);
                    ParcelFileDescriptor e = this.f36173R.mo17432e();
                    if (e != null) {
                        autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(e);
                    } else {
                        autoCloseOutputStream = null;
                    }
                    this.f36209at = autoCloseOutputStream;
                    this.f36168M.mo20852a(this.f36173R.mo17436i(), this.f36209at);
                    this.f36234u = mo21313ar();
                    omi j = this.f36173R.mo17437j();
                    if (j != null) {
                        this.f36234u.mo21177a(j);
                    }
                    ouf.mo17428a(new ouh(this));
                } catch (RemoteException e2) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21288a(boolean z) {
        mo21305aj();
        if (ccrj.f179800a.mo6606a().mo76680a()) {
            vsd vsd = new vsd(this.f36219f);
            if (z) {
                roz b = rpa.m34196b();
                b.f43472a = new vrz();
                b.f43473b = new Feature[]{vqa.f49783a};
                vsd.mo24732b(b.mo24977a());
                return;
            }
            roz b2 = rpa.m34196b();
            b2.f43472a = new vsa();
            b2.f43473b = new Feature[]{vqa.f49783a};
            vsd.mo24732b(b2.mo24977a());
        }
    }

    /* renamed from: a */
    public final void mo21289a(boolean z, CarInfoInternal carInfoInternal, ojq ojq, int i, int i2, int i3, boolean z2) {
        this.f36218e.mo17320d();
        Process.setThreadPriority(-8);
        synchronized (this.f36227n) {
            if (!mo21257T()) {
                this.f36192ac = true;
                m26945a(carInfoInternal, ojq, i, z2);
            }
            this.f36193ad = z;
            this.f36178X = 2;
            this.f36168M.mo20852a(i2, this.f36209at);
            mo21250M();
            mo21251N();
            this.f36233t = mo21314as();
            this.f36156A = mo21315at();
            this.f36235v = mo21316au();
            npx npx = new npx(this.f36220g, this.f36219f, this.f36222i, this.f36161F);
            nmv nmv = this.f36234u;
            if (nmv == null) {
                nmv ar = mo21313ar();
                this.f36234u = ar;
                ar.f36066d = npx;
            } else {
                nmv.f36066d = npx;
                npx.mo21438a(nmv);
            }
            this.f36228o = i3;
            this.f36227n.notifyAll();
            this.f36157B.mo22218a(this.f36233t, this.f36156A);
        }
        this.f36159D.mo22048a();
        this.f36159D.mo22051a(this);
        if (this.f36218e.mo17317a()) {
            this.f36172Q.mo22344a(this, 1000);
        }
    }

    /* renamed from: a */
    public final void mo21290a(byte[] bArr, int i) {
        int i2;
        mo21305aj();
        int i3 = 1;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            case 12:
                i2 = 13;
                break;
            case 13:
                i2 = 14;
                break;
            case 14:
                i2 = 15;
                break;
            case 15:
                i2 = 16;
                break;
            case 16:
                i2 = 17;
                break;
            case 17:
                i2 = 18;
                break;
            case 18:
                i2 = 19;
                break;
            case 19:
                i2 = 20;
                break;
            case 20:
                i2 = 21;
                break;
            case 21:
                i2 = 22;
                break;
            case 22:
                i2 = 23;
                break;
            case 23:
                i2 = 24;
                break;
            case 24:
                i2 = 25;
                break;
            case 25:
                i2 = 26;
                break;
            case 26:
                i2 = 27;
                break;
            case 27:
                i2 = 28;
                break;
            case 28:
                i2 = 29;
                break;
            case 29:
                i2 = 30;
                break;
            case 30:
                i2 = 31;
                break;
            case 31:
                i2 = 32;
                break;
            case 32:
                i2 = 33;
                break;
            case 33:
                i2 = 34;
                break;
            case 34:
                i2 = 35;
                break;
            case 35:
                i2 = 36;
                break;
            case 36:
                i2 = 37;
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                i2 = 38;
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                i2 = 39;
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                i2 = 40;
                break;
            case FelicaException.TYPE_PUSH_FAILED:
            default:
                i2 = 0;
                break;
            case 41:
                i2 = 42;
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                i2 = 43;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                i2 = 44;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                i2 = 45;
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                i2 = 46;
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                i2 = 47;
                break;
            case 47:
                i2 = 48;
                break;
            case 48:
                i2 = 49;
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                i2 = 50;
                break;
            case 50:
                i2 = 51;
                break;
            case 51:
                i2 = 52;
                break;
            case 52:
                i2 = 53;
                break;
            case 53:
                i2 = 54;
                break;
            case 54:
                i2 = 55;
                break;
            case 55:
                i2 = 56;
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                i2 = 57;
                break;
            case 57:
                i2 = 58;
                break;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                i2 = 59;
                break;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                i2 = 60;
                break;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                i2 = 61;
                break;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                i2 = 62;
                break;
            case 62:
                i2 = 63;
                break;
            case 63:
                i2 = 64;
                break;
            case 64:
                i2 = 65;
                break;
            case KeyInformation.AES128_DES56:
                i2 = 66;
                break;
            case 66:
                i2 = 67;
                break;
        }
        if (i2 == 0) {
            bnsi c = f36155b.mo68388c();
            c.mo68432a("noj", "a", 1521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68409a("Saw unknown CarEventType: %d.", i);
        } else {
            i3 = i2;
        }
        nja nja = (nja) this.f36168M;
        bxvd c2 = nja.mo20870c();
        try {
            c2.mo73635b(bArr, bxus.m123744c());
            nja.mo20868a(c2, i3);
        } catch (bxwf e) {
            bnsi c3 = nja.f35783a.mo68388c();
            c3.mo68432a("nja", "a", 490, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68405a("Error reading event proto");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21291a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                PrintWriter printWriter = new PrintWriter(new FileOutputStream("/dev/null"));
                this.f36218e.dump(null, printWriter, strArr);
                printWriter.close();
            } catch (IOException e) {
                bnsi b = f36155b.mo68387b();
                b.mo68437a(e);
                b.mo68432a("noj", "a", 3264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("handleAdbCommand failed");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21292a(int i) {
        nip g = mo21194g();
        if (g != null) {
            return g.mo20815a(i);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo21293a(Intent intent) {
        return mo21294a(intent, -1);
    }

    /* renamed from: a */
    public final boolean mo21294a(Intent intent, int i) {
        return m26948a(intent, (Bundle) null, i);
    }

    /* renamed from: a */
    public final boolean mo21295a(Intent intent, Bundle bundle) {
        return m26948a(intent, bundle, -1);
    }
}
