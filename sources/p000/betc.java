package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: betc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betc implements besm {

    /* renamed from: a */
    private int f112348a;

    /* renamed from: b */
    private int f112349b;

    /* renamed from: c */
    private final int f112350c;

    /* renamed from: d */
    private final int f112351d;

    /* renamed from: e */
    private final int f112352e;

    /* renamed from: f */
    private final int f112353f;

    /* renamed from: g */
    private final bhcj f112354g;

    /* renamed from: h */
    private final betb f112355h;

    /* renamed from: i */
    private final boolean f112356i;

    /* renamed from: j */
    private final List f112357j;

    /* renamed from: k */
    private final List f112358k;

    /* renamed from: l */
    private int f112359l;

    public betc(bhcj bhcj, betb betb, boolean z) {
        int i;
        int i2;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        if (!z) {
            i2 = 5;
        } else {
            i2 = 4;
        }
        this.f112359l = 0;
        bxbm.m122544b(true);
        bxbm.m122544b(true);
        this.f112354g = bhcj;
        this.f112355h = betb;
        this.f112356i = z;
        this.f112350c = i;
        this.f112351d = i2;
        this.f112352e = i;
        this.f112353f = i2;
        this.f112348a = i;
        this.f112349b = i2;
        this.f112357j = new ArrayList(i - 1);
        this.f112358k = new ArrayList(i2);
    }

    /* renamed from: a */
    private static final ActivityRecognitionResult m95747a(List list) {
        int i;
        int size = list.size();
        ActivityRecognitionResult activityRecognitionResult = null;
        for (int i2 = 0; i2 < size; i2++) {
            ActivityRecognitionResult activityRecognitionResult2 = (ActivityRecognitionResult) list.get(i2);
            if (activityRecognitionResult == null || activityRecognitionResult.f79301b < activityRecognitionResult2.f79301b) {
                activityRecognitionResult = activityRecognitionResult2;
            }
        }
        TreeMap treeMap = new TreeMap();
        int size2 = list.size();
        int i3 = 0;
        while (i3 < size2) {
            Iterator it = ((ActivityRecognitionResult) list.get(i3)).f79300a.iterator();
            while (true) {
                i = i3 + 1;
                if (!it.hasNext()) {
                    break;
                }
                DetectedActivity detectedActivity = (DetectedActivity) it.next();
                Integer num = (Integer) treeMap.get(Integer.valueOf(detectedActivity.mo43513a()));
                if (num == null) {
                    num = 0;
                }
                treeMap.put(Integer.valueOf(detectedActivity.mo43513a()), Integer.valueOf(num.intValue() + detectedActivity.f79320e));
            }
            i3 = i;
        }
        return new ActivityRecognitionResult(beqr.m95447a(treeMap, (double) list.size(), true), activityRecognitionResult.f79301b, activityRecognitionResult.f79302c, activityRecognitionResult.f79303d, activityRecognitionResult.mo43493c());
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo61069a(TreeMap treeMap, long j, long j2, long j3, Bundle bundle) {
        return besl.m95710a();
    }

    /* renamed from: b */
    public final void mo61071b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0230  */
    /* renamed from: a */
    public final ActivityRecognitionResult mo61068a(ActivityRecognitionResult activityRecognitionResult) {
        ActivityRecognitionResult activityRecognitionResult2;
        int size;
        boolean z;
        ActivityRecognitionResult activityRecognitionResult3;
        this.f112359l++;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(activityRecognitionResult.f79300a);
        ActivityRecognitionResult activityRecognitionResult4 = new ActivityRecognitionResult(arrayList, activityRecognitionResult.f79301b, activityRecognitionResult.f79302c, activityRecognitionResult.f79303d, activityRecognitionResult.mo43493c());
        this.f112358k.add(activityRecognitionResult4);
        if (this.f112356i) {
            int a = activityRecognitionResult4.mo43490a(7);
            if (activityRecognitionResult4.mo43490a(8) == 100 || a == 100) {
                return new ActivityRecognitionResult(activityRecognitionResult4.f79300a, activityRecognitionResult4.f79301b, activityRecognitionResult4.f79302c, activityRecognitionResult4.f79303d, activityRecognitionResult4.mo43493c());
            }
        }
        if (this.f112356i) {
            activityRecognitionResult2 = ((berb) this.f112355h).f112195v;
        } else {
            activityRecognitionResult2 = ((berb) this.f112355h).f112194u;
        }
        String valueOf = String.valueOf(((berb) this.f112355h).f112194u);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("isFirstResultSameAsPreviousReport: previous=");
        sb.append(valueOf);
        sb.toString();
        if (activityRecognitionResult2 != null && this.f112357j.isEmpty() && activityRecognitionResult4.mo43492b().mo43513a() == activityRecognitionResult2.mo43492b().mo43513a()) {
            Integer valueOf2 = Integer.valueOf(activityRecognitionResult4.mo43491a().mo43513a());
            if (valueOf2.intValue() == 0 || valueOf2.intValue() == 1 || valueOf2.intValue() == 2 || valueOf2.intValue() == 3) {
                ActivityRecognitionResult a2 = m95747a(this.f112358k);
                String valueOf3 = String.valueOf(a2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                sb2.append("Same as last. Reporting: ");
                sb2.append(valueOf3);
                sb2.toString();
                return a2;
            }
        }
        if (activityRecognitionResult4.mo43491a().mo43513a() != 5) {
            betb betb = this.f112355h;
            if (!cese.m138159h() || activityRecognitionResult4.mo43491a().mo43513a() != 0 || !((berb) betb).f112118F.mo61150b()) {
                int size2 = this.f112357j.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        size = this.f112357j.size();
                        break;
                    } else if (activityRecognitionResult4.mo43492b().mo43513a() != ((ActivityRecognitionResult) this.f112357j.get(size2)).mo43492b().mo43513a()) {
                        size = this.f112357j.size() - (size2 + 1);
                        break;
                    } else {
                        size2--;
                    }
                }
                int i = size + 1;
                int i2 = this.f112348a;
                if (this.f112359l + (i2 - i) > this.f112349b) {
                    z = true;
                } else {
                    z = false;
                }
                if (i >= i2 || z) {
                    StringBuilder sb3 = new StringBuilder(72);
                    sb3.append("Will reporting activity: consistent=");
                    sb3.append(i);
                    sb3.append(" maxAttemptsReached=");
                    sb3.append(z);
                    sb3.toString();
                    activityRecognitionResult3 = m95747a(this.f112358k);
                    int a3 = activityRecognitionResult3.mo43492b().mo43513a();
                    int i3 = this.f112352e;
                    int i4 = this.f112359l;
                    int i5 = this.f112353f;
                    if (i4 + (i3 - i) <= i5 && i < i3 && (a3 == 1 || a3 == 0 || a3 == 16 || a3 == 17 || a3 == 4)) {
                        this.f112348a = i3;
                        this.f112349b = i5;
                    }
                    if (activityRecognitionResult3 == null) {
                        ActivityRecognitionResult c = this.f112354g.mo60984c(activityRecognitionResult3);
                        bhcj bhcj = this.f112354g;
                        if (cese.m138165n() && ((berb) bhcj).f112170at && c.mo43491a().mo43513a() == 1) {
                            c = berb.m95480a(c, bevp.PHONE_RELABEL_BICYCLE_TO_UNKNOWN_WITH_WIFI.f112768am);
                        }
                        int i6 = this.f112359l;
                        String valueOf4 = String.valueOf(c);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 53);
                        sb4.append("Reporting activity: attempts=");
                        sb4.append(i6);
                        sb4.append(" finalResult=");
                        sb4.append(valueOf4);
                        sb4.toString();
                        return c;
                    }
                    if (this.f112357j.size() < this.f112348a - 1) {
                        String valueOf5 = String.valueOf(activityRecognitionResult4);
                        String valueOf6 = String.valueOf(this.f112357j);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 31 + String.valueOf(valueOf6).length());
                        sb5.append("Not enough history to decide: ");
                        sb5.append(valueOf5);
                        sb5.append(" ");
                        sb5.append(valueOf6);
                        sb5.toString();
                    } else {
                        String valueOf7 = String.valueOf(activityRecognitionResult4);
                        String valueOf8 = String.valueOf(this.f112357j);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 15 + String.valueOf(valueOf8).length());
                        sb6.append("Inconsistent: ");
                        sb6.append(valueOf7);
                        sb6.append(" ");
                        sb6.append(valueOf8);
                        sb6.toString();
                    }
                    if (activityRecognitionResult4.mo43491a().mo43513a() != 4) {
                        this.f112357j.add(activityRecognitionResult);
                    }
                    while (this.f112357j.size() >= this.f112348a) {
                        this.f112357j.remove(0);
                    }
                    return null;
                }
                activityRecognitionResult3 = null;
                if (activityRecognitionResult3 == null) {
                }
            } else {
                ActivityRecognitionResult activityRecognitionResult5 = new ActivityRecognitionResult(activityRecognitionResult4.f79300a, activityRecognitionResult4.f79301b, activityRecognitionResult4.f79302c, activityRecognitionResult4.f79303d, activityRecognitionResult4.mo43493c());
                String valueOf9 = String.valueOf(activityRecognitionResult5);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf9).length() + 68);
                sb7.append("Detecting as in vehicle and Bluetooth classifier agrees. Reporting: ");
                sb7.append(valueOf9);
                sb7.toString();
                return activityRecognitionResult5;
            }
        } else {
            throw new RuntimeException("TILTING is unexpected.");
        }
    }

    /* renamed from: a */
    public final void mo61070a() {
        this.f112357j.clear();
        this.f112358k.clear();
        this.f112359l = 0;
        this.f112348a = this.f112350c;
        this.f112349b = this.f112351d;
    }
}
