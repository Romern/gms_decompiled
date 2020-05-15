package p000;

import android.content.ComponentName;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: aksc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksc {

    /* renamed from: A */
    private boolean f72550A = false;

    /* renamed from: B */
    private boolean f72551B = false;

    /* renamed from: C */
    private boolean f72552C = false;

    /* renamed from: D */
    private boolean f72553D = false;

    /* renamed from: E */
    private boolean f72554E = false;

    /* renamed from: F */
    private boolean f72555F = false;

    /* renamed from: G */
    private boolean f72556G = false;

    /* renamed from: H */
    private boolean f72557H = false;

    /* renamed from: I */
    private boolean f72558I = false;

    /* renamed from: J */
    private boolean f72559J = true;

    /* renamed from: K */
    private boolean f72560K = false;

    /* renamed from: L */
    private boolean f72561L = false;

    /* renamed from: M */
    private int f72562M = Integer.MAX_VALUE;

    /* renamed from: N */
    private float f72563N;

    /* renamed from: O */
    private boolean f72564O = false;

    /* renamed from: P */
    private boolean f72565P = false;

    /* renamed from: Q */
    private long f72566Q;

    /* renamed from: R */
    private int f72567R;

    /* renamed from: S */
    private int f72568S;

    /* renamed from: T */
    private int f72569T;

    /* renamed from: U */
    private int f72570U;

    /* renamed from: V */
    private long f72571V = 0;

    /* renamed from: W */
    private long f72572W = 0;

    /* renamed from: X */
    private int f72573X = 0;

    /* renamed from: Y */
    private int f72574Y = 0;

    /* renamed from: Z */
    private final ArrayList f72575Z = new ArrayList();

    /* renamed from: a */
    private final aksb f72576a;

    /* renamed from: aa */
    private boolean f72577aa = false;

    /* renamed from: ab */
    private boolean f72578ab = false;

    /* renamed from: ac */
    private boolean f72579ac;

    /* renamed from: ad */
    private final int f72580ad;

    /* renamed from: ae */
    private int f72581ae = 1;

    /* renamed from: af */
    private int f72582af = 1;

    /* renamed from: b */
    private int f72583b = 0;

    /* renamed from: c */
    private int f72584c = 0;

    /* renamed from: d */
    private int f72585d = 0;

    /* renamed from: e */
    private int f72586e = 0;

    /* renamed from: f */
    private int f72587f = 0;

    /* renamed from: g */
    private int f72588g = 0;

    /* renamed from: h */
    private int f72589h = 0;

    /* renamed from: i */
    private int f72590i = 0;

    /* renamed from: j */
    private int f72591j = 0;

    /* renamed from: k */
    private int f72592k = 0;

    /* renamed from: l */
    private int f72593l = 0;

    /* renamed from: m */
    private int f72594m = 0;

    /* renamed from: n */
    private int f72595n = 0;

    /* renamed from: o */
    private int f72596o = 0;

    /* renamed from: p */
    private int f72597p = 0;

    /* renamed from: q */
    private long f72598q = 0;

    /* renamed from: r */
    private long f72599r = 0;

    /* renamed from: s */
    private long f72600s = 0;

    /* renamed from: t */
    private long f72601t = 0;

    /* renamed from: u */
    private long f72602u = 0;

    /* renamed from: v */
    private long f72603v = 0;

    /* renamed from: w */
    private boolean f72604w = false;

    /* renamed from: x */
    private boolean f72605x = false;

    /* renamed from: y */
    private boolean f72606y = false;

    /* renamed from: z */
    private boolean f72607z = false;

    public aksc(aksb aksb, int i) {
        this.f72576a = aksb;
        this.f72580ad = i;
    }

    /* renamed from: a */
    private static String m60298a(long j, int i) {
        return i != 0 ? Long.toString(j / ((long) i)) : "-";
    }

    /* renamed from: A */
    public final synchronized void mo39751A() {
        this.f72581ae = 2;
    }

    /* renamed from: B */
    public final synchronized void mo39752B() {
        this.f72582af = 1;
    }

    /* renamed from: a */
    public final synchronized void mo39753a() {
        this.f72583b++;
    }

    /* renamed from: a */
    public final synchronized void mo39754a(float f) {
        this.f72563N = f;
    }

    /* renamed from: a */
    public final synchronized void mo39755a(int i) {
        this.f72562M = i;
    }

    /* renamed from: a */
    public final synchronized void mo39757a(long j) {
        this.f72598q += j;
        this.f72592k++;
    }

    /* renamed from: a */
    public final synchronized void mo39760a(boolean z) {
        this.f72560K = z;
    }

    /* renamed from: a */
    public final synchronized void mo39761a(boolean z, boolean z2) {
        this.f72604w = true;
        this.f72606y = z;
        this.f72605x = z2;
        this.f72607z = false;
        this.f72550A = false;
    }

    /* renamed from: a */
    public final synchronized void mo39762a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f72551B = true;
        this.f72554E = z;
        this.f72556G = z2;
        this.f72552C = z3;
        this.f72553D = z4;
        this.f72559J = z5;
    }

    /* renamed from: b */
    public final synchronized void mo39763b() {
        this.f72584c++;
    }

    /* renamed from: b */
    public final synchronized void mo39764b(long j) {
        this.f72599r += j;
        this.f72593l++;
    }

    /* renamed from: b */
    public final synchronized void mo39765b(boolean z) {
        this.f72561L = z;
    }

    /* renamed from: c */
    public final synchronized void mo39766c() {
        this.f72585d++;
    }

    /* renamed from: c */
    public final synchronized void mo39767c(long j) {
        this.f72600s += j;
        this.f72594m++;
    }

    /* renamed from: c */
    public final synchronized void mo39768c(boolean z) {
        this.f72607z = true;
        this.f72550A = z;
        this.f72604w = false;
        this.f72606y = false;
        this.f72605x = false;
    }

    /* renamed from: d */
    public final synchronized void mo39769d() {
        this.f72586e++;
    }

    /* renamed from: d */
    public final synchronized void mo39770d(long j) {
        this.f72601t += j;
        this.f72595n++;
    }

    /* renamed from: e */
    public final synchronized void mo39771e() {
        this.f72587f++;
    }

    /* renamed from: e */
    public final synchronized void mo39772e(long j) {
        this.f72602u += j;
        this.f72596o++;
    }

    /* renamed from: f */
    public final synchronized void mo39773f() {
        this.f72588g++;
    }

    /* renamed from: f */
    public final synchronized void mo39774f(long j) {
        this.f72603v += j;
        this.f72597p++;
    }

    /* renamed from: g */
    public final synchronized void mo39775g() {
        this.f72589h++;
    }

    /* renamed from: g */
    public final synchronized void mo39776g(long j) {
        this.f72566Q = j;
    }

    /* renamed from: h */
    public final synchronized void mo39777h() {
        this.f72590i++;
    }

    /* renamed from: h */
    public final synchronized void mo39778h(long j) {
        this.f72571V += j;
    }

    /* renamed from: i */
    public final synchronized void mo39779i() {
        this.f72591j++;
    }

    /* renamed from: i */
    public final synchronized void mo39780i(long j) {
        this.f72572W += j;
    }

    /* renamed from: j */
    public final synchronized void mo39781j() {
        this.f72564O = true;
    }

    /* renamed from: k */
    public final synchronized void mo39782k() {
        this.f72565P = true;
    }

    /* renamed from: l */
    public final synchronized void mo39783l() {
        this.f72567R++;
    }

    /* renamed from: m */
    public final synchronized void mo39784m() {
        this.f72568S++;
    }

    /* renamed from: n */
    public final synchronized void mo39785n() {
        this.f72569T++;
    }

    /* renamed from: o */
    public final synchronized void mo39786o() {
        this.f72570U++;
    }

    /* renamed from: p */
    public final synchronized void mo39787p() {
        this.f72573X++;
    }

    /* renamed from: q */
    public final synchronized void mo39788q() {
        this.f72574Y++;
    }

    /* renamed from: r */
    public final synchronized void mo39789r() {
        bxvd da = botq.f134857e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq = (botq) da.f164949b;
        botq.f134862d = 2;
        botq.f134859a |= 1;
        bxvd da2 = botc.f134764f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        botc botc = (botc) da2.f164949b;
        botc.f134766a |= 1;
        botc.f134767b = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq2 = (botq) da.f164949b;
        botc botc2 = (botc) da2.mo74062i();
        botc2.getClass();
        botq2.f134861c = botc2;
        botq2.f134860b = 3;
        this.f72576a.mo39750a((botq) da.mo74062i());
    }

    /* renamed from: s */
    public final synchronized void mo39790s() {
        bxvd da = botq.f134857e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq = (botq) da.f164949b;
        botq.f134862d = 4;
        botq.f134859a |= 1;
        this.f72576a.mo39750a((botq) da.mo74062i());
    }

    /* renamed from: t */
    public final synchronized void mo39791t() {
        synchronized (this) {
            bxvd da = botq.f134857e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            botq botq = (botq) da.f164949b;
            botq.f134862d = 5;
            botq.f134859a |= 1;
            bxvd da2 = bosz.f134750j.mo74144da();
            int i = this.f72581ae;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosz bosz = (bosz) da2.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                bosz.f134753b = i2;
                int i3 = bosz.f134752a | 1;
                bosz.f134752a = i3;
                int i4 = this.f72567R;
                int i5 = i3 | 4;
                bosz.f134752a = i5;
                bosz.f134755d = i4;
                boolean z = this.f72579ac;
                int i6 = i5 | 8;
                bosz.f134752a = i6;
                bosz.f134756e = z;
                float f = this.f72563N;
                int i7 = i6 | 16;
                bosz.f134752a = i7;
                bosz.f134757f = f;
                boolean z2 = this.f72564O;
                int i8 = i7 | 32;
                bosz.f134752a = i8;
                bosz.f134758g = z2;
                boolean z3 = this.f72565P;
                int i9 = i8 | 64;
                bosz.f134752a = i9;
                bosz.f134759h = z3;
                long j = this.f72566Q;
                bosz.f134752a = i9 | 128;
                bosz.f134760i = j;
                int i10 = this.f72580ad;
                if (i10 == 2) {
                    bxvd da3 = botp.f134853c.mo74144da();
                    bxvd da4 = botn.f134801W.mo74144da();
                    boolean z4 = this.f72558I;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    botn botn = (botn) da4.f164949b;
                    int i11 = botn.f134826b | 128;
                    botn.f134826b = i11;
                    botn.f134816N = z4;
                    boolean z5 = this.f72559J;
                    botn.f134826b = i11 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    botn.f134817O = z5;
                    boolean z6 = this.f72551B;
                    int i12 = botn.f134825a | 1;
                    botn.f134825a = i12;
                    botn.f134827c = z6;
                    boolean z7 = this.f72604w;
                    int i13 = i12 | 2;
                    botn.f134825a = i13;
                    botn.f134828d = z7;
                    boolean z8 = this.f72552C;
                    int i14 = i13 | 4;
                    botn.f134825a = i14;
                    botn.f134829e = z8;
                    boolean z9 = this.f72607z;
                    int i15 = i14 | 8;
                    botn.f134825a = i15;
                    botn.f134830f = z9;
                    boolean z10 = this.f72554E;
                    int i16 = i15 | 16;
                    botn.f134825a = i16;
                    botn.f134831g = z10;
                    boolean z11 = this.f72555F;
                    int i17 = i16 | 32;
                    botn.f134825a = i17;
                    botn.f134832h = z11;
                    boolean z12 = this.f72606y;
                    int i18 = i17 | 64;
                    botn.f134825a = i18;
                    botn.f134833i = z12;
                    boolean z13 = this.f72553D;
                    int i19 = i18 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    botn.f134825a = i19;
                    botn.f134835k = z13;
                    boolean z14 = this.f72550A;
                    int i20 = i19 | 512;
                    botn.f134825a = i20;
                    botn.f134836l = z14;
                    boolean z15 = this.f72560K;
                    int i21 = i20 | 128;
                    botn.f134825a = i21;
                    botn.f134834j = z15;
                    boolean z16 = this.f72556G;
                    int i22 = i21 | 1024;
                    botn.f134825a = i22;
                    botn.f134837m = z16;
                    boolean z17 = this.f72557H;
                    int i23 = i22 | 2048;
                    botn.f134825a = i23;
                    botn.f134838n = z17;
                    int i24 = this.f72582af;
                    int i25 = i24 - 1;
                    if (i24 != 0) {
                        botn.f134839o = i25;
                        int i26 = i23 | 4096;
                        botn.f134825a = i26;
                        boolean z18 = this.f72605x;
                        int i27 = i26 | 8192;
                        botn.f134825a = i27;
                        botn.f134840p = z18;
                        boolean z19 = this.f72561L;
                        int i28 = i27 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        botn.f134825a = i28;
                        botn.f134841q = z19;
                        int i29 = this.f72562M;
                        int i30 = i28 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        botn.f134825a = i30;
                        botn.f134842r = i29;
                        bxvd bxvd = da3;
                        long j2 = this.f72598q;
                        int i31 = i30 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        botn.f134825a = i31;
                        botn.f134843s = j2;
                        long j3 = this.f72599r;
                        int i32 = i31 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        botn.f134825a = i32;
                        botn.f134844t = j3;
                        long j4 = this.f72600s;
                        int i33 = i32 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        botn.f134825a = i33;
                        botn.f134845u = j4;
                        long j5 = this.f72601t;
                        int i34 = i33 | 1048576;
                        botn.f134825a = i34;
                        botn.f134846v = j5;
                        long j6 = this.f72602u;
                        int i35 = i34 | 2097152;
                        botn.f134825a = i35;
                        botn.f134847w = j6;
                        long j7 = this.f72603v;
                        botn.f134825a = i35 | 4194304;
                        botn.f134848x = j7;
                        Object[] objArr = {m60298a(j2, this.f72592k), Integer.valueOf(this.f72592k), m60298a(this.f72599r, this.f72593l), Integer.valueOf(this.f72593l), m60298a(this.f72600s, this.f72594m), Integer.valueOf(this.f72594m), m60298a(this.f72601t, this.f72595n), Integer.valueOf(this.f72595n), m60298a(this.f72602u, this.f72596o), Integer.valueOf(this.f72596o), m60298a(this.f72603v, this.f72597p), Integer.valueOf(this.f72597p)};
                        int i36 = this.f72583b;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        botn botn2 = (botn) da4.f164949b;
                        int i37 = botn2.f134825a | 8388608;
                        botn2.f134825a = i37;
                        botn2.f134849y = i36;
                        int i38 = this.f72584c;
                        int i39 = i37 | 16777216;
                        botn2.f134825a = i39;
                        botn2.f134850z = i38;
                        int i40 = this.f72585d;
                        int i41 = i39 | 33554432;
                        botn2.f134825a = i41;
                        botn2.f134803A = i40;
                        int i42 = this.f72586e;
                        int i43 = i41 | 134217728;
                        botn2.f134825a = i43;
                        botn2.f134804B = i42;
                        int i44 = this.f72587f;
                        int i45 = i43 | 268435456;
                        botn2.f134825a = i45;
                        botn2.f134805C = i44;
                        int i46 = this.f72588g;
                        int i47 = i45 | 536870912;
                        botn2.f134825a = i47;
                        botn2.f134806D = i46;
                        int i48 = this.f72589h;
                        int i49 = i47 | JGCastService.FLAG_PRIVATE_DISPLAY;
                        botn2.f134825a = i49;
                        botn2.f134807E = i48;
                        int i50 = this.f72590i;
                        botn2.f134825a = i49 | Integer.MIN_VALUE;
                        botn2.f134808F = i50;
                        int i51 = this.f72591j;
                        int i52 = botn2.f134826b | 1;
                        botn2.f134826b = i52;
                        botn2.f134809G = i51;
                        int i53 = this.f72592k;
                        int i54 = i52 | 2;
                        botn2.f134826b = i54;
                        botn2.f134810H = i53;
                        int i55 = this.f72593l;
                        int i56 = i54 | 4;
                        botn2.f134826b = i56;
                        botn2.f134811I = i55;
                        int i57 = this.f72594m;
                        int i58 = i56 | 8;
                        botn2.f134826b = i58;
                        botn2.f134812J = i57;
                        int i59 = this.f72595n;
                        int i60 = i58 | 16;
                        botn2.f134826b = i60;
                        botn2.f134813K = i59;
                        int i61 = this.f72596o;
                        int i62 = i60 | 32;
                        botn2.f134826b = i62;
                        botn2.f134814L = i61;
                        int i63 = this.f72597p;
                        int i64 = i62 | 64;
                        botn2.f134826b = i64;
                        botn2.f134815M = i63;
                        int i65 = this.f72568S;
                        int i66 = i64 | 512;
                        botn2.f134826b = i66;
                        botn2.f134818P = i65;
                        int i67 = this.f72569T;
                        int i68 = i66 | 1024;
                        botn2.f134826b = i68;
                        botn2.f134819Q = i67;
                        int i69 = this.f72570U;
                        int i70 = i68 | 2048;
                        botn2.f134826b = i70;
                        botn2.f134820R = i69;
                        long j8 = this.f72571V;
                        int i71 = i70 | 4096;
                        botn2.f134826b = i71;
                        botn2.f134821S = j8;
                        long j9 = this.f72572W;
                        int i72 = i71 | 8192;
                        botn2.f134826b = i72;
                        botn2.f134822T = j9;
                        int i73 = this.f72573X;
                        int i74 = i72 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        botn2.f134826b = i74;
                        botn2.f134823U = i73;
                        int i75 = this.f72574Y;
                        botn2.f134826b = i74 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        botn2.f134824V = i75;
                        bxvd bxvd2 = bxvd;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        botp botp = (botp) bxvd2.f164949b;
                        botn botn3 = (botn) da4.mo74062i();
                        botn3.getClass();
                        botp.f134856b = botn3;
                        botp.f134855a = 1;
                        botp botp2 = (botp) bxvd2.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bosz bosz2 = (bosz) da2.f164949b;
                        botp2.getClass();
                        bosz2.f134754c = botp2;
                        bosz2.f134752a |= 2;
                    } else {
                        throw null;
                    }
                } else if (i10 == 4) {
                    bxvd da5 = botp.f134853c.mo74144da();
                    bxvd da6 = botl.f134788k.mo74144da();
                    boolean z20 = this.f72577aa;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    botl botl = (botl) da6.f164949b;
                    int i76 = 1 | botl.f134790a;
                    botl.f134790a = i76;
                    botl.f134791b = z20;
                    boolean z21 = this.f72578ab;
                    int i77 = i76 | 2;
                    botl.f134790a = i77;
                    botl.f134792c = z21;
                    long j10 = this.f72598q;
                    int i78 = i77 | 4;
                    botl.f134790a = i78;
                    botl.f134793d = j10;
                    long j11 = this.f72599r;
                    int i79 = i78 | 8;
                    botl.f134790a = i79;
                    botl.f134794e = j11;
                    int i80 = this.f72583b;
                    int i81 = i79 | 16;
                    botl.f134790a = i81;
                    botl.f134795f = i80;
                    int i82 = this.f72584c;
                    int i83 = i81 | 32;
                    botl.f134790a = i83;
                    botl.f134796g = i82;
                    int i84 = this.f72585d;
                    int i85 = i83 | 64;
                    botl.f134790a = i85;
                    botl.f134797h = i84;
                    int i86 = this.f72592k;
                    int i87 = i85 | 128;
                    botl.f134790a = i87;
                    botl.f134798i = i86;
                    int i88 = this.f72593l;
                    botl.f134790a = i87 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    botl.f134799j = i88;
                    botl botl2 = (botl) da6.mo74062i();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    botp botp3 = (botp) da5.f164949b;
                    botl2.getClass();
                    botp3.f134856b = botl2;
                    botp3.f134855a = 3;
                    botp botp4 = (botp) da5.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bosz bosz3 = (bosz) da2.f164949b;
                    botp4.getClass();
                    bosz3.f134754c = botp4;
                    bosz3.f134752a |= 2;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                botq botq2 = (botq) da.f164949b;
                bosz bosz4 = (bosz) da2.mo74062i();
                bosz4.getClass();
                botq2.f134861c = bosz4;
                botq2.f134860b = 6;
                this.f72576a.mo39750a((botq) da.mo74062i());
            } else {
                throw null;
            }
        }
    }

    /* renamed from: u */
    public final synchronized void mo39792u() {
        this.f72555F = true;
    }

    /* renamed from: v */
    public final synchronized void mo39793v() {
        this.f72557H = true;
    }

    /* renamed from: w */
    public final synchronized void mo39794w() {
        this.f72579ac = true;
    }

    /* renamed from: x */
    public final synchronized void mo39795x() {
        this.f72578ab = true;
    }

    /* renamed from: y */
    public final synchronized void mo39796y() {
        this.f72577aa = true;
    }

    /* renamed from: z */
    public final synchronized void mo39797z() {
        this.f72558I = true;
    }

    /* renamed from: a */
    public final synchronized void mo39756a(int i, boolean z, boolean z2) {
        bxvd da = botq.f134857e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq = (botq) da.f164949b;
        botq.f134862d = 2;
        botq.f134859a |= 1;
        bxvd da2 = botc.f134764f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        botc botc = (botc) da2.f164949b;
        int i2 = botc.f134766a | 1;
        botc.f134766a = i2;
        botc.f134767b = true;
        botc.f134770e = i - 1;
        int i3 = i2 | 8;
        botc.f134766a = i3;
        int i4 = i3 | 2;
        botc.f134766a = i4;
        botc.f134768c = z;
        botc.f134766a = i4 | 4;
        botc.f134769d = z2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq2 = (botq) da.f164949b;
        botc botc2 = (botc) da2.mo74062i();
        botc2.getClass();
        botq2.f134861c = botc2;
        botq2.f134860b = 3;
        this.f72576a.mo39750a((botq) da.mo74062i());
    }

    /* renamed from: a */
    public final synchronized void mo39758a(ComponentName componentName) {
        bxvd da = botq.f134857e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq = (botq) da.f164949b;
        botq.f134862d = 1;
        botq.f134859a |= 1;
        bxvd da2 = botg.f134774e.mo74144da();
        String str = "";
        String str2 = "";
        if (componentName != null) {
            str = bmxx.m108578b(componentName.getClassName());
            str2 = bmxx.m108578b(componentName.getPackageName());
        }
        int i = 3;
        if (!str2.contains(".chrome") && !str2.contains(".chromium")) {
            i = !str2.equals("com.android.vending") ? !str.startsWith("com.google.android.gms.wallet") ? 1 : 2 : 5;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        botg botg = (botg) da2.f164949b;
        botg.f134777b = i - 1;
        int i2 = 1 | botg.f134776a;
        botg.f134776a = i2;
        botg.f134778c = this.f72580ad - 1;
        int i3 = i2 | 2;
        botg.f134776a = i3;
        botg.f134779d = 2;
        botg.f134776a = i3 | 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botq botq2 = (botq) da.f164949b;
        botg botg2 = (botg) da2.mo74062i();
        botg2.getClass();
        botq2.f134861c = botg2;
        botq2.f134860b = 2;
        this.f72576a.mo39750a((botq) da.mo74062i());
    }

    /* renamed from: a */
    public final synchronized void mo39759a(botk botk) {
        this.f72575Z.add(botk);
    }
}
