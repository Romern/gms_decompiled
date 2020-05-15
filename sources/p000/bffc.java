package p000;

import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: bffc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffc implements Runnable {

    /* renamed from: a */
    private final bffa f113621a;

    /* renamed from: b */
    private final Set f113622b;

    /* renamed from: c */
    private final bfho f113623c;

    /* renamed from: d */
    private final long f113624d;

    /* renamed from: e */
    private final long f113625e;

    /* renamed from: f */
    private final Context f113626f;

    /* renamed from: g */
    private final bfhb f113627g;

    /* renamed from: h */
    private final bffr f113628h;

    public bffc(Context context, bfhb bfhb, bfho bfho, Set set, long j, long j2, bffr bffr, bffa bffa) {
        this.f113621a = bffa;
        this.f113626f = context;
        this.f113628h = bffr;
        this.f113627g = bfhb;
        this.f113622b = set;
        this.f113623c = bfho;
        this.f113624d = j;
        this.f113625e = j2;
    }

    public final void run() {
        bfdz bfdz;
        int i;
        ArrayList arrayList = new ArrayList(this.f113622b.size());
        Iterator it = this.f113622b.iterator();
        while (true) {
            char c = 1;
            char c2 = 0;
            if (it.hasNext()) {
                bfgt bfgt = (bfgt) it.next();
                bffa bffa = this.f113621a;
                synchronized (((bfeb) bffa).f113550c) {
                    bfdz = (bfdz) ((bfeb) bffa).f113553f.get(bfgt.f113836x);
                }
                String str = bfgt.f113838z;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
                sb.append("Adding ");
                sb.append(str);
                sb.append(" buffer to replay list");
                sb.toString();
                if (bfdz != null) {
                    bfkf bfkf = bfdz.f113541a;
                    long j = this.f113624d;
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Scan duration past time ");
                    sb2.append(j);
                    sb2.toString();
                    if (bfkf.mo61831a()) {
                        String str2 = bfgt.f113838z;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 34);
                        sb3.append("Buffer is empty for scanner type ");
                        sb3.append(str2);
                        sb3.append(".");
                        sb3.toString();
                    } else if (this.f113624d == Long.MAX_VALUE) {
                        arrayList.add(new bffb(bfgt, bfkf, 0));
                    } else {
                        long j2 = this.f113625e;
                        if (j2 <= 0) {
                            j2 = bfkf.mo61829a(bfkf.f114284c - 1) - TimeUnit.NANOSECONDS.convert(this.f113624d, TimeUnit.MILLISECONDS);
                            i = bfkf.mo61827a(j2);
                        } else {
                            i = 1 + bfkf.mo61827a(j2);
                        }
                        long nanos = TimeUnit.MILLISECONDS.toNanos(500);
                        if (i < 0 || (i < bfkf.f114284c && j2 - bfkf.mo61829a(i) > nanos)) {
                            i = bfkf.mo61828a(j2, i);
                        }
                        if (i >= 0 && i < bfkf.f114284c) {
                            arrayList.add(new bffb(bfgt, bfkf, i));
                        } else {
                            String str3 = bfgt.f113838z;
                            long j3 = this.f113624d;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 81);
                            sb4.append("No data was collected for scanner type ");
                            sb4.append(str3);
                            sb4.append(" in last ");
                            sb4.append(j3);
                            sb4.append(" millisecond.");
                            sb4.toString();
                        }
                    }
                } else {
                    String str4 = bfgt.f113838z;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 36);
                    sb5.append("Batch for scanner type ");
                    sb5.append(str4);
                    sb5.append(" not enabled.");
                    sb5.toString();
                }
            } else {
                int i2 = 2;
                if (!this.f113623c.f113939c) {
                    long b = this.f113627g.mo61687b();
                    while (!arrayList.isEmpty()) {
                        long j4 = Long.MAX_VALUE;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < arrayList.size()) {
                            bffb bffb = (bffb) arrayList.get(i3);
                            long a = bffb.f113619b.mo61829a(bffb.f113620c);
                            long j5 = a < j4 ? a : j4;
                            if (a < j4) {
                                i4 = i3;
                            }
                            i3++;
                            j4 = j5;
                        }
                        bffb bffb2 = (bffb) arrayList.get(i4);
                        int i5 = bffb2.f113618a.f113834A;
                        bmxy.m108601b(i5 == bffb2.f113619b.f114282a, "Sensor dimension mismatch.");
                        int i6 = bffb2.f113620c;
                        bffb2.f113620c = i6 + 1;
                        long a2 = bffb2.f113619b.mo61829a(i6);
                        long j6 = a2 - b;
                        Sensor a3 = this.f113628h.mo61624a(bffb2.f113618a);
                        if (a3 != null) {
                            if (i5 == 1) {
                                bfho bfho = this.f113623c;
                                float a4 = bffb2.f113619b.mo61826a(i6, 0);
                                synchronized (bfho.f113937a) {
                                    bfne bfne = (bfne) bfho.f113941e.get(Integer.valueOf(a3.getType()));
                                    bfho.f113946k.put(Integer.valueOf(a3.getType()), Long.valueOf(a2));
                                    if (bfne != null) {
                                        bfgw bfgw = (bfgw) bfne.f114467a;
                                        Handler handler = (Handler) bfne.f114468b;
                                        bmxy.m108581a(bfgw);
                                        bmxy.m108581a(handler);
                                        handler.post(new bfhl(bfgw, a3, a2, j6, a4));
                                    }
                                }
                            } else if (i5 == 3) {
                                bfho bfho2 = this.f113623c;
                                float a5 = bffb2.f113619b.mo61826a(i6, 0);
                                float a6 = bffb2.f113619b.mo61826a(i6, 1);
                                float a7 = bffb2.f113619b.mo61826a(i6, 2);
                                synchronized (bfho2.f113937a) {
                                    bfne bfne2 = (bfne) bfho2.f113941e.get(Integer.valueOf(a3.getType()));
                                    bfho2.f113946k.put(Integer.valueOf(a3.getType()), Long.valueOf(a2));
                                    if (bfne2 != null) {
                                        bfgw bfgw2 = (bfgw) bfne2.f114467a;
                                        Handler handler2 = (Handler) bfne2.f114468b;
                                        bmxy.m108581a(bfgw2);
                                        bmxy.m108581a(handler2);
                                        handler2.post(new bfhm(bfgw2, a3, a2, j6, a5, a6, a7));
                                    }
                                }
                            } else if (i5 == 6) {
                                bfho bfho3 = this.f113623c;
                                float a8 = bffb2.f113619b.mo61826a(i6, 0);
                                float a9 = bffb2.f113619b.mo61826a(i6, 1);
                                float a10 = bffb2.f113619b.mo61826a(i6, 2);
                                float a11 = bffb2.f113619b.mo61826a(i6, 3);
                                float a12 = bffb2.f113619b.mo61826a(i6, 4);
                                float a13 = bffb2.f113619b.mo61826a(i6, 5);
                                synchronized (bfho3.f113937a) {
                                    bfne bfne3 = (bfne) bfho3.f113941e.get(Integer.valueOf(a3.getType()));
                                    bfho3.f113946k.put(Integer.valueOf(a3.getType()), Long.valueOf(a2));
                                    if (bfne3 != null) {
                                        bfgw bfgw3 = (bfgw) bfne3.f114467a;
                                        Handler handler3 = (Handler) bfne3.f114468b;
                                        bmxy.m108581a(bfgw3);
                                        bmxy.m108581a(handler3);
                                        handler3.post(new bfhn(bfgw3, a3, a2, j6, a8, a9, a10, a11, a12, a13));
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Unknown sensor dimension.");
                            }
                        }
                        if (bffb2.mo61571a()) {
                            arrayList.remove(i4);
                        }
                    }
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        bffb bffb3 = (bffb) arrayList.get(i7);
                        long b2 = this.f113627g.mo61687b();
                        bfkf bfkf2 = bffb3.f113619b;
                        int i8 = bfkf2.f114284c;
                        int i9 = bffb3.f113620c;
                        int i10 = i8 - i9;
                        StringBuilder sb6 = new StringBuilder(46);
                        sb6.append("buffer.getCount()=");
                        sb6.append(i8);
                        sb6.append(", pos=");
                        sb6.append(i9);
                        sb6.toString();
                        int i11 = bfkf2.f114282a;
                        int[] iArr = new int[i2];
                        iArr[c] = i10;
                        iArr[c2] = i11;
                        float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                        long[] jArr = new long[i10];
                        long[] jArr2 = new long[i10];
                        int i12 = 0;
                        while (!bffb3.mo61571a()) {
                            int i13 = bffb3.f113620c;
                            bffb3.f113620c = i13 + 1;
                            long a14 = bfkf2.mo61829a(i13);
                            long j7 = (a14 - b2) / 1000000;
                            for (int i14 = 0; i14 < bfkf2.f114282a; i14++) {
                                fArr[i14][i12] = bfkf2.mo61826a(i13, i14);
                            }
                            jArr[i12] = a14;
                            jArr2[i12] = j7;
                            i12++;
                        }
                        StringBuilder sb7 = new StringBuilder(31);
                        sb7.append("Replay event count: ");
                        sb7.append(i12);
                        sb7.toString();
                        if (i12 == i10) {
                            Sensor a15 = this.f113628h.mo61624a(bffb3.f113618a);
                            if (a15 != null) {
                                this.f113623c.mo61704a(a15, jArr, jArr2, fArr);
                            }
                            i7++;
                            i2 = 2;
                            c = 1;
                            c2 = 0;
                        } else {
                            throw new IllegalStateException("Wrong event size.");
                        }
                    }
                }
                bfho bfho4 = this.f113623c;
                if (bfho4.f113940d) {
                    Context context = this.f113626f;
                    if (bfho4.f113948m.mo62924b(bgnq.COLLECTIONLIB_REPLAYER)) {
                        bfho4.f113948m.mo62925c(bgnq.COLLECTIONLIB_REPLAYER);
                    }
                    AlarmManager alarmManager = bfho4.f113943g;
                    if (alarmManager != null) {
                        context.registerReceiver(bfho4.f113949n, new IntentFilter(bfho4.f113945j));
                        bfho.m96782a(alarmManager, 0, SystemClock.elapsedRealtime() + 30000, bfho4.f113944h);
                        return;
                    }
                    return;
                }
                bfho4.mo61706b();
                return;
            }
        }
        while (true) {
        }
    }
}
