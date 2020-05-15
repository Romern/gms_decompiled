package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.ulr.ApiActivityReading;
import com.google.android.ulr.ApiExperiment;
import com.google.android.ulr.ApiLocationReading;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bgwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwd extends bgwc {

    /* renamed from: j */
    public static bgwz f117812j;

    /* renamed from: i */
    public final Context f117813i;

    /* renamed from: k */
    private final int f117814k;

    /* renamed from: l */
    private final int f117815l;

    /* renamed from: m */
    private final int f117816m;

    /* renamed from: n */
    private final Boolean f117817n;

    public bgwd(Context context, bgwz bgwz, int i, int i2, int i3, Boolean bool) {
        this.f117813i = context;
        f117812j = bgwz;
        this.f117814k = i;
        this.f117815l = i2;
        this.f117816m = i3;
        this.f117817n = bool;
    }

    /* renamed from: a */
    private final bvvt m100153a(bguj bguj, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = bguj.f117569d;
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            arrayList4.addAll(((bvxg) arrayList3.get(i)).f158060a);
        }
        bxvd da = bvxg.f158058b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvxg bvxg = (bvxg) da.f164949b;
        if (!bvxg.f158060a.mo73666a()) {
            bvxg.f158060a = bxvk.m124021a(bvxg.f158060a);
        }
        bxsy.m123078a(arrayList4, bvxg.f158060a);
        bvxg bvxg2 = (bvxg) da.mo74062i();
        ArrayList arrayList5 = bguj.f117570e;
        bvwj a = bgzi.m100445a(bgzt.m100502d(this.f117813i));
        bvwj a2 = bgzi.m100445a(bgzt.m100501c(this.f117813i));
        bvwj a3 = bgzi.m100445a(bgzt.m100499b(this.f117813i));
        bxvd da2 = bvvt.f157843j.mo74144da();
        ArrayList arrayList6 = bguj.f117568c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvt bvvt = (bvvt) da2.f164949b;
        if (!bvvt.f157848d.mo73666a()) {
            bvvt.f157848d = bxvk.m124021a(bvvt.f157848d);
        }
        bxsy.m123078a(arrayList6, bvvt.f157848d);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvt bvvt2 = (bvvt) da2.f164949b;
        if (!bvvt2.f157850f.mo73666a()) {
            bvvt2.f157850f = bxvk.m124021a(bvvt2.f157850f);
        }
        bxsy.m123078a(arrayList5, bvvt2.f157850f);
        if (arrayList != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt3 = (bvvt) da2.f164949b;
            if (!bvvt3.f157847c.mo73666a()) {
                bvvt3.f157847c = bxvk.m124021a(bvvt3.f157847c);
            }
            bxsy.m123078a(arrayList, bvvt3.f157847c);
        }
        if (arrayList2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt4 = (bvvt) da2.f164949b;
            if (!bvvt4.f157846b.mo73666a()) {
                bvvt4.f157846b = bxvk.m124021a(bvvt4.f157846b);
            }
            bxsy.m123078a(arrayList2, bvvt4.f157846b);
        }
        if (bvxg2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt5 = (bvvt) da2.f164949b;
            bvxg2.getClass();
            bvvt5.f157849e = bvxg2;
            bvvt5.f157845a |= 1;
        }
        if (a != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt6 = (bvvt) da2.f164949b;
            a.getClass();
            bvvt6.f157853i = a;
            bvvt6.f157845a |= 8;
        }
        if (a2 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt7 = (bvvt) da2.f164949b;
            a2.getClass();
            bvvt7.f157851g = a2;
            bvvt7.f157845a |= 2;
        }
        if (a3 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvvt bvvt8 = (bvvt) da2.f164949b;
            a3.getClass();
            bvvt8.f157852h = a3;
            bvvt8.f157845a |= 4;
        }
        return (bvvt) da2.mo74062i();
    }

    /* renamed from: a */
    public static ClientContext m100154a(Context context, Account account) {
        int myUid = Process.myUid();
        String str = account.name;
        String str2 = account.name;
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str2, packageName, packageName);
        clientContext.mo17806d("https://www.googleapis.com/auth/userlocation.reporting");
        return clientContext;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:220:0x055e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:469:0x0538 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:471:0x0538 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:231:0x0580 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:452:0x0306 */
    /* JADX WARN: Type inference failed for: r27v24, assign insn: PHI: (r27v24 ?) = (r27v25 java.util.ArrayList), (r27v26 java.util.ArrayList) binds: [B:49:0x013c, B:48:0x0137] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x07f1  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0805  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x086c  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08c5  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x08cb A[SYNTHETIC] */
    /* renamed from: a */
    public final bgwb mo63277a(Account account, int i, String str, bguj bguj, long j) {
        int i2;
        long j2;
        bvwb bvwb;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        long j3;
        bvwb bvwb2;
        ArrayList arrayList8;
        bxvd da;
        int i4;
        bxvd da2;
        bxwc bxwc;
        long j4;
        int i5;
        long j5;
        ArrayList arrayList9;
        int i6;
        ArrayList arrayList10;
        int i7;
        bguj bguj2 = bguj;
        boolean b = chcj.m148164b();
        sdo.m34975b(!bguj2.f117566a.isEmpty(), "Must have at least 1 location to upload");
        bxvd a = mo63278a(str, !b);
        if (!sre.m36081a(this.f117813i.getResources())) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bvwb bvwb3 = (bvwb) a.f164949b;
        bvwb bvwb4 = bvwb.f157885r;
        bvwb3.f157899m = i2 - 1;
        bvwb3.f157887a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bvwb bvwb5 = (bvwb) a.mo74062i();
        long currentTimeMillis = System.currentTimeMillis();
        if (chcp.f188340a.mo6606a().mo85001c()) {
            ArrayList arrayList11 = bguj2.f117567b;
            if (!arrayList11.isEmpty()) {
                arrayList3 = new ArrayList(arrayList11.size());
                int size = arrayList11.size();
                int i8 = 0;
                while (i8 < size) {
                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) arrayList11.get(i8);
                    List list = activityRecognitionResult.f79300a;
                    Bundle c = activityRecognitionResult.mo43493c();
                    if (list.size() <= 0) {
                        if (c == null) {
                            arrayList9 = arrayList11;
                            i6 = size;
                        } else if (c.size() <= 0) {
                            arrayList9 = arrayList11;
                            i6 = size;
                        }
                        i8++;
                        size = i6;
                        arrayList11 = arrayList9;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    if (list.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            DetectedActivity detectedActivity = (DetectedActivity) it.next();
                            int a2 = detectedActivity.mo43513a();
                            switch (a2) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 3;
                                    break;
                                case 3:
                                    i7 = 4;
                                    break;
                                case 4:
                                    i7 = 5;
                                    break;
                                case 5:
                                    i7 = 6;
                                    break;
                                case 6:
                                    i7 = 7;
                                    break;
                                case 7:
                                    i7 = 8;
                                    break;
                                case 8:
                                    i7 = 9;
                                    break;
                                default:
                                    switch (a2) {
                                        case 16:
                                            i7 = 10;
                                            break;
                                        case 17:
                                            i7 = 11;
                                            break;
                                        case 18:
                                            i7 = 12;
                                            break;
                                        case 19:
                                            i7 = 13;
                                            break;
                                        case 20:
                                            i7 = 14;
                                            break;
                                        case 21:
                                            i7 = 15;
                                            break;
                                        default:
                                            i7 = 0;
                                            break;
                                    }
                            }
                            if (i7 != 0) {
                                ArrayList arrayList13 = arrayList11;
                                bxvd da3 = bvvm.f157814d.mo74144da();
                                int i9 = detectedActivity.f79320e;
                                int i10 = size;
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvvm bvvm = (bvvm) da3.f164949b;
                                int i11 = bvvm.f157816a | 2;
                                bvvm.f157816a = i11;
                                bvvm.f157818c = i9;
                                bvvm.f157817b = i7 - 1;
                                bvvm.f157816a = i11 | 1;
                                arrayList12.add((bvvm) da3.mo74062i());
                                size = i10;
                                arrayList11 = arrayList13;
                                it = it;
                            }
                        }
                        arrayList9 = arrayList11;
                        i6 = size;
                    } else {
                        arrayList9 = arrayList11;
                        i6 = size;
                    }
                    bxvd da4 = bvvp.f157827f.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bvvp bvvp = (bvvp) da4.f164949b;
                    bvvp.mo73391a();
                    bxsy.m123078a(arrayList12, bvvp.f157832d);
                    if (c == null || c.size() == 0) {
                        arrayList10 = null;
                    } else {
                        arrayList10 = new ArrayList(c.size());
                        Iterator<String> it2 = c.keySet().iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            Object obj = c.get(next);
                            if (obj != null) {
                                Bundle bundle = c;
                                bxvd da5 = bvvo.f157820f.mo74144da();
                                Iterator<String> it3 = it2;
                                if (obj instanceof Integer) {
                                    int intValue = ((Integer) obj).intValue();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo = (bvvo) da5.f164949b;
                                    bvvo.f157823b = 3;
                                    bvvo.f157824c = Integer.valueOf(intValue);
                                } else if (obj instanceof Boolean) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo2 = (bvvo) da5.f164949b;
                                    bvvo2.f157823b = 8;
                                    bvvo2.f157824c = Boolean.valueOf(booleanValue);
                                } else if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo3 = (bvvo) da5.f164949b;
                                    bvvo3.f157823b = 6;
                                    bvvo3.f157824c = Double.valueOf(doubleValue);
                                } else if (obj instanceof Float) {
                                    float floatValue = ((Float) obj).floatValue();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo4 = (bvvo) da5.f164949b;
                                    bvvo4.f157823b = 5;
                                    bvvo4.f157824c = Float.valueOf(floatValue);
                                } else if (obj instanceof Long) {
                                    long longValue = ((Long) obj).longValue();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo5 = (bvvo) da5.f164949b;
                                    bvvo5.f157823b = 4;
                                    bvvo5.f157824c = Long.valueOf(longValue);
                                } else if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvvo bvvo6 = (bvvo) da5.f164949b;
                                    str2.getClass();
                                    bvvo6.f157823b = 7;
                                    bvvo6.f157824c = str2;
                                } else {
                                    bgur.m100024c("GCoreUlr", 27, String.format(Locale.US, "ActivityRecognitionResult extras bundle contains object (%s) with unsupported type.", obj.toString()));
                                    it2 = it3;
                                    c = bundle;
                                }
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvvo bvvo7 = (bvvo) da5.f164949b;
                                bvvo7.f157825d = 1;
                                int i12 = bvvo7.f157822a | 1;
                                bvvo7.f157822a = i12;
                                next.getClass();
                                bvvo7.f157822a = i12 | 2;
                                bvvo7.f157826e = next;
                                arrayList10.add((bvvo) da5.mo74062i());
                                it2 = it3;
                                c = bundle;
                            }
                        }
                    }
                    if (arrayList10 != null) {
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bvvp bvvp2 = (bvvp) da4.f164949b;
                        bvvp2.mo73392b();
                        bxsy.m123078a(arrayList10, bvvp2.f157833e);
                    }
                    long j6 = activityRecognitionResult.f79301b;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bvvp bvvp3 = (bvvp) da4.f164949b;
                    bvvp3.f157829a |= 1;
                    bvvp3.f157830b = j6;
                    arrayList3.add((bvvp) da4.mo74062i());
                    i8++;
                    size = i6;
                    arrayList11 = arrayList9;
                }
            } else {
                arrayList3 = null;
            }
            ArrayList arrayList14 = bguj2.f117566a;
            if (arrayList14.size() > 0) {
                arrayList2 = new ArrayList(arrayList14.size());
                int size2 = arrayList14.size();
                int i13 = 0;
                ArrayList arrayList15 = arrayList9;
                while (i13 < size2) {
                    bgvr bgvr = (bgvr) arrayList14.get(i13);
                    bxvd da6 = bvwl.f157951m.mo74144da();
                    if ((bgvr.f117715a & 32) != 0) {
                        int round = (int) Math.round(bgvr.f117721g);
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl = (bvwl) da6.f164949b;
                        bvwl.f157953a |= 16;
                        bvwl.f157958f = round;
                    }
                    if ((bgvr.f117715a & 1024) != 0) {
                        boolean z = bgvr.f117725k;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl2 = (bvwl) da6.f164949b;
                        bvwl2.f157953a |= 1024;
                        bvwl2.f157964l = z;
                    }
                    if ((bgvr.f117715a & 16) != 0) {
                        int i14 = (int) bgvr.f117720f;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl3 = (bvwl) da6.f164949b;
                        bvwl3.f157953a |= 8;
                        bvwl3.f157957e = i14;
                    }
                    if ((bgvr.f117715a & 64) != 0) {
                        int i15 = (int) bgvr.f117722h;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl4 = (bvwl) da6.f164949b;
                        bvwl4.f157953a |= 128;
                        bvwl4.f157961i = i15;
                    }
                    if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                        int round2 = Math.round(bgvr.f117734t);
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl5 = (bvwl) da6.f164949b;
                        bvwl5.f157953a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bvwl5.f157962j = round2;
                    }
                    if ((bgvr.f117715a & 4096) != 0) {
                        int i16 = bgvr.f117727m;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl6 = (bvwl) da6.f164949b;
                        bvwl6.f157953a |= 32;
                        bvwl6.f157959g = i16;
                    }
                    if ((bgvr.f117715a & 2048) != 0) {
                        String str3 = bgvr.f117726l;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl7 = (bvwl) da6.f164949b;
                        str3.getClass();
                        bvwl7.f157953a |= 64;
                        bvwl7.f157960h = str3;
                    }
                    if ((bgvr.f117715a & 1) == 0) {
                        long j7 = bgvr.f117718d;
                        arrayList6 = arrayList14;
                        bgvq a3 = bgvq.m100134a(bgvr.f117717c);
                        if (a3 == null) {
                            a3 = bgvq.WIFI;
                        }
                        int i17 = a3.f117712f;
                        i3 = size2;
                        arrayList5 = arrayList3;
                        StringBuilder sb = new StringBuilder(77);
                        sb.append("Location missing position; timestamp=");
                        sb.append(j7);
                        sb.append("; source=");
                        sb.append(i17);
                        bgur.m100022b("GCoreUlr", new IllegalStateException(sb.toString()));
                    } else {
                        arrayList6 = arrayList14;
                        i3 = size2;
                        arrayList5 = arrayList3;
                        bgvu bgvu = bgvr.f117716b;
                        if (bgvu == null) {
                            bgvu = bgvu.f117746d;
                        }
                        int i18 = bgvu.f117749b;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl8 = (bvwl) da6.f164949b;
                        int i19 = bvwl8.f157953a | 1;
                        bvwl8.f157953a = i19;
                        bvwl8.f157954b = i18;
                        int i20 = bgvu.f117750c;
                        bvwl8.f157953a = i19 | 2;
                        bvwl8.f157955c = i20;
                    }
                    if ((bgvr.f117715a & 8) != 0) {
                        int i21 = (int) bgvr.f117719e;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bvwl bvwl9 = (bvwl) da6.f164949b;
                        bvwl9.f157953a |= 4;
                        bvwl9.f157956d = i21;
                    }
                    bvwl bvwl10 = (bvwl) da6.mo74062i();
                    bxvd da7 = bvxf.f158050g.mo74144da();
                    if ((bgvr.f117715a & 2) != 0) {
                        bgvq a4 = bgvq.m100134a(bgvr.f117717c);
                        if (a4 == null) {
                            a4 = bgvq.WIFI;
                        }
                        int a5 = bvxe.m121558a(a4.f117712f);
                        if (a5 != 0) {
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = false;
                            }
                            bvxf bvxf = (bvxf) da7.f164949b;
                            bvxf.f158053b = a5 - 1;
                            bvxf.f158052a |= 1;
                        }
                    }
                    ArrayList arrayList16 = bgzt.f118166a;
                    if (arrayList16 != null) {
                        arrayList7 = new ArrayList(arrayList16.size());
                        int size3 = arrayList16.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            bvwi a6 = bgzi.m100444a((ApiExperiment) arrayList16.get(i22));
                            if (a6 != null) {
                                arrayList7.add(a6);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                    if (bgvr.f117728n.size() > 0 && (bxwc = bgvr.f117728n) != null) {
                        try {
                            if (!bxwc.isEmpty()) {
                                arrayList8 = new ArrayList(bxwc.size());
                                Iterator it4 = bxwc.iterator();
                                j4 = arrayList15;
                                while (it4.hasNext()) {
                                    bgvz bgvz = (bgvz) it4.next();
                                    int i23 = bgvz.f117771a;
                                    if ((i23 & 1) == 0 || (i23 & 2) == 0) {
                                        j4 = currentTimeMillis;
                                    } else {
                                        bxvd da8 = bvyq.f158199j.mo74144da();
                                        Iterator it5 = it4;
                                        if ((bgvz.f117771a & 4) != 0) {
                                            try {
                                                int a7 = bgvy.m100144a(bgvz.f117774d);
                                                if (a7 == 0) {
                                                    a7 = 1;
                                                }
                                                int a8 = bvyp.m121598a(a7 - 1);
                                                if (a8 == 0) {
                                                    i5 = a8;
                                                    int a9 = bgvy.m100144a(bgvz.f117774d);
                                                    if (a9 == 0) {
                                                        a9 = 1;
                                                    }
                                                    int i24 = a9 - 1;
                                                    j4 = currentTimeMillis;
                                                    try {
                                                        StringBuilder sb2 = new StringBuilder(45);
                                                        sb2.append("Unknown value for wifi auth type: ");
                                                        sb2.append(i24);
                                                        bgur.m100024c("GCoreUlr", 28, sb2.toString());
                                                    } catch (RuntimeException e) {
                                                        e = e;
                                                        j5 = j4;
                                                        bvwb2 = bvwb5;
                                                        j4 = j5;
                                                        bgur.m100021b("GCoreUlr", "Best-effort Wifi scan conversion failed", e);
                                                        arrayList8 = null;
                                                        j3 = j4;
                                                        if (arrayList8 != null) {
                                                        }
                                                        if ((bgvr.f117715a & 512) != 0) {
                                                        }
                                                        if ((bgvr.f117715a & 8192) == 0) {
                                                        }
                                                        bvxf bvxf2 = (bvxf) da7.mo74062i();
                                                        da = bvwm.f157965j.mo74144da();
                                                        if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                                                        }
                                                        if ((bgvr.f117715a & 4) != 0) {
                                                        }
                                                        if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                                        }
                                                        if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                                                        }
                                                        if (arrayList7 != null) {
                                                        }
                                                        if (!da.f164950c) {
                                                        }
                                                        bvwm bvwm = (bvwm) da.f164949b;
                                                        bvwl10.getClass();
                                                        bvwm.f157970d = bvwl10;
                                                        int i25 = bvwm.f157967a | 4;
                                                        bvwm.f157967a = i25;
                                                        bvxf2.getClass();
                                                        bvwm.f157969c = bvxf2;
                                                        bvwm.f157967a = i25 | 2;
                                                        arrayList2.add((bvwm) da.mo74062i());
                                                        i13++;
                                                        arrayList14 = arrayList6;
                                                        size2 = i3;
                                                        arrayList3 = arrayList5;
                                                        bvwb5 = bvwb2;
                                                        currentTimeMillis = j3;
                                                        arrayList15 = j3;
                                                    }
                                                } else {
                                                    i5 = a8;
                                                    j4 = currentTimeMillis;
                                                }
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                j5 = currentTimeMillis;
                                                bvwb2 = bvwb5;
                                                j4 = j5;
                                                bgur.m100021b("GCoreUlr", "Best-effort Wifi scan conversion failed", e);
                                                arrayList8 = null;
                                                j3 = j4;
                                                if (arrayList8 != null) {
                                                }
                                                if ((bgvr.f117715a & 512) != 0) {
                                                }
                                                if ((bgvr.f117715a & 8192) == 0) {
                                                }
                                                bvxf bvxf22 = (bvxf) da7.mo74062i();
                                                da = bvwm.f157965j.mo74144da();
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                                                }
                                                if ((bgvr.f117715a & 4) != 0) {
                                                }
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                                }
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                                                }
                                                if (arrayList7 != null) {
                                                }
                                                if (!da.f164950c) {
                                                }
                                                bvwm bvwm2 = (bvwm) da.f164949b;
                                                bvwl10.getClass();
                                                bvwm2.f157970d = bvwl10;
                                                int i252 = bvwm2.f157967a | 4;
                                                bvwm2.f157967a = i252;
                                                bvxf22.getClass();
                                                bvwm2.f157969c = bvxf22;
                                                bvwm2.f157967a = i252 | 2;
                                                arrayList2.add((bvwm) da.mo74062i());
                                                i13++;
                                                arrayList14 = arrayList6;
                                                size2 = i3;
                                                arrayList3 = arrayList5;
                                                bvwb5 = bvwb2;
                                                currentTimeMillis = j3;
                                                arrayList15 = j3;
                                            }
                                        } else {
                                            j4 = currentTimeMillis;
                                            i5 = 1;
                                        }
                                        if (i5 != 0) {
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq = (bvyq) da8.f164949b;
                                            bvyq.f158204d = i5 - 1;
                                            bvyq.f158201a |= 4;
                                        }
                                        if ((bgvz.f117771a & 8) != 0) {
                                            boolean z2 = bgvz.f117775e;
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq2 = (bvyq) da8.f164949b;
                                            bvyq2.f158201a |= 8;
                                            bvyq2.f158205e = z2;
                                        }
                                        if (bgvz.f117777g != 0) {
                                            bxvd da9 = bvyr.f158210g.mo74144da();
                                            int i26 = bgvz.f117777g;
                                            if (da9.f164950c) {
                                                da9.mo74035c();
                                                da9.f164950c = false;
                                            }
                                            bvyr bvyr = (bvyr) da9.f164949b;
                                            bvwb2 = bvwb5;
                                            try {
                                                int i27 = bvyr.f158212a | 1;
                                                bvyr.f158212a = i27;
                                                bvyr.f158213b = i26;
                                                int i28 = bgvz.f117778h;
                                                int i29 = i27 | 2;
                                                bvyr.f158212a = i29;
                                                bvyr.f158214c = i28;
                                                int i30 = bgvz.f117779i;
                                                int i31 = i29 | 4;
                                                bvyr.f158212a = i31;
                                                bvyr.f158215d = i30;
                                                int i32 = bgvz.f117780j;
                                                int i33 = i31 | 8;
                                                bvyr.f158212a = i33;
                                                bvyr.f158216e = i32;
                                                int i34 = bgvz.f117781k;
                                                bvyr.f158212a = i33 | 16;
                                                bvyr.f158217f = i34;
                                                bvyr bvyr2 = (bvyr) da9.mo74062i();
                                                if (da8.f164950c) {
                                                    da8.mo74035c();
                                                    da8.f164950c = false;
                                                }
                                                bvyq bvyq3 = (bvyq) da8.f164949b;
                                                bvyr2.getClass();
                                                bvyq3.f158207g = bvyr2;
                                                bvyq3.f158201a |= 32;
                                            } catch (RuntimeException e3) {
                                                e = e3;
                                                bgur.m100021b("GCoreUlr", "Best-effort Wifi scan conversion failed", e);
                                                arrayList8 = null;
                                                j3 = j4;
                                                if (arrayList8 != null) {
                                                }
                                                if ((bgvr.f117715a & 512) != 0) {
                                                }
                                                if ((bgvr.f117715a & 8192) == 0) {
                                                }
                                                bvxf bvxf222 = (bvxf) da7.mo74062i();
                                                da = bvwm.f157965j.mo74144da();
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                                                }
                                                if ((bgvr.f117715a & 4) != 0) {
                                                }
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                                }
                                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                                                }
                                                if (arrayList7 != null) {
                                                }
                                                if (!da.f164950c) {
                                                }
                                                bvwm bvwm22 = (bvwm) da.f164949b;
                                                bvwl10.getClass();
                                                bvwm22.f157970d = bvwl10;
                                                int i2522 = bvwm22.f157967a | 4;
                                                bvwm22.f157967a = i2522;
                                                bvxf222.getClass();
                                                bvwm22.f157969c = bvxf222;
                                                bvwm22.f157967a = i2522 | 2;
                                                arrayList2.add((bvwm) da.mo74062i());
                                                i13++;
                                                arrayList14 = arrayList6;
                                                size2 = i3;
                                                arrayList3 = arrayList5;
                                                bvwb5 = bvwb2;
                                                currentTimeMillis = j3;
                                                arrayList15 = j3;
                                            }
                                        } else {
                                            bvwb2 = bvwb5;
                                        }
                                        String str4 = bgvz.f117782l;
                                        if (chcj.m148166d()) {
                                            str4 = (bgvz.f117771a & 1024) != 0 ? bgvz.f117782l : null;
                                        }
                                        if (str4 != null) {
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq4 = (bvyq) da8.f164949b;
                                            str4.getClass();
                                            bvyq4.f158201a |= 64;
                                            bvyq4.f158208h = str4;
                                        }
                                        if ((bgvz.f117771a & 16) != 0) {
                                            int i35 = bgvz.f117776f;
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq5 = (bvyq) da8.f164949b;
                                            bvyq5.f158201a |= 16;
                                            bvyq5.f158206f = i35;
                                        }
                                        if ((bgvz.f117771a & 1) != 0) {
                                            long j8 = bgvz.f117772b;
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq6 = (bvyq) da8.f164949b;
                                            bvyq6.f158201a |= 1;
                                            bvyq6.f158202b = j8;
                                        }
                                        if ((bgvz.f117771a & 2) != 0) {
                                            int i36 = bgvz.f117773c;
                                            if (da8.f164950c) {
                                                da8.mo74035c();
                                                da8.f164950c = false;
                                            }
                                            bvyq bvyq7 = (bvyq) da8.f164949b;
                                            bvyq7.f158201a |= 2;
                                            bvyq7.f158203c = i36;
                                        }
                                        arrayList8.add((bvyq) da8.mo74062i());
                                        it4 = it5;
                                        bvwb5 = bvwb2;
                                        currentTimeMillis = j4;
                                    }
                                }
                                bvwb2 = bvwb5;
                                j3 = currentTimeMillis;
                                if (arrayList8 != null) {
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bvxf bvxf3 = (bvxf) da7.f164949b;
                                    bvxf3.mo73396a();
                                    bxsy.m123078a(arrayList8, bvxf3.f158057f);
                                }
                                if ((bgvr.f117715a & 512) != 0) {
                                    boolean z3 = bgvr.f117724j;
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bvxf bvxf4 = (bvxf) da7.f164949b;
                                    bvxf4.f158052a |= 4;
                                    bvxf4.f158055d = z3;
                                }
                                if ((bgvr.f117715a & 8192) == 0) {
                                    bgvj bgvj = bgvr.f117729o;
                                    if (bgvj == null) {
                                        bgvj = bgvj.f117660f;
                                    }
                                    if ((bgvj.f117662a & 1) != 0) {
                                        int a10 = bgvi.m100126a(bgvj.f117663b);
                                        if (a10 == 0) {
                                            a10 = 1;
                                        }
                                        int i37 = a10 - 1;
                                        if (i37 == 0) {
                                            i4 = 1;
                                        } else if (i37 == 1) {
                                            i4 = 4;
                                        } else if (i37 == 2) {
                                            i4 = 2;
                                        } else if (i37 != 3) {
                                            i4 = 3;
                                        }
                                        da2 = bvvv.f157855f.mo74144da();
                                        if (i4 != 0) {
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bvvv bvvv = (bvvv) da2.f164949b;
                                            bvvv.f157861e = i4 - 1;
                                            bvvv.f157857a |= 8;
                                        }
                                        int i38 = bgvj.f117665d;
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bvvv bvvv2 = (bvvv) da2.f164949b;
                                        int i39 = bvvv2.f157857a | 1;
                                        bvvv2.f157857a = i39;
                                        bvvv2.f157858b = i38;
                                        int i40 = bgvj.f117664c;
                                        int i41 = i39 | 2;
                                        bvvv2.f157857a = i41;
                                        bvvv2.f157859c = i40;
                                        int i42 = bgvj.f117666e;
                                        bvvv2.f157857a = i41 | 4;
                                        bvvv2.f157860d = i42;
                                        bvvv bvvv3 = (bvvv) da2.mo74062i();
                                        if (da7.f164950c) {
                                            da7.mo74035c();
                                            da7.f164950c = false;
                                        }
                                        bvxf bvxf5 = (bvxf) da7.f164949b;
                                        bvvv3.getClass();
                                        bvxf5.f158056e = bvvv3;
                                        bvxf5.f158052a |= 8;
                                    }
                                    i4 = 0;
                                    da2 = bvvv.f157855f.mo74144da();
                                    if (i4 != 0) {
                                    }
                                    int i382 = bgvj.f117665d;
                                    if (da2.f164950c) {
                                    }
                                    bvvv bvvv22 = (bvvv) da2.f164949b;
                                    int i392 = bvvv22.f157857a | 1;
                                    bvvv22.f157857a = i392;
                                    bvvv22.f157858b = i382;
                                    int i402 = bgvj.f117664c;
                                    int i412 = i392 | 2;
                                    bvvv22.f157857a = i412;
                                    bvvv22.f157859c = i402;
                                    int i422 = bgvj.f117666e;
                                    bvvv22.f157857a = i412 | 4;
                                    bvvv22.f157860d = i422;
                                    bvvv bvvv32 = (bvvv) da2.mo74062i();
                                    if (da7.f164950c) {
                                    }
                                    bvxf bvxf52 = (bvxf) da7.f164949b;
                                    bvvv32.getClass();
                                    bvxf52.f158056e = bvvv32;
                                    bvxf52.f158052a |= 8;
                                }
                                bvxf bvxf2222 = (bvxf) da7.mo74062i();
                                da = bvwm.f157965j.mo74144da();
                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                                    long j9 = bgvr.f117732r;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvwm bvwm3 = (bvwm) da.f164949b;
                                    bvwm3.f157967a |= 32;
                                    bvwm3.f157974h = j9;
                                }
                                if ((bgvr.f117715a & 4) != 0) {
                                    bgvq a11 = bgvq.m100134a(bgvr.f117717c);
                                    if (a11 == null) {
                                        a11 = bgvq.WIFI;
                                    }
                                    int i43 = a11.f117712f;
                                    StringBuilder sb3 = new StringBuilder(46);
                                    sb3.append("Location missing timestamp; source=");
                                    sb3.append(i43);
                                    bgur.m100022b("GCoreUlr", new IllegalStateException(sb3.toString()));
                                } else {
                                    long j10 = bgvr.f117718d;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvwm bvwm4 = (bvwm) da.f164949b;
                                    bvwm4.f157967a |= 1;
                                    bvwm4.f157968b = j10;
                                }
                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                    int i44 = bgvr.f117730p;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvwm bvwm5 = (bvwm) da.f164949b;
                                    bvwm5.f157967a |= 8;
                                    bvwm5.f157972f = i44;
                                }
                                if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                                    int i45 = bgvr.f117731q;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvwm bvwm6 = (bvwm) da.f164949b;
                                    bvwm6.f157967a |= 16;
                                    bvwm6.f157973g = i45;
                                }
                                if (arrayList7 != null) {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvwm bvwm7 = (bvwm) da.f164949b;
                                    bvwm7.mo73393a();
                                    bxsy.m123078a(arrayList7, bvwm7.f157971e);
                                }
                                if (!da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bvwm bvwm222 = (bvwm) da.f164949b;
                                bvwl10.getClass();
                                bvwm222.f157970d = bvwl10;
                                int i25222 = bvwm222.f157967a | 4;
                                bvwm222.f157967a = i25222;
                                bvxf2222.getClass();
                                bvwm222.f157969c = bvxf2222;
                                bvwm222.f157967a = i25222 | 2;
                                arrayList2.add((bvwm) da.mo74062i());
                                i13++;
                                arrayList14 = arrayList6;
                                size2 = i3;
                                arrayList3 = arrayList5;
                                bvwb5 = bvwb2;
                                currentTimeMillis = j3;
                                arrayList15 = j3;
                            }
                        } catch (RuntimeException e4) {
                            e = e4;
                            bvwb2 = bvwb5;
                            j4 = currentTimeMillis;
                            bgur.m100021b("GCoreUlr", "Best-effort Wifi scan conversion failed", e);
                            arrayList8 = null;
                            j3 = j4;
                            if (arrayList8 != null) {
                            }
                            if ((bgvr.f117715a & 512) != 0) {
                            }
                            if ((bgvr.f117715a & 8192) == 0) {
                            }
                            bvxf bvxf22222 = (bvxf) da7.mo74062i();
                            da = bvwm.f157965j.mo74144da();
                            if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                            }
                            if ((bgvr.f117715a & 4) != 0) {
                            }
                            if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                            }
                            if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                            }
                            if (arrayList7 != null) {
                            }
                            if (!da.f164950c) {
                            }
                            bvwm bvwm2222 = (bvwm) da.f164949b;
                            bvwl10.getClass();
                            bvwm2222.f157970d = bvwl10;
                            int i252222 = bvwm2222.f157967a | 4;
                            bvwm2222.f157967a = i252222;
                            bvxf22222.getClass();
                            bvwm2222.f157969c = bvxf22222;
                            bvwm2222.f157967a = i252222 | 2;
                            arrayList2.add((bvwm) da.mo74062i());
                            i13++;
                            arrayList14 = arrayList6;
                            size2 = i3;
                            arrayList3 = arrayList5;
                            bvwb5 = bvwb2;
                            currentTimeMillis = j3;
                            arrayList15 = j3;
                        }
                    }
                    bvwb2 = bvwb5;
                    j3 = currentTimeMillis;
                    arrayList8 = null;
                    if (arrayList8 != null) {
                    }
                    if ((bgvr.f117715a & 512) != 0) {
                    }
                    if ((bgvr.f117715a & 8192) == 0) {
                    }
                    bvxf bvxf222222 = (bvxf) da7.mo74062i();
                    da = bvwm.f157965j.mo74144da();
                    if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                    }
                    if ((bgvr.f117715a & 4) != 0) {
                    }
                    if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                    }
                    if ((bgvr.f117715a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                    }
                    if (arrayList7 != null) {
                    }
                    if (!da.f164950c) {
                    }
                    bvwm bvwm22222 = (bvwm) da.f164949b;
                    bvwl10.getClass();
                    bvwm22222.f157970d = bvwl10;
                    int i2522222 = bvwm22222.f157967a | 4;
                    bvwm22222.f157967a = i2522222;
                    bvxf222222.getClass();
                    bvwm22222.f157969c = bvxf222222;
                    bvwm22222.f157967a = i2522222 | 2;
                    arrayList2.add((bvwm) da.mo74062i());
                    i13++;
                    arrayList14 = arrayList6;
                    size2 = i3;
                    arrayList3 = arrayList5;
                    bvwb5 = bvwb2;
                    currentTimeMillis = j3;
                    arrayList15 = j3;
                }
                bvwb = bvwb5;
                j2 = currentTimeMillis;
                arrayList4 = arrayList3;
            } else {
                bvwb = bvwb5;
                j2 = currentTimeMillis;
                arrayList4 = arrayList3;
                arrayList2 = null;
            }
            String valueOf = String.valueOf(arrayList2);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb4.append("Locations: ");
            sb4.append(valueOf);
            sb4.toString();
            arrayList = arrayList4;
        } else {
            bvwb = bvwb5;
            j2 = currentTimeMillis;
            ArrayList b2 = bgzt.m100500b(bguj2.f117567b);
            ArrayList a12 = bgzt.m100495a(bguj2.f117566a);
            arrayList = new ArrayList();
            if (b2 != null) {
                int size4 = b2.size();
                for (int i46 = 0; i46 < size4; i46++) {
                    bvvp a13 = bgzi.m100443a((ApiActivityReading) b2.get(i46));
                    if (a13 != null) {
                        arrayList.add(a13);
                    }
                }
            }
            arrayList2 = new ArrayList();
            if (a12 != null) {
                int size5 = a12.size();
                for (int i47 = 0; i47 < size5; i47++) {
                    bvwm a14 = bgzi.m100446a((ApiLocationReading) a12.get(i47));
                    if (a14 != null) {
                        arrayList2.add(a14);
                    }
                }
            }
        }
        bvvt a15 = m100153a(bguj2, arrayList, arrayList2);
        bxvd da10 = bvyi.f158166g.mo74144da();
        if (da10.f164950c) {
            da10.mo74035c();
            da10.f164950c = false;
        }
        bvyi bvyi = (bvyi) da10.f164949b;
        int i48 = bvyi.f158168a | 1;
        bvyi.f158168a = i48;
        bvyi.f158169b = i;
        bvwb.getClass();
        bvyi.f158170c = bvwb;
        int i49 = i48 | 2;
        bvyi.f158168a = i49;
        a15.getClass();
        bvyi.f158172e = a15;
        int i50 = i49 | 8;
        bvyi.f158168a = i50;
        int i51 = i50 | 4;
        bvyi.f158168a = i51;
        bvyi.f158171d = j;
        bvyi.f158168a = i51 | 16;
        long j11 = j2;
        bvyi.f158173f = j11;
        bvyi bvyi2 = (bvyi) da10.mo74062i();
        try {
            Iterator it6 = bguj2.f117566a.iterator();
            long j12 = Long.MAX_VALUE;
            long j13 = Long.MIN_VALUE;
            while (it6.hasNext()) {
                bgvr bgvr2 = (bgvr) it6.next();
                j12 = Math.min(j12, bgvr2.f117718d);
                j13 = Math.max(j13, bgvr2.f117718d);
            }
            bgux.m100089a(0, j11 - j12, j12, j13);
            bgwz bgwz = f117812j;
            Account account2 = account;
            ClientContext a16 = m100154a(this.f117813i, account2);
            if (bgwz.f117880f == null) {
                bgwz.f117880f = chtv.m149566a(chtu.UNARY, "userlocation.UserLocationReportingService/ReportApiBatch", ciie.m150370a(bvyi.f158166g), ciie.m150370a(bvyh.f158161d));
            }
            bvyh bvyh = (bvyh) bgwz.f117882a.mo25553a(bgwz.f117880f, a16, bvyi2, 10000, TimeUnit.MILLISECONDS);
            if (arrayList2 != null) {
                int size6 = arrayList2.size() - bvyh.f158165c;
                if (size6 > 0) {
                    bguv.m100052b("UlrServerLocationsMissing", (long) size6);
                } else if (size6 < 0) {
                    bguv.m100052b("UlrServerLocationsExtra", (long) (-size6));
                }
            }
            bgux.m100095a(true);
            if ((1 & bvyh.f158163a) == 0) {
                return null;
            }
            bvxn bvxn = bvyh.f158164b;
            if (bvxn == null) {
                bvxn = bvxn.f158064j;
            }
            return bgwb.m100150a(account2, bvxn);
        } catch (chuw | gid e5) {
            if (chcy.m148488d()) {
                bgux.m100110d(e5);
            } else {
                bgux.m100095a(false);
            }
            throw e5;
        }
    }

    /* renamed from: a */
    public final bxvd mo63278a(String str, boolean z) {
        bxvd da = bvwb.f157885r.mo74144da();
        bxvd da2 = bvvb.f157779h.mo74144da();
        String a = stm.m36299a(f117807d);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb = (bvvb) da2.f164949b;
        a.getClass();
        bvvb.f157781a |= 8;
        bvvb.f157785e = a;
        String a2 = stm.m36299a(f117811h);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb2 = (bvvb) da2.f164949b;
        a2.getClass();
        bvvb2.f157781a |= 1;
        bvvb2.f157782b = a2;
        String a3 = stm.m36299a(f117809f);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb3 = (bvvb) da2.f164949b;
        a3.getClass();
        bvvb3.f157781a |= 2;
        bvvb3.f157783c = a3;
        String a4 = stm.m36299a(f117808e);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb4 = (bvvb) da2.f164949b;
        a4.getClass();
        bvvb4.f157781a |= 4;
        bvvb4.f157784d = a4;
        String a5 = stm.m36299a(f117810g);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb5 = (bvvb) da2.f164949b;
        a5.getClass();
        bvvb5.f157781a |= 16;
        bvvb5.f157786f = a5;
        boolean booleanValue = this.f117817n.booleanValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvvb bvvb6 = (bvvb) da2.f164949b;
        bvvb6.f157781a |= 64;
        bvvb6.f157787g = booleanValue;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvwb bvwb = (bvwb) da.f164949b;
        bvvb bvvb7 = (bvvb) da2.mo74062i();
        bvvb7.getClass();
        bvwb.f157902p = bvvb7;
        bvwb.f157887a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        int i = this.f117814k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvwb bvwb2 = (bvwb) da.f164949b;
        bvwb2.f157887a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bvwb2.f157900n = i;
        if (chcj.m148167e()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb3 = (bvwb) da.f164949b;
            bvwb3.f157889c = 1;
            bvwb3.f157887a |= 2;
        }
        if (z) {
            String a6 = stm.m36299a(null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb4 = (bvwb) da.f164949b;
            a6.getClass();
            bvwb4.f157887a |= 8;
            bvwb4.f157891e = a6;
            String a7 = stm.m36299a(bgwc.f117806c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb5 = (bvwb) da.f164949b;
            a7.getClass();
            int i2 = bvwb5.f157887a | 2048;
            bvwb5.f157887a = i2;
            bvwb5.f157896j = a7;
            bvwb5.f157897k = 0;
            bvwb5.f157887a = i2 | 4096;
            String a8 = stm.m36299a(null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb6 = (bvwb) da.f164949b;
            a8.getClass();
            bvwb6.f157887a |= 16;
            bvwb6.f157892f = a8;
            String a9 = stm.m36299a(null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb7 = (bvwb) da.f164949b;
            a9.getClass();
            int i3 = bvwb7.f157887a | 32;
            bvwb7.f157887a = i3;
            bvwb7.f157893g = a9;
            int i4 = this.f117816m;
            int i5 = i3 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            bvwb7.f157887a = i5;
            bvwb7.f157903q = i4;
            bvwb7.f157887a = i5 | 4;
            bvwb7.f157890d = 2023;
            int i6 = bgwc.f117804a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb8 = (bvwb) da.f164949b;
            int i7 = bvwb8.f157887a | 512;
            bvwb8.f157887a = i7;
            bvwb8.f157895i = i6;
            int i8 = this.f117815l;
            bvwb8.f157887a = i7 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bvwb8.f157901o = i8;
            String a10 = stm.m36299a(f117805b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb9 = (bvwb) da.f164949b;
            a10.getClass();
            bvwb9.f157887a |= 1;
            bvwb9.f157888b = a10;
            String a11 = stm.m36299a(null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb10 = (bvwb) da.f164949b;
            a11.getClass();
            bvwb10.f157887a |= 64;
            bvwb10.f157894h = a11;
            String a12 = stm.m36299a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwb bvwb11 = (bvwb) da.f164949b;
            a12.getClass();
            bvwb11.f157887a |= 8192;
            bvwb11.f157898l = a12;
        }
        return da;
    }
}
