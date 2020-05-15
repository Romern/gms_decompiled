package com.google.android.gms.fitness.sensors.activity;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityRecognitionIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f32367a = zvt.m46581a();

    /* renamed from: b */
    private zgj f32368b;

    /* renamed from: c */
    private ytp f32369c;

    public ActivityRecognitionIntentOperation() {
    }

    /* renamed from: a */
    private static bngx m23733a(Intent intent) {
        List d = ActivityRecognitionResult.m66823d(intent);
        if (d != null) {
            return bngx.m109368a((Collection) d);
        }
        if (ActivityRecognitionResult.m66819a(intent)) {
            return bngx.m109356a(ActivityRecognitionResult.m66821b(intent));
        }
        bnsl bnsl = (bnsl) f32367a.mo68388c();
        bnsl.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Received an intent %s %s with no result. Ignoring.", intent, intent.getExtras());
        return bngx.m109376e();
    }

    /* renamed from: a */
    private static boolean m23736a(ActivityRecognitionResult activityRecognitionResult) {
        return (activityRecognitionResult == null || activityRecognitionResult.f79301b == 0) ? false : true;
    }

    public final void onCreate() {
        this.f32368b = zgj.m45375a(this, zgl.m45389a());
        this.f32369c = yzq.m45107a(this).mo30887i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    public final void onHandleIntent(Intent intent) {
        bzzi bzzi;
        bngx bngx;
        char c;
        DetectedActivity detectedActivity;
        String str;
        bngx bngx2;
        String str2;
        Intent intent2 = intent;
        String action = intent.getAction();
        if (action != null) {
            bzzi[] values = bzzi.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                bzzi = values[i];
                if (action.equals(bzzi.f171976c)) {
                    break;
                }
                i++;
            }
            String str3 = "com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation";
            if (bzzi != null) {
                bnsl bnsl = (bnsl) f32367a.mo68387b();
                bnsl.mo68432a(str3, "onHandleIntent", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Received an intent with no type: %s, ignoring", intent2);
                return;
            }
            bngx a = this.f32368b.mo31086a(bzzi);
            if (a.isEmpty()) {
                bnsl bnsl2 = (bnsl) f32367a.mo68388c();
                bnsl2.mo68432a(str3, "onHandleIntent", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Received intent %s with no listeners, ignoring", intent2);
                this.f32368b.mo31090b(bzzi);
                return;
            } else if (intent2.hasExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY")) {
                this.f32369c.mo30768a(3);
                if (!ActivityRecognitionResult.m66819a(intent)) {
                    intent.getExtras();
                    return;
                }
                ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
                if (!m23736a(b)) {
                    bnsl bnsl3 = (bnsl) f32367a.mo68388c();
                    bnsl3.mo68432a(str3, "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Invalid AR result received: %s", b);
                    return;
                } else if (((float) b.mo43490a(3)) < 90.0f) {
                    byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY");
                    if (!cdzd.m135485n()) {
                        bnsl bnsl4 = (bnsl) f32367a.mo68388c();
                        bnsl4.mo68432a(str3, "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Shouldn't have received sensor events, ignore.");
                        bngx2 = bngx.m109376e();
                        str = str3;
                    } else if (byteArrayExtra != null) {
                        int length2 = byteArrayExtra.length;
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(byteArrayExtra, 0, length2);
                        obtain.setDataPosition(0);
                        long readLong = obtain.readLong();
                        obtain.readLong();
                        int readInt = obtain.readInt();
                        bngs b2 = bngx.m109371b(readInt);
                        int i2 = 0;
                        while (i2 < readInt) {
                            int readInt2 = obtain.readInt();
                            int readInt3 = obtain.readInt();
                            long[] jArr = new long[readInt3];
                            float[] fArr = new float[(readInt3 * obtain.readInt())];
                            obtain.readLongArray(jArr);
                            obtain.readFloatArray(fArr);
                            int[] iArr = new int[readInt3];
                            int i3 = readInt;
                            int i4 = 0;
                            while (i4 < readInt3) {
                                iArr[i4] = (int) TimeUnit.NANOSECONDS.toMillis(jArr[i4]);
                                i4++;
                                readLong = readLong;
                                str3 = str3;
                            }
                            int i5 = iArr[readInt3 - 1];
                            caae caae = this.f32368b.f55022b;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            caau caau = (caau) caaw.f172379i.mo74144da();
                            caau.mo74603b(bqcn.m112586b(iArr));
                            caau caau2 = (caau) caaw.f172379i.mo74144da();
                            caau2.mo74601a(bqcl.m112573a(fArr));
                            b2.mo67668c(yyk.m45011a(caae, readLong - ((long) i5), readLong, timeUnit, yyp.m45047a(readInt2), (caaw) caau.mo74062i(), (caaw) caau2.mo74062i()));
                            i2++;
                            readInt = i3;
                            str3 = str3;
                        }
                        str = str3;
                        obtain.recycle();
                        bngx2 = b2.mo67664a();
                    } else {
                        str = str3;
                        bngx2 = bngx.m109376e();
                    }
                    if (!bngx2.isEmpty()) {
                        this.f32369c.mo30770a(bzzn.f172096ai, bngx2.size());
                        int size = a.size();
                        int i6 = 0;
                        while (i6 < size) {
                            if (!m23737a((zgg) a.get(i6), bngx2)) {
                                bnsl bnsl5 = (bnsl) f32367a.mo68388c();
                                str2 = str;
                                bnsl5.mo68432a(str2, "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5.mo68405a("Failed to deliver sensor events to client.");
                            } else {
                                str2 = str;
                            }
                            i6++;
                            str = str2;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else {
                this.f32369c.mo30768a(2);
                List d = ActivityRecognitionResult.m66823d(intent);
                if (d != null) {
                    bngx = bngx.m109368a((Collection) d);
                } else if (ActivityRecognitionResult.m66819a(intent)) {
                    bngx = bngx.m109356a(ActivityRecognitionResult.m66821b(intent));
                } else {
                    bnsl bnsl6 = (bnsl) f32367a.mo68388c();
                    bnsl6.mo68432a(str3, "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68424a("Received an intent %s %s with no result. Ignoring.", intent2, intent.getExtras());
                    bngx = bngx.m109376e();
                }
                if (bngx.isEmpty()) {
                    bnsl bnsl7 = (bnsl) f32367a.mo68388c();
                    bnsl7.mo68432a(str3, "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68405a("No AR result.");
                    return;
                }
                ArrayList arrayList = new ArrayList(bngx.size());
                bnre i7 = bngx.listIterator();
                while (i7.hasNext()) {
                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) i7.next();
                    if (!m23736a(activityRecognitionResult)) {
                        bnsl bnsl8 = (bnsl) f32367a.mo68388c();
                        bnsl8.mo68432a(str3, "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl8.mo68420a("Invalid AR result received: %s. Ignoring.", activityRecognitionResult);
                    } else {
                        activityRecognitionResult.mo43491a();
                        long j = activityRecognitionResult.f79301b;
                        List<DetectedActivity> list = activityRecognitionResult.f79300a;
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (DetectedActivity detectedActivity2 : list) {
                            if (detectedActivity2.f79320e > 0) {
                                arrayList2.add(detectedActivity2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            bnsl bnsl9 = (bnsl) f32367a.mo68387b();
                            bnsl9.mo68432a(str3, "a", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl9.mo68420a("No detected activities: %s", activityRecognitionResult);
                        } else {
                            int i8 = activityRecognitionResult.f79303d;
                            if (bzzi == bzzi.DETAILED) {
                                arrayList.add(m23735a(bzzi.DETAILED, arrayList2, activityRecognitionResult.f79301b, i8));
                            } else if (bzzi == bzzi.DEFAULT) {
                                if (arrayList2.size() > 1) {
                                    if (((DetectedActivity) arrayList2.get(0)).mo43513a() == 2) {
                                        detectedActivity = (DetectedActivity) arrayList2.get(1);
                                        c = 0;
                                        bzzi bzzi2 = bzzi.DEFAULT;
                                        DetectedActivity[] detectedActivityArr = new DetectedActivity[1];
                                        detectedActivityArr[c] = detectedActivity;
                                        arrayList.add(m23735a(bzzi2, bnkn.m109665a(detectedActivityArr), activityRecognitionResult.f79301b, i8));
                                    }
                                }
                                c = 0;
                                detectedActivity = (DetectedActivity) arrayList2.get(0);
                                bzzi bzzi22 = bzzi.DEFAULT;
                                DetectedActivity[] detectedActivityArr2 = new DetectedActivity[1];
                                detectedActivityArr2[c] = detectedActivity;
                                arrayList.add(m23735a(bzzi22, bnkn.m109665a(detectedActivityArr2), activityRecognitionResult.f79301b, i8));
                            } else {
                                bnsl bnsl10 = (bnsl) f32367a.mo68387b();
                                bnsl10.mo68432a(str3, "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl10.mo68420a("Unknown type: %s", bzzi);
                                return;
                            }
                        }
                    }
                }
                this.f32369c.mo30770a(bzzn.f172114h, arrayList.size());
                if (!arrayList.isEmpty()) {
                    int size2 = a.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        if (!m23737a((zgg) a.get(i9), bngx.m109368a((Collection) arrayList))) {
                            bnsl bnsl11 = (bnsl) f32367a.mo68388c();
                            bnsl11.mo68432a(str3, "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl11.mo68405a("Failed to deliver AR results to listener.");
                        }
                    }
                    return;
                }
                return;
            }
        }
        bzzi = null;
        String str32 = "com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation";
        if (bzzi != null) {
        }
    }

    public ActivityRecognitionIntentOperation(zgj zgj, ytp ytp) {
        this.f32368b = zgj;
        this.f32369c = ytp;
    }

    /* renamed from: a */
    private final bngx m23734a(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (!cdzd.m135485n()) {
            bnsl bnsl = (bnsl) f32367a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Shouldn't have received sensor events, ignore.");
            return bngx.m109376e();
        } else if (bArr2 == null) {
            return bngx.m109376e();
        } else {
            int length = bArr2.length;
            Parcel obtain = Parcel.obtain();
            char c = 0;
            obtain.unmarshall(bArr2, 0, length);
            obtain.setDataPosition(0);
            long readLong = obtain.readLong();
            obtain.readLong();
            int readInt = obtain.readInt();
            bngs b = bngx.m109371b(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = obtain.readInt();
                int readInt3 = obtain.readInt();
                long[] jArr = new long[readInt3];
                float[] fArr = new float[(obtain.readInt() * readInt3)];
                obtain.readLongArray(jArr);
                obtain.readFloatArray(fArr);
                int[] iArr = new int[readInt3];
                int i2 = 0;
                while (i2 < readInt3) {
                    iArr[i2] = (int) TimeUnit.NANOSECONDS.toMillis(jArr[i2]);
                    i2++;
                    readInt2 = readInt2;
                    c = 0;
                }
                int i3 = iArr[readInt3 - 1];
                caae caae = this.f32368b.f55022b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                caaw[] caawArr = new caaw[3];
                caawArr[c] = yyp.m45047a(readInt2);
                caau caau = (caau) caaw.f172379i.mo74144da();
                caau.mo74603b(bqcn.m112586b(iArr));
                caawArr[1] = (caaw) caau.mo74062i();
                caau caau2 = (caau) caaw.f172379i.mo74144da();
                caau2.mo74601a(bqcl.m112573a(fArr));
                caawArr[2] = (caaw) caau2.mo74062i();
                b.mo67668c(yyk.m45011a(caae, readLong - ((long) i3), readLong, timeUnit, caawArr));
            }
            obtain.recycle();
            return b.mo67664a();
        }
    }

    /* renamed from: a */
    private final cadn m23735a(bzzi bzzi, List list, long j, int i) {
        HashMap hashMap = new HashMap();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            DetectedActivity detectedActivity = (DetectedActivity) list.get(i2);
            int a = zgo.m45397a(detectedActivity);
            if (a >= 0) {
                hashMap.put(bzzh.m126348a(a), Float.valueOf((float) detectedActivity.f79320e));
            }
        }
        int M = (int) cdzd.f182003a.mo6606a().mo78546M();
        if (M != 0 && list.size() == 1 && ((DetectedActivity) list.get(0)).mo43513a() == 6) {
            j += (long) M;
        }
        caae caae = (caae) this.f32368b.f55021a.get(bzzi);
        bmzs.m108696a(caae);
        cadn a2 = yyk.m45014a(caae, j, TimeUnit.MILLISECONDS, yyp.m45048a(hashMap));
        if (i == 0) {
            return a2;
        }
        bxvd da = cacx.f172639c.mo74144da();
        bxvd da2 = cacw.f172635c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cacw cacw = (cacw) da2.f164949b;
        cacw.f172637a |= 1;
        cacw.f172638b = i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cacx cacx = (cacx) da.f164949b;
        cacw cacw2 = (cacw) da2.mo74062i();
        cacw2.getClass();
        cacx.f172642b = cacw2;
        cacx.f172641a = 1;
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        cadm cadm = (cadm) bxvd;
        bxtx aL = ((cacx) da.mo74062i()).mo73639aL();
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn cadn2 = cadn.f172699j;
        aL.getClass();
        cadn.f172701a |= 64;
        cadn.f172709i = aL;
        return (cadn) cadm.mo74062i();
    }

    /* renamed from: a */
    private final boolean m23737a(zgg zgg, List list) {
        try {
            zgg.mo30949a(list);
            return true;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f32367a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 338, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't send event to listener. Assuming listener is dead.");
            this.f32368b.mo31088a(zgg);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19152a(Intent intent, List list) {
        bngx bngx;
        int i = 3;
        this.f32369c.mo30768a(3);
        if (!ActivityRecognitionResult.m66819a(intent)) {
            intent.getExtras();
            return;
        }
        ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
        if (!m23736a(b)) {
            bnsl bnsl = (bnsl) f32367a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Invalid AR result received: %s", b);
        } else if (((float) b.mo43490a(3)) < 90.0f) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY");
            if (!cdzd.m135485n()) {
                bnsl bnsl2 = (bnsl) f32367a.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Shouldn't have received sensor events, ignore.");
                bngx = bngx.m109376e();
            } else if (byteArrayExtra != null) {
                int length = byteArrayExtra.length;
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, length);
                obtain.setDataPosition(0);
                long readLong = obtain.readLong();
                obtain.readLong();
                int readInt = obtain.readInt();
                bngs b2 = bngx.m109371b(readInt);
                for (int i2 = 0; i2 < readInt; i2++) {
                    int readInt2 = obtain.readInt();
                    int readInt3 = obtain.readInt();
                    long[] jArr = new long[readInt3];
                    float[] fArr = new float[(obtain.readInt() * readInt3)];
                    obtain.readLongArray(jArr);
                    obtain.readFloatArray(fArr);
                    int[] iArr = new int[readInt3];
                    int i3 = 0;
                    while (i3 < readInt3) {
                        iArr[i3] = (int) TimeUnit.NANOSECONDS.toMillis(jArr[i3]);
                        i3++;
                        b2 = b2;
                        i = 3;
                    }
                    int i4 = iArr[readInt3 - 1];
                    caae caae = this.f32368b.f55022b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    caaw[] caawArr = new caaw[i];
                    caawArr[0] = yyp.m45047a(readInt2);
                    caau caau = (caau) caaw.f172379i.mo74144da();
                    caau.mo74603b(bqcn.m112586b(iArr));
                    caawArr[1] = (caaw) caau.mo74062i();
                    caau caau2 = (caau) caaw.f172379i.mo74144da();
                    caau2.mo74601a(bqcl.m112573a(fArr));
                    caawArr[2] = (caaw) caau2.mo74062i();
                    b2.mo67668c(yyk.m45011a(caae, readLong - ((long) i4), readLong, timeUnit, caawArr));
                }
                obtain.recycle();
                bngx = b2.mo67664a();
            } else {
                bngx = bngx.m109376e();
            }
            if (!bngx.isEmpty()) {
                this.f32369c.mo30770a(bzzn.f172096ai, bngx.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!m23737a((zgg) it.next(), bngx)) {
                        bnsl bnsl3 = (bnsl) f32367a.mo68388c();
                        bnsl3.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Failed to deliver sensor events to client.");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19153a(Intent intent, List list, bzzi bzzi) {
        bngx bngx;
        Object obj;
        bzzi bzzi2 = bzzi;
        this.f32369c.mo30768a(2);
        List d = ActivityRecognitionResult.m66823d(intent);
        if (d != null) {
            bngx = bngx.m109368a((Collection) d);
        } else if (ActivityRecognitionResult.m66819a(intent)) {
            bngx = bngx.m109356a(ActivityRecognitionResult.m66821b(intent));
        } else {
            bnsl bnsl = (bnsl) f32367a.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Received an intent %s %s with no result. Ignoring.", intent, intent.getExtras());
            bngx = bngx.m109376e();
        }
        if (bngx.isEmpty()) {
            bnsl bnsl2 = (bnsl) f32367a.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("No AR result.");
            return;
        }
        ArrayList arrayList = new ArrayList(bngx.size());
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) i.next();
            if (!m23736a(activityRecognitionResult)) {
                bnsl bnsl3 = (bnsl) f32367a.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Invalid AR result received: %s. Ignoring.", activityRecognitionResult);
            } else {
                activityRecognitionResult.mo43491a();
                long j = activityRecognitionResult.f79301b;
                List<DetectedActivity> list2 = activityRecognitionResult.f79300a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                for (DetectedActivity detectedActivity : list2) {
                    if (detectedActivity.f79320e > 0) {
                        arrayList2.add(detectedActivity);
                    }
                }
                if (arrayList2.isEmpty()) {
                    bnsl bnsl4 = (bnsl) f32367a.mo68387b();
                    bnsl4.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("No detected activities: %s", activityRecognitionResult);
                } else {
                    int i2 = activityRecognitionResult.f79303d;
                    if (bzzi2 == bzzi.DETAILED) {
                        arrayList.add(m23735a(bzzi.DETAILED, arrayList2, activityRecognitionResult.f79301b, i2));
                    } else if (bzzi2 == bzzi.DEFAULT) {
                        if (arrayList2.size() <= 1 || ((DetectedActivity) arrayList2.get(0)).mo43513a() != 2) {
                            obj = arrayList2.get(0);
                        } else {
                            obj = arrayList2.get(1);
                        }
                        arrayList.add(m23735a(bzzi.DEFAULT, bnkn.m109665a((DetectedActivity) obj), activityRecognitionResult.f79301b, i2));
                    } else {
                        bnsl bnsl5 = (bnsl) f32367a.mo68387b();
                        bnsl5.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("Unknown type: %s", bzzi2);
                        return;
                    }
                }
            }
        }
        this.f32369c.mo30770a(bzzn.f172114h, arrayList.size());
        if (!arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!m23737a((zgg) it.next(), bngx.m109368a((Collection) arrayList))) {
                    bnsl bnsl6 = (bnsl) f32367a.mo68388c();
                    bnsl6.mo68432a("com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Failed to deliver AR results to listener.");
                }
            }
        }
    }
}
