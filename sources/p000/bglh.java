package p000;

import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bglh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bglh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgll f116760a;

    /* renamed from: b */
    final /* synthetic */ buhd f116761b;

    public bglh(bgll bgll, buhd buhd) {
        this.f116760a = bgll;
        this.f116761b = buhd;
    }

    public final void run() {
        Object obj;
        bucq bucq;
        int i;
        Long l;
        int i2;
        bglp bglp;
        int i3;
        bgmv bgmv;
        Integer num;
        int[] iArr;
        Integer num2;
        String str;
        bglk bglk = this.f116760a.f116768d;
        buhd buhd = this.f116761b;
        bucq bucq2 = bucq.UNKNOWN_MODEL;
        int a = bufp.m119413a(buhd.f153831a);
        int i4 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i4 == 113) {
            bubv bubv = (bubv) buhd.mo72661a((bxxk) bubv.f153284f.mo74142c(7));
            if (bubv != null) {
                bglo bglo = (bglo) bglk;
                bglf bglf = bglo.f116786l;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = bubv.f153288d;
                long j2 = (elapsedRealtime - j) - (bglf.f116756b - bglf.f116755a);
                boolean z = Math.abs(j2) > cety.f183431a.mo6606a().chreArClockDriftToResyncMs();
                long j3 = bglf.f116755a;
                long j4 = bglf.f116756b;
                bucq bucq3 = "null";
                StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
                sb.append("onActivityResponse, syncedChreTimeMs=");
                sb.append(j3);
                sb.append(", syncedHostTimeMs=");
                sb.append(j4);
                sb.append(", nowChreTimeMs=");
                sb.append(j);
                sb.append(", nowHostTimeMs=");
                sb.append(elapsedRealtime);
                sb.append(", driftMs=");
                sb.append(j2);
                sb.append(", toSync=");
                sb.append(z);
                sb.toString();
                if (z) {
                    bglf.f116756b = elapsedRealtime;
                    bglf.f116755a = j;
                }
                bglf.f116757c = elapsedRealtime;
                bglo.f116775a.mo62049a(bfos.CHRE_AR_RESPONSE, (int) bubv.f153288d);
                if ((bubv.f153286a & 1) != 0) {
                    obj = Long.valueOf(bubv.f153288d);
                } else {
                    obj = bucq3;
                }
                String valueOf = String.valueOf(obj);
                if ((bubv.f153286a & 2) != 0) {
                    bucq = bucq.m119332a(bubv.f153289e);
                    if (bucq == null) {
                        bucq = bucq.UNKNOWN_MODEL;
                    }
                } else {
                    bucq = bucq3;
                }
                String valueOf2 = String.valueOf(bucq);
                String arrays = Arrays.toString(new bxvv(bubv.f153287b, bubv.f153283c).toArray());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length());
                sb2.append("ActivityResponse: time=");
                sb2.append(valueOf);
                sb2.append(", model=");
                sb2.append(valueOf2);
                sb2.append(", supportedActivities=");
                sb2.append(arrays);
                sb2.toString();
                bucq a2 = bucq.m119332a(bubv.f153289e);
                if (a2 == null) {
                    a2 = bucq.UNKNOWN_MODEL;
                }
                bglo.f116780f = a2;
                List list = bglo.f116776b;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    bgmq bgmq = (bgmq) list.get(i5);
                    int ordinal = bglo.f116780f.ordinal();
                    if (ordinal == 1) {
                        i = bevp.CHRE_TREE_BAGGING.f112768am;
                    } else if (ordinal == 2) {
                        i = bevp.CHRE_DNN_V1.f112768am;
                    } else if (ordinal == 3) {
                        i = bevp.CHRE_DNN_GRU_V1.f112768am;
                    } else if (ordinal != 4) {
                        i = ordinal != 5 ? bevp.CHRE_UNKNOWN_MODEL.f112768am : bevp.CHRE_CNN_GRU_V1.f112768am;
                    } else {
                        i = bevp.CHRE_DNN_V2.f112768am;
                    }
                    bgmq.mo60978b(i);
                }
                return;
            }
            ((bglo) bglk).mo62986h();
        } else if (i4 != 114) {
            int i6 = buhd.f153831a;
            StringBuilder sb3 = new StringBuilder(33);
            sb3.append("Unknown message type: ");
            sb3.append(i6);
            sb3.toString();
        } else {
            buby buby = (buby) buhd.mo72661a((bxxk) buby.f153299h.mo74142c(7));
            if (buby != null) {
                if ((buby.f153301a & 1) != 0) {
                    l = Long.valueOf(buby.f153302b);
                } else {
                    l = "null";
                }
                String valueOf3 = String.valueOf(l);
                int size2 = buby.f153304d.size();
                int size3 = buby.f153303c.size();
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 79);
                sb4.append("ActivityResult: baseTime=");
                sb4.append(valueOf3);
                sb4.append(", sampleCount=");
                sb4.append(size2);
                sb4.append(", transitionCount=");
                sb4.append(size3);
                sb4.toString();
                for (int i7 = 0; i7 < buby.f153304d.size(); i7++) {
                    if ((((buca) buby.f153304d.get(i7)).f153313a & 2) != 0) {
                        byte[] k = ((buca) buby.f153304d.get(i7)).f153315c.mo73780k();
                        iArr = new int[k.length];
                        for (int i8 = 0; i8 < k.length; i8++) {
                            iArr[i8] = k[i8] & 255;
                        }
                    } else {
                        iArr = null;
                    }
                    if ((((buca) buby.f153304d.get(i7)).f153313a & 1) != 0) {
                        num2 = Integer.valueOf(((buca) buby.f153304d.get(i7)).f153314b);
                    } else {
                        num2 = "null";
                    }
                    String valueOf4 = String.valueOf(num2);
                    if (iArr == null) {
                        str = "null";
                    } else {
                        str = Arrays.toString(iArr);
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 46 + String.valueOf(str).length());
                    sb5.append("sample ");
                    sb5.append(i7);
                    sb5.append(": deltaTimeMs=");
                    sb5.append(valueOf4);
                    sb5.append(", confidences=");
                    sb5.append(str);
                    sb5.toString();
                }
                for (int i9 = 0; i9 < buby.f153303c.size(); i9++) {
                    int i10 = ((bucc) buby.f153303c.get(i9)).f153324a;
                    buce a3 = buce.m119318a(((bucc) buby.f153303c.get(i9)).f153325b);
                    if (a3 == null) {
                        a3 = buce.INVALID_ACTIVITY;
                    }
                    String valueOf5 = String.valueOf(a3);
                    bucs a4 = bucs.m119336a(((bucc) buby.f153303c.get(i9)).f153326c);
                    if (a4 == null) {
                        a4 = bucs.INVALID_TRANSITION;
                    }
                    String valueOf6 = String.valueOf(a4);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 68 + String.valueOf(valueOf6).length());
                    sb6.append("transition ");
                    sb6.append(i9);
                    sb6.append(": relativeTimeMs=");
                    sb6.append(i10);
                    sb6.append(", activity=");
                    sb6.append(valueOf5);
                    sb6.append(", type=");
                    sb6.append(valueOf6);
                    sb6.toString();
                }
                bglo bglo2 = (bglo) bglk;
                bfor bfor = bglo2.f116775a;
                if ((buby.f153301a & 2) == 0) {
                    i2 = bubx.UNKNOWN.ordinal();
                } else {
                    bubx a5 = bubx.m119309a(buby.f153305e);
                    if (a5 == null) {
                        a5 = bubx.UNKNOWN;
                    }
                    i2 = a5.ordinal();
                }
                int size4 = buby.f153304d.size();
                int size5 = buby.f153303c.size();
                bfor.mo62047a(new bgfu(bfos.CHRE_AR_RESULT, bfor.mo62055b(), i2, size4, size5, i2, size4, size5));
                if (!bglo2.f116777c || bglo2.f116776b.isEmpty() || (bglp = bglo2.f116787m) == null) {
                    bglo2.f116781g = false;
                    return;
                }
                bxwc bxwc = buby.f153304d;
                long j5 = buby.f153302b;
                ArrayList arrayList = new ArrayList(bxwc.size());
                int size6 = bxwc.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    buca buca = (buca) bxwc.get(i11);
                    bxtx bxtx = buca.f153315c;
                    int length = bglp.f116789a.length;
                    float[] fArr = new float[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        fArr[i12] = ((float) (bxtx.mo73743a(bglp.f116789a[i12]) & 255)) / 250.0f;
                    }
                    j5 += (long) buca.f153314b;
                    arrayList.add(new bgms(bglp.f116790b.mo62978a(j5), fArr));
                }
                if (buby.f153304d.size() > 0) {
                    long j6 = buby.f153302b;
                    bglf bglf2 = bglo2.f116786l;
                    long j7 = bglf2.f116755a;
                    long j8 = bglf2.f116756b;
                    long j9 = bglf2.f116757c;
                    StringBuilder sb7 = new StringBuilder(119);
                    sb7.append("syncedChreTimeMs=");
                    sb7.append(j7);
                    sb7.append(", syncedHostTimeMs");
                    sb7.append(j8);
                    sb7.append(", lastCheckedHostTimeMs=");
                    sb7.append(j9);
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder(String.valueOf(sb8).length() + 52);
                    sb9.append("onActivityResult, eventTimeMs=");
                    sb9.append(j6);
                    sb9.append(", ");
                    sb9.append(sb8);
                    sb9.toString();
                }
                bglp bglp2 = bglo2.f116787m;
                bxwc bxwc2 = buby.f153303c;
                long j10 = buby.f153302b;
                ArrayList arrayList2 = new ArrayList(bxwc2.size());
                int size7 = bxwc2.size();
                for (int i13 = 0; i13 < size7; i13++) {
                    bucc bucc = (bucc) bxwc2.get(i13);
                    long a6 = bglp2.f116790b.mo62978a(((long) bucc.f153324a) + j10);
                    buce a7 = buce.m119318a(bucc.f153325b);
                    if (a7 == null) {
                        a7 = buce.INVALID_ACTIVITY;
                    }
                    int intValue = bglg.m99239a(a7).intValue();
                    bucs a8 = bucs.m119336a(bucc.f153326c);
                    if (a8 == null) {
                        a8 = bucs.INVALID_TRANSITION;
                    }
                    Iterator it = ((bnhe) bglg.f116758a).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            num = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() == a8) {
                            num = (Integer) entry.getKey();
                            break;
                        }
                    }
                    arrayList2.add(new bgmt(a6, intValue, num.intValue()));
                }
                List list2 = bglo2.f116776b;
                int size8 = list2.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    bgmq bgmq2 = (bgmq) list2.get(i14);
                    if (!arrayList.isEmpty()) {
                        bgmq2.mo60970a(arrayList, bglo2.f116785k.mo62977e());
                    }
                    if (!arrayList2.isEmpty()) {
                        bgmq2.mo60969a(arrayList2);
                    }
                    if (cesk.m138180c() && cesk.f183403a.mo6606a().chreArAudioDiagnosticsLog() && (buby.f153301a & 4) != 0) {
                        bubz bubz = buby.f153306f;
                        if (bubz == null) {
                            bubz = bubz.f153308b;
                        }
                        bxwc bxwc3 = bubz.f153310a;
                        int size9 = bxwc3.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size9) {
                                bgmv = null;
                                break;
                            }
                            bucn bucn = (bucn) bxwc3.get(i15);
                            int a9 = bucm.m119328a(bucn.f153384a);
                            if (a9 == 0) {
                                a9 = 1;
                            }
                            i15++;
                            if (a9 == 5) {
                                bgmv = new bgmv(bucn.f153385b);
                                break;
                            }
                        }
                        String valueOf7 = String.valueOf(bgmv);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf7).length() + 34);
                        sb10.append("Reporting diagnostics information:");
                        sb10.append(valueOf7);
                        sb10.toString();
                        bgmq2.mo60966a(bgmv);
                    }
                    if (cesk.m138180c() && (buby.f153301a & 8) != 0) {
                        bucj bucj = buby.f153307g;
                        if (bucj == null) {
                            bucj = bucj.f153343e;
                        }
                        int a10 = bucg.m119322a(bucj.f153346b);
                        if (a10 == 0) {
                            i3 = 1;
                        } else {
                            i3 = a10 == 2 ? 0 : 1;
                        }
                        int a11 = buci.m119324a(bucj.f153345a);
                        bgmu bgmu = new bgmu(i3, (a11 != 0 && a11 == 2) ? 1 : 0, bucj.f153347c, bglo2.f116786l.mo62978a(bucj.f153348d));
                        bfor bfor2 = bglo2.f116775a;
                        int i16 = bgmu.f116826a;
                        int i17 = bgmu.f116827b;
                        bfor2.mo62047a(new bgfv(bfos.CHRE_AR_AUDIO_FUSION_RESULT, bfor2.mo62055b(), i16, i17, i16, i17));
                        bgmq2.mo60965a(bgmu);
                    }
                    if (bglo2.f116781g) {
                        bgmq2.mo61003s();
                    }
                }
                bglo2.f116781g = false;
                if (cesk.m138181d() && (buby.f153301a & 4) != 0) {
                    bewq a12 = bewq.m95998a(bglo2.f116783i);
                    bmxe bmxe = bglo2.f116782h;
                    bubz bubz2 = buby.f153306f;
                    if (bubz2 == null) {
                        bubz2 = bubz.f153308b;
                    }
                    btxv btxv = (btxv) bmxe.mo66855c(bubz2);
                    bxvd da = btxm.f152814q.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btxm btxm = (btxm) da.f164949b;
                    btxv.getClass();
                    btxm.f152826k = btxv;
                    btxm.f152816a |= 1024;
                    qwo a13 = a12.f112849a.mo24333a((btxm) da.mo74062i());
                    a13.mo24328b(12);
                    a13.mo24327b();
                    return;
                }
                return;
            }
            ((bglo) bglk).mo62986h();
        }
    }
}
