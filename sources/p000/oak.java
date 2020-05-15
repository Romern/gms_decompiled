package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.car.CarInfo;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oak implements oad {

    /* renamed from: a */
    public static final bnsn f37052a = odk.m28481a("CAR.VIDEO");

    /* renamed from: s */
    private static final String[][] f37053s = {new String[]{"3M25RU", "2015"}, new String[]{"3M25EU", "2015"}, new String[]{"3M25MA", "2015"}, new String[]{"3M45RU", "2015"}, new String[]{"3M45EU", "2015"}, new String[]{"3M45MA", "2015"}, new String[]{"4P45RU", "2015"}, new String[]{"4P45EU", "2015"}, new String[]{"4P45MA", "2015"}, new String[]{"4P27RU", "2016"}, new String[]{"4P27EU", "2016"}, new String[]{"4P27MA", "2016"}, new String[]{"4P47RU", "2016"}, new String[]{"4P47EU", "2016"}, new String[]{"4P47MA", "2016"}, new String[]{"4B00RU", "2016"}, new String[]{"4B00EU", "2016"}, new String[]{"4B00MA", "2016"}, new String[]{"4B00JP", "2016"}, new String[]{"4B00CA", "2016"}, new String[]{"4B00ME", "2016"}, new String[]{"4B00US", "2016"}, new String[]{"PHEV4B00RU", "2016"}, new String[]{"PHEV4B00EU", "2016"}, new String[]{"PHEV4B00MA", "2016"}, new String[]{"PHEV4B00JP", "2016"}};

    /* renamed from: A */
    private final Thread f37054A = new Thread(new oag(this), "VideoFocusHandling");

    /* renamed from: b */
    public final oaj f37055b;

    /* renamed from: c */
    public volatile oab f37056c;

    /* renamed from: d */
    public final oaa f37057d;

    /* renamed from: e */
    public final okg f37058e;

    /* renamed from: f */
    public okf f37059f;

    /* renamed from: g */
    public odw f37060g;

    /* renamed from: h */
    public byte[] f37061h;

    /* renamed from: i */
    public volatile oal f37062i;

    /* renamed from: j */
    public final birv f37063j;

    /* renamed from: k */
    public final npd f37064k;

    /* renamed from: l */
    public final olt f37065l;

    /* renamed from: m */
    public final Context f37066m;

    /* renamed from: n */
    public int f37067n = 2;

    /* renamed from: o */
    public boolean f37068o;

    /* renamed from: p */
    public Surface f37069p;

    /* renamed from: q */
    public final Semaphore f37070q = new Semaphore(0);

    /* renamed from: r */
    public final LinkedBlockingQueue f37071r = new LinkedBlockingQueue();

    /* renamed from: t */
    private final Point f37072t = new Point();

    /* renamed from: u */
    private final oac f37073u;

    /* renamed from: v */
    private final bngx f37074v;

    /* renamed from: w */
    private final niw f37075w;

    /* renamed from: x */
    private final olo f37076x;

    /* renamed from: y */
    private final olr f37077y;

    /* renamed from: z */
    private final AtomicBoolean f37078z = new AtomicBoolean(false);

    public oak(oaa oaa, niw niw, olo olo, olr olr, npd npd, olt olt, Context context, okg okg, List list, birv birv, Handler handler) {
        this.f37057d = oaa;
        this.f37075w = niw;
        this.f37076x = olo;
        this.f37077y = olr;
        this.f37064k = npd;
        this.f37065l = olt;
        this.f37066m = context;
        this.f37058e = okg;
        this.f37074v = bngx.m109368a((Collection) list);
        this.f37063j = birv;
        this.f37055b = new oaj(this, handler.getLooper());
        this.f37054A.start();
        this.f37073u = new oac(context);
    }

    /* renamed from: a */
    static int m28269a(biwg biwg) {
        int a = biwo.m102908a(biwg.f122095c);
        return (a == 0 || a == 1) ? 60 : 30;
    }

    /* renamed from: b */
    public static void m28273b(biwg biwg, Point point) {
        m28272a(biwg, point);
        Integer num = null;
        point.x -= okb.m28990a((biwg.f122093a & 4) != 0 ? Integer.valueOf(biwg.f122096d) : null);
        int i = point.y;
        if ((biwg.f122093a & 8) != 0) {
            num = Integer.valueOf(biwg.f122097e);
        }
        point.y = i - okb.m28990a(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        if (r0.mo22033a(new p000.oai(r5)) == false) goto L_0x0064;
     */
    /* renamed from: i */
    private final void m28274i() {
        oas oas;
        if (this.f37064k.f36296c.getBoolean("car_save_video", false)) {
            oas = oas.m28302a(this.f37066m.getApplicationContext());
        } else {
            oas = null;
        }
        odw a = odu.m28520a(this.f37063j, oas);
        this.f37060g = a;
        try {
            bmxy.m108581a(a);
            a.mo22028a(this.f37065l.mo21350t(), this.f37056c.f37024b, this.f37056c.f37025c, this.f37056c.f37026d);
            odw odw = this.f37060g;
            bmxy.m108581a(odw);
        } catch (RuntimeException e) {
            bnsi c = f37052a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("oak", "i", 677, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to start encoding");
        }
        if (this.f37065l.mo21351u() != 0) {
            this.f37057d.mo21228a("cannot start video encoding", bpdo.VIDEO_ENCODING_INIT_FAIL);
            return;
        }
        oaj oaj = this.f37055b;
        odw odw2 = this.f37060g;
        bmxy.m108581a(odw2);
        oaj.sendMessage(oaj.obtainMessage(1, ((odp) odw2).f37290c));
    }

    /* renamed from: a */
    public final okf mo21891a() {
        return this.f37059f;
    }

    /* renamed from: a */
    public final void mo21893a(oal oal) {
        this.f37062i = oal;
    }

    /* renamed from: b */
    public final bngx mo21894b() {
        return this.f37074v;
    }

    /* renamed from: c */
    public final void mo20658c() {
        this.f37078z.set(false);
        this.f37071r.add(4);
        try {
            this.f37054A.join(3500);
        } catch (InterruptedException e) {
        }
        if (this.f37054A.isAlive()) {
            bnsi c = f37052a.mo68388c();
            c.mo68432a("oak", "c", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("FocusHandlingThread still alive!");
            if (cctv.m131557b()) {
                this.f37077y.mo21287a(olq.VIDEO_FOCUS_HANDLING_THREAD);
            } else {
                this.f37077y.mo21298ac();
            }
        }
    }

    /* renamed from: d */
    public final oab mo21895d() {
        return this.f37056c;
    }

    /* renamed from: e */
    public final void mo21896e() {
        okf okf = this.f37059f;
        if (okf != null) {
            okf.mo22245f();
        }
    }

    /* renamed from: f */
    public final void mo21897f() {
        oaj oaj = this.f37055b;
        oaj.sendMessage(oaj.obtainMessage(3));
    }

    /* renamed from: g */
    public final void mo21898g() {
        this.f37058e.mo20688a();
    }

    /* renamed from: h */
    public final void mo21905h() {
        this.f37078z.set(true);
        this.f37071r.add(1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
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
    /* renamed from: a */
    private final biwf m28270a(int i, boolean z) {
        biwf biwf;
        int u = this.f37065l.mo21351u();
        if (u == 4 || u == 0 || u == 3) {
            biwf b = this.f37073u.mo21890b(i, z);
            bnsi d = oac.f37034a.mo68390d();
            d.mo68432a("oac", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68422a("getMaxAllowedResolutionForEmulator: %s at fps %d", (Object) oac.m28249a(b), i);
            return b;
        }
        CarInfo p = this.f37076x.mo21346p();
        if (u == 2) {
            int am = this.f37076x.mo21308am();
            if ((am > 2500 && am < 4900) || am < 2400 || am > 5900) {
                bnsi c = f37052a.mo68388c();
                c.mo68432a("oak", "a", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Unexpected wifi frequency (MHz) %d", am);
                this.f37075w.mo20850a(am);
            }
            oac oac = this.f37073u;
            npd npd = this.f37064k;
            biwf b2 = oac.mo21890b(i, z);
            biwf a = oac.mo21889a(p, npd, z);
            if (cctz.f179921a.mo6606a().mo76778b() && (am >= 4900 || am <= 0 || am > 2500 || cctz.f179921a.mo6606a().mo76777a())) {
                biwf = !z ? biwf.VIDEO_1920x1080 : biwf.VIDEO_1080x1920;
            } else if (!cctz.f179921a.mo6606a().mo76779c()) {
                biwf = biwf.VIDEO_800x480;
            } else {
                biwf = !z ? biwf.VIDEO_1280x720 : biwf.VIDEO_720x1280;
            }
            oac.m28249a(b2);
            oac.m28249a(a);
            oac.m28249a(biwf);
            biwf a2 = oac.m28248a(oac.m28248a(a, b2, z), biwf, z);
            bnsi d2 = oac.f37034a.mo68390d();
            d2.mo68432a("oac", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68422a("getMaxAllowedResolutionForWifi: %s at fps %d", (Object) oac.m28249a(a2), i);
            return a2;
        }
        oac oac2 = this.f37073u;
        npd npd2 = this.f37064k;
        biwf b3 = oac2.mo21890b(i, z);
        biwf a3 = oac2.mo21889a(p, npd2, z);
        oac.m28249a(b3);
        oac.m28249a(a3);
        biwf a4 = oac.m28248a(a3, b3, z);
        bnsi d3 = oac.f37034a.mo68390d();
        d3.mo68432a("oac", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68422a("getMaxAllowedResolutionForUsb: %s at fps %d", (Object) oac.m28249a(a4), i);
        return a4;
    }

    /* renamed from: a */
    private static boolean m28271a(biwf biwf, Point point) {
        biwf biwf2 = biwf.VIDEO_800x480;
        int ordinal = biwf.ordinal();
        if (ordinal == 0) {
            point.set(800, 480);
            return true;
        } else if (ordinal == 1) {
            point.set(1280, 720);
            return true;
        } else if (ordinal == 2) {
            point.set(1920, 1080);
            return true;
        } else if (ordinal == 5) {
            point.set(720, 1280);
            return true;
        } else if (ordinal != 6) {
            return false;
        } else {
            point.set(1080, 1920);
            return true;
        }
    }

    /* renamed from: a */
    static boolean m28272a(biwg biwg, Point point) {
        biwf a = biwf.m102896a(biwg.f122094b);
        if (a == null) {
            a = biwf.VIDEO_800x480;
        }
        return m28271a(a, point);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
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
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0242, code lost:
        if (r4.equals("MITSUBISHI MOTORS") == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0244, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0246, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0249, code lost:
        if (r4 == 0) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x024c, code lost:
        if (r4 == 1) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024f, code lost:
        if (r4 == 2) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0253, code lost:
        r4 = p000.oak.f37053s;
        r6 = r4.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0257, code lost:
        if (r9 >= r6) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0259, code lost:
        r10 = r4[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0262, code lost:
        if (r10[0].equals(r5) == false) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026d, code lost:
        if (r10[1].equals(r3.f29334c) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0270, code lost:
        r8 = 1.15f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0276, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0282, code lost:
        if ("2015".equals(r3.f29334c) == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x028a, code lost:
        if ("DDX9902S".equals(r5) != false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0292, code lost:
        if ("DDX9702S".equals(r5) == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0294, code lost:
        r8 = 1.15f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a3, code lost:
        if ("2015".equals(r3.f29334c) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a9, code lost:
        if ("AV Receiver".equals(r5) != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b1, code lost:
        if ("Car Navigation".equals(r5) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b3, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b5, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b7, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c1, code lost:
        if ("2016".equals(r3.f29334c) == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c7, code lost:
        if ("AV Receiver".equals(r5) != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02cf, code lost:
        if ("Car Navigation - High".equals(r5) == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d1, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02d3, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d4, code lost:
        if (r9 == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d6, code lost:
        r8 = 1.1515f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02da, code lost:
        if (r3 == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e1, code lost:
        if ((r13.f122093a & 128) == 0) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e3, code lost:
        r8 = ((float) r13.f122100h) * 1.0E-4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ee, code lost:
        r3 = r0.f37072t.x;
        r4 = r0.f37072t.y;
        r5 = p000.oam.m28292a(r0.f37066m, r8, r3, r4);
        r0.f37056c = new p000.oab(r18, r1, r2, m28269a(r13), r3, r4, r13.f122098f, r8, r26, r5, p000.oam.m28293a(r5, r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0321, code lost:
        if ((r13.f122093a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0323, code lost:
        r1 = r13.f122101i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0325, code lost:
        r1 = r0.f37055b;
        r1.sendMessage(r1.obtainMessage(4, r0.f37056c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0333, code lost:
        return p000.bmvz.f131120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0334, code lost:
        r1 = p000.oak.f37052a.mo68387b();
        r1.mo68432a("oak", "a", 384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r1.mo68405a("No working configuration");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x034a, code lost:
        return p000.bmxv.m108566b(p000.bpdo.MISSING_VIDEO);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (r13 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d2, code lost:
        m28272a(r13, r0.f37072t);
        r1 = r0.f37072t.x;
        r2 = r0.f37072t.y;
        m28273b(r13, r0.f37072t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e8, code lost:
        if ((r13.f122093a & 32) == 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ea, code lost:
        r26 = r13.f122099g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ef, code lost:
        r26 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        r3 = r0.f37076x.mo21346p();
        r4 = r3.f29336e;
        r5 = r3.f29337f;
        r8 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0204, code lost:
        if (r4 <= 1) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0208, code lost:
        if (r4 == 1) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020c, code lost:
        if (r5 >= 2) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020e, code lost:
        r4 = r3.f29332a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0210, code lost:
        if (r4 == null) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0212, code lost:
        r5 = r3.f29333b;
        r9 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021b, code lost:
        if (r9 == -1710362933) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0220, code lost:
        if (r9 == -1288957975) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0225, code lost:
        if (r9 == 1097799450) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        if (r4.equals("Pioneer") == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0230, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0238, code lost:
        if (r4.equals("KENWOOD Top Menu") == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x019c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0194 A[SYNTHETIC] */
    /* renamed from: a */
    public final bmxv mo21902a(int[] iArr) {
        biwg biwg;
        int i;
        int i2;
        bngx bngx;
        int i3;
        int i4;
        boolean z;
        biwf biwf;
        Point point;
        biwf biwf2;
        int[] iArr2 = iArr;
        int length = iArr2.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                i2 = iArr2[i5];
                if (i2 >= 0 && (bngx = this.f37074v) != null && i2 < bngx.size()) {
                    biwg = (biwg) this.f37074v.get(i2);
                    Point point2 = new Point();
                    if (m28272a(biwg, point2)) {
                        int a = biwo.m102908a(biwg.f122095c);
                        if (a == 0) {
                            a = 1;
                        }
                        if (a != 1) {
                            i3 = 30;
                        } else {
                            i3 = 60;
                        }
                        int i6 = biwg.f122094b;
                        biwf biwf3 = biwf.VIDEO_800x480;
                        biwf a2 = biwf.m102896a(i6);
                        if (a2 == null) {
                            a2 = biwf.VIDEO_800x480;
                        }
                        switch (a2.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = false;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                if (ccwd.f180086a.mo6606a().mo76930g()) {
                                    z = true;
                                    break;
                                } else {
                                    bnsi b = f37052a.mo68387b();
                                    b.mo68432a("oak", "a", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    b.mo68409a("The video configuration index %d contains portrait resolutions which is notsupported, use 480p as fallback resolution instead.", i2);
                                    i4 = length;
                                    continue;
                                    i5++;
                                    iArr2 = iArr;
                                    length = i4;
                                }
                            default:
                                z = false;
                                break;
                        }
                        int u = this.f37065l.mo21351u();
                        if (u == 4) {
                            i4 = length;
                        } else if (u == 0 || u == 3) {
                            i4 = length;
                        } else {
                            CarInfo p = this.f37076x.mo21346p();
                            if (u == 2) {
                                int am = this.f37076x.mo21308am();
                                if ((am > 2500 && am < 4900) || am < 2400 || am > 5900) {
                                    bnsi c = f37052a.mo68388c();
                                    c.mo68432a("oak", "a", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    c.mo68409a("Unexpected wifi frequency (MHz) %d", am);
                                    this.f37075w.mo20850a(am);
                                }
                                oac oac = this.f37073u;
                                npd npd = this.f37064k;
                                i4 = length;
                                biwf b2 = oac.mo21890b(i3, z);
                                biwf a3 = oac.mo21889a(p, npd, z);
                                if (cctz.f179921a.mo6606a().mo76778b() && (am >= 4900 || am <= 0 || am > 2500 || cctz.f179921a.mo6606a().mo76777a())) {
                                    biwf2 = !z ? biwf.VIDEO_1920x1080 : biwf.VIDEO_1080x1920;
                                } else if (!cctz.f179921a.mo6606a().mo76779c()) {
                                    biwf2 = biwf.VIDEO_800x480;
                                } else {
                                    biwf2 = !z ? biwf.VIDEO_1280x720 : biwf.VIDEO_720x1280;
                                }
                                oac.m28249a(b2);
                                oac.m28249a(a3);
                                oac.m28249a(biwf2);
                                biwf = oac.m28248a(oac.m28248a(a3, b2, z), biwf2, z);
                                bnsi d = oac.f37034a.mo68390d();
                                d.mo68432a("oac", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68422a("getMaxAllowedResolutionForWifi: %s at fps %d", (Object) oac.m28249a(biwf), i3);
                            } else {
                                i4 = length;
                                oac oac2 = this.f37073u;
                                npd npd2 = this.f37064k;
                                biwf b3 = oac2.mo21890b(i3, z);
                                biwf a4 = oac2.mo21889a(p, npd2, z);
                                oac.m28249a(b3);
                                oac.m28249a(a4);
                                biwf = oac.m28248a(a4, b3, z);
                                bnsi d2 = oac.f37034a.mo68390d();
                                d2.mo68432a("oac", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d2.mo68422a("getMaxAllowedResolutionForUsb: %s at fps %d", (Object) oac.m28249a(biwf), i3);
                            }
                            point = new Point();
                            m28271a(biwf, point);
                            if (point2.x <= point.x) {
                                i5++;
                                iArr2 = iArr;
                                length = i4;
                            } else {
                                i = i2;
                            }
                        }
                        biwf = this.f37073u.mo21890b(i3, z);
                        bnsi d3 = oac.f37034a.mo68390d();
                        d3.mo68432a("oac", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d3.mo68422a("getMaxAllowedResolutionForEmulator: %s at fps %d", (Object) oac.m28249a(biwf), i3);
                        point = new Point();
                        m28271a(biwf, point);
                        if (point2.x <= point.x) {
                        }
                    } else {
                        bnsi b4 = f37052a.mo68387b();
                        b4.mo68432a("oak", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b4.mo68409a("car sent configuration index %d which is not supported", i2);
                        return bmxv.m108566b(bpdo.BAD_VIDEO);
                    }
                }
            } else {
                biwg = null;
                i = -1;
            }
        }
        bnsi b5 = f37052a.mo68387b();
        b5.mo68432a("oak", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b5.mo68409a("car sent wrong configuration index %d", i2);
        return bmxv.m108566b(bpdo.BAD_VIDEO);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ojh mo20646a(ojm ojm) {
        return new okf(this, this.f37063j, ojm, this.f37058e);
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        Integer num;
        float f;
        printWriter.println(this.f37056c);
        byte[] bArr = this.f37061h;
        if (bArr != null) {
            String a = srv.m36160a(bArr);
            printWriter.println(a.length() == 0 ? new String("ModifiedConfig:") : "ModifiedConfig:".concat(a));
        }
        printWriter.print("Video encoder: ");
        odw odw = this.f37060g;
        if (odw != null) {
            printWriter.println(odw);
        }
        printWriter.println("Video Configs");
        bngx bngx = this.f37074v;
        if (bngx != null) {
            int size = bngx.size();
            for (int i = 0; i < size; i++) {
                biwg biwg = (biwg) bngx.get(i);
                if (biwg == null) {
                    printWriter.println("null config");
                } else {
                    m28272a(biwg, this.f37072t);
                    int i2 = this.f37072t.x;
                    int i3 = this.f37072t.y;
                    int a2 = m28269a(biwg);
                    m28273b(biwg, this.f37072t);
                    int i4 = this.f37072t.x;
                    int i5 = this.f37072t.y;
                    if ((biwg.f122093a & 16) != 0) {
                        num = Integer.valueOf(biwg.f122098f);
                    } else {
                        num = null;
                    }
                    int a3 = okb.m28990a(num);
                    if ((biwg.f122093a & 128) != 0) {
                        f = (float) biwg.f122100h;
                    } else {
                        f = 1.0f;
                    }
                    StringBuilder sb = new StringBuilder(139);
                    sb.append("codecW:");
                    sb.append(i2);
                    sb.append(" codecH:");
                    sb.append(i3);
                    sb.append(" dispW:");
                    sb.append(i4);
                    sb.append(" dispH:");
                    sb.append(i5);
                    sb.append(" dpi:");
                    sb.append(a3);
                    sb.append(" fps:");
                    sb.append(a2);
                    sb.append(" pixelAspectRatio: ");
                    sb.append(f);
                    printWriter.println(sb.toString());
                    boolean z = this.f37068o;
                    int i6 = this.f37067n;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("disp enabled:");
                    sb2.append(z);
                    sb2.append(" disp state:");
                    sb2.append(i6);
                    printWriter.println(sb2.toString());
                }
            }
            return;
        }
        printWriter.println("null video configs");
    }

    /* renamed from: a */
    public final void mo21892a(ScheduledExecutorService scheduledExecutorService) {
        this.f37058e.mo21763a(scheduledExecutorService);
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f37059f = (okf) ojh;
    }

    /* renamed from: a */
    public final void mo21903a(boolean z) {
        int i;
        this.f37078z.set(false);
        LinkedBlockingQueue linkedBlockingQueue = this.f37071r;
        if (!z) {
            i = 2;
        } else {
            i = 3;
        }
        linkedBlockingQueue.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo21904a(boolean z, boolean z2) {
        if (z) {
            oaj oaj = this.f37055b;
            oaj.sendMessage(oaj.obtainMessage(2, z2 ? 1 : 0, 0));
            try {
                if (!this.f37070q.tryAcquire(15000, TimeUnit.MILLISECONDS)) {
                    this.f37077y.mo21273a(bpdn.TIMEOUT, bpdo.DISPLAY_REMOVAL_TIMEOUT, "handling display removal timed-out");
                }
            } catch (InterruptedException e) {
            }
        }
        odw odw = this.f37060g;
        if (odw != null) {
            odw.mo22034h();
            if (this.f37060g.f37303g) {
                if (cctv.m131557b()) {
                    this.f37077y.mo21287a(olq.VIDEO_ENCODING_THREAD);
                } else {
                    this.f37077y.mo21298ac();
                }
            }
            this.f37060g = null;
        }
        okf okf = this.f37059f;
        bmxy.m108581a(okf);
        okf.mo22189e();
    }
}
