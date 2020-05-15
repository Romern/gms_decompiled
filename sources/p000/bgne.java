package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bgne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgne implements Cloneable, bfma {

    /* renamed from: h */
    public static final int[] f116851h = {0, 1, 3, 4, 7, 8};

    /* renamed from: o */
    private static final Comparator f116852o = new bgnc();

    /* renamed from: t */
    private static final List f116853t = Collections.singletonList(new DetectedActivity(3, 100));

    /* renamed from: c */
    public final bgmk f116854c;

    /* renamed from: d */
    public final cijj f116855d = new cijg();

    /* renamed from: e */
    public final HashSet f116856e = new HashSet();

    /* renamed from: f */
    public final TreeMap f116857f = new TreeMap();

    /* renamed from: g */
    public final bgnd f116858g;

    /* renamed from: i */
    public long f116859i = -1;

    /* renamed from: j */
    public long f116860j = -1;

    /* renamed from: k */
    public long f116861k = -1;

    /* renamed from: l */
    public int f116862l = bevp.UNKNOWN.f112768am;

    /* renamed from: m */
    public long f116863m = -1;

    /* renamed from: n */
    public long f116864n = -1;

    /* renamed from: p */
    private final bhcj f116865p;

    /* renamed from: q */
    private final besm f116866q;

    /* renamed from: r */
    private final Class f116867r;

    /* renamed from: s */
    private final List f116868s;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public bgne(bgmk bgmk, bhcj bhcj, besm besm, Class cls, bgnd bgnd) {
        char c;
        this.f116854c = bgmk;
        this.f116865p = bhcj;
        this.f116866q = besm;
        this.f116867r = cls;
        this.f116858g = bgnd;
        String str = bgnd.f116841a;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = -1;
        } else {
            switch (str.hashCode()) {
                case -2026200673:
                    if (str.equals("RUNNING")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1584802318:
                    if (str.equals("IN_VEHICLE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 79227272:
                    if (str.equals("STILL")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1071255167:
                    if (str.equals("ON_BICYCLE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1836798297:
                    if (str.equals("WALKING")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    i = 1;
                } else if (c == 2) {
                    i = 8;
                } else if (c == 3) {
                    i = 7;
                } else if (c != 4) {
                    StringBuilder sb = new StringBuilder(str.length() + 31);
                    sb.append("Mock activity ");
                    sb.append(str);
                    sb.append(" is not supported");
                    sb.toString();
                    i = -1;
                } else {
                    i = 3;
                }
            }
        }
        this.f116868s = i != -1 ? Collections.singletonList(new DetectedActivity(i, 100)) : null;
    }

    /* renamed from: a */
    private final int m99373a(long j, int i) {
        while (true) {
            cijj cijj = this.f116855d;
            if (i >= ((cijg) cijj).f190437b || cijj.mo86163a(i) > j) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private final ActivityRecognitionResult m99376b(bflz bflz) {
        ActivityRecognitionResult activityRecognitionResult;
        bflz bflz2 = bflz;
        bmxy.m108601b(this.f116859i != -1, "onFlushCompleted must called before getting the results.");
        if (this.f116857f.isEmpty()) {
            return null;
        }
        List list = this.f116868s;
        if (list != null) {
            return m99375a(new ActivityRecognitionResult(list, this.f116860j, this.f116859i, this.f116862l, (Bundle) null), bflz2);
        }
        if ((this.f116862l >> 16) != 19) {
            Map.Entry lastEntry = this.f116857f.lastEntry();
            bmxy.m108581a(lastEntry);
            return m99375a(new ActivityRecognitionResult((List) lastEntry.getValue(), this.f116860j, this.f116859i, this.f116862l, (Bundle) null), bflz2);
        } else if (SystemClock.elapsedRealtime() - this.f116861k > this.f116858g.f116843c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f116861k;
            long j2 = this.f116858g.f116843c;
            StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
            sb.append("CHRE AR is idling, millisSinceBoot=");
            sb.append(elapsedRealtime);
            sb.append(", lastResultFlushedTimeSinceBootMs=");
            sb.append(j);
            sb.append(", chreArTimeoutToIdleMs=");
            sb.append(j2);
            sb.toString();
            return m99375a(new ActivityRecognitionResult(f116853t, this.f116860j, this.f116859i, bevp.CHRE_IDLE.f112768am, m99377e()), bflz2);
        } else {
            if (this.f116866q != null && this.f116862l != bevp.CHRE_DNN_GRU_V1.f112768am && this.f116862l != bevp.CHRE_CNN_GRU_V1.f112768am) {
                this.f116866q.mo61070a();
                if (this.f116867r != beru.class || (activityRecognitionResult = this.f116866q.mo61069a(this.f116857f, System.currentTimeMillis(), this.f116860j, this.f116859i, m99377e())) == null) {
                    Iterator it = this.f116857f.descendingMap().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry lastEntry2 = this.f116857f.lastEntry();
                        bmxy.m108581a(lastEntry2);
                        if (((Long) lastEntry2.getKey()).longValue() - ((Long) entry.getKey()).longValue() > this.f116858g.f116844d) {
                            break;
                        }
                        ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult((List) entry.getValue(), this.f116860j, this.f116859i, this.f116862l, m99377e());
                        String valueOf = String.valueOf(activityRecognitionResult2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb2.append("adding to majority vote: ");
                        sb2.append(valueOf);
                        sb2.toString();
                        ActivityRecognitionResult a = this.f116866q.mo61068a(activityRecognitionResult2);
                        if (a != null) {
                            activityRecognitionResult = a;
                            break;
                        }
                    }
                }
                return m99375a(activityRecognitionResult, bflz2);
            }
            Map.Entry lastEntry3 = this.f116857f.lastEntry();
            bmxy.m108581a(lastEntry3);
            activityRecognitionResult = new ActivityRecognitionResult((List) lastEntry3.getValue(), this.f116860j, this.f116859i, this.f116862l, m99377e());
            return m99375a(activityRecognitionResult, bflz2);
        }
    }

    /* renamed from: e */
    private final Bundle m99377e() {
        long j = this.f116864n;
        if (j == -1) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("test_sensor_lag", j);
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final long mo61913c() {
        long j = -1;
        if (!this.f116855d.isEmpty()) {
            cijj cijj = this.f116855d;
            j = Math.max(-1L, cijj.mo86163a(((cijg) cijj).f190437b - 1));
        }
        return !this.f116857f.isEmpty() ? Math.max(j, ((Long) this.f116857f.lastKey()).longValue()) : j;
    }

    /* renamed from: d */
    public final bgne clone() {
        return new bgne(this);
    }

    /* renamed from: a */
    private final int m99374a(long j, int i, long j2, List list) {
        int i2 = i;
        long j3 = j2;
        cijj cijj = this.f116855d;
        if (i2 >= ((cijg) cijj).f190437b) {
            return i2;
        }
        long a = cijj.mo86163a(i2);
        if (a >= j3) {
            return i2;
        }
        list.add(new ActivityRecognitionResult(new DetectedActivity(5, 100), j + a, a, this.f116862l, (Bundle) null));
        return m99373a(j3, i2);
    }

    /* renamed from: a */
    private final ActivityRecognitionResult m99375a(ActivityRecognitionResult activityRecognitionResult, bflz bflz) {
        return bflz.mo61907a(this.f116865p.mo60984c(activityRecognitionResult));
    }

    /* renamed from: a */
    public final List mo61908a(long j) {
        return mo61909a(j, 60000, bfma.f114381a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final List mo61909a(long j, long j2, bflz bflz) {
        long j3;
        ArrayList arrayList;
        long j4;
        long j5;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j6;
        long j7;
        int i2;
        long j8;
        long j9 = j;
        bflz bflz2 = bflz;
        bmxy.m108601b(this.f116859i != -1, "onFlushCompleted must called before getting the results.");
        if (!this.f116857f.isEmpty() && this.f116859i - ((Long) this.f116857f.firstKey()).longValue() > 600000) {
            Locale locale = Locale.US;
            Object[] objArr = {Long.valueOf(this.f116859i), this.f116857f.firstKey()};
        }
        if (this.f116857f.ceilingEntry(Long.valueOf(1 + j9)) == null && this.f116859i - j9 < 1000) {
            return Collections.emptyList();
        }
        long min = Math.min(j2 / 2, 10000L);
        int a = m99373a(j9, 0);
        long e = bgof.m99492e();
        Locale locale2 = Locale.US;
        Object[] objArr2 = {Long.valueOf(j), new Date(e + j9), Long.valueOf(j2), this.f116857f};
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(this.f116857f.entrySet());
        long j10 = this.f116859i;
        long j11 = j9 + j2;
        int i3 = a;
        int i4 = 0;
        long j12 = j11;
        long j13 = j9;
        while (j12 <= j10) {
            int i5 = i3;
            int i6 = i4;
            while (true) {
                if (i6 >= arrayList5.size()) {
                    j3 = j10;
                    arrayList = arrayList5;
                    j4 = min;
                    j5 = j12;
                    i = i6;
                    break;
                }
                Map.Entry entry = (Map.Entry) arrayList5.get(i6);
                long longValue = ((Long) entry.getKey()).longValue();
                if (longValue > j12) {
                    j3 = j10;
                    arrayList = arrayList5;
                    j4 = min;
                    j5 = j12;
                    i = i6;
                    break;
                }
                if (longValue > j13 + 500) {
                    ActivityRecognitionResult a2 = m99375a(new ActivityRecognitionResult((List) entry.getValue(), e + longValue, longValue, this.f116862l, m99377e()), bflz2);
                    j7 = min;
                    j8 = j12;
                    i2 = i6;
                    j6 = j10;
                    arrayList3 = arrayList5;
                    i5 = m99374a(e, i5, longValue, arrayList4);
                    if (a2 != null) {
                        arrayList4.add(a2);
                    }
                } else {
                    j6 = j10;
                    arrayList3 = arrayList5;
                    j7 = min;
                    j8 = j12;
                    i2 = i6;
                }
                i6 = i2 + 1;
                arrayList5 = arrayList3;
                j12 = j8;
                min = j7;
                j10 = j6;
            }
            int i7 = i - 1;
            if (i7 < 0) {
                arrayList2 = arrayList;
            } else if (i7 >= arrayList.size()) {
                arrayList2 = arrayList;
            } else if (arrayList4.isEmpty() || ((ActivityRecognitionResult) arrayList4.get(arrayList4.size() - 1)).f79302c != j5) {
                if (this.f116859i - j5 > j4) {
                    arrayList2 = arrayList;
                    Map.Entry entry2 = (Map.Entry) arrayList2.get(i7);
                    List list = (List) entry2.getValue();
                    if (!list.isEmpty()) {
                        if (((DetectedActivity) list.get(0)).mo43513a() == 3 && j5 - ((Long) entry2.getKey()).longValue() > 480000) {
                        }
                    }
                    int a3 = m99374a(e, i5, j5, arrayList4);
                    ActivityRecognitionResult a4 = m99375a(new ActivityRecognitionResult((List) entry2.getValue(), e + j5, j5, this.f116862l, m99377e()), bflz2);
                    if (a4 != null) {
                        arrayList4.add(a4);
                    }
                    i3 = a3;
                    j13 = j5;
                    j12 = j5 + j2;
                    i4 = i;
                    arrayList5 = arrayList2;
                    min = j4;
                    j10 = j3;
                } else {
                    arrayList2 = arrayList;
                }
                i3 = i5;
                j12 = j5 + j2;
                i4 = i;
                arrayList5 = arrayList2;
                min = j4;
                j10 = j3;
            } else {
                arrayList2 = arrayList;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("No result at: ");
            sb.append(j5);
            sb.toString();
            i3 = i5;
            j12 = j5 + j2;
            i4 = i;
            arrayList5 = arrayList2;
            min = j4;
            j10 = j3;
        }
        ActivityRecognitionResult b = m99376b(bflz2);
        if (b != null) {
            m99374a(e, i3, b.f79302c, arrayList4);
            arrayList4.add(b);
        }
        Collections.sort(arrayList4, f116852o);
        return arrayList4;
    }

    private bgne(bgne bgne) {
        this.f116854c = bgne.f116854c;
        cijj cijj = this.f116855d;
        cijj cijj2 = bgne.f116855d;
        cijg cijg = (cijg) cijj;
        int i = cijg.f190437b;
        ((cije) cijj).mo86187d(i);
        cijg cijg2 = (cijg) cijj2;
        int i2 = cijg2.f190437b;
        if (i2 != 0) {
            cijg.mo86200h(cijg.f190437b + i2);
            int i3 = cijg.f190437b;
            if (i != i3) {
                long[] jArr = cijg.f190436a;
                System.arraycopy(jArr, i, jArr, i + i2, i3 - i);
            }
            long[] jArr2 = cijg.f190436a;
            int length = jArr2.length;
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Offset (" + i + ") is negative");
            } else if (i2 >= 0) {
                int i4 = i + i2;
                if (i4 <= length) {
                    System.arraycopy(cijg2.f190436a, 0, jArr2, i, i2);
                    cijg.f190437b += i2;
                } else {
                    throw new ArrayIndexOutOfBoundsException("Last index (" + i4 + ") is greater than array length (" + length + ")");
                }
            } else {
                throw new IllegalArgumentException("Length (" + i2 + ") is negative");
            }
        }
        this.f116856e.addAll(bgne.f116856e);
        this.f116857f.putAll(bgne.f116857f);
        this.f116859i = bgne.f116859i;
        this.f116860j = bgne.f116860j;
        this.f116861k = bgne.f116861k;
        this.f116865p = bgne.f116865p;
        this.f116866q = bgne.f116866q;
        this.f116867r = bgne.f116867r;
        this.f116868s = bgne.f116868s;
        this.f116862l = bgne.f116862l;
        this.f116863m = bgne.f116863m;
        this.f116864n = bgne.f116864n;
        this.f116858g = bgne.f116858g;
    }

    /* renamed from: b */
    public final List mo61912b() {
        return mo61910a(bfma.f114381a);
    }

    /* renamed from: a */
    public final List mo61910a(bflz bflz) {
        boolean z;
        boolean z2;
        ActivityRecognitionResult activityRecognitionResult;
        int i;
        int i2 = 1;
        if (this.f116859i != -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "onFlushCompleted must called before getting the results.");
        if (this.f116859i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "onFlushCompleted must called before getting the results.");
        if (!this.f116855d.isEmpty()) {
            long a = this.f116855d.mo86163a(0);
            activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(5, 100), bgof.m99492e() + a, a, this.f116862l, (Bundle) null);
        } else {
            activityRecognitionResult = null;
        }
        ActivityRecognitionResult b = m99376b(bflz);
        if (activityRecognitionResult == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (b == null) {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(i + i2);
        if (activityRecognitionResult != null) {
            arrayList.add(activityRecognitionResult);
        }
        if (b != null) {
            arrayList.add(b);
        }
        Collections.sort(arrayList, f116852o);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final List mo63021a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = f116851h;
        int length = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            int intValue = ((!collection.contains(Integer.valueOf(i3)) && (!collection.isEmpty() || i3 != 4)) ? this.f116858g.f116850j : this.f116858g.f116849i).intValue();
            arrayList.add(new DetectedActivity(i3, intValue));
            if (i3 == 7 || i3 == 8) {
                i += intValue;
            }
        }
        arrayList.add(new DetectedActivity(2, i));
        Collections.sort(arrayList, DetectedActivity.f79316a);
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo61911a() {
        return !this.f116855d.isEmpty() || !this.f116857f.isEmpty();
    }
}
