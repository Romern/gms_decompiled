package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.location.GpsSatellite;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.fused.FusionEngine$AlarmListener;
import com.google.android.location.fused.FusionScheduler;
import com.google.android.location.fused.LocationStatusHelper;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: bfqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqs implements bfrc, bfrv, bfrz, bhbh, bftv, bhbp, bfrp, aerd, adyr, bfti, bfsc {

    /* renamed from: a */
    static final long f114908a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h */
    public static final /* synthetic */ int f114909h = 0;

    /* renamed from: i */
    private static final long f114910i = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: A */
    private final aeri f114911A;

    /* renamed from: B */
    private final DeviceActiveAlarmTimer f114912B;

    /* renamed from: C */
    private final List f114913C;

    /* renamed from: D */
    private final Comparator f114914D;

    /* renamed from: E */
    private final bfpl f114915E;

    /* renamed from: F */
    private final bftk f114916F;

    /* renamed from: b */
    public final bfpk f114917b;

    /* renamed from: c */
    public boolean f114918c;

    /* renamed from: d */
    public final bsct f114919d;

    /* renamed from: e */
    public final bfpj f114920e;

    /* renamed from: f */
    public final bfrn f114921f;

    /* renamed from: g */
    final FusionEngine$AlarmListener f114922g;

    /* renamed from: j */
    private final bfsa f114923j;

    /* renamed from: k */
    private final LocationStatusHelper f114924k;

    /* renamed from: l */
    private final bfuo f114925l;

    /* renamed from: m */
    private final AndroidInertialAnchor f114926m;

    /* renamed from: n */
    private bfrb f114927n;

    /* renamed from: o */
    private Location f114928o;

    /* renamed from: p */
    private final bfqz f114929p;

    /* renamed from: q */
    private final bfqz f114930q;

    /* renamed from: r */
    private long f114931r;

    /* renamed from: s */
    private long f114932s;

    /* renamed from: t */
    private long f114933t;

    /* renamed from: u */
    private bfqx f114934u;

    /* renamed from: v */
    private int f114935v;

    /* renamed from: w */
    private bfqx f114936w;

    /* renamed from: x */
    private final Context f114937x;

    /* renamed from: y */
    private final bsfd f114938y;

    /* renamed from: z */
    private final FusionScheduler f114939z;

    /* JADX WARN: Type inference failed for: r8v1, types: [bfuo, bfqx, com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor], assign insn: PHI: (r8v1 ?) = (r8v5 ?), (r8v18 ?), (r8v19 ?) binds: [B:180:0x0652, B:32:0x012e, B:31:0x00f2] */
    /* JADX WARN: Type inference failed for: r8v5, assign insn: 0x06f3: CONST  (r8v5 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v18, assign insn: 0x0143: CONST  (r8v18 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r8v19, assign insn: 0x0128: CONST  (r8v19 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0873  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0908  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x090e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x091d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x094f  */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    public bfqs(Context context, Looper looper, bfpj bfpj, bfpa bfpa, bfuo bfuo) {
        SensorManager sensorManager;
        bftk bftk;
        bfrw bfrw;
        DeviceActiveAlarmTimer deviceActiveAlarmTimer;
        bhbr bhbr;
        int i;
        int i2;
        ? r8;
        bsct bsct;
        bfvr bfvr;
        SensorManager sensorManager2;
        bfsd bfsd;
        bfrw bfrw2;
        AndroidInertialAnchor androidInertialAnchor;
        bsdh bsdh;
        btvy btvy;
        Context context2 = context;
        Looper looper2 = looper;
        bfpa bfpa2 = bfpa;
        bfuo bfuo2 = bfuo;
        bftk a = bftk.m97822a(context);
        bhbr a2 = bhbr.m100591a(context);
        SensorManager sensorManager3 = (SensorManager) context2.getSystemService("sensor");
        bfrw bfrw3 = new bfrw(context2, new adzt(looper2));
        int i3 = Build.VERSION.SDK_INT;
        DeviceActiveAlarmTimer deviceActiveAlarmTimer2 = new DeviceActiveAlarmTimer(context2, looper2);
        srb srb = srb.f45012a;
        bfsa bfsa = new bfsa(looper2, context2);
        if (cevt.m138314f()) {
            String str = "";
            deviceActiveAlarmTimer = deviceActiveAlarmTimer2;
            bfpa2.f114751f = 4;
            if (cevt.f183463a.mo6606a().enableLogcatLogger()) {
                bsgm.f144529a.add(new bsgn());
            }
            if (cevt.f183463a.mo6606a().disableParticleFilter()) {
                bfrw = bfrw3;
                bsdh = null;
                androidInertialAnchor = null;
            } else if (!cevt.m138313e()) {
                if (cexz.m138406e()) {
                    btvy = cexz.m138403b();
                } else {
                    try {
                        btvy = btvk.m118920a(context2, Integer.valueOf((int) cevt.f183463a.mo6606a().flpInertialAnchorConfigurationIndex()));
                    } catch (IOException e) {
                        Log.e("GCoreFlp", "Error while loading InertialAnchor config for FLP, using default.");
                        btvy = null;
                    }
                }
                btvi a3 = AndroidInertialAnchor.m151130a();
                a3.f152609b = new adzt(looper2);
                a3.mo72441a(cevt.m138312d());
                a3.f152610c = "FLP Inertial Anchor";
                a3.mo72440a((int) cevt.m138311c());
                bxvd da = btvx.f152648k.mo74144da();
                boolean f = cewg.m138348f();
                bfrw = bfrw3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152650a = f;
                boolean k = cexz.m138412k();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152651b = k;
                boolean g = cexz.m138408g();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152652c = g;
                boolean i4 = cexz.m138410i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152653d = i4;
                boolean f2 = cexz.m138407f();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152654e = f2;
                boolean m = cexz.m138414m();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152655f = m;
                boolean l = cexz.m138413l();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152656g = l;
                boolean j = cexz.m138411j();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152657h = j;
                boolean c = cexz.m138404c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152658i = c;
                boolean h = cexz.m138409h();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btvx) da.f164949b).f152659j = h;
                a3.f152612e = (btvx) da.mo74062i();
                if (btvy != null) {
                    a3.f152608a = btvy;
                }
                if (cexz.m138405d() && cevt.m138312d()) {
                    a3.f152614g = new btvp(context2, 3);
                }
                AndroidInertialAnchor a4 = a3.mo72439a();
                if (a4 != null && bfsb.m97687a(a4)) {
                    bsdh a5 = bfsb.m97686a(bfpa2, a);
                    a4.mo86634a(a5.mo70263e(), new adzt(looper2));
                    bfpa2.f114752g = 2;
                    androidInertialAnchor = a4;
                    bsdh = a5;
                } else if (a4 == null) {
                    bfpa2.f114752g = 4;
                    bsdh = null;
                    androidInertialAnchor = null;
                } else {
                    if (!bfsb.m97687a(a4)) {
                        bfpa2.f114752g = 3;
                    }
                    bsdh = null;
                    androidInertialAnchor = null;
                }
            } else if ((bfuo2 instanceof bfuk) && bfuo.mo62271b()) {
                bsdh a6 = bfsb.m97686a(bfpa2, a);
                bfuk bfuk = (bfuk) bfuo2;
                btvl e2 = a6.mo70263e();
                bsdh bsdh2 = a6;
                if (bfuk.f115336b == null) {
                    bfuk.f115336b = e2;
                }
                bfpa2.f114752g = 5;
                bfrw = bfrw3;
                bsdh = bsdh2;
                androidInertialAnchor = null;
            } else {
                bfpa2.f114752g = 6;
                bfrw = bfrw3;
                bsdh = null;
                androidInertialAnchor = null;
            }
            bses i5 = bset.m115587i();
            i5.mo70452d(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseUnknownPosM());
            i5.mo70453e(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseUnknownVelMps());
            i5.mo70450b(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseFeetPosM());
            i5.mo70451c(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseFeetVelMps());
            i5.mo70454f(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseWheelsPosM());
            i5.mo70455g(cevt.f183463a.mo6606a().outputLinearKfProcessNoiseWheelsVelMps());
            i5.mo70449a(cevt.f183463a.mo6606a().outputKalmanFilterEnableReset());
            i5.mo70448a(cevt.f183463a.mo6606a().outputKalmanFilterResetThresholdM());
            bset a7 = i5.mo70447a();
            bseu bseu = new bseu();
            SensorManager sensorManager4 = sensorManager3;
            bseu.mo70465d(5.0d);
            bseu.mo70474k(true);
            bseu.mo70467e(22.0d);
            bseu.mo70457a(5);
            bseu.mo70462b(true);
            bseu.f144414u = bsen.m115548f().mo70430a();
            bseu.mo70473j(true);
            bseu.mo70463c(60.0d);
            bseu.mo70460b(60.0d);
            bseu.mo70456a(0.0d);
            bseu.mo70459a(false);
            bseu.mo70469f(false);
            bseu.mo70461b(10000000000L);
            bseu.mo70472i(true);
            bseu.mo70466d(true);
            bseu.f144408o = Double.valueOf(1.0d);
            bseu.mo70464c(true);
            bseu.mo70458a(5000000000L);
            bseu.mo70471h(true);
            bseu.mo70470g(false);
            bseu.mo70468e(true);
            bseu.f144415v = bset.m115587i().mo70447a();
            bftk = a;
            bseu.mo70465d(cevt.f183463a.mo6606a().speedUpperThresholdMps());
            bseu.mo70474k(cevt.f183463a.mo6606a().useNStepActivationFilter());
            bseu.mo70467e(cevt.f183463a.mo6606a().stepTimeoutThresholdSeconds());
            bseu.mo70457a((int) cevt.f183463a.mo6606a().requiredStepCount());
            bseu.mo70462b(cevt.f183463a.mo6606a().alwaysRunAfterOneStep());
            bseu.mo70473j(cevt.f183463a.mo6606a().useAltitudeFilter());
            bseu.mo70463c(cevt.f183463a.mo6606a().altitudeFilterWifiValidTimeSeconds());
            bseu.mo70460b(cevt.f183463a.mo6606a().altitudeFilterGpsValidTimeSeconds());
            bseu.mo70456a(cevt.f183463a.mo6606a().altitudeFilterFloorLabelValidTimeSeconds());
            bseu.mo70459a(cevt.f183463a.mo6606a().altitudeFilterRequestBarometer());
            bseu.mo70469f(cest.m138205k());
            bseu.mo70461b(cest.f183409a.mo6606a().flpBluePixelOverruleIntervalNanos());
            bseu.mo70472i(cevt.f183463a.mo6606a().enableOutputKalmanFilter());
            bseu.mo70466d(cevt.f183463a.mo6606a().enableActivityAwareKalmanFilter());
            bseu.mo70464c(cevt.f183463a.mo6606a().enableAccuracyOutputFilter());
            bseu.mo70458a(cevt.f183463a.mo6606a().accuracyOutputFilterMaxAgeInWindowNanos());
            bseu.mo70471h(cevt.f183463a.mo6606a().enableOutputFilterTimestampFix());
            bseu.mo70470g(cevt.f183463a.mo6606a().enableIncomingPositionAccuracyScaling());
            bseu.mo70468e(cevt.f183463a.mo6606a().enableArForDriving());
            bseu.f144415v = a7;
            str = bseu.f144394a == null ? " speedUpperThresholdMps" : str;
            str = bseu.f144395b == null ? str.concat(" useNStepActivationFilter") : str;
            str = bseu.f144396c == null ? String.valueOf(str).concat(" stepTimeoutThresholdSeconds") : str;
            str = bseu.f144397d == null ? String.valueOf(str).concat(" requiredStepCount") : str;
            str = bseu.f144398e == null ? String.valueOf(str).concat(" alwaysRunAfterOneStep") : str;
            str = bseu.f144399f == null ? String.valueOf(str).concat(" useAltitudeFilter") : str;
            str = bseu.f144400g == null ? String.valueOf(str).concat(" altitudeFilterWifiValidTimeSeconds") : str;
            str = bseu.f144401h == null ? String.valueOf(str).concat(" altitudeFilterGpsValidTimeSeconds") : str;
            str = bseu.f144402i == null ? String.valueOf(str).concat(" altitudeFilterFloorLabelValidTimeSeconds") : str;
            str = bseu.f144403j == null ? String.valueOf(str).concat(" altitudeFilterRequestBarometer") : str;
            str = bseu.f144404k == null ? String.valueOf(str).concat(" enableBluePixel") : str;
            str = bseu.f144405l == null ? String.valueOf(str).concat(" bluePixelOverruleIntervalNanos") : str;
            str = bseu.f144406m == null ? String.valueOf(str).concat(" enableOutputKalmanFilter") : str;
            str = bseu.f144407n == null ? String.valueOf(str).concat(" enableActivityAwareKalmanFilter") : str;
            str = bseu.f144408o == null ? String.valueOf(str).concat(" globalAccuracyFactor") : str;
            str = bseu.f144409p == null ? String.valueOf(str).concat(" enableAccuracyOutputFilter") : str;
            str = bseu.f144410q == null ? String.valueOf(str).concat(" accuracyOutputFilterMaxAgeInWindowNanos") : str;
            str = bseu.f144411r == null ? String.valueOf(str).concat(" enableOutputFilterTimestampFix") : str;
            str = bseu.f144412s == null ? String.valueOf(str).concat(" enableIncomingPositionAccuracyScaling") : str;
            str = bseu.f144413t == null ? String.valueOf(str).concat(" enableArForDriving") : str;
            str = bseu.f144414u == null ? String.valueOf(str).concat(" bluemoonLocalizerSensorFusionConfiguration") : str;
            str = bseu.f144415v == null ? String.valueOf(str).concat(" linearLatLngKalmanFilterConfiguration") : str;
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            bseh bseh = new bseh(bseu.f144394a.doubleValue(), bseu.f144395b.booleanValue(), bseu.f144396c.doubleValue(), bseu.f144397d.intValue(), bseu.f144398e.booleanValue(), bseu.f144399f.booleanValue(), bseu.f144400g.doubleValue(), bseu.f144401h.doubleValue(), bseu.f144402i.doubleValue(), bseu.f144403j.booleanValue(), bseu.f144404k.booleanValue(), bseu.f144405l.longValue(), bseu.f144406m.booleanValue(), bseu.f144407n.booleanValue(), bseu.f144408o.doubleValue(), bseu.f144409p.booleanValue(), bseu.f144410q.longValue(), bseu.f144411r.booleanValue(), bseu.f144412s.booleanValue(), bseu.f144413t.booleanValue(), bseu.f144414u, bseu.f144415v);
            String str2 = Build.PRODUCT;
            long f3 = cevw.m138321f();
            long h2 = cevw.m138323h();
            sensorManager = sensorManager4;
            bhbr = a2;
            long g2 = cevw.m138322g();
            float a8 = bscq.m115245a(str2);
            int i6 = (int) f3;
            int i7 = (int) h2;
            int i8 = (int) g2;
            r8 = 0;
            i2 = 4;
            i = 0;
            bsct = new bsco(a8, bseh, i6, i7, i8, bsdh, androidInertialAnchor, bftk);
        } else if (cevq.f183461a.mo6606a().flpUseGpsWifiFusion()) {
            bfpa2.f114751f = 3;
            bsbv bsbv = new bsbv();
            bsbv.f144019a = Float.valueOf(bscq.m115245a(Build.PRODUCT));
            String str3 = "";
            deviceActiveAlarmTimer = deviceActiveAlarmTimer2;
            bsbv.mo70235a((int) cevw.m138321f());
            bsbv.mo70238c((int) cevw.m138323h());
            bsbv.mo70237b((int) cevw.m138322g());
            bsbv.mo70236a(cevq.f183461a.mo6606a().flpUsePdrWithGpsPosition());
            bsbv.mo70234a();
            String str4 = bsbv.f144019a == null ? " gpsAccuracyNormalizationFactor" : str3;
            str4 = bsbv.f144020b == null ? str4.concat(" gpsPositionRequestTimePeriodSec") : str4;
            str4 = bsbv.f144021c == null ? String.valueOf(str4).concat(" wifiLocationRequestTimePeriodSec") : str4;
            str4 = bsbv.f144022d == null ? String.valueOf(str4).concat(" nearIndoorsGpsSnrThreshold") : str4;
            str4 = bsbv.f144023e == null ? String.valueOf(str4).concat(" usePdrWithGpsPosition") : str4;
            str4 = bsbv.f144024f == null ? String.valueOf(str4).concat(" flpMinimumOutputAccuracyMm") : str4;
            if (!str4.isEmpty()) {
                String valueOf2 = String.valueOf(str4);
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf2));
            }
            bsct = new bscc(new bsbp(bsbv.f144019a.floatValue(), bsbv.f144020b.intValue(), bsbv.f144021c.intValue(), bsbv.f144022d.intValue(), bsbv.f144023e.booleanValue(), bsbv.f144024f.intValue()));
            sensorManager = sensorManager3;
            bfrw = bfrw3;
            bftk = a;
            r8 = 0;
            i = 0;
            bhbr = a2;
            i2 = 4;
        } else {
            deviceActiveAlarmTimer = deviceActiveAlarmTimer2;
            bfpa2.f114751f = 2;
            bsct = new bsdc(new bscx());
            sensorManager = sensorManager3;
            bfrw = bfrw3;
            bftk = a;
            r8 = 0;
            i = 0;
            bhbr = a2;
            i2 = 4;
        }
        bftw bftw = cevt.m138310b() ? new bftw(context2) : r8;
        bsfd bsfd = cevw.m138325j() ? new bsfd("FusionEngine", (int) cevw.f183465a.mo6606a().sensorFusionOutputPositionLogMaxBufferSize(), (double) cevw.f183465a.mo6606a().sensorFusionOutputPositionLogTimeWindowSec(), true) : r8;
        aeri e3 = aeri.m52441e(context);
        this.f114932s = 0;
        this.f114933t = 0;
        this.f114921f = new bfrn();
        this.f114915E = new bfpl();
        this.f114937x = context2;
        context.getPackageName();
        this.f114917b = new bfpk(new adzt(looper2), bfqt.m97590a(context));
        this.f114923j = bfsa;
        if (!cevw.m138318c()) {
            this.f114923j.f115095i = this;
        }
        this.f114920e = bfpj;
        this.f114919d = new bscf(bsct);
        this.f114911A = e3;
        bftk bftk2 = bftk;
        this.f114916F = bftk2;
        if (cest.m138205k()) {
            bfsa.f115096j = bftk2.mo62245c();
            if (!cevw.m138318c()) {
                bftk2.mo62240a(this);
            }
        }
        this.f114938y = bsfd;
        this.f114934u = r8;
        this.f114936w = r8;
        this.f114935v = i;
        this.f114929p = new bfqz();
        this.f114930q = new bfqz();
        spf a9 = spf.m35821a(context);
        this.f114924k = new LocationStatusHelper(new sti(context2, looper2), new bfsa(looper2, context2), new DeviceActiveAlarmTimer(context2, looper2));
        if (!cevw.m138318c()) {
            this.f114924k.f150756o = this;
        }
        bftk bftk3 = bftk2;
        DeviceActiveAlarmTimer deviceActiveAlarmTimer3 = deviceActiveAlarmTimer;
        bfvd bfvd = new bfvd(bhbr, a9, srb, looper, this.f114920e);
        bfvd.f115384i = new bfqp(this);
        if (!cevw.m138331p() && !cevw.m138318c()) {
            bfvd.mo62304a(this);
        }
        bfvd.f115399o = i2;
        bfvd.f115398n = cevw.f183465a.mo6606a().flpHighPowerGpsPulseMs();
        if (cevt.m138310b() && bftw != null && !cevw.m138318c()) {
            bftw.f115268a = this;
        }
        if (!cevt.m138314f() || !(bsct instanceof bsco)) {
            sensorManager2 = sensorManager;
        } else if (cevt.m138313e()) {
            sensorManager2 = sensorManager;
        } else {
            this.f114925l = r8;
            this.f114926m = (AndroidInertialAnchor) ((bsco) bsct).f144073d;
            sensorManager2 = sensorManager;
            bfvr = new bfvr(new bfsn(sensorManager2, this, this.f114917b.f118291c), this.f114926m);
            if (!cevw.m138320e()) {
                bfsd = new bfsd(sensorManager2, this, this.f114917b.f118291c, this.f114920e);
            } else {
                bfsd = r8;
            }
            bftw bftw2 = bftw;
            bfrw bfrw4 = bfrw;
            bfvd bfvd2 = bfvd;
            bftk bftk4 = bftk3;
            this.f114939z = new FusionScheduler(bfvd, new bfvh(bhbr, new bfqq(this, "location", "FusionEngine"), looper2), bfvr, new bfvg(this.f114923j, this.f114920e), new bfvf(this.f114923j, this.f114920e), new bfut(this.f114923j, this.f114920e), new bfuu(bftw, this.f114920e), new bfvn(context2, bfsd, new adzt(looper2)), new ste(context2, new adzt(looper2)), e3, context, looper);
            mo62155b(SystemClock.elapsedRealtime() * 1000000);
            this.f114912B = deviceActiveAlarmTimer3;
            int i9 = Build.VERSION.SDK_INT;
            this.f114913C = new ArrayList();
            this.f114914D = bfqn.f114900a;
            if (cevw.m138318c()) {
                bfrw2 = bfrw4;
                bfrw2.mo62192a(this);
            } else {
                bfrw2 = bfrw4;
            }
            this.f114922g = new FusionEngine$AlarmListener(this);
            if (cevw.m138318c()) {
                this.f114923j.f115095i = this;
                if (cest.m138205k()) {
                    bftk4.mo62240a(this);
                }
                this.f114924k.f150756o = this;
                if (!cevw.m138331p()) {
                    bfvd2.mo62304a(this);
                }
                if (cevt.m138310b() && bftw2 != null) {
                    bftw2.f115268a = this;
                }
                bfrw2.mo62192a(this);
            }
            if (!cevw.m138331p()) {
                bqfb bqfb = bqfb.INSTANCE;
                if (((bfuz) bfvd2).f115377b == null) {
                    ((bfuz) bfvd2).f115376a.mo63532a(this, bqfb);
                    return;
                }
                return;
            }
            return;
        }
        this.f114925l = bfuo;
        this.f114926m = r8;
        bfvr = new bfvr(new bfsn(sensorManager2, this, this.f114917b.f118291c), bfuo);
        if (!cevw.m138320e()) {
        }
        bftw bftw22 = bftw;
        bfrw bfrw42 = bfrw;
        bfvd bfvd22 = bfvd;
        bftk bftk42 = bftk3;
        this.f114939z = new FusionScheduler(bfvd, new bfvh(bhbr, new bfqq(this, "location", "FusionEngine"), looper2), bfvr, new bfvg(this.f114923j, this.f114920e), new bfvf(this.f114923j, this.f114920e), new bfut(this.f114923j, this.f114920e), new bfuu(bftw, this.f114920e), new bfvn(context2, bfsd, new adzt(looper2)), new ste(context2, new adzt(looper2)), e3, context, looper);
        mo62155b(SystemClock.elapsedRealtime() * 1000000);
        this.f114912B = deviceActiveAlarmTimer3;
        int i92 = Build.VERSION.SDK_INT;
        this.f114913C = new ArrayList();
        this.f114914D = bfqn.f114900a;
        if (cevw.m138318c()) {
        }
        this.f114922g = new FusionEngine$AlarmListener(this);
        if (cevw.m138318c()) {
        }
        if (!cevw.m138331p()) {
        }
    }

    /* renamed from: a */
    private final Location m97557a(Location location) {
        boolean z;
        bfqx bfqx;
        String str;
        String str2;
        bfqx bfqx2;
        int i;
        Integer num;
        Location location2 = location;
        if (!this.f114918c || this.f114927n == null) {
            return null;
        }
        String provider = location.getProvider();
        long time = location.getTime();
        long a = bfoy.m97457a(location);
        if ("network".equals(provider)) {
            Location location3 = this.f114930q.f114963a;
            if (location3 != null && location3.getTime() == location.getTime()) {
                return null;
            }
            if ("cell".equals(bxbh.m122519a(location))) {
                this.f114920e.mo26009a(10);
                z = false;
            } else {
                this.f114920e.mo26009a(9);
                Bundle extras = location.getExtras();
                if (extras == null || !extras.containsKey("locationSubtype")) {
                    num = 0;
                } else {
                    num = Integer.valueOf(extras.getInt("locationSubtype"));
                }
                z = num.intValue() == 6;
            }
            if (this.f114911A.mo34487a("network")) {
                this.f114930q.mo62169a(new Location(location2));
                this.f114931r = a;
            }
            if (!cevw.m138329n()) {
                long a2 = bfoy.m97457a(location);
                if (aeim.m51897c(location)) {
                    str = aeim.m51893b(location);
                } else {
                    str = null;
                }
                if (!cewj.m138359b() || !aeim.m51903g(location)) {
                    str2 = null;
                } else {
                    str2 = aeim.m51902f(location);
                }
                if (str == null && str2 == null) {
                    bfqx2 = null;
                } else {
                    bfqx2 = !aeim.m51898d(location) ? new bfqx(str, str2, a2) : new bfqx(str, aeim.m51900e(location).intValue(), str2, a2);
                }
                if (bxbl.m122538a(bfqx2, this.f114934u)) {
                    i = this.f114935v + 1;
                    this.f114935v = i;
                } else {
                    this.f114935v = 1;
                    i = 1;
                }
                this.f114934u = bfqx2;
                bfqx bfqx3 = this.f114936w;
                if (bfqx3 == null || i >= 2 || a2 - bfqx3.f114962e > 20000000000L) {
                    this.f114936w = this.f114934u;
                }
            }
        } else if ("gps".equals(provider) || "gps_injected".equals(provider)) {
            Location location4 = this.f114928o;
            if (location4 != null && location4.getTime() == location.getTime()) {
                return null;
            }
            this.f114920e.mo26010a(8, 1);
            if (this.f114911A.mo34487a("gps")) {
                this.f114928o = new Location(location2);
            }
            z = false;
        } else {
            if (!"fused".equals(provider)) {
                this.f114920e.mo26009a(11);
            }
            return null;
        }
        if (aeim.m51907k(location)) {
            location2.setProvider("fused");
            aeim.m51908l(location);
            return location2;
        }
        if (!cevw.m138329n() && (bfqx = this.f114936w) != null && a - bfqx.f114962e > 40000000000L) {
            this.f114936w = null;
        }
        this.f114919d.mo70209a(a, bfqy.m97597a(location2, cevw.m138329n()));
        mo62155b(a);
        Location a3 = mo62149a(time, a);
        if (!z || !ceze.m138458c()) {
            return a3;
        }
        if (cevw.m138329n()) {
            return bfqy.m97595a(bfqy.m97597a(location2, true), "fused", time, a);
        }
        return bfqy.m97596a(bfqy.m97597a(location2, false), "fused", this.f114936w, time, a);
    }

    /* renamed from: b */
    private static final void m97560b(Location location, Location location2) {
        if (location != null) {
            Location location3 = new Location(location);
            location3.setProvider("fused");
            aeim.m51890a(location2, "noGPSLocation", location3);
        }
    }

    /* renamed from: d */
    private final void m97561d(List list) {
        if (this.f114918c) {
            List list2 = null;
            if (list.size() == 1) {
                Location a = m97557a((Location) list.get(0));
                if (a != null) {
                    list2 = Collections.singletonList(a);
                }
            } else {
                int i = Build.VERSION.SDK_INT;
                if (!list.isEmpty()) {
                    list2 = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Location a2 = m97557a((Location) it.next());
                        if (a2 != null) {
                            list2.add(a2);
                        }
                    }
                }
            }
            mo62158c(list2);
        }
    }

    /* renamed from: g */
    private final void m97562g() {
        if (this.f114928o != null) {
            this.f114928o = null;
            bfqz bfqz = this.f114930q;
            m97558a(bfqz.f114963a, bfqz.mo62168a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    private final void m97563h() {
        long j;
        if (m97564i() || this.f114915E.mo62100a()) {
            long j2 = Long.MAX_VALUE;
            if (m97564i()) {
                bfrn bfrn = this.f114921f;
                long j3 = bfrn.f115039g;
                if (j3 < Long.MAX_VALUE) {
                    j2 = Math.max((long) (((float) bfrn.f115038f) * 0.5f), f114910i) + j3;
                }
            }
            if (this.f114915E.mo62100a()) {
                long j4 = f114908a;
                if (j4 < j2) {
                    j = j4;
                    if (j >= this.f114912B.mo70957c()) {
                        this.f114912B.mo70955a(j, this.f114921f.f115043k, "com.google.android.gms.location.ENGINE_BATCH_TIMEOUT", this.f114922g);
                        return;
                    }
                    return;
                }
            }
            j = j2;
            if (j >= this.f114912B.mo70957c()) {
            }
        } else {
            this.f114912B.mo70956b();
        }
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f114927n = bfrb;
    }

    /* renamed from: a */
    public final void mo62154a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    /* renamed from: c */
    public final void mo62157c() {
        if (this.f114915E.mo62100a()) {
            mo62161f();
            bfpl bfpl = this.f114915E;
            if (!bfpl.f114797a.isEmpty()) {
                bfps[] bfpsArr = (bfps[]) bfpl.f114797a.toArray(bfpl.f114796b);
                bfpl.f114797a.clear();
                for (bfps bfps : bfpsArr) {
                    if (bfps != null) {
                        bfps.mo62108a();
                    }
                }
            }
            m97563h();
        }
    }

    /* renamed from: e */
    public final void mo62160e() {
        m97562g();
    }

    /* renamed from: f */
    public final void mo62161f() {
        if (!this.f114913C.isEmpty()) {
            Collections.sort(this.f114913C, this.f114914D);
            m97561d(this.f114913C);
            this.f114913C.clear();
            m97563h();
        }
    }

    /* renamed from: m */
    public final void mo31163m(long j) {
        Location a;
        bfuo bfuo = this.f114925l;
        float f = Float.MAX_VALUE;
        if (bfuo != null) {
            bfuo.mo62269a(this.f114929p.f114963a);
            float a2 = this.f114925l.mo62268a();
            if (a2 != Float.MAX_VALUE) {
                f = a2;
            }
            this.f114919d.mo70208a(j, f, f);
        } else {
            AndroidInertialAnchor androidInertialAnchor = this.f114926m;
            if (androidInertialAnchor != null) {
                androidInertialAnchor.mo86633a(this.f114929p.f114963a);
                if (cest.m138206l() && cest.m138208n()) {
                    this.f114916F.mo62238a(this.f114929p.f114963a);
                }
                this.f114919d.mo70208a(j, Float.MAX_VALUE, 0.0f);
            }
        }
        if (cevt.f183463a.mo6606a().flpReportLocationOnStepUpdate() && !m97564i()) {
            if ((this.f114929p.f114963a == null || this.f114932s < j) && (a = mo62149a(System.currentTimeMillis() - (SystemClock.elapsedRealtime() - (j / 1000000)), j)) != null) {
                mo62158c(Collections.singletonList(a));
            }
        }
    }

    public final String toString() {
        return "FusionEngine";
    }

    /* renamed from: i */
    private final boolean m97564i() {
        int i = Build.VERSION.SDK_INT;
        return this.f114921f.mo62183b();
    }

    /* renamed from: b */
    public final void mo62061b() {
        if (this.f114918c) {
            this.f114918c = false;
            this.f114911A.mo34481a(this);
            LocationStatusHelper locationStatusHelper = this.f114924k;
            locationStatusHelper.f150753l = false;
            locationStatusHelper.f150757p.mo62203e();
            locationStatusHelper.f150758q.mo26073b();
            locationStatusHelper.f150759r.mo70956b();
            FusionScheduler fusionScheduler = this.f114939z;
            if (fusionScheduler.f150733o) {
                fusionScheduler.f150720b.mo62323e();
                fusionScheduler.f150727i.mo26067a();
                fusionScheduler.f150729k.unregisterReceiver(fusionScheduler);
                fusionScheduler.f150728j.mo34478a(fusionScheduler);
                fusionScheduler.f150733o = false;
                fusionScheduler.f150734p = false;
                fusionScheduler.mo70866a(false);
            }
            this.f114923j.mo62203e();
            int i = Build.VERSION.SDK_INT;
            this.f114913C.clear();
            bfpj bfpj = this.f114920e;
            bfpj.mo26010a(1, bfpj.f114790j.mo62094a("FusionEngine"));
        }
    }

    /* renamed from: c */
    public final void mo62158c(List list) {
        if (list != null && !list.isEmpty()) {
            bfrb bfrb = this.f114927n;
            if (bfrb != null) {
                bfrb.mo62122f(list);
            }
            Location location = (Location) list.get(list.size() - 1);
            if (aeri.m52437b(this.f114937x)) {
                LocationStatusHelper locationStatusHelper = this.f114924k;
                if (list.isEmpty()) {
                    String valueOf = String.valueOf(list);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Received invalid locations to report: ");
                    sb.append(valueOf);
                    Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
                } else {
                    int i = Build.VERSION.SDK_INT;
                    ListIterator listIterator = list.listIterator(list.size());
                    boolean z = false;
                    boolean z2 = false;
                    while (listIterator.hasPrevious() && (!z || !z2)) {
                        Location location2 = (Location) listIterator.previous();
                        int j = aeim.m51906j(location2);
                        char c = 2;
                        if (j == 1) {
                            c = 0;
                        } else if (j == 2 || j == 3) {
                            c = 1;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        long millis = TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos());
                        if (c != 0) {
                            if (c != 1) {
                                if (!z) {
                                    locationStatusHelper.f150750i = millis;
                                }
                                if (!z2) {
                                    locationStatusHelper.f150751j = millis;
                                    z = true;
                                }
                            } else if (!z2) {
                                locationStatusHelper.f150751j = millis;
                            }
                            z2 = true;
                        } else if (!z) {
                            locationStatusHelper.f150750i = millis;
                        }
                        z = true;
                    }
                    if (z || z2) {
                        locationStatusHelper.mo70869e();
                    }
                    locationStatusHelper.mo70868c();
                }
                this.f114929p.mo62169a(location);
            }
        }
    }

    /* renamed from: d */
    public final void mo62159d() {
        mo62157c();
    }

    /* renamed from: b */
    public final void mo62155b(long j) {
        int i;
        FusionScheduler fusionScheduler = this.f114939z;
        bsct bsct = this.f114919d;
        boolean a = fusionScheduler.f150728j.mo34487a("gps");
        if (!fusionScheduler.f150719a.f115428u) {
            i = 0;
        } else {
            i = a ? 4 : 0;
        }
        bfvr bfvr = fusionScheduler.f150721c;
        if (bfvr.f115428u && bfvr.f115429v) {
            i |= 8;
        }
        bfut bfut = fusionScheduler.f150724f;
        if (bfut.f115428u && bfut.f115429v) {
            i |= 16;
        }
        boolean a2 = fusionScheduler.f150728j.mo34487a("network");
        if (fusionScheduler.f150722d.f115428u && a2) {
            i |= 35;
        } else if (fusionScheduler.f150723e.f115428u && a2) {
            i |= 2;
        }
        if (fusionScheduler.f150725g.f115428u && a && a2) {
            i |= 64;
        }
        bfvn bfvn = fusionScheduler.f150726h;
        if (bfvn.f115428u && bfvn.f115429v) {
            i |= 128;
        }
        int a3 = bsct.mo70205a(j, i);
        if (fusionScheduler.f150731m != a3) {
            fusionScheduler.f150731m = a3;
            fusionScheduler.mo70866a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62156b(List list) {
        if (this.f114918c && !list.isEmpty()) {
            if (m97564i()) {
                this.f114913C.addAll(list);
                if (list.size() > 1 || this.f114912B.mo70957c() <= 0 || this.f114913C.size() >= 50) {
                    this.f114912B.mo70956b();
                    mo62161f();
                    return;
                }
                return;
            }
            m97561d(list);
        }
    }

    /* renamed from: a */
    private final void m97558a(Location location, Location location2) {
        if (location != null) {
            Location location3 = new Location(location);
            location3.setProvider("fused");
            m97560b(this.f114930q.f114963a, location3);
            location = location3;
        }
        if (location2 != null) {
            Location location4 = new Location(location2);
            location4.setProvider("fused");
            m97560b(this.f114930q.mo62168a(), location4);
            location2 = location4;
        }
        bfqz bfqz = this.f114929p;
        bfqz.f114963a = location;
        bfqz.f114964b = location2;
        this.f114919d.mo70215c();
    }

    /* renamed from: a */
    private final void m97559a(List list, float f) {
        float f2;
        int size = list.size();
        if (size > 0) {
            f2 = f / ((float) size);
        } else {
            f2 = 0.0f;
        }
        Collections.sort(list, Collections.reverseOrder());
        int min = Math.min(5, size);
        float[] fArr = new float[min];
        for (int i = 0; i < min; i++) {
            fArr[i] = ((Float) list.get(i)).floatValue();
        }
        this.f114917b.mo62099a(26, new bfqr(this, new bscd(size, f2, fArr)));
    }

    /* renamed from: a */
    public final Location mo62149a(long j, long j2) {
        Location location;
        Location location2;
        String str;
        Integer num;
        Float f;
        WifiScan wifiScan;
        byte[] bArr;
        byte[] bArr2;
        bsfd bsfd;
        int i;
        long j3 = j2;
        bsbl a = this.f114919d.mo70206a();
        long b = this.f114919d.mo70214b();
        if (a == null || b <= this.f114933t) {
            return null;
        }
        this.f114933t = b;
        if (cevw.m138325j() && (bsfd = this.f114938y) != null) {
            bsbk bsbk = a.f143965a;
            bsbk bsbk2 = bsbk.GPS;
            int ordinal = bsbk.ordinal();
            if (ordinal == 0) {
                i = 101;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = ErrorInfo.TYPE_SDU_FAILED;
                    } else if (ordinal != 4) {
                        i = 106;
                    }
                }
                i = ErrorInfo.TYPE_SDU_MEMORY_FULL;
            } else {
                i = 102;
            }
            double d = (double) j3;
            Double.isNaN(d);
            double d2 = d * 1.0E-9d;
            double b2 = ayuo.m84847b(a.f143966b);
            double b3 = ayuo.m84847b(a.f143967c);
            double d3 = (double) a.f143968d;
            Double.isNaN(d3);
            bsfd.mo70482a(new bsfs(i, d2, b2, b3, d3 * 0.001d, null));
        }
        if (cevw.m138329n()) {
            location = bfqy.m97595a(a, "fused", j, j2);
        } else {
            location = bfqy.m97596a(a, "fused", this.f114936w, j, j2);
        }
        if (location != null) {
            this.f114932s = j3;
            m97560b(this.f114930q.f114963a, location);
            if (Math.abs(j3 - this.f114931r) <= 0 && (location2 = this.f114930q.f114963a) != null) {
                Bundle extras = location2.getExtras();
                if (extras != null) {
                    str = extras.getString("levelId");
                } else {
                    str = null;
                }
                Bundle extras2 = location2.getExtras();
                if (extras2 == null || !extras2.containsKey("levelNumberE3")) {
                    num = null;
                } else {
                    num = Integer.valueOf(extras2.getInt("levelNumberE3"));
                }
                Bundle extras3 = location2.getExtras();
                if (extras3 == null || !extras3.containsKey("verticalAccuracy")) {
                    f = null;
                } else {
                    f = Float.valueOf(extras3.getFloat("verticalAccuracy"));
                }
                String a2 = bxbh.m122519a(location2);
                if (!cfas.m138548b()) {
                    Bundle extras4 = location2.getExtras();
                    if (extras4 != null) {
                        bArr2 = extras4.getByteArray("wifiScan");
                    } else {
                        bArr2 = null;
                    }
                    wifiScan = bArr2 != null ? bxbj.m122535a(new bfnv(bArr2)) : null;
                } else {
                    Bundle extras5 = location2.getExtras();
                    if (extras5 != null) {
                        bArr = extras5.getByteArray("newWifiScan");
                    } else {
                        bArr = null;
                    }
                    wifiScan = bArr != null ? WifiScan.m66876a(bArr) : null;
                }
                location2.setExtras(null);
                if (str != null) {
                    aeim.m51894b(location2, str);
                }
                if (num != null) {
                    aeim.m51889a(location2, num);
                }
                if (f != null) {
                    aeim.m51885a(location2, f.floatValue());
                }
                if (wifiScan != null) {
                    aeim.m51888a(location2, wifiScan);
                }
                if ("wifi".equals(a2)) {
                    aeim.m51886a(location2, 3);
                } else if ("cell".equals(a2)) {
                    aeim.m51886a(location2, 2);
                } else {
                    aeim.m51886a(location2, 0);
                }
                WifiScan a3 = WifiScan.m66875a(location2);
                if (a3 != null) {
                    aeim.m51888a(location, a3);
                }
            }
        }
        return location;
    }

    /* renamed from: a */
    public final Location mo62068a(boolean z) {
        Location location;
        if (!z) {
            location = this.f114929p.f114963a;
        } else {
            location = this.f114929p.mo62168a();
        }
        if (location == null) {
            Log.w("GCoreFlp", "No location to return for getLastLocation()");
        }
        return location;
    }

    /* renamed from: a */
    public final void mo62058a() {
        if (!this.f114918c) {
            this.f114918c = true;
            bfpj bfpj = this.f114920e;
            bfpj.mo26010a(0, bfpj.f114790j.mo62094a("FusionEngine"));
            LocationStatusHelper locationStatusHelper = this.f114924k;
            if (locationStatusHelper.f150756o == null) {
                Log.wtf("GCoreFlp", new IllegalStateException("Called enable without already setting a listener"));
            }
            locationStatusHelper.f150743b = 0;
            locationStatusHelper.f150744c = 1;
            locationStatusHelper.f150745d = 1;
            locationStatusHelper.f150746e = 1;
            locationStatusHelper.f150747f = 1;
            locationStatusHelper.f150754m = true;
            locationStatusHelper.f150755n = true;
            bfsa bfsa = locationStatusHelper.f150757p;
            bfsa.f115095i = locationStatusHelper;
            bfsa.mo62202d();
            locationStatusHelper.f150758q.f45129a = locationStatusHelper;
            locationStatusHelper.f150758q.mo26072a();
            locationStatusHelper.f150753l = true;
            locationStatusHelper.mo70867b();
            FusionScheduler fusionScheduler = this.f114939z;
            if (!fusionScheduler.f150733o) {
                fusionScheduler.f150733o = true;
                fusionScheduler.f150734p = fusionScheduler.f150727i.mo26070b();
                fusionScheduler.f150729k.registerReceiver(fusionScheduler, new IntentFilter("com.google.android.location.internal.server.ACTION_RESTARTED"), null, fusionScheduler.f150730l);
                fusionScheduler.f150728j.mo34479a(fusionScheduler, fusionScheduler.f150730l.getLooper());
                fusionScheduler.f150727i.mo26069a(fusionScheduler);
                fusionScheduler.f150720b.mo62309b();
                fusionScheduler.mo70866a(false);
            }
            this.f114923j.mo62202d();
            this.f114911A.mo34482a(this, this.f114917b.mo63548a());
            mo62155b(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public final void mo62069a(Location location, int i) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unknown injection type: ");
            sb.append(i);
            Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
            return;
        }
        location.setProvider("gps_injected");
        mo62156b(Collections.singletonList(location));
    }

    /* renamed from: a */
    public final void mo61257a(bfkr bfkr) {
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        for (int i = 0; i < bfkr.mo61839a(); i++) {
            if (bfkr.mo61846f(i)) {
                f += bfkr.mo61843c(i);
                arrayList.add(Float.valueOf(bfkr.mo61843c(i)));
            }
        }
        m97559a(arrayList, f);
    }

    /* renamed from: a */
    public final void mo62070a(bfps bfps) {
        if (this.f114918c) {
            int i = Build.VERSION.SDK_INT;
            this.f114915E.f114797a.add(bfps);
            if (this.f114911A.mo34487a("network")) {
                bfsa bfsa = this.f114923j;
                bxbi bxbi = new bxbi("com.google.android.gms");
                bxbi.f161815a.putExtra("nlp.FLUSH_BATCH_INTENT", 0);
                if (bxbi.mo73549a(bfsa.f115093g) == null) {
                    Log.w("GCoreFlp", "Unable to bind to GMS NLP");
                }
                bfsa.f115099m = true;
                m97563h();
                return;
            }
            mo62157c();
        } else if (bfps != null) {
            bfps.mo62108a();
        }
    }

    /* renamed from: a */
    public final void mo62150a(ActivityRecognitionResult activityRecognitionResult) {
        bscs bscs;
        int a = activityRecognitionResult.mo43491a().mo43513a();
        if (a == 0) {
            bscs = bscs.IN_VEHICLE;
        } else if (a == 1) {
            bscs = bscs.ON_BICYCLE;
        } else if (a == 2) {
            bscs = bscs.ON_FOOT;
        } else if (a != 3) {
            bscs = bscs.UNKNOWN;
        } else {
            bscs = bscs.STILL;
        }
        long j = activityRecognitionResult.f79302c * 1000000;
        this.f114919d.mo70211a(j, bscs);
        mo62155b(j);
    }

    /* renamed from: a */
    public final void mo62151a(LocationAvailability locationAvailability) {
        bfrb bfrb;
        if (this.f114918c && (bfrb = this.f114927n) != null) {
            bfrb.mo62121a(locationAvailability);
            mo62155b(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public final void mo62072a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        bfqz bfqz = this.f114929p;
        Location location = bfqz.f114963a;
        Location a = bfqz.mo62168a();
        bfqz bfqz2 = this.f114930q;
        Location location2 = bfqz2.f114963a;
        Location location3 = this.f114928o;
        Location a2 = bfqz2.mo62168a();
        printWriter.println("--FusionEngine--");
        boolean z = this.f114918c;
        StringBuilder sb = new StringBuilder(16);
        sb.append("  enabled: ");
        sb.append(z);
        printWriter.println(sb.toString());
        if (this.f114918c) {
            FusionScheduler fusionScheduler = this.f114939z;
            printWriter.println("  controllers:");
            String valueOf = String.valueOf(fusionScheduler.f150719a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
            sb2.append("    ");
            sb2.append(valueOf);
            printWriter.println(sb2.toString());
            String valueOf2 = String.valueOf(fusionScheduler.f150720b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 4);
            sb3.append("    ");
            sb3.append(valueOf2);
            printWriter.println(sb3.toString());
            String valueOf3 = String.valueOf(fusionScheduler.f150721c);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 4);
            sb4.append("    ");
            sb4.append(valueOf3);
            printWriter.println(sb4.toString());
            String valueOf4 = String.valueOf(fusionScheduler.f150722d);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 4);
            sb5.append("    ");
            sb5.append(valueOf4);
            printWriter.println(sb5.toString());
            String valueOf5 = String.valueOf(fusionScheduler.f150723e);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 4);
            sb6.append("    ");
            sb6.append(valueOf5);
            printWriter.println(sb6.toString());
            String valueOf6 = String.valueOf(fusionScheduler.f150724f);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 4);
            sb7.append("    ");
            sb7.append(valueOf6);
            printWriter.println(sb7.toString());
            String valueOf7 = String.valueOf(fusionScheduler.f150725g);
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 4);
            sb8.append("    ");
            sb8.append(valueOf7);
            printWriter.println(sb8.toString());
            String valueOf8 = String.valueOf(fusionScheduler.f150726h);
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 4);
            sb9.append("    ");
            sb9.append(valueOf8);
            printWriter.println(sb9.toString());
        }
        printWriter.println("  last locations:");
        String valueOf9 = String.valueOf(location);
        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf9).length() + 11);
        sb10.append("    fused: ");
        sb10.append(valueOf9);
        printWriter.println(sb10.toString());
        String valueOf10 = String.valueOf(a);
        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf10).length() + 19);
        sb11.append("    fused(coarse): ");
        sb11.append(valueOf10);
        printWriter.println(sb11.toString());
        String valueOf11 = String.valueOf(location3);
        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf11).length() + 9);
        sb12.append("    gps: ");
        sb12.append(valueOf11);
        printWriter.println(sb12.toString());
        String valueOf12 = String.valueOf(location2);
        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf12).length() + 13);
        sb13.append("    network: ");
        sb13.append(valueOf12);
        printWriter.println(sb13.toString());
        String valueOf13 = String.valueOf(a2);
        StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf13).length() + 21);
        sb14.append("    network(coarse): ");
        sb14.append(valueOf13);
        printWriter.println(sb14.toString());
        if (cevw.f183465a.mo6606a().flpEnableSensorfusionLogs()) {
            printWriter.println("--SensorFusion--");
            if (this.f114925l != null) {
                str = "OrientationEngine";
            } else {
                str = "InertialAnchor";
            }
            printWriter.println(str.length() == 0 ? new String("FLP orientation source: ") : "FLP orientation source: ".concat(str));
            this.f114919d.mo70213a(SystemClock.elapsedRealtime() * 1000000, printWriter);
            if (cest.m138205k()) {
                printWriter.println();
                printWriter.println("### start BluePixel log ###");
                this.f114916F.mo62243a(printWriter);
                printWriter.println("### end BluePixel log ###");
                printWriter.println();
            }
        }
        if (cevw.m138325j() && this.f114938y != null) {
            printWriter.println("FusionEngine output positions. Contains PII.");
            this.f114938y.mo70481a(SystemClock.elapsedRealtime() * 1000000, printWriter);
        }
    }

    /* renamed from: a */
    public final void mo62152a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            GpsSatellite gpsSatellite = (GpsSatellite) it.next();
            if (gpsSatellite.usedInFix()) {
                f += gpsSatellite.getSnr();
                arrayList.add(Float.valueOf(gpsSatellite.getSnr()));
            }
        }
        m97559a(arrayList, f);
    }

    /* renamed from: a */
    public final void mo34473a(String str, boolean z) {
        if ("gps".equals(str)) {
            mo62155b(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
            if (!z) {
                m97562g();
            }
        } else if ("network".equals(str) && !z) {
            bfqz bfqz = this.f114930q;
            if (bfqz.f114963a != null) {
                bfqz.f114963a = null;
                bfqz.f114964b = null;
                m97558a(this.f114928o, (Location) null);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        long j;
        LocationStatusHelper locationStatusHelper = this.f114924k;
        locationStatusHelper.f150748g.mo62182a(bnjd.m109586b((Iterable) collection, bfrn.f115033a));
        locationStatusHelper.f150749h.mo62182a(bnjd.m109586b((Iterable) collection, bfrn.f115034b));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(locationStatusHelper.f150750i, locationStatusHelper.f150751j);
        if (!z) {
            j = max + locationStatusHelper.f150748g.f115038f;
        } else {
            j = elapsedRealtime;
        }
        if (j > elapsedRealtime) {
            locationStatusHelper.f150752k = false;
            locationStatusHelper.mo70868c();
        } else {
            locationStatusHelper.mo70867b();
        }
        FusionScheduler fusionScheduler = this.f114939z;
        fusionScheduler.f150732n = collection;
        fusionScheduler.mo70866a(z);
        mo62155b(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        int i = Build.VERSION.SDK_INT;
        this.f114921f.mo62182a(bnjd.m109586b((Iterable) collection, bfrn.f115033a));
        if (!m97564i()) {
            mo62161f();
        }
        m97563h();
        if (!cest.m138205k()) {
            return;
        }
        if (this.f114921f.f115040h <= 0) {
            this.f114916F.mo62247d(2);
        } else if (z) {
            this.f114916F.mo62246c(2);
        }
    }

    /* renamed from: a */
    public final void mo62153a(List list) {
        mo62156b(list);
    }
}
