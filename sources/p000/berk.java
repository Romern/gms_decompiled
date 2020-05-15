package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: berk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berk implements bgoy {

    /* renamed from: a */
    public final berb f112210a;

    /* renamed from: b */
    public final bews f112211b;

    /* renamed from: c */
    private final bext f112212c;

    /* renamed from: d */
    private final beui f112213d;

    /* renamed from: e */
    private final beua f112214e;

    /* renamed from: f */
    private final beth f112215f;

    /* renamed from: g */
    private final bgme f112216g;

    /* renamed from: h */
    private final bers f112217h;

    /* renamed from: i */
    private final bexv f112218i;

    /* renamed from: j */
    private final bgmh f112219j;

    /* renamed from: k */
    private final bexx f112220k;

    /* renamed from: l */
    private betg f112221l = null;

    /* renamed from: m */
    private final List f112222m = new ArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: bgoi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: bgnl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: bgnl} */
    /* JADX WARN: Type inference failed for: r3v10, types: [beua, beth, bers, bexx, bexv], assign insn: PHI: (r3v10 ?) = (r3v21 ?), (r3v27 ?) binds: [B:56:0x01e7, B:47:0x01c5] */
    /* JADX WARN: Type inference failed for: r3v21, assign insn: 0x01e7: CONST  (r3v21 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v27, assign insn: 0x01df: CONST  (r3v27 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Multi-variable type inference failed */
    public berk(bhck bhck, bgnp bgnp, boolean z, bgja bgja, bfmd bfmd, berg berg, bglx bglx, bgmx bgmx, bews bews) {
        bgnl bgnl;
        bgnb bgnb;
        bgnu bgnu;
        ? r3;
        boolean z2;
        bexn bexn;
        bext bext;
        bglx bglx2 = bglx;
        this.f112211b = bews;
        bgjp bgjp = (bgjp) bgnp;
        this.f112213d = new beui(bgjp.f116631l, bgja);
        if (!cerp.m138131c()) {
            bgnl = new bgnl();
        } else {
            bgjp bgjp2 = (bgjp) bgmx;
            bugp bugp = bgjp2.f116637r;
            Context context = bgjp2.f116620a;
            bgmk bgmk = bgjp2.f116625f;
            bgju bgju = bgjp2.f116630k;
            bugn a = bugp.mo62634a(context);
            if (a == null) {
                bgnl = new bgnl();
            } else {
                bgnl = new bgoi(a, bgju);
            }
        }
        if (z) {
            bgkx bgkx = bgkx.f116729g;
            bgjp bgjp3 = (bgjp) bgmx;
            bgju bgju2 = bgjp3.f116630k;
            bgmk bgmk2 = bgjp3.f116625f;
            bugp bugp2 = bgjp3.f116637r;
            Context context2 = bgjp3.f116620a;
            bfor bfor = bgjp3.f116621b;
            bgnb = new bgnb(bgju2, bugp2, context2);
        } else {
            bgnb = null;
        }
        bgkx bgkx2 = bgkx.f116729g;
        bgjp bgjp4 = (bgjp) bgmx;
        bugp bugp3 = bgjp4.f116637r;
        Context context3 = bgjp4.f116620a;
        bgju bgju3 = bgjp4.f116630k;
        bfor bfor2 = bgjp4.f116621b;
        bgmw a2 = bglo.m99248a(bugp3, context3, bgju3, bfor2);
        if (a2 == null) {
            try {
                a2 = new bgii(bgju3, bfor2);
            } catch (Exception e) {
                a2 = new bgnk();
            }
        }
        int f = a2.mo62862f();
        StringBuilder sb = new StringBuilder(39);
        sb.append("Hardware detector version = ");
        sb.append(f);
        sb.toString();
        if (cety.f183431a.mo6606a().enableChreArBluetoothFiltering()) {
            this.f112213d.mo61157a(new berh(a2));
        }
        if (cety.f183431a.mo6606a().enableChreArWifiFiltering()) {
            this.f112222m.add(new beri(a2));
        }
        bgly bgly = bgjp.f116631l;
        bgmk bgmk3 = bgjp.f116625f;
        bgml bgml = bgjp.f116634o;
        bfor bfor3 = bgjp.f116621b;
        bgmm bgmm = bgjp.f116626g;
        bgjr bgjr = bgjp.f116635p;
        bgjp bgjp5 = (bgjp) bglx2;
        bgju bgju4 = bgjp.f116630k;
        bgjr bgjr2 = bgjr;
        bgod bgod = new bgod(bgjp5.f116632m, 17, true, cese.m138166o(), bgjp5.f116630k, bgjp5.f116621b, bfos.SIGNIFICANT_MOTION, "HardSigMotion");
        if (bgjp.m99109q()) {
            bgnu = new bgod(bgjp5.f116632m, 26, false, cese.f183399a.mo6606a().wristTiltEnabled(), bgjp5.f116630k, bgjp5.f116621b, bfos.WRIST_TILT, "HardWristTilt");
        } else {
            bgnu = new bgnn();
        }
        bgjy cz = bglx.mo62771cz();
        beui beui = this.f112213d;
        bgjp bgjp6 = bgjp4;
        bgjp bgjp7 = bgjp;
        bgjp bgjp8 = bgjp5;
        berb berb = new berb(berg, bglx, bgly, bgja, bhck, bgmk3, bgml, bfor3, bgmm, bgjr2, bgju4, z, bgod, bgnu, cz, a2, bgnl, beui, bgnb);
        this.f112210a = berb;
        a2.mo62855a(berb);
        if (cese.m138165n()) {
            this.f112222m.add(this.f112210a);
        }
        if (cesh.m138172d()) {
            bgmk bgmk4 = bgjp7.f116625f;
            bfor bfor4 = bgjp7.f116621b;
            synchronized (bexn.f112953a) {
                if (bexn.f112954b == null) {
                    bexn.f112954b = new bexn(bgmk4, bfmd, bfor4);
                }
                bexn = bexn.f112954b;
            }
            bgmk bgmk5 = bgjp7.f116625f;
            bgiz bgiz = new bgiz(new bexr(), bgjp8.f116620a);
            berb berb2 = this.f112210a;
            synchronized (bext.f112974a) {
                if (bext.f112975b == null) {
                    bext.f112975b = new bext(bgmk5, berg, bgiz, berb2, bexn);
                }
                bext = bext.f112975b;
            }
            this.f112212c = bext;
            this.f112222m.add(bext);
            this.f112213d.mo61157a(bexn);
            this.f112210a.f112167aq.add(this.f112212c);
            a2.mo62855a(this.f112212c);
            r3 = 0;
        } else {
            r3 = 0;
            this.f112212c = null;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f112210a.f112187n);
            arrayList.add(new berj(this));
            beua beua = new beua(berg, bgjp7.f116625f, bgjp7.f116621b, bgjp7.f116630k, this.f112210a, arrayList);
            this.f112214e = beua;
            this.f112213d.mo61157a(beua);
            this.f112215f = this.f112210a.f112188o;
        } else {
            this.f112214e = r3;
            this.f112215f = r3;
        }
        bgjp bgjp9 = bgjp6;
        bgje a3 = bgje.m99049a(bgjp9.f116637r, bgjp9.f116620a);
        this.f112216g = a3;
        if (a3 != null) {
            bgmk bgmk6 = bgjp7.f116625f;
            this.f112217h = new bers(bglx, bgjp7.f116621b);
            bgmk bgmk7 = bgjp7.f116625f;
            this.f112218i = new bexv(berg);
            this.f112216g.mo62880a(this.f112217h);
            this.f112216g.mo62880a(this.f112218i);
            bgme bgme = this.f112216g;
            int i = Build.VERSION.SDK_INT;
            LocationManager locationManager = (LocationManager) bgjp7.f116620a.getSystemService("location");
            if (locationManager != null) {
                z2 = locationManager.isLocationEnabled();
            } else {
                z2 = true;
            }
            bexx bexx = new bexx(bgme, z2);
            this.f112220k = bexx;
            bexx.mo61244a();
        } else {
            this.f112217h = r3;
            this.f112218i = r3;
            this.f112220k = r3;
        }
        bgjh a4 = bgjh.m99068a(bgjp9.f116637r, bgjp9.f116620a, bgjp9.f116630k);
        this.f112219j = a4;
        if (a4 != null) {
            bgmk bgmk8 = bgjp7.f116625f;
            betg betg = new betg(bgjp7.f116621b, this.f112210a, this.f112215f);
            this.f112221l = betg;
            this.f112219j.mo62887a(betg);
            this.f112210a.f112122J = this.f112219j;
        }
    }

    /* renamed from: a */
    public final void mo61015a() {
    }

    /* renamed from: a */
    public final void mo61021a(bfct bfct) {
    }

    /* renamed from: a */
    public final void mo61023a(bfmn bfmn) {
    }

    /* renamed from: a */
    public final void mo61024a(bfmx bfmx, boolean z) {
        this.f112210a.f112159ai = bfmx.f114435a;
    }

    /* renamed from: a */
    public final void mo61026a(bgjm bgjm) {
    }

    /* renamed from: a */
    public final void mo61030a(bsax bsax) {
    }

    /* renamed from: a */
    public final void mo61033a(List list, bgbu bgbu) {
    }

    /* renamed from: a */
    public final void mo61035a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    public final void mo61037a(long[] jArr, long[] jArr2, bgca bgca) {
    }

    /* renamed from: a */
    public final void mo61038a(bfnx[] bfnxArr, boolean z) {
    }

    /* renamed from: b */
    public final void mo61039b() {
    }

    /* renamed from: b */
    public final void mo61040b(long j) {
    }

    /* renamed from: b */
    public final void mo61041b(bsax bsax) {
    }

    /* renamed from: c */
    public final void mo61043c() {
        this.f112210a.f112190q.mo61110w();
    }

    /* renamed from: d */
    public final void mo61045d() {
        this.f112210a.f112190q.mo61111x();
    }

    /* renamed from: e */
    public final void mo61047e() {
        this.f112210a.f112190q.mo61120y();
    }

    /* renamed from: e */
    public final void mo61048e(boolean z) {
    }

    /* renamed from: f */
    public final void mo61049f() {
        berb berb = this.f112210a;
        if (berb.f112114B.mo62860d()) {
            berb.f112114B.mo62863g();
        } else {
            berb.mo60963a(bfma.f114382b);
        }
    }

    /* renamed from: f */
    public final void mo61050f(boolean z) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bewq.a(boolean, int):void
     arg types: [int, int]
     candidates:
      bewq.a(java.lang.String, java.lang.String):btyc
      bewq.a(boolean, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: g */
    public final void mo61051g() {
        SharedPreferences sharedPreferences;
        bews bews = this.f112211b;
        if (bews != null && ceuz.m138278c() && ceuz.m138277b()) {
            bewu bewu = (bewu) bews;
            sex a = sex.m35104a(bewu.f112854a);
            if (a != null && (sharedPreferences = bewu.f112854a.getSharedPreferences("dndNotificationSharedPreference", 0)) != null) {
                boolean z = sharedPreferences.getBoolean("dndNotificationSent", false);
                if (!a.mo25455g()) {
                    if (!z) {
                        if (ceyg.m138421b()) {
                            bewq.m95998a(bewu.f112854a).mo61206a(false, 2);
                        }
                    } else if (ceyj.m138428b()) {
                        bewq.m95998a(bewu.f112854a).mo61203a(6);
                    }
                } else if (z) {
                    Context context = bewu.f112854a;
                    int i = Build.VERSION.SDK_INT;
                    String string = context.getString(C0126R.string.dnd_driving);
                    a.mo25438a(new AutomaticZenRule(string, new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(true)).appendPath(Integer.toString((int) ceyg.m138422c())).appendQueryParameter("provider", string).build(), (int) ceyg.m138422c(), true));
                    if (ceyj.m138428b()) {
                        bewq.m95998a(bewu.f112854a).mo61203a(5);
                    }
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
                    intent.setFlags(268468224);
                    intent.putExtra("ruleAdded", true);
                    bewu.f112854a.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo61052g(boolean z) {
    }

    /* renamed from: h */
    public final void mo61053h() {
        bexx bexx = this.f112220k;
        if (bexx != null) {
            bexx.mo61244a();
        }
    }

    /* renamed from: h */
    public final void mo61054h(boolean z) {
    }

    /* renamed from: i */
    public final void mo61055i() {
    }

    /* renamed from: m */
    public final void mo61056m(Object obj) {
    }

    /* renamed from: a */
    public final void mo61016a(int i) {
        beui beui = this.f112213d;
        if (i == 10) {
            synchronized (beui.f112485c) {
                for (beuh beuh : beui.f112486d.values()) {
                    if (beuh.f112478b) {
                        beui.mo61156a(beuh.f112479c, 5);
                    }
                }
                beui.mo61155a((bfmj) null);
            }
        }
    }

    /* renamed from: c */
    public final void mo61044c(boolean z) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("deepIdleModeChanged(");
        sb.append(z);
        sb.append(")");
        sb.toString();
        berb berb = this.f112210a;
        if (berb.f112189p && z && berb.f112136X.containsKey(9)) {
            berb.mo60972a(true);
            DetectedActivity detectedActivity = new DetectedActivity(9, 100);
            bgmk bgmk = berb.f112180g;
            long currentTimeMillis = System.currentTimeMillis();
            bgmk bgmk2 = berb.f112180g;
            berb.mo60967a(new ActivityRecognitionResult(detectedActivity, currentTimeMillis, SystemClock.elapsedRealtime(), bevp.WATCH_OFF_BODY_MANCHEGO.f112768am, (Bundle) null));
        }
        berb.f112190q.mo61100c(z);
    }

    /* renamed from: d */
    public final void mo61046d(boolean z) {
        bexx bexx = this.f112220k;
        if (bexx != null) {
            Locale.getDefault();
            new Object[1][0] = Boolean.valueOf(z);
            bexx.f112991b = z;
            bexx.mo61244a();
        }
    }

    /* renamed from: b */
    public final void mo61042b(boolean z) {
        berb berb = this.f112210a;
        berb.f112154ad = z;
        StringBuilder sb = new StringBuilder(28);
        sb.append("isAndroidPowerSaveMode=");
        sb.append(z);
        sb.toString();
        berb.mo60982b(false, false);
        berb.f112190q.mo61106A();
    }

    /* renamed from: a */
    public final void mo61017a(int i, int i2, boolean z) {
        bexa bexa;
        bgme bgme = this.f112216g;
        if (bgme != null) {
            ((bgje) bgme).mo62879a(i, i2, z);
        }
        berb berb = this.f112210a;
        if (berb != null) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("battery charging status changed to = ");
            sb.append(z);
            sb.toString();
            bexc bexc = berb.f112174ax;
            if (bexc != null && (bexa = bexc.f112881a) != null) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Plugged status changed to ");
                sb2.append(z);
                sb2.toString();
                bexa.f112873e = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo61018a(int i, bfmb bfmb, boolean z, boolean z2, bgmj bgmj, Map map) {
        boolean z3;
        Map map2;
        bgnb bgnb;
        boolean z4;
        bugn a;
        int i2;
        boolean z5;
        bugn a2;
        int i3 = i;
        bfmb bfmb2 = bfmb;
        boolean z6 = z;
        bgmj bgmj2 = bgmj;
        Locale locale = Locale.US;
        Object[] objArr = {Integer.valueOf(i), Long.valueOf(bfmb2.f114383a), Long.valueOf(bfmb2.f114385c), Boolean.valueOf(z), Boolean.valueOf(z2)};
        berb berb = this.f112210a;
        long j = bfmb2.f114383a;
        int i4 = berb.f112129Q;
        if (i3 > i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        berb.f112129Q = i3;
        berb.f112168ar = bfmb2.f114384b;
        String str = ((bgjp) berb.f112177d).f116636q;
        if (!berb.f112169as && str != null) {
            berb.f112169as = true;
            berb.f112174ax = berb.mo61006v();
            bexc bexc = berb.f112174ax;
            if (bexc != null) {
                besc besc = berb.f112123K;
                besc.f112269d.f112607a = bexc;
                bevd bevd = besc.f112270e;
                if (bevd != null) {
                    bevd.f112607a = bexc;
                }
            }
        }
        long j2 = bfmb2.f114385c;
        int i5 = berb.f112129Q;
        boolean z7 = berb.f112168ar;
        boolean z8 = berb.f112172av == null;
        StringBuilder sb = new StringBuilder(330);
        sb.append("setActivityDetectionExternalClientCount: count=");
        sb.append(i3);
        sb.append(", minPeriodMillis=");
        sb.append(j);
        sb.append(", maxReportLatencyMillis=");
        sb.append(j2);
        sb.append(", forceDetectionNow=");
        sb.append(z6);
        sb.append(", newClientAdded=");
        sb.append(z3);
        sb.append(", externalClientCountPrevious=");
        sb.append(i4);
        sb.append(", externalClientCount=");
        sb.append(i5);
        sb.append(", hasSensorDataReceiver=");
        sb.append(z7);
        sb.append(", hardwareOffBodyDetectorIsNull = ");
        sb.append(z8);
        sb.toString();
        berb.f112131S = j;
        berb.f112132T = bfmb2.f114385c;
        berr berr = berb.f112135W;
        bgns bgns = berb.f112184k;
        if (!bmxi.m108538a(bgmj2, berr.f112231a) || j != berr.f112234d) {
            berr.f112231a = bgmj2;
            berr.f112234d = j;
            berr.mo61064a(bgns);
        }
        int i6 = berb.f112129Q;
        if (i6 != 0 && i6 < i4) {
            berb.f112190q.mo61118t();
        }
        if (map == null) {
            map2 = new ConcurrentHashMap();
        } else {
            map2 = map;
        }
        berb.mo61001q();
        berb.f112136X = map2;
        if (berb.mo60976a(9)) {
            if (berb.f112189p) {
                bgnb bgnb2 = berb.f112172av;
                if (bgnb2 != null && !bgnb2.f116833a) {
                    bgnb2.f116839g = berb;
                    Context context = bgnb2.f116835c;
                    if (context == null || (a2 = bgnb2.f116836d.mo62634a(context)) == null) {
                        z5 = false;
                    } else {
                        synchronized (bgnb2.f116837e) {
                            if (!bgnb2.f116838f) {
                                a2.mo72631a(bgnb2.f116837e);
                                bgnb2.f116838f = true;
                            }
                        }
                        bgnb2.f116840h = a2.mo72627a(5147455389092024326L);
                        if (bgnb2.f116840h == null) {
                            String valueOf = String.valueOf(Long.toHexString(5147455389092024326L));
                            if (valueOf.length() == 0) {
                                new String("Unable to find OffBody NanoApp. id = ");
                            } else {
                                "Unable to find OffBody NanoApp. id = ".concat(valueOf);
                            }
                            z5 = false;
                        } else {
                            bxvd da = buft.f153736d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            buft buft = (buft) da.f164949b;
                            buft.f153739b = 1;
                            int i7 = buft.f153738a | 1;
                            buft.f153738a = i7;
                            buft.f153740c = 1;
                            buft.f153738a = 2 | i7;
                            z5 = bgnb2.mo63019a((buft) da.mo74062i());
                        }
                    }
                    bgnb2.f116833a = z5;
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("isEnabled() = ");
                    sb2.append(z5);
                    sb2.toString();
                    if (!bgnb2.f116833a) {
                        berb.f112172av = null;
                    }
                }
            } else {
                if (berb.f112124L == null) {
                    try {
                        berb.f112124L = new bevg(berb.f112182i.mo62781a(beve.PHONE_POSITION), berb.f112182i.mo62781a(beve.PHONE_POSITION_IN_VEHICLE));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (berb.f112137Y == null) {
                    berb.f112137Y = new besy();
                }
            }
        } else if (berb.f112189p && (bgnb = berb.f112172av) != null && bgnb.f116833a) {
            Context context2 = bgnb.f116835c;
            if (context2 == null || (a = bgnb.f116836d.mo62634a(context2)) == null) {
                z4 = false;
            } else {
                bxvd da2 = buft.f153736d.mo74144da();
                if (!da2.f164950c) {
                    i2 = 0;
                } else {
                    da2.mo74035c();
                    i2 = 0;
                    da2.f164950c = false;
                }
                buft buft2 = (buft) da2.f164949b;
                buft2.f153739b = i2;
                buft2.f153738a |= 1;
                if (bgnb.mo63019a((buft) da2.mo74062i())) {
                    synchronized (bgnb.f116837e) {
                        a.mo72636b(bgnb.f116837e);
                        bgnb.f116838f = false;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            boolean z9 = true ^ z4;
            bgnb.f116833a = z9;
            StringBuilder sb3 = new StringBuilder(19);
            sb3.append("isEnabled() = ");
            sb3.append(z9);
            sb3.toString();
        }
        berb.mo60982b(z3, z6);
        beua beua = this.f112214e;
        if (beua != null) {
            beua.f112452e.mo61143a(z2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berg.a(bfnn, boolean):void
     arg types: [bfnn, int]
     candidates:
      berg.a(java.util.List, int):void
      berg.a(bfnn, boolean):void */
    /* renamed from: a */
    public final void mo61019a(int i, Object obj, bgmj bgmj) {
        long j;
        if (i == 2) {
            berb berb = this.f112210a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (berb.f112115C.mo63014b()) {
                if (booleanValue != berb.f112120H) {
                    if (!booleanValue) {
                        if (berb.f112115C.mo63015c()) {
                            berb.f112115C.mo63018e();
                            berb.f112115C.mo63017d();
                            berb.f112115C.mo63013b(berb);
                        }
                    } else if (!berb.f112115C.mo63015c()) {
                        berb.f112115C.mo63012a(berb);
                        berb.f112115C.mo63016c((int) cerp.f183389a.mo6606a().hardwareFloorChangeReportLatencyMillis());
                    }
                }
            } else if (!berb.f112189p) {
                berr berr = berb.f112135W;
                bgns bgns = berb.f112184k;
                if (!booleanValue) {
                    j = Long.MAX_VALUE;
                } else {
                    j = 60000;
                }
                if (!bmxi.m108538a(bgmj, berr.f112232b) || j != berr.f112235e) {
                    berr.f112232b = bgmj;
                    berr.f112235e = j;
                    berr.mo61064a(bgns);
                }
            } else {
                return;
            }
            berb.f112120H = booleanValue;
            StringBuilder sb = new StringBuilder(47);
            sb.append("setFloorChangeDetectionRequest: hasClient=");
            sb.append(booleanValue);
            sb.toString();
        } else if (i == 3) {
            berb berb2 = this.f112210a;
            boolean z = obj != null;
            berb2.f112121I = z;
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("setSleepSegmentDetectionRequest: hasClient=");
            sb2.append(z);
            sb2.toString();
            if (z) {
                berb2.f112190q.mo61094a(false);
                if (berb2.f112188o != null && cfam.f183546a.mo6606a().sendSleepSegmentUponRegister()) {
                    berb2.f112178e.mo61009a(new bfnn(berb2.f112188o.mo61125a(), null), false);
                }
            }
            bgmh bgmh = berb2.f112122J;
            if (bgmh != null) {
                ((bgjh) bgmh).f116597b = z;
                bgmh.mo62890c();
            }
        } else if (i != 4) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb3.append("Dropping unknown request type: ");
            sb3.append(valueOf);
            sb3.toString();
        } else {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            String valueOf2 = String.valueOf(activityTransitionRequest);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb4.append("requesting activity transitions: ");
            sb4.append(valueOf2);
            sb4.toString();
            if (cets.m138236b() && (activityTransitionRequest = bexw.m96073a(this.f112220k, this.f112218i, activityTransitionRequest)) == null) {
                return;
            }
            if (this.f112212c != null) {
                String valueOf3 = String.valueOf(activityTransitionRequest);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                sb5.append("request sent to transition provider: ");
                sb5.append(valueOf3);
                sb5.toString();
                this.f112212c.mo61241a(activityTransitionRequest);
                return;
            }
            String valueOf4 = String.valueOf(obj);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 50);
            sb6.append("Activity transition feature is disabled, dropping ");
            sb6.append(valueOf4);
            sb6.toString();
        }
    }

    /* renamed from: a */
    public final void mo61020a(long j) {
        beth beth = this.f112215f;
        if (beth != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = beth.f112383b;
            if (j2 > 0 && j2 <= currentTimeMillis) {
                beth.f112384c = j2;
            }
            beth.f112383b = j;
            long j3 = beth.f112384c;
            StringBuilder sb = new StringBuilder(102);
            sb.append("lastAlarmClockTriggerMillis: ");
            sb.append(j3);
            sb.append("; nextScheduledAlarmClockMillis: ");
            sb.append(j);
            sb.toString();
        }
    }

    /* renamed from: a */
    public final void mo61022a(bfkk bfkk) {
        bfkk bfkk2;
        besh besh = this.f112210a.f112119G;
        Object[] objArr = {Boolean.valueOf(bfkk.f114302c), Integer.valueOf(bfkk.f114303d), Boolean.valueOf(bfkk.f114301b)};
        if (!bfkk.f114302c && (bfkk2 = besh.f112281c) != null && bfkk2.f114302c && bfkk.f114304e - bfkk2.f114304e >= 300000) {
            int[] iArr = besh.f112279a[0];
            int i = bfkk2.f114303d;
            iArr[i] = iArr[i] + 1;
            if (!besh.f112282d.isEmpty()) {
                int[] iArr2 = besh.f112279a[2];
                int i2 = besh.f112281c.f114303d;
                iArr2[i2] = iArr2[i2] + 1;
            }
            if (!besh.f112283e.isEmpty()) {
                int[] iArr3 = besh.f112279a[1];
                int i3 = besh.f112281c.f114303d;
                iArr3[i3] = iArr3[i3] + 1;
            }
        }
        besh.f112282d.clear();
        besh.f112283e.clear();
        besh.f112281c = bfkk;
        if (bfkk.f114302c) {
            bfmt bfmt = besh.f112284f;
            HashMap hashMap = new HashMap();
            synchronized (((beui) bfmt).f112485c) {
                hashMap.putAll(((beui) bfmt).f112486d);
            }
            for (Long l : hashMap.keySet()) {
                if (((beuh) hashMap.get(l)).f112478b) {
                    if (((beuh) hashMap.get(l)).mo61151a()) {
                        besh.f112282d.add(l);
                    }
                    if (((beuh) hashMap.get(l)).mo61152b()) {
                        besh.f112283e.add(l);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61025a(bfnp bfnp) {
        berb berb = this.f112210a;
        if (bfnp != null) {
            berb.f112190q.mo61098a(berb.f112196w, bfnp);
            berb.f112196w = bfnp;
            bgmk bgmk = berb.f112180g;
            berb.f112197x = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo61027a(bgma bgma, int i) {
        beui beui = this.f112213d;
        synchronized (beui.f112485c) {
            beui.mo61156a(bgma, i);
            beui.mo61155a((bfmj) bgma);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
    /* renamed from: a */
    public final void mo61028a(bgnq bgnq) {
        int i;
        HashMap hashMap;
        String str;
        String str2;
        float f;
        String str3;
        int i2;
        Sensor defaultSensor;
        Sensor defaultSensor2;
        Sensor defaultSensor3;
        Sensor defaultSensor4;
        int i3;
        beua beua;
        bgnq bgnq2 = bgnq;
        Locale locale = Locale.US;
        char c = 1;
        new Object[1][0] = bgnq.name();
        bgnq bgnq3 = bgnq.LOCATOR;
        if (!(bgnq.ordinal() != 11 || (beua = this.f112214e) == null || beua.f112453f == -1)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = beua.f112453f;
            if (elapsedRealtime + 4000 < j) {
                beua.f112453f = -1;
                beua.mo61145a(j);
            } else {
                beua.f112453f = -1;
                beua.f112452e.mo61142d();
            }
        }
        bgme bgme = this.f112216g;
        if (bgme != null) {
            bgme.mo62885e();
        }
        berb berb = this.f112210a;
        Locale locale2 = Locale.US;
        new Object[1][0] = bgnq2.f116891v;
        berb.mo61001q();
        bgmk bgmk = berb.f112180g;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        double d = (double) (elapsedRealtime2 - berb.f112152ab);
        Double.isNaN(d);
        long a = bhct.m100647a(d / 8.64E7d);
        berb.f112152ab = elapsedRealtime2;
        if (a == 0) {
            i = 4;
        } else {
            for (int i4 = 0; i4 < berb.f112108a.length; i4++) {
                bfgt bfgt = berb.f112108a[i4];
                String concat = String.valueOf(berb.f112111b[i4]).concat("_batching_availability");
                int c2 = berb.f112183j.mo62799c(bfgt);
                bgnr bgnr = berb.f112183j;
                Integer num = (Integer) RealCollectorConfig.f150689a.get(bfgt);
                if (num != null) {
                    bgkx bgkx = bgkx.f116729g;
                    Sensor defaultSensor5 = ((bgjr) bgnr).f116648d.getDefaultSensor(num.intValue());
                    if (defaultSensor5 != null) {
                        i3 = defaultSensor5.getFifoReservedEventCount();
                        if (c2 != 0) {
                            berb.f112179f.mo62998a("ar", concat, "batching_not_supported", 1);
                        } else if ((!bfgt.equals(bfgt.f113814d) || !berb.f112191r.f112367a) && (!bfgt.equals(bfgt.f113819i) || !berb.f112192s.f112367a)) {
                            berb.f112179f.mo62998a("ar", concat, "batching_supported_but_disabled_fifo_max", (long) c2);
                            berb.f112179f.mo62998a("ar", concat, "batching_supported_but_disabled_fifo_reserved", (long) i3);
                            berb.f112179f.mo62998a("ar", concat, "batching_supported_but_disabled_count", 1);
                        } else {
                            berb.f112179f.mo62998a("ar", concat, "batching_enabled_fifo_max", (long) c2);
                            berb.f112179f.mo62998a("ar", concat, "batching_enabled_fifo_reserved", (long) i3);
                            berb.f112179f.mo62998a("ar", concat, "batching_enabled_count", 1);
                        }
                    }
                }
                i3 = 0;
                if (c2 != 0) {
                }
            }
            bgnr bgnr2 = berb.f112183j;
            Integer num2 = (Integer) RealCollectorConfig.f150689a.get(bfgt.f113814d);
            float f2 = 0.0f;
            if (num2 == null || (defaultSensor4 = ((bgjr) bgnr2).f116648d.getDefaultSensor(num2.intValue())) == null) {
                f = 0.0f;
            } else {
                f = defaultSensor4.getMaximumRange();
            }
            float f3 = f / 9.80665f;
            int round = Math.round(f3 + f3);
            bgnr bgnr3 = berb.f112183j;
            Integer num3 = (Integer) RealCollectorConfig.f150689a.get(bfgt.f113814d);
            if (!(num3 == null || (defaultSensor3 = ((bgjr) bgnr3).f116648d.getDefaultSensor(num3.intValue())) == null)) {
                f2 = defaultSensor3.getResolution();
            }
            int round2 = Math.round((f2 / 9.80665f) * 10.0f);
            bgly bgly = berb.f112179f;
            Locale locale3 = Locale.US;
            Object[] objArr = new Object[5];
            bgnr bgnr4 = berb.f112183j;
            Integer num4 = (Integer) RealCollectorConfig.f150689a.get(bfgt.f113814d);
            if (num4 == null || (defaultSensor2 = ((bgjr) bgnr4).f116648d.getDefaultSensor(num4.intValue())) == null) {
                str3 = null;
            } else {
                str3 = defaultSensor2.getName();
            }
            objArr[0] = str3;
            bgnr bgnr5 = berb.f112183j;
            Integer num5 = (Integer) RealCollectorConfig.f150689a.get(bfgt.f113814d);
            if (num5 == null || (defaultSensor = ((bgjr) bgnr5).f116648d.getDefaultSensor(num5.intValue())) == null) {
                i2 = 0;
            } else {
                i2 = defaultSensor.getVersion();
            }
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Float.valueOf(((float) round) / 2.0f);
            objArr[3] = Float.valueOf(((float) round2) / 10.0f);
            i = 4;
            objArr[4] = cese.m138167p();
            bgly.mo62998a("ar", "accel_config_info", String.format(locale3, "Name: %s, Version: %d, Max Range: %.1f G, Resolution: %.1f G, Domain: %s", objArr), 1);
            if (berb.f112114B.mo62858b()) {
                berb.f112179f.mo62998a("ar", "hw_availability", "support all activities", a);
            } else {
                berb.f112179f.mo62998a("ar", "hw_availability", "not support all activities", a);
            }
            bgly bgly2 = berb.f112179f;
            beye.m96084a(elapsedRealtime2);
        }
        bgmk bgmk2 = berb.f112180g;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        long j2 = berb.f112153ac;
        berb.f112153ac = elapsedRealtime3;
        double d2 = (double) (elapsedRealtime3 - j2);
        Double.isNaN(d2);
        if (bhct.m100647a(d2 / 8.64E7d) != 0) {
            Map r = berb.mo61002r();
            bgly bgly3 = berb.f112179f;
            if (r == null || berb.f112173aw == null) {
                str2 = String.format(Locale.US, "(Tala)Bluetooth not available, Domain: %s", cese.m138167p());
            } else if (((Integer) r.get("total")).intValue() != 0 || berb.f112173aw.f116582a.isEnabled()) {
                Locale locale4 = Locale.US;
                Object[] objArr2 = new Object[i];
                objArr2[0] = r.get("car");
                objArr2[1] = r.get("possible");
                objArr2[2] = r.get("total");
                objArr2[3] = cese.m138167p();
                str2 = String.format(locale4, "(Tala)Car: %d, Possibly Car: %d, Total: %d, Domain: %s", objArr2);
            } else {
                str2 = String.format(Locale.US, "(Tala)Bluetooth disabled, Domain: %s", cese.m138167p());
            }
            bgly3.mo62998a("ar", "bluetooth_paired_metrics", str2, 1);
            berb.f112179f.mo62998a("ar", "user_count", String.format(Locale.US, "Domain: %s", cese.m138167p()), 1);
            bgly bgly4 = berb.f112179f;
            beye.m96084a(elapsedRealtime3);
        }
        if (cese.f183399a.mo6606a().enableGmmBluetoothMetrics() && cese.m138161j()) {
            bgmk bgmk3 = berb.f112180g;
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            besh besh = berb.f112119G;
            long j3 = elapsedRealtime4 - besh.f112280b;
            if (j3 >= 86400000) {
                if (j3 <= 100800000) {
                    Map r2 = berb.mo61002r();
                    int[][] iArr = berb.f112119G.f112279a;
                    if (r2 != null) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : r2.entrySet()) {
                            String str4 = (String) entry.getKey();
                            hashMap.put(str4, String.format(Locale.US, "%s%s Gmm driving total: %d, possible btcar: %d, btcar: %d, Domain: %s", ((Integer) entry.getValue()).intValue() <= 0 ? "not " : "", str4, Integer.valueOf(iArr[0][1]), Integer.valueOf(iArr[1][1]), Integer.valueOf(iArr[2][1]), cese.m138167p()));
                        }
                    } else {
                        hashMap = null;
                    }
                    String[][] strArr = berb.f112112c;
                    int length = strArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        String[] strArr2 = strArr[i5];
                        String str5 = strArr2[0];
                        String str6 = strArr2[c];
                        if (hashMap == null) {
                            berb.f112179f.mo62998a("ar", str6, "(Tala)Bluetooth not available", 1);
                        } else {
                            bgly bgly5 = berb.f112179f;
                            String valueOf = String.valueOf((String) hashMap.get(str5));
                            bgly5.mo62998a("ar", str6, valueOf.length() == 0 ? new String("(Tala)") : "(Tala)".concat(valueOf), 1);
                        }
                        i5++;
                        c = 1;
                    }
                    bgly bgly6 = berb.f112179f;
                    Locale locale5 = Locale.US;
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = Integer.valueOf(berb.f112118F.f112474c);
                    objArr3[c] = Integer.valueOf(berb.f112118F.f112476e);
                    objArr3[2] = Integer.valueOf(berb.f112118F.f112475d);
                    if (r2 != null) {
                        str = Integer.toString(((Integer) r2.get("car")).intValue());
                    } else {
                        str = "Bluetooth not available";
                    }
                    objArr3[3] = str;
                    objArr3[4] = cese.m138167p();
                    bgly6.mo62998a("ar", "personal_vehicle_detection_count", String.format(locale5, "Personal Veh Detects: %d, Veh Detects: %d, New Veh Detects:%s, #Paired Car BT: %s, Domain: %s", objArr3), 1);
                    bgly bgly7 = berb.f112179f;
                    beye.m96084a(elapsedRealtime4);
                    berb.f112119G.mo61096a();
                    berb.f112118F.mo61149a();
                } else {
                    besh.mo61096a();
                    berb.f112118F.mo61149a();
                }
            }
        }
        if (berb.mo60989e() && cfam.f183546a.mo6606a().sleepAlarmRingBugFix() && berb.mo60990f()) {
            String valueOf2 = String.valueOf(berb.f112190q.mo61093p());
            if (valueOf2.length() == 0) {
                new String("Ringing Sleep Alarm in state: ");
            } else {
                "Ringing Sleep Alarm in state: ".concat(valueOf2);
            }
            if (berb.f112114B.mo62860d()) {
                berb.f112114B.mo62863g();
            }
            berb.f112193t = null;
            berb.f112190q.mo61092D();
        }
        if (berb.f112193t != null) {
            bgmk bgmk4 = berb.f112180g;
            if (SystemClock.elapsedRealtime() + 4000 >= berb.f112193t.f114394a) {
                if (bgnq2 == bgnq.ACTIVITY_DETECTION) {
                    berb.f112193t = null;
                } else {
                    berb.mo60998n();
                }
                if (berb.f112114B.mo62860d()) {
                    berb.f112114B.mo62863g();
                }
                bgnb bgnb = berb.f112172av;
                if (bgnb != null && bgnb.f116833a) {
                    berb.mo61007w();
                }
                if (berb.f112115C.mo63015c()) {
                    berb.f112115C.mo63018e();
                }
                String valueOf3 = String.valueOf(berb.f112190q.mo61093p());
                if (valueOf3.length() == 0) {
                    new String("Alarm rings. State: ");
                } else {
                    "Alarm rings. State: ".concat(valueOf3);
                }
                berb.f112190q.mo61092D();
            } else if (bgnq2 == bgnq.ACTIVITY_DETECTION) {
                bfmg bfmg = berb.f112193t;
                berb.f112193t = null;
                berb.mo60964a(bfmg);
            }
        }
    }

    /* renamed from: a */
    public final void mo61029a(bgnq bgnq, bfmg bfmg) {
        berb berb = this.f112210a;
        if (bgnq == bgnq.LOCATOR) {
            berb.f112160aj = bfmg;
        }
        berb.f112190q.mo61116a(bgnq);
    }

    /* renamed from: a */
    public final void mo61031a(ActivityRecognitionResult activityRecognitionResult) {
        beua beua = this.f112214e;
        if (!(beua == null || activityRecognitionResult.mo43491a().mo43513a() == 6)) {
            beua.f112452e.mo61139a(activityRecognitionResult);
        }
        if (this.f112215f != null && this.f112210a.mo60988d()) {
            beth beth = this.f112215f;
            DetectedActivity a = activityRecognitionResult.mo43491a();
            for (int i : DetectedActivity.f79318c) {
                if (a.mo43513a() == i) {
                    beth.mo61128a(activityRecognitionResult.f79301b);
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("High-confidence awake detected from AR result ");
                    sb.append(valueOf);
                    sb.toString();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61032a(PrintWriter printWriter) {
        boolean z;
        boolean z2;
        String str;
        PrintWriter printWriter2 = printWriter;
        berb berb = this.f112210a;
        printWriter2.println("####ActivityDetectionScheduler Start");
        boolean a = berb.f112183j.mo62795a();
        StringBuilder sb = new StringBuilder(27);
        sb.append("os.hasAccelerometer()=");
        sb.append(a);
        printWriter2.println(sb.toString());
        boolean a2 = berb.f112199z.mo63024a();
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("significantMotionDetector.isSupported()=");
        sb2.append(a2);
        printWriter2.println(sb2.toString());
        boolean b = berb.f112199z.mo63026b();
        StringBuilder sb3 = new StringBuilder(43);
        sb3.append("significantMotionDetector.isEnabled()=");
        sb3.append(b);
        printWriter2.println(sb3.toString());
        boolean a3 = berb.f112113A.mo63024a();
        StringBuilder sb4 = new StringBuilder(35);
        sb4.append("wristTiltSensor.isSupported()=");
        sb4.append(a3);
        printWriter2.println(sb4.toString());
        boolean b2 = berb.f112113A.mo63026b();
        StringBuilder sb5 = new StringBuilder(33);
        sb5.append("wristTiltSensor.isEnabled()=");
        sb5.append(b2);
        printWriter2.println(sb5.toString());
        boolean b3 = berb.f112176az.mo62933b();
        StringBuilder sb6 = new StringBuilder(38);
        sb6.append("wakeUpTiltDetector.isSupported()=");
        sb6.append(b3);
        printWriter2.println(sb6.toString());
        boolean b4 = berb.f112183j.mo62798b(bfgt.f113814d);
        StringBuilder sb7 = new StringBuilder(49);
        sb7.append("os.isSensorBatchingSupported(ACCELEROMETER)=");
        sb7.append(b4);
        printWriter2.println(sb7.toString());
        boolean b5 = berb.f112183j.mo62798b(bfgt.f113819i);
        StringBuilder sb8 = new StringBuilder(45);
        sb8.append("os.isSensorBatchingSupported(BAROMETER)=");
        sb8.append(b5);
        printWriter2.println(sb8.toString());
        int c = berb.f112183j.mo62799c(bfgt.f113814d);
        StringBuilder sb9 = new StringBuilder(58);
        sb9.append("os.getSensorBatchingFifoMaxSize(ACCELEROMETER)=");
        sb9.append(c);
        printWriter2.println(sb9.toString());
        int c2 = berb.f112183j.mo62799c(bfgt.f113819i);
        StringBuilder sb10 = new StringBuilder(54);
        sb10.append("os.getSensorBatchingFifoMaxSize(BAROMETER)=");
        sb10.append(c2);
        printWriter2.println(sb10.toString());
        boolean z3 = berb.f112191r.f112367a;
        StringBuilder sb11 = new StringBuilder(38);
        sb11.append("accelBatchingManager.isEnabled()=");
        sb11.append(z3);
        printWriter2.println(sb11.toString());
        boolean z4 = berb.f112192s.f112367a;
        StringBuilder sb12 = new StringBuilder(37);
        sb12.append("baroBatchingManager.isEnabled()=");
        sb12.append(z4);
        printWriter2.println(sb12.toString());
        boolean b6 = berb.f112114B.mo62858b();
        StringBuilder sb13 = new StringBuilder(52);
        sb13.append("hardwareArDetector.areAllActivitiesSupported()=");
        sb13.append(b6);
        printWriter2.println(sb13.toString());
        boolean d = berb.f112114B.mo62860d();
        StringBuilder sb14 = new StringBuilder(36);
        sb14.append("hardwareArDetector.isEnabled()=");
        sb14.append(d);
        printWriter2.println(sb14.toString());
        boolean b7 = berb.f112115C.mo63014b();
        StringBuilder sb15 = new StringBuilder(46);
        sb15.append("hardwareFloorChangeService.isSupported()=");
        sb15.append(b7);
        printWriter2.println(sb15.toString());
        boolean c3 = berb.f112115C.mo63015c();
        StringBuilder sb16 = new StringBuilder(44);
        sb16.append("hardwareFloorChangeService.isEnabled()=");
        sb16.append(c3);
        printWriter2.println(sb16.toString());
        String valueOf = String.valueOf(berb.f112190q.mo61093p());
        printWriter2.println(valueOf.length() == 0 ? new String("Current state: ") : "Current state: ".concat(valueOf));
        for (String str2 : berb.f112117E.keySet()) {
            printWriter2.printf("Entered %s %d times.\n", str2, berb.f112117E.get(str2));
        }
        beth beth = berb.f112188o;
        if (beth != null) {
            List a4 = beth.mo61125a();
            long cw = berb.f112177d.mo62768cw();
            StringBuilder sb17 = new StringBuilder(49);
            sb17.append("Previous sleep segment time: ");
            sb17.append(cw);
            printWriter2.println(sb17.toString());
            bevo cy = berb.f112177d.mo62770cy();
            if (cy != null) {
                String valueOf2 = String.valueOf(cy);
                StringBuilder sb18 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb18.append("User sleep window: ");
                sb18.append(valueOf2);
                printWriter2.println(sb18.toString());
            }
            if (!a4.isEmpty()) {
                long j = ((SleepSegmentEvent) a4.get(0)).f79390a;
                long j2 = ((SleepSegmentEvent) a4.get(0)).f79391b;
                StringBuilder sb19 = new StringBuilder(43);
                sb19.append(j);
                sb19.append(" - ");
                sb19.append(j2);
                str = sb19.toString();
            } else {
                str = "none";
            }
            String valueOf3 = String.valueOf(str);
            printWriter2.println(valueOf3.length() == 0 ? new String("Previous sleep: ") : "Previous sleep: ".concat(valueOf3));
        }
        printWriter2.println("####ActivityDetectionScheduler End");
        beua beua = this.f112214e;
        if (beua != null) {
            printWriter2.println("####VehicleExitDetectorStats Start");
            bety bety = beua.f112451d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String b8 = bety.f112446d.f112452e.mo61140b();
            StringBuilder sb20 = new StringBuilder(String.valueOf(b8).length() + 16);
            sb20.append("Current state: ");
            sb20.append(b8);
            sb20.append("\n");
            printWriter2.print(sb20.toString());
            for (Map.Entry entry : bety.f112443a.entrySet()) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append((String) entry.getKey());
                betw betw = (betw) entry.getValue();
                long j3 = betw.f112441a / 1000;
                int i = betw.f112442b;
                if (((String) entry.getKey()).equals(bety.f112444b)) {
                    j3 += (elapsedRealtime - bety.f112445c) / 1000;
                    i++;
                }
                sb21.append(" TimeInState: ");
                sb21.append(j3);
                sb21.append("sec StateEnteredCount: ");
                sb21.append(i);
                sb21.append(" Avg: ");
                sb21.append(j3 / ((long) i));
                sb21.append("sec/entry\n");
                printWriter2.print(sb21.toString());
            }
            printWriter2.println("####VehicleExitDetectorStats End");
        }
        bgme bgme = this.f112216g;
        if (bgme != null) {
            z = bgme.mo62881b();
        } else {
            z = false;
        }
        StringBuilder sb22 = new StringBuilder(17);
        sb22.append("ccAvailable=");
        sb22.append(z);
        printWriter2.println(sb22.toString());
        bgmh bgmh = this.f112219j;
        if (bgmh == null || !bgmh.mo62889b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sb23 = new StringBuilder(27);
        sb23.append("sleep chre available: ");
        sb23.append(z2);
        printWriter2.println(sb23.toString());
    }

    /* renamed from: a */
    public final void mo61034a(boolean z) {
        berb berb = this.f112210a;
        berb.f112155ae = z;
        StringBuilder sb = new StringBuilder(16);
        sb.append("isScreenOn=");
        sb.append(z);
        sb.toString();
        berb.mo60982b(false, false);
        berb.f112190q.mo61109u();
    }

    /* renamed from: a */
    public final void mo61036a(boolean z, boolean z2, int i) {
        StringBuilder sb = new StringBuilder(108);
        sb.append("ActivityProvider: Data network changed stats. onWifi = ");
        sb.append(z);
        sb.append(", onCellular =");
        sb.append(z2);
        sb.append(", wifiNetworkId = ");
        sb.append(i);
        sb.toString();
        List list = this.f112222m;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((beud) list.get(i2)).mo60986c(z);
        }
    }
}
