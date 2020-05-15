package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bery */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bery extends beti implements bequ {

    /* renamed from: k */
    private static final Map f112254k;

    /* renamed from: a */
    protected final Map f112255a = new HashMap();

    /* renamed from: b */
    protected boolean f112256b = false;

    /* renamed from: c */
    protected final Map f112257c = new HashMap();

    /* renamed from: l */
    private long f112258l = -1;

    /* renamed from: m */
    private long f112259m = -1;

    /* renamed from: n */
    private boolean f112260n;

    static {
        HashMap hashMap = new HashMap();
        f112254k = hashMap;
        hashMap.put(bfgt.f113814d, 10000);
        f112254k.put(bfgt.f113819i, 5000);
        f112254k.put(bfgt.f113821k, 5000);
    }

    public bery(berb berb, boolean z) {
        super(berb);
        this.f112260n = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract beqw mo61074a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61078a(long j) {
        throw null;
    }

    /* renamed from: a */
    public void mo60948a(List list) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo61077c() {
        return 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract beqp mo61079d();

    /* renamed from: d */
    public void mo60951d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.f112256b) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo61080e() {
        if (mo61079d() != null) {
            return mo61079d().f112059a;
        }
        return 3200000000L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo61082f();

    /* renamed from: g */
    public final void mo61083g() {
        super.mo61083g();
        this.f112396d.mo60991g();
        beqp d = mo61079d();
        if (d != null) {
            d.mo60939a();
        }
        mo61086j();
    }

    /* renamed from: h */
    public void mo61084h() {
        super.mo61084h();
        if (this.f112396d.f112168ar && !this.f112257c.isEmpty()) {
            long j = this.f112258l;
            if (j != -1) {
                long j2 = this.f112259m;
                Map map = this.f112257c;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new DetectedActivity(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue()));
                }
                Collections.sort(arrayList, DetectedActivity.f79316a);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(arrayList, j, j2);
                berg berg = this.f112398f;
                long j3 = this.f112258l;
                long j4 = this.f112259m;
                Map map2 = this.f112255a;
                bgjn bgjn = ((bgjp) berg).f116623d;
                synchronized (((bgdo) bgjn).f116149e) {
                    bgbg bgbg = ((bgdo) bgjn).f116157n;
                    GoogleLocationChimeraService googleLocationChimeraService = ((bgdo) bgjn).f116145a;
                    if (!bgbg.f115992p.isEmpty() && map2.size() != 0) {
                        Parcel obtain = Parcel.obtain();
                        obtain.writeLong(j3);
                        obtain.writeLong(j4);
                        obtain.writeInt(map2.size());
                        for (Map.Entry entry2 : map2.entrySet()) {
                            bfku bfku = (bfku) entry2.getValue();
                            int a = bfku.mo61855a();
                            obtain.writeInt(((bfgt) entry2.getKey()).f113836x);
                            obtain.writeInt(bfku.f114316b);
                            obtain.writeInt(a);
                            int i = bfku.f114316b;
                            long[] jArr = new long[i];
                            float[] fArr = new float[(i * a)];
                            for (int i2 = 0; i2 < bfku.f114316b; i2++) {
                                jArr[i2] = bfku.mo61857a(i2) - bfku.mo61857a(0);
                                for (int i3 = 0; i3 < a; i3++) {
                                    fArr[(i2 * a) + i3] = bfku.mo61854a(i2, i3);
                                }
                            }
                            obtain.writeLongArray(jArr);
                            obtain.writeFloatArray(fArr);
                        }
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        for (bgbe bgbe : bgbg.f115992p) {
                            Intent i4 = bgbg.m98504i();
                            i4.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
                            i4.putExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY", marshall);
                            bgbe.mo62597a(googleLocationChimeraService, i4);
                        }
                    }
                }
            }
        }
        this.f112256b = true;
        beqw a2 = mo61074a();
        if (a2.f112077a) {
            a2.f112077a = false;
            a2.f112078b.mo61628b();
        }
        mo61085i();
        this.f112400h.mo62048a(bfos.ACTIVITY_DETECTION_DONE);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    public void mo61086j() {
        bess bess;
        besy besy;
        boolean z;
        beqp d = mo61079d();
        String f = mo61082f();
        berb berb = this.f112396d;
        bete bete = berb.f112191r;
        int i = bete.f112367a ? bete.f112370d : berb.f112156af;
        bfor bfor = this.f112400h;
        bfor.mo62047a(new berd(bfos.ACTIVITY_DETECTION_START, bfor.mo62055b(), f.hashCode(), i, f, i));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 90);
        sb.append("Starting activity detection at: ");
        sb.append(elapsedRealtime);
        sb.append(" with detector: ");
        sb.append(f);
        sb.append(" at delay: ");
        sb.append(i);
        sb.toString();
        beqw a = mo61074a();
        berb berb2 = this.f112396d;
        int i2 = berb2.f112156af;
        int i3 = berb2.f112157ag;
        int i4 = berb2.f112158ah;
        long e = mo61080e();
        int c = mo61077c();
        double l = mo61088l();
        berb berb3 = this.f112396d;
        bgmj bgmj = berb3.f112135W.f112233c;
        bevg bevg = (!berb3.mo60976a(9) || berb3.f112189p) ? null : berb3.f112124L;
        if (this.f112260n) {
            berb berb4 = this.f112396d;
            if (berb4.f112189p && berb4.mo60976a(9)) {
                bess = berb4.f112126N;
                berb berb5 = this.f112396d;
                bewc bewc = berb5.f112125M;
                bexj h = berb5.mo60992h();
                bgmj bgmj2 = bgmj;
                besy = this.f112396d.f112137Y;
                int i5 = c;
                if (besy != null || besy.f112342f.f112332a <= 0) {
                    z = false;
                } else {
                    z = cerv.m138137b() > 0;
                }
                boolean c2 = this.f112396d.mo60987c();
                int i6 = i4;
                boolean f2 = this.f112396d.mo60990f();
                int i7 = i3;
                if (a.f112077a) {
                    a.f112080d = d;
                    a.f112081e = this;
                    a.f112079c = e;
                    a.f112090n = l;
                    a.f112083g = bevg;
                    a.f112084h = bess;
                    a.f112086j = bewc;
                    a.f112088l = h;
                    a.f112082f = z;
                    a.f112085i = c2;
                    a.f112087k = f2;
                    a.f112077a = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put(bfgt.f113814d, Integer.valueOf(i2));
                    hashMap.put(bfgt.f113819i, Integer.valueOf(i7));
                    hashMap.put(bfgt.f113821k, Integer.valueOf(i6));
                    a.f112078b = a.mo60958a(hashMap, i5, e, bgmj2, f2);
                    a.f112078b.mo61627a();
                    return;
                }
                return;
            }
        }
        bess = null;
        berb berb52 = this.f112396d;
        bewc bewc2 = berb52.f112125M;
        bexj h2 = berb52.mo60992h();
        bgmj bgmj22 = bgmj;
        besy = this.f112396d.f112137Y;
        int i52 = c;
        if (besy != null) {
        }
        z = false;
        boolean c22 = this.f112396d.mo60987c();
        int i62 = i4;
        boolean f22 = this.f112396d.mo60990f();
        int i72 = i3;
        if (a.f112077a) {
        }
    }

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
    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo61087k() {
        if (!this.f112256b) {
            if (berb.f112107Z) {
                this.f112396d.mo60974a(false, true);
            }
            mo61107a(new betd(this.f112396d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public double mo61088l() {
        return 35.0d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo61089m() {
        if (!this.f112396d.mo60975a() || !mo61133r()) {
            mo61107a(new betd(this.f112396d));
        } else if (!this.f112402j) {
            mo61107a(new betf(this.f112396d));
        } else if (this.f112396d.mo60976a(9)) {
            mo61107a(new beuc(this.f112396d));
        } else {
            mo61107a(new betf(this.f112396d));
        }
    }

    /* renamed from: o */
    public final void mo61091o() {
        this.f112260n = false;
    }

    /* renamed from: a */
    public final void mo60944a(long j, long j2, bfgt bfgt, bfku bfku) {
        bfgt bfgt2 = bfgt;
        bfku bfku2 = bfku;
        if (this.f112396d.f112168ar && f112254k.containsKey(bfgt2) && bfku2.f114316b != 0) {
            if (this.f112255a.containsKey(bfgt2)) {
                bfku bfku3 = (bfku) this.f112255a.get(bfgt2);
                if (bfku.mo61855a() == bfku3.mo61855a()) {
                    long[] jArr = new long[(bfku3.f114316b + bfku2.f114316b)];
                    int a = bfku3.mo61855a();
                    int i = bfku3.f114316b;
                    int[] iArr = new int[2];
                    iArr[1] = bfku2.f114316b + i;
                    iArr[0] = a;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    System.arraycopy(bfku3.f114317c, bfku3.f114315a, jArr, 0, i);
                    int i2 = bfku2.f114315a;
                    for (int i3 = 0; i3 < bfku2.f114316b; i3++) {
                        jArr[bfku3.f114316b + i3] = bfku2.f114317c[i2 + i3];
                    }
                    for (int i4 = 0; i4 < bfku3.mo61855a(); i4++) {
                        System.arraycopy(bfku3.f114318d[i4], bfku3.f114315a, fArr[i4], 0, bfku3.f114316b);
                        System.arraycopy(bfku2.f114318d[i4], i2, fArr[i4], bfku3.f114316b, bfku2.f114316b);
                    }
                    bfku2 = new bfku(jArr, fArr);
                } else {
                    int a2 = bfku3.mo61855a();
                    int a3 = bfku.mo61855a();
                    StringBuilder sb = new StringBuilder(123);
                    sb.append("Cannot concatenate data of different dimensionalities, this dimension: ");
                    sb.append(a2);
                    sb.append(", dataToBeAppended dimension: ");
                    sb.append(a3);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            int intValue = ((Integer) f112254k.get(bfgt2)).intValue();
            int i5 = bfku2.f114316b;
            if (i5 <= intValue) {
                this.f112255a.put(bfgt2, bfku2);
            } else {
                this.f112255a.put(bfgt2, bfku2.mo61860b(i5 - intValue, intValue));
            }
            this.f112258l = j;
            this.f112259m = j2;
        }
    }

    /* renamed from: c */
    public void mo60950c(ActivityRecognitionResult activityRecognitionResult) {
        this.f112396d.mo60980b(activityRecognitionResult);
        if (!this.f112256b && activityRecognitionResult.mo43491a().mo43513a() == 5) {
            ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult(activityRecognitionResult.f79300a, activityRecognitionResult.f79301b, activityRecognitionResult.f79302c, activityRecognitionResult.f79303d, activityRecognitionResult.mo43493c());
            String valueOf = String.valueOf(activityRecognitionResult2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Reporting tilting: ");
            sb.append(valueOf);
            sb.toString();
            this.f112396d.mo60967a(activityRecognitionResult2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo61085i() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        berb berb = this.f112396d;
        berb.f112161ak = elapsedRealtime;
        berb.f112162al = elapsedRealtime;
        berb.f112164an = elapsedRealtime;
        berb.f112165ao = elapsedRealtime;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo61090n() {
        long j;
        long e = bgof.m99492e();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!cese.m138154c()) {
            j = 0;
        } else {
            j = 60000;
        }
        this.f112396d.mo60964a(new bfmg(beub.m95861b(j + elapsedRealtime, elapsedRealtime, 0, e) - 1000, 2000));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo61081e(ActivityRecognitionResult activityRecognitionResult) {
        if (this.f112396d.f112168ar) {
            for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
                this.f112257c.put(Integer.valueOf(detectedActivity.mo43513a()), Integer.valueOf(detectedActivity.f79320e));
            }
        }
    }

    /* renamed from: a */
    public final void mo60945a(beqt beqt) {
        String str;
        int i = beqt.f112073a;
        if (i == 0) {
            mo61078a(beqt.mo60942a());
        } else if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = beqt.f112074b;
            }
            mo61075a(str);
        } else {
            mo61087k();
        }
    }

    /* renamed from: a */
    public final void mo60946a(ActivityRecognitionResult activityRecognitionResult) {
        bxbm.m122539a(activityRecognitionResult);
        this.f112396d.mo60980b(activityRecognitionResult);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ab  */
    /* renamed from: a */
    public final void mo60947a(ActivityRecognitionResult activityRecognitionResult, bevk bevk, ActivityRecognitionResult activityRecognitionResult2) {
        besy besy;
        ActivityRecognitionResult activityRecognitionResult3;
        boolean z;
        long j;
        DetectedActivity detectedActivity;
        bfne bfne;
        boolean z2;
        bevk bevk2;
        besy besy2;
        long j2;
        int i;
        DetectedActivity detectedActivity2;
        long j3;
        Boolean bool;
        int i2;
        boolean z3;
        int i3;
        ActivityRecognitionResult activityRecognitionResult4 = activityRecognitionResult;
        bevk bevk3 = bevk;
        if (!this.f112256b && (besy = this.f112396d.f112137Y) != null) {
            boolean z4 = this instanceof berx;
            DetectedActivity a = activityRecognitionResult.mo43491a();
            if (a.mo43513a() != 9) {
                int a2 = a.mo43513a();
                StringBuilder sb = new StringBuilder(49);
                sb.append("Detected activity is of type ");
                sb.append(a2);
                sb.append(", ignore.");
                sb.toString();
                activityRecognitionResult3 = null;
            } else {
                long j4 = activityRecognitionResult4.f79301b;
                long j5 = activityRecognitionResult4.f79302c;
                besy.f112337a.addLast(new bfne(Long.valueOf(j5), bevk3));
                if (z4) {
                    besw besw = besy.f112341e;
                    int i4 = besw.f112330c;
                    if (i4 > 0) {
                        i3 = i4;
                        long j6 = j5 - besw.f112329b;
                        if (j6 > 20000) {
                            besw.f112330c = 1;
                            if (a.f79320e >= 50) {
                                besw.f112331d = 1;
                            } else {
                                besw.f112331d = 0;
                            }
                            StringBuilder sb2 = new StringBuilder(133);
                            sb2.append("Millis since last batch start: ");
                            sb2.append(j6);
                            sb2.append(", abandon last batch and reset votes, new batch start millis: ");
                            sb2.append(j5);
                            sb2.toString();
                            besw.f112329b = j5;
                            long j7 = j5 - besw.f112328a;
                            if (j7 >= 180000) {
                                StringBuilder sb3 = new StringBuilder(91);
                                sb3.append("Millis since last filtering: ");
                                sb3.append(j7);
                                sb3.append(", run filter despite of insufficient votes");
                                sb3.toString();
                                int i5 = besw.f112330c;
                                int i6 = besw.f112331d;
                                StringBuilder sb4 = new StringBuilder(57);
                                sb4.append("Total votes: ");
                                sb4.append(i5);
                                sb4.append(", votes for off-body: ");
                                sb4.append(i6);
                                sb4.toString();
                                i2 = besw.f112331d;
                                if (i2 + i2 <= besw.f112330c) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                besw.f112330c = 0;
                                besw.f112331d = 0;
                                besw.f112328a = j5;
                                bool = Boolean.valueOf(z3);
                                if (bool == null) {
                                    z = bool.booleanValue();
                                } else {
                                    activityRecognitionResult3 = null;
                                }
                            } else {
                                bool = null;
                                if (bool == null) {
                                }
                            }
                        }
                    } else {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        besw.f112329b = j5;
                        StringBuilder sb5 = new StringBuilder(44);
                        sb5.append("New batch start millis: ");
                        sb5.append(j5);
                        sb5.toString();
                    }
                    int i7 = besw.f112330c + 1;
                    besw.f112330c = i7;
                    if (a.f79320e >= 50) {
                        besw.f112331d++;
                    }
                    if (i7 < 5) {
                        bool = null;
                        if (bool == null) {
                        }
                    }
                    int i52 = besw.f112330c;
                    int i62 = besw.f112331d;
                    StringBuilder sb42 = new StringBuilder(57);
                    sb42.append("Total votes: ");
                    sb42.append(i52);
                    sb42.append(", votes for off-body: ");
                    sb42.append(i62);
                    sb42.toString();
                    i2 = besw.f112331d;
                    if (i2 + i2 <= besw.f112330c) {
                    }
                    besw.f112330c = 0;
                    besw.f112331d = 0;
                    besw.f112328a = j5;
                    bool = Boolean.valueOf(z3);
                    if (bool == null) {
                    }
                } else {
                    z = a.f79320e >= 50;
                }
                StringBuilder sb6 = new StringBuilder(25);
                sb6.append("rawResultIsOffBody: ");
                sb6.append(z);
                sb6.toString();
                if (z) {
                    DetectedActivity detectedActivity3 = besy.mo61113a(j5) ? new DetectedActivity(9, 100) : new DetectedActivity(9, 51);
                    besy.f112339c = j5;
                    detectedActivity = detectedActivity3;
                    j = j4;
                } else {
                    besx besx = besy.f112342f;
                    besx.mo61112a(j5);
                    if (besx.f112332a > 0) {
                        if (z4) {
                            j3 = cerv.f183393a.mo6606a().inVehicleOffBodyCountThresholdForBatching();
                        } else {
                            j3 = cerv.m138137b();
                        }
                        if (j3 > 0 && activityRecognitionResult2 != null && activityRecognitionResult2.mo43491a().f79320e > 50) {
                            besx.f112333b++;
                            besx.f112336e = j5;
                        }
                        long j8 = besx.f112334c;
                        int i8 = besx.f112333b;
                        StringBuilder sb7 = new StringBuilder(81);
                        sb7.append("in vehicle millis: ");
                        sb7.append(j5 - j8);
                        sb7.append(", numInVehicleOffBodyDetected: ");
                        sb7.append(i8);
                        sb7.toString();
                        if (j5 - besx.f112334c >= 160000 && besx.f112332a >= 6 && ((long) besx.f112333b) >= j3) {
                            besy.f112339c = j5;
                            activityRecognitionResult3 = new ActivityRecognitionResult(new DetectedActivity(9, 70), j4, j5, bevp.PHONE_POSITION_FILTER_ORLA.f112768am, (Bundle) null);
                        }
                    }
                    Object pollFirst = besy.f112337a.pollFirst();
                    while (true) {
                        bfne = (bfne) pollFirst;
                        if (!besy.f112337a.isEmpty() && j5 - ((Long) ((bfne) besy.f112337a.getFirst()).f114467a).longValue() > 62000) {
                            pollFirst = besy.f112337a.pollFirst();
                        }
                    }
                    if (j5 - ((Long) bfne.f114467a).longValue() > 62000 && !besy.f112337a.isEmpty()) {
                        long longValue = ((Long) bfne.f114467a).longValue();
                        long longValue2 = 62000 - (j5 - ((Long) ((bfne) besy.f112337a.getFirst()).f114467a).longValue());
                        if (longValue2 + longValue2 < (j5 - longValue) - 62000 && j5 - ((Long) ((bfne) besy.f112337a.getFirst()).f114467a).longValue() >= 50000) {
                            bfne = (bfne) besy.f112337a.getFirst();
                            z2 = false;
                            if (z2 && j5 - ((Long) bfne.f114467a).longValue() < 200000) {
                                besy.f112337a.addFirst(bfne);
                            }
                            bevk2 = (j5 - ((Long) bfne.f114467a).longValue() <= 200000 || j5 - ((Long) bfne.f114467a).longValue() < 50000) ? null : (bevk) bfne.f114468b;
                            if (bevk2 == null) {
                                bevj bevj = besy.f112340d;
                                j = j4;
                                long j9 = j5;
                                if (bevj.m95955a((double) bevk2.f112675a, (double) bevk2.f112676b, (double) bevk2.f112677c, (double) bevk3.f112675a, (double) bevk3.f112676b, (double) bevk3.f112677c) < 0.99d) {
                                    besy2 = besy;
                                    j5 = j9;
                                } else if (((double) bevk2.f112678d) > 0.038d) {
                                    besy2 = besy;
                                    j5 = j9;
                                } else if (((double) bevk3.f112678d) <= 0.038d) {
                                    double a3 = bevj.m95954a(Math.acos((double) bevk2.f112679e), 30.0d);
                                    double a4 = bevj.m95954a(Math.acos((double) bevk3.f112679e), 30.0d);
                                    double a5 = bevj.m95954a((double) bevk2.f112678d, 70.0d);
                                    double a6 = bevj.m95954a((double) bevk3.f112678d, 70.0d);
                                    double[] dArr = {1.0d, a3 * a4, a5 * a6, (a3 * a3) + (a4 * a4), (a5 * a5) + (a6 * a6)};
                                    int i9 = 1;
                                    while (i9 < 5) {
                                        besy besy3 = besy;
                                        bevj bevj2 = bevj;
                                        double[] dArr2 = dArr;
                                        long j10 = j9;
                                        if (dArr2[i9] < 1.0E-10d) {
                                            dArr2[i9] = 1.0E-10d;
                                        }
                                        i9++;
                                        bevj = bevj2;
                                        j9 = j10;
                                        dArr = dArr2;
                                        besy = besy3;
                                    }
                                    double[] dArr3 = dArr;
                                    besy besy4 = besy;
                                    bevj bevj3 = bevj;
                                    double[] dArr4 = {bevj.m95954a(Math.acos(bevj.m95955a((double) bevk2.f112675a, (double) bevk2.f112676b, (double) bevk2.f112677c, (double) bevk3.f112675a, (double) bevk3.f112676b, (double) bevk3.f112677c)), 30.0d), bevj.m95954a(Math.acos(bevj.m95955a((double) bevk2.f112680f, (double) bevk2.f112681g, (double) bevk2.f112682h, (double) bevk3.f112680f, (double) bevk3.f112681g, (double) bevk3.f112682h)), 30.0d), bevj.m95954a(Math.acos(bevj.m95955a((double) bevk2.f112683i, (double) bevk2.f112684j, (double) bevk2.f112685k, (double) bevk3.f112683i, (double) bevk3.f112684j, (double) bevk3.f112685k)), 30.0d), bevj.m95954a(bevj.m95956b((double) bevk2.f112675a, (double) bevk2.f112676b, (double) bevk2.f112677c, (double) bevk3.f112675a, (double) bevk3.f112676b, (double) bevk3.f112677c), 7.0d), bevj.m95954a(bevj.m95956b((double) bevk2.f112680f, (double) bevk2.f112681g, (double) bevk2.f112682h, (double) bevk3.f112680f, (double) bevk3.f112681g, (double) bevk3.f112682h), 4.0d), bevj.m95954a(bevj.m95956b((double) bevk2.f112683i, (double) bevk2.f112684j, (double) bevk2.f112685k, (double) bevk3.f112683i, (double) bevk3.f112684j, (double) bevk3.f112685k), 7.0d)};
                                    Arrays.copyOf(dArr4, 7)[6] = 1.0d;
                                    double d = -0.7768226265907288d;
                                    int i10 = 0;
                                    int i11 = 0;
                                    for (int i12 = 6; i11 < i12; i12 = 6) {
                                        double d2 = dArr4[i11];
                                        double d3 = d2 * d2;
                                        for (int i13 = 0; i13 < 5; i13++) {
                                            double d4 = dArr3[i13];
                                            d = d + bevj3.mo61179a(i10, d2 / d4) + bevj3.mo61179a(i10 + 1, d3 / d4);
                                            i10 += 2;
                                        }
                                        i11++;
                                    }
                                    if (d > 0.0d) {
                                        besy besy5 = besy4;
                                        j5 = j9;
                                        if (besy5.mo61113a(j5)) {
                                            detectedActivity2 = new DetectedActivity(9, 100);
                                        } else {
                                            detectedActivity2 = new DetectedActivity(9, 25);
                                        }
                                        besy5.f112339c = j5;
                                        detectedActivity = detectedActivity2;
                                    } else {
                                        besy2 = besy4;
                                        j5 = j9;
                                    }
                                } else {
                                    besy2 = besy;
                                    j5 = j9;
                                }
                            } else {
                                besy2 = besy;
                                j = j4;
                            }
                            besy2.f112338b.clear();
                            j2 = besy2.f112339c;
                            if (j2 != -1) {
                                i = 9;
                            } else if (j5 - j2 <= 110000) {
                                detectedActivity = new DetectedActivity(9, 25);
                            } else {
                                i = 9;
                            }
                            detectedActivity = new DetectedActivity(i, 0);
                        }
                    }
                    z2 = true;
                    besy.f112337a.addFirst(bfne);
                    if (j5 - ((Long) bfne.f114467a).longValue() <= 200000) {
                    }
                    if (bevk2 == null) {
                    }
                    besy2.f112338b.clear();
                    j2 = besy2.f112339c;
                    if (j2 != -1) {
                    }
                    detectedActivity = new DetectedActivity(i, 0);
                }
                activityRecognitionResult3 = new ActivityRecognitionResult(detectedActivity, j, j5, bevp.PHONE_POSITION_FILTER_ORLA.f112768am, (Bundle) null);
                String valueOf = String.valueOf(activityRecognitionResult3);
                StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb8.append("Result to report: ");
                sb8.append(valueOf);
                sb8.toString();
            }
            if (activityRecognitionResult3 != null) {
                beqw.m95471a(this.f112400h, activityRecognitionResult3, true);
                this.f112398f.mo61010a(activityRecognitionResult3);
                mo61081e(activityRecognitionResult3);
            }
        }
    }

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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61075a(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("onFatalError: ");
        } else {
            "onFatalError: ".concat(valueOf);
        }
        if (!this.f112256b) {
            if (berb.f112107Z) {
                this.f112396d.mo60974a(false, true);
            }
            mo61107a(new betd(this.f112396d));
        }
    }
}
