package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: agjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjo implements Callable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f65738a;

    /* renamed from: b */
    final /* synthetic */ String f65739b;

    /* renamed from: c */
    final /* synthetic */ aghp f65740c;

    public agjo(aghp aghp, EventParcel eventParcel, String str) {
        this.f65740c = aghp;
        this.f65738a = eventParcel;
        this.f65739b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
     arg types: [android.os.Bundle, java.lang.String, long]
     candidates:
      agms.a(java.lang.String, int, boolean):java.lang.String
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c9, code lost:
        if (r8.f65975e == null) goto L_0x03cb;
     */
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        agmr agmr;
        long j;
        agdr agdr;
        byte[] bArr2;
        this.f65740c.f65526a.mo35701y();
        agmn agmn = this.f65740c.f65526a;
        agmn.m54506a(agmn.f65952f);
        agkr agkr = agmn.f65952f;
        EventParcel eventParcel = this.f65738a;
        String str = this.f65739b;
        agkr.mo35241h();
        agkr.f65756y.mo35516t();
        sdo.m34959a(eventParcel);
        sdo.m34977c(str);
        if (!agkr.mo35538v().mo35320c(str, aghn.f65463S)) {
            agkr.mo35497E().f65571j.mo35436a("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if ("_iap".equals(eventParcel.f80132a) || "_iapx".equals(eventParcel.f80132a)) {
            bxvd da = agnl.f66085b.mo74144da();
            agkr.mo35656n().mo35352b();
            try {
                agcv b = agkr.mo35656n().mo35349b(str);
                if (b == null) {
                    agkr.mo35497E().f65571j.mo35436a("Log and bundle not available. package_name", str);
                    bArr2 = new byte[0];
                } else if (b.mo35283o()) {
                    bxvd da2 = agnm.f66088P.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm.m54658a((agnm) da2.f164949b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm = (agnm) da2.f164949b;
                    "android".getClass();
                    agnm.f66105a |= 64;
                    agnm.f66115k = "android";
                    if (!TextUtils.isEmpty(b.mo35248a())) {
                        String a = b.mo35248a();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm2 = (agnm) da2.f164949b;
                        a.getClass();
                        agnm2.f66105a |= 4096;
                        agnm2.f66121q = a;
                    }
                    if (!TextUtils.isEmpty(b.mo35279k())) {
                        String k = b.mo35279k();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm3 = (agnm) da2.f164949b;
                        k.getClass();
                        agnm3.f66105a |= 2048;
                        agnm3.f66120p = k;
                    }
                    if (!TextUtils.isEmpty(b.mo35275i())) {
                        String i = b.mo35275i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm4 = (agnm) da2.f164949b;
                        i.getClass();
                        agnm4.f66105a |= 8192;
                        agnm4.f66122r = i;
                    }
                    if (b.mo35277j() != -2147483648L) {
                        int j2 = (int) b.mo35277j();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm5 = (agnm) da2.f164949b;
                        agnm5.f66105a |= 33554432;
                        agnm5.f66094E = j2;
                    }
                    long l = b.mo35280l();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm6 = (agnm) da2.f164949b;
                    agnm6.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    agnm6.f66123s = l;
                    long n = b.mo35282n();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm7 = (agnm) da2.f164949b;
                    agnm7.f66106b |= 16;
                    agnm7.f66103N = n;
                    cfjt.m139846c();
                    if (!TextUtils.isEmpty(b.mo35256c())) {
                        String c = b.mo35256c();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm8 = (agnm) da2.f164949b;
                        c.getClass();
                        agnm8.f66105a |= 4194304;
                        agnm8.f66090A = c;
                    } else if (!TextUtils.isEmpty(b.mo35260d())) {
                        String d = b.mo35260d();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm9 = (agnm) da2.f164949b;
                        d.getClass();
                        agnm9.f66106b |= 4;
                        agnm9.f66100K = d;
                    }
                    long m = b.mo35281m();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm10 = (agnm) da2.f164949b;
                    agnm10.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    agnm10.f66128x = m;
                    if (agkr.f65756y.mo35513q()) {
                        if (agkr.mo35538v().mo35324e(((agnm) da2.f164949b).f66121q)) {
                            String a2 = agkr.f65930j.mo35432a(((agnm) da2.f164949b).f66121q, 50);
                            if (!TextUtils.isEmpty(a2)) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                agnm agnm11 = (agnm) da2.f164949b;
                                a2.getClass();
                                agnm11.f66105a |= Integer.MIN_VALUE;
                                agnm11.f66098I = a2;
                            }
                        }
                    }
                    Pair a3 = agkr.mo35539w().mo35465a(b.mo35248a());
                    if (b.mo35290v() && !TextUtils.isEmpty((CharSequence) a3.first)) {
                        String a4 = agkr.mo35430a((String) a3.first, Long.toString(eventParcel.f80135d));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm12 = (agnm) da2.f164949b;
                        a4.getClass();
                        agnm12.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        agnm12.f66125u = a4;
                        if (a3.second != null) {
                            boolean booleanValue = ((Boolean) a3.second).booleanValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            agnm agnm13 = (agnm) da2.f164949b;
                            agnm13.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                            agnm13.f66126v = booleanValue;
                        }
                    }
                    String b2 = agkr.mo35535B().mo35372b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm14 = (agnm) da2.f164949b;
                    b2.getClass();
                    agnm14.f66105a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    agnm14.f66117m = b2;
                    String c2 = agkr.mo35535B().mo35373c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm15 = (agnm) da2.f164949b;
                    c2.getClass();
                    agnm15.f66105a |= 128;
                    agnm15.f66116l = c2;
                    int d2 = (int) agkr.mo35535B().mo35374d();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm16 = (agnm) da2.f164949b;
                    agnm16.f66105a |= 1024;
                    agnm16.f66119o = d2;
                    String e = agkr.mo35535B().mo35375e();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    agnm agnm17 = (agnm) da2.f164949b;
                    e.getClass();
                    agnm17.f66105a |= 512;
                    agnm17.f66118n = e;
                    try {
                        String a5 = agkr.mo35430a(b.mo35252b(), Long.toString(eventParcel.f80135d));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm18 = (agnm) da2.f164949b;
                        a5.getClass();
                        agnm18.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        agnm18.f66127w = a5;
                        if (!TextUtils.isEmpty(b.mo35266f())) {
                            String f = b.mo35266f();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            agnm agnm19 = (agnm) da2.f164949b;
                            f.getClass();
                            agnm19.f66105a |= 16777216;
                            agnm19.f66093D = f;
                        }
                        String a6 = b.mo35248a();
                        List a7 = agkr.mo35656n().mo35340a(a6);
                        Iterator it = a7.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                agmr = null;
                                break;
                            }
                            agmr = (agmr) it.next();
                            if ("_lte".equals(agmr.f65973c)) {
                                break;
                            }
                        }
                        if (agmr == null) {
                        }
                        agmr agmr2 = new agmr(a6, "auto", "_lte", agkr.mo35534A().mo20505a(), 0L);
                        a7.add(agmr2);
                        agkr.mo35656n().mo35347a(agmr2);
                        agmp o = agkr.mo35657o();
                        o.mo35497E().f65572k.mo35435a("Checking account type status for ad personalization signals");
                        if (o.mo35535B().mo35376f()) {
                            String a8 = b.mo35248a();
                            if (b.mo35290v() && o.mo35655m().mo35482d(a8)) {
                                o.mo35497E().f65571j.mo35435a("Turning off ad personalization due to account type");
                                Iterator it2 = a7.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if ("_npa".equals(((agmr) it2.next()).f65973c)) {
                                            it2.remove();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                a7.add(new agmr(a8, "auto", "_npa", o.mo35534A().mo20505a(), 1L));
                            }
                        }
                        agnq[] agnqArr = new agnq[a7.size()];
                        int i2 = 0;
                        while (i2 < a7.size()) {
                            bxvd da3 = agnq.f66145g.mo74144da();
                            String str2 = ((agmr) a7.get(i2)).f65973c;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            agnq agnq = (agnq) da3.f164949b;
                            str2.getClass();
                            agnq.f66147a |= 2;
                            agnq.f66149c = str2;
                            bxvd bxvd = da;
                            long j3 = ((agmr) a7.get(i2)).f65974d;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            agnq agnq2 = (agnq) da3.f164949b;
                            agnq2.f66147a |= 1;
                            agnq2.f66148b = j3;
                            agkr.mo35657o().mo35711a(da3, ((agmr) a7.get(i2)).f65975e);
                            agnqArr[i2] = (agnq) da3.mo74062i();
                            i2++;
                            da = bxvd;
                        }
                        bxvd bxvd2 = da;
                        List asList = Arrays.asList(agnqArr);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        agnm agnm20 = (agnm) da2.f164949b;
                        agnm20.mo35759b();
                        bxsy.m123078a(asList, agnm20.f66109e);
                        Bundle a9 = eventParcel.f80133b.mo44007a();
                        a9.putLong("_c", 1);
                        agkr.mo35497E().f65571j.mo35435a("Marking in-app purchase as real-time");
                        a9.putLong("_r", 1);
                        a9.putString("_o", eventParcel.f80134c);
                        if (agkr.mo35540x().mo35753g(((agnm) da2.f164949b).f66121q)) {
                            agkr.mo35540x().mo35731a(a9, "_dbg", (Object) 1L);
                            agkr.mo35540x().mo35731a(a9, "_r", (Object) 1L);
                        }
                        agdr a10 = agkr.mo35656n().mo35338a(str, eventParcel.f80132a);
                        if (a10 != null) {
                            long j4 = a10.f65335f;
                            agdr = a10.mo35378a(eventParcel.f80135d);
                            j = j4;
                        } else {
                            agdr = new agdr(str, eventParcel.f80132a, eventParcel.f80135d);
                            j = 0;
                        }
                        agkr.mo35656n().mo35343a(agdr);
                        agje agje = agkr.f65756y;
                        String str3 = eventParcel.f80134c;
                        String str4 = eventParcel.f80132a;
                        agcv agcv = b;
                        long j5 = eventParcel.f80135d;
                        EventParcel eventParcel2 = eventParcel;
                        agdq agdq = r11;
                        String str5 = str;
                        bxvd bxvd3 = da2;
                        agdr agdr2 = agdr;
                        bxvd bxvd4 = bxvd2;
                        agdq agdq2 = new agdq(agje, str3, str, str4, j5, j, a9);
                        bxvd da4 = agni.f66064g.mo74144da();
                        long j6 = agdq.f65327d;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        agni agni = (agni) da4.f164949b;
                        int i3 = agni.f66066a | 2;
                        agni.f66066a = i3;
                        agni.f66069d = j6;
                        String str6 = agdq.f65325b;
                        str6.getClass();
                        int i4 = i3 | 1;
                        agni.f66066a = i4;
                        agni.f66068c = str6;
                        long j7 = agdq.f65328e;
                        agni.f66066a = i4 | 4;
                        agni.f66070e = j7;
                        Iterator it3 = agdq.f65329f.iterator();
                        while (it3.hasNext()) {
                            String str7 = (String) it3.next();
                            bxvd da5 = agnk.f66077g.mo74144da();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            agnk agnk = (agnk) da5.f164949b;
                            str7.getClass();
                            agnk.f66079a |= 1;
                            agnk.f66080b = str7;
                            agkr.mo35657o().mo35716b(da5, agdq.f65329f.mo44008a(str7));
                            da4.mo74100q(da5);
                        }
                        bxvd3.mo74108s(da4);
                        bxvd da6 = agnn.f66131b.mo74144da();
                        bxvd da7 = agnj.f66072d.mo74144da();
                        long j8 = agdr2.f65332c;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        agnj agnj = (agnj) da7.f164949b;
                        int i5 = agnj.f66074a | 2;
                        agnj.f66074a = i5;
                        agnj.f66076c = j8;
                        String str8 = eventParcel2.f80132a;
                        str8.getClass();
                        agnj.f66074a = i5 | 1;
                        agnj.f66075b = str8;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        agnn agnn = (agnn) da6.f164949b;
                        agnj agnj2 = (agnj) da7.mo74062i();
                        agnj2.getClass();
                        if (!agnn.f66133a.mo73666a()) {
                            agnn.f66133a = bxvk.m124021a(agnn.f66133a);
                        }
                        agnn.f66133a.add(agnj2);
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agnm agnm21 = (agnm) bxvd3.f164949b;
                        agnn agnn2 = (agnn) da6.mo74062i();
                        agnn2.getClass();
                        agnm21.f66101L = agnn2;
                        agnm21.f66106b |= 8;
                        agdd k2 = agkr.f65930j.mo35687k();
                        String a11 = agcv.mo35248a();
                        List emptyList = Collections.emptyList();
                        List unmodifiableList = Collections.unmodifiableList(((agnm) bxvd3.f164949b).f66109e);
                        Long valueOf = Long.valueOf(((agni) da4.f164949b).f66069d);
                        long j9 = ((agni) da4.f164949b).f66069d;
                        bxvd3.mo73961X(k2.mo35304a(a11, emptyList, unmodifiableList, valueOf));
                        agni agni2 = (agni) da4.f164949b;
                        if ((agni2.f66066a & 2) != 0) {
                            long j10 = agni2.f66069d;
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            agnm agnm22 = (agnm) bxvd3.f164949b;
                            int i6 = agnm22.f66105a | 4;
                            agnm22.f66105a = i6;
                            agnm22.f66111g = j10;
                            long j11 = ((agni) da4.f164949b).f66069d;
                            agnm22.f66105a = i6 | 8;
                            agnm22.f66112h = j11;
                        }
                        long h = agcv.mo35272h();
                        if (h != 0) {
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            agnm agnm23 = (agnm) bxvd3.f164949b;
                            agnm23.f66105a |= 32;
                            agnm23.f66114j = h;
                        }
                        long g = agcv.mo35269g();
                        if (g != 0) {
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            agnm agnm24 = (agnm) bxvd3.f164949b;
                            agnm24.f66105a |= 16;
                            agnm24.f66113i = g;
                        } else if (h != 0) {
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            agnm agnm25 = (agnm) bxvd3.f164949b;
                            agnm25.f66105a |= 16;
                            agnm25.f66113i = h;
                        }
                        agcv.mo35287s();
                        int p = (int) agcv.mo35284p();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agnm agnm26 = (agnm) bxvd3.f164949b;
                        agnm26.f66105a |= 1048576;
                        agnm26.f66129y = p;
                        long c3 = agkr.mo35538v().mo35318c();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agnm agnm27 = (agnm) bxvd3.f164949b;
                        agnm27.f66105a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        agnm27.f66124t = c3;
                        long a12 = agkr.mo35534A().mo20505a();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agnm agnm28 = (agnm) bxvd3.f164949b;
                        agnm28.f66105a |= 2;
                        agnm28.f66110f = a12;
                        boolean booleanValue2 = Boolean.TRUE.booleanValue();
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        agnm agnm29 = (agnm) bxvd3.f164949b;
                        agnm29.f66105a |= 8388608;
                        agnm29.f66091B = booleanValue2;
                        bxvd bxvd5 = bxvd4;
                        bxvd5.mo74104r(bxvd3);
                        agcv.mo35249a(((agnm) bxvd3.f164949b).f66111g);
                        agcv.mo35253b(((agnm) bxvd3.f164949b).f66112h);
                        agkr.mo35656n().mo35342a(agcv);
                        agkr.mo35656n().mo35355c();
                        agkr.mo35656n().mo35358d();
                        try {
                            return agkr.mo35657o().mo35717b(((agnl) bxvd5.mo74062i()).mo73642k());
                        } catch (IOException e2) {
                            agkr.mo35497E().f65564c.mo35437a("Data loss. Failed to bundle and serialize. appId", agid.m54288a(str5), e2);
                            return null;
                        }
                    } catch (SecurityException e3) {
                        agkr.mo35497E().f65571j.mo35436a("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                    }
                } else {
                    agkr.mo35497E().f65571j.mo35436a("Log and bundle disabled. package_name", str);
                    bArr = new byte[0];
                    agkr.mo35656n().mo35358d();
                    return bArr;
                }
            } catch (SecurityException e4) {
                agkr.mo35497E().f65571j.mo35436a("Resettable device id encryption failed", e4.getMessage());
                bArr2 = new byte[0];
            } catch (Throwable th) {
                Throwable th2 = th;
                agkr.mo35656n().mo35358d();
                throw th2;
            }
            agkr.mo35656n().mo35358d();
            return bArr2;
        } else {
            agkr.mo35497E().f65571j.mo35437a("Generating a payload for this event is not available. package_name, event_name", str, eventParcel.f80132a);
            return null;
        }
    }
}
