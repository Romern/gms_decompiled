package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.FloorChangeEvent;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;

/* renamed from: berb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berb implements bglw, bfnk, bgnw, bfms, bgmq, bexs, bhcj, betb, bgmy, bgna, beud {

    /* renamed from: Z */
    public static volatile boolean f112107Z = false;

    /* renamed from: a */
    public static final bfgt[] f112108a = {bfgt.f113814d, bfgt.f113819i};

    /* renamed from: aA */
    private static final List f112109aA = Arrays.asList("angler", "bullhead", "marlin", "sailfish");

    /* renamed from: aO */
    private static final int[] f112110aO = {0, 1, 2, 3, 4, 7, 8, 16, 17};

    /* renamed from: b */
    public static final String[] f112111b = {"accel", "baro"};

    /* renamed from: c */
    public static final String[][] f112112c = {new String[]{"car", "bluetooth_gmm_car"}, new String[]{"possible", "bluetooth_gmm_possible_car"}, new String[]{"total", "bluetooth_gmm_total"}};

    /* renamed from: A */
    public final bgnu f112113A;

    /* renamed from: B */
    public final bgmw f112114B;

    /* renamed from: C */
    public final bgmz f112115C;

    /* renamed from: D */
    public List f112116D = new ArrayList();

    /* renamed from: E */
    public final Map f112117E = new HashMap();

    /* renamed from: F */
    public final beug f112118F;

    /* renamed from: G */
    public final besh f112119G;

    /* renamed from: H */
    public boolean f112120H = false;

    /* renamed from: I */
    public boolean f112121I = false;

    /* renamed from: J */
    public bgmh f112122J = null;

    /* renamed from: K */
    public final besc f112123K;

    /* renamed from: L */
    public bevg f112124L;

    /* renamed from: M */
    public bewc f112125M;

    /* renamed from: N */
    public bess f112126N;

    /* renamed from: O */
    public final beqp f112127O = new betj();

    /* renamed from: P */
    public final beqp f112128P = new besu();

    /* renamed from: Q */
    public int f112129Q = 0;

    /* renamed from: R */
    public final Queue f112130R = new PriorityQueue();

    /* renamed from: S */
    public long f112131S = Long.MAX_VALUE;

    /* renamed from: T */
    public long f112132T = 0;

    /* renamed from: U */
    public long f112133U = Long.MAX_VALUE;

    /* renamed from: V */
    public long f112134V = Long.MAX_VALUE;

    /* renamed from: W */
    public final berr f112135W;

    /* renamed from: X */
    public Map f112136X = new ConcurrentHashMap();

    /* renamed from: Y */
    public besy f112137Y;

    /* renamed from: aB */
    private final bhck f112138aB;

    /* renamed from: aC */
    private final bgml f112139aC;

    /* renamed from: aD */
    private boolean f112140aD;

    /* renamed from: aE */
    private boolean f112141aE = true;

    /* renamed from: aF */
    private final bgne f112142aF;

    /* renamed from: aG */
    private Map f112143aG = Collections.emptyMap();

    /* renamed from: aH */
    private bexj f112144aH;

    /* renamed from: aI */
    private final betm f112145aI;

    /* renamed from: aJ */
    private final Queue f112146aJ = new PriorityQueue();

    /* renamed from: aK */
    private long f112147aK = Long.MAX_VALUE;

    /* renamed from: aL */
    private final boolean f112148aL;

    /* renamed from: aM */
    private long f112149aM;

    /* renamed from: aN */
    private long f112150aN;

    /* renamed from: aa */
    public boolean f112151aa = false;

    /* renamed from: ab */
    public long f112152ab;

    /* renamed from: ac */
    public long f112153ac;

    /* renamed from: ad */
    public boolean f112154ad = false;

    /* renamed from: ae */
    public boolean f112155ae = false;

    /* renamed from: af */
    public final int f112156af = 1;

    /* renamed from: ag */
    public final int f112157ag = 3;

    /* renamed from: ah */
    public final int f112158ah = 3;

    /* renamed from: ai */
    public long f112159ai = Long.MAX_VALUE;

    /* renamed from: aj */
    public bfmg f112160aj = null;

    /* renamed from: ak */
    public long f112161ak = -1;

    /* renamed from: al */
    public long f112162al = -1;

    /* renamed from: am */
    public long f112163am = -1;

    /* renamed from: an */
    public long f112164an = -1;

    /* renamed from: ao */
    public long f112165ao = -1;

    /* renamed from: ap */
    public long f112166ap = -1;

    /* renamed from: aq */
    public final List f112167aq = new ArrayList();

    /* renamed from: ar */
    public boolean f112168ar;

    /* renamed from: as */
    public boolean f112169as = false;

    /* renamed from: at */
    public boolean f112170at = false;

    /* renamed from: au */
    public long f112171au = -1;

    /* renamed from: av */
    public bgnb f112172av;

    /* renamed from: aw */
    public final bgja f112173aw;

    /* renamed from: ax */
    public bexc f112174ax;

    /* renamed from: ay */
    public final bflw f112175ay;

    /* renamed from: az */
    public final bgjy f112176az;

    /* renamed from: d */
    public final bglx f112177d;

    /* renamed from: e */
    public final berg f112178e;

    /* renamed from: f */
    public final bgly f112179f;

    /* renamed from: g */
    public final bgmk f112180g;

    /* renamed from: h */
    public final bfor f112181h;

    /* renamed from: i */
    public final bgmm f112182i;

    /* renamed from: j */
    public final bgnr f112183j;

    /* renamed from: k */
    public final bgns f112184k;

    /* renamed from: l */
    public final beqy f112185l;

    /* renamed from: m */
    public final bera f112186m;

    /* renamed from: n */
    public final besa f112187n;

    /* renamed from: o */
    public beth f112188o = null;

    /* renamed from: p */
    public final boolean f112189p;

    /* renamed from: q */
    public beti f112190q;

    /* renamed from: r */
    public final bete f112191r;

    /* renamed from: s */
    public final bete f112192s;

    /* renamed from: t */
    public bfmg f112193t = null;

    /* renamed from: u */
    public ActivityRecognitionResult f112194u = null;

    /* renamed from: v */
    public ActivityRecognitionResult f112195v = null;

    /* renamed from: w */
    public bfnp f112196w = betq.f112418a;

    /* renamed from: x */
    public long f112197x = -1;

    /* renamed from: y */
    public final berv f112198y;

    /* renamed from: z */
    public final bgnu f112199z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0449 A[Catch:{ IOException | IllegalArgumentException -> 0x046c }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0453 A[Catch:{ IOException | IllegalArgumentException -> 0x046c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x037d  */
    public berb(berg berg, bglx bglx, bgly bgly, bgja bgja, bhck bhck, bgmk bgmk, bgml bgml, bfor bfor, bgmm bgmm, bgnr bgnr, bgns bgns, boolean z, bgnu bgnu, bgnu bgnu2, bgjy bgjy, bgmw bgmw, bgmz bgmz, bfmt bfmt, bgnb bgnb) {
        ByteBuffer byteBuffer;
        char c;
        bgnb bgnb2;
        boolean z2;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        bfmt bfmt2;
        besm besm;
        boolean z3;
        ByteBuffer byteBuffer7;
        ByteBuffer byteBuffer8;
        String valueOf;
        ByteBuffer byteBuffer9;
        beve beve;
        beve beve2;
        ByteBuffer a;
        bgmk bgmk2 = bgmk;
        bfor bfor2 = bfor;
        bgmm bgmm2 = bgmm;
        bgnr bgnr2 = bgnr;
        boolean z4 = z;
        this.f112177d = bglx;
        this.f112178e = berg;
        this.f112179f = bgly;
        this.f112173aw = bgja;
        this.f112138aB = bhck;
        this.f112180g = bgmk2;
        this.f112139aC = bgml;
        this.f112181h = bfor2;
        this.f112182i = bgmm2;
        this.f112183j = bgnr2;
        this.f112184k = bgns;
        this.f112189p = z4;
        this.f112140aD = false;
        this.f112135W = new berr(bgns);
        boolean z5 = !z4 && ceuq.m138264d();
        if (!z5 || ((long) bgmw.mo62862f()) < cety.m138243d()) {
            byteBuffer = null;
        } else {
            try {
                byteBuffer = bgmm2.mo62781a(beve.PHONE_BAR_GRU_FOR_CHRE_DNN);
            } catch (IOException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() == 0) {
                    new String("Failed to load CHRE BurstAR model: ");
                } else {
                    "Failed to load CHRE BurstAR model: ".concat(valueOf2);
                }
                byteBuffer = null;
            }
        }
        bgnd bgnd = new bgnd(cese.m138163l(), cety.f183431a.mo6606a().enableChreResultsBikeRelabeling(), cety.f183431a.mo6606a().chreArTimeoutToIdleMs(), cety.f183431a.mo6606a().chreArMajorityVoteWindowMillis(), Integer.valueOf((int) cesh.f183401a.mo6606a().minOnfootConfidenceForChreResultsBikeRelabeling()), Integer.valueOf((int) cesh.f183401a.mo6606a().minOnfootCountForChreResultsBikeRelabeling()), Integer.valueOf((int) cesh.f183401a.mo6606a().minVehicleConfidenceForChreResultsBikeRelabeling()), Integer.valueOf((int) cesh.f183401a.mo6606a().minVehicleCountForChreResultsBikeRelabeling()), Integer.valueOf((int) cers.f183391a.mo6606a().hardwareActivityRecognitionConfidence()));
        if (byteBuffer != null) {
            c = 0;
            this.f112142aF = new bgne(bgmk, this, new beru(byteBuffer, (int) ceuq.m138265e(), ceuq.m138262b()), beru.class, bgnd);
        } else {
            c = 0;
            this.f112142aF = new bgne(bgmk, this, new betc(this, this, z4), betc.class, bgnd);
        }
        double c2 = cerv.m138138c();
        boolean d = cerv.m138139d();
        StringBuilder sb = new StringBuilder(45);
        sb.append("ArOffBody.watchHardwareOffBodyEnabled = ");
        sb.append(d);
        sb.toString();
        if (!cerv.m138139d()) {
            bgnb2 = null;
        } else {
            bgnb2 = bgnb;
        }
        this.f112172av = bgnb2;
        Locale locale = Locale.US;
        new Object[1][c] = Double.valueOf(c2);
        boolean c3 = ceuq.m138263c();
        boolean arTestingClassifiersEnabled = ceuq.f183443a.mo6606a().arTestingClassifiersEnabled();
        Class cls = beut.class;
        if (z4) {
            try {
                byteBuffer8 = bgmm2.mo62781a(beve.WATCH_ACTIVITY);
                byteBuffer9 = null;
                byteBuffer6 = null;
                byteBuffer5 = null;
                byteBuffer7 = null;
                z3 = false;
            } catch (IOException e2) {
                e = e2;
                byteBuffer6 = null;
                byteBuffer8 = null;
                byteBuffer5 = null;
                byteBuffer7 = null;
                z3 = false;
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                }
                byteBuffer4 = byteBuffer8;
                byteBuffer3 = byteBuffer7;
                z2 = z3;
                byteBuffer2 = null;
                bfmt2 = bfmt;
                this.f112118F = new beug(bfmt2);
                this.f112174ax = mo61006v();
                if (byteBuffer3 == null) {
                }
                besm = new betc(this, this, z4);
                bgnr bgnr3 = bgnr2;
                bgmm bgmm3 = bgmm2;
                bfor bfor3 = bfor2;
                besc besc = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                this.f112123K = besc;
                if (!z) {
                }
                this.f112190q = new best(this);
                this.f112199z = bgnu;
                this.f112113A = bgnu2;
                this.f112176az = bgjy;
                this.f112114B = bgmw;
                this.f112115C = bgmz;
                this.f112145aI = new betm();
                besh besh = new besh(bfmt2);
                this.f112119G = besh;
                if (bfmt2 != null) {
                }
                this.f112187n = new besa(bfor3);
                if (cfam.m138540j()) {
                }
                this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                this.f112175ay = new bflw(null);
                this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr3, bfor3);
                this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr3, bfor3);
                this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                this.f112149aM = SystemClock.elapsedRealtime();
                this.f112150aN = SystemClock.elapsedRealtime();
                this.f112152ab = SystemClock.elapsedRealtime();
                this.f112153ac = SystemClock.elapsedRealtime();
                bsax a2 = m95482x().mo61993a();
                if (!cese.m138153b()) {
                }
                boolean z6 = f112107Z;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("State loaded: deepStillMode=");
                sb2.append(z6);
                sb2.toString();
                this.f112198y = new berv(f112107Z);
                bgnr.mo62795a();
            }
        } else {
            z3 = ceuq.m138268h();
            if (!c3) {
                cls = beva.class;
            } else {
                cls = beuu.class;
            }
            if (!c3) {
                try {
                    beve = beve.PHONE_ACTIVITY_DNN;
                } catch (IOException e3) {
                    e = e3;
                    byteBuffer6 = null;
                    byteBuffer8 = null;
                    byteBuffer5 = null;
                    byteBuffer7 = null;
                    valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        new String("Failed to load core AR model: ");
                    } else {
                        "Failed to load core AR model: ".concat(valueOf);
                    }
                    byteBuffer4 = byteBuffer8;
                    byteBuffer3 = byteBuffer7;
                    z2 = z3;
                    byteBuffer2 = null;
                    bfmt2 = bfmt;
                    this.f112118F = new beug(bfmt2);
                    this.f112174ax = mo61006v();
                    if (byteBuffer3 == null) {
                        besm = new besi(byteBuffer3, ceuq.f183443a.mo6606a().arGruBurstBatchMaxAttemptsList(), byteBuffer2, ceuq.f183443a.mo6606a().arGruBurstNonBatchMaxAttemptsList(), ceuq.f183443a.mo6606a().arGruBurstConfidenceThresholdEarlyExitList(), (int) ceuq.m138265e(), ceuq.m138262b(), ceuq.m138263c(), ceuq.m138267g(), z2);
                        bgnr bgnr32 = bgnr2;
                        bgmm bgmm32 = bgmm2;
                        bfor bfor32 = bfor2;
                        besc besc2 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                        this.f112123K = besc2;
                        if (!z) {
                        }
                        this.f112190q = new best(this);
                        this.f112199z = bgnu;
                        this.f112113A = bgnu2;
                        this.f112176az = bgjy;
                        this.f112114B = bgmw;
                        this.f112115C = bgmz;
                        this.f112145aI = new betm();
                        besh besh2 = new besh(bfmt2);
                        this.f112119G = besh2;
                        if (bfmt2 != null) {
                        }
                        this.f112187n = new besa(bfor32);
                        if (cfam.m138540j()) {
                        }
                        this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                        this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                        this.f112175ay = new bflw(null);
                        this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr32, bfor32);
                        this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr32, bfor32);
                        this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                        this.f112149aM = SystemClock.elapsedRealtime();
                        this.f112150aN = SystemClock.elapsedRealtime();
                        this.f112152ab = SystemClock.elapsedRealtime();
                        this.f112153ac = SystemClock.elapsedRealtime();
                        bsax a22 = m95482x().mo61993a();
                        if (!cese.m138153b()) {
                        }
                        boolean z62 = f112107Z;
                        StringBuilder sb22 = new StringBuilder(33);
                        sb22.append("State loaded: deepStillMode=");
                        sb22.append(z62);
                        sb22.toString();
                        this.f112198y = new berv(f112107Z);
                        bgnr.mo62795a();
                    }
                    besm = new betc(this, this, z4);
                    bgnr bgnr322 = bgnr2;
                    bgmm bgmm322 = bgmm2;
                    bfor bfor322 = bfor2;
                    besc besc22 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                    this.f112123K = besc22;
                    if (!z) {
                    }
                    this.f112190q = new best(this);
                    this.f112199z = bgnu;
                    this.f112113A = bgnu2;
                    this.f112176az = bgjy;
                    this.f112114B = bgmw;
                    this.f112115C = bgmz;
                    this.f112145aI = new betm();
                    besh besh22 = new besh(bfmt2);
                    this.f112119G = besh22;
                    if (bfmt2 != null) {
                    }
                    this.f112187n = new besa(bfor322);
                    if (cfam.m138540j()) {
                    }
                    this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                    this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                    this.f112175ay = new bflw(null);
                    this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr322, bfor322);
                    this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr322, bfor322);
                    this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                    this.f112149aM = SystemClock.elapsedRealtime();
                    this.f112150aN = SystemClock.elapsedRealtime();
                    this.f112152ab = SystemClock.elapsedRealtime();
                    this.f112153ac = SystemClock.elapsedRealtime();
                    bsax a222 = m95482x().mo61993a();
                    if (!cese.m138153b()) {
                    }
                    boolean z622 = f112107Z;
                    StringBuilder sb222 = new StringBuilder(33);
                    sb222.append("State loaded: deepStillMode=");
                    sb222.append(z622);
                    sb222.toString();
                    this.f112198y = new berv(f112107Z);
                    bgnr.mo62795a();
                }
            } else {
                beve = beve.PHONE_ACTIVITY_CNN;
            }
            byteBuffer8 = bgmm2.mo62781a(beve);
            if (c3) {
                byteBuffer5 = null;
            } else if (z3) {
                try {
                    byteBuffer5 = bgmm2.mo62781a(beve.PHONE_TWO_WHEELER_DNN);
                } catch (IOException e4) {
                    e = e4;
                    byteBuffer6 = null;
                    byteBuffer5 = null;
                    byteBuffer7 = null;
                    valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                    }
                    byteBuffer4 = byteBuffer8;
                    byteBuffer3 = byteBuffer7;
                    z2 = z3;
                    byteBuffer2 = null;
                    bfmt2 = bfmt;
                    this.f112118F = new beug(bfmt2);
                    this.f112174ax = mo61006v();
                    if (byteBuffer3 == null) {
                    }
                    besm = new betc(this, this, z4);
                    bgnr bgnr3222 = bgnr2;
                    bgmm bgmm3222 = bgmm2;
                    bfor bfor3222 = bfor2;
                    besc besc222 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                    this.f112123K = besc222;
                    if (!z) {
                    }
                    this.f112190q = new best(this);
                    this.f112199z = bgnu;
                    this.f112113A = bgnu2;
                    this.f112176az = bgjy;
                    this.f112114B = bgmw;
                    this.f112115C = bgmz;
                    this.f112145aI = new betm();
                    besh besh222 = new besh(bfmt2);
                    this.f112119G = besh222;
                    if (bfmt2 != null) {
                    }
                    this.f112187n = new besa(bfor3222);
                    if (cfam.m138540j()) {
                    }
                    this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                    this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                    this.f112175ay = new bflw(null);
                    this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr3222, bfor3222);
                    this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr3222, bfor3222);
                    this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                    this.f112149aM = SystemClock.elapsedRealtime();
                    this.f112150aN = SystemClock.elapsedRealtime();
                    this.f112152ab = SystemClock.elapsedRealtime();
                    this.f112153ac = SystemClock.elapsedRealtime();
                    bsax a2222 = m95482x().mo61993a();
                    if (!cese.m138153b()) {
                    }
                    boolean z6222 = f112107Z;
                    StringBuilder sb2222 = new StringBuilder(33);
                    sb2222.append("State loaded: deepStillMode=");
                    sb2222.append(z6222);
                    sb2222.toString();
                    this.f112198y = new berv(f112107Z);
                    bgnr.mo62795a();
                }
            } else {
                byteBuffer5 = null;
            }
            if (!arTestingClassifiersEnabled) {
                a = null;
            } else {
                if (!c3) {
                    try {
                        beve2 = beve.PHONE_ACTIVITY_CNN;
                    } catch (IOException e5) {
                        e = e5;
                        byteBuffer6 = null;
                        byteBuffer7 = null;
                        valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() != 0) {
                        }
                        byteBuffer4 = byteBuffer8;
                        byteBuffer3 = byteBuffer7;
                        z2 = z3;
                        byteBuffer2 = null;
                        bfmt2 = bfmt;
                        this.f112118F = new beug(bfmt2);
                        this.f112174ax = mo61006v();
                        if (byteBuffer3 == null) {
                        }
                        besm = new betc(this, this, z4);
                        bgnr bgnr32222 = bgnr2;
                        bgmm bgmm32222 = bgmm2;
                        bfor bfor32222 = bfor2;
                        besc besc2222 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                        this.f112123K = besc2222;
                        if (!z) {
                        }
                        this.f112190q = new best(this);
                        this.f112199z = bgnu;
                        this.f112113A = bgnu2;
                        this.f112176az = bgjy;
                        this.f112114B = bgmw;
                        this.f112115C = bgmz;
                        this.f112145aI = new betm();
                        besh besh2222 = new besh(bfmt2);
                        this.f112119G = besh2222;
                        if (bfmt2 != null) {
                        }
                        this.f112187n = new besa(bfor32222);
                        if (cfam.m138540j()) {
                        }
                        this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                        this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                        this.f112175ay = new bflw(null);
                        this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr32222, bfor32222);
                        this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr32222, bfor32222);
                        this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                        this.f112149aM = SystemClock.elapsedRealtime();
                        this.f112150aN = SystemClock.elapsedRealtime();
                        this.f112152ab = SystemClock.elapsedRealtime();
                        this.f112153ac = SystemClock.elapsedRealtime();
                        bsax a22222 = m95482x().mo61993a();
                        if (!cese.m138153b()) {
                        }
                        boolean z62222 = f112107Z;
                        StringBuilder sb22222 = new StringBuilder(33);
                        sb22222.append("State loaded: deepStillMode=");
                        sb22222.append(z62222);
                        sb22222.toString();
                        this.f112198y = new berv(f112107Z);
                        bgnr.mo62795a();
                    }
                } else {
                    beve2 = beve.PHONE_ACTIVITY_DNN;
                }
                a = bgmm2.mo62781a(beve2);
            }
            if (!z5) {
                byteBuffer9 = null;
                byteBuffer7 = null;
            } else {
                if (!c3) {
                    try {
                        byteBuffer7 = bgmm2.mo62781a(beve.PHONE_BAR_GRU_BATCH_FOR_OAR_DNN);
                    } catch (IOException e6) {
                        e = e6;
                        byteBuffer7 = null;
                        valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() != 0) {
                        }
                        byteBuffer4 = byteBuffer8;
                        byteBuffer3 = byteBuffer7;
                        z2 = z3;
                        byteBuffer2 = null;
                        bfmt2 = bfmt;
                        this.f112118F = new beug(bfmt2);
                        this.f112174ax = mo61006v();
                        if (byteBuffer3 == null) {
                        }
                        besm = new betc(this, this, z4);
                        bgnr bgnr322222 = bgnr2;
                        bgmm bgmm322222 = bgmm2;
                        bfor bfor322222 = bfor2;
                        besc besc22222 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                        this.f112123K = besc22222;
                        if (!z) {
                        }
                        this.f112190q = new best(this);
                        this.f112199z = bgnu;
                        this.f112113A = bgnu2;
                        this.f112176az = bgjy;
                        this.f112114B = bgmw;
                        this.f112115C = bgmz;
                        this.f112145aI = new betm();
                        besh besh22222 = new besh(bfmt2);
                        this.f112119G = besh22222;
                        if (bfmt2 != null) {
                        }
                        this.f112187n = new besa(bfor322222);
                        if (cfam.m138540j()) {
                        }
                        this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                        this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                        this.f112175ay = new bflw(null);
                        this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr322222, bfor322222);
                        this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr322222, bfor322222);
                        this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                        this.f112149aM = SystemClock.elapsedRealtime();
                        this.f112150aN = SystemClock.elapsedRealtime();
                        this.f112152ab = SystemClock.elapsedRealtime();
                        this.f112153ac = SystemClock.elapsedRealtime();
                        bsax a222222 = m95482x().mo61993a();
                        if (!cese.m138153b()) {
                        }
                        boolean z622222 = f112107Z;
                        StringBuilder sb222222 = new StringBuilder(33);
                        sb222222.append("State loaded: deepStillMode=");
                        sb222222.append(z622222);
                        sb222222.toString();
                        this.f112198y = new berv(f112107Z);
                        bgnr.mo62795a();
                    }
                } else {
                    byteBuffer7 = bgmm2.mo62781a(beve.PHONE_BAR_GRU_BATCH_FOR_OAR_CNN);
                }
                if (!c3) {
                    try {
                        byteBuffer9 = bgmm2.mo62781a(beve.PHONE_BAR_GRU_NON_BATCH_FOR_OAR_DNN);
                    } catch (IOException e7) {
                        e = e7;
                        valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() != 0) {
                        }
                        byteBuffer4 = byteBuffer8;
                        byteBuffer3 = byteBuffer7;
                        z2 = z3;
                        byteBuffer2 = null;
                        bfmt2 = bfmt;
                        this.f112118F = new beug(bfmt2);
                        this.f112174ax = mo61006v();
                        if (byteBuffer3 == null) {
                        }
                        besm = new betc(this, this, z4);
                        bgnr bgnr3222222 = bgnr2;
                        bgmm bgmm3222222 = bgmm2;
                        bfor bfor3222222 = bfor2;
                        besc besc222222 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
                        this.f112123K = besc222222;
                        if (!z) {
                        }
                        this.f112190q = new best(this);
                        this.f112199z = bgnu;
                        this.f112113A = bgnu2;
                        this.f112176az = bgjy;
                        this.f112114B = bgmw;
                        this.f112115C = bgmz;
                        this.f112145aI = new betm();
                        besh besh222222 = new besh(bfmt2);
                        this.f112119G = besh222222;
                        if (bfmt2 != null) {
                        }
                        this.f112187n = new besa(bfor3222222);
                        if (cfam.m138540j()) {
                        }
                        this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
                        this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
                        this.f112175ay = new bflw(null);
                        this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr3222222, bfor3222222);
                        this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr3222222, bfor3222222);
                        this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
                        this.f112149aM = SystemClock.elapsedRealtime();
                        this.f112150aN = SystemClock.elapsedRealtime();
                        this.f112152ab = SystemClock.elapsedRealtime();
                        this.f112153ac = SystemClock.elapsedRealtime();
                        bsax a2222222 = m95482x().mo61993a();
                        if (!cese.m138153b()) {
                        }
                        boolean z6222222 = f112107Z;
                        StringBuilder sb2222222 = new StringBuilder(33);
                        sb2222222.append("State loaded: deepStillMode=");
                        sb2222222.append(z6222222);
                        sb2222222.toString();
                        this.f112198y = new berv(f112107Z);
                        bgnr.mo62795a();
                    }
                } else {
                    byteBuffer9 = bgmm2.mo62781a(beve.PHONE_BAR_GRU_NON_BATCH_FOR_OAR_CNN);
                }
            }
        }
        byteBuffer2 = byteBuffer9;
        byteBuffer4 = byteBuffer8;
        byteBuffer3 = byteBuffer7;
        z2 = z3;
        bfmt2 = bfmt;
        this.f112118F = new beug(bfmt2);
        this.f112174ax = mo61006v();
        if (byteBuffer3 == null || byteBuffer2 == null) {
            besm = new betc(this, this, z4);
        } else {
            besm = new besi(byteBuffer3, ceuq.f183443a.mo6606a().arGruBurstBatchMaxAttemptsList(), byteBuffer2, ceuq.f183443a.mo6606a().arGruBurstNonBatchMaxAttemptsList(), ceuq.f183443a.mo6606a().arGruBurstConfidenceThresholdEarlyExitList(), (int) ceuq.m138265e(), ceuq.m138262b(), ceuq.m138263c(), ceuq.m138267g(), z2);
        }
        bgnr bgnr32222222 = bgnr2;
        bgmm bgmm32222222 = bgmm2;
        bfor bfor32222222 = bfor2;
        besc besc2222222 = new besc(z, byteBuffer4, byteBuffer5, cls, byteBuffer6, besm, this.f112174ax, this.f112118F, bfor);
        this.f112123K = besc2222222;
        if (!z) {
            this.f112126N = new bess(bfor32222222);
        } else if (besc2222222.f112269d != null) {
            try {
                this.f112125M = new bewc(bgmm32222222.mo62781a(beve.PHONE_FLOOR_CHANGE), this.f112123K.f112269d);
            } catch (IOException | IllegalArgumentException e8) {
                String valueOf3 = String.valueOf(e8.getMessage());
                if (valueOf3.length() == 0) {
                    new String("Failed to load floor change model: ");
                } else {
                    "Failed to load floor change model: ".concat(valueOf3);
                }
            }
        }
        this.f112190q = new best(this);
        this.f112199z = bgnu;
        this.f112113A = bgnu2;
        this.f112176az = bgjy;
        this.f112114B = bgmw;
        this.f112115C = bgmz;
        this.f112145aI = new betm();
        besh besh2222222 = new besh(bfmt2);
        this.f112119G = besh2222222;
        if (bfmt2 != null) {
            bfmt2.mo61157a(besh2222222);
        }
        this.f112187n = new besa(bfor32222222);
        if (cfam.m138540j()) {
            byte[] b = bgml.mo63006b();
            bsaz bsaz = bgox.f117117cd;
            File filesDir = ((bgji) bgmm32222222).f116606a.getFilesDir();
            this.f112188o = new beth(bfor32222222, new bfnl(1, null, 2, b, bsaz, filesDir != null ? new File(filesDir, "nlp_ash") : null, this), this);
        }
        this.f112185l = new beqy(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112188o);
        this.f112186m = new bera(bglx, bhck, bgmk, bfor, this.f112145aI, this.f112187n, this.f112188o);
        this.f112175ay = new bflw(null);
        this.f112191r = new bete(bfgt.f113814d, bgmk2, bgnr32222222, bfor32222222);
        this.f112192s = new bete(bfgt.f113819i, bgmk2, bgnr32222222, bfor32222222);
        this.f112148aL = Math.random() >= cese.f183399a.mo6606a().trackActivityPowerModeTimeProb();
        this.f112149aM = SystemClock.elapsedRealtime();
        this.f112150aN = SystemClock.elapsedRealtime();
        this.f112152ab = SystemClock.elapsedRealtime();
        this.f112153ac = SystemClock.elapsedRealtime();
        try {
            bsax a22222222 = m95482x().mo61993a();
            if (!cese.m138153b()) {
                mo60974a(a22222222.mo70113a(1), false);
            } else {
                mo60974a(false, false);
            }
            boolean z62222222 = f112107Z;
            StringBuilder sb22222222 = new StringBuilder(33);
            sb22222222.append("State loaded: deepStillMode=");
            sb22222222.append(z62222222);
            sb22222222.toString();
        } catch (IOException | IllegalArgumentException e9) {
        }
        this.f112198y = new berv(f112107Z);
        bgnr.mo62795a();
    }

    /* renamed from: a */
    public static ActivityRecognitionResult m95480a(ActivityRecognitionResult activityRecognitionResult, int i) {
        beqr beqr = new beqr();
        beqr.f112065c = activityRecognitionResult.f79302c;
        beqr.f112064b = activityRecognitionResult.f79301b;
        beqr.f112063a.addAll(activityRecognitionResult.f79300a);
        beqr.f112069g = activityRecognitionResult.mo43493c();
        beqr.f112066d = 4;
        beqr.f112067e = 50;
        beqr.f112068f = i;
        TreeMap treeMap = new TreeMap();
        List list = beqr.f112063a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            DetectedActivity detectedActivity = (DetectedActivity) list.get(i3);
            if (beqr.f112066d == null || detectedActivity.mo43513a() != beqr.f112066d.intValue()) {
                i2 += detectedActivity.f79320e;
                treeMap.put(Integer.valueOf(detectedActivity.mo43513a()), Integer.valueOf(detectedActivity.f79320e));
            }
        }
        double d = (double) i2;
        double d2 = (double) (100 - beqr.f112067e);
        Double.isNaN(d);
        Double.isNaN(d2);
        List a = beqr.m95447a(treeMap, d / d2, false);
        Integer num = beqr.f112066d;
        if (num != null) {
            a.add(0, new DetectedActivity(num.intValue(), beqr.f112067e));
        }
        Collections.sort(a, beqr.f112062h);
        return new ActivityRecognitionResult(a, beqr.f112064b, beqr.f112065c, beqr.f112068f, beqr.f112069g);
    }

    /* renamed from: d */
    private final long m95481d(long j) {
        return mo60996l() ? Math.max(cese.f183399a.mo6606a().activityPowerSaveModeMinIntervalMillis(), j) : j;
    }

    /* renamed from: x */
    private final bfnl m95482x() {
        File file;
        SecretKey a = this.f112139aC.mo63005a();
        byte[] b = this.f112139aC.mo63006b();
        bsaz bsaz = bgox.f117116cc;
        File filesDir = ((bgji) this.f112182i).f116606a.getFilesDir();
        if (filesDir != null) {
            file = new File(filesDir, "nlp_acd");
        } else {
            file = null;
        }
        return new bfnl(1, a, 2, b, bsaz, file, this);
    }

    /* renamed from: a */
    public final void mo60965a(bgmu bgmu) {
    }

    /* renamed from: a */
    public final boolean mo60977a(bsax bsax) {
        return true;
    }

    /* renamed from: b */
    public final void mo60978b(int i) {
        this.f112142aF.f116862l = i;
    }

    /* renamed from: c */
    public final ActivityRecognitionResult mo60984c(ActivityRecognitionResult activityRecognitionResult) {
        boolean z;
        int a = activityRecognitionResult.mo43491a().mo43513a();
        long j = activityRecognitionResult.f79302c;
        if (a == 0) {
            z = true;
        } else {
            z = a == 1 || a == 2;
        }
        bfnp bfnp = this.f112196w;
        if (bfnp == null || j - this.f112197x >= 90000 || bfnp.f114498a < 0.7d || bfnp.f114499b != 1 || !z || a == 2) {
            return activityRecognitionResult;
        }
        StringBuilder sb = new StringBuilder(126);
        sb.append("correctActivityByTravelMode: activity ");
        sb.append(a);
        sb.append(" is inconsistent with travel mode. Add UNKNOWN as the most probable activity.");
        sb.toString();
        return m95480a(activityRecognitionResult, activityRecognitionResult.f79303d);
    }

    /* renamed from: e */
    public final boolean mo60989e() {
        bgmh bgmh;
        return mo60988d() && ((bgmh = this.f112122J) == null || !bgmh.mo62889b());
    }

    /* renamed from: f */
    public final boolean mo60990f() {
        bgmh bgmh = this.f112122J;
        if (bgmh != null) {
            bgmh.mo62890c();
        }
        if (mo60989e()) {
            if (SystemClock.elapsedRealtime() - this.f112166ap >= mo60995k() - ((this.f112123K.f112059a / 1000000) + 1500)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo60991g() {
        if (!mo60976a(9) && this.f112137Y != null) {
            this.f112137Y = null;
        }
    }

    /* renamed from: h */
    public final bexj mo60992h() {
        if (mo60988d() && this.f112144aH == null) {
            try {
                this.f112144aH = new bexj(this.f112182i);
            } catch (IOException e) {
            }
        }
        return this.f112144aH;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo60993i() {
        if (this.f112189p || !this.f112136X.containsKey(9)) {
            return Long.MAX_VALUE;
        }
        return m95481d(((Long) this.f112136X.get(9)).longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final long mo60994j() {
        if (!this.f112189p || !this.f112136X.containsKey(9)) {
            return Long.MAX_VALUE;
        }
        return m95481d(((Long) this.f112136X.get(9)).longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final long mo60995k() {
        if (this.f112189p || !this.f112121I) {
            return Long.MAX_VALUE;
        }
        return m95481d(cfam.f183546a.mo6606a().sleepActivityDetectionIntervalMillis());
    }

    /* renamed from: l */
    public final boolean mo60996l() {
        return !this.f112155ae && this.f112154ad;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo60997m() {
        bera bera = this.f112186m;
        double d = bera.f112102v;
        StringBuilder sb = new StringBuilder(51);
        sb.append("accelFifoSizeSufficiency = ");
        sb.append(d);
        sb.toString();
        double nextDouble = bera.f112104x.nextDouble();
        double d2 = bera.f112103w;
        this.f112141aE = nextDouble < d2 + (bera.f112102v * (1.0d - d2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo60998n() {
        if (this.f112193t != null) {
            this.f112184k.mo62914a(bgnq.ACTIVITY_DETECTION);
            this.f112193t = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final long mo60999o() {
        long min = Math.min(this.f112133U, this.f112134V);
        for (Long l : this.f112136X.values()) {
            long longValue = l.longValue();
            if (longValue < min) {
                min = longValue;
            }
        }
        return Math.min(min, mo60995k());
    }

    /* renamed from: q */
    public final void mo61001q() {
        if (this.f112148aL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo60999o() <= 300000) {
                if (this.f112151aa) {
                    this.f112179f.mo62998a("ar", "ar_power_mode_2", "low_power_mode_millis", elapsedRealtime - this.f112149aM);
                } else {
                    this.f112179f.mo62998a("ar", "ar_power_mode_2", "full_power_mode_millis", elapsedRealtime - this.f112149aM);
                }
            }
            this.f112149aM = elapsedRealtime;
            if (elapsedRealtime - this.f112150aN >= 21600000) {
                beye.m96084a(elapsedRealtime);
                this.f112150aN = elapsedRealtime;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Map mo61002r() {
        Set<bgma> a;
        bgja bgja = this.f112173aw;
        HashMap hashMap = null;
        if (!(bgja == null || (a = bgja.mo62877a()) == null)) {
            hashMap = new HashMap();
            hashMap.put("total", Integer.valueOf(a.size()));
            int i = 0;
            int i2 = 0;
            for (bgma bgma : a) {
                beuh a2 = beui.m95880a(bgma);
                if (a2.mo61152b()) {
                    i++;
                }
                if (a2.mo61151a()) {
                    i2++;
                }
            }
            hashMap.put("possible", Integer.valueOf(i));
            hashMap.put("car", Integer.valueOf(i2));
        }
        return hashMap;
    }

    /* renamed from: s */
    public final void mo61003s() {
        bgne bgne = this.f112142aF;
        bgmk bgmk = bgne.f116854c;
        bgne.f116859i = SystemClock.elapsedRealtime();
        bgmk bgmk2 = bgne.f116854c;
        bgne.f116860j = System.currentTimeMillis();
        bgne d = this.f112142aF.clone();
        List<ActivityRecognitionResult> b = d.mo61912b();
        if (!b.isEmpty()) {
            for (ActivityRecognitionResult activityRecognitionResult : b) {
                mo60980b(activityRecognitionResult);
            }
        }
        mo60963a(d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f112161ak = elapsedRealtime;
        this.f112162al = elapsedRealtime;
        this.f112190q.mo61114B();
        bgne bgne2 = this.f112142aF;
        bgne2.f116855d.clear();
        bgne2.f116859i = -1;
        bgne2.f116860j = -1;
        bgne2.f116861k = -1;
        if (!bgne2.f116857f.isEmpty()) {
            Map.Entry lastEntry = bgne2.f116857f.lastEntry();
            bmxy.m108581a(lastEntry);
            bgne2.f116857f.clear();
            bgne2.f116857f.put((Long) lastEntry.getKey(), (List) lastEntry.getValue());
        }
    }

    /* renamed from: t */
    public final boolean mo61004t() {
        return this.f112114B.mo62857a(new bgmr(this.f112143aG));
    }

    /* renamed from: u */
    public final boolean mo61005u() {
        if (this.f112114B.mo62858b()) {
            if (f112109aA.contains(Build.DEVICE)) {
                if (((long) this.f112114B.mo62862f()) >= cety.f183431a.mo6606a().chreArTransitionMinVersionAbms()) {
                    return true;
                }
                return false;
            } else if (((long) this.f112114B.mo62862f()) >= cety.f183431a.mo6606a().chreArTransitionMinVersion()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final bexc mo61006v() {
        if (!cezo.m138476b() || !this.f112169as) {
            return null;
        }
        bexc bexc = this.f112174ax;
        if (bexc != null) {
            return bexc;
        }
        this.f112181h.mo62048a(bfos.PERSONALIZATION_ENABLED_FIT_CLIENT);
        return new bexc(bexd.m96011a());
    }

    /* renamed from: w */
    public final void mo61007w() {
        bgnb bgnb = this.f112172av;
        if (bgnb != null && bgnb.f116833a) {
            bxvd da = buft.f153736d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buft buft = (buft) da.f164949b;
            buft.f153739b = 2;
            buft.f153738a |= 1;
            bgnb.mo63019a((buft) da.mo74062i());
        }
    }

    /* renamed from: b */
    public final void mo60979b(long j) {
        mo60964a(new bfmg(j, 0));
    }

    /* renamed from: p */
    public final void mo61000p() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(5, 100), System.currentTimeMillis(), elapsedRealtime, bevp.HARDWARE_TILT_MANCHEGO.f112768am, (Bundle) null);
        mo60980b(activityRecognitionResult);
        mo60967a(activityRecognitionResult);
        this.f112162al = elapsedRealtime;
        this.f112190q.mo61121z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo60980b(ActivityRecognitionResult activityRecognitionResult) {
        List list = this.f112116D;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bett bett = (bett) list.get(i);
            if (beua.m95854a(activityRecognitionResult)) {
                int i2 = bett.f112435a + 1;
                bett.f112435a = i2;
                if (i2 > 1) {
                    bett.f112438d.mo61147a(bett.f112437c);
                }
            } else if (beua.m95855b(activityRecognitionResult)) {
                int i3 = bett.f112436b + 1;
                bett.f112436b = i3;
                if (i3 > 2) {
                    beua beua = bett.f112438d;
                    beua.mo61146a(new bets(beua, bett.f112437c));
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo60988d() {
        return this.f112121I && cfam.m138540j() && !this.f112189p;
    }

    /* renamed from: c */
    public final void mo60985c(long j) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("removeActivityDetectionInternalClient ");
        sb.append(j);
        sb.toString();
        this.f112146aJ.remove(Long.valueOf(j));
        mo60982b(false, false);
    }

    /* renamed from: c */
    public final void mo60986c(boolean z) {
        boolean z2 = this.f112170at;
        StringBuilder sb = new StringBuilder(58);
        sb.append("wifi connectivity status changed from = ");
        sb.append(z2);
        sb.append(" , to = ");
        sb.append(z);
        sb.toString();
        this.f112170at = z;
    }

    /* renamed from: c */
    public final boolean mo60987c() {
        return this.f112120H && !this.f112115C.mo63015c() && this.f112141aE && cerp.m138130b() && this.f112183j.mo62798b(bfgt.f113819i) && !this.f112189p && this.f112125M != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r7.f112114B.mo62860d() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (mo60983b() != false) goto L_0x005b;
     */
    /* renamed from: b */
    public final void mo60981b(boolean z) {
        int i;
        boolean c = mo60987c();
        if (!z && this.f112141aE && !this.f112151aa) {
            if (!this.f112189p) {
                long sensorBatchingNonwearableMaxPeriodMillis = cese.f183399a.mo6606a().sensorBatchingNonwearableMaxPeriodMillis();
                long o = mo60999o();
                long i2 = mo60993i();
                if (!c) {
                    if (!this.f112114B.mo62860d()) {
                    }
                }
            } else if (Math.min(this.f112133U, this.f112134V) != Long.MAX_VALUE) {
            }
            bete bete = this.f112191r;
            int i3 = this.f112156af;
            if (!c) {
                i = DefaultRetryPolicy.DEFAULT_TIMEOUT_MS;
            } else {
                i = 6500;
            }
            bete.mo61123a(i3, i);
            if (c) {
                this.f112192s.mo61123a(this.f112157ag, 1300);
                return;
            }
            this.f112192s.mo61122a();
        }
        this.f112191r.mo61122a();
        this.f112192s.mo61122a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60961a(long j) {
        beti beti = this.f112190q;
        if (!(beti instanceof betd)) {
            String.valueOf(beti.getClass().getName()).concat(" attempt to setFirstScreenStateChangeTimeSinceLastTrigger, ignored.");
        } else {
            this.f112171au = j;
        }
    }

    /* renamed from: a */
    public final void mo60962a(long j, boolean z) {
        StringBuilder sb = new StringBuilder(62);
        sb.append("addActivityDetectionInternalClient ");
        sb.append(j);
        sb.append(", ");
        sb.append(z);
        sb.toString();
        this.f112146aJ.add(Long.valueOf(j));
        mo60982b(true, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0379, code lost:
        if (r6 >= r3.mo43490a(4)) goto L_0x039d;
     */
    /* renamed from: a */
    public final void mo60963a(bfma bfma) {
        bfma bfma2;
        berb berb;
        boolean z;
        boolean z2;
        long j;
        long j2;
        Iterator it;
        int i;
        int i2;
        berb berb2 = this;
        Iterator it2 = bfma.mo61912b().iterator();
        while (it2.hasNext()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) it2.next();
            beqw.m95471a(berb2.f112181h, activityRecognitionResult, true);
            berb2.f112194u = activityRecognitionResult;
            int a = activityRecognitionResult.mo43491a().mo43513a();
            if (berb2.f112189p) {
                if (!berb2.f112140aD) {
                    Iterator it3 = activityRecognitionResult.f79300a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        DetectedActivity detectedActivity = (DetectedActivity) it3.next();
                        if (a == 9 && detectedActivity.f79320e == 100) {
                            berb2.mo60972a(true);
                            break;
                        }
                    }
                } else if (a != 3 && a != 9) {
                    berb2.mo60972a(false);
                }
            }
            int[] iArr = f112110aO;
            int binarySearch = Arrays.binarySearch(iArr, a);
            if (binarySearch >= 0 && iArr[binarySearch] == a) {
                berb2.f112195v = activityRecognitionResult;
            }
            besy besy = berb2.f112137Y;
            if (besy != null && a == 0) {
                long j3 = activityRecognitionResult.f79302c;
                besx besx = besy.f112342f;
                besx.mo61112a(j3);
                besx.f112335d = j3;
                if (besx.f112334c == -1) {
                    besx.f112334c = j3;
                }
                besx.f112332a++;
            }
            bflw bflw = berb2.f112175ay;
            DetectedActivity a2 = activityRecognitionResult.mo43491a();
            long j4 = activityRecognitionResult.f79302c;
            if (j4 - bflw.f114380c >= 600000) {
                bflw.f114380c = j4;
                long j5 = -3600000 + j4;
                int size = bflw.f114378a.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        j = j4;
                        break;
                    }
                    j = j4;
                    if (((beta) bflw.f114378a.get(i3)).f112347b >= j5) {
                        break;
                    }
                    i3++;
                    j4 = j;
                }
                if (i3 > 0) {
                    bflw.f114378a.subList(0, i3).clear();
                }
            } else {
                j = j4;
            }
            int a3 = a2.mo43513a();
            if (a3 == 4 || a3 == 5) {
                berb2 = this;
            } else {
                String valueOf = String.valueOf(activityRecognitionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb.append("Adding: ");
                sb.append(valueOf);
                sb.toString();
                long j6 = j;
                bflw.f114378a.add(new beta(a3, j6));
                if (!bflw.f114378a.isEmpty()) {
                    ArrayList arrayList = bflw.f114378a;
                    ArrayList arrayList2 = new ArrayList();
                    beta beta = (beta) arrayList.get(0);
                    long j7 = 0;
                    int i4 = 1;
                    while (i4 < arrayList.size()) {
                        beta beta2 = (beta) arrayList.get(i4);
                        int i5 = i4 - 1;
                        beta beta3 = (beta) arrayList.get(i5);
                        int i6 = i5;
                        beta beta4 = beta;
                        long j8 = beta2.f112347b - beta3.f112347b;
                        if (j8 > 420000) {
                            arrayList2.add(bflw.m97207a(beta4, j7, beta3, 210000));
                            it = it2;
                            j2 = j6;
                            j7 = 210000;
                            beta = beta2;
                        } else {
                            beta = beta4;
                            int i7 = beta.f112346a;
                            it = it2;
                            if (beta2.f112346a == i7) {
                                j2 = j6;
                            } else {
                                if (i7 != 0) {
                                    j2 = j6;
                                    i = i4;
                                } else {
                                    beta beta5 = (beta) bflw.f114378a.get(i6);
                                    int i8 = i4;
                                    int i9 = 0;
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        i = i4;
                                        if (i8 >= bflw.f114378a.size()) {
                                            j2 = j6;
                                            break;
                                        }
                                        beta beta6 = (beta) bflw.f114378a.get(i8);
                                        j2 = j6;
                                        if (beta6.f112347b - beta5.f112347b > 900000) {
                                            break;
                                        }
                                        int i12 = beta6.f112346a;
                                        if (i12 == 0) {
                                            i9++;
                                        } else if (i12 == 1) {
                                            i10++;
                                        } else if (i12 == 2) {
                                            i11++;
                                        }
                                        if (i12 == 0) {
                                            break;
                                        }
                                        i8++;
                                        i4 = i;
                                        j6 = j2;
                                    }
                                    if (i10 == 0 && i11 == 0) {
                                        i2 = (i9 > 0 || i8 == bflw.f114378a.size()) ? i8 == bflw.f114378a.size() ? i8 - 1 : i8 : -1;
                                    } else {
                                        i2 = -1;
                                    }
                                    if (i2 != -1) {
                                        i4 = i2;
                                    }
                                }
                                long j9 = j8 / 2;
                                arrayList2.add(bflw.m97207a(beta, j7, beta3, j8 - j9));
                                j7 = j9;
                                beta = beta2;
                                i4 = i;
                            }
                        }
                        i4++;
                        it2 = it;
                        j6 = j2;
                    }
                    Iterator it4 = it2;
                    arrayList2.add(bflw.m97207a(beta, j7, (beta) arrayList.get(arrayList.size() - 1), 210000));
                    List<besz> unmodifiableList = Collections.unmodifiableList(arrayList2);
                    long j10 = activityRecognitionResult.f79301b - j6;
                    for (besz besz : unmodifiableList) {
                        long j11 = besz.f112343a;
                        long j12 = besz.f112344b;
                        String valueOf2 = String.valueOf(new Date(j10 + j11));
                        String valueOf3 = String.valueOf(new Date(besz.f112344b + j10));
                        int i13 = besz.f112345c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 138 + String.valueOf(valueOf3).length());
                        sb2.append("MergedActivity [startMillsSinceBoot=");
                        sb2.append(j11);
                        sb2.append(", endMillisSinceBoot=");
                        sb2.append(j12);
                        sb2.append(", start=");
                        sb2.append(valueOf2);
                        sb2.append(", end=");
                        sb2.append(valueOf3);
                        sb2.append(", activityType=");
                        sb2.append(i13);
                        sb2.append("]");
                        sb2.toString();
                    }
                    bflw.f114379b = unmodifiableList;
                    berb2 = this;
                    it2 = it4;
                } else {
                    berb2 = this;
                }
            }
        }
        if (bfma.mo61911a()) {
            if (cese.m138153b()) {
                berb = this;
                berv berv = berb.f112198y;
                long c = bfma.mo61913c();
                if (c == -1) {
                    z2 = berv.mo61072a();
                    bfma2 = bfma;
                } else {
                    bfma2 = bfma;
                    List<ActivityRecognitionResult> a4 = bfma2.mo61908a(Math.max(c - 480000, berv.f112251d));
                    boolean a5 = berv.mo61072a();
                    for (ActivityRecognitionResult activityRecognitionResult2 : a4) {
                        List list = activityRecognitionResult2.f79300a;
                        if (list.size() == 1) {
                            int a6 = ((DetectedActivity) list.get(0)).mo43513a();
                            for (int i14 : berv.f112248a) {
                                if (a6 == i14) {
                                    a5 = berv.mo61072a();
                                    break;
                                }
                            }
                            if (a6 > 15) {
                                StringBuilder sb3 = new StringBuilder(42);
                                sb3.append("Unable to handle new activity: ");
                                sb3.append(a6);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        }
                        berv.f112251d = activityRecognitionResult2.f79302c;
                        if (activityRecognitionResult2.mo43490a(3) < 60) {
                            int a7 = activityRecognitionResult2.mo43490a(3);
                            if (a7 >= activityRecognitionResult2.mo43490a(0)) {
                                if (a7 >= activityRecognitionResult2.mo43490a(1)) {
                                    if (a7 >= activityRecognitionResult2.mo43490a(2)) {
                                    }
                                }
                            }
                            berv.mo61073b();
                        } else {
                            if (berv.f112249b == null) {
                                berv.f112249b = activityRecognitionResult2;
                            }
                            berv.f112250c = activityRecognitionResult2;
                            berv.f112252e++;
                            if (berv.mo61072a()) {
                                a5 = true;
                            }
                        }
                        int i15 = berv.f112252e;
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("shouldSwitchToDeepStill: consecutiveStills=");
                        sb4.append(i15);
                        sb4.toString();
                        a5 = false;
                    }
                    z2 = a5;
                }
                z = z2;
            } else {
                berb = this;
                bfma2 = bfma;
                z = false;
            }
            if (f112107Z != z) {
                berb.mo60974a(z, true);
            }
        } else {
            berb = this;
            bfma2 = bfma;
        }
        berb.f112178e.mo61008a(bfma2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: b */
    public final void mo60982b(boolean z, boolean z2) {
        long j;
        long j2;
        long j3;
        boolean z3 = z2;
        mo61001q();
        long j4 = this.f112133U;
        long j5 = this.f112147aK;
        long j6 = this.f112134V;
        if (this.f112146aJ.isEmpty() && this.f112129Q == 0) {
            this.f112133U = Long.MAX_VALUE;
            this.f112147aK = Long.MAX_VALUE;
        } else {
            if (!this.f112146aJ.isEmpty()) {
                String valueOf = String.valueOf(this.f112146aJ);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("has internal client: ");
                sb.append(valueOf);
                sb.toString();
                long longValue = ((Long) this.f112146aJ.peek()).longValue();
                this.f112133U = Math.min(this.f112131S, longValue);
                if (cese.f183399a.mo6606a().arBatchingApiLatencyFixRollback()) {
                    this.f112147aK = Math.min(this.f112147aK, longValue);
                } else {
                    j3 = Math.min(this.f112132T, longValue);
                }
            } else {
                this.f112133U = this.f112131S;
                j3 = this.f112132T;
            }
            this.f112147aK = j3;
        }
        long d = m95481d(this.f112133U);
        this.f112133U = d;
        long max = Math.max(this.f112147aK, d);
        this.f112147aK = max;
        if (max != Long.MAX_VALUE) {
            long j7 = this.f112133U;
            if (j7 != 0) {
                if (j7 != 0) {
                    this.f112147aK = j7 * Math.min(80L, max / j7);
                } else {
                    this.f112147aK = 4000;
                }
            }
        }
        if (!this.f112130R.isEmpty()) {
            j = ((Long) this.f112130R.peek()).longValue();
            this.f112134V = j;
        } else {
            this.f112134V = Long.MAX_VALUE;
            j = Long.MAX_VALUE;
        }
        this.f112134V = m95481d(j);
        boolean d2 = this.f112114B.mo62860d();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("hardwareArDetector.isEnabled(): ");
        sb2.append(d2);
        sb2.toString();
        if (this.f112114B.mo62860d()) {
            long hardwareActivityMinPeriodMillis = cers.f183391a.mo6606a().hardwareActivityMinPeriodMillis();
            long j8 = this.f112147aK;
            long j9 = this.f112133U;
            long j10 = this.f112134V;
            j2 = j6;
            StringBuilder sb3 = new StringBuilder(236);
            sb3.append("hardwareArDetector.hardwareActivityMinPeriodMillis() =  ");
            sb3.append(hardwareActivityMinPeriodMillis);
            sb3.append(", hardwareArDetector.maxReportLatencyMillis() = ");
            sb3.append(j8);
            sb3.append(", minPeriodMillis = ");
            sb3.append(j9);
            sb3.append(", minPeriodTiltDetectorMillis = ");
            sb3.append(j10);
            sb3.toString();
            if (cerm.m138127b()) {
                long max2 = Math.max(hardwareActivityMinPeriodMillis, this.f112147aK);
                this.f112133U = max2;
                StringBuilder sb4 = new StringBuilder(39);
                sb4.append("minPeriodMillis =  ");
                sb4.append(max2);
                sb4.toString();
            } else {
                long max3 = Math.max(hardwareActivityMinPeriodMillis, this.f112133U);
                this.f112133U = max3;
                StringBuilder sb5 = new StringBuilder(51);
                sb5.append("minPeriodMillis no batching =  ");
                sb5.append(max3);
                sb5.toString();
            }
            this.f112134V = Math.max(hardwareActivityMinPeriodMillis, this.f112134V);
        } else {
            j2 = j6;
        }
        Locale locale = Locale.US;
        Boolean valueOf2 = Boolean.valueOf(z2);
        Object[] objArr = {Long.valueOf(this.f112133U), Long.valueOf(this.f112147aK), Long.valueOf(this.f112134V), Boolean.valueOf(z), valueOf2, Integer.valueOf(this.f112146aJ.size()), Integer.valueOf(this.f112130R.size()), Integer.valueOf(this.f112129Q)};
        long o = mo60999o();
        StringBuilder sb6 = new StringBuilder(46);
        sb6.append("overallMinPeriodMillis =  ");
        sb6.append(o);
        sb6.toString();
        if (mo60999o() == Long.MAX_VALUE) {
            if (this.f112143aG.isEmpty() && !cese.f183399a.mo6606a().arDisallowActivityDetectionDisable()) {
                this.f112190q.mo61108s();
            }
        } else if (z) {
            Locale locale2 = Locale.US;
            new Object[1][0] = valueOf2;
            this.f112190q.mo61094a(z3);
        }
        long j11 = this.f112133U;
        if (j4 != j11 || j5 != this.f112147aK || j2 != this.f112134V || z3) {
            bfor bfor = this.f112181h;
            long j12 = this.f112147aK;
            long j13 = this.f112134V;
            bfor.mo62047a(new bere(bfos.SET_ACTIVITY_PERIOD, bfor.mo62055b(), Long.toHexString(j12), (int) j11, (int) j13, z2 ? 1 : 0, j11, j12, j13, z2));
        }
    }

    /* renamed from: b */
    public final boolean mo60983b() {
        bgnb bgnb;
        return this.f112189p && mo60976a(9) && ((bgnb = this.f112172av) == null || !bgnb.f116833a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60964a(bfmg bfmg) {
        bfmg bfmg2 = this.f112193t;
        if (bfmg2 == null || !bfmg2.equals(bfmg)) {
            this.f112193t = bfmg;
            if (!cfam.f183546a.mo6606a().setAllowIdleAlarmForSleep() || !mo60989e()) {
                long j = bfmg.f114394a;
                String valueOf = String.valueOf(new Date(bgof.m99492e() + bfmg.f114394a));
                long j2 = bfmg.f114395b;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
                sb.append("Alarm set to: ");
                sb.append(j);
                sb.append(" ");
                sb.append(valueOf);
                sb.append(" windowLength=");
                sb.append(j2);
                sb.toString();
                this.f112184k.mo62916a(bgnq.ACTIVITY_DETECTION, bfmg.f114394a, bfmg.f114395b, this.f112135W.f112233c);
                return;
            }
            bgns bgns = this.f112184k;
            bgnq bgnq = bgnq.ACTIVITY_DETECTION;
            long j3 = bfmg.f114394a;
            bgmj bgmj = this.f112135W.f112233c;
            bgns.mo62915a(bgnq, j3);
        }
    }

    /* renamed from: a */
    public final void mo60966a(bgmv bgmv) {
        bgne bgne = this.f112142aF;
        if (bgmv != null) {
            if (bgne.f116863m != -1) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(bgmv.f116830a - bgne.f116863m);
                bgne.f116864n = seconds;
                StringBuilder sb = new StringBuilder(40);
                sb.append("Audio lag in secs = ");
                sb.append(seconds);
                sb.toString();
            }
            bgne.f116863m = bgmv.f116830a;
        }
    }

    /* renamed from: a */
    public final void mo60967a(ActivityRecognitionResult activityRecognitionResult) {
        mo60963a(new bfnm(activityRecognitionResult));
    }

    /* renamed from: a */
    public final void mo60968a(FloorChangeEvent floorChangeEvent) {
        this.f112178e.mo61011a(Collections.singletonList(floorChangeEvent));
        berf.m95534a(this.f112181h, floorChangeEvent);
    }

    /* renamed from: a */
    public final void mo60969a(List list) {
        if (this.f112114B.mo62861e()) {
            bgne bgne = this.f112142aF;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bgmt bgmt = (bgmt) it.next();
                if (bgmt.f116825c != 0) {
                    long j = bgmt.f116823a;
                    int i = bgmt.f116824b;
                    if (i != 5 && bgne.f116856e.remove(Integer.valueOf(i))) {
                        bgne.f116857f.put(Long.valueOf(j), Collections.unmodifiableList(bgne.mo63021a(bgne.f116856e)));
                    }
                } else {
                    long j2 = bgmt.f116823a;
                    int i2 = bgmt.f116824b;
                    if (i2 == 5) {
                        bgne.f116855d.mo86143a(j2);
                    } else if (bgne.f116856e.add(Integer.valueOf(i2))) {
                        bgne.f116857f.put(Long.valueOf(j2), Collections.unmodifiableList(bgne.mo63021a(bgne.f116856e)));
                    }
                }
                bgmk bgmk = bgne.f116854c;
                bgne.f116861k = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e0, code lost:
        if (r14 != 17) goto L_0x0221;
     */
    /* renamed from: a */
    public final void mo60970a(List list, int[] iArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = list;
        int[] iArr2 = iArr;
        bgne bgne = this.f112142aF;
        bgnd bgnd = bgne.f116858g;
        float f = 100.0f;
        int i4 = 1;
        if (bgnd.f116842b) {
            int i5 = -1;
            int i6 = 0;
            int i7 = -1;
            while (i6 < iArr2.length) {
                int i8 = iArr2[i6];
                if (i8 == i4) {
                    i7 = i6;
                } else if (i8 == 4) {
                    i5 = i6;
                }
                i6++;
                i4 = 1;
            }
            if (!(list.isEmpty() || i7 == -1 || i5 == -1)) {
                HashSet hashSet = new HashSet();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < list.size()) {
                    bgms bgms = (bgms) arrayList.get(i9);
                    String valueOf = String.valueOf(bgms);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("received sample = ");
                    sb.append(valueOf);
                    sb.toString();
                    float[] fArr = bgms.f116822b;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < fArr.length) {
                        float f2 = fArr[i12];
                        if (f2 > 0.0f) {
                            int round = Math.round(f2 * f);
                            int i14 = iArr2[i12];
                            i = i9;
                            StringBuilder sb2 = new StringBuilder(82);
                            sb2.append("confidence = ");
                            sb2.append(round);
                            sb2.append(", index = ");
                            sb2.append(i12);
                            sb2.append(", activityDictionary[i] = ");
                            sb2.append(i14);
                            sb2.toString();
                            if (round > i13) {
                                i13 = round;
                            }
                            if (round >= bgnd.f116845e.intValue() && ((i3 = iArr2[i12]) == 7 || i3 == 8)) {
                                i10++;
                            } else if (round >= bgnd.f116847g.intValue() && ((i2 = iArr2[i12]) == 16 || i2 == 17 || i2 == 0)) {
                                i11++;
                            }
                        } else {
                            i = i9;
                        }
                        i12++;
                        i9 = i;
                        f = 100.0f;
                    }
                    if (Math.round(fArr[i7] * f) >= i13) {
                        hashSet.add(Integer.valueOf(i9));
                    }
                    i9++;
                }
                String valueOf2 = String.valueOf(hashSet);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 75);
                sb3.append("on foot count = ");
                sb3.append(i10);
                sb3.append(", vehicle count = ");
                sb3.append(i11);
                sb3.append(", biking indices = ");
                sb3.append(valueOf2);
                sb3.toString();
                if (i10 < bgnd.f116846f.intValue() && i11 < bgnd.f116848h.intValue()) {
                    hashSet = null;
                }
                if (hashSet != null && !hashSet.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        bgms bgms2 = (bgms) arrayList.get(i15);
                        if (hashSet.contains(Integer.valueOf(i15))) {
                            float[] fArr2 = bgms2.f116822b;
                            float f3 = fArr2[i7];
                            fArr2[i7] = fArr2[i5];
                            fArr2[i5] = f3;
                            arrayList2.add(new bgms(bgms2.f116821a, fArr2));
                        } else {
                            arrayList2.add(bgms2);
                        }
                    }
                    arrayList = arrayList2;
                }
            }
        }
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            bgms bgms3 = (bgms) arrayList.get(i16);
            float[] fArr3 = bgms3.f116822b;
            int length = fArr3.length;
            int length2 = iArr2.length;
            if (length == length2) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb4 = new StringBuilder(65);
            sb4.append("sample size doesn't match, expect ");
            sb4.append(length2);
            sb4.append(" but see ");
            sb4.append(length);
            bmxy.m108589a(z, sb4.toString());
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < fArr3.length; i19++) {
                float f4 = fArr3[i19];
                if (f4 > 0.0f) {
                    int round2 = Math.round(f4 * 100.0f);
                    int i20 = iArr2[i19];
                    if (i20 != 7 && i20 != 8) {
                        if (i20 == 16) {
                        }
                        if (bgne.f116862l == bevp.CHRE_DNN_GRU_V1.f112768am || bgne.f116862l == bevp.CHRE_DNN_V2.f112768am || bgne.f116862l == bevp.CHRE_CNN_GRU_V1.f112768am) {
                            i18 = Math.max(i18, round2);
                        } else {
                            i18 += round2;
                        }
                    } else if (bgne.f116862l == bevp.CHRE_DNN_GRU_V1.f112768am || bgne.f116862l == bevp.CHRE_DNN_V2.f112768am || bgne.f116862l == bevp.CHRE_CNN_GRU_V1.f112768am) {
                        i17 = Math.max(i17, round2);
                    } else {
                        i17 += round2;
                    }
                    arrayList3.add(new DetectedActivity(iArr2[i19], round2));
                }
            }
            if (i17 > 0) {
                arrayList3.add(new DetectedActivity(2, i17));
            }
            if (i18 > 0) {
                arrayList3.add(new DetectedActivity(0, i18));
            }
            Collections.sort(arrayList3, DetectedActivity.f79316a);
            bgne.f116857f.put(Long.valueOf(bgms3.f116821a), arrayList3);
            bgmk bgmk = bgne.f116854c;
            bgne.f116861k = SystemClock.elapsedRealtime();
            String valueOf3 = String.valueOf(arrayList3);
            String arrays = Arrays.toString(bgms3.f116822b);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 23 + String.valueOf(arrays).length());
            sb5.append("addSamples->");
            sb5.append(valueOf3);
            sb5.append(", rawArray=");
            sb5.append(arrays);
            sb5.toString();
        }
    }

    /* renamed from: a */
    public final void mo60971a(Map map) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f112143aG = map;
        if (this.f112114B.mo62858b()) {
            mo61004t();
            if (this.f112143aG.isEmpty()) {
                mo60982b(false, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo60972a(boolean z) {
        StringBuilder sb = new StringBuilder(24);
        sb.append("setIsWatchOffBody(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        this.f112140aD = z;
    }

    /* renamed from: a */
    public final void mo60973a(boolean z, int i, bfmj bfmj) {
        if (i == 1) {
            this.f112190q.mo61119v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60974a(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Set deep still mode: ");
        sb.append(z);
        sb.toString();
        f112107Z = z;
        if (z2) {
            bfnl x = m95482x();
            bsax bsax = new bsax(bgox.f117116cc);
            bsax.mo70119b(1, f112107Z);
            try {
                x.mo61994a(bsax);
            } catch (IOException e) {
            }
        }
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("Notify the deep still change listeners. deepStillMode = ");
        sb2.append(z);
        sb2.toString();
        List list = this.f112167aq;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((berm) list.get(i)).mo61057a(z);
        }
        if (!z) {
            bhck bhck = this.f112138aB;
            if (bhck != null) {
                bhck.mo63551a("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
            }
            this.f112181h.mo62048a(bfos.DEEP_STILL_MODE_OFF);
            return;
        }
        bhck bhck2 = this.f112138aB;
        if (bhck2 != null) {
            bhck2.mo63551a("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
        }
        this.f112181h.mo62048a(bfos.DEEP_STILL_MODE_ON);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo60975a() {
        return f112107Z && !mo60990f() && ((this.f112189p && mo60976a(9) && this.f112140aD) || !mo60976a(9));
    }

    /* renamed from: a */
    public final boolean mo60976a(int i) {
        return this.f112136X.containsKey(Integer.valueOf(i));
    }
}
