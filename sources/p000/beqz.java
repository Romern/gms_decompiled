package p000;

import com.google.android.gms.location.FloorChangeEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: beqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beqz extends beqv {

    /* renamed from: b */
    final /* synthetic */ bera f112096b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public beqz(bera bera) {
        super(bera);
        this.f112096b = bera;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0a90  */
    /* renamed from: a */
    public final void mo60953a(long j, long j2, bfku bfku, bfku bfku2, bfku bfku3) {
        long j3;
        long j4;
        bfku bfku4;
        bfku bfku5;
        int i;
        long j5;
        beqt beqt;
        bfku bfku6;
        bfku bfku7;
        long j6;
        bewc bewc;
        bequ bequ;
        int i2;
        besa besa;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j7;
        int i3;
        ArrayList arrayList3;
        besa besa2;
        besa besa3;
        long j8;
        int i4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        besa besa4;
        bfne bfne;
        int i5;
        bfku bfku8;
        ArrayList arrayList6;
        int i6;
        besa besa5;
        bewc bewc2;
        ArrayList arrayList7;
        int i7;
        ArrayList arrayList8;
        bfne bfne2;
        float f;
        long j9;
        ArrayList arrayList9;
        long j10;
        double d;
        double d2;
        float f2;
        bfne bfne3;
        long j11;
        long j12 = j2;
        bfku bfku9 = bfku;
        bfku bfku10 = bfku2;
        bfku bfku11 = bfku3;
        bfku a = bera.m95469a(bfku9, 40000000000L);
        long j13 = this.f112096b.f112098r;
        bfku a2 = bfku.mo61858a(j13 != -1 ? j13 + 1 : 0, 0, -1, 0);
        long j14 = this.f112096b.f112099s;
        if (j14 != -1) {
            j3 = j14 + 1;
        } else {
            j3 = 0;
        }
        bfku a3 = bfku2.mo61858a(j3, 0, -1, 0);
        long j15 = this.f112096b.f112100t;
        if (j15 != -1) {
            j4 = j15 + 1;
        } else {
            j4 = 0;
        }
        bfku a4 = bfku3.mo61858a(j4, 0, -1, 0);
        int i8 = bfku9.f114316b;
        if (i8 > 0) {
            this.f112096b.f112098r = bfku9.mo61857a(i8 - 1);
        }
        int i9 = bfku10.f114316b;
        if (i9 > 0) {
            this.f112096b.f112099s = bfku10.mo61857a(i9 - 1);
        }
        int i10 = bfku11.f114316b;
        if (i10 > 0) {
            this.f112096b.f112100t = bfku11.mo61857a(i10 - 1);
        }
        this.f112096b.mo60959b(a);
        beqw.m95470a(bfku9, a);
        this.f112096b.f112093q.mo62049a(bfos.ACCEL_SAMPLE_RATE, (int) Math.round(beqw.m95467a(a)));
        this.f112096b.f112081e.mo60944a(j, j2, bfgt.f113814d, a2);
        this.f112096b.f112081e.mo60944a(j, j2, bfgt.f113819i, a3);
        this.f112096b.f112081e.mo60944a(j, j2, bfgt.f113821k, a4);
        bera bera = this.f112096b;
        if (!bera.f112085i) {
            bfku5 = bfku9;
            bfku4 = a;
            i = 0;
        } else {
            bewc bewc3 = bera.f112086j;
            if (bewc3 != null) {
                besa besa6 = bera.f112105y;
                bequ bequ2 = bera.f112081e;
                int i11 = bfku9.f114316b;
                int i12 = bfku10.f114316b;
                long j16 = besa6.f112262b;
                StringBuilder sb = new StringBuilder(126);
                sb.append("Running floor change detection, accelSize=");
                sb.append(i11);
                sb.append(", baroSize=");
                sb.append(i12);
                sb.append(", timeSinceLastDetection: ");
                double d3 = (double) (j12 - j16);
                Double.isNaN(d3);
                sb.append(d3 * 0.001d);
                sb.append("s");
                sb.toString();
                if (bfku9.f114316b <= 1 || bfku10.f114316b <= 1 || j12 - besa6.f112262b < 40000) {
                    bfku5 = bfku9;
                    bfku4 = a;
                    i = 0;
                } else {
                    besa6.f112262b = j12;
                    bfku4 = a;
                    long max = Math.max(besa6.f112264d, Math.max(bfku9.mo61857a(0), bfku10.mo61857a(0)));
                    long min = Math.min(bfku9.mo61857a(bfku9.f114316b - 1), bfku10.mo61857a(bfku10.f114316b - 1));
                    besa6.f112263c = min;
                    if (!(besa6.f112266f instanceof bets)) {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        String floorChangeFakeEvent = cerp.f183389a.mo6606a().floorChangeFakeEvent();
                        if (floorChangeFakeEvent == null) {
                            bequ = bequ2;
                            besa = besa6;
                            bewc = bewc3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList11;
                            j6 = min;
                            i2 = 0;
                        } else if (floorChangeFakeEvent.length() > 0) {
                            String[] split = floorChangeFakeEvent.split(",");
                            bequ = bequ2;
                            if (split.length == 5) {
                                int parseInt = Integer.parseInt(split[0]);
                                int parseInt2 = Integer.parseInt(split[1]);
                                long parseLong = Long.parseLong(split[2]);
                                float parseFloat = Float.parseFloat(split[3]);
                                ArrayList arrayList12 = arrayList10;
                                int i13 = (int) (j12 / 60000);
                                if (besa6.f112265e + Integer.parseInt(split[4]) <= i13) {
                                    long j17 = j - parseLong;
                                    besa = besa6;
                                    i2 = 0;
                                    bewc = bewc3;
                                    arrayList2 = arrayList11;
                                    arrayList = arrayList12;
                                    j6 = min;
                                    arrayList.add(new FloorChangeEvent(parseInt, parseInt2, j17, j, j12 - parseLong, j2, parseFloat));
                                    besa.f112265e = i13;
                                    arrayList2.add(new bewb((parseInt + parseInt) - (parseFloat > 0.0f ? 1 : 0), j17 * 1000000, j * 1000000, parseFloat, parseInt2));
                                } else {
                                    besa = besa6;
                                    bewc = bewc3;
                                    arrayList2 = arrayList11;
                                    j6 = min;
                                    arrayList = arrayList12;
                                    i2 = 0;
                                }
                            } else {
                                besa = besa6;
                                bewc = bewc3;
                                arrayList = arrayList10;
                                arrayList2 = arrayList11;
                                j6 = min;
                                i2 = 0;
                            }
                        } else {
                            bequ = bequ2;
                            besa = besa6;
                            bewc = bewc3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList11;
                            j6 = min;
                            i2 = 0;
                        }
                        bfku a5 = bfku.mo61858a(max, 500000000, j6, 500000000);
                        bfku a6 = bfku2.mo61858a(max, 500000000, j6, 500000000);
                        int i14 = a5.f114316b;
                        if (i14 == 0) {
                            arrayList3 = arrayList;
                            besa3 = besa;
                            j8 = max;
                            i4 = 0;
                            bfku5 = bfku;
                        } else if (a6.f114316b != 0) {
                            bfku a7 = bewe.m95977a(a5, -100.0f, 100.0f);
                            bfku a8 = bewe.m95977a(a6, 200.0f, 1200.0f);
                            if (a7.f114316b == 0) {
                                bfne = bfne.m97311a(Collections.emptyList(), Integer.valueOf(i2));
                                arrayList5 = arrayList2;
                                arrayList4 = arrayList;
                                besa4 = besa;
                                j7 = max;
                                i = 0;
                            } else if (a8.f114316b != 0) {
                                long j18 = bewc.f112781a;
                                int a9 = ((int) ((a8.mo61857a(a8.f114316b - 1) - a8.mo61857a(0)) / j18)) + 1;
                                double[] dArr = new double[a9];
                                dArr[0] = (double) a8.mo61854a(0, 0);
                                int i15 = 1;
                                int i16 = 0;
                                while (i15 < a9) {
                                    ArrayList arrayList13 = arrayList2;
                                    ArrayList arrayList14 = arrayList;
                                    besa besa7 = besa;
                                    long j19 = max;
                                    long j20 = j18;
                                    bewc bewc4 = bewc;
                                    bfku bfku12 = a8;
                                    bfku bfku13 = a7;
                                    long a10 = bfku12.mo61857a(0) + (((long) i15) * j20);
                                    while (i16 < bfku12.f114316b - 1 && bfku12.mo61857a(i16) < a10) {
                                        i16++;
                                    }
                                    long a11 = bfku12.mo61857a(i16);
                                    int i17 = i16 - 1;
                                    long a12 = bfku12.mo61857a(i17);
                                    if (a11 == a12) {
                                        double a13 = (double) (bfku12.mo61854a(i16, 0) + bfku12.mo61854a(i17, 0));
                                        Double.isNaN(a13);
                                        dArr[i15] = a13 * 0.5d;
                                        j11 = j20;
                                    } else {
                                        j11 = j20;
                                        dArr[i15] = (double) (((bfku12.mo61854a(i17, 0) * ((float) (a11 - a10))) + (bfku12.mo61854a(i16, 0) * ((float) (a10 - a12)))) / ((float) (a11 - a12)));
                                    }
                                    i15++;
                                    bewc = bewc4;
                                    a8 = bfku12;
                                    a7 = bfku13;
                                    besa = besa7;
                                    max = j19;
                                    arrayList2 = arrayList13;
                                    j18 = j11;
                                    arrayList = arrayList14;
                                }
                                PriorityQueue priorityQueue = new PriorityQueue(35);
                                PriorityQueue priorityQueue2 = new PriorityQueue(35, Collections.reverseOrder());
                                priorityQueue.add(Double.valueOf(Double.POSITIVE_INFINITY));
                                priorityQueue2.add(Double.valueOf(Double.NEGATIVE_INFINITY));
                                double[] dArr2 = new double[a9];
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = -1;
                                while (i18 < a9) {
                                    int min2 = Math.min(i18, (a9 - i18) - 1);
                                    int max2 = Math.max(0, Math.max(i18 - 25, i18 - min2));
                                    long j21 = max;
                                    int min3 = Math.min(a9 - 1, Math.min(i18 + 25, min2 + i18));
                                    i19 = i19;
                                    while (i19 < max2) {
                                        if (dArr[i19] > ((Double) priorityQueue2.peek()).doubleValue()) {
                                            priorityQueue.remove(Double.valueOf(dArr[i19]));
                                        } else {
                                            priorityQueue2.remove(Double.valueOf(dArr[i19]));
                                        }
                                        i19++;
                                    }
                                    int i21 = i20;
                                    while (i21 < min3) {
                                        i21++;
                                        if (dArr[i21] > ((Double) priorityQueue2.peek()).doubleValue()) {
                                            priorityQueue.add(Double.valueOf(dArr[i21]));
                                        } else {
                                            priorityQueue2.add(Double.valueOf(dArr[i21]));
                                        }
                                    }
                                    while (priorityQueue2.size() < priorityQueue.size()) {
                                        priorityQueue2.add((Double) priorityQueue.poll());
                                    }
                                    while (priorityQueue2.size() > priorityQueue.size() + 1) {
                                        priorityQueue.add((Double) priorityQueue2.poll());
                                    }
                                    if (priorityQueue2.size() == priorityQueue.size() + 1) {
                                        dArr2[i18] = ((Double) priorityQueue2.peek()).doubleValue();
                                        i18++;
                                        i20 = i21;
                                        max = j21;
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                                j7 = max;
                                double[] dArr3 = new double[a9];
                                for (int i22 = 0; i22 < a9; i22++) {
                                    dArr3[i22] = ((Double) bewe.m95978a(dArr2, Math.max(0, i22 - 25), Math.min(a9 - 1, i22 + 25)).f114467a).doubleValue();
                                }
                                ArrayList arrayList15 = new ArrayList();
                                int i23 = 0;
                                int i24 = 0;
                                while (i24 < a9) {
                                    ArrayList arrayList16 = arrayList2;
                                    ArrayList arrayList17 = arrayList;
                                    besa besa8 = besa;
                                    bfku bfku14 = a8;
                                    double[] dArr4 = dArr2;
                                    bewc bewc5 = bewc;
                                    if (Math.abs(dArr3[i24]) > 0.00125d) {
                                        if (i24 == 0 || Math.abs(dArr3[i24 - 1]) <= 0.00125d) {
                                            i23 = i24;
                                        }
                                        if (i24 != a9 - 1) {
                                            int i25 = i24 + 1;
                                            if (Math.abs(dArr3[i25]) > 0.00125d && dArr3[i24] * dArr3[i25] >= 0.0d) {
                                            }
                                        }
                                        if (i24 - i23 > 48) {
                                            if (!arrayList15.isEmpty()) {
                                                bfne3 = (bfne) arrayList15.get(arrayList15.size() - 1);
                                            } else {
                                                bfne3 = null;
                                            }
                                            if (bfne3 == null || dArr3[((Integer) bfne3.f114468b).intValue()] * dArr3[i23] <= 0.0d || i23 - ((Integer) bfne3.f114468b).intValue() >= 24) {
                                                arrayList15.add(bfne.m97311a(Integer.valueOf(i23), Integer.valueOf(i24)));
                                            } else {
                                                arrayList15.set(arrayList15.size() - 1, bfne.m97311a((Integer) bfne3.f114467a, Integer.valueOf(i24)));
                                            }
                                        }
                                    }
                                    i24++;
                                    bewc = bewc5;
                                    besa = besa8;
                                    arrayList2 = arrayList16;
                                    a8 = bfku14;
                                    arrayList = arrayList17;
                                    dArr2 = dArr4;
                                }
                                ArrayList arrayList18 = new ArrayList();
                                int size = arrayList15.size();
                                for (int i26 = 0; i26 < size; i26++) {
                                    bfne bfne4 = (bfne) arrayList15.get(i26);
                                    double abs = Math.abs(dArr2[((Integer) bfne4.f114467a).intValue()] - dArr2[((Integer) bfne4.f114468b).intValue()]);
                                    if (abs > 0.145d && abs < 55.0d) {
                                        arrayList18.add(bfne4);
                                    }
                                }
                                ArrayList arrayList19 = new ArrayList();
                                int size2 = arrayList18.size();
                                int i27 = 0;
                                while (i27 < size2) {
                                    bfne bfne5 = (bfne) arrayList18.get(i27);
                                    long intValue = (((long) ((Integer) bfne5.f114467a).intValue()) * bewc.f112781a) + a8.mo61857a(0);
                                    ArrayList arrayList20 = arrayList18;
                                    long a14 = a8.mo61857a(0) + (((long) ((Integer) bfne5.f114468b).intValue()) * bewc.f112781a);
                                    ArrayList arrayList21 = arrayList;
                                    besa besa9 = besa;
                                    long j22 = intValue;
                                    double[] dArr5 = dArr2;
                                    bfne bfne6 = bfne5;
                                    bfku a15 = a7.mo61858a(intValue, 0, a14, 0);
                                    if (a15.f114316b < 4) {
                                        StringBuilder sb2 = new StringBuilder(82);
                                        sb2.append("Insufficient accelerometer readings, segment duration sec=");
                                        double d4 = (double) (a14 - j22);
                                        Double.isNaN(d4);
                                        sb2.append(d4 / 1.0E9d);
                                        sb2.toString();
                                        arrayList6 = arrayList2;
                                        bfku8 = a8;
                                        arrayList7 = arrayList19;
                                        i6 = size2;
                                        i7 = i27;
                                        besa5 = besa9;
                                        bewc2 = bewc;
                                    } else {
                                        long j23 = a14;
                                        beuq beuq = new beuq();
                                        beun.m95913a(beuq, a15);
                                        bfne bfne7 = bfne6;
                                        int intValue2 = ((Integer) bfne7.f114467a).intValue();
                                        int intValue3 = ((Integer) bfne7.f114468b).intValue();
                                        bewf bewf = new bewf();
                                        i6 = size2;
                                        besa5 = besa9;
                                        double[] dArr6 = dArr5;
                                        bfne a16 = bewe.m95978a(dArr6, intValue2, intValue3);
                                        arrayList6 = arrayList2;
                                        bewf.f112784a = ((Double) a16.f114467a).floatValue();
                                        bewf.f112785b = ((Double) a16.f114467a).doubleValue() < 0.0d ? -1.0f : 1.0f;
                                        bewf.f112786c = ((Double) a16.f114468b).floatValue();
                                        i7 = i27;
                                        double d5 = (double) ((intValue3 - intValue2) + 1);
                                        Double.isNaN(d5);
                                        bfku8 = a8;
                                        ArrayList arrayList22 = arrayList19;
                                        Double.isNaN(d5);
                                        bewf.f112787d = Math.abs(bewf.f112784a) - ((float) Math.abs(((Double) bewe.m95978a(dArr6, ((int) (d5 * 0.25d)) + intValue2, intValue2 + ((int) (d5 * 0.75d))).f114467a).doubleValue()));
                                        bewc2 = bewc;
                                        bewg bewg = bewc2.f112783c;
                                        float[] a17 = beuq.mo61161a();
                                        float[] fArr = {bewf.f112784a, bewf.f112785b, bewf.f112786c, bewf.f112787d};
                                        int length = a17.length;
                                        float[] fArr2 = new float[(length + 4)];
                                        System.arraycopy(a17, 0, fArr2, 0, length);
                                        System.arraycopy(fArr, 0, fArr2, length, 4);
                                        HashMap hashMap = new HashMap();
                                        for (int i28 = 0; i28 < bewg.f112789a.mo61171a(); i28++) {
                                            beuw a18 = bewg.f112789a.mo61172a(i28, fArr2);
                                            Integer valueOf = Integer.valueOf(((Integer) a18.f112566a).intValue());
                                            if (hashMap.containsKey(valueOf)) {
                                                f2 = ((Float) hashMap.get(valueOf)).floatValue();
                                            } else {
                                                f2 = 0.0f;
                                            }
                                            hashMap.put(valueOf, Float.valueOf(f2 + a18.f112567b));
                                        }
                                        int i29 = 0;
                                        float f3 = 0.0f;
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            if (f3 < ((Float) entry.getValue()).floatValue()) {
                                                f3 = ((Float) entry.getValue()).floatValue();
                                                i29 = ((Integer) entry.getKey()).intValue();
                                            }
                                        }
                                        bfne a19 = bfne.m97311a(Integer.valueOf(i29), Integer.valueOf(Math.round((f3 * 100.0f) / ((float) bewg.f112789a.mo61171a()))));
                                        float a20 = (float) (bewd.m95976a(dArr6[((Integer) bfne7.f114468b).intValue()]) - bewd.m95976a(dArr6[((Integer) bfne7.f114467a).intValue()]));
                                        if (Float.isNaN(a20)) {
                                            double d6 = dArr6[((Integer) bfne7.f114467a).intValue()];
                                            arrayList8 = arrayList22;
                                            double d7 = dArr6[((Integer) bfne7.f114468b).intValue()];
                                            dArr5 = dArr6;
                                            StringBuilder sb3 = new StringBuilder(83);
                                            sb3.append("altitudeDiff is NaN. baro1=");
                                            sb3.append(d6);
                                            sb3.append(", baro2=");
                                            sb3.append(d7);
                                            sb3.toString();
                                        } else {
                                            dArr5 = dArr6;
                                            arrayList8 = arrayList22;
                                        }
                                        String valueOf2 = String.valueOf(new bewb(((Integer) a19.f114467a).intValue(), j22, j23, a20, ((Integer) a19.f114468b).intValue()));
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 10);
                                        sb4.append("activity: ");
                                        sb4.append(valueOf2);
                                        sb4.toString();
                                        int intValue4 = ((Integer) a19.f114467a).intValue();
                                        int a21 = a7.mo61856a(j22);
                                        if (a21 < 0) {
                                            a21 = (-a21) - 1;
                                        }
                                        int a22 = a7.mo61856a(j23);
                                        if (a22 < 0) {
                                            a22 = (-a22) - 2;
                                        }
                                        bfne a23 = bfne.m97311a(Integer.valueOf(a21), Integer.valueOf(a22));
                                        int intValue5 = ((Integer) a23.f114467a).intValue();
                                        int intValue6 = ((Integer) a23.f114468b).intValue();
                                        int i30 = 3;
                                        ArrayList arrayList23 = new ArrayList(3);
                                        int i31 = intValue5;
                                        int i32 = 1;
                                        while (true) {
                                            if (i32 <= i30) {
                                                int i33 = i31;
                                                while (true) {
                                                    if (i33 <= 0) {
                                                        bfne2 = a19;
                                                        f = a20;
                                                        j9 = j23;
                                                        arrayList9 = arrayList8;
                                                        j10 = 3200000000L;
                                                        break;
                                                    }
                                                    bfne2 = a19;
                                                    f = a20;
                                                    j9 = j23;
                                                    arrayList9 = arrayList8;
                                                    j10 = 3200000000L;
                                                    if (a7.mo61857a(i33) <= j22 - (((long) i32) * 3200000000L)) {
                                                        break;
                                                    }
                                                    i33--;
                                                    arrayList8 = arrayList9;
                                                    a19 = bfne2;
                                                    j23 = j9;
                                                    a20 = f;
                                                }
                                                if (i33 >= i31 || a7.mo61857a(i31 - 1) - a7.mo61857a(i33) < 1600000000) {
                                                    break;
                                                }
                                                arrayList23.add(bewc2.f112782b.mo61177a(a7.mo61860b(i33, i31 - i33)));
                                                i32++;
                                                arrayList8 = arrayList9;
                                                i31 = i33;
                                                a19 = bfne2;
                                                j23 = j9;
                                                a20 = f;
                                                i30 = 3;
                                            } else {
                                                bfne2 = a19;
                                                f = a20;
                                                j9 = j23;
                                                arrayList9 = arrayList8;
                                                j10 = 3200000000L;
                                                break;
                                            }
                                        }
                                        ArrayList arrayList24 = new ArrayList(3);
                                        int i34 = intValue6 + 1;
                                        int i35 = 1;
                                        for (int i36 = 3; i35 <= i36; i36 = 3) {
                                            int i37 = i34;
                                            while (i37 < a7.f114316b && a7.mo61857a(i37) < j9 + (((long) i35) * j10)) {
                                                i37++;
                                            }
                                            if (i34 >= i37 || a7.mo61857a(i37 - 1) - a7.mo61857a(i34) < 1600000000) {
                                                break;
                                            }
                                            arrayList24.add(bewc2.f112782b.mo61177a(a7.mo61860b(i34, i37 - i34)));
                                            i35++;
                                            i34 = i37;
                                        }
                                        bfne a24 = bewh.m95979a(intValue4);
                                        bewh bewh = (bewh) a24.f114467a;
                                        bewh bewh2 = (bewh) a24.f114468b;
                                        if (!arrayList23.isEmpty()) {
                                            d = bewh.mo61189a(arrayList23);
                                        } else {
                                            d = 0.0d;
                                        }
                                        if (!arrayList24.isEmpty()) {
                                            d2 = bewh2.mo61189a(arrayList24);
                                        } else {
                                            d2 = 0.0d;
                                        }
                                        StringBuilder sb5 = new StringBuilder(85);
                                        sb5.append("likelihoodBefore: ");
                                        sb5.append(d);
                                        sb5.append(", likelihoodAfter: ");
                                        sb5.append(d2);
                                        sb5.toString();
                                        if (d + d2 >= 0.0d) {
                                            bewb bewb = new bewb(((Integer) bfne2.f114467a).intValue(), j22, j9, f, ((Integer) bfne2.f114468b).intValue());
                                            arrayList7 = arrayList9;
                                            arrayList7.add(bewb);
                                        } else {
                                            arrayList7 = arrayList9;
                                        }
                                    }
                                    i27 = i7 + 1;
                                    arrayList19 = arrayList7;
                                    bewc = bewc2;
                                    besa = besa5;
                                    size2 = i6;
                                    arrayList18 = arrayList20;
                                    arrayList2 = arrayList6;
                                    a8 = bfku8;
                                    arrayList = arrayList21;
                                    dArr2 = dArr5;
                                }
                                int size3 = arrayList18.size();
                                int size4 = arrayList19.size();
                                StringBuilder sb6 = new StringBuilder(58);
                                sb6.append("Original segment: ");
                                sb6.append(size3);
                                sb6.append(", Result segment: ");
                                sb6.append(size4);
                                sb6.toString();
                                bfne = bfne.m97311a(arrayList19, Integer.valueOf(arrayList18.size() - arrayList19.size()));
                                arrayList5 = arrayList2;
                                arrayList4 = arrayList;
                                besa4 = besa;
                                i = 0;
                            } else {
                                arrayList5 = arrayList2;
                                arrayList4 = arrayList;
                                besa4 = besa;
                                j7 = max;
                                i = 0;
                                bfne = bfne.m97311a(Collections.emptyList(), 0);
                            }
                            ArrayList arrayList25 = arrayList5;
                            arrayList25.addAll((Collection) bfne.f114467a);
                            int intValue7 = ((Integer) bfne.f114468b).intValue();
                            if (!arrayList25.isEmpty()) {
                                bewb bewb2 = (bewb) arrayList25.get(arrayList25.size() - 1);
                                long j24 = bewb2.f112778c + 2000000000;
                                if (j24 > j6) {
                                    besa2 = besa4;
                                    besa2.f112264d = bewb2.f112777b - 2000000000;
                                    arrayList25.remove(arrayList25.size() - 1);
                                } else {
                                    besa2 = besa4;
                                    besa2.f112264d = j24;
                                }
                            } else {
                                besa2 = besa4;
                                besa2.f112264d = j6 - 5000000000L;
                            }
                            ArrayList arrayList26 = arrayList25;
                            bfku5 = bfku;
                            long max3 = Math.max(bfku5.mo61857a(bfku5.f114316b - 1), bfku2.mo61857a(bfku2.f114316b - 1));
                            int size5 = arrayList26.size();
                            for (int i38 = 0; i38 < size5; i38++) {
                                bewb bewb3 = (bewb) arrayList26.get(i38);
                                long j25 = (max3 - bewb3.f112777b) / 1000000;
                                long j26 = (max3 - bewb3.f112778c) / 1000000;
                                long j27 = j - j25;
                                long j28 = j2 - j25;
                                long j29 = j - j26;
                                long j30 = j2 - j26;
                                int i39 = bewb3.f112776a;
                                switch (i39) {
                                    case 1:
                                    case 2:
                                        i5 = 1;
                                        break;
                                    case 3:
                                    case 4:
                                        i5 = 2;
                                        break;
                                    case 5:
                                    case 6:
                                        i5 = 3;
                                        break;
                                    default:
                                        StringBuilder sb7 = new StringBuilder(47);
                                        sb7.append("Unknown floor change activity type: ");
                                        sb7.append(i39);
                                        throw new IllegalArgumentException(sb7.toString());
                                }
                                arrayList4.add(new FloorChangeEvent(i5, bewb3.f112780e, j27, j29, j28, j30, bewb3.f112779d));
                            }
                            arrayList3 = arrayList4;
                            i3 = intValue7;
                            if (!arrayList3.isEmpty()) {
                                bequ.mo60948a(arrayList3);
                            }
                            bfor bfor = besa2.f112261a;
                            bfor.mo62047a(new bfop(bfos.FLOOR_CHANGE_DETECTION_DONE, bfor.mo62055b(), "dataGapSec=%2$d numRejectedSegment=%3$d", null, (int) ((j7 - besa2.f112263c) / 1000000000), i3, -1));
                        } else {
                            arrayList3 = arrayList;
                            besa3 = besa;
                            j8 = max;
                            i4 = 0;
                            bfku5 = bfku;
                        }
                        int i40 = a6.f114316b;
                        StringBuilder sb8 = new StringBuilder(94);
                        sb8.append("No data for detection, trimmedAccelData.length=");
                        sb8.append(i14);
                        sb8.append(", trimmedBaroData.length=");
                        sb8.append(i40);
                        sb8.toString();
                        i3 = 0;
                        if (!arrayList3.isEmpty()) {
                        }
                        bfor bfor2 = besa2.f112261a;
                        bfor2.mo62047a(new bfop(bfos.FLOOR_CHANGE_DETECTION_DONE, bfor2.mo62055b(), "dataGapSec=%2$d numRejectedSegment=%3$d", null, (int) ((j7 - besa2.f112263c) / 1000000000), i3, -1));
                    } else {
                        bfku5 = bfku9;
                        i = 0;
                        besa6.f112264d = min;
                    }
                }
            } else {
                bfku5 = bfku9;
                bfku4 = a;
                i = 0;
            }
        }
        bera bera2 = this.f112096b;
        if (bera2.f112106z == null) {
            j5 = 3200000000L;
        } else if (bera2.f112087k) {
            bfku a25 = bera.m95469a(bfku5, 3200000000L);
            bfku a26 = bera.m95469a(bfku3, 3200000000L);
            bera bera3 = this.f112096b;
            j5 = 3200000000L;
            bera3.f112106z.mo61129a(bera3.f112088l, j, j2, a25, a26);
        } else {
            j5 = 3200000000L;
        }
        bfku bfku15 = bfku4;
        int i41 = bfku15.f114316b;
        if (i41 == 0) {
            berf.m95533a(this.f112096b.f112093q, i);
            beqt = beqt.m95450a("accel data is empty");
        } else {
            int b = bfku15.mo61859b(i41 - 1);
            int length2 = bfku15.f114318d.length;
            float[] fArr3 = new float[length2];
            int i42 = 0;
            while (i42 < length2) {
                fArr3[i42] = bfku15.f114318d[i42][b];
                i42++;
                bfku15 = bfku15;
            }
            bfkv bfkv = new bfkv(bfku15.f114317c[b], fArr3);
            bfkv bfkv2 = this.f112096b.f112101u;
            if (bfkv2 != null && bfkv.f114319a == bfkv2.f114319a && bfkv.f114320b.length == bfkv2.f114320b.length) {
                int i43 = 0;
                while (true) {
                    float[] fArr4 = bfkv.f114320b;
                    if (i43 >= fArr4.length) {
                        beqt = beqt.m95450a("same accel data as previous one");
                    } else if (Math.abs(fArr4[i43] - bfkv2.f114320b[i43]) <= 1.0E-6f) {
                        i43++;
                    }
                }
            }
            this.f112096b.f112101u = bfkv;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[i] = Integer.valueOf(bfku15.f114316b);
            double a27 = (double) (bfku15.mo61857a(bfku15.f114316b - 1) - bfku15.mo61857a(i));
            Double.isNaN(a27);
            objArr[1] = Double.valueOf(a27 * 1.0E-9d);
            if (this.f112096b.f112083g != null) {
                ArrayList arrayList27 = new ArrayList();
                for (int i44 = bfku15.f114316b - 1; i44 >= 0; i44 = beqp.m95443a(bfku15, i44, j5)) {
                    arrayList27.add(Integer.valueOf(i44));
                }
                int size6 = arrayList27.size() - 1;
                int i45 = 0;
                int i46 = 0;
                while (size6 >= 0) {
                    int intValue8 = ((Integer) arrayList27.get(size6)).intValue();
                    bfku b2 = bfku15.mo61860b(i46, (intValue8 + 1) - i46);
                    if (b2.f114316b >= 4) {
                        long a28 = (bfku15.mo61857a(bfku15.f114316b - 1) - bfku15.mo61857a(i46)) / 1000000;
                        bfku7 = bfku15;
                        mo60957c(j - a28, j2 - a28, b2);
                        i45++;
                    } else {
                        bfku7 = bfku15;
                    }
                    size6--;
                    i46 = intValue8;
                    bfku15 = bfku7;
                }
                StringBuilder sb9 = new StringBuilder(76);
                sb9.append("Number of times phone position detection was run for this batch: ");
                sb9.append(i45);
                sb9.toString();
                bfku6 = bfku15;
            } else {
                bfku6 = bfku15;
            }
            beqt b3 = this.f112096b.f112084h == null ? beqt.f112072c : mo60956b(j, j2, bfku6);
            beqt beqt2 = beqt.f112072c;
            beqp beqp = this.f112096b.f112080d;
            if (beqp != null && beqp.f112061c) {
                beqt2 = mo60952a(j, j2, bfku6);
            }
            beqt = beqw.m95468a(b3, beqt2);
        }
        this.f112096b.f112081e.mo60945a(beqt);
    }
}
