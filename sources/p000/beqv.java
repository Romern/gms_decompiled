package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* renamed from: beqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class beqv extends bfhp {

    /* renamed from: a */
    final /* synthetic */ beqw f112076a;

    protected beqv(beqw beqw) {
        this.f112076a = beqw;
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List], assign insn: PHI: (r19v0 ?) = (r19v1 ?), (r19v2 ?), (r19v9 ?), (r19v10 ?) binds: [B:30:0x017d, B:29:0x0174, B:28:0x0171, B:27:0x015f] */
    /* JADX WARN: Type inference failed for: r19v1, assign insn: 0x017d: MOVE  (r19v1 ? I:?[OBJECT, ARRAY]) = (r1v3 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r19v2, assign insn: 0x0174: MOVE  (r19v2 ? I:?[OBJECT, ARRAY]) = (r1v3 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r19v9, assign insn: ?: MOVE  (r19v9 ?) = (r19v3 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r19v10, assign insn: ?: MOVE  (r19v10 ?) = (r19v3 java.lang.Object) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final beqt mo60952a(long j, long j2, bfku bfku) {
        ? r19;
        Object obj;
        Object obj2;
        beqt beqt;
        double[] dArr;
        Object obj3;
        ActivityRecognitionResult activityRecognitionResult;
        Object obj4;
        double[] dArr2;
        betm betm;
        long j3;
        Object obj5;
        beqv beqv = this;
        long j4 = j2;
        bfku bfku2 = bfku;
        bfnq a = beqv.f112076a.f112080d.mo60938a(j, j2, bfku);
        Object obj6 = a.f114500a;
        Object obj7 = a.f114501b;
        Object obj8 = a.f114502c;
        beqt beqt2 = (beqt) obj6;
        if (beqt2.f112073a != 0) {
            r19 = obj8;
            obj2 = obj6;
            obj = obj7;
            beqt = beqt2;
        } else if (beqt2.mo60942a() == Long.MAX_VALUE) {
            long a2 = bfku2.mo61857a(bfku2.f114316b - 1) - 3200000000L;
            double[] dArr3 = new double[3];
            int i = bfku2.f114316b - 1;
            int i2 = 0;
            while (true) {
                beqt = beqt2;
                if (i < bfku2.f114316b) {
                    if (i >= 0) {
                        if (bfku2.mo61857a(i) < a2) {
                            dArr = dArr3;
                            break;
                        }
                        double d = dArr3[0];
                        double a3 = (double) bfku2.mo61854a(i, 0);
                        Double.isNaN(a3);
                        dArr3[0] = d + a3;
                        double d2 = dArr3[1];
                        double a4 = (double) bfku2.mo61854a(i, 1);
                        Double.isNaN(a4);
                        dArr3[1] = d2 + a4;
                        double d3 = dArr3[2];
                        double a5 = (double) bfku2.mo61854a(i, 2);
                        Double.isNaN(a5);
                        dArr3[2] = d3 + a5;
                        i2++;
                        i--;
                        beqt2 = beqt;
                        dArr3 = dArr3;
                    } else {
                        dArr = dArr3;
                        break;
                    }
                } else {
                    dArr = dArr3;
                    break;
                }
            }
            double d4 = (double) i2;
            double d5 = dArr[0];
            Double.isNaN(d4);
            dArr[0] = d5 / d4;
            double d6 = dArr[1];
            Double.isNaN(d4);
            dArr[1] = d6 / d4;
            double d7 = dArr[2];
            Double.isNaN(d4);
            dArr[2] = d7 / d4;
            beqw beqw = beqv.f112076a;
            betm betm2 = beqw.f112089m;
            double d8 = beqw.f112090n;
            if (j4 > betm2.f112405c) {
                double[] dArr4 = betm2.f112403a;
                if (dArr4 != null) {
                    dArr2 = dArr;
                    bhcu bhcu = new bhcu(dArr2);
                    bhcu bhcu2 = new bhcu(dArr4);
                    betm = betm2;
                    obj2 = obj6;
                    obj = obj7;
                    Object obj9 = obj8;
                    double degrees = Math.toDegrees(Math.acos((((bhcu.f118309a * bhcu2.f118309a) + (bhcu.f118310b * bhcu2.f118310b)) + (bhcu.f118311c * bhcu2.f118311c)) / (bhcu.mo63557a() * bhcu2.mo63557a())));
                    StringBuilder sb = new StringBuilder(67);
                    sb.append("Angle change since last classification is: ");
                    sb.append(degrees);
                    sb.toString();
                    if (degrees >= d8) {
                        j3 = j;
                        activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(5, 100), j3 - ((j3 - betm.f112404b) / 2), j4 - ((j4 - betm.f112405c) / 2), bevp.SOFTWARE_TILT_FROYO.f112768am, (Bundle) null);
                        obj4 = obj9;
                        betm.f112403a = dArr2;
                        betm.f112404b = j3;
                        betm.f112405c = j4;
                        obj3 = obj4;
                    } else {
                        j3 = j;
                        obj5 = obj9;
                    }
                } else {
                    j3 = j;
                    obj5 = obj8;
                    obj2 = obj6;
                    betm = betm2;
                    dArr2 = dArr;
                    obj = obj7;
                }
                activityRecognitionResult = null;
                obj4 = obj5;
                betm.f112403a = dArr2;
                betm.f112404b = j3;
                betm.f112405c = j4;
                obj3 = obj4;
            } else {
                obj3 = obj8;
                obj2 = obj6;
                obj = obj7;
                activityRecognitionResult = null;
            }
            if (activityRecognitionResult != null) {
                beqv = this;
                beqw.m95471a(beqv.f112076a.f112093q, activityRecognitionResult, false);
                beqv.f112076a.f112081e.mo60950c(activityRecognitionResult);
                r19 = obj3;
            } else {
                beqv = this;
                r19 = obj3;
            }
        } else {
            r19 = obj8;
            obj2 = obj6;
            obj = obj7;
            beqt = beqt2;
        }
        for (ActivityRecognitionResult activityRecognitionResult2 : r19) {
            beqv.f112076a.f112081e.mo60946a(activityRecognitionResult2);
            beqw.m95471a(beqv.f112076a.f112093q, activityRecognitionResult2, false);
        }
        if (obj != null) {
            beqv.f112076a.f112081e.mo60949b((ActivityRecognitionResult) obj);
        }
        String valueOf = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb2.append("detectActivity returns ");
        sb2.append(valueOf);
        sb2.toString();
        return beqt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60953a(long j, long j2, bfku bfku, bfku bfku2, bfku bfku3);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02f1, code lost:
        if (r0 != 2) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02f3, code lost:
        r7 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02f6, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f7, code lost:
        r2 = new p000.besp(new com.google.android.gms.location.ActivityRecognitionResult(new com.google.android.gms.location.DetectedActivity(9, r7), r33, r35, p000.bess.f112323a.f112768am, (android.os.Bundle) null), p000.beqt.f112072c, r1);
     */
    /* renamed from: b */
    public final beqt mo60956b(long j, long j2, bfku bfku) {
        ArrayList arrayList;
        beqt b;
        ArrayList arrayList2;
        int i;
        beso beso;
        float f;
        bfku bfku2;
        bfku bfku3;
        int i2;
        int i3;
        Float f2;
        int i4;
        bfku bfku4 = bfku;
        bess bess = this.f112076a.f112084h;
        ArrayList arrayList3 = new ArrayList();
        int i5 = -1;
        int i6 = bfku4.f114316b - 1;
        int i7 = 0;
        int i8 = 1;
        boolean z = false;
        while (true) {
            int a = beqp.m95443a(bfku4, i6, 2500000000L);
            if (a != i5) {
                bfku b2 = bfku4.mo61860b(a, (i6 + 1) - a);
                if (b2.f114316b >= 4) {
                    Locale locale = Locale.US;
                    int i9 = 2;
                    Object[] objArr = new Object[2];
                    objArr[i7] = Integer.valueOf(bfku4.f114316b);
                    objArr[i8] = Integer.valueOf(i6);
                    if (b2.f114316b != 0) {
                        float offBodyDetectionLowerAngularThreshold = (float) cerv.f183393a.mo6606a().offBodyDetectionLowerAngularThreshold();
                        float offBodyDetectionUpperAngularThreshold = (float) cerv.f183393a.mo6606a().offBodyDetectionUpperAngularThreshold();
                        float offBodyDetectionEnergyThreshold = (float) cerv.f183393a.mo6606a().offBodyDetectionEnergyThreshold();
                        boolean z2 = bess.f112325c;
                        int i10 = bess.f112327e;
                        int i11 = i10 - 1;
                        if (i10 != 0) {
                            if (i11 == 0) {
                                bfku2 = b2;
                                f = offBodyDetectionLowerAngularThreshold;
                            } else if (i11 != i8) {
                                bfku2 = b2;
                                f = (float) cerv.m138138c();
                            } else {
                                bfku2 = b2;
                                f = offBodyDetectionUpperAngularThreshold;
                            }
                            Locale locale2 = Locale.US;
                            new Object[i8][i7] = Float.valueOf(f);
                            besr besr = bess.f112324b;
                            if (besr != null) {
                                boolean z3 = j2 - besr.f112319a > 600000;
                                Locale locale3 = Locale.US;
                                Object[] objArr2 = new Object[3];
                                objArr2[i7] = Long.valueOf(bess.f112324b.f112319a);
                                objArr2[i8] = Long.valueOf(j2);
                                objArr2[2] = Boolean.valueOf(z3);
                                if (z3) {
                                    bess.f112324b = null;
                                }
                            }
                            besr besr2 = new besr(j2, 0.0f, 0.0f, 0.0f);
                            float f3 = 0.0f;
                            int i12 = 0;
                            while (true) {
                                bfku3 = bfku2;
                                i2 = bfku3.f114316b;
                                if (i12 >= i2) {
                                    break;
                                }
                                besr2.f112320b += bfku3.mo61854a(i12, i7);
                                besr2.f112321c += bfku3.mo61854a(i12, i8);
                                besr2.f112322d += bfku3.mo61854a(i12, 2);
                                if (i12 > 0) {
                                    int i13 = i12 - 1;
                                    float a2 = bfku3.mo61854a(i12, i7) - bfku3.mo61854a(i13, i7);
                                    float a3 = bfku3.mo61854a(i12, i8) - bfku3.mo61854a(i13, i8);
                                    float a4 = bfku3.mo61854a(i12, 2) - bfku3.mo61854a(i13, 2);
                                    f3 += (a2 * a2) + (a3 * a3) + (a4 * a4);
                                }
                                i12++;
                                bfku2 = bfku3;
                            }
                            besr a5 = besr2.mo61104a(1.0f / ((float) i2));
                            besr besr3 = new besr(j2, 0.0f, 0.0f, 0.0f);
                            int i14 = 0;
                            while (true) {
                                i3 = bfku3.f114316b;
                                if (i14 >= i3) {
                                    break;
                                }
                                float a6 = bfku3.mo61854a(i14, i7) - a5.f112320b;
                                float a7 = bfku3.mo61854a(i14, i8) - a5.f112321c;
                                float a8 = bfku3.mo61854a(i14, i9) - a5.f112322d;
                                besr3.f112320b += a6 * a6;
                                besr3.f112321c += a7 * a7;
                                besr3.f112322d += a8 * a8;
                                i14++;
                                i7 = 0;
                                i8 = 1;
                                i9 = 2;
                            }
                            besr3.mo61104a(1.0f / ((float) i3));
                            Locale locale4 = Locale.US;
                            Float valueOf = Float.valueOf(f);
                            Object[] objArr3 = {valueOf, Float.valueOf(f3)};
                            besr besr4 = bess.f112324b;
                            if (besr4 != null) {
                                long j3 = besr4.f112319a;
                                float f4 = a5.f112321c;
                                float f5 = besr4.f112322d;
                                float f6 = a5.f112322d;
                                float f7 = besr4.f112321c;
                                i = a;
                                float f8 = besr4.f112320b;
                                arrayList2 = arrayList3;
                                float f9 = a5.f112320b;
                                besr besr5 = new besr(j3, (f4 * f5) - (f6 * f7), (f6 * f8) - (f5 * f9), (f9 * f7) - (f4 * f8));
                                float abs = Math.abs((float) Math.toDegrees(Math.atan2((double) ((float) Math.sqrt((double) besr5.mo61103a(besr5))), (double) a5.mo61103a(besr4))));
                                String besr6 = a5.toString();
                                String besr7 = besr4.toString();
                                StringBuilder sb = new StringBuilder(String.valueOf(besr6).length() + 58 + String.valueOf(besr7).length());
                                sb.append("angleBetween: this = ");
                                sb.append(besr6);
                                sb.append(", other = ");
                                sb.append(besr7);
                                sb.append(", degrees = ");
                                sb.append(abs);
                                sb.toString();
                                f2 = Float.valueOf(abs);
                                Locale locale5 = Locale.US;
                                Object[] objArr4 = {f2, valueOf};
                            } else {
                                arrayList2 = arrayList3;
                                i = a;
                                f2 = null;
                            }
                            if (f3 > offBodyDetectionEnergyThreshold) {
                                bfor bfor = bess.f112326d;
                                if (bfor != null) {
                                    bfor.mo62047a(new berc(bfos.OFF_BODY_RESULT, bfor.mo62055b(), Math.round(f3), Math.round(-1000.0f), f3));
                                    i4 = 1;
                                } else {
                                    i4 = 1;
                                }
                            } else if (bess.f112324b == null) {
                                Locale locale6 = Locale.US;
                                Object[] objArr5 = {Integer.valueOf(bfku3.f114316b), a5.toString()};
                                i4 = 3;
                            } else {
                                i4 = f2.floatValue() > f ? 1 : 2;
                            }
                            beso beso2 = new beso(f, offBodyDetectionEnergyThreshold, a5, bfku3.f114316b, bess.f112324b, f2, f3, bfku3.mo61857a(0) / 1000000, bfku3.mo61857a(bfku3.f114316b - 1) / 1000000, bess.f112327e, i4);
                            if (i4 != 3) {
                                bess.f112327e = i4;
                            }
                            bess.f112324b = a5;
                            Locale locale7 = Locale.US;
                            new Object[1][0] = bess.f112324b.toString();
                            beso = beso2;
                        } else {
                            throw null;
                        }
                    } else {
                        arrayList2 = arrayList3;
                        i = a;
                        beso = null;
                    }
                    arrayList = arrayList2;
                    arrayList.add(beso);
                    int i15 = beso.f112315k;
                    if (!(i15 == 2 || i15 == 1)) {
                        bfku bfku5 = bfku;
                        int a9 = beqp.m95443a(bfku5, i, 5000000000L);
                        if (a9 == -1) {
                            break;
                        }
                        i6 = a9 + 1;
                        i5 = -1;
                        i7 = 0;
                        i8 = 1;
                        z = true;
                        arrayList3 = arrayList;
                        bfku4 = bfku5;
                    }
                } else {
                    i6 = a;
                    i5 = -1;
                    i7 = 0;
                    i8 = 1;
                    bfku4 = bfku4;
                }
            } else {
                bfku bfku6 = bfku4;
                arrayList = arrayList3;
                if (!z) {
                    b = beqt.m95451b((long) bfku6.f114316b);
                }
            }
        }
        b = beqt.m95449a(5000);
        besp besp = new besp(null, b, arrayList);
        Locale locale8 = Locale.US;
        new Object[1][0] = besp;
        ActivityRecognitionResult activityRecognitionResult = besp.f112316a;
        if (activityRecognitionResult != null) {
            if (activityRecognitionResult.f79300a.size() == 1) {
                if (besp.f112316a.mo43491a().mo43513a() == 9) {
                    this.f112076a.f112081e.mo60951d(besp.f112316a);
                }
            }
            throw new IllegalStateException();
        }
        return besp.f112317b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo60957c(long j, long j2, bfku bfku) {
        double[][] dArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ActivityRecognitionResult activityRecognitionResult;
        beqv beqv = this;
        double[][] a = bevb.m95937a(bfku, 50.0d);
        double[] dArr2 = a[0];
        double[] dArr3 = a[1];
        double[] dArr4 = a[2];
        int length = dArr2.length;
        double[] dArr5 = new double[length];
        double[] dArr6 = new double[length];
        int i = 0;
        while (i < length) {
            dArr5[i] = Math.abs(dArr2[i]) + Math.abs(dArr3[i]) + Math.abs(dArr4[i]);
            double d = dArr2[i];
            double d2 = dArr3[i];
            double d3 = dArr4[i];
            dArr6[i] = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
            i++;
            dArr3 = dArr3;
            dArr2 = dArr2;
            dArr4 = dArr4;
            a = a;
            beqv = beqv;
            dArr5 = dArr5;
        }
        bevi bevi = new bevi();
        double a2 = bevb.m95935a(dArr2);
        double a3 = bevb.m95935a(dArr3);
        double[] dArr7 = dArr3;
        double a4 = bevb.m95935a(dArr4);
        double[] dArr8 = dArr4;
        double a5 = bevb.m95935a(dArr5);
        double[] dArr9 = dArr2;
        double a6 = bevb.m95935a(dArr6);
        bevi.f112647a = (float) a2;
        bevi.f112648b = (float) a3;
        bevi.f112649c = (float) a4;
        bevi.f112650d = (float) a5;
        bevi.f112651e = (float) a6;
        double c = bevb.m95940c(dArr9) - (a2 * a2);
        double c2 = bevb.m95940c(dArr7) - (a3 * a3);
        double c3 = bevb.m95940c(dArr8) - (a4 * a4);
        double c4 = bevb.m95940c(dArr6) - (a6 * a6);
        if (c4 >= 1.0E-10d) {
            dArr = a;
            f = (float) (c / c4);
        } else {
            dArr = a;
            f = 0.0f;
        }
        bevi.f112644G = f;
        bevi.f112645H = c4 >= 1.0E-10d ? (float) (c2 / c4) : 0.0f;
        bevi.f112646I = c4 >= 1.0E-10d ? (float) (c3 / c4) : 0.0f;
        double[] dArr10 = dArr9;
        double a7 = bevh.m95951a(dArr10, a2);
        double d4 = a2;
        double a8 = bevh.m95951a(dArr7, a3);
        double d5 = a3;
        double a9 = bevh.m95951a(dArr8, a4);
        double d6 = a4;
        double a10 = bevh.m95951a(dArr5, a5);
        double d7 = a5;
        double[] dArr11 = dArr7;
        double d8 = a6;
        double a11 = bevh.m95951a(dArr6, d8);
        double[] dArr12 = dArr6;
        bevi.f112667u = (float) a7;
        bevi.f112668v = (float) a8;
        bevi.f112669w = (float) a9;
        double[] dArr13 = dArr5;
        double d9 = a10;
        double[] dArr14 = dArr8;
        bevi.f112670x = (float) d9;
        bevi.f112671y = (float) a11;
        if (Math.abs(d4) >= 1.0E-10d) {
            f2 = (float) (a7 / d4);
        } else {
            f2 = 0.0f;
        }
        bevi.f112672z = f2;
        if (Math.abs(d5) >= 1.0E-10d) {
            f3 = (float) (a8 / d5);
        } else {
            f3 = 0.0f;
        }
        bevi.f112638A = f3;
        if (Math.abs(d6) >= 1.0E-10d) {
            f4 = (float) (a9 / d6);
        } else {
            f4 = 0.0f;
        }
        bevi.f112639B = f4;
        if (d7 >= 1.0E-10d) {
            f5 = (float) (d9 / d7);
        } else {
            f5 = 0.0f;
        }
        bevi.f112640C = f5;
        if (d8 >= 1.0E-10d) {
            f6 = (float) (a11 / d8);
        } else {
            f6 = 0.0f;
        }
        bevi.f112641D = f6;
        bevi.f112662p = (float) bevh.m95950a(dArr10);
        bevi.f112663q = (float) bevh.m95950a(dArr11);
        bevi.f112664r = (float) bevh.m95950a(dArr14);
        bevi.f112665s = (float) bevh.m95950a(dArr13);
        bevi.f112666t = (float) bevh.m95950a(dArr12);
        bevi.f112657k = bevh.m95952b(dArr10);
        bevi.f112658l = bevh.m95952b(dArr11);
        bevi.f112659m = bevh.m95952b(dArr14);
        bevi.f112660n = bevh.m95952b(dArr13);
        bevi.f112661o = bevh.m95952b(dArr12);
        bevi.f112652f = bevh.m95953b(dArr10, d4);
        bevi.f112653g = bevh.m95953b(dArr11, d5);
        bevi.f112654h = bevh.m95953b(dArr14, d6);
        bevi.f112655i = bevh.m95953b(dArr13, d7);
        bevi.f112656j = bevh.m95953b(dArr12, d8);
        double[][] dArr15 = dArr;
        int length2 = dArr15.length;
        int length3 = dArr15[0].length;
        int i2 = length3 % 5;
        int i3 = (length3 - i2) / 5;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i3;
        double[][] dArr16 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr17 = new double[5];
        for (int i4 = 0; i4 < i3; i4++) {
            double[] dArr18 = dArr16[i4];
            int i5 = (i4 * 5) + i2;
            for (int i6 = 0; i6 < length2; i6++) {
                System.arraycopy(dArr15[i6], i5, dArr17, 0, 5);
                dArr18[i6] = bevb.m95935a(dArr17);
            }
        }
        int length4 = dArr16.length;
        if (length4 > 1) {
            double[] dArr19 = new double[(length4 - 1)];
            int i7 = 0;
            while (i7 < dArr16.length - 1) {
                double[] dArr20 = dArr16[i7];
                int i8 = i7 + 1;
                double[] dArr21 = dArr16[i8];
                double d10 = 0.0d;
                for (int i9 = 0; i9 < dArr20.length; i9++) {
                    d10 += dArr20[i9] * dArr21[i9];
                }
                dArr19[i7] = d10 / Math.sqrt(bevb.m95941d(dArr20) * bevb.m95941d(dArr21));
                i7 = i8;
            }
            double a12 = bevb.m95935a(dArr19);
            bevi.f112642E = (float) a12;
            bevi.f112643F = (float) (bevb.m95940c(dArr19) - (a12 * a12));
        } else {
            bevi.f112642E = 1.0f;
            bevi.f112643F = 1.0f;
        }
        ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult(beqp.m95444a(this.f112076a.f112083g.f112636a.mo61178a(bevi)), j, j2, bevp.PHONE_POSITION_MANCHEGO.f112768am, (Bundle) null);
        beqw beqw = this.f112076a;
        if (beqw.f112082f) {
            activityRecognitionResult = new ActivityRecognitionResult(beqp.m95444a(beqw.f112083g.f112637b.mo61178a(bevi)), j, j2, bevp.PHONE_POSITION_IN_VEHICLE_ORLA.f112768am, (Bundle) null);
        } else {
            activityRecognitionResult = null;
        }
        String valueOf = String.valueOf(activityRecognitionResult2);
        String valueOf2 = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("Primary phone position detection result: ");
        sb.append(valueOf);
        sb.append(", inVehicle position result: ");
        sb.append(valueOf2);
        sb.toString();
        this.f112076a.f112081e.mo60947a(activityRecognitionResult2, new bevk(bevi), activityRecognitionResult);
    }

    /* renamed from: a */
    public final void mo60954a(String str) {
        beqw beqw = this.f112076a;
        if (beqw.f112077a) {
            beqw.f112077a = false;
            beqw.f112081e.mo60945a(beqt.m95450a(str));
        }
    }

    /* renamed from: a */
    public final void mo60955a(Map map) {
        bfku bfku;
        bfku bfku2;
        bfku bfku3;
        beqw beqw = this.f112076a;
        if (beqw.f112077a) {
            beqw.f112077a = false;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bfku bfku4 = (bfku) map.get(bfgt.f113814d);
            bfku bfku5 = (bfku) map.get(bfgt.f113819i);
            bfku bfku6 = (bfku) map.get(bfgt.f113821k);
            bfku bfku7 = (bfku) map.get(bfgt.f113823m);
            if (bfku4 == null) {
                bfku = bfku.f114314e;
            } else {
                bfku = bfku4;
            }
            if (bfku5 == null) {
                bfku2 = bfku.f114314e;
            } else {
                bfku2 = bfku5;
            }
            if (bfku6 == null) {
                bfku3 = bfku.f114314e;
            } else {
                bfku3 = bfku6;
            }
            if (bfku7 == null) {
                bfku7 = bfku.f114314e;
            }
            int i = bfku.f114316b;
            int i2 = bfku2.f114316b;
            int i3 = bfku3.f114316b;
            int i4 = bfku7.f114316b;
            StringBuilder sb = new StringBuilder(131);
            sb.append("onSensorEventsListComposed(), accel.length=");
            sb.append(i);
            sb.append(", baro.length=");
            sb.append(i2);
            sb.append(", light.length=");
            sb.append(i3);
            sb.append(", sound.length=");
            sb.append(i4);
            sb.toString();
            mo60953a(currentTimeMillis, elapsedRealtime, bfku, bfku2, bfku3);
        }
    }
}
