package p000;

import com.google.android.gms.location.SleepClassifyEvent;
import com.google.android.gms.location.SleepSegmentEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: beth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beth implements bgnw {

    /* renamed from: a */
    public final berb f112382a;

    /* renamed from: b */
    public long f112383b = 0;

    /* renamed from: c */
    public long f112384c = 0;

    /* renamed from: d */
    private final bfor f112385d;

    /* renamed from: e */
    private final bexl f112386e;

    /* renamed from: f */
    private final bewo f112387f;

    /* renamed from: g */
    private final berg f112388g;

    /* renamed from: h */
    private final bglx f112389h;

    /* renamed from: i */
    private final int f112390i;

    /* renamed from: j */
    private final int f112391j;

    /* renamed from: k */
    private final List f112392k;

    /* renamed from: l */
    private int f112393l = 0;

    /* renamed from: m */
    private long f112394m = 0;

    /* renamed from: n */
    private bgjy f112395n = null;

    public beth(bfor bfor, bfnl bfnl, berb berb) {
        bexl bexl;
        boolean z;
        berb berb2 = berb;
        this.f112385d = bfor;
        this.f112382a = berb2;
        synchronized (bexl.f112945a) {
            if (bexl.f112946b == null) {
                bexl.f112946b = new bexl("");
            }
            bexl = bexl.f112946b;
        }
        this.f112386e = bexl;
        if (!cfam.m138534d() || !cfam.m138533c()) {
            z = false;
        } else {
            z = true;
        }
        bewm bewm = new bewm(z);
        bewm.f112829g[0] = (int) cfam.f183546a.mo6606a().minAwakeHsmmParam();
        bewm.f112829g[1] = (int) cfam.f183546a.mo6606a().minSleepHsmmParam();
        this.f112387f = new bewo(bewm.f112823a, bewm.f112824b, bewm.f112825c, bewm.f112826d, bewm.f112827e, bewm.f112828f, bewm.f112829g, bewm.f112830h, bfnl);
        this.f112388g = berb2.f112178e;
        this.f112389h = berb2.f112177d;
        this.f112390i = (int) cfam.f183546a.mo6606a().segmentSleepStartHour();
        this.f112391j = (int) cfam.f183546a.mo6606a().segmentSleepEndHour();
        this.f112392k = new ArrayList();
    }

    /* renamed from: a */
    static final bfne m95775a(bfne bfne, bfne bfne2) {
        long max = Math.max(((Long) bfne.f114467a).longValue(), ((Long) bfne2.f114467a).longValue());
        long min = Math.min(((Long) bfne.f114468b).longValue(), ((Long) bfne2.f114468b).longValue());
        if (max < min) {
            return new bfne(Long.valueOf(max), Long.valueOf(min));
        }
        return null;
    }

    /* renamed from: p */
    public final void mo61000p() {
        mo61128a(System.currentTimeMillis());
    }

    /* renamed from: a */
    static final boolean m95776a(long j, long j2) {
        StringBuilder sb = new StringBuilder(56);
        sb.append("Previous sleep segment report time: ");
        sb.append(j2);
        sb.toString();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j2);
        int i = gregorianCalendar.get(5);
        gregorianCalendar.setTimeInMillis(j);
        return gregorianCalendar.get(5) == i;
    }

    /* renamed from: a */
    public final List mo61125a() {
        if (cfam.m138541k()) {
            ArrayList arrayList = new ArrayList();
            if (this.f112389h.mo62769cx() != null) {
                for (bevn bevn : this.f112389h.mo62769cx()) {
                    arrayList.add(new SleepSegmentEvent(bevn.f112697a, bevn.f112698b, 0));
                }
            }
            return arrayList;
        }
        bewj bewj = this.f112387f.f112834a;
        bewj.mo61196c();
        ArrayList arrayList2 = new ArrayList();
        List list = bewj.f112820j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bfne bfne = (bfne) list.get(i);
            arrayList2.add(new SleepSegmentEvent(((Long) bfne.f114467a).longValue(), ((Long) bfne.f114468b).longValue(), 0));
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo61126a(List list, List list2, long j) {
        bfne bfne;
        int i;
        List list3 = list;
        long j2 = j;
        bevo cy = this.f112389h.mo62770cy();
        bfne bfne2 = null;
        if (cy == null || !cfam.m138542l()) {
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bfne bfne3 = (bfne) list3.get(i2);
                    String valueOf = String.valueOf(bfne3.f114467a);
                    String valueOf2 = String.valueOf(bfne3.f114468b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                    sb.append("Detected sleep:");
                    sb.append(valueOf);
                    sb.append("-");
                    sb.append(valueOf2);
                    sb.toString();
                    if (TimeUnit.MILLISECONDS.toHours(((Long) bfne3.f114468b).longValue() - ((Long) bfne3.f114467a).longValue()) >= cfam.f183546a.mo6606a().minSegmentedSleepHours()) {
                        bfne2 = bfne3;
                    }
                }
            }
            if (!list2.isEmpty() && !cfam.f183546a.mo6606a().allowMissingWindowsDetection()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    bfne bfne4 = (bfne) it.next();
                    String valueOf3 = String.valueOf(bfne4.f114467a);
                    String valueOf4 = String.valueOf(bfne4.f114468b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 15 + String.valueOf(valueOf4).length());
                    sb2.append("Missing data: ");
                    sb2.append(valueOf3);
                    sb2.append("-");
                    sb2.append(valueOf4);
                    sb2.toString();
                    if ((((Long) bfne4.f114468b).longValue() - ((Long) bfne4.f114467a).longValue()) / 3600000 < 12) {
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
                        gregorianCalendar.setTimeInMillis(((Long) bfne4.f114467a).longValue());
                        int i3 = gregorianCalendar.get(11);
                        gregorianCalendar.setTimeInMillis(((Long) bfne4.f114468b).longValue());
                        int i4 = gregorianCalendar.get(11);
                        if (i3 <= i4 && i3 >= 10 && i4 <= 19) {
                            long millis = TimeUnit.SECONDS.toMillis(cfam.f183546a.mo6606a().sleepMissingDataMaxGapEpochs() * 360);
                            long longValue = ((Long) bfne2.f114467a).longValue() - millis;
                            long longValue2 = ((Long) bfne2.f114468b).longValue() + millis;
                            if ((((Long) bfne4.f114467a).longValue() < longValue || ((Long) bfne4.f114467a).longValue() > longValue2) && ((((Long) bfne4.f114468b).longValue() < longValue || ((Long) bfne4.f114468b).longValue() > longValue2) && (((Long) bfne4.f114467a).longValue() >= longValue || ((Long) bfne4.f114468b).longValue() <= longValue2))) {
                            }
                        }
                    }
                    SleepSegmentEvent sleepSegmentEvent = new SleepSegmentEvent(((Long) bfne2.f114467a).longValue(), ((Long) bfne2.f114468b).longValue(), 1);
                    arrayList.add(sleepSegmentEvent);
                    berf.m95535a(this.f112385d, sleepSegmentEvent, sleepSegmentEvent.f79392c);
                    return arrayList;
                }
            }
            if (bfne2 != null) {
                arrayList.add(new SleepSegmentEvent(((Long) bfne2.f114467a).longValue(), ((Long) bfne2.f114468b).longValue(), 0));
                String valueOf5 = String.valueOf(bfne2.f114467a);
                String valueOf6 = String.valueOf(bfne2.f114468b);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 28 + String.valueOf(valueOf6).length());
                sb3.append("Reporting primary sleep: ");
                sb3.append(valueOf5);
                sb3.append(" - ");
                sb3.append(valueOf6);
                sb3.toString();
            }
            if (!arrayList.isEmpty() && ((SleepSegmentEvent) arrayList.get(0)).f79392c == 0) {
                bewj bewj = this.f112387f.f112834a;
                bewj.mo61196c();
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    SleepSegmentEvent sleepSegmentEvent2 = (SleepSegmentEvent) arrayList.get(i5);
                    if (sleepSegmentEvent2.f79392c == 0) {
                        bewj.f112820j.add(new bfne(Long.valueOf(sleepSegmentEvent2.f79390a), Long.valueOf(sleepSegmentEvent2.f79391b)));
                    }
                }
                if (!bewj.f112820j.isEmpty() && bewj.f112818h != null) {
                    bewj.mo61194a(bewj.mo61197d());
                }
            }
            return arrayList;
        }
        if (cfam.f183546a.mo6606a().sleepWindowEpochCalculationBugFix()) {
            bfne = cy.mo61183a(j2);
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
            gregorianCalendar2.setTimeInMillis(j2);
            gregorianCalendar2.set(11, cy.f112701c);
            gregorianCalendar2.set(12, cy.f112702d);
            gregorianCalendar2.set(13, 0);
            long timeInMillis = gregorianCalendar2.getTimeInMillis();
            if (timeInMillis > j2) {
                gregorianCalendar2.add(6, -1);
                timeInMillis = gregorianCalendar2.getTimeInMillis();
            }
            gregorianCalendar2.set(11, cy.f112699a);
            gregorianCalendar2.set(12, cy.f112700b);
            gregorianCalendar2.set(13, 0);
            long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
            if (timeInMillis2 > timeInMillis) {
                gregorianCalendar2.add(6, -1);
                timeInMillis2 = gregorianCalendar2.getTimeInMillis();
            }
            bfne = new bfne(Long.valueOf(timeInMillis2), Long.valueOf(timeInMillis));
        }
        ArrayList arrayList2 = new ArrayList();
        String valueOf7 = String.valueOf(bfne.f114467a);
        String valueOf8 = String.valueOf(bfne.f114468b);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + 13 + String.valueOf(valueOf8).length());
        sb4.append("userWindow :");
        sb4.append(valueOf7);
        sb4.append("-");
        sb4.append(valueOf8);
        sb4.toString();
        int size3 = list.size();
        long j3 = 0;
        for (int i6 = 0; i6 < size3; i6++) {
            bfne a = m95775a(bfne, (bfne) list3.get(i6));
            if (a != null) {
                String valueOf9 = String.valueOf(a.f114467a);
                String valueOf10 = String.valueOf(a.f114468b);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf9).length() + 15 + String.valueOf(valueOf10).length());
                sb5.append("Overlap sleep:");
                sb5.append(valueOf9);
                sb5.append("-");
                sb5.append(valueOf10);
                sb5.toString();
                long longValue3 = ((Long) a.f114468b).longValue() - ((Long) a.f114467a).longValue();
                if (longValue3 > j3) {
                    bfne2 = a;
                    j3 = longValue3;
                }
            }
        }
        if (bfne2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = 0;
                    break;
                }
                bfne bfne5 = (bfne) it2.next();
                if (m95775a(bfne5, bfne) != null) {
                    String valueOf11 = String.valueOf(bfne5.f114467a);
                    String valueOf12 = String.valueOf(bfne5.f114468b);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf11).length() + 17 + String.valueOf(valueOf12).length());
                    sb6.append("hasMissingData: ");
                    sb6.append(valueOf11);
                    sb6.append("-");
                    sb6.append(valueOf12);
                    sb6.toString();
                    i = 1;
                    break;
                }
            }
            arrayList2.add(new SleepSegmentEvent(((Long) bfne2.f114467a).longValue(), ((Long) bfne2.f114468b).longValue(), i));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berg.a(bfnn, boolean):void
     arg types: [bfnn, int]
     candidates:
      berg.a(java.util.List, int):void
      berg.a(bfnn, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ce  */
    /* renamed from: a */
    public final void mo61127a(int i, long j, long j2, bexk bexk, boolean z) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        List a;
        boolean z4;
        float[] fArr;
        int i5;
        float[] fArr2;
        boolean z5;
        float[] fArr3;
        int i6;
        float[] fArr4;
        int i7 = i;
        long j3 = j;
        bexk bexk2 = bexk;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j3);
        int i8 = gregorianCalendar.get(11);
        StringBuilder sb = new StringBuilder(45);
        sb.append("Writing sleep confidence to HSMM: ");
        sb.append(i7);
        sb.toString();
        long j4 = j3 - this.f112384c;
        boolean z6 = j4 >= 0 && j4 <= TimeUnit.MINUTES.toMillis(cfam.f183546a.mo6606a().sleepClockAlarmConfidenceOverwriteMinutes());
        if (z6) {
            i7 = Math.min(i7, ((int) cfam.m138539i()) + 1);
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Clock alarm ring maybe overwrite conf: ");
            sb2.append(i7);
            sb2.toString();
        }
        if (z) {
            int sleepConfidenceFromMotion = (i7 + ((int) cfam.f183546a.mo6606a().sleepConfidenceFromMotion())) / 2;
            bexk2.f112924f = (float) cfam.f183546a.mo6606a().sleepAccelFeatureFromMotion();
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("Motion overwrite conf: ");
            sb3.append(sleepConfidenceFromMotion);
            sb3.toString();
            i2 = sleepConfidenceFromMotion;
        } else {
            i2 = i7;
        }
        int a2 = (int) bexh.ACCEL.mo61225a(bexk2.f112924f);
        int a3 = (int) bexh.LIGHT.mo61225a(bexk2.f112920b);
        float f = bexk2.f112915H;
        int a4 = f >= 0.0f ? (int) bexh.LOG_BARK_DIFF.mo61225a(f) : -1;
        int a5 = (int) bexh.LIGHT_DIFF.mo61225a(bexk2.f112921c);
        int a6 = (int) bexh.HOUR.mo61225a(bexk2.f112918K);
        int i9 = (int) bexk2.f112919L;
        long j5 = j3 / 1000;
        SleepClassifyEvent sleepClassifyEvent = new SleepClassifyEvent((int) j5, i2, a2, a3, a4, a5, a6, z6, i9);
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(j5), Integer.valueOf(i2), Integer.valueOf(a2), Integer.valueOf(a3), Integer.valueOf(a4), Integer.valueOf(a5), Integer.valueOf(a6), Boolean.valueOf(z6), Integer.valueOf(i9)};
        bewo bewo = this.f112387f;
        SleepClassifyEvent sleepClassifyEvent2 = sleepClassifyEvent;
        int i10 = i2;
        bewn bewn = new bewn(new int[]{i2}, j, j2);
        if (cfam.m138538h()) {
            bewj bewj = bewo.f112834a;
            bewl bewl = bewo.f112835b;
            if (bewj.f112814d == -1) {
                long j6 = bewj.f112817g;
                if (j6 != -1) {
                    long j7 = bewn.f112832b;
                    long j8 = ((j7 - j6) / 360000) - 1;
                    StringBuilder sb4 = new StringBuilder(34);
                    sb4.append("skippedEpochs ");
                    sb4.append(j8);
                    sb4.toString();
                    if (j8 > 5) {
                        bewj.f112819i.add(new bfne(Long.valueOf(bewj.f112817g), Long.valueOf(j7)));
                        int size = bewj.f112819i.size();
                        StringBuilder sb5 = new StringBuilder(36);
                        sb5.append("missingDataWindows.size: ");
                        sb5.append(size);
                        sb5.toString();
                        i6 = 0;
                    } else {
                        i6 = 0;
                    }
                    while (((long) i6) < j8) {
                        int i11 = bewj.f112811a;
                        bewj.f112812b = i11;
                        int i12 = (i11 + 1) % 240;
                        bewj.f112811a = i12;
                        if (i12 == 0 && !bewj.f112816f) {
                            bewj.f112816f = true;
                        }
                        float[][] fArr5 = bewj.f112815e;
                        if (i11 == 0 && bewj.f112816f) {
                            fArr4 = fArr5[239];
                        } else {
                            fArr4 = fArr5[i11 - 1];
                        }
                        fArr5[i11] = fArr4;
                        bewj.f112813c = (int) (((long) bewj.f112813c) + j8);
                        i6++;
                    }
                }
                bewj.f112814d = bewn.f112832b;
                bewl.mo61198a();
                z5 = true;
            } else {
                z5 = true;
            }
            while (true) {
                long j9 = bewn.f112832b;
                long j10 = bewj.f112814d + 360000;
                if (j9 < j10) {
                    break;
                }
                int i13 = bewj.f112811a;
                bewj.f112812b = i13;
                bewj.f112813c++;
                int i14 = (i13 + 1) % 240;
                bewj.f112811a = i14;
                if (i14 == 0 && !bewj.f112816f) {
                    bewj.f112816f = true;
                }
                bewj.f112814d = j10;
                bewl.mo61198a();
                if (!z5) {
                    float[][] fArr6 = bewj.f112815e;
                    int i15 = bewj.f112812b;
                    if (i15 == 0 && bewj.f112816f) {
                        fArr3 = fArr6[239];
                    } else {
                        fArr3 = fArr6[i15 - 1];
                    }
                    fArr6[i15] = fArr3;
                } else {
                    z5 = false;
                }
            }
            bewl.mo61199a(bewn);
            bewj.f112815e[bewj.f112811a] = bewl.mo61200b();
            if (bewj.f112813c >= ((int) cfam.m138535e()) && bewj.f112818h != null) {
                bewj.mo61194a(bewj.mo61197d());
            }
            z2 = !z5;
        } else {
            bewj bewj2 = bewo.f112834a;
            bewl bewl2 = bewo.f112835b;
            if (bewj2.f112814d == -1) {
                long j11 = bewj2.f112817g;
                if (j11 != -1) {
                    long j12 = bewn.f112832b;
                    long j13 = ((j12 - j11) / 360000) - 1;
                    StringBuilder sb6 = new StringBuilder(34);
                    sb6.append("skippedEpochs ");
                    sb6.append(j13);
                    sb6.toString();
                    if (j13 > 5) {
                        bewj2.f112819i.add(new bfne(Long.valueOf(bewj2.f112817g), Long.valueOf(j12)));
                        int size2 = bewj2.f112819i.size();
                        StringBuilder sb7 = new StringBuilder(36);
                        sb7.append("missingDataWindows.size: ");
                        sb7.append(size2);
                        sb7.toString();
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                    while (((long) i5) < j13) {
                        int i16 = bewj2.f112811a;
                        bewj2.f112812b = i16;
                        int i17 = (i16 + 1) % 240;
                        bewj2.f112811a = i17;
                        if (i17 == 0 && !bewj2.f112816f) {
                            bewj2.f112816f = true;
                        }
                        float[][] fArr7 = bewj2.f112815e;
                        if (i16 == 0 && bewj2.f112816f) {
                            fArr2 = fArr7[239];
                        } else {
                            fArr2 = fArr7[i16 - 1];
                        }
                        fArr7[i16] = fArr2;
                        bewj2.f112813c = (int) (((long) bewj2.f112813c) + j13);
                        i5++;
                    }
                }
                bewj2.f112814d = bewn.f112833c;
                bewl2.mo61198a();
                z4 = true;
            } else {
                z4 = true;
            }
            while (true) {
                long j14 = bewn.f112833c;
                long j15 = bewj2.f112814d + 360000;
                if (j14 < j15) {
                    break;
                }
                int i18 = bewj2.f112811a;
                bewj2.f112812b = i18;
                bewj2.f112813c++;
                int i19 = (i18 + 1) % 240;
                bewj2.f112811a = i19;
                if (i19 == 0 && !bewj2.f112816f) {
                    bewj2.f112816f = true;
                }
                bewj2.f112814d = j15;
                bewl2.mo61198a();
                if (!z4) {
                    float[][] fArr8 = bewj2.f112815e;
                    int i20 = bewj2.f112812b;
                    if (i20 == 0) {
                        if (bewj2.f112816f) {
                            fArr = fArr8[239];
                            fArr8[i20] = fArr;
                        }
                    }
                    fArr = fArr8[i20 - 1];
                    fArr8[i20] = fArr;
                } else {
                    z4 = false;
                }
            }
            bewl2.mo61199a(bewn);
            bewj2.f112815e[bewj2.f112811a] = bewl2.mo61200b();
            if (bewj2.f112813c >= ((int) cfam.m138535e()) && bewj2.f112818h != null) {
                bewj2.mo61194a(bewn.f112832b);
            }
            z2 = !z4;
        }
        StringBuilder sb8 = new StringBuilder(26);
        sb8.append("last epoch finished? ");
        sb8.append(z2);
        sb8.toString();
        if (i8 >= this.f112390i && i10 <= ((int) cfam.m138539i())) {
            this.f112393l++;
        } else if (i8 == this.f112390i - 1) {
            this.f112393l = 0;
        }
        this.f112392k.add(sleepClassifyEvent2);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes((((long) sleepClassifyEvent2.f79381a) * 1000) - ((bgjp) this.f112389h).f116620a.getSharedPreferences("SLEEP_PREF_NAME", 0).getLong("LAST_SLEEP_CLASSIFY_MILLIS", 0));
        if (cfam.f183546a.mo6606a().gmsSleepClassificationEventLoggingEnabled()) {
            bfor bfor = this.f112385d;
            bfor.mo62047a(new bfop(bfos.GMS_SLEEP_CLASSIFICATION_EVENT, bfor.mo62055b(), sleepClassifyEvent2.f79381a, sleepClassifyEvent2.f79382b));
        }
        if (minutes >= ((int) cfam.f183546a.mo6606a().writeSleepClassifyIntervalMinutes())) {
            int size3 = this.f112392k.size();
            StringBuilder sb9 = new StringBuilder(56);
            sb9.append("Sending classify events to the client. Size: ");
            sb9.append(size3);
            sb9.toString();
            berg berg = this.f112388g;
            bfnn bfnn = new bfnn(null, this.f112392k);
            bgjp bgjp = (bgjp) berg;
            bgdo bgdo = (bgdo) bgjp.f116623d;
            bgdo.f116160q.mo62610a(bgdo.f116145a, bfnn, null, bgdo.f116153j);
            bgjp.mo62908a("LAST_SLEEP_CLASSIFY_MILLIS");
            this.f112392k.clear();
        }
        if (cfam.m138538h()) {
            long j16 = j;
            if (!m95776a(j16, this.f112389h.mo62768cw())) {
                bevo cy = this.f112389h.mo62770cy();
                boolean z7 = cy != null && cfam.m138542l();
                long sleepActivityDetectionIdleIntervalMillis = cfam.f183546a.mo6606a().sleepActivityDetectionIdleIntervalMillis();
                if (z7) {
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
                    gregorianCalendar2.setTimeInMillis(j16);
                    gregorianCalendar2.set(11, cy.f112701c);
                    gregorianCalendar2.set(12, cy.f112702d);
                    gregorianCalendar2.set(13, 0);
                    if (j16 >= gregorianCalendar2.getTimeInMillis() - sleepActivityDetectionIdleIntervalMillis) {
                        z3 = true;
                        GregorianCalendar gregorianCalendar3 = new GregorianCalendar(TimeZone.getDefault());
                        gregorianCalendar3.setTimeInMillis(j16);
                        int i21 = gregorianCalendar3.get(11);
                        boolean z8 = (!z7 || ((long) this.f112393l) < cfam.m138537g()) ? false : i21 >= this.f112390i;
                        if (z3 || z8) {
                            bewo bewo2 = this.f112387f;
                            bewj bewj3 = bewo2.f112834a;
                            a = bewo2.mo61201a(bewj3.mo61197d());
                            List b = bewj3.mo61195b();
                            if (!a.isEmpty()) {
                                List a7 = mo61126a(a, b, bewj3.mo61197d());
                                if (!a7.isEmpty()) {
                                    this.f112388g.mo61009a(new bfnn(a7, null), true);
                                    return;
                                }
                            }
                            if (z3 || i21 >= this.f112391j) {
                                SleepSegmentEvent sleepSegmentEvent = new SleepSegmentEvent(0, 0, 2);
                                berf.m95535a(this.f112385d, sleepSegmentEvent, sleepSegmentEvent.f79392c);
                                this.f112388g.mo61009a(new bfnn(Arrays.asList(sleepSegmentEvent), null), true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z3 = false;
                GregorianCalendar gregorianCalendar32 = new GregorianCalendar(TimeZone.getDefault());
                gregorianCalendar32.setTimeInMillis(j16);
                int i212 = gregorianCalendar32.get(11);
                if (!z7) {
                }
                if (z3) {
                    return;
                }
                bewo bewo22 = this.f112387f;
                bewj bewj32 = bewo22.f112834a;
                a = bewo22.mo61201a(bewj32.mo61197d());
                List b2 = bewj32.mo61195b();
                if (!a.isEmpty()) {
                }
                if (z3) {
                    return;
                }
                SleepSegmentEvent sleepSegmentEvent2 = new SleepSegmentEvent(0, 0, 2);
                berf.m95535a(this.f112385d, sleepSegmentEvent2, sleepSegmentEvent2.f79392c);
                this.f112388g.mo61009a(new bfnn(Arrays.asList(sleepSegmentEvent2), null), true);
                return;
            }
            return;
        }
        long j17 = j;
        GregorianCalendar gregorianCalendar4 = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar4.setTimeInMillis(j17);
        int i22 = gregorianCalendar4.get(11);
        int i23 = gregorianCalendar4.get(12);
        bewj bewj4 = this.f112387f.f112834a;
        int a8 = bewj4.mo61193a();
        int i24 = this.f112390i;
        int i25 = this.f112391j;
        bevo cy2 = this.f112389h.mo62770cy();
        boolean z9 = cy2 != null && cfam.m138542l();
        if (z9) {
            i24 = cy2.f112701c;
            i3 = cy2.f112702d;
            i25 = i24;
            i4 = i3;
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (((long) a8) < cfam.f183546a.mo6606a().minTotalEpochsBeforeSegment()) {
            StringBuilder sb10 = new StringBuilder(34);
            sb10.append("Num epochs not enough: ");
            sb10.append(a8);
            sb10.toString();
        } else if (!m95776a(j17, this.f112389h.mo62768cw()) && i22 >= i24) {
            if (i22 == i24 && i23 < i3) {
                return;
            }
            if (!z9 && ((long) this.f112393l) < cfam.m138537g()) {
                int i26 = this.f112393l;
                StringBuilder sb11 = new StringBuilder(64);
                sb11.append("Not enough awake indication. awakeCountSinceMorning: ");
                sb11.append(i26);
                sb11.toString();
                return;
            }
            List a9 = this.f112387f.mo61201a(j17);
            List b3 = bewj4.mo61195b();
            if (!a9.isEmpty()) {
                List a10 = mo61126a(a9, b3, j17);
                if (!a10.isEmpty()) {
                    this.f112388g.mo61009a(new bfnn(a10, null), true);
                    return;
                }
            }
            if (i22 > i25 || (i22 == i25 && i23 > i4)) {
                SleepSegmentEvent sleepSegmentEvent3 = new SleepSegmentEvent(0, 0, 2);
                berf.m95535a(this.f112385d, sleepSegmentEvent3, sleepSegmentEvent3.f79392c);
                this.f112388g.mo61009a(new bfnn(Arrays.asList(sleepSegmentEvent3), null), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo61128a(long j) {
        this.f112394m = j;
        bgjy bgjy = this.f112395n;
        if (bgjy != null && bgjy.mo62933b()) {
            this.f112395n.mo62931a();
        }
    }

    /* renamed from: a */
    public final void mo61129a(bexj bexj, long j, long j2, bfku bfku, bfku bfku2) {
        bfku bfku3 = bfku;
        bfku bfku4 = bfku2;
        int i = bfku3.f114316b;
        int i2 = bfku4.f114316b;
        if (i >= 50 && i2 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(bfgt.f113814d, bfku3);
            hashMap.put(bfgt.f113821k, bfku4);
            bexk a = this.f112386e.mo61229a(hashMap, (int) (j / 1000));
            int a2 = bexj.mo61226a(a);
            this.f112382a.f112166ap = j2;
            long j3 = j - this.f112394m;
            long millis = TimeUnit.SECONDS.toMillis(360);
            boolean z = false;
            if (millis > 0 && j3 <= millis) {
                z = true;
            }
            mo61127a(a2, j, j2, a, z);
            StringBuilder sb = new StringBuilder(29);
            sb.append("Sleep confidence: ");
            sb.append(a2);
            sb.toString();
            if (this.f112395n == null) {
                this.f112395n = this.f112382a.f112177d.mo62771cz();
            }
            if (this.f112395n.mo62933b()) {
                this.f112395n.mo62932a(this);
            }
        }
    }
}
