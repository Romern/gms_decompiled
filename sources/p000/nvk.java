package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.animation.Animation;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.ProjectionWindowManagerImpl$DumpReceiver;
import com.google.android.gms.car.TouchEventCompleteData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvk implements oqa, oal {

    /* renamed from: a */
    public static final bnsn f36599a = odk.m28481a("CAR.WM");

    /* renamed from: A */
    public int f36600A = 0;

    /* renamed from: B */
    public int f36601B = -1;

    /* renamed from: C */
    public final opw[] f36602C = new opw[3];

    /* renamed from: D */
    public final float[] f36603D = new float[16];

    /* renamed from: E */
    public final AtomicInteger f36604E = new AtomicInteger(0);

    /* renamed from: F */
    public final AtomicInteger f36605F = new AtomicInteger(0);

    /* renamed from: G */
    public volatile int f36606G = 0;

    /* renamed from: H */
    public int f36607H = 0;

    /* renamed from: I */
    public int f36608I = 0;

    /* renamed from: J */
    public int f36609J = 0;

    /* renamed from: K */
    public int f36610K = 0;

    /* renamed from: L */
    public final int[] f36611L = new int[6];

    /* renamed from: M */
    public final Object f36612M = new Object();

    /* renamed from: N */
    public final ArrayDeque f36613N = new ArrayDeque();

    /* renamed from: O */
    public final ArrayDeque f36614O = new ArrayDeque();

    /* renamed from: P */
    public int f36615P = 1;

    /* renamed from: Q */
    public nvj f36616Q = new nvj();

    /* renamed from: R */
    final SparseArray f36617R = new SparseArray(15);

    /* renamed from: S */
    public final Object f36618S = new Object();

    /* renamed from: T */
    public final SparseArray f36619T = new SparseArray();

    /* renamed from: U */
    public final List f36620U = new ArrayList();

    /* renamed from: V */
    public final opo f36621V;

    /* renamed from: W */
    public int f36622W = 0;

    /* renamed from: X */
    public SurfaceTexture f36623X;

    /* renamed from: Y */
    public nwv f36624Y;

    /* renamed from: Z */
    public final okf f36625Z;

    /* renamed from: aA */
    private final Handler f36626aA = new adzt(Looper.getMainLooper());

    /* renamed from: aB */
    private Animation f36627aB;

    /* renamed from: aC */
    private final Runnable f36628aC = new nvb(this);

    /* renamed from: aD */
    private final List f36629aD = new ArrayList();

    /* renamed from: aE */
    private nvj f36630aE;

    /* renamed from: aa */
    final ArrayList f36631aa = new ArrayList();

    /* renamed from: ab */
    volatile boolean f36632ab;

    /* renamed from: ac */
    public final SharedPreferences.OnSharedPreferenceChangeListener f36633ac = new nuv(this);

    /* renamed from: ae */
    private final opy f36634ae;

    /* renamed from: af */
    private final nlm f36635af;

    /* renamed from: ag */
    private final olo f36636ag;

    /* renamed from: ah */
    private final olr f36637ah;

    /* renamed from: ai */
    private final oeh f36638ai;

    /* renamed from: aj */
    private BroadcastReceiver f36639aj;

    /* renamed from: ak */
    private Thread f36640ak;

    /* renamed from: al */
    private boolean f36641al;

    /* renamed from: am */
    private volatile boolean f36642am = false;

    /* renamed from: an */
    private float f36643an = 0.0f;

    /* renamed from: ao */
    private float f36644ao = 0.0f;

    /* renamed from: ap */
    private final boolean f36645ap;

    /* renamed from: aq */
    private volatile long f36646aq = 14;

    /* renamed from: ar */
    private long f36647ar;

    /* renamed from: as */
    private double f36648as;

    /* renamed from: at */
    private final oad f36649at;

    /* renamed from: au */
    private final SparseLongArray f36650au = new SparseLongArray();

    /* renamed from: av */
    private final SparseArray f36651av = new SparseArray();

    /* renamed from: aw */
    private final C1245ok f36652aw = new C1245ok();

    /* renamed from: ax */
    private final SparseBooleanArray f36653ax = new SparseBooleanArray();

    /* renamed from: ay */
    private int f36654ay;

    /* renamed from: az */
    private volatile int f36655az;

    /* renamed from: b */
    boolean f36656b = false;

    /* renamed from: c */
    public final Context f36657c;

    /* renamed from: d */
    public final npd f36658d;

    /* renamed from: e */
    public final olt f36659e;

    /* renamed from: f */
    public final nve f36660f;

    /* renamed from: g */
    public boolean f36661g;

    /* renamed from: h */
    public volatile Surface f36662h;

    /* renamed from: i */
    public Semaphore f36663i;

    /* renamed from: j */
    public Looper f36664j;

    /* renamed from: k */
    public volatile nvg f36665k;

    /* renamed from: l */
    public nqe f36666l;

    /* renamed from: m */
    public volatile opx f36667m;

    /* renamed from: n */
    public volatile ooq f36668n;

    /* renamed from: o */
    public Rect f36669o;

    /* renamed from: p */
    public Rect f36670p;

    /* renamed from: q */
    public int f36671q;

    /* renamed from: r */
    public final boolean f36672r;

    /* renamed from: s */
    public volatile int f36673s;

    /* renamed from: t */
    public volatile int f36674t;

    /* renamed from: u */
    public volatile int f36675u;

    /* renamed from: v */
    public boolean f36676v = false;

    /* renamed from: w */
    public int f36677w;

    /* renamed from: x */
    public volatile boolean f36678x = false;

    /* renamed from: y */
    public volatile boolean f36679y = false;

    /* renamed from: z */
    public int f36680z = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, int, boolean):oos
     arg types: [oos, int, int]
     candidates:
      nvk.a(int, int, int):int
      nvk.a(oos, long, int):long
      nvk.a(oos, android.graphics.Rect, oos):android.graphics.Rect
      nvk.a(oos, int, oos):void
      nvk.a(oos, boolean, boolean):void
      nvk.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      nvk.a(oos, boolean, android.view.animation.Animation):void
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void
      nvk.a(oos, int, boolean):oos */
    /* renamed from: D */
    private final void m27825D() {
        int i;
        Rect rect;
        if (this.f36632ab) {
            m27828G();
            Region region = new Region();
            int i2 = 8;
            while (i2 > 0) {
                List<oos> list = (List) this.f36619T.get(i2);
                if (list != null) {
                    for (oos oos : list) {
                        if (!oos.mo22438c(64)) {
                            Rect n = oos.mo22449n();
                            Region region2 = new Region(n);
                            region2.op(region, Region.Op.DIFFERENCE);
                            if (!region2.isEmpty()) {
                                rect = region2.getBounds();
                            } else {
                                rect = null;
                            }
                            if (rect != null) {
                                this.f36620U.add(new C1240of(rect, oos));
                                region.op(n, Region.Op.UNION);
                            }
                            if (oos.mo22438c(16)) {
                                i2 = 0;
                            }
                        }
                    }
                }
                i2--;
            }
            ArrayList arrayList = new ArrayList(this.f36620U);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                oos oos2 = (oos) ((C1240of) arrayList.get(i3)).f26799b;
                if (m27836a(oos2, 21, false) != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (m27836a(oos2, 19, false) != null) {
                    i |= 2;
                }
                if (m27836a(oos2, 22, false) != null) {
                    i |= 4;
                }
                if (m27836a(oos2, 20, false) != null) {
                    i |= 8;
                }
                CarWindowManagerLayoutParams e = oos2.mo22440e();
                if (i != e.f29396a) {
                    e.f29396a = i;
                    oos2.mo22425a(e);
                }
            }
        }
    }

    /* renamed from: E */
    private final boolean m27826E() {
        return m27854h(7);
    }

    /* renamed from: F */
    private final boolean m27827F() {
        return m27854h(5);
    }

    /* renamed from: G */
    private final void m27828G() {
        this.f36620U.clear();
    }

    /* renamed from: H */
    private final void m27829H() {
        nvg nvg = this.f36665k;
        if (nvg != null) {
            nvg.mo21635b();
        }
    }

    /* renamed from: I */
    private static void m27830I() {
        ccux.m131754c();
    }

    /* renamed from: a */
    private static int m27831a(int i, int i2, int i3) {
        if (i2 != i3) {
            i = Math.round((((float) i) * ((float) i2)) / ((float) i3));
        }
        if (i < i2) {
            return i;
        }
        bnsi c = f36599a.mo68388c();
        c.mo68432a("nvk", "a", 786, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68409a("Calculated height %d too large", i);
        return i2 - 1;
    }

    /* renamed from: b */
    private final int m27845b(String str, String str2) {
        int a;
        int a2 = m27832a(35633, str);
        if (a2 == 0 || (a = m27832a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        opv.m29540a(f36599a, "glCreateProgram");
        if (glCreateProgram == 0) {
            bnsi b = f36599a.mo68387b();
            b.mo68432a("nvk", "b", 3297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, a2);
        opv.m29540a(f36599a, "glAttachShader");
        GLES20.glAttachShader(glCreateProgram, a);
        opv.m29540a(f36599a, "glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        bnsi b2 = f36599a.mo68387b();
        b2.mo68432a("nvk", "b", 3307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68420a("Could not link program: %s", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    /* renamed from: c */
    private final void m27850c(oeq oeq) {
        int i;
        oeq oeq2 = oeq;
        int i2 = oeq2.f37404e;
        int i3 = oeq2.f37405f;
        oep[] oepArr = oeq2.f37406g;
        if (i3 >= oepArr.length) {
            bnsi b = f36599a.mo68387b();
            b.mo68432a("nvk", "c", 2176, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68409a("Touch event's action index out of array %d", i3);
            return;
        }
        oep oep = oepArr[i3];
        oos b2 = m27846b(oep.f37396g, oep.f37394e, oep.f37395f);
        if (b2 == null) {
            bnsi b3 = f36599a.mo68387b();
            b3.mo68432a("nvk", "c", 2184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b3.mo68405a("Touch event does not correspond to a window layer");
            return;
        }
        ArrayList arrayList = new ArrayList();
        oep[] oepArr2 = oeq2.f37406g;
        int i4 = 0;
        for (oep oep2 : oepArr2) {
            if (b2 == m27846b(oep2.f37396g, oep2.f37394e, oep2.f37395f)) {
                arrayList.add(oep2);
                if (oep2 == oep) {
                    i3 = i4;
                }
                i4++;
            }
        }
        if (arrayList.size() == 1) {
            if (i2 == 5) {
                int i5 = oep.f37396g;
                i2 = 0;
            } else if (i2 == 6) {
                int i6 = oep.f37396g;
                i2 = 1;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long a = m27833a(b2, uptimeMillis, i2);
        if (i2 == 5 || i2 == 6) {
            i = i2 | (i3 << 8);
        } else {
            i = i2;
        }
        m27840a(b2, a, uptimeMillis, i, arrayList);
        if (i == 6 || i == 1) {
            m27852f(oep.f37396g);
        }
    }

    /* renamed from: e */
    private final void m27851e(int i) {
        this.f36673s = i;
        mo21694j();
    }

    /* renamed from: f */
    private final void m27852f(int i) {
        this.f36651av.remove(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        return null;
     */
    /* renamed from: g */
    private final oos m27853g(int i) {
        synchronized (this.f36618S) {
            List list = (List) this.f36619T.get(i);
            if (list != null && !list.isEmpty()) {
                if (list.size() > 1) {
                    bnsi c = f36599a.mo68388c();
                    c.mo68432a("nvk", "g", 2695, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("More than one active window, picking top");
                }
                oos oos = (oos) list.get(0);
                return oos;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return false;
     */
    /* renamed from: h */
    private final boolean m27854h(int i) {
        if (!this.f36642am) {
            return false;
        }
        synchronized (this.f36618S) {
            List<oos> list = (List) this.f36619T.get(i);
            if (list != null) {
                for (oos oos : list) {
                    if (oos.mo22443h()) {
                        return true;
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final List m27855i(int i) {
        List list = (List) this.f36619T.get(i);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f36619T.put(i, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static final boolean m27856j(int i) {
        return i == 20 || i == 19 || i == 22 || i == 21;
    }

    /* renamed from: k */
    private static final boolean m27857k(int i) {
        return i == 21 || i == 22 || i == 1 || i == 2;
    }

    /* renamed from: m */
    private final void m27858m(oos oos) {
        nvg nvg;
        if (oos != null && (nvg = this.f36665k) != null) {
            nvg.mo21636b(oos);
        }
    }

    /* renamed from: n */
    private final C1240of m27859n(oos oos) {
        List list = this.f36620U;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C1240of ofVar = (C1240of) list.get(i);
            i++;
            if (ofVar.f26799b == oos) {
                return ofVar;
            }
        }
        return null;
    }

    /* renamed from: o */
    private final void m27860o(oos oos) {
        int j = oos.mo22445j();
        List list = (List) this.f36617R.get(j);
        if (list != null && list.remove(oos)) {
            bnsi d = f36599a.mo68390d();
            d.mo68432a("nvk", "o", 3878, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68425a("Removed window from stable z: %d. Window removed: %s. Remaining windows: %d", Integer.valueOf(j), oos, Integer.valueOf(list.size()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, int, android.graphics.Rect):void
     arg types: [oos, int, int, ?[OBJECT, ARRAY]]
     candidates:
      nvk.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      oqa.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      nvk.a(oos, boolean, int, android.graphics.Rect):void */
    /* renamed from: p */
    private final synchronized void m27861p(oos oos) {
        m27841a(oos, true, -1, (Rect) null);
    }

    /* renamed from: A */
    public final int mo21645A() {
        return this.f36668n.f38094d == 1.0f ? 9728 : 9729;
    }

    /* renamed from: B */
    public final void mo21646B() {
        opx opx = this.f36667m;
        if (opx != null) {
            opx.mo22508a(0L);
        }
    }

    /* renamed from: C */
    public final void mo21647C() {
        opx opx;
        if (this.f36642am && (opx = this.f36667m) != null) {
            opx.mo22507a();
        }
    }

    /* renamed from: a */
    public final Context mo21648a() {
        return this.f36657c;
    }

    /* renamed from: a */
    public final void mo21653a(int i) {
        this.f36655az = i;
    }

    /* renamed from: b */
    public final opo mo21671b() {
        return this.f36621V;
    }

    /* renamed from: d */
    public final void mo21680d(int i) {
        if (i != this.f36601B) {
            GLES20.glUseProgram(this.f36602C[i].f38213a);
            this.f36601B = i;
        }
    }

    /* renamed from: i */
    public final boolean mo21693i() {
        return this.f36642am;
    }

    /* renamed from: l */
    public final void mo21698l() {
        synchronized (this.f36612M) {
            if (!this.f36613N.isEmpty()) {
                this.f36625Z.f37703f.mo20695d((int) ((SystemClock.elapsedRealtimeNanos() - ((Long) this.f36613N.peek()).longValue()) / 1000));
                return;
            }
            bnsi c = f36599a.mo68388c();
            c.mo68432a("nvk", "l", 1068, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("More frames are encoded than they were sent to the encoder");
        }
    }

    /* renamed from: o */
    public final ooq mo21702o() {
        return this.f36668n;
    }

    /* renamed from: p */
    public final int mo21703p() {
        return this.f36673s;
    }

    /* renamed from: q */
    public final void mo21704q() {
        if (!this.f36678x) {
            oeh oeh = this.f36638ai;
            oeh.getClass();
            nuu.m27792a(new nux(oeh));
        }
        opx opx = this.f36667m;
        if (opx != null) {
            opx.mo22507a();
        }
    }

    /* renamed from: r */
    public final int mo21705r() {
        sdo.m34959a(this.f36668n);
        return this.f36668n.f38091a.f37029g;
    }

    /* renamed from: s */
    public final Point mo21706s() {
        if (this.f36668n != null) {
            return new Point(this.f36668n.f38099i, this.f36668n.f38097g);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final oos mo21707t() {
        if (!this.f36632ab) {
            return m27853g(this.f36615P);
        }
        return this.f36616Q.mo21642a();
    }

    /* renamed from: u */
    public final synchronized int mo21708u() {
        return this.f36615P;
    }

    /* renamed from: v */
    public final void mo21709v() {
        opx opx = this.f36667m;
        if (opx != null) {
            opx.mo22510b();
        }
        int i = this.f36680z;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f36680z = 0;
        }
        int i2 = this.f36600A;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f36600A = 0;
        }
        mo21657a(bngx.m109376e());
        nwv nwv = this.f36624Y;
        if (nwv != null) {
            nwv.mo21768a();
            this.f36624Y = null;
        }
        SurfaceTexture surfaceTexture = this.f36623X;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f36623X = null;
        }
        int i3 = this.f36622W;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.f36622W = 0;
        }
        nqe nqe = this.f36666l;
        if (nqe != null) {
            nqe.mo21451a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo21710w() {
        int size = this.f36617R.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            List list = (List) this.f36617R.valueAt(i);
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((oos) list.get(i2)).mo22429a()) {
                        z = true;
                    }
                }
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f36647ar;
        if (cctl.f179894a.mo6606a().mo76760e()) {
            double d = (double) elapsedRealtime;
            double d2 = this.f36648as;
            double d3 = (double) this.f36675u;
            Double.isNaN(d3);
            if (d >= d2 - (500.0d / d3)) {
                double d4 = this.f36648as;
                double d5 = (double) this.f36675u;
                Double.isNaN(d5);
                if (d > d4 + (500.0d / d5)) {
                    this.f36648as = d;
                }
                double d6 = this.f36648as;
                double d7 = (double) this.f36675u;
                Double.isNaN(d7);
                this.f36648as = d6 + (1000.0d / d7);
            } else {
                opx opx = this.f36667m;
                if (opx != null) {
                    double d8 = this.f36648as;
                    double d9 = (double) this.f36675u;
                    Double.isNaN(d9);
                    Double.isNaN(d);
                    opx.mo22508a((long) ((d8 + (500.0d / d9)) - d));
                    this.f36609J++;
                    return;
                }
                return;
            }
        } else if (j < this.f36646aq) {
            opx opx2 = this.f36667m;
            if (opx2 != null) {
                opx2.mo22508a(opx2.f38221d - j);
                this.f36609J++;
                return;
            }
            return;
        }
        if (((long) this.f36605F.get()) >= ccur.f180000a.mo6606a().mo76853d()) {
            opx opx3 = this.f36667m;
            if (opx3 != null) {
                opx3.mo22508a(20L);
                this.f36610K++;
                return;
            }
            return;
        }
        if (cctl.m131526d() && this.f36656b) {
            this.f36667m.mo22508a(100L);
        }
        if (!z) {
            this.f36608I++;
        } else {
            this.f36607H++;
        }
        this.f36647ar = elapsedRealtime;
        this.f36605F.incrementAndGet();
        synchronized (this.f36612M) {
            this.f36613N.add(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        }
        mo21711x();
        if (this.f36642am) {
            this.f36666l.mo21453c();
        }
    }

    /* renamed from: x */
    public final void mo21711x() {
        if (!this.f36656b) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        } else if (!cctl.m131526d()) {
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        } else if (SystemClock.elapsedRealtime() % 1000 > 500) {
            GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        }
        GLES20.glClear(16640);
        int size = this.f36617R.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f36617R.valueAt(i2);
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (((oos) list.get(i3)).mo22431a(this.f36603D)) {
                        i++;
                    }
                }
            }
        }
        if (i < 6) {
            int[] iArr = this.f36611L;
            iArr[i] = iArr[i] + 1;
        }
        opv.m29540a(f36599a, "window draw");
    }

    /* renamed from: y */
    public final int mo21712y() {
        return this.f36680z;
    }

    /* renamed from: z */
    public final int mo21713z() {
        return this.f36600A;
    }

    public nvk(opy opy, Context context, nlm nlm, olo olo, olr olr, npd npd, olt olt, oad oad, oeh oeh, okf okf) {
        if (ccql.m131269d()) {
            ofd.m28611a(context, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", ofa.STARTED);
        }
        this.f36634ae = opy;
        this.f36660f = new nve(this);
        this.f36625Z = okf;
        boolean a = npe.m27158a(npe.m27154a(ccuf.f179931a.mo6606a().mo76799j()), olo.mo21346p());
        this.f36672r = a;
        if (a) {
            m27851e(30);
        } else {
            m27851e((int) ccuf.m131592c());
        }
        this.f36657c = context;
        this.f36649at = oad;
        this.f36635af = nlm;
        this.f36636ag = olo;
        this.f36637ah = olr;
        this.f36658d = npd;
        this.f36659e = olt;
        this.f36638ai = oeh;
        this.f36621V = new opu(this);
        nlv d = nlm.mo21044d();
        sdo.checkIfNull(d, "CarInputService cannot be null");
        this.f36645ap = d.mo21078b();
        CarUiInfo carUiInfo = d.f35983h;
        sdo.m34959a(carUiInfo);
        this.f36641al = carUiInfo.f29370b;
        npd.mo21382a(this.f36633ac);
        this.f36656b = npd.mo21395f();
        m27830I();
    }

    /* renamed from: d */
    public final synchronized void mo21681d(oos oos) {
        mo21662a(oos, 0);
    }

    /* renamed from: e */
    public final synchronized void mo21684e() {
        nvj nvj = this.f36616Q;
        nvj nvj2 = new nvj();
        nvj2.f36598a.addAll(nvj.f36598a);
        this.f36630aE = nvj2;
        this.f36629aD.clear();
        synchronized (this.f36618S) {
            for (int i = 1; i < 8; i++) {
                List list = (List) this.f36619T.get(i);
                if (list != null) {
                    if (!list.isEmpty()) {
                        this.f36629aD.addAll(list);
                    }
                }
            }
        }
        if (this.f36642am) {
            synchronized (this.f36660f.f36587a) {
                for (nvd nvd : this.f36660f.f36589c) {
                    try {
                        nvd.f36585a.mo21546a(false);
                    } catch (RemoteException e) {
                    }
                }
            }
            if (this.f36639aj != null) {
                aki.m919a(this.f36657c).mo872a(this.f36639aj);
                this.f36639aj = null;
            }
            this.f36642am = false;
            if (this.f36667m != null) {
                this.f36667m.mo22510b();
            }
            this.f36621V.mo22481a();
            try {
                if (this.f36664j != null) {
                    m27829H();
                    this.f36664j.quitSafely();
                    this.f36640ak.join(3000);
                }
            } catch (InterruptedException e2) {
                bnsi b = f36599a.mo68387b();
                b.mo68437a(e2);
                b.mo68432a("nvk", "e", 864, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Interrupted exception before composition thread joined");
            }
            if (this.f36640ak.isAlive()) {
                bnsi c = f36599a.mo68388c();
                c.mo68432a("nvk", "e", 867, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("CompositionThread still alive!");
                if (cctv.m131557b()) {
                    this.f36637ah.mo21287a(olq.WINDOW_MANAGER_COMPOSITION_THREAD);
                } else {
                    this.f36637ah.mo21298ac();
                }
            }
            this.f36667m = null;
            this.f36640ak = null;
            this.f36662h = null;
            this.f36663i = null;
            this.f36665k = null;
            this.f36664j = null;
        }
    }

    /* renamed from: f */
    public final void mo21686f() {
        this.f36625Z.mo22245f();
    }

    /* renamed from: j */
    public final void mo21694j() {
        int i;
        if (this.f36674t <= 0) {
            i = this.f36673s;
        } else {
            i = this.f36674t;
        }
        if (i != this.f36675u) {
            this.f36675u = i;
            this.f36646aq = ((long) (1000 / this.f36675u)) - 1;
            opx opx = this.f36667m;
            if (opx != null) {
                opx.mo22511b(i);
                synchronized (this.f36618S) {
                    for (int i2 = 0; i2 < this.f36619T.size(); i2++) {
                        for (oos oos : (List) this.f36619T.valueAt(i2)) {
                            if (oos != null) {
                                oos.mo22415a(i);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo21696k() {
        int decrementAndGet = this.f36605F.decrementAndGet();
        if (decrementAndGet < 0) {
            bnsi d = f36599a.mo68390d();
            d.mo68432a("nvk", "k", 1059, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("negative remaining frames:%d", decrementAndGet);
            this.f36605F.set(0);
        }
    }

    /* renamed from: n */
    public final int mo21701n() {
        return this.f36668n.f38097g;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    private final int m27832a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        bnsn bnsn = f36599a;
        StringBuilder sb = new StringBuilder(31);
        sb.append("glCreateShader type=");
        sb.append(i);
        opv.m29540a(bnsn, sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        bnsi b = f36599a.mo68387b();
        b.mo68432a("nvk", "a", 3276, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68413a("Could not compile shader %d: %s", i, (Object) GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: f */
    public final synchronized void mo21687f(oos oos) {
        m27848b(oos, (Animation) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, int, android.graphics.Rect):void
     arg types: [oos, int, int, ?[OBJECT, ARRAY]]
     candidates:
      nvk.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      oqa.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      nvk.a(oos, boolean, int, android.graphics.Rect):void */
    /* renamed from: i */
    public final synchronized void mo21692i(oos oos) {
        m27841a(oos, false, -1, (Rect) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        return;
     */
    /* renamed from: m */
    public final void mo21700m() {
        synchronized (this.f36612M) {
            if (!this.f36613N.isEmpty()) {
                long longValue = ((Long) this.f36613N.pop()).longValue();
                while (!this.f36614O.isEmpty() && ((Long) ((C1240of) this.f36614O.peek()).f26798a).longValue() <= longValue) {
                    this.f36625Z.mo22243a((biwb) ((C1240of) this.f36614O.pop()).f26799b);
                }
            } else {
                bnsi c = f36599a.mo68388c();
                c.mo68432a("nvk", "m", 1081, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("More frames are encoded than they were sent to the encoder");
            }
        }
    }

    /* renamed from: d */
    public final void mo21682d(oos oos, int i) {
        int i2;
        int i3;
        if (mo21679c()) {
            i3 = oos.mo22444i();
            oos.mo22433b(i);
            i2 = oos.mo22444i();
        } else {
            i2 = oos.mo22444i();
            i3 = i2 + 1;
        }
        List list = (List) this.f36617R.get(i3);
        if (list != null) {
            list.remove(oos);
            List list2 = (List) this.f36617R.get(i2);
            if (list2 == null) {
                list2 = new ArrayList(2);
                this.f36617R.put(i2, list2);
            }
            m27837a(list2, oos);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, oos, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: k */
    public final void mo21697k(oos oos) {
        int i = oos.mo22444i();
        List list = (List) this.f36617R.get(i);
        if (list == null) {
            list = new ArrayList(2);
            this.f36617R.put(i, list);
        }
        if (list.contains(oos)) {
            bnsi d = f36599a.mo68390d();
            d.mo68432a("nvk", "k", 3762, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68422a("window init window already in list %s for z %d", (Object) oos, i);
        } else {
            m27837a(list, oos);
        }
        if (i % 2 == 0) {
            if (!mo21679c()) {
                List list2 = (List) this.f36617R.get(i - 1);
                if (list2 != null) {
                    list2.remove(oos);
                }
            } else {
                List list3 = (List) this.f36617R.get(i - 1);
                if (list3 != null && list3.remove(oos)) {
                    list3.size();
                }
                List list4 = (List) this.f36617R.get(i + 1);
                if (list4 != null && list4.remove(oos)) {
                    list4.size();
                }
            }
        }
        oos.mo22453r();
        list.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, oos]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: l */
    public final void mo21699l(oos oos) {
        if (oos != null) {
            int i = oos.mo22444i();
            if (i % 2 == 1) {
                if (!mo21679c()) {
                    List list = (List) this.f36617R.get(i + 1);
                    if (list != null) {
                        list.remove(oos);
                    }
                } else {
                    int j = oos.mo22445j();
                    List list2 = (List) this.f36617R.get(j);
                    if (list2 != null && list2.remove(oos)) {
                        bnsi d = f36599a.mo68390d();
                        d.mo68432a("nvk", "o", 3878, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68425a("Removed window from stable z: %d. Window removed: %s. Remaining windows: %d", Integer.valueOf(j), oos, Integer.valueOf(list2.size()));
                    }
                }
            }
            this.f36621V.mo22483a(oos);
            oos.mo22455t();
            oos.mo22418a(0L);
            List list3 = (List) this.f36617R.get(i);
            if (list3 == null || !list3.contains(oos)) {
                bnsi d2 = f36599a.mo68390d();
                d2.mo68432a("nvk", "l", 3857, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68413a("window cleanup window not in list for z %d win %s", i, (Object) oos);
                mo21646B();
                return;
            }
            list3.remove(oos);
            if (list3.size() == 0) {
                this.f36617R.remove(i);
            }
            list3.size();
            mo21646B();
        }
    }

    /* renamed from: a */
    private final long m27833a(oos oos, long j, int i) {
        if (i != 0) {
            return this.f36650au.get(oos.mo22439d());
        }
        this.f36650au.put(oos.mo22439d(), j);
        return j;
    }

    /* renamed from: h */
    public final void mo21690h() {
        if (this.f36642am) {
            if (this.f36639aj != null) {
                aki.m919a(this.f36657c).mo872a(this.f36639aj);
                this.f36639aj = null;
            }
            this.f36642am = false;
            opx opx = this.f36667m;
            if (opx != null) {
                opx.mo22510b();
            }
            Looper looper = this.f36664j;
            if (looper != null) {
                m27829H();
                looper.quitSafely();
            }
        }
    }

    /* renamed from: g */
    public final void mo21688g() {
        this.f36625Z.mo22244d(2);
    }

    @Deprecated
    /* renamed from: j */
    public final void mo21695j(oos oos) {
        nvg nvg = this.f36665k;
        if (nvg != null) {
            nvg.mo21637c(oos);
        }
    }

    /* renamed from: a */
    private final Rect m27834a(oos oos, Rect rect, oos oos2) {
        C1240of n = m27859n(oos);
        C1240of n2 = m27859n(oos2);
        if (n == null || n2 == null) {
            bnsi c = f36599a.mo68388c();
            c.mo68432a("nvk", "a", 3041, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68424a("Unable to compute focusedRect in target window due to non-focusable window. fromWindow: %s, toWindow: %s", n, n2);
            return null;
        }
        Rect rect2 = new Rect();
        Rect rect3 = (Rect) n.f26798a;
        Rect rect4 = (Rect) n2.f26798a;
        rect2.set((rect3.left + rect.left) - rect4.left, (rect3.top + rect.top) - rect4.top, (rect3.left + rect.right) - rect4.left, (rect3.top + rect.bottom) - rect4.top);
        return rect2;
    }

    /* renamed from: b */
    private final oos m27846b(int i, int i2, int i3) {
        oos oos = (oos) this.f36651av.get(i);
        if (oos != null) {
            return oos;
        }
        synchronized (this.f36618S) {
            int i4 = 7;
            loop0:
            while (true) {
                if (i4 <= 0) {
                    r3 = null;
                    break;
                }
                List<oos> list = (List) this.f36619T.get(i4);
                if (list != null) {
                    for (oos oos2 : list) {
                        if (oos2 != null && oos2.mo22443h() && oos2.mo22430a(i2, i3)) {
                            if (!cctl.m131528f() || oos2.mo22413I()) {
                            }
                        }
                    }
                    continue;
                }
                i4--;
            }
        }
        this.f36651av.put(i, oos2);
        return oos2;
    }

    /* renamed from: g */
    public final boolean mo21689g(oos oos) {
        boolean z = !oos.mo22438c(1);
        if (!this.f36634ae.mo21232b() && z && oos.mo22438c(32)) {
            z = !this.f36641al;
        }
        synchronized (this.f36618S) {
            Iterator it = this.f36620U.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C1240of) it.next()).f26799b == oos) {
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo21691h(oos oos) {
        m27858m(oos);
    }

    /* renamed from: a */
    static oos m27835a(ooq ooq, List list, oos oos, int i, boolean z, Rect rect) {
        boolean z2;
        boolean z3;
        Collections.sort(list, new nuy(i));
        oos oos2 = null;
        boolean z4 = false;
        C1240of ofVar = null;
        int i2 = 0;
        while (i2 < list.size()) {
            ofVar = (C1240of) list.get(i2);
            if (ofVar.f26799b == oos) {
                break;
            }
            i2++;
        }
        if (i == 19) {
            z2 = true;
        } else {
            z2 = i == 20;
        }
        if (i == 20 || i == 22) {
            z4 = true;
        }
        int i3 = -1;
        if (ofVar != null) {
            i3 = !z2 ? ((Rect) ofVar.f26798a).left : ((Rect) ofVar.f26798a).top;
        } else if (z4) {
            i2 = -1;
        } else {
            i3 = !z2 ? ooq.f38099i : ooq.f38097g;
            i2 = -1;
        }
        int i4 = i2 + 1;
        Rect rect2 = new Rect();
        while (i4 >= 0 && i4 < list.size()) {
            C1240of ofVar2 = (C1240of) list.get(i4);
            if (!z || ((oos) ofVar2.f26799b).mo22438c(4)) {
                int i5 = !z2 ? ((Rect) ofVar2.f26798a).left : ((Rect) ofVar2.f26798a).top;
                if ((z4 && i5 > i3) || (!z4 && i5 < i3)) {
                    if (rect == null) {
                        return (oos) ofVar2.f26799b;
                    }
                    if (!z2) {
                        Rect rect3 = (Rect) ofVar2.f26798a;
                        rect2.set(rect3.left, rect.top, rect3.right, rect.bottom);
                        z3 = Rect.intersects(rect2, rect3);
                    } else {
                        Rect rect4 = (Rect) ofVar2.f26798a;
                        rect2.set(rect.left, rect4.top, rect.right, rect4.bottom);
                        z3 = Rect.intersects(rect2, rect4);
                    }
                    if (z3) {
                        return (oos) ofVar2.f26799b;
                    }
                    if (oos2 == null) {
                        oos2 = (oos) ofVar2.f26799b;
                    }
                }
            }
            i4++;
        }
        return oos2;
    }

    /* renamed from: d */
    public final boolean mo21683d() {
        return mo21679c();
    }

    /* renamed from: c */
    public final opw mo21676c(int i) {
        return this.f36602C[i];
    }

    /* renamed from: b */
    private final void m27847b(oeq oeq) {
        oep oep = oeq.f37406g[0];
        int i = oep.f37394e;
        int i2 = oep.f37395f;
        int i3 = oep.f37396g;
        int i4 = oeq.f37404e;
        oos b = m27846b(i3, i, i2);
        if (b == null) {
            bnsi c = f36599a.mo68388c();
            c.mo68432a("nvk", "b", 2131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Touch event does not correspond to a window layer");
            return;
        }
        List singletonList = Collections.singletonList(oep);
        long uptimeMillis = SystemClock.uptimeMillis();
        m27840a(b, m27833a(b, uptimeMillis, i4), uptimeMillis, i4, singletonList);
        if (i4 == 1) {
            m27852f(i3);
        } else if (i4 == 0 && cctl.m131528f()) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.f36618S) {
                for (int i5 = 7; i5 > 0; i5--) {
                    List<oos> list = (List) this.f36619T.get(i5);
                    if (list != null) {
                        for (oos oos : list) {
                            if (!(oos == null || oos == b || !oos.mo22412H())) {
                                arrayList.add(oos);
                            }
                        }
                    }
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((oos) arrayList.get(i6)).mo22420a(uptimeMillis, singletonList);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo21677c(oos oos) {
        mo21664a(oos, (Animation) null);
    }

    /* renamed from: c */
    public final void mo21678c(oos oos, int i) {
        nvg nvg = this.f36665k;
        if (nvg != null) {
            nvg.mo21633a(oos, i);
        }
    }

    /* renamed from: c */
    public final boolean mo21679c() {
        return this.f36634ae.mo21231a();
    }

    /* renamed from: e */
    public final synchronized void mo21685e(oos oos) {
        m27839a(oos, 0, (oos) null);
    }

    /* renamed from: a */
    private final oos m27836a(oos oos, int i, boolean z) {
        return m27835a(this.f36668n, this.f36620U, oos, i, z, null);
    }

    /* renamed from: a */
    public static final void m27837a(List list, oos oos) {
        int i = 0;
        while (i < list.size() && oos.mo22446k() >= ((oos) list.get(i)).mo22446k()) {
            i++;
        }
        list.add(i, oos);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        return;
     */
    /* renamed from: b */
    private final synchronized void m27848b(oos oos, Animation animation) {
        boolean z;
        oos oos2;
        oos oos3;
        if (oos != null) {
            boolean a = this.f36616Q.mo21643a(oos);
            this.f36616Q.f36598a.remove(oos);
            if (this.f36642am) {
                this.f36629aD.remove(oos);
            }
            int d = oos.mo22439d();
            synchronized (this.f36618S) {
                List list = (List) this.f36619T.get(d);
                if (list != null) {
                    z = list.remove(oos);
                    if (z && list.isEmpty()) {
                        this.f36619T.remove(d);
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    m27825D();
                }
            }
            int c = oos.mo22436c();
            if (c == 5) {
                bnsi d2 = f36599a.mo68390d();
                d2.mo68432a("nvk", "b", 1755, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68420a("removing window that is already removed %s", oos);
                oos.mo22442g();
                return;
            }
            if (c == 4) {
                if (this.f36621V.mo22489c(oos)) {
                    oos.mo22442g();
                }
            }
            if (!z) {
                oos.mo22408D();
                m27858m(oos);
                oos.mo22442g();
                return;
            }
            if (!this.f36632ab) {
                if (this.f36615P == d) {
                    if (!(d == 3 || d == 6)) {
                        if (d != 7) {
                            if (d != 4) {
                                if (d == 5) {
                                    mo21692i(m27853g(1));
                                }
                            }
                        }
                    }
                    if (m27827F()) {
                        mo21692i(m27853g(5));
                    } else {
                        mo21692i(m27853g(1));
                    }
                }
            } else if (a) {
                nvj nvj = this.f36616Q;
                nuw nuw = new nuw(this);
                while (true) {
                    oos2 = null;
                    if (nvj.f36598a.isEmpty()) {
                        oos3 = null;
                        break;
                    }
                    oos3 = (oos) nvj.f36598a.pop();
                    if (nuw.f36574a.mo21689g(oos3)) {
                        break;
                    }
                }
                if (oos3 == null) {
                    synchronized (this.f36618S) {
                        for (C1240of ofVar : this.f36620U) {
                            if (((oos) ofVar.f26799b).mo22439d() <= oos.mo22439d() && !((oos) ofVar.f26799b).mo22438c(1)) {
                                if (oos2 == null || oos2.mo22439d() < ((oos) ofVar.f26799b).mo22439d()) {
                                    oos2 = (oos) ofVar.f26799b;
                                }
                            }
                        }
                    }
                    oos3 = oos2;
                }
                mo21692i(oos3);
            }
            oos.mo22408D();
            if (mo21679c()) {
                if (!oos.mo22443h()) {
                    m27858m(oos);
                } else if (d != 1) {
                    this.f36621V.mo22485a(oos, animation, true);
                    oos.mo22442g();
                } else {
                    this.f36621V.mo22488c(oos, animation);
                }
            } else if (oos.mo22443h()) {
                this.f36621V.mo22485a(oos, animation, true);
                oos.mo22442g();
            } else {
                m27858m(oos);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* renamed from: a */
    private final void m27838a(oos oos, int i, nvg nvg, Rect rect, Rect rect2, Animation animation, Animation animation2) {
        Rect rect3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        Rect rect4 = rect;
        int i11 = this.f36668n.f38099i;
        int intValue = ((Integer) f38227ad.get(Integer.valueOf(i))).intValue();
        int i12 = 48;
        int i13 = 0;
        switch (i10) {
            case 1:
                i12 = 0;
                i7 = 0;
                if (rect4 == null) {
                    i13 = rect4.left;
                    i8 = this.f36668n.f38097g - rect4.bottom;
                    i4 = rect.width();
                    i9 = rect.height();
                } else {
                    i8 = this.f36668n.f38100j;
                    i9 = this.f36668n.f38097g - this.f36668n.f38100j;
                    i4 = i11;
                }
                rect3 = rect2;
                i3 = i9;
                i6 = i8;
                i2 = i7;
                i5 = i13;
                i13 = i12;
                break;
            case 2:
                i3 = this.f36668n.f38100j;
                i4 = i11;
                rect3 = null;
                i6 = 0;
                i5 = 0;
                i2 = 0;
                break;
            case 3:
            case 8:
                i3 = this.f36668n.f38097g;
                i4 = i11;
                rect3 = null;
                i6 = 0;
                i5 = 0;
                i2 = 0;
                break;
            case 4:
                if (cctl.m131524b()) {
                    if (!ccoy.m131099b()) {
                        i12 = 16;
                    }
                    if (ccoy.m131100c()) {
                        if (!m27827F()) {
                            i6 = this.f36668n.f38100j;
                            i13 = i12;
                            rect3 = null;
                            i3 = this.f36668n.f38097g - this.f36668n.f38100j;
                            i5 = 0;
                            i2 = 0;
                            i4 = i11;
                            break;
                        } else {
                            i3 = this.f36668n.f38097g;
                            i4 = i11;
                            i13 = i12;
                            rect3 = null;
                            i6 = 0;
                            i5 = 0;
                            i2 = 0;
                            break;
                        }
                    } else {
                        i7 = this.f36671q;
                        if (rect4 == null) {
                        }
                        rect3 = rect2;
                        i3 = i9;
                        i6 = i8;
                        i2 = i7;
                        i5 = i13;
                        i13 = i12;
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("SystemDecor window must be created using createCarWindow");
                }
                break;
            case 5:
                if (this.f36655az != 3) {
                    i3 = this.f36668n.f38102l;
                    i4 = i11;
                    rect3 = null;
                    i6 = 0;
                    i5 = 0;
                    i2 = 0;
                    break;
                } else {
                    i3 = this.f36668n.f38103m;
                    i4 = i11;
                    rect3 = null;
                    i6 = 0;
                    i5 = 0;
                    i2 = 0;
                    break;
                }
            case 6:
                i12 = 0;
                if (ccoy.m131100c()) {
                }
                break;
            case 7:
                i6 = this.f36668n.f38097g - this.f36668n.f38101k;
                i4 = i11;
                i3 = this.f36668n.f38101k;
                rect3 = null;
                i5 = 0;
                i2 = 0;
                break;
            default:
                StringBuilder sb = new StringBuilder(48);
                sb.append("no layout specified for window layer ");
                sb.append(i10);
                throw new RuntimeException(sb.toString());
        }
        if (i10 == 2 || i10 == 7 || i10 == 3) {
            i13 |= 1;
        }
        if (i10 == 7) {
            i13 |= 4;
        }
        if (i10 == 2 || i10 == 7) {
            i13 |= 2;
        }
        if (i10 == 6) {
            if (!cctl.m131524b()) {
                i13 |= 16;
                if (ccoy.m131099b() && i2 == this.f36671q) {
                    i13 |= 32;
                }
            } else {
                throw new IllegalArgumentException("Use SYSTEM_UI_WINDOW_ORDER, ASSISTANT_WINDOW_ORDER should no longer be used.");
            }
        }
        if (i10 == 2) {
            i13 |= 8;
        }
        oos.mo22416a(i5, i6, i4, i3, intValue, i2, rect3, animation, animation2, i10 == 8 ? i13 | 64 : i13);
        nvg.mo21632a(oos);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, boolean):void
     arg types: [oos, int, int]
     candidates:
      nvk.a(int, int, int):int
      nvk.a(oos, long, int):long
      nvk.a(oos, android.graphics.Rect, oos):android.graphics.Rect
      nvk.a(oos, int, boolean):oos
      nvk.a(oos, int, oos):void
      nvk.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      nvk.a(oos, boolean, android.view.animation.Animation):void
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void
      nvk.a(oos, boolean, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f8  */
    /* renamed from: a */
    private final synchronized void m27839a(oos oos, int i, oos oos2) {
        boolean z;
        oos oos3;
        int c = oos.mo22436c();
        boolean z2 = true;
        if (c != 1) {
            if (c != 0) {
                bnsi c2 = f36599a.mo68388c();
                c2.mo68432a("nvk", "a", 1583, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68420a("attachProjectionWindow while window is in wrong state: %s", oos);
                mo21687f(oos);
                oos.mo22407C();
                return;
            }
        }
        int d = oos.mo22439d();
        synchronized (this.f36618S) {
            List i2 = m27855i(d);
            int i3 = 0;
            while (true) {
                if (i3 >= i2.size()) {
                    break;
                } else if (oos.mo22446k() >= ((oos) i2.get(i3)).mo22446k()) {
                    break;
                } else {
                    i3++;
                }
            }
            m27855i(d).add(i3, oos);
            m27825D();
        }
        oos.mo22406B();
        if (this.f36629aD.contains(oos)) {
            this.f36629aD.remove(oos);
            if (this.f36629aD.isEmpty()) {
                z = true;
                if (!this.f36632ab) {
                    if (z) {
                        nvj nvj = this.f36630aE;
                        if (nvj != null) {
                            oos3 = nvj.mo21642a();
                            if (!z2) {
                                oos.mo22432b();
                            } else {
                                mo21692i(oos3);
                            }
                            if (z) {
                                nvj nvj2 = this.f36630aE;
                                if (nvj2 != null) {
                                    this.f36616Q = nvj2;
                                    this.f36630aE = null;
                                }
                            }
                        }
                    }
                    if (!this.f36645ap || (i & 1) == 0) {
                        if (mo21689g(oos)) {
                            if (this.f36634ae.mo21232b()) {
                                if (oos.mo22438c(32)) {
                                    if (this.f36641al) {
                                        oos3 = null;
                                        z2 = false;
                                    } else {
                                        oos3 = oos;
                                    }
                                } else if (mo21707t() == null) {
                                    oos3 = oos;
                                } else if (oos2 == null) {
                                    oos3 = null;
                                    z2 = false;
                                } else if (oos2.mo22439d() != 1) {
                                    oos3 = null;
                                    z2 = false;
                                } else if (oos.mo22439d() != 1) {
                                }
                                if (!z2) {
                                }
                                if (z) {
                                }
                            }
                            oos3 = oos;
                            if (!z2) {
                            }
                            if (z) {
                            }
                        }
                        oos3 = null;
                        z2 = false;
                        if (!z2) {
                        }
                        if (z) {
                        }
                    } else {
                        oos3 = null;
                        z2 = false;
                        if (!z2) {
                        }
                        if (z) {
                        }
                    }
                } else if (d == this.f36615P) {
                    this.f36616Q.mo21644b(oos);
                    m27842a(oos, true, false);
                    return;
                } else if (!(d == 7 || d == 2 || d == 8)) {
                    mo21692i(oos);
                }
            }
        }
        z = false;
        if (!this.f36632ab) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (m27826E() != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r10 == 19) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (m27826E() != false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007e A[RETURN] */
    /* renamed from: b */
    private final boolean m27849b(int i, int i2) {
        int i3 = 7;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                bnsi b = f36599a.mo68387b();
                                b.mo68432a("nvk", "b", 3204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                b.mo68405a("You added a window layer but didn't update onUnhandledKeyEvent");
                            } else {
                                if (i2 == 20) {
                                    i3 = m27827F() ? 5 : 1;
                                } else if (i2 == 4) {
                                    i3 = 2;
                                }
                                if (i == i3) {
                                    return false;
                                }
                                mo21692i(m27853g(i3));
                                return true;
                            }
                        } else if (i2 == 20) {
                            i3 = m27827F() ? 5 : 2;
                            if (i == i3) {
                            }
                        }
                    } else if (i2 == 19) {
                    }
                }
            }
            i3 = 1;
            if (i == i3) {
            }
        } else {
            if (i2 == 20) {
                i3 = m27827F() ? 5 : 2;
            } else if (i2 != 19) {
                if (i2 == 4) {
                    i3 = 2;
                }
            }
            if (i == i3) {
            }
        }
        i3 = i;
        if (i == i3) {
        }
    }

    /* renamed from: b */
    public final int mo21670b(int i) {
        return Math.round((((float) i) * ((float) mo21705r())) / 160.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo21672b(MotionEvent motionEvent) {
        this.f36641al = false;
        if (this.f36642am) {
            nvc nvc = this.f36660f.f36588b;
            if (nvc != null) {
                try {
                    nrq nrq = nvc.f36583a;
                    Parcel bj = nrq.mo8529bj();
                    dcl.m8165a(bj, motionEvent);
                    nrq.mo8530c(1, bj);
                } catch (RemoteException e) {
                }
            }
            oos t = mo21707t();
            if (t != null) {
                if (this.f36645ap) {
                    if (motionEvent.getAction() == 0) {
                        this.f36643an = motionEvent.getX();
                        this.f36644ao = motionEvent.getY();
                    }
                    t.mo22435b(motionEvent);
                    return;
                }
                t.mo22435b(motionEvent);
            }
        }
    }

    /* renamed from: a */
    private final void m27840a(oos oos, long j, long j2, int i, List list) {
        if (!this.f36632ab) {
            if (oos.mo22439d() != this.f36615P) {
                m27861p(oos);
            }
        } else if (oos != this.f36616Q.mo21642a()) {
            m27861p(oos);
        }
        oos.mo22419a(j, j2, i, list);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, boolean):void
     arg types: [oos, int, boolean]
     candidates:
      nvk.a(int, int, int):int
      nvk.a(oos, long, int):long
      nvk.a(oos, android.graphics.Rect, oos):android.graphics.Rect
      nvk.a(oos, int, boolean):oos
      nvk.a(oos, int, oos):void
      nvk.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      nvk.a(oos, boolean, android.view.animation.Animation):void
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void
      nvk.a(oos, boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, boolean, int, android.graphics.Rect):void
     arg types: [oos, int, boolean, int, android.graphics.Rect]
     candidates:
      nvk.a(oos, long, long, int, java.util.List):void
      nvk.a(java.lang.String, java.lang.String, com.google.android.gms.car.CarWindowLayoutParams, nsz, int):nsy
      nvk.a(oos, boolean, boolean, int, android.graphics.Rect):void */
    /* renamed from: a */
    private final synchronized void m27841a(oos oos, boolean z, int i, Rect rect) {
        oos t;
        oos oos2 = oos;
        synchronized (this) {
            if (!(!this.f36642am || oos2 == null || oos2 == (t = mo21707t()))) {
                while (this.f36653ax.size() > 0) {
                    int size = this.f36653ax.size() - 1;
                    int keyAt = this.f36653ax.keyAt(size);
                    boolean valueAt = this.f36653ax.valueAt(size);
                    this.f36653ax.delete(keyAt);
                    KeyEvent keyEvent = new KeyEvent(0, 0, 1, keyAt, 0, this.f36654ay, 0, 0, 4);
                    if (valueAt) {
                        if (t != null) {
                            t.mo22422a(keyEvent);
                        }
                    }
                    if (this.f36632ab) {
                        mo21669a(this.f36616Q.mo21642a(), keyEvent);
                    } else {
                        m27844a(this.f36615P, keyEvent);
                    }
                }
                m27842a(t, false, z);
                m27843a(oos, true, z, i, rect);
                this.f36615P = oos.mo22439d();
                this.f36616Q.mo21644b(oos2);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo21673b(oos oos, int i) {
        m27839a(oos, i, (oos) null);
    }

    /* renamed from: b */
    public final void mo21674b(oos oos, KeyEvent keyEvent) {
        if (!this.f36645ap) {
            return;
        }
        if (this.f36661g) {
            bnsi c = f36599a.mo68388c();
            c.mo68432a("nvk", "b", 3021, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Cannot invoke onKeyEventComplete when disconnected.");
        } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1) {
            this.f36635af.mo21044d().mo21071a(1);
        }
    }

    /* renamed from: b */
    public final boolean mo21675b(oos oos) {
        if (!this.f36642am) {
            return false;
        }
        if (!this.f36621V.mo22487b(oos) && !oos.mo22405A()) {
            bnsi c = f36599a.mo68388c();
            c.mo68432a("nvk", "b", 1328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("recycleProjectionWindow for non-removed window %s", oos);
            return false;
        }
        nvg nvg = this.f36665k;
        if (nvg == null) {
            return false;
        }
        oos.mo22449n();
        m27838a(oos, oos.mo22439d(), nvg, oos.mo22449n(), oos.mo22450o(), oos.mo22447l(), oos.mo22448m());
        return true;
    }

    /* renamed from: a */
    private final void m27842a(oos oos, boolean z, boolean z2) {
        m27843a(oos, z, z2, -1, (Rect) null);
    }

    /* renamed from: a */
    private final void m27843a(oos oos, boolean z, boolean z2, int i, Rect rect) {
        if (oos == null) {
            return;
        }
        if (!z || !z2) {
            oos.mo22426a(new InputFocusChangedEvent(z, this.f36641al, i, rect));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (m27826E() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r0 == 19) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        if (m27826E() != false) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090 A[RETURN] */
    /* renamed from: a */
    private final boolean m27844a(int i, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 1 || (keyCode != 20 && keyCode != 19 && keyCode != 4)) {
            return false;
        }
        int i2 = 7;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                bnsi b = f36599a.mo68387b();
                                b.mo68432a("nvk", "b", 3204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                b.mo68405a("You added a window layer but didn't update onUnhandledKeyEvent");
                            } else {
                                if (keyCode == 20) {
                                    i2 = m27827F() ? 5 : 1;
                                } else if (keyCode == 4) {
                                    i2 = 2;
                                }
                                if (i == i2) {
                                    return false;
                                }
                                mo21692i(m27853g(i2));
                                return true;
                            }
                        } else if (keyCode == 20) {
                            i2 = m27827F() ? 5 : 2;
                            if (i == i2) {
                            }
                        }
                    } else if (keyCode == 19) {
                    }
                }
            }
            i2 = 1;
            if (i == i2) {
            }
        } else {
            if (keyCode == 20) {
                i2 = m27827F() ? 5 : 2;
            } else if (keyCode != 19) {
                i2 = 2;
            }
            if (i == i2) {
            }
        }
        i2 = i;
        if (i == i2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final nsy mo21649a(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, nsz nsz, int i) {
        CarWindowLayoutParams carWindowLayoutParams2;
        oop oop;
        CarWindowLayoutParams carWindowLayoutParams3 = carWindowLayoutParams;
        if (!ccpp.m131164b() || carWindowLayoutParams3.f29379a <= 0) {
            carWindowLayoutParams2 = new CarWindowLayoutParams(carWindowLayoutParams3.f29379a, carWindowLayoutParams3.f29380b, carWindowLayoutParams3.f29381c, carWindowLayoutParams3.f29382d, carWindowLayoutParams3.f29383e, carWindowLayoutParams3.f29384f, carWindowLayoutParams3.f29385g, carWindowLayoutParams3.f29386h, carWindowLayoutParams3.f29387i, carWindowLayoutParams3.f29388j, carWindowLayoutParams3.f29389k, carWindowLayoutParams3.f29390l, carWindowLayoutParams3.f29391m, carWindowLayoutParams3.f29392n, carWindowLayoutParams3.f29393o, -1, carWindowLayoutParams3.f29395q);
        } else {
            carWindowLayoutParams2 = carWindowLayoutParams3;
        }
        synchronized (this.f36631aa) {
            try {
                oop = new oop(str, str2, carWindowLayoutParams2, this, nsz, i, this.f36658d);
                CarWindowLayoutParams carWindowLayoutParams4 = oop.f38080g;
                if (!(carWindowLayoutParams4.f29388j == -1 && carWindowLayoutParams4.f29389k == -1)) {
                    try {
                        Context createPackageContext = oop.f38077d.mo21648a().createPackageContext(oop.f38076c, 0);
                        if (oop.f38080g.f29388j != -1) {
                            oop.f38082i = oop.f38077d.mo21671b().mo22480a(createPackageContext, oop.f38080g.f29388j);
                        }
                        if (oop.f38080g.f29389k != -1) {
                            oop.f38083j = oop.f38077d.mo21671b().mo22480a(createPackageContext, oop.f38080g.f29389k);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        bnsi b = oop.f38074a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("oop", "d", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68420a("%s Failed to find package", oop.f38075b);
                        throw new IllegalArgumentException("Failed to init window");
                    }
                }
                this.f36631aa.add(oop);
                this.f36632ab = true;
                ooq ooq = this.f36668n;
                nvg nvg = this.f36665k;
                if (nvg != null) {
                    if (ooq != null) {
                        oop.mo22385a(ooq);
                        nvg.mo21632a(oop.f38081h);
                    }
                }
            } catch (RemoteException e2) {
                bnsi b2 = f36599a.mo68387b();
                b2.mo68437a(e2);
                b2.mo68432a("nvk", "a", 1265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Error creating CarWindow: RemoteException");
                return null;
            }
        }
        return oop.f38084k;
    }

    @Deprecated
    /* renamed from: a */
    public final oos mo21650a(int i, oor oor) {
        return mo21651a(i, oor, (Animation) null, (Animation) null);
    }

    @Deprecated
    /* renamed from: a */
    public final oos mo21651a(int i, oor oor, Animation animation, Animation animation2) {
        oou oou;
        Rect rect = this.f36669o;
        Rect rect2 = this.f36670p;
        if (this.f36642am) {
            if (i == 2 || i == 5 || i == 7) {
                boolean z = true;
                if (!(i == 5 || i == 2)) {
                    z = false;
                }
                oou = new oov(this, i, oor, z);
            } else {
                oou = new oou(this, i, oor, null);
            }
            nvg nvg = this.f36665k;
            if (nvg != null) {
                m27838a(oou, i, nvg, rect, rect2, animation, animation2);
                return oou;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final opw mo21652a(String str, String str2) {
        int i;
        int a;
        int a2 = m27832a(35633, str);
        if (a2 == 0 || (a = m27832a(35632, str2)) == 0) {
            i = 0;
        } else {
            int glCreateProgram = GLES20.glCreateProgram();
            opv.m29540a(f36599a, "glCreateProgram");
            if (glCreateProgram == 0) {
                bnsi b = f36599a.mo68387b();
                b.mo68432a("nvk", "b", 3297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, a2);
            opv.m29540a(f36599a, "glAttachShader");
            GLES20.glAttachShader(glCreateProgram, a);
            opv.m29540a(f36599a, "glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                bnsi b2 = f36599a.mo68387b();
                b2.mo68432a("nvk", "b", 3307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68420a("Could not link program: %s", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                i = 0;
            } else {
                i = glCreateProgram;
            }
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        opv.m29540a(f36599a, "glGetAttribLocation aPosition");
        if (glGetAttribLocation != -1) {
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(i, "aTextureCoord");
            opv.m29540a(f36599a, "glGetAttribLocation aTextureCoord");
            if (glGetAttribLocation2 != -1) {
                int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uMVPMatrix");
                opv.m29540a(f36599a, "glGetUniformLocation uMVPMatrix");
                if (glGetUniformLocation != -1) {
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uSTMatrix");
                    opv.m29540a(f36599a, "glGetUniformLocation uSTMatrix");
                    if (glGetUniformLocation2 != -1) {
                        return new opw(i, glGetUniformLocation, glGetUniformLocation2, glGetAttribLocation, glGetAttribLocation2);
                    }
                    throw new opv("Could not get attrib location for uSTMatrix");
                }
                throw new opv("Could not get attrib location for uMVPMatrix");
            }
            throw new opv("Could not get attrib location for aTextureCoord");
        }
        throw new opv("Could not get attrib location for aPosition");
    }

    /* renamed from: a */
    public final void mo21654a(int i, int i2) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f36657c.getResources(), i2);
        GLUtils.texImage2D(3553, 0, decodeResource, 0);
        opv.m29540a(f36599a, "texImage2D shadow texture");
        decodeResource.recycle();
    }

    /* renamed from: a */
    public final void mo21269a(int i, boolean z) {
        boolean z2;
        int i2;
        if (!this.f36672r) {
            int i3 = i & 1;
            if (i3 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f36678x = z2;
            int i4 = 65536 & i;
            if (i3 != 0) {
                i2 = i4 == 0 ? (int) ccuf.f179931a.mo6606a().mo76800k() : (int) ccuf.f179931a.mo6606a().mo76801l();
            } else {
                i2 = i4 == 0 ? (int) ccuf.m131592c() : !this.f36676v ? 60 : 30;
            }
            if (i2 == this.f36673s) {
                Integer.toHexString(i);
            } else {
                m27851e(i2);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, int, boolean):oos
     arg types: [oos, int, int]
     candidates:
      nvk.a(int, int, int):int
      nvk.a(oos, long, int):long
      nvk.a(oos, android.graphics.Rect, oos):android.graphics.Rect
      nvk.a(oos, int, oos):void
      nvk.a(oos, boolean, boolean):void
      nvk.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      nvk.a(oos, boolean, android.view.animation.Animation):void
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void
      nvk.a(oos, int, boolean):oos */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ab, code lost:
        if (r2.mo22438c(2) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080 A[SYNTHETIC, Splitter:B:47:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ea A[SYNTHETIC, Splitter:B:85:0x00ea] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x005c=Splitter:B:36:0x005c, B:89:0x00ff=Splitter:B:89:0x00ff} */
    /* renamed from: a */
    public final synchronized void mo21655a(KeyEvent keyEvent) {
        oos oos;
        oos a;
        oos g;
        this.f36641al = false;
        if (this.f36642am) {
            this.f36654ay = keyEvent.getMetaState();
            int i = 1;
            if (keyEvent.getAction() == 0) {
                if (keyEvent.getRepeatCount() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (!this.f36632ab) {
                        oos g2 = m27853g(6);
                        if (g2 != null) {
                            if (g2.mo22443h()) {
                                i = 6;
                                g = m27853g(i);
                                if (g != null) {
                                    if (this.f36615P != i) {
                                        mo21692i(g);
                                    }
                                    this.f36653ax.put(keyEvent.getKeyCode(), Boolean.TRUE.booleanValue());
                                    g.mo22422a(keyEvent);
                                    return;
                                }
                                this.f36653ax.put(keyEvent.getKeyCode(), Boolean.FALSE.booleanValue());
                                m27844a(this.f36615P, keyEvent);
                                return;
                            }
                        }
                        int i2 = this.f36615P;
                        if (!(i2 == 1 || i2 == 5 || i2 == 3)) {
                            if (m27857k(keyCode)) {
                                g = m27853g(i);
                                if (g != null) {
                                }
                            }
                        }
                        if (m27826E()) {
                            if (keyCode == 19) {
                                mo21692i(m27853g(7));
                                return;
                            }
                        }
                        i = this.f36615P;
                        g = m27853g(i);
                        if (g != null) {
                        }
                    } else {
                        oos a2 = this.f36616Q.mo21642a();
                        if (m27857k(keyCode)) {
                            if (a2 == null) {
                            }
                            oos = m27853g(1);
                            if (oos == null) {
                                if (oos != a2) {
                                    mo21692i(oos);
                                }
                                this.f36653ax.put(keyEvent.getKeyCode(), Boolean.TRUE.booleanValue());
                                oos.mo22422a(keyEvent);
                                return;
                            }
                            this.f36653ax.put(keyEvent.getKeyCode(), Boolean.FALSE.booleanValue());
                            mo21669a((oos) null, keyEvent);
                            return;
                        }
                        if (m27856j(keyCode)) {
                            synchronized (this.f36618S) {
                                a = m27836a(a2, keyCode, true);
                            }
                            if (a != null) {
                                mo21692i(a);
                                return;
                            }
                        }
                        oos = a2;
                        if (oos == null) {
                        }
                    }
                }
            }
            if (this.f36653ax.indexOfKey(keyEvent.getKeyCode()) >= 0) {
                boolean z = this.f36653ax.get(keyEvent.getKeyCode());
                oos t = mo21707t();
                if (z) {
                    if (t != null) {
                        t.mo22422a(keyEvent);
                        if (keyEvent.getAction() == 1) {
                            this.f36653ax.delete(keyEvent.getKeyCode());
                        }
                    }
                }
                if (this.f36632ab) {
                    mo21669a(this.f36616Q.mo21642a(), keyEvent);
                } else {
                    m27844a(this.f36615P, keyEvent);
                }
                if (keyEvent.getAction() == 1) {
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo21656a(MotionEvent motionEvent) {
        oos t;
        if (this.f36642am && (t = mo21707t()) != null) {
            t.mo22423a(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo21657a(List list) {
        int size = this.f36617R.size();
        for (int i = 0; i < size; i++) {
            List<oos> list2 = (List) this.f36617R.valueAt(i);
            if (list2 != null) {
                for (oos oos : list2) {
                    oos.mo22455t();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() + 1000;
                for (oos oos2 : list2) {
                    oos2.mo22418a(elapsedRealtime - SystemClock.elapsedRealtime());
                }
                list2.clear();
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oos) it.next()).mo22454s();
        }
        this.f36617R.clear();
    }

    /* renamed from: a */
    public final synchronized void mo21658a(oab oab) {
        oab oab2 = oab;
        synchronized (this) {
            if (ccql.m131269d()) {
                ofd.m28611a(this.f36657c, "com.google.android.gms.car.PROJECTION_WINDOW_MANAGER", ofa.COMPLETED);
            }
            this.f36676v = oab2.f37026d == 30;
            this.f36677w = oab2.f37031i + ((int) ccur.f180000a.mo6606a().mo76852c());
            Resources resources = this.f36657c.getResources();
            float f = resources.getDisplayMetrics().density;
            int a = m27831a((int) (((resources.getDimension(C0126R.dimen.car_rail_height) / f) * ((float) oab2.f37029g)) / 160.0f), oab2.f37033k.getHeight(), oab2.f37028f);
            int a2 = m27831a((int) (((resources.getDimension(C0126R.dimen.car_notification_height) / f) * ((float) oab2.f37029g)) / 160.0f), oab2.f37033k.getHeight(), oab2.f37028f);
            int a3 = m27831a((int) (((((float) ((int) C1583oob.m29296a(this.f36657c, "car_ime_height", resources.getDimension(C0126R.dimen.car_ime_height_gms)))) / f) * ((float) oab2.f37029g)) / 160.0f), oab2.f37033k.getHeight(), oab2.f37028f);
            this.f36668n = new ooq(oab, oab2.f37033k.getWidth(), oab2.f37033k.getHeight(), oab2.f37032j, 0, a, a2, a3, a3 - (((int) (((C1583oob.m29296a(this.f36657c, "car_standard_height", resources.getDimension(C0126R.dimen.car_standard_height_gms)) / f) * ((float) oab2.f37029g)) / 160.0f)) - oab2.f37033k.getHeight()));
        }
    }

    /* renamed from: a */
    public final void mo21659a(oeq oeq) {
        C1245ok okVar;
        oeq oeq2 = oeq;
        this.f36641al = true;
        if (this.f36642am) {
            if (this.f36668n.f38094d != 1.0f) {
                oep[] oepArr = oeq2.f37406g;
                for (oep oep : oepArr) {
                    if (((double) this.f36668n.f38094d) > 1.0d) {
                        oep.f37394e = (int) ((((float) oep.f37394e) * this.f36668n.f38094d) + 0.5f);
                    } else if (((double) this.f36668n.f38094d) < 1.0d) {
                        oep.f37395f = (int) ((((float) oep.f37395f) * this.f36668n.f38095e) + 0.5f);
                    }
                }
            }
            if (this.f36668n.f38098h > 0) {
                oep[] oepArr2 = oeq2.f37406g;
                for (oep oep2 : oepArr2) {
                    int i = oep2.f37394e - this.f36668n.f38098h;
                    oep2.f37394e = i;
                    if (i < 0) {
                        oep2.f37394e = 0;
                    } else if (i > this.f36668n.f38099i) {
                        oep2.f37394e = this.f36668n.f38099i - 1;
                    }
                }
            }
            int i2 = oeq2.f37404e;
            if (i2 == 0 || i2 == 1) {
                oep oep3 = oeq2.f37406g[0];
                int i3 = oep3.f37394e;
                int i4 = oep3.f37395f;
                int i5 = oep3.f37396g;
                oos b = m27846b(i5, i3, i4);
                if (b == null) {
                    bnsi c = f36599a.mo68388c();
                    c.mo68432a("nvk", "b", 2131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Touch event does not correspond to a window layer");
                } else {
                    List singletonList = Collections.singletonList(oep3);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = uptimeMillis;
                    m27840a(b, m27833a(b, uptimeMillis, i2), uptimeMillis, i2, singletonList);
                    if (i2 == 1) {
                        m27852f(i5);
                    } else if (cctl.m131528f()) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (this.f36618S) {
                            for (int i6 = 7; i6 > 0; i6--) {
                                List<oos> list = (List) this.f36619T.get(i6);
                                if (list != null) {
                                    for (oos oos : list) {
                                        if (!(oos == null || oos == b || !oos.mo22412H())) {
                                            arrayList.add(oos);
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((oos) arrayList.get(i7)).mo22420a(j, singletonList);
                        }
                    }
                }
            } else if (i2 != 2) {
                int i8 = oeq2.f37405f;
                oep[] oepArr3 = oeq2.f37406g;
                if (i8 >= oepArr3.length) {
                    bnsi b2 = f36599a.mo68387b();
                    b2.mo68432a("nvk", "c", 2176, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68409a("Touch event's action index out of array %d", i8);
                } else {
                    oep oep4 = oepArr3[i8];
                    oos b3 = m27846b(oep4.f37396g, oep4.f37394e, oep4.f37395f);
                    if (b3 == null) {
                        bnsi b4 = f36599a.mo68387b();
                        b4.mo68432a("nvk", "c", 2184, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b4.mo68405a("Touch event does not correspond to a window layer");
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        oep[] oepArr4 = oeq2.f37406g;
                        int i9 = 0;
                        for (oep oep5 : oepArr4) {
                            if (b3 == m27846b(oep5.f37396g, oep5.f37394e, oep5.f37395f)) {
                                arrayList2.add(oep5);
                                if (oep5 == oep4) {
                                    i8 = i9;
                                }
                                i9++;
                            }
                        }
                        if (arrayList2.size() == 1) {
                            if (i2 == 5) {
                                int i10 = oep4.f37396g;
                                i2 = 0;
                            } else if (i2 == 6) {
                                int i11 = oep4.f37396g;
                                i2 = 1;
                            }
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        long a = m27833a(b3, uptimeMillis2, i2);
                        if (i2 == 5 || i2 == 6) {
                            i2 |= i8 << 8;
                        }
                        m27840a(b3, a, uptimeMillis2, i2, arrayList2);
                        if (i2 == 6 || i2 == 1) {
                            m27852f(oep4.f37396g);
                        }
                    }
                }
            } else {
                oep[] oepArr5 = oeq2.f37406g;
                if (oepArr5.length == 1) {
                    oep oep6 = oepArr5[0];
                    oos b5 = m27846b(oep6.f37396g, oep6.f37394e, oep6.f37395f);
                    if (b5 != null) {
                        long uptimeMillis3 = SystemClock.uptimeMillis();
                        m27840a(b5, m27833a(b5, uptimeMillis3, 2), uptimeMillis3, 2, Collections.singletonList(oep6));
                    }
                } else {
                    int i12 = 0;
                    while (true) {
                        oep[] oepArr6 = oeq2.f37406g;
                        if (i12 < oepArr6.length) {
                            oep oep7 = oepArr6[i12];
                            oos b6 = m27846b(oep7.f37396g, oep7.f37394e, oep7.f37395f);
                            if (b6 == null) {
                                break;
                            }
                            ArrayList arrayList3 = (ArrayList) this.f36652aw.get(b6);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList(2);
                                this.f36652aw.put(b6, arrayList3);
                            }
                            arrayList3.add(oep7);
                            i12++;
                        } else {
                            long uptimeMillis4 = SystemClock.uptimeMillis();
                            int i13 = 0;
                            while (true) {
                                okVar = this.f36652aw;
                                if (i13 >= okVar.f26809h) {
                                    break;
                                }
                                oos oos2 = (oos) okVar.mo15620b(i13);
                                m27840a(oos2, m27833a(oos2, uptimeMillis4, 2), uptimeMillis4, 2, (ArrayList) this.f36652aw.mo15621c(i13));
                                i13++;
                            }
                            okVar.clear();
                        }
                    }
                }
            }
            synchronized (oeq.f37397a) {
                if (oeq.f37398b < 10) {
                    oeq.f37398b++;
                    oeq2.f37403d = oeq.f37399c;
                    oeq.f37399c = oeq2;
                }
                for (int length = oeq2.f37406g.length - 1; length >= 0; length--) {
                    oep oep8 = oeq2.f37406g[length];
                    synchronized (oep.f37390a) {
                        if (oep.f37391b < 10) {
                            oep.f37391b++;
                            oep8.f37393d = oep.f37392c;
                            oep.f37392c = oep8;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21660a(oog oog) {
        synchronized (this.f36631aa) {
            this.f36631aa.remove(oog);
            m27830I();
            this.f36632ab = !this.f36631aa.isEmpty();
        }
        mo21687f(((oop) oog).f38081h);
    }

    /* renamed from: a */
    public final void mo21661a(oos oos) {
        if (oos == null) {
            return;
        }
        if (!this.f36642am) {
            bnsi d = f36599a.mo68390d();
            d.mo68432a("nvk", "a", 1045, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("onFrameAvaiableForHiddenWindow called but composition not running");
            return;
        }
        nvg nvg = this.f36665k;
        if (nvg != null) {
            nvg.mo21638d(oos);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0016 A[SYNTHETIC] */
    /* renamed from: a */
    public final synchronized void mo21662a(oos oos, int i) {
        boolean z;
        oos oos2;
        oos oos3;
        if (oos != null) {
            try {
                if (oos.mo22439d() != 1) {
                    z = false;
                    rzz.m34729a(z);
                    synchronized (this.f36618S) {
                        List list = (List) this.f36619T.get(1);
                        oos2 = null;
                        if (list != null) {
                            oos3 = (oos) list.get(0);
                        } else {
                            oos3 = null;
                        }
                    }
                    if (oos3 != oos) {
                        Animation animation = this.f36627aB;
                        this.f36627aB = null;
                        this.f36626aA.removeCallbacks(this.f36628aC);
                        if (mo21679c()) {
                            if (animation == null && oos != null) {
                                animation = oos.mo22448m();
                            }
                        }
                        if (this.f36634ae.mo21232b() && this.f36616Q.mo21643a(oos3)) {
                            oos2 = oos3;
                        }
                        m27848b(oos3, animation);
                        if (oos != null) {
                            m27839a(oos, i, oos2);
                        }
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = true;
        rzz.m34729a(z);
        synchronized (this.f36618S) {
        }
    }

    /* renamed from: a */
    public final void mo21663a(oos oos, MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData) {
        int i;
        oos oos2 = oos;
        MotionEvent motionEvent2 = motionEvent;
        TouchEventCompleteData touchEventCompleteData2 = touchEventCompleteData;
        if (this.f36645ap && motionEvent.getSource() == 1048584) {
            if (this.f36661g) {
                bnsi c = f36599a.mo68388c();
                c.mo68432a("nvk", "a", 2849, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Cannot invoke onTouchEventComplete when disconnected.");
            } else if (oos2 != mo21707t()) {
                bnsi c2 = f36599a.mo68388c();
                c2.mo68432a("nvk", "a", 2860, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68424a("Ignoring event delivered to old window. event:%s, data:%s", motionEvent2, touchEventCompleteData2);
            } else {
                oos2.mo22421a(touchEventCompleteData2.f29461b);
                int i2 = touchEventCompleteData2.f29460a;
                if (i2 == -1) {
                    int i3 = touchEventCompleteData2.f29462c;
                    int i4 = i3 != 17 ? i3 != 33 ? i3 != 66 ? i3 != 130 ? 0 : 20 : 22 : 19 : 21;
                    if (i4 == 0) {
                        float x = motionEvent.getX() - this.f36643an;
                        float y = motionEvent.getY() - this.f36644ao;
                        float abs = Math.abs(x);
                        float abs2 = Math.abs(y);
                        int e = this.f36635af.mo21044d().mo21080e();
                        i = (abs2 < abs || abs2 < ((float) e)) ? (abs <= abs2 || abs < ((float) e)) ? 0 : x > 0.0f ? 22 : 21 : y > 0.0f ? 20 : 19;
                    } else {
                        i = i4;
                    }
                    if (i == 0) {
                        bnsi c3 = f36599a.mo68388c();
                        c3.mo68432a("nvk", "a", 2884, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c3.mo68425a("keycode is unknown for event:%s, touchpadOriginX:%s, touchpadOriginY:%s", motionEvent2, Float.valueOf(this.f36643an), Float.valueOf(this.f36644ao));
                    } else {
                        KeyEvent keyEvent = new KeyEvent(1, i);
                        keyEvent.setSource(motionEvent.getSource());
                        if (mo21669a(oos2, keyEvent)) {
                            i2 = 2;
                        }
                    }
                }
                if (i2 != -1 && i2 != 0) {
                    this.f36635af.mo21044d().mo21071a(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo21664a(oos oos, Animation animation) {
        oos oos2;
        synchronized (this.f36618S) {
            List list = (List) this.f36619T.get(1);
            if (list != null) {
                oos2 = (oos) list.get(0);
            } else {
                oos2 = null;
            }
        }
        if (oos != oos2) {
            this.f36627aB = animation;
            this.f36626aA.postDelayed(this.f36628aC, 5000);
        }
    }

    /* renamed from: a */
    public final synchronized void mo21665a(oos oos, boolean z) {
        mo21666a(oos, z, (Animation) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0051, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo21666a(oos oos, boolean z, Animation animation) {
        boolean z2;
        if (oos != null) {
            int d = oos.mo22439d();
            synchronized (this.f36618S) {
                List list = (List) this.f36619T.get(d);
                z2 = false;
                if (list != null && list.contains(oos)) {
                    z2 = true;
                }
            }
            if (!z2) {
                mo21687f(oos);
            } else if (!mo21679c()) {
                if (z) {
                    this.f36621V.mo22484a(oos, animation);
                } else {
                    oos.mo22441f();
                }
            } else if (!z) {
                oos.mo22441f();
            } else if (d != 1) {
                this.f36621V.mo22484a(oos, animation);
            } else {
                this.f36621V.mo22486b(oos, animation);
            }
        }
    }

    /* renamed from: a */
    public final void mo21667a(boolean z) {
        nvg nvg = this.f36665k;
        if (nvg != null) {
            nvg.mo21634a(new nva(this, z));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nvk.a(int, java.lang.String):int
      nvk.a(java.util.List, oos):void
      nvk.a(int, android.view.KeyEvent):boolean
      nvk.a(int, oor):oos
      nvk.a(java.lang.String, java.lang.String):opw
      nvk.a(int, int):void
      nvk.a(oos, int):void
      nvk.a(oos, android.view.animation.Animation):void
      nvk.a(oos, boolean):void
      nvk.a(oos, android.view.KeyEvent):boolean
      oqa.a(int, oor):oos
      oqa.a(oos, int):void
      oqa.a(oos, android.view.animation.Animation):void
      oqa.a(oos, boolean):void
      oqa.a(oos, android.view.KeyEvent):boolean
      nvk.a(int, boolean):void */
    /* renamed from: a */
    public final synchronized boolean mo21668a(Surface surface) {
        this.f36649at.mo21893a(this);
        this.f36662h = surface;
        mo21269a(this.f36638ai.mo22054d(), false);
        opo opo = this.f36621V;
        int i = this.f36668n.f38099i;
        int i2 = this.f36668n.f38097g - this.f36668n.f38100j;
        ((opu) opo).f38206m = i;
        ((opu) opo).f38207n = i2;
        ((opu) opo).f38204k.initialize(i, i2, i, i2);
        ((opu) opo).f38205l.initialize(i, i2, i, i2);
        this.f36606G = 0;
        this.f36605F.set(0);
        this.f36604E.set(0);
        this.f36667m = new opx(this, this.f36673s, this.f36677w);
        this.f36640ak = new Thread(new nvh(this), "CompositionThread");
        this.f36663i = new Semaphore(0);
        this.f36640ak.start();
        try {
            this.f36663i.acquire();
        } catch (InterruptedException e) {
        }
        if (!this.f36679y) {
            return false;
        }
        this.f36667m.f38218a = true;
        this.f36642am = true;
        this.f36607H = 0;
        this.f36608I = 0;
        this.f36609J = 0;
        Arrays.fill(this.f36611L, 0);
        synchronized (this.f36618S) {
            this.f36619T.clear();
            m27828G();
        }
        this.f36616Q.f36598a.clear();
        oqd.m29614a(this.f36636ag.mo21347q(), this);
        this.f36621V.mo22482a(this.f36667m.f38220c, this.f36668n);
        if (this.f36639aj == null) {
            this.f36639aj = new ProjectionWindowManagerImpl$DumpReceiver(this);
            aki.m919a(this.f36657c).mo873a(this.f36639aj, new IntentFilter("com.google.android.gms.car.DumpScreenshot"));
        }
        synchronized (this.f36660f.f36587a) {
            for (nvd nvd : this.f36660f.f36589c) {
                try {
                    nvd.f36585a.mo21546a(true);
                } catch (RemoteException e2) {
                }
            }
        }
        synchronized (this.f36631aa) {
            Iterator it = this.f36631aa.iterator();
            while (it.hasNext()) {
                oog oog = (oog) it.next();
                if (oog.mo22386c() == null) {
                    oog.mo22385a(this.f36668n);
                }
                this.f36665k.mo21632a(oog.mo22386c());
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, int, boolean):oos
     arg types: [oos, int, int]
     candidates:
      nvk.a(int, int, int):int
      nvk.a(oos, long, int):long
      nvk.a(oos, android.graphics.Rect, oos):android.graphics.Rect
      nvk.a(oos, int, oos):void
      nvk.a(oos, boolean, boolean):void
      nvk.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      nvk.a(oos, boolean, android.view.animation.Animation):void
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void
      nvk.a(oos, int, boolean):oos */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nvk.a(oos, boolean, int, android.graphics.Rect):void
     arg types: [oos, int, int, android.graphics.Rect]
     candidates:
      nvk.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      oqa.a(int, oor, android.view.animation.Animation, android.view.animation.Animation):oos
      nvk.a(oos, boolean, int, android.graphics.Rect):void */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        if (r14 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        m27841a(r14, false, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* renamed from: a */
    public final boolean mo21669a(oos oos, KeyEvent keyEvent) {
        int i;
        Rect rect;
        oos oos2;
        oos oos3 = oos;
        KeyEvent keyEvent2 = keyEvent;
        if (!this.f36632ab) {
            return m27844a(oos.mo22439d(), keyEvent2);
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        synchronized (this.f36618S) {
            oos oos4 = null;
            r14 = null;
            r14 = null;
            r14 = null;
            Rect rect2 = null;
            if (!m27856j(keyCode)) {
                if (keyCode == 4) {
                    Iterator it = this.f36620U.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1240of ofVar = (C1240of) it.next();
                        if (((oos) ofVar.f26799b).mo22438c(8)) {
                            i = -1;
                            oos4 = (oos) ofVar.f26799b;
                            rect = null;
                            break;
                        }
                    }
                }
                rect = null;
                i = -1;
            } else if (this.f36616Q.mo21642a() != oos3) {
                bnsi c = f36599a.mo68388c();
                c.mo68432a("nvk", "a", 2960, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Ignoring unhandled key event delivered to non-focused window. event: %s", keyEvent2);
                return false;
            } else {
                if (this.f36645ap) {
                    if (keyEvent.getSource() == 1048584) {
                        if (!(oos3 == null || oos.mo22451p() == null)) {
                            Rect n = oos.mo22449n();
                            Rect p = oos.mo22451p();
                            Rect rect3 = new Rect();
                            rect3.set(n.left + p.left, n.top + p.top, n.left + p.right, n.top + p.bottom);
                            oos2 = m27835a(this.f36668n, this.f36620U, oos, keyCode, false, rect3);
                            if (this.f36645ap) {
                                if (keyEvent.getSource() != 1048584) {
                                    i = -1;
                                } else if (oos3 != null) {
                                    if (oos.mo22451p() != null) {
                                        if (oos2 != null) {
                                            switch (keyCode) {
                                                case 19:
                                                    i = 33;
                                                    break;
                                                case 20:
                                                    i = 130;
                                                    break;
                                                case 21:
                                                    i = 17;
                                                    break;
                                                case 22:
                                                    i = 66;
                                                    break;
                                                default:
                                                    i = -1;
                                                    break;
                                            }
                                            Rect p2 = oos.mo22451p();
                                            C1240of n2 = m27859n(oos);
                                            C1240of n3 = m27859n(oos2);
                                            if (n2 != null) {
                                                if (n3 != null) {
                                                    rect2 = new Rect();
                                                    Rect rect4 = (Rect) n2.f26798a;
                                                    Rect rect5 = (Rect) n3.f26798a;
                                                    rect2.set((rect4.left + p2.left) - rect5.left, (rect4.top + p2.top) - rect5.top, (rect4.left + p2.right) - rect5.left, (rect4.top + p2.bottom) - rect5.top);
                                                }
                                            }
                                            bnsi c2 = f36599a.mo68388c();
                                            c2.mo68432a("nvk", "a", 3041, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            c2.mo68424a("Unable to compute focusedRect in target window due to non-focusable window. fromWindow: %s, toWindow: %s", n2, n3);
                                        }
                                    }
                                    i = -1;
                                }
                                rect = rect2;
                                oos4 = oos2;
                            }
                            i = -1;
                            rect = rect2;
                            oos4 = oos2;
                        }
                    }
                }
                oos2 = m27836a(oos3, keyCode, false);
                if (this.f36645ap) {
                }
                i = -1;
                rect = rect2;
                oos4 = oos2;
            }
        }
    }
}
