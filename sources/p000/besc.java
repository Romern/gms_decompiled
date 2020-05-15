package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: besc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besc extends beqp {

    /* renamed from: d */
    public final bevd f112269d;

    /* renamed from: e */
    public final bevd f112270e;

    /* renamed from: f */
    private final int f112271f;

    /* renamed from: g */
    private final int f112272g;

    /* renamed from: h */
    private final besm f112273h;

    /* renamed from: i */
    private final beug f112274i;

    /* renamed from: j */
    private final bfor f112275j;

    /* JADX WARNING: Illegal instructions before constructor call */
    public besc(boolean z, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Class cls, ByteBuffer byteBuffer3, besm besm, bexc bexc, beug beug, bfor bfor) {
        super(r1);
        long j;
        bevd bevd;
        int i;
        Class cls2 = cls;
        if (!z) {
            bevp bevp = bevp.UNKNOWN;
        } else {
            bevp bevp2 = bevp.UNKNOWN;
        }
        if (!z) {
            j = 3200000000L;
        } else {
            j = 2500000000L;
        }
        if (byteBuffer != null) {
            bevd = new bevd(z, byteBuffer, byteBuffer2, this.f112060b, cls, bexc);
        } else {
            bevd = null;
        }
        this.f112269d = bevd;
        if (z) {
            i = bevp.WATCH_DEFAULT_ORLA.f112768am;
        } else {
            i = cls2 != beuu.class ? bevp.PHONE_DEFAULT_DNN_V14.f112768am : bevp.PHONE_DEFAULT_CNN_V23.f112768am;
        }
        this.f112271f = i;
        this.f112273h = besm;
        this.f112274i = beug;
        this.f112275j = bfor;
        if (byteBuffer3 == null || z) {
            this.f112270e = null;
            this.f112272g = -1;
        } else if (cls2 != beuu.class) {
            this.f112270e = new bevd(false, byteBuffer3, null, this.f112060b, beuu.class, bexc);
            this.f112272g = bevp.PHONE_DEFAULT_CNN_V23.f112768am;
        } else {
            this.f112270e = new bevd(false, byteBuffer3, byteBuffer2, this.f112060b, beva.class, bexc);
            this.f112272g = bevp.PHONE_DEFAULT_DNN_V14.f112768am;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        if (r5 != false) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0149  */
    /* renamed from: a */
    public final bfnq mo60938a(long j, long j2, bfku bfku) {
        bfku bfku2;
        boolean z;
        int i;
        ActivityRecognitionResult activityRecognitionResult;
        ArrayList arrayList;
        boolean z2;
        ActivityRecognitionResult activityRecognitionResult2;
        int round;
        besc besc = this;
        bfku bfku3 = bfku;
        if (besc.f112269d == null) {
            return bfnq.m97344a(beqt.m95450a("simpleActivityDetector wasn't loaded properly"), null, Collections.emptyList());
        }
        ArrayList arrayList2 = new ArrayList();
        boolean d = ceuq.m138264d();
        int i2 = -1;
        int i3 = bfku3.f114316b - 1;
        int i4 = 0;
        if ((bfku3.mo61857a(i3) - bfku3.mo61857a(0)) / besc.f112059a >= ceuq.f183443a.mo6606a().arGruBurstNumOneShotsForSensorBatch()) {
            besc.f112273h.mo61071b();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            int a = beqp.m95443a(bfku3, i3, besc.f112059a);
            if (a == i2) {
                bfku2 = bfku3;
                z = d;
                break;
            }
            bfku b = bfku3.mo61860b(a, (i3 + 1) - a);
            if (b.f114316b >= 4) {
                z = d;
                long a2 = b.mo61857a(i4);
                ArrayList arrayList5 = arrayList3;
                long a3 = b.mo61857a(b.f114316b + i2);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[i4] = Float.valueOf(((float) a2) * 1.0E-9f);
                objArr[1] = Float.valueOf(((float) a3) * 1.0E-9f);
                List a4 = besc.f112269d.mo61177a(b);
                beus beus = (beus) a4.get(i4);
                if (((beus) a4.get(i4)).f112544a == beur.ON_FOOT) {
                    beus beus2 = (beus) a4.get(1);
                }
                List a5 = beqp.m95444a(a4);
                int i5 = besc.f112271f;
                bexc bexc = besc.f112269d.f112607a;
                if (bexc != null && bexc.f112882b) {
                    int i6 = bevp.PHONE_PERSONALIZATION_AF3_BASED.f112768am;
                    besc.f112275j.mo62049a(bfos.LAST_ACTIVITY_RESULT_POST_PROCESSED, i6);
                    i = i6;
                } else {
                    i = i5;
                }
                ActivityRecognitionResult activityRecognitionResult3 = new ActivityRecognitionResult(a5, j, j2, i, (Bundle) null);
                bevd bevd = besc.f112270e;
                if (bevd != null) {
                    activityRecognitionResult = new ActivityRecognitionResult(beqp.m95444a(bevd.mo61177a(b)), j, j2, besc.f112272g, (Bundle) null);
                } else {
                    activityRecognitionResult = null;
                }
                if (cese.m138159h()) {
                    beug beug = besc.f112274i;
                    if (beug.mo61150b()) {
                        if ((activityRecognitionResult3.mo43490a(2) < 80 && activityRecognitionResult3.mo43490a(7) < 80 && activityRecognitionResult3.mo43490a(8) < 80) || activityRecognitionResult3.mo43491a().mo43513a() == 1 || activityRecognitionResult3.mo43491a().mo43513a() == 4) {
                            z2 = true;
                            if (activityRecognitionResult3.mo43491a().mo43513a() != 0) {
                                if (z2) {
                                }
                                activityRecognitionResult2 = activityRecognitionResult3;
                                if (!activityRecognitionResult2.equals(activityRecognitionResult3)) {
                                }
                                activityRecognitionResult3 = activityRecognitionResult2;
                            }
                            beug.f112476e++;
                        } else if (activityRecognitionResult3.mo43492b().mo43513a() == 17) {
                            z2 = true;
                            if (activityRecognitionResult3.mo43491a().mo43513a() != 0 && activityRecognitionResult3.mo43490a(i4) < 50) {
                                if (z2) {
                                    beug.f112475d++;
                                }
                                activityRecognitionResult2 = activityRecognitionResult3;
                                if (!activityRecognitionResult2.equals(activityRecognitionResult3)) {
                                    bfor bfor = besc.f112275j;
                                    Collection values = besc.f112274i.f112473b.mo61154a().values();
                                    List list = activityRecognitionResult3.f79300a;
                                    int min = Math.min(list.size(), 2);
                                    int i7 = 10000;
                                    int i8 = 0;
                                    int i9 = 0;
                                    while (i8 < min) {
                                        DetectedActivity detectedActivity = (DetectedActivity) list.get(i8);
                                        i9 += ((detectedActivity.mo43513a() * 100) + Math.min(detectedActivity.f79320e, 99)) * i7;
                                        i8++;
                                        i7 = 1;
                                    }
                                    bfor.mo62047a(new besb(bfos.BLUETOOTH_CLASSIFIED_IN_VEHICLE, bfor.mo62055b(), i9, activityRecognitionResult3, values));
                                }
                                activityRecognitionResult3 = activityRecognitionResult2;
                            } else {
                                beug.f112476e++;
                            }
                            beug.f112474c++;
                            ArrayList arrayList6 = new ArrayList();
                            bevp a6 = bevp.m95964a(activityRecognitionResult3.f79303d);
                            boolean z3 = a6.f112768am >= bevp.PHONE_DEFAULT_DNN_V11.f112768am && a6.f112768am < bevp.WATCH_DEFAULT_ORLA.f112768am;
                            int min2 = Math.min(100, activityRecognitionResult3.mo43490a(!z3 ? 0 : 16) + 51);
                            if (z3) {
                                arrayList6.add(new DetectedActivity(16, min2));
                            }
                            arrayList6.add(new DetectedActivity(i4, min2));
                            if (ceuq.m138268h() || ceuq.m138267g()) {
                                arrayList6.add(new DetectedActivity(19, min2));
                            }
                            if (ceuq.m138267g()) {
                                arrayList6.add(new DetectedActivity(20, min2));
                            }
                            int a7 = activityRecognitionResult3.mo43490a(3);
                            if (a7 > 0) {
                                arrayList6.add(new DetectedActivity(3, a7));
                            }
                            List<DetectedActivity> list2 = activityRecognitionResult3.f79300a;
                            if (list2 != null) {
                                int i10 = 0;
                                for (DetectedActivity detectedActivity2 : list2) {
                                    if (beug.f112472a.contains(Integer.valueOf(detectedActivity2.mo43513a()))) {
                                        i10 += detectedActivity2.f79320e;
                                    }
                                }
                                int max = 100 - Math.max(a7, min2);
                                for (DetectedActivity detectedActivity3 : activityRecognitionResult3.f79300a) {
                                    int a8 = detectedActivity3.mo43513a();
                                    if (!beug.f112472a.contains(Integer.valueOf(a8))) {
                                        if (a8 != 0 && a8 != 16) {
                                            if (!(a8 == 3 || a8 == 20 || a8 == 21 || a8 == 18 || a8 == 19)) {
                                                arrayList6.add(new DetectedActivity(a8, detectedActivity3.f79320e));
                                            }
                                        }
                                    } else if (i10 > 0 && (round = Math.round((((float) detectedActivity3.f79320e) * ((float) max)) / ((float) i10))) > 0) {
                                        arrayList6.add(new DetectedActivity(a8, round));
                                    }
                                }
                            }
                            Collections.sort(arrayList6, DetectedActivity.f79316a);
                            activityRecognitionResult2 = new ActivityRecognitionResult(arrayList6, activityRecognitionResult3.f79301b, activityRecognitionResult3.f79302c, activityRecognitionResult3.f79303d, aega.m51813a(activityRecognitionResult3.mo43493c(), "vehicle_personal_confidence"));
                            if (!activityRecognitionResult2.equals(activityRecognitionResult3)) {
                            }
                            activityRecognitionResult3 = activityRecognitionResult2;
                        }
                    }
                    z2 = false;
                    if (activityRecognitionResult3.mo43491a().mo43513a() != 0) {
                    }
                    beug.f112476e++;
                }
                String valueOf = String.valueOf(activityRecognitionResult3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Activity detection result: ");
                sb.append(valueOf);
                sb.toString();
                arrayList2.add(activityRecognitionResult3);
                if (activityRecognitionResult != null) {
                    arrayList = arrayList5;
                    arrayList.add(activityRecognitionResult3);
                    arrayList4.add(activityRecognitionResult);
                } else {
                    arrayList = arrayList5;
                }
                ActivityRecognitionResult a9 = besc.f112273h.mo61068a(activityRecognitionResult3);
                if (a9 == null) {
                    if (!z) {
                        bfku2 = bfku;
                        int a10 = beqp.m95443a(bfku2, a, 5000000000L);
                        if (a10 == -1) {
                            break;
                        }
                        i3 = a10 + 1;
                        i2 = -1;
                        i4 = 0;
                        arrayList3 = arrayList;
                        d = z;
                        bfku3 = bfku2;
                        besc = this;
                    } else {
                        i3 = Math.max(a - 1, 0);
                        i2 = -1;
                        i4 = 0;
                        besc = this;
                        arrayList3 = arrayList;
                        d = z;
                        bfku3 = bfku;
                    }
                } else {
                    char c = 0;
                    besc.f112061c = false;
                    if (!arrayList.isEmpty() && !arrayList4.isEmpty()) {
                        String[] strArr = {"test_ar_model_1", "test_ar_model_2"};
                        int[] iArr = new int[2];
                        iArr[1] = arrayList.size();
                        iArr[0] = 2;
                        ActivityRecognitionResult[][] activityRecognitionResultArr = (ActivityRecognitionResult[][]) Array.newInstance(ActivityRecognitionResult.class, iArr);
                        int i11 = 0;
                        while (i11 < arrayList.size()) {
                            activityRecognitionResultArr[c][i11] = (ActivityRecognitionResult) arrayList.get(i11);
                            activityRecognitionResultArr[1][i11] = (ActivityRecognitionResult) arrayList4.get(i11);
                            i11++;
                            c = 0;
                        }
                        List list3 = a9.f79300a;
                        long j3 = a9.f79301b;
                        long j4 = a9.f79302c;
                        int i12 = a9.f79303d;
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = new Bundle();
                        int i13 = 0;
                        while (i13 < 2) {
                            bundle2.putParcelableArray(strArr[i13], activityRecognitionResultArr[i13]);
                            i13++;
                            strArr = strArr;
                        }
                        bundle.putBundle("test_ar_models", bundle2);
                        a9 = new ActivityRecognitionResult(list3, j3, j4, i12, bundle);
                    }
                    arrayList.clear();
                    arrayList4.clear();
                    return bfnq.m97344a(beqt.f112072c, a9, arrayList2);
                }
            } else {
                i2 = -1;
                i4 = 0;
                i3 = a;
                d = d;
                bfku3 = bfku3;
                besc = this;
            }
        }
        if (arrayList2.isEmpty()) {
            this.f112061c = false;
            return bfnq.m97344a(beqt.m95451b((long) bfku2.f114316b), null, arrayList2);
        }
        long j5 = 0;
        if (((ActivityRecognitionResult) arrayList2.get(0)).mo43491a().mo43513a() != 2 && !z) {
            j5 = 5000;
        }
        beqt a11 = beqt.m95449a(j5);
        this.f112061c = true;
        return bfnq.m97344a(a11, null, arrayList2);
    }

    /* renamed from: a */
    public final void mo60939a() {
        super.mo60939a();
        this.f112273h.mo61070a();
    }
}
