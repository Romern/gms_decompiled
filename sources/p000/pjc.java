package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pjc extends pil implements pkx {

    /* renamed from: H */
    private static final AtomicInteger f39269H = new AtomicInteger(0);

    /* renamed from: I */
    private static final AtomicLong f39270I = new AtomicLong(0);

    /* renamed from: d */
    public static final AtomicLong f39271d = new AtomicLong(0);

    /* renamed from: A */
    public final ple f39272A;

    /* renamed from: B */
    public String f39273B;

    /* renamed from: C */
    public String f39274C;

    /* renamed from: D */
    public String f39275D;

    /* renamed from: E */
    public pjb f39276E;

    /* renamed from: F */
    final pjk f39277F;

    /* renamed from: G */
    public boolean f39278G;

    /* renamed from: J */
    private final long f39279J = ccxv.f180201a.mo6606a().mo77025k();

    /* renamed from: K */
    private final long f39280K = ccxv.f180201a.mo6606a().mo77024j();

    /* renamed from: L */
    private final boolean f39281L = ccxv.f180201a.mo6606a().mo77036v();

    /* renamed from: M */
    private final int f39282M = ((int) ccxv.f180201a.mo6606a().mo77031q());

    /* renamed from: N */
    private final int f39283N = ((int) ccxv.f180201a.mo6606a().mo77030p());

    /* renamed from: O */
    private int f39284O;

    /* renamed from: P */
    private final Context f39285P;

    /* renamed from: Q */
    private final pky f39286Q;

    /* renamed from: R */
    private final pix f39287R;

    /* renamed from: S */
    private final pkr f39288S;

    /* renamed from: T */
    private pkz f39289T;

    /* renamed from: U */
    private final String f39290U;

    /* renamed from: V */
    private String[] f39291V;

    /* renamed from: W */
    private ScheduledFuture f39292W;

    /* renamed from: X */
    private int f39293X;

    /* renamed from: Y */
    private int f39294Y;

    /* renamed from: Z */
    private bpes f39295Z;

    /* renamed from: aa */
    private final pzd f39296aa;

    /* renamed from: ab */
    private final pzi f39297ab;

    /* renamed from: ac */
    private final long f39298ac = qay.m31777a();

    /* renamed from: ad */
    private JoinOptions f39299ad;

    /* renamed from: ae */
    private final String f39300ae;

    /* renamed from: af */
    private final phx f39301af;

    /* renamed from: ag */
    private final pmx f39302ag;

    /* renamed from: ah */
    private final pqb f39303ah;

    /* renamed from: ai */
    private ScheduledFuture f39304ai;

    /* renamed from: aj */
    private final asfb f39305aj;

    /* renamed from: ak */
    private final String f39306ak;

    /* renamed from: al */
    private final pjh f39307al;

    /* renamed from: am */
    private pji f39308am;

    /* renamed from: an */
    private final piz f39309an;

    /* renamed from: ao */
    private boolean f39310ao;

    /* renamed from: ap */
    private piw f39311ap;

    /* renamed from: aq */
    private final pit f39312aq;

    /* renamed from: ar */
    private final piu f39313ar;

    /* renamed from: as */
    private final pja f39314as;

    /* renamed from: c */
    public final boolean f39315c = ccxy.m132141c();

    /* renamed from: e */
    public final qav f39316e;

    /* renamed from: f */
    public final pld f39317f;

    /* renamed from: g */
    public prb f39318g;

    /* renamed from: h */
    public pku f39319h;

    /* renamed from: i */
    public pkw f39320i;

    /* renamed from: j */
    public final Set f39321j;

    /* renamed from: k */
    public final Map f39322k;

    /* renamed from: l */
    public ApplicationMetadata f39323l;

    /* renamed from: m */
    public String f39324m;

    /* renamed from: n */
    public String f39325n;

    /* renamed from: o */
    public boolean f39326o;

    /* renamed from: p */
    public boolean f39327p;

    /* renamed from: q */
    public LaunchOptions f39328q;

    /* renamed from: r */
    public String f39329r;

    /* renamed from: s */
    public String f39330s;

    /* renamed from: t */
    pjf f39331t;

    /* renamed from: u */
    public long f39332u;

    /* renamed from: v */
    public final boolean f39333v;

    /* renamed from: w */
    public final phy f39334w;

    /* renamed from: x */
    public final poj f39335x;

    /* renamed from: y */
    public pim f39336y;

    /* renamed from: z */
    blsw f39337z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public pjc(Context context, ScheduledExecutorService scheduledExecutorService, CastDevice castDevice, String str, pim pim, phy phy, poj poj, pzd pzd, pzi pzi, pmx pmx, pqb pqb) {
        super(r9, scheduledExecutorService);
        String str2;
        CastDevice castDevice2 = castDevice;
        pim pim2 = pim;
        this.f39336y = pim2;
        int incrementAndGet = f39269H.incrementAndGet();
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(incrementAndGet);
        this.f39316e = new qav(String.format(locale, "%s|%s|%d", "CDC", this.f39336y.f39235d, valueOf));
        if (TextUtils.isEmpty(this.f39336y.f39235d)) {
            this.f39306ak = String.format(Locale.ROOT, "controller-%04d-%s", valueOf, this.f39336y.f39232a);
        } else {
            Locale locale2 = Locale.ROOT;
            pim pim3 = this.f39336y;
            this.f39306ak = String.format(locale2, "controller-%04d-%s %s", valueOf, pim3.f39232a, pim3.f39235d);
        }
        this.f39316e.mo23669a(this.f39336y.f39235d);
        this.f39316e.mo23673b("Creating a new CastDeviceController from %s for %s", pim2.f39232a, castDevice2);
        this.f39293X = 0;
        this.f39284O = 0;
        this.f39285P = context;
        this.f39333v = srq.m36140a(this.f39336y.f39233b);
        mo23237a(this.f39336y.f39234c);
        this.f39334w = phy;
        this.f39335x = poj;
        this.f39322k = new HashMap();
        this.f39321j = new HashSet();
        this.f39294Y = 0;
        this.f39295Z = bpes.ERROR_UNKNOWN;
        this.f39272A = new ple();
        this.f39296aa = pzd;
        this.f39312aq = new pit(this);
        this.f39297ab = pzi;
        this.f39313ar = new piu(this);
        if ("gms_cast_mrp".equals(this.f39336y.f39232a) || "gms_cast_rcn".equals(this.f39336y.f39232a)) {
            str2 = "com.google.android.gms";
        } else {
            str2 = this.f39336y.f39232a;
        }
        String valueOf2 = String.valueOf(this.f39336y.f39232a);
        this.f39305aj = new asfb(context, 1, valueOf2.length() == 0 ? new String("CastDeviceController-") : "CastDeviceController-".concat(valueOf2), this.f39336y.f39232a, str2, "CAST");
        pky a = pkj.m30682a(context, this, this.f39231b, this.f39336y.f39232a, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, true, pze.m31706a(castDevice), phy);
        this.f39286Q = a;
        ((pkk) a).f39465d = castDevice2.f29723k;
        this.f39287R = new pix(this);
        pld pld = new pld(this, "receiver-0", this.f39306ak);
        this.f39317f = pld;
        mo23244a(pld);
        piv piv = new piv(this, context.getApplicationContext(), this.f39336y.f39232a, this.f39306ak, this.f39230a);
        this.f39288S = piv;
        mo23244a(piv);
        if (pie.f39205a || castDevice2.mo17496a(32)) {
            this.f39311ap = new piw(this);
            prb prb = new prb("receiver-0", this.f39306ak);
            this.f39318g = prb;
            prb.f40098f = this.f39311ap;
            mo23244a(prb);
        }
        this.f39290U = String.format(Locale.ROOT, "%s-%d", this.f39336y.f39232a, Long.valueOf(f39270I.incrementAndGet()));
        this.f39299ad = new JoinOptions();
        this.f39300ae = str;
        phx phx = null;
        if (this.f39230a.mo17500e()) {
            phx j = this.f39334w.mo23146j();
            this.f39301af = this.f39334w.mo23135a(j) ? j : phx;
        } else {
            this.f39301af = null;
        }
        this.f39337z = blsw.CASTV2_1_0;
        if (cdad.f180372a.mo6606a().mo77162b()) {
            this.f39331t = new pjf();
        }
        this.f39277F = new pjk(this.f39337z, this.f39290U, this.f39282M, this.f39283N);
        pja pja = new pja(this);
        this.f39314as = pja;
        this.f39277F.f39361e = pja;
        this.f39307al = new pjh(this.f39331t);
        piz piz = new piz(this);
        this.f39309an = piz;
        this.f39307al.f39346b = piz;
        this.f39302ag = pmx;
        this.f39303ah = pqb;
    }

    /* renamed from: a */
    public static final ApplicationMetadata m30496a(pig pig) {
        String str;
        String str2 = pig.f39211a;
        plg plg = null;
        if (ccyn.m132219c()) {
            String str3 = pig.f39212b;
            str = pig.f39213c;
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = "WEB";
                }
                str2 = str3;
            }
        } else {
            str = null;
        }
        peg peg = new peg(new ApplicationMetadata(), str2);
        ApplicationMetadata applicationMetadata = peg.f38963a;
        applicationMetadata.f29712g = str;
        applicationMetadata.f29707b = pig.f39214d;
        applicationMetadata.f29711f = pig.f39219i;
        peg.f38963a.f29708c = pig.mo23168a();
        List list = pig.f39218h;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            plg plg2 = (plg) list.get(i);
            i++;
            if (plg2.f39584a == 1) {
                plg = plg2;
                break;
            }
        }
        if (plg != null) {
            String str4 = plg.f39585b;
            ApplicationMetadata applicationMetadata2 = peg.f38963a;
            applicationMetadata2.f29709d = str4;
            applicationMetadata2.f29710e = plg.f39586c;
        }
        return peg.f38963a;
    }

    /* renamed from: b */
    private final void m30497b(String str, String str2) {
        this.f39316e.mo23858a("joinApplicationInternal: appId:%s sessionId:%s joinOptions:%s", str, str2, this.f39299ad);
        ApplicationMetadata applicationMetadata = this.f39323l;
        if (applicationMetadata == null) {
            if (str == null) {
                str = "";
            }
            this.f39329r = str;
            this.f39330s = str2;
            this.f39317f.mo23353a();
        } else if ((TextUtils.isEmpty(str) || str.equals(applicationMetadata.f29706a)) && ((TextUtils.isEmpty(str2) || str2.equals(this.f39324m)) && (!ccyn.m132219c() || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || mo23253d(applicationMetadata.f29712g))))) {
            this.f39316e.mo23861b("already connected to requested app, so skipping join logic");
            this.f39334w.mo23114a(this.f39230a, this.f39298ac, str, this.f39300ae, this.f39301af, -1);
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23183a(this.f39323l, this.f39325n, this.f39324m, false);
            }
            this.f39302ag.mo23457a(this.f39324m, this, str);
        } else {
            this.f39316e.mo23861b("clearing mLastConnected* variables");
            this.f39273B = null;
            this.f39274C = null;
            if (this.f39272A.mo23355a()) {
                mo23252d(false);
            } else {
                mo23235a(2005, str, str2);
            }
        }
    }

    /* renamed from: e */
    public static bpes m30498e(int i) {
        switch (i) {
            case 2400:
                return bpes.ERROR_RELAY_CASTING_DISABLED;
            case 2401:
                return bpes.ERROR_RELAY_CASTING_NO_ACCOUNT_CONFIGURED;
            case 2402:
                return bpes.ERROR_RELAY_CASTING_DEVICE_NOT_FOUND_ON_LOCAL_NETWORK;
            case 2403:
                return bpes.ERROR_RELAY_CASTING_GRPC_SERVER_ERROR;
            case 2404:
                return bpes.ERROR_RELAY_CASTING_INVALID_SERVER_RESPONSE;
            case 2405:
                return bpes.ERROR_RELAY_CASTING_SOCKET_CONNECT_EXCEPTION;
            case 2406:
                return bpes.ERROR_RELAY_CASTING_RAT_MISSING;
            case 2407:
                return bpes.ERROR_RELAY_CASTING_RAT_INVALID;
            case 2408:
                return bpes.ERROR_RELAY_CASTING_SERVER_RESPONSE_HAS_NO_SESSION;
            case 2409:
                return bpes.ERROR_RELAY_CASTING_INVALID_SERVER_ADDRESS;
            case 2410:
                return bpes.ERROR_RELAY_CASTING_DEVICE_NOT_LINKED_TO_USER;
            case 2411:
                return bpes.ERROR_RELAY_CASTING_DEVICE_NOT_SUPPORTED;
            case 2412:
                return bpes.ERROR_RELAY_CASTING_DEVICE_CERTIFICATE_ABSENT;
            case 2413:
                return bpes.ERROR_RELAY_CASTING_FAILED_TO_COMMUNICATE_DEVICE;
            case 2414:
                return bpes.ERROR_RELAY_CASTING_RAT_REJECTED_BY_SERVER;
            default:
                return bpes.ERROR_UNKNOWN;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(int, boolean, bpes):void
     arg types: [int, int, bpes]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(pig, boolean, long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(int, boolean, bpes):void */
    /* renamed from: f */
    private final void m30499f(int i) {
        if (mo23213c()) {
            mo23236a(m30500g(i), true, phy.m30355a(i));
            return;
        }
        this.f39316e.mo23857a("finishDisconnecting; socketError=%s, mDisconnectStatusCode=%s", pkk.m30687c(i), pew.m30274a(this.f39294Y));
        this.f39293X = 0;
        pkw pkw = this.f39320i;
        if (pkw != null) {
            mo23247b(pkw);
            this.f39320i = null;
        }
        pkz pkz = this.f39289T;
        if (pkz != null) {
            mo23247b(pkz);
            this.f39289T = null;
        }
        pku pku = this.f39319h;
        if (pku != null) {
            mo23247b(pku);
            this.f39319h = null;
        }
        pld pld = this.f39317f;
        pld.f39558c = null;
        pld.f39559d.mo23688a(2002);
        pld.f39561f.mo23688a(2002);
        pld.f39563h.mo23688a(2002);
        pld.f39564i.mo23688a(2002);
        pld.f39565j.mo23688a(2002);
        pld.f39566k = 0.0d;
        pld.f39567l = false;
        pld.f39568m = Double.NaN;
        pld.f39570o = -1;
        pld.f39571p = -1;
        pld.f39569n = false;
        prb prb = this.f39318g;
        if (prb != null) {
            mo23247b(prb);
            this.f39318g.f40098f = null;
            this.f39311ap = null;
            this.f39318g = null;
        }
        this.f39302ag.mo23456a(this.f39324m, this);
        this.f39323l = null;
        this.f39324m = null;
        this.f39325n = null;
        ScheduledFuture scheduledFuture = this.f39292W;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f39277F.mo23274c();
        this.f39307al.mo23264a();
        this.f39308am = null;
        int i2 = this.f39294Y;
        if (i2 == 0) {
            i2 = m30500g(i);
        } else {
            this.f39294Y = 0;
        }
        this.f39272A.mo23355a();
        this.f39316e.mo23856a("listener.onDisconnected(%s)", pew.m30274a(i2));
        pim pim = this.f39336y;
        if (pim != null) {
            pim.f39236e.mo23195c(i2);
        }
        if (this.f39331t != null) {
            bpsy i3 = this.f39334w.mo23145i();
            pjf pjf = this.f39331t;
            bxvd da = bptm.f139143e.mo74144da();
            for (Map.Entry entry : pjf.f39339a.entrySet()) {
                bxvd da2 = bptq.f139159e.mo74144da();
                bpfk bpfk = (bpfk) ((pje) entry.getKey()).mo23169a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bptq bptq = (bptq) da2.f164949b;
                bptq.f139162b = bpfk.f137412g;
                bptq.f139161a |= 1;
                int i4 = ((pje) entry.getKey()).mo23170b().f127636f;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bptq bptq2 = (bptq) da2.f164949b;
                bptq2.f139161a |= 2;
                bptq2.f139163c = i4;
                bpsv b = ((pid) entry.getValue()).mo23164b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bptq bptq3 = (bptq) da2.f164949b;
                b.getClass();
                bptq3.f139164d = b;
                bptq3.f139161a |= 4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptm bptm = (bptm) da.f164949b;
                bptq bptq4 = (bptq) da2.mo74062i();
                bptq4.getClass();
                if (!bptm.f139146b.mo73666a()) {
                    bptm.f139146b = GeneratedMessageLite.m124021a(bptm.f139146b);
                }
                bptm.f139146b.add(bptq4);
            }
            for (Map.Entry entry2 : pjf.f39340b.entrySet()) {
                bxvd da3 = bptb.f139079e.mo74144da();
                bpeq bpeq = (bpeq) ((pje) entry2.getKey()).mo23169a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bptb bptb = (bptb) da3.f164949b;
                bptb.f139082b = bpeq.f137313f;
                bptb.f139081a |= 1;
                int i5 = ((pje) entry2.getKey()).mo23170b().f127636f;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bptb bptb2 = (bptb) da3.f164949b;
                bptb2.f139081a |= 2;
                bptb2.f139083c = i5;
                bpsv b2 = ((pid) entry2.getValue()).mo23164b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bptb bptb3 = (bptb) da3.f164949b;
                b2.getClass();
                bptb3.f139084d = b2;
                bptb3.f139081a |= 4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptm bptm2 = (bptm) da.f164949b;
                bptb bptb4 = (bptb) da3.mo74062i();
                bptb4.getClass();
                if (!bptm2.f139147c.mo73666a()) {
                    bptm2.f139147c = GeneratedMessageLite.m124021a(bptm2.f139147c);
                }
                bptm2.f139147c.add(bptb4);
            }
            bxvd da4 = bptp.f139155c.mo74144da();
            bpsv b3 = pjf.f39341c.mo23164b();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bptp bptp = (bptp) da4.f164949b;
            b3.getClass();
            bptp.f139158b = b3;
            bptp.f139157a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptm bptm3 = (bptm) da.f164949b;
            bptp bptp2 = (bptp) da4.mo74062i();
            bptp2.getClass();
            bptm3.f139148d = bptp2;
            bptm3.f139145a = 1 | bptm3.f139145a;
            if (i3.f164950c) {
                i3.mo74035c();
                i3.f164950c = false;
            }
            bpsz bpsz = (bpsz) i3.f164949b;
            bptm bptm4 = (bptm) da.mo74062i();
            bpsz bpsz2 = bpsz.f139036I;
            bptm4.getClass();
            bpsz.f139044G = bptm4;
            bpsz.f139048b |= 512;
            pjf.f39339a.clear();
            pjf.f39340b.clear();
            pjf.f39341c.mo23162a();
            this.f39334w.mo23110a((bpsz) i3.mo74062i(), 291);
        }
    }

    /* renamed from: g */
    private static final int m30500g(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 2700;
        }
        if (i == 2) {
            return 2701;
        }
        if (i == 3) {
            return 2702;
        }
        if (i != 4) {
            return i != 5 ? 2708 : 2704;
        }
        return 2703;
    }

    /* renamed from: r */
    private final void m30501r() {
        this.f39231b.execute(new pir(this));
    }

    /* renamed from: a */
    public final void mo23237a(long j) {
        if (this.f39332u != j) {
            this.f39332u = j;
            boolean z = (j & 1) != 0;
            this.f39316e.f40220c = z;
            ptx.f40218a = z;
        }
    }

    /* renamed from: b */
    public final boolean mo23211b() {
        return this.f39293X == 2;
    }

    /* renamed from: c */
    public final void mo23249c(int i) {
        this.f39316e.mo23856a("onSocketDisconnected; socketError=%s", pkk.m30687c(i));
        m30499f(i);
    }

    /* renamed from: c */
    public final boolean mo23213c() {
        return this.f39293X == 1;
    }

    /* renamed from: d */
    public final void mo23251d(int i) {
        if (this.f39286Q.mo23308c()) {
            this.f39294Y = i;
            this.f39286Q.mo23306b();
            return;
        }
        m30499f(i);
    }

    /* renamed from: g */
    public final String mo23217g() {
        return this.f39316e.f40221d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(int, boolean, bpes):void
     arg types: [int, int, bpes]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(pig, boolean, long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(int, boolean, bpes):void */
    /* renamed from: h */
    public final void mo23254h() {
        int i;
        String str;
        pnq a;
        String str2;
        int g = this.f39286Q.mo23312g();
        qav qav = this.f39316e;
        pim pim = this.f39336y;
        String str3 = null;
        bsib bsib = null;
        qav.mo23858a("connectToDeviceInternal. Client: %s controller state: %s socket state: %s", pim != null ? pim.f39232a : null, pks.m30741a(this.f39293X), pks.m30741a(g));
        if (this.f39293X != 0 || g == 1 || g == 2) {
            this.f39316e.mo23675c("Redundant call to connect to device", new Object[0]);
            return;
        }
        boolean a2 = pze.m31706a(this.f39230a);
        if (!a2) {
            i = !this.f39230a.mo17500e() ? 3 : 2;
        } else {
            i = 4;
        }
        this.f39334w.mo23124a(this.f39230a, this.f39298ac, mo23263q(), this.f39300ae, this.f39301af, i);
        this.f39293X = 1;
        if (!this.f39272A.mo23356b()) {
            ple ple = this.f39272A;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ple.f39580c = elapsedRealtime;
            ple.f39581d = elapsedRealtime;
        }
        ple ple2 = this.f39272A;
        if (ple2.f39581d != 0) {
            ple2.f39580c = SystemClock.elapsedRealtime();
        }
        if (a2) {
            Context context = this.f39285P;
            String str4 = this.f39336y.f39232a;
            if (!pze.f40729a || !qay.m31782a(context, str4)) {
                this.f39316e.mo23677d("Device connect should be done via relay but relay casting is disabled", new Object[0]);
                mo23236a(2400, false, m30498e(2400));
                return;
            }
            this.f39310ao = true;
            pzi pzi = this.f39297ab;
            CastDevice castDevice = this.f39230a;
            pky pky = this.f39286Q;
            piu piu = this.f39313ar;
            String str5 = this.f39306ak;
            qav qav2 = new qav("RelayCastSessionManager");
            qav2.mo23669a(str5);
            String string = pze.f40729a ? qay.m31785b(pzi.f40741c.getApplicationContext()).getString("RELAY_CASTING_ACTIVE_ACCOUNT_NAME", null) : null;
            if (string != null) {
                String b = pze.m31707b(castDevice);
                String d = pzi.f40739a.mo23493d(b);
                if (d == null) {
                    qav2.mo23675c("Never found this device on local network. Connection will fail.", new Object[0]);
                    piu.mo23224a(2402);
                    return;
                }
                pnm b2 = pzi.f40739a.mo23487b(d);
                if (b2 != null) {
                    bsib = b2.f39855l;
                }
                if (bsib == null) {
                    qav2.mo23675c("Never found this device on local network. Connection will fail.", new Object[0]);
                    piu.mo23224a(2406);
                } else if (bsib.f144660e.mo73779j()) {
                    qav2.mo23675c("Invalid RAT. Connection will fail.", new Object[0]);
                    piu.mo23224a(2407);
                } else {
                    bxvd da = bshv.f144631d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bshv bshv = (bshv) da.f164949b;
                    b.getClass();
                    bshv.f144633a = b;
                    bsib.getClass();
                    bshv.f144635c = bsib;
                    byte[] a3 = pij.m30443a(pzi.f40741c).mo23174a();
                    if (a3 != null) {
                        ByteString a4 = ByteString.m123261a(a3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a4.getClass();
                        ((bshv) da.f164949b).f144634b = a4;
                    }
                    pyz pyz = new pyz(pzi.f40742d);
                    Account account = new Account(string, "com.google");
                    ClientContext clientContext = new ClientContext();
                    clientContext.f30215e = "com.google.android.gms";
                    clientContext.f30216f = "com.google.android.gms";
                    clientContext.f30212b = Process.myUid();
                    clientContext.f30214d = account;
                    clientContext.f30213c = account;
                    clientContext.mo17806d(ccyb.f180249a.mo6606a().mo77060c());
                    aucb a5 = aucu.m76780a(pzi.f40742d.f40171a, new pzf(pyz, clientContext, da));
                    a5.mo50380a(pzi.f40740b, new pzg(castDevice, pky, piu, qav2));
                    a5.mo50379a(pzi.f40740b, new pzh(piu, qav2));
                }
            } else {
                qav2.mo23675c("No account configured for relay casting, connection will fail", new Object[0]);
                piu.mo23224a(2401);
            }
        } else if (this.f39230a.mo17500e()) {
            try {
                this.f39316e.mo23861b("connecting socket now");
                pky pky2 = this.f39286Q;
                CastDevice castDevice2 = this.f39230a;
                ((pkk) pky2).mo23303a(castDevice2.f29716d, castDevice2.f29715c, castDevice2.f29719g);
            } catch (IOException e) {
                this.f39316e.mo23676c(e, "connection exception", new Object[0]);
                mo23236a(2707, true, bpes.ERROR_IO);
            }
        } else {
            pzd pzd = this.f39296aa;
            CastDevice castDevice3 = this.f39230a;
            pky pky3 = this.f39286Q;
            pit pit = this.f39312aq;
            String str6 = this.f39306ak;
            pzd.f40727l.clear();
            pzd.f40720e.mo23670a("startSession for device %s", castDevice3);
            if (qay.m31788b()) {
                synchronized (pzd.f40725j) {
                    for (pnm pnm : pzd.f40725j.mo23495e().mo23505a()) {
                        if (ptk.m31236a(castDevice3.mo17494a(), pnm.f39844a.mo17494a()) && (a = pnm.mo23497a()) != null) {
                            if (ccxg.m131999b() && (str2 = a.f39871g) != null) {
                                pzd.f40727l.add(str2);
                            }
                            str3 = a.f39870f;
                        }
                    }
                }
                str = str3;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                pzd.f40720e.mo23861b("No cached pinCode available - requesting from user");
                pzd.mo23815a(castDevice3, pky3, pit, str6);
                return;
            }
            pzd.f40720e.mo23856a("Using cached pinCode %s", str);
            new pzb(pzd, str, 2, castDevice3, pky3, pit, true, str6).start();
        }
    }

    /* renamed from: i */
    public final double mo23255i() {
        pld pld = this.f39317f;
        return (!pld.f39556a || Double.isNaN(pld.f39568m)) ? 1.0d / qaf.m31749b(this.f39230a) : this.f39317f.f39568m;
    }

    /* renamed from: j */
    public final double mo23256j() {
        return 1.0d / mo23255i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        return;
     */
    /* renamed from: k */
    public final synchronized void mo23257k() {
        if (this.f39308am == null) {
            this.f39308am = this.f39277F.mo23266a();
        }
        pji pji = this.f39308am;
        if (pji != null) {
            blsx blsx = pji.f39348a;
            String str = blsx.f127643e;
            long j = pji.f39349b;
            int i = blsx.f164961ai;
            if (i == -1) {
                i = bxxm.f165037a.mo74228a(blsx).mo74223b(blsx);
                blsx.f164961ai = i;
            }
            if (i > 65536) {
                pim pim = this.f39336y;
                if (pim != null) {
                    pim.f39236e.mo23188a(str, j, 2006);
                }
                bpfk bpfk = bpfk.SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE;
                blsw a = blsw.m107539a(blsx.f127640b);
                if (a == null) {
                    a = blsw.CASTV2_1_0;
                }
                mo23239a(bpfk, a, this.f39308am.f39350c);
                this.f39277F.mo23269a(str, j);
                this.f39308am = null;
                m30501r();
            } else if (this.f39286Q.mo23305a(i)) {
                try {
                    this.f39286Q.mo23302a(blsx);
                    if (!blsx.f127647i) {
                        pim pim2 = this.f39336y;
                        if (pim2 != null) {
                            pim2.f39236e.mo23187a(str, j);
                        }
                        bpfk bpfk2 = bpfk.SEND_MESSAGE_RESULT_SUCCESS;
                        blsw a2 = blsw.m107539a(blsx.f127640b);
                        if (a2 == null) {
                            a2 = blsw.CASTV2_1_0;
                        }
                        mo23239a(bpfk2, a2, this.f39308am.f39350c);
                    }
                } catch (IllegalStateException e) {
                    pim pim3 = this.f39336y;
                    if (pim3 != null) {
                        pim3.f39236e.mo23188a(str, j, 2707);
                    }
                    bpfk bpfk3 = bpfk.SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR;
                    blsw a3 = blsw.m107539a(blsx.f127640b);
                    if (a3 == null) {
                        a3 = blsw.CASTV2_1_0;
                    }
                    mo23239a(bpfk3, a3, this.f39308am.f39350c);
                    this.f39277F.mo23269a(str, j);
                } catch (IOException e2) {
                    this.f39316e.mo23674b(e2, "Error while sending message", new Object[0]);
                    this.f39277F.mo23274c();
                    mo23251d(2707);
                }
                this.f39308am = null;
                m30501r();
            }
        }
    }

    /* renamed from: l */
    public final void mo23258l() {
        byte[] bArr;
        this.f39316e.mo23670a("onSocketConnected", new Object[0]);
        if (this.f39310ao) {
            mo23260n();
            return;
        }
        pku pku = new pku(this, this.f39285P, this.f39230a, "receiver-0", this.f39286Q.mo23313h(), this.f39306ak);
        this.f39319h = pku;
        mo23244a(pku);
        pku pku2 = this.f39319h;
        bxvd da = blsk.f127596e.mo74144da();
        bxvd da2 = blsf.f127574d.mo74144da();
        synchronized (pku2.f39535c) {
            SharedPreferences b = qay.m31785b(pku2.f39536d);
            long j = b.getLong("PREF_CAST_SENDER_NONCE_GENERATED_TIME", 0);
            pes pes = pes.f38974a;
            if (System.currentTimeMillis() >= j + TimeUnit.DAYS.toMillis(1)) {
                pku2.f39534b = pku2.mo23349a(b);
            } else if (pku2.f39534b == null) {
                String string = b.getString("PREF_CAST_SENDER_NONCE", null);
                if (!TextUtils.isEmpty(string)) {
                    pku2.f39534b = Base64.decode(string, 0);
                    pku2.f40173s.mo23673b("Reuse old nonce: %s", Arrays.toString(pku2.f39534b));
                } else {
                    pku2.f39534b = pku2.mo23349a(b);
                }
            }
            bArr = pku2.f39534b;
        }
        ByteString a = ByteString.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blsf blsf = (blsf) da2.f164949b;
        a.getClass();
        int i = blsf.f127576a | 2;
        blsf.f127576a = i;
        blsf.f127577b = a;
        blsf.f127578c = 1;
        blsf.f127576a = i | 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blsk blsk = (blsk) da.f164949b;
        blsf blsf2 = (blsf) da2.mo74062i();
        blsf2.getClass();
        blsk.f127599b = blsf2;
        blsk.f127598a |= 1;
        byte[] k = ((blsk) da.mo74062i()).serializeToBytes();
        String str = pku2.f39537e;
        new Object[1][0] = str;
        pku2.f40175u.mo23230a(pku2.f40174t, k, str);
    }

    /* renamed from: m */
    public final void mo23259m() {
        m30501r();
    }

    /* renamed from: n */
    public final void mo23260n() {
        String str;
        this.f39316e.mo23861b("finishConnecting");
        pkr pkr = this.f39288S;
        pkr.mo23632b(pkr.mo23343a().toString(), 0, "receiver-0");
        if (!this.f39230a.mo17500e()) {
            pkz pkz = new pkz(this, this.f39306ak);
            this.f39289T = pkz;
            mo23244a(pkz);
            try {
                this.f39316e.mo23861b("requesting proximity info");
                pkz pkz2 = this.f39289T;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", "GET_PROXIMITY_INFO");
                } catch (JSONException e) {
                }
                pkz2.mo23630a(jSONObject.toString(), 0, "receiver-0");
                this.f39334w.mo23136b();
            } catch (IOException e2) {
                this.f39316e.mo23675c("Failed to get proximity info", new Object[0]);
            }
        }
        pkw pkw = new pkw(this.f39279J, this.f39306ak);
        this.f39320i = pkw;
        mo23244a(pkw);
        ScheduledExecutorService scheduledExecutorService = this.f39231b;
        pis pis = new pis(this);
        long j = this.f39280K;
        this.f39292W = scheduledExecutorService.scheduleWithFixedDelay(pis, j, j, TimeUnit.MILLISECONDS);
        this.f39293X = 2;
        String str2 = this.f39273B;
        if (str2 == null || (str = this.f39274C) == null) {
            this.f39272A.mo23355a();
            mo23252d(true);
            this.f39317f.mo23353a();
        } else {
            this.f39327p = false;
            m30497b(str2, str);
        }
        prb prb = this.f39318g;
        if (prb != null) {
            long c = prb.mo23633c();
            prb.f40095c.mo23689a(c, (pue) null);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put("type", "GET_STATUS");
            } catch (JSONException e3) {
            }
            prb.mo23632b(jSONObject2.toString(), c, prb.f40097e);
        }
    }

    /* renamed from: o */
    public final String mo23261o() {
        return this.f39317f.f39558c;
    }

    /* renamed from: p */
    public final void mo23262p() {
        this.f39336y = null;
        mo23250c(false);
    }

    /* renamed from: q */
    public final boolean mo23263q() {
        return (this.f39332u & 2) == 2;
    }

    /* renamed from: c */
    public final void mo23212c(String str) {
        String str2;
        ApplicationMetadata applicationMetadata = this.f39323l;
        if (applicationMetadata != null) {
            str2 = applicationMetadata.f29706a;
        } else {
            str2 = null;
        }
        this.f39316e.mo23857a("stopApplication %s; sessionId:%s", str2, str);
        this.f39326o = true;
        pld pld = this.f39317f;
        JSONObject jSONObject = new JSONObject();
        long c = pld.mo23633c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "STOP");
            if (str != null) {
                if (!"".equals(str)) {
                    jSONObject.put("sessionId", str);
                }
            }
        } catch (JSONException e) {
        }
        pld.mo23632b(jSONObject.toString(), c, pld.f39557b);
        pld.f39561f.mo23689a(c, pld.f39562g);
    }

    /* renamed from: d */
    public final void mo23252d(boolean z) {
        this.f39316e.mo23856a("calling Listener.onConnected(%b)", Boolean.valueOf(z));
        this.f39334w.mo23123a(this.f39230a, this.f39298ac, mo23263q(), this.f39300ae, this.f39301af);
        pim pim = this.f39336y;
        if (pim != null) {
            pim.f39236e.mo23191a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo23250c(boolean z) {
        synchronized (this.f39286Q) {
            if (z) {
                if (!this.f39305aj.mo49124e()) {
                    this.f39316e.mo23677d("Unbalanced call in releasing the wake lock.", new Object[0]);
                } else {
                    pim pim = this.f39336y;
                    if (pim != null) {
                        this.f39305aj.mo49122c(pim.f39232a);
                    }
                }
            }
            int i = this.f39284O;
            if (i <= 0) {
                this.f39316e.mo23677d("Unbalanced call to releaseReference(); controller state=%s", pks.m30741a(this.f39293X));
            } else {
                int i2 = i - 1;
                this.f39284O = i2;
                if (i2 == 0) {
                    this.f39316e.mo23856a("[%s] *** disposing ***", this.f39230a);
                    int i3 = 0;
                    while (this.f39305aj.mo49124e()) {
                        i3++;
                        this.f39305aj.mo49122c(this.f39306ak);
                    }
                    if (i3 > 0) {
                        this.f39316e.mo23675c("Unbalanced call in releasing the wake lock. Released %d locks.", Integer.valueOf(i3));
                    }
                    ScheduledFuture scheduledFuture = this.f39292W;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledFuture scheduledFuture2 = this.f39304ai;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    mo23207a(false);
                    this.f39293X = 4;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23198a() {
        if (mo23214d()) {
            this.f39316e.mo23861b("already reconnecting; ignoring");
        } else if (this.f39336y == null && ccxj.f180164a.mo6606a().mo76982a()) {
            this.f39316e.mo23675c("No device controller client. Don't connect.", new Object[0]);
        } else {
            this.f39316e.mo23861b("calling CastOperationService.connectToDevice");
            mo23254h();
        }
    }

    /* renamed from: d */
    public final boolean mo23214d() {
        return this.f39272A.mo23356b();
    }

    /* renamed from: d */
    public final boolean mo23253d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "WEB";
        }
        String[] strArr = this.f39291V;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return true;
                }
            }
            this.f39316e.mo23856a("Active app has the same app ID but sender doesn't support the type: %s. ", str);
            return false;
        }
        this.f39316e.mo23675c("C2N is enabled but supported types is not available.", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final void mo23234a(int i) {
        if (mo23261o() != null) {
            this.f39288S.mo23344a(mo23261o());
            this.f39317f.mo23354a((String) null);
        }
        String str = this.f39273B;
        String str2 = this.f39324m;
        if (this.f39323l != null) {
            this.f39302ag.mo23456a(str2, this);
            this.f39323l = null;
            this.f39324m = null;
        }
        if (i != 0) {
            this.f39334w.mo23112a(this.f39230a, this.f39298ac, i, this.f39300ae, this.f39301af, str);
        }
        this.f39316e.mo23856a("listener.onApplicationDisconnected(%s)", pew.m30274a(i));
        pim pim = this.f39336y;
        if (pim != null) {
            pim.f39236e.mo23182a(i, str2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(int, boolean, bpes):void
     arg types: [int, int, bpes]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(pig, boolean, long):void
      pjc.a(double, double, boolean):boolean
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(double, double, boolean):boolean
      pil.a(boolean, double, boolean):boolean
      pjc.a(int, boolean, bpes):void */
    /* renamed from: b */
    public final void mo23245b(int i) {
        this.f39316e.mo23677d("onSocketConnectionFailed; socketError=%s, controller state:%s", pkk.m30687c(i), pks.m30741a(this.f39293X));
        mo23236a(m30500g(i), true, phy.m30355a(i));
    }

    /* renamed from: e */
    public final void mo23215e() {
        String str;
        ApplicationMetadata applicationMetadata = this.f39323l;
        if (applicationMetadata != null) {
            str = applicationMetadata.f29706a;
        } else {
            str = null;
        }
        this.f39316e.mo23856a("leaveApplication %s", str);
        if (this.f39323l == null) {
            this.f39316e.mo23677d("listener.onApplicationLeaveFailed(%s)", pew.m30274a(2001));
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23194bm();
                return;
            }
            return;
        }
        mo23234a(0);
    }

    /* renamed from: a */
    public final void mo23235a(int i, String str, String str2) {
        this.f39334w.mo23113a(this.f39230a, this.f39298ac, i, this.f39300ae, this.f39301af, str, str2);
        this.f39316e.mo23858a("calling Listener.onApplicationConnectionFailed(%s) appId:%s receiverSessionId:%s", pew.m30274a(i), str, str2);
        pim pim = this.f39336y;
        if (pim != null) {
            pim.f39236e.mo23196d(i);
        }
    }

    /* renamed from: b */
    public final void mo23210b(String str) {
        synchronized (this.f39321j) {
            this.f39321j.remove(str);
        }
    }

    /* renamed from: b */
    public final void mo23246b(String str, LaunchOptions launchOptions) {
        CredentialsData credentialsData = null;
        if (TextUtils.isEmpty(str) || str.equals("")) {
            mo23235a(2004, str, (String) null);
            return;
        }
        if (ccyn.m132219c()) {
            this.f39291V = launchOptions.f29739c ? new String[]{"WEB", "ANDROID_TV"} : new String[]{"WEB"};
            credentialsData = launchOptions.f29740d;
            this.f39278G = ccyn.m132218b();
        }
        if (launchOptions.f29737a) {
            pld pld = this.f39317f;
            String str2 = launchOptions.f29738b;
            String[] strArr = this.f39291V;
            JSONObject jSONObject = new JSONObject();
            long c = pld.mo23633c();
            try {
                jSONObject.put("requestId", c);
                jSONObject.put("type", "LAUNCH");
                jSONObject.put("appId", str);
                if (str2 != null) {
                    jSONObject.put("language", str2);
                }
                if (strArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str3 : strArr) {
                        jSONArray.put(str3);
                    }
                    jSONObject.put("supportedAppTypes", jSONArray);
                }
                if (credentialsData != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String str4 = credentialsData.f29729a;
                        if (str4 != null) {
                            jSONObject2.put("credentials", str4);
                        }
                        String str5 = credentialsData.f29730b;
                        if (str5 != null) {
                            jSONObject2.put("credentialsType", str5);
                        }
                    } catch (JSONException e) {
                    }
                    jSONObject.put("credentialsData", jSONObject2);
                }
            } catch (JSONException e2) {
            }
            pld.mo23632b(jSONObject.toString(), c, pld.f39557b);
            pla pla = pld.f39560e;
            pla.f39552a = str;
            pld.f39559d.mo23689a(c, pla);
            this.f39334w.mo23117a(this.f39230a, this.f39298ac, str, launchOptions.f29737a, this.f39300ae, this.f39301af, c);
            return;
        }
        this.f39327p = true;
        this.f39328q = launchOptions;
        launchOptions.f29737a = true;
        m30497b(str, "");
    }

    /* renamed from: a */
    public final void mo23236a(int i, boolean z, bpes bpes) {
        bpes bpes2;
        this.f39293X = 0;
        qav qav = this.f39316e;
        String a = pew.m30274a(i);
        String a2 = pew.m30274a(this.f39294Y);
        bpes bpes3 = this.f39295Z;
        Boolean valueOf = Boolean.valueOf(z);
        if (qav.f40840e) {
            qav.f40842g.mo26019b(qav.f40841f).mo68427a("handleConnectionFailure; castStatusCode=%s, analytics: %s, originalDisconnectStatusCode=%s originalAnalyticsErrorCode: %s, tryAgain:%b", a, bpes, a2, bpes3, valueOf);
        } else {
            qav.mo23862g("handleConnectionFailure; castStatusCode=%s, analytics: %s, originalDisconnectStatusCode=%s originalAnalyticsErrorCode: %s, tryAgain:%b", a, bpes, a2, bpes3);
        }
        if (z) {
            ple ple = this.f39272A;
            long j = -1;
            if (ple.f39581d != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = ple.f39580c;
                if (j2 != 0) {
                    long j3 = ple.f39581d;
                    long j4 = ple.f39579b;
                    if (elapsedRealtime - j3 < 15000) {
                        long j5 = ple.f39578a;
                        j = 3000 - (elapsedRealtime - j2);
                        if (j <= 0) {
                            j = 0;
                        }
                    } else {
                        ple.f39581d = 0;
                    }
                } else {
                    j = 0;
                }
            }
            if (j >= 0) {
                this.f39304ai = this.f39231b.schedule(new pio(this), j, TimeUnit.MILLISECONDS);
                return;
            }
        } else {
            this.f39272A.mo23355a();
        }
        int i2 = this.f39294Y;
        if (i2 != 0) {
            bpes bpes4 = this.f39295Z;
            this.f39294Y = 0;
            this.f39295Z = bpes.ERROR_UNKNOWN;
            bpes2 = bpes4;
        } else {
            i2 = i;
            bpes2 = bpes;
        }
        this.f39334w.mo23122a(this.f39230a, this.f39298ac, mo23263q(), bpes2, this.f39300ae, this.f39301af);
        this.f39316e.mo23856a("listener.onConnectionFailed(%s)", pew.m30274a(i2));
        pim pim = this.f39336y;
        if (pim != null) {
            pim.f39236e.mo23181a(i2);
        }
    }

    /* renamed from: a */
    public final void mo23238a(blsx blsx) {
        try {
            mo23248b(true);
            pkw pkw = this.f39320i;
            if (pkw != null) {
                pkw.mo23350a();
            }
            this.f39307al.mo23265a(blsx);
        } finally {
            mo23250c(true);
        }
    }

    /* renamed from: b */
    public final void mo23247b(ptb ptb) {
        ptb.mo23631a((pud) null);
        this.f39322k.remove(ptb.f40174t);
    }

    /* renamed from: b */
    public final void mo23248b(boolean z) {
        pim pim;
        synchronized (this.f39286Q) {
            this.f39284O++;
            if (this.f39281L) {
                if (z && (pim = this.f39336y) != null) {
                    this.f39305aj.mo49113a(pim.f39232a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23239a(bpfk bpfk, blsw blsw, int i) {
        pjf pjf = this.f39331t;
        if (pjf != null) {
            pje a = pje.m30552a(bpfk, blsw);
            if (!pjf.f39339a.containsKey(a)) {
                pjf.f39339a.put(a, new pid());
            }
            ((pid) pjf.f39339a.get(a)).mo23163a((double) i);
        }
    }

    /* renamed from: a */
    public final void mo23199a(EqualizerSettings equalizerSettings) {
        this.f39316e.mo23856a("setEqualizerSettings; equalizerSettings: %s", equalizerSettings.mo17512a());
        pld pld = this.f39317f;
        long c = pld.mo23633c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SET_USER_EQ");
            jSONObject.put("userEq", equalizerSettings.mo17512a());
        } catch (JSONException e) {
        }
        pld.f39572q = equalizerSettings;
        pld.mo23632b(jSONObject.toString(), c, pld.f39557b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23240a(Object obj, String str) {
        boolean contains;
        if (TextUtils.isEmpty(str)) {
            this.f39316e.mo23675c("Received a message with an empty or missing namespace", new Object[0]);
            return;
        }
        ptb ptb = (ptb) this.f39322k.get(str);
        if (ptb != null) {
            if (obj instanceof String) {
                ptb.mo23345b((String) obj);
            } else {
                ptb.mo23348a((byte[]) obj);
            }
        }
        synchronized (this.f39321j) {
            contains = this.f39321j.contains(str);
        }
        if (contains) {
            if (obj instanceof String) {
                pim pim = this.f39336y;
                if (pim != null) {
                    pim.f39236e.mo23189a(str, (String) obj);
                }
            } else {
                pim pim2 = this.f39336y;
                if (pim2 != null) {
                    pim2.f39236e.mo23190a(str, (byte[]) obj);
                }
            }
        }
        int a = pjk.m30560a(obj);
        pjf pjf = this.f39331t;
        if (pjf != null) {
            pjf.f39341c.mo23163a((double) a);
        }
        if (ptb == null && !contains) {
            this.f39316e.mo23675c("Ignoring message. Namespace '%s' has not been registered.", str);
        }
    }

    /* renamed from: a */
    public final void mo23200a(String str) {
        synchronized (this.f39321j) {
            this.f39321j.add(str);
        }
    }

    /* renamed from: a */
    public final void mo23201a(String str, LaunchOptions launchOptions) {
        this.f39316e.mo23857a("launchApplication. id=%s, options=%s", str, launchOptions);
        this.f39334w.mo23115a(this.f39230a, this.f39298ac, str, launchOptions.f29737a, this.f39300ae, this.f39301af);
        mo23246b(str, launchOptions);
        pqb pqb = this.f39303ah;
        if (pqb != null) {
            SharedPreferences b = qay.m31785b(pqb.f40051a);
            b.edit().putLong("PREF_LAST_SENDER_ACTIVE_TIMESTAMP", System.currentTimeMillis()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23241a(String str, Object obj, long j, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f39316e.mo23677d("sendMessageSyncInternal - Text message has no destination ID. Message discarded.", new Object[0]);
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23188a(str, j, 2001);
            }
            mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST, blsw.CASTV2_1_0, pjk.m30560a(obj));
            return;
        }
        pji a = this.f39277F.mo23267a(str, obj, j, str2);
        if (a == null) {
            this.f39316e.mo23677d("sendMessageSyncInternal - Chunked message is null. Message discarded.", new Object[0]);
            pim pim2 = this.f39336y;
            if (pim2 != null) {
                pim2.f39236e.mo23188a(str, j, 2001);
            }
            mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST, blsw.CASTV2_1_0, pjk.m30560a(obj));
        }
        try {
            this.f39286Q.mo23302a(a.f39348a);
            pim pim3 = this.f39336y;
            if (pim3 != null) {
                pim3.f39236e.mo23187a(str, j);
            }
            bpfk bpfk = bpfk.SEND_MESSAGE_RESULT_SUCCESS;
            blsw a2 = blsw.m107539a(a.f39348a.f127640b);
            if (a2 == null) {
                a2 = blsw.CASTV2_1_0;
            }
            mo23239a(bpfk, a2, a.f39350c);
        } catch (pii e) {
            pim pim4 = this.f39336y;
            if (pim4 != null) {
                pim4.f39236e.mo23188a(str, j, 2707);
            }
            bpfk bpfk2 = bpfk.SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL;
            blsw a3 = blsw.m107539a(a.f39348a.f127640b);
            if (a3 == null) {
                a3 = blsw.CASTV2_1_0;
            }
            mo23239a(bpfk2, a3, a.f39350c);
        } catch (IllegalStateException e2) {
            pim pim5 = this.f39336y;
            if (pim5 != null) {
                pim5.f39236e.mo23188a(str, j, 2707);
            }
            bpfk bpfk3 = bpfk.SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR;
            blsw a4 = blsw.m107539a(a.f39348a.f127640b);
            if (a4 == null) {
                a4 = blsw.CASTV2_1_0;
            }
            mo23239a(bpfk3, a4, a.f39350c);
        } catch (IOException e3) {
            this.f39316e.mo23674b(e3, "Error while sending message", new Object[0]);
            mo23251d(2707);
        }
    }

    /* renamed from: f */
    public final void mo23216f() {
        this.f39317f.mo23353a();
    }

    /* renamed from: a */
    public final void mo23202a(String str, String str2) {
        this.f39316e.mo23857a("reconnectToDevice: lastApplicationId=%s, lastSessionId=%s", str, str2);
        this.f39273B = str;
        this.f39274C = str2;
        mo23198a();
    }

    /* renamed from: a */
    public final void mo23203a(String str, String str2, long j) {
        mo23204a(str, str2, j, mo23261o());
    }

    /* renamed from: a */
    public final void mo23204a(String str, String str2, long j, String str3) {
        if (TextUtils.isEmpty(str3)) {
            this.f39316e.mo23677d("sendTextMessage - Text message has no destination ID. Message discarded.", new Object[0]);
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23188a(str, j, 2001);
            }
            mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST, blsw.CASTV2_1_0, str2.length());
        } else if (!TextUtils.isEmpty(str3)) {
            this.f39231b.execute(new pip(this, str2, str, str3, j));
        } else {
            throw new IllegalStateException("Destination ID is null.");
        }
    }

    /* renamed from: a */
    public final void mo23205a(String str, String str2, JoinOptions joinOptions) {
        this.f39334w.mo23116a(this.f39230a, this.f39298ac, str, !TextUtils.isEmpty(str2), this.f39300ae, this.f39301af, joinOptions.f29736a);
        this.f39299ad = joinOptions;
        if (ccyn.m132219c()) {
            this.f39291V = (TextUtils.isEmpty(str) && joinOptions.f29736a == 2) ? new String[]{"WEB", "ANDROID_TV"} : new String[]{"WEB"};
            if (TextUtils.isEmpty(str) && joinOptions.f29736a == 2) {
                this.f39278G = false;
            } else {
                this.f39278G = ccyn.m132218b();
            }
        }
        m30497b(str, str2);
    }

    /* renamed from: a */
    public final void mo23206a(String str, byte[] bArr, long j) {
        mo23242a(str, bArr, j, mo23261o());
    }

    /* renamed from: a */
    public final void mo23242a(String str, byte[] bArr, long j, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f39316e.mo23677d("sendBinaryMessage - Binary message has no destination ID. Message discarded.", new Object[0]);
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23188a(str, j, 2001);
            }
            mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST, blsw.CASTV2_1_0, bArr.length);
        } else if (!TextUtils.isEmpty(str2)) {
            this.f39231b.execute(new piq(this, bArr, str, str2, j));
        } else {
            throw new IllegalStateException("Destination ID is null.");
        }
    }

    /* renamed from: a */
    public final void mo23243a(pig pig, boolean z, long j) {
        pig pig2 = pig;
        this.f39316e.mo23670a("connectToApplicationAndNotify", new Object[0]);
        String str = pig2.f39215e;
        pkr pkr = this.f39288S;
        int i = this.f39299ad.f29736a;
        JSONObject a = pkr.mo23343a();
        try {
            a.put("connType", i);
        } catch (JSONException e) {
            pkr.f40173s.mo23675c("Error while creating a virtual connection: %s", e.getMessage());
        }
        pkr.mo23632b(a.toString(), 0, str);
        this.f39316e.mo23670a("setting current transport ID to %s", str);
        this.f39317f.mo23354a(str);
        this.f39325n = pig2.f39217g;
        this.f39323l = m30496a(pig);
        this.f39324m = pig2.f39216f;
        String str2 = pig2.f39211a;
        this.f39273B = str2;
        String str3 = this.f39324m;
        this.f39274C = str3;
        this.f39302ag.mo23457a(str3, this, str2);
        if (!this.f39272A.mo23355a()) {
            this.f39334w.mo23114a(this.f39230a, this.f39298ac, pig2.f39211a, this.f39300ae, this.f39301af, j);
            pim pim = this.f39336y;
            if (pim != null) {
                pim.f39236e.mo23183a(this.f39323l, this.f39325n, this.f39324m, z);
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.f39304ai;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        mo23252d(true);
    }

    /* renamed from: a */
    public final void mo23244a(ptb ptb) {
        ptb.mo23631a(this.f39287R);
        this.f39322k.put(ptb.f40174t, ptb);
    }

    /* renamed from: a */
    public final void mo23207a(boolean z) {
        String o;
        this.f39316e.mo23859a("disconnectFromDevice. Device: %s. controller state: %s socket state: %s, explicit: %b", this.f39230a, pks.m30741a(this.f39293X), pks.m30741a(this.f39286Q.mo23312g()), Boolean.valueOf(z));
        this.f39293X = 3;
        this.f39272A.mo23355a();
        if (this.f39286Q.mo23309d()) {
            this.f39286Q.mo23306b();
        } else if (!this.f39286Q.mo23308c()) {
            this.f39316e.mo23861b("Socket is NOT connected. No-op.");
        } else {
            if (z && (o = mo23261o()) != null) {
                this.f39316e.mo23856a("explicitly disconnecting from app %s", o);
                this.f39288S.mo23344a(o);
            }
            this.f39286Q.mo23306b();
        }
        this.f39277F.mo23274c();
        this.f39307al.mo23264a();
    }

    /* renamed from: a */
    public final boolean mo23208a(double d, double d2, boolean z) {
        this.f39316e.mo23858a("setVolume; volume:%f, currentVolume:%f, currentMuteSTate:%b", Double.valueOf(d), Double.valueOf(d2), Boolean.valueOf(z));
        if (this.f39230a.mo17496a(6144)) {
            return false;
        }
        pld pld = this.f39317f;
        double i = mo23255i();
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        long c = pld.mo23633c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SET_VOLUME");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", d);
            jSONObject.put("volume", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d2);
            jSONObject3.put("muted", z);
            if (pld.f39556a) {
                jSONObject3.put("stepInterval", i);
            }
            jSONObject.put("expectedVolume", jSONObject3);
        } catch (JSONException e) {
        }
        pld.f39566k = d;
        pld.mo23632b(jSONObject.toString(), c, pld.f39557b);
        pld.f39564i.mo23689a(c, (pue) null);
        return true;
    }

    /* renamed from: a */
    public final boolean mo23209a(boolean z, double d, boolean z2) {
        this.f39316e.mo23858a("setMute; muteState:%b, currentVolume:%f, currentMuteSTate:%b", Boolean.valueOf(z), Double.valueOf(d), Boolean.valueOf(z2));
        if (this.f39230a.mo17496a(6144)) {
            return false;
        }
        pld pld = this.f39317f;
        long c = pld.mo23633c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SET_VOLUME");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("muted", z);
            jSONObject.put("volume", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject3.put("muted", z2);
            jSONObject.put("expectedVolume", jSONObject3);
        } catch (JSONException e) {
        }
        pld.f39567l = z;
        pld.mo23632b(jSONObject.toString(), c, pld.f39557b);
        pld.f39565j.mo23689a(c, (pue) null);
        return true;
    }
}
