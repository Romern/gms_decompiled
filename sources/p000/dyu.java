package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: dyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dyu extends dyg {

    /* renamed from: b */
    public static final dxr f14440b = new dxr(new dyr(), "DetectedActivityProducer", new int[]{6}, null, true);

    /* renamed from: k */
    private ContextData f14441k = null;

    /* renamed from: l */
    private bxkl f14442l;

    /* renamed from: m */
    private SparseIntArray f14443m;

    /* renamed from: n */
    private int f14444n;

    /* renamed from: o */
    private int f14445o;

    /* renamed from: p */
    private PendingIntent f14446p;

    /* renamed from: q */
    private long f14447q = cdgp.f180782a.mo6606a().mo77586f();

    /* renamed from: r */
    private final dzz f14448r = new dzz(null, null, cdgr.f180872f);

    public dyu(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14440b, str, dqb);
        mo9851a(6);
    }

    /* renamed from: b */
    private final void m9840b(long j) {
        long j2 = this.f14447q;
        if (j2 != j && this.f14445o <= 0) {
            this.f14447q = j;
            mo9881j();
            mo9882k();
            return;
        }
        new Object[1][0] = Long.valueOf(j2);
    }

    /* renamed from: l */
    private final void m9841l() {
        m9840b(this.f14448r.f14511c);
    }

    /* renamed from: m */
    private final ContextData m9842m() {
        tip tip = new tip(this.f14441k);
        tka j = this.f14441k.mo18022j();
        sdo.m34974b(j.mo26616b());
        tip.mo26574a(tka.m37118a(j.mo18096c(), System.currentTimeMillis()));
        return tip.mo26570a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        Intent intent = new Intent("com.google.android.contextmanager.producer.module.DetectedActivityProducer");
        intent.setPackage("com.google.android.gms");
        this.f14446p = PendingIntent.getBroadcast(this.f14388d, 0, intent, 134217728);
        mo9882k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.contextmanager.producer.module.DetectedActivityProducer");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo9881j() {
        if (this.f14441k != null) {
            mo9856c(m9842m());
            this.f14441k = null;
        }
        aefo.m51797a(this.f14388d).mo24679a(this.f14446p).mo50371a(new dqi("[DetectedActivityProducer] remove activity", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo9882k() {
        new Object[1][0] = Long.valueOf(this.f14447q);
        aefy aefy = new aefy();
        aefy.mo34115a(this.f14447q);
        aefy.f63348e = "ContextManager";
        aefo.m51797a(this.f14388d).mo24682a(aefy.mo34113a(), this.f14446p).mo50371a(new dqi("[DetectedActivityProducer] request activity", new Object[0]));
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        char c;
        bxkj bxkj;
        int i;
        if (!ActivityRecognitionResult.m66819a(intent)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dyu", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DetectedActivityProducer] Not a activityRecognitionIntentService.");
            return;
        }
        ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
        new Object[1][0] = b;
        bxkk bxkk = (bxkk) bxkl.f163759b.mo74144da();
        bxkj[] bxkjArr = new bxkj[(b.f79300a.size() + 1)];
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (DetectedActivity detectedActivity : b.f79300a) {
            bxki a = bxki.m122801a(detectedActivity.mo43513a());
            bxvd da = bxkj.f163754d.mo74144da();
            if (a == null) {
                a = bxki.UNKNOWN;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxkj bxkj2 = (bxkj) da.f164949b;
            bxkj2.f163757b = a.f163753x;
            int i3 = bxkj2.f163756a | 1;
            bxkj2.f163756a = i3;
            int i4 = detectedActivity.f79320e;
            bxkj2.f163756a = 2 | i3;
            bxkj2.f163758c = i4;
            int i5 = i2 + 1;
            bxkjArr[i2] = (bxkj) da.mo74062i();
            if (arrayList.isEmpty()) {
                arrayList.add((bxkj) da.mo74062i());
            } else if (((bxkj) da.f164949b).f163758c > ((bxkj) arrayList.get(0)).f163758c) {
                arrayList.clear();
                arrayList.add((bxkj) da.mo74062i());
            } else if (((bxkj) da.f164949b).f163758c == ((bxkj) arrayList.get(0)).f163758c) {
                arrayList.add((bxkj) da.mo74062i());
            }
            i2 = i5;
        }
        if (dss.m9250a(2) && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                bxkj bxkj3 = (bxkj) arrayList.get(i7);
                Object[] objArr = new Object[2];
                Integer valueOf = Integer.valueOf(i6);
                objArr[0] = valueOf;
                bxki a2 = bxki.m122801a(bxkj3.f163757b);
                if (a2 == null) {
                    a2 = bxki.IN_VEHICLE;
                }
                objArr[1] = Integer.valueOf(a2.f163753x);
                Object[] objArr2 = {valueOf, Integer.valueOf(bxkj3.f163758c)};
                i6++;
            }
        }
        bxvd da2 = bxkj.f163754d.mo74144da();
        bxki bxki = bxki.EXPERIMENTAL_EXTRA_PERSONAL_VEHICLE;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxkj bxkj4 = (bxkj) da2.f164949b;
        bxkj4.f163757b = bxki.f163753x;
        bxkj4.f163756a |= 1;
        bxki[] bxkiArr = {bxki.STILL, bxki.IN_VEHICLE};
        int size2 = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size2) {
                bxkj bxkj5 = (bxkj) arrayList.get(i8);
                int i9 = 0;
                while (true) {
                    i = i8 + 1;
                    if (i9 >= 2) {
                        break;
                    }
                    bxki bxki2 = bxkiArr[i9];
                    bxki a3 = bxki.m122801a(bxkj5.f163757b);
                    if (a3 == null) {
                        a3 = bxki.IN_VEHICLE;
                    }
                    if (a3 == bxki2) {
                        int a4 = aega.m51812a(b.mo43493c());
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxkj bxkj6 = (bxkj) da2.f164949b;
                        bxkj6.f163756a |= 2;
                        bxkj6.f163758c = a4;
                        new Object[1][0] = Integer.valueOf(a4);
                    } else {
                        i9++;
                    }
                }
            } else {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxkj bxkj7 = (bxkj) da2.f164949b;
                bxkj7.f163756a |= 2;
                bxkj7.f163758c = 0;
            }
            i8 = i;
        }
        bxkjArr[i2] = (bxkj) da2.mo74062i();
        bxkk.mo73583a(Arrays.asList(bxkjArr));
        bxkl bxkl = (bxkl) bxkk.mo74062i();
        bxvd bxvd = (bxvd) bxkl.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bxkl);
        bxkk bxkk2 = (bxkk) bxvd;
        bxki a5 = bxki.m122801a(((bxkj) ((bxkl) bxkk2.mo74062i()).f163762a.get(0)).f163757b);
        if (a5 == null) {
            a5 = bxki.IN_VEHICLE;
        }
        if (a5 != bxki.TILTING) {
            int e = (int) cdgp.f180782a.mo6606a().mo77585e();
            bxkl bxkl2 = this.f14442l;
            if (bxkl2 == null || e == 0) {
                this.f14442l = (bxkl) bxkk2.mo74062i();
            } else {
                int i10 = this.f14445o;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f14445o = i11;
                    new Object[1][0] = Integer.valueOf(i11);
                    for (bxkj bxkj8 : Collections.unmodifiableList(((bxkl) bxkk2.f164949b).f163762a)) {
                        SparseIntArray sparseIntArray = this.f14443m;
                        bxki a6 = bxki.m122801a(bxkj8.f163757b);
                        if (a6 == null) {
                            a6 = bxki.IN_VEHICLE;
                        }
                        int i12 = a6.f163753x;
                        SparseIntArray sparseIntArray2 = this.f14443m;
                        bxki a7 = bxki.m122801a(bxkj8.f163757b);
                        if (a7 == null) {
                            a7 = bxki.IN_VEHICLE;
                        }
                        sparseIntArray.put(i12, sparseIntArray2.get(a7.f163753x, 0) + bxkj8.f163758c);
                    }
                    if (this.f14445o == 0) {
                        if (bxkk2.f164950c) {
                            bxkk2.mo74035c();
                            bxkk2.f164950c = false;
                        }
                        ((bxkl) bxkk2.f164949b).f163762a = GeneratedMessageLite.m124030de();
                        for (int i13 = 0; i13 < this.f14443m.size(); i13++) {
                            bxvd da3 = bxkj.f163754d.mo74144da();
                            bxki a8 = bxki.m122801a(this.f14443m.keyAt(i13));
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bxkj bxkj9 = (bxkj) da3.f164949b;
                            bxkj9.f163757b = a8.f163753x;
                            bxkj9.f163756a |= 1;
                            int valueAt = this.f14443m.valueAt(i13) / this.f14444n;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bxkj bxkj10 = (bxkj) da3.f164949b;
                            bxkj10.f163756a |= 2;
                            bxkj10.f163758c = valueAt;
                            if (bxkk2.f164950c) {
                                bxkk2.mo74035c();
                                bxkk2.f164950c = false;
                            }
                            bxkl bxkl3 = (bxkl) bxkk2.f164949b;
                            bxkj bxkj11 = (bxkj) da3.mo74062i();
                            bxkj11.getClass();
                            bxkl3.mo73584a();
                            bxkl3.f163762a.add(bxkj11);
                        }
                        ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(((bxkl) bxkk2.f164949b).f163762a));
                        Collections.sort(arrayList2, dyt.f14439a);
                        if (bxkk2.f164950c) {
                            bxkk2.mo74035c();
                            bxkk2.f164950c = false;
                        }
                        ((bxkl) bxkk2.f164949b).f163762a = GeneratedMessageLite.m124030de();
                        bxkk2.mo73583a(arrayList2);
                        if (dss.m9250a(2)) {
                            for (bxkj bxkj12 : Collections.unmodifiableList(((bxkl) bxkk2.f164949b).f163762a)) {
                                Object[] objArr3 = new Object[2];
                                bxki a9 = bxki.m122801a(bxkj12.f163757b);
                                if (a9 == null) {
                                    a9 = bxki.IN_VEHICLE;
                                }
                                objArr3[0] = Integer.valueOf(a9.f163753x);
                                objArr3[1] = Integer.valueOf(bxkj12.f163758c);
                            }
                        }
                        m9841l();
                        this.f14442l = (bxkl) bxkk2.mo74062i();
                    } else {
                        return;
                    }
                } else {
                    bxkl bxkl4 = (bxkl) bxkk2.mo74062i();
                    bxwc bxwc = bxkl4.f163762a;
                    int size3 = bxwc.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size3) {
                            bxkj = (bxkj) bxwc.get(i14);
                            if (bxkj.f163758c == 100) {
                                bxki a10 = bxki.m122801a(bxkj.f163757b);
                                if (a10 == null) {
                                    a10 = bxki.IN_VEHICLE;
                                }
                                if (a10 == bxki.RUNNING) {
                                    break;
                                }
                                bxki a11 = bxki.m122801a(bxkj.f163757b);
                                if (a11 == null) {
                                    a11 = bxki.IN_VEHICLE;
                                }
                                if (a11 != bxki.WALKING) {
                                    bxki a12 = bxki.m122801a(bxkj.f163757b);
                                    if (a12 == null) {
                                        a12 = bxki.IN_VEHICLE;
                                    }
                                    if (a12 == bxki.TILTING) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i14++;
                        } else {
                            bxki a13 = bxki.m122801a(((bxkj) bxkl4.f163762a.get(0)).f163757b);
                            if (a13 == null) {
                                a13 = bxki.IN_VEHICLE;
                            }
                            bxki a14 = bxki.m122801a(((bxkj) bxkl2.f163762a.get(0)).f163757b);
                            if (a14 == null) {
                                a14 = bxki.IN_VEHICLE;
                            }
                            c = a13 != a14 ? a13 != bxki.UNKNOWN ? a13 == bxki.STILL ? (char) 1 : 2 : 1 : 0;
                        }
                    }
                    Object[] objArr4 = new Object[1];
                    bxki a15 = bxki.m122801a(bxkj.f163757b);
                    if (a15 == null) {
                        a15 = bxki.IN_VEHICLE;
                    }
                    objArr4[0] = Integer.valueOf(a15.f163753x);
                    c = 0;
                    if (c == 2) {
                        bxkl bxkl5 = (bxkl) bxkk2.mo74062i();
                        SparseIntArray sparseIntArray3 = this.f14443m;
                        if (sparseIntArray3 == null) {
                            this.f14443m = new SparseIntArray();
                        } else {
                            sparseIntArray3.clear();
                        }
                        bxwc bxwc2 = bxkl5.f163762a;
                        int size4 = bxwc2.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            bxkj bxkj13 = (bxkj) bxwc2.get(i15);
                            SparseIntArray sparseIntArray4 = this.f14443m;
                            bxki a16 = bxki.m122801a(bxkj13.f163757b);
                            if (a16 == null) {
                                a16 = bxki.IN_VEHICLE;
                            }
                            sparseIntArray4.put(a16.f163753x, bxkj13.f163758c);
                        }
                        m9840b(cdgp.f180782a.mo6606a().mo77584d());
                        this.f14445o = e;
                        this.f14444n = e + 1;
                        return;
                    }
                    this.f14442l = (bxkl) bxkk2.mo74062i();
                    if (c != 0) {
                        return;
                    }
                }
            }
            WriteBatchImpl b2 = tjj.m37080b();
            if (this.f14441k != null) {
                b2.mo18101a(m9842m());
            }
            long a17 = dwq.m9665i().mo20505a();
            tip tip = new tip(1, 6, 2);
            tip.mo26574a(tka.m37119b(a17));
            tip.mo26572a(bxkl.f163760c, (bxkl) bxkk2.mo74062i());
            ContextData a18 = tip.mo26570a();
            this.f14441k = a18;
            b2.mo18101a(a18);
            if (dss.m9250a(2)) {
                for (bxkj bxkj14 : Collections.unmodifiableList(((bxkl) bxkk2.f164949b).f163762a)) {
                    Object[] objArr5 = new Object[2];
                    bxki a19 = bxki.m122801a(bxkj14.f163757b);
                    if (a19 == null) {
                        a19 = bxki.IN_VEHICLE;
                    }
                    objArr5[0] = Integer.valueOf(a19.f163753x);
                    objArr5[1] = Integer.valueOf(bxkj14.f163758c);
                }
            }
            mo9852a(b2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9881j();
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        new Object[1][0] = dwa;
        this.f14448r.mo9897a(dwa);
        m9841l();
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        Object[] objArr = {dwa, dwa2};
        this.f14448r.mo9898a(dwa, dwa2);
        m9841l();
    }
}
