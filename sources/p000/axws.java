package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.felicanetworks.mfc.Felica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: axws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axws implements axwm {

    /* renamed from: a */
    private final bzxx f96621a;

    /* renamed from: b */
    private final axyd f96622b;

    /* renamed from: c */
    private final axzt f96623c;

    public axws(Context context, axzt axzt, axzq axzq, axyd axyd) {
        this.f96623c = axzt;
        this.f96622b = axyd;
        shl shl = new shl(context, chnj.f188812a.mo6606a().mo85443t(), (int) chnj.f188812a.mo6606a().mo85444u(), context.getApplicationInfo().uid, 1798);
        SSLSocketFactory a = apto.m70980a((int) Felica.MAX_TIMEOUT, context);
        axzq.mo53801a((apto) a);
        shl.mo25557a(a);
        this.f96621a = new bzxx(shl);
    }

    /* renamed from: a */
    private final String m83417a() {
        return this.f96623c.mo53808b().f96814a;
    }

    /* renamed from: b */
    public final axwl mo53695b(String str, String str2) {
        this.f96622b.mo53758a(":startSync");
        try {
            bxvd da = bzyj.f171880d.mo74144da();
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyj) da.f164949b).f171882a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((bzyj) da.f164949b).f171883b = a;
            if (!bmxx.m108577a(str2)) {
                if (!"null".equals(str2)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str2.getClass();
                    ((bzyj) da.f164949b).f171884c = str2;
                }
            }
            bzxx bzxx = this.f96621a;
            bzyj bzyj = (bzyj) da.mo74062i();
            long h = chnj.m149032h();
            if (bzxx.f171815e == null) {
                bzxx.f171815e = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/StartSync", ciie.m150370a(bzyj.f171880d), ciie.m150370a(bzyk.f171885d));
            }
            bzyk bzyk = (bzyk) bzxx.f171820a.mo25554a(bzxx.f171815e, bzyj, h, TimeUnit.MILLISECONDS);
            axwl axwl = new axwl();
            axwl.f96606a = bzyk.f171887a;
            bzyr bzyr = bzyk.f171889c;
            if (bzyr != null) {
                axwl.f96607b = m83418a(bzyr);
            }
            if (bzyk.f171888b.size() > 0) {
                axwl.mo53688a(m83419a(bzyk.f171888b));
            }
            this.f96622b.mo53760b(":startSync");
            return axwl;
        } catch (chuw e) {
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th) {
            this.f96622b.mo53760b(":startSync");
            throw th;
        }
    }

    /* renamed from: c */
    public final axwj mo53696c(String str, String str2) {
        Set singleton = Collections.singleton(str2);
        this.f96622b.mo53758a(":getAssetAcls");
        String str3 = "";
        try {
            bxvd da = bzyb.f171838e.mo74144da();
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyb) da.f164949b).f171840a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((bzyb) da.f164949b).f171841b = a;
            List a2 = axwr.m83416a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyb bzyb = (bzyb) da.f164949b;
            if (!bzyb.f171843d.mo73666a()) {
                bzyb.f171843d = bxvk.m124021a(bzyb.f171843d);
            }
            bxsy.m123078a(a2, bzyb.f171843d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyb bzyb2 = (bzyb) da.f164949b;
            if (!bzyb2.f171842c.mo73666a()) {
                bzyb2.f171842c = bxvk.m124021a(bzyb2.f171842c);
            }
            bxsy.m123078a(singleton, bzyb2.f171842c);
            bzyb bzyb3 = (bzyb) da.mo74062i();
            bzxx bzxx = this.f96621a;
            long h = chnj.m149032h();
            if (bzxx.f171818h == null) {
                bzxx.f171818h = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/GetAssetAcls", ciie.m150370a(bzyb.f171838e), ciie.m150370a(bzyc.f171844b));
            }
            bzyc bzyc = (bzyc) bzxx.f171820a.mo25554a(bzxx.f171818h, bzyb3, h, TimeUnit.MILLISECONDS);
            str3 = String.format(Locale.US, "numAcls: %d", Integer.valueOf(bzyc.f171846a.size()));
            try {
                HashSet hashSet = new HashSet();
                for (bzym bzym : bzyc.f171846a) {
                    if (bzym.f171897b.size() == 0) {
                        String valueOf = String.valueOf(bzym.f171896a);
                        Log.w("CloudNode", valueOf.length() == 0 ? new String("Incomplete asset received on client: ") : "Incomplete asset received on client: ".concat(valueOf));
                        throw new chuw(chuv.f189227n.mo85687a("unable to create AssetAcl because no acl array was provided"));
                    }
                    HashSet hashSet2 = new HashSet();
                    for (bzyl bzyl : bzym.f171897b) {
                        hashSet2.add(axue.m83239a(bzyl.f171892a, bzyl.f171893b));
                    }
                    hashSet.add(new axwj(bzym.f171896a, hashSet2));
                }
                this.f96622b.mo53759a(":getAssetAcls", str3);
                return (axwj) hashSet.iterator().next();
            } catch (chuw e) {
                e = e;
                try {
                    throw new axwq("Error reading gRPC response.", e);
                } catch (Throwable th) {
                    th = th;
                    this.f96622b.mo53759a(":getAssetAcls", str3);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                this.f96622b.mo53759a(":getAssetAcls", str3);
                throw th;
            }
        } catch (chuw e2) {
            e = e2;
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th3) {
            th = th3;
            this.f96622b.mo53759a(":getAssetAcls", str3);
            throw th;
        }
    }

    /* renamed from: a */
    static Map m83418a(bzyr bzyr) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = bzyr.f171923a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bzyp bzyp = (bzyp) bxwc.get(i);
            hashMap.put(bzyp.f171915a, Long.valueOf(bzyp.f171916b));
        }
        return hashMap;
    }

    /* renamed from: a */
    static Set m83419a(List list) {
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bzyq bzyq = (bzyq) list.get(i);
            hashSet.add(new axwx(bzyq.f171919a, bzyq.f171920b));
        }
        return hashSet;
    }

    /* renamed from: a */
    public final axwk mo53689a(String str, Map map, long j) {
        boolean z;
        this.f96622b.mo53758a(":getDataItems");
        String str2 = "";
        try {
            bxvd da = bzyd.f171847f.mo74144da();
            boolean z2 = false;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyd) da.f164949b).f171852d = 2;
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyd) da.f164949b).f171849a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyd bzyd = (bzyd) da.f164949b;
            a.getClass();
            bzyd.f171850b = a;
            bzyd.f171851c = j;
            bxvd da2 = bzyr.f171921b.mo74144da();
            for (Map.Entry entry : map.entrySet()) {
                bxvd da3 = bzyp.f171913c.mo74144da();
                String str3 = (String) entry.getKey();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                str3.getClass();
                ((bzyp) da3.f164949b).f171915a = str3;
                long longValue = ((Long) entry.getValue()).longValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((bzyp) da3.f164949b).f171916b = longValue;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzyr bzyr = (bzyr) da2.f164949b;
                bzyp bzyp = (bzyp) da3.mo74062i();
                bzyp.getClass();
                if (!bzyr.f171923a.mo73666a()) {
                    bzyr.f171923a = bxvk.m124021a(bzyr.f171923a);
                }
                bzyr.f171923a.add(bzyp);
            }
            bzyr bzyr2 = (bzyr) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyr2.getClass();
            ((bzyd) da.f164949b).f171853e = bzyr2;
            bzyd bzyd2 = (bzyd) da.mo74062i();
            bzxx bzxx = this.f96621a;
            long h = chnj.m149032h();
            if (bzxx.f171816f == null) {
                bzxx.f171816f = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/GetDataItems", ciie.m150370a(bzyd.f171847f), ciie.m150370a(bzye.f171854c));
            }
            bzye bzye = (bzye) bzxx.f171820a.mo25554a(bzxx.f171816f, bzyd2, h, TimeUnit.MILLISECONDS);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(bzye.f171856a.size());
            if (bzye.f171857b > 0) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            str2 = String.format(locale, "numItems: %d, hasMoreData: %b", objArr);
            try {
                if (Log.isLoggable("CloudNode", 2)) {
                    String valueOf = String.valueOf(str2);
                    Log.v("CloudNode", valueOf.length() == 0 ? new String("getDataItems ") : "getDataItems ".concat(valueOf));
                }
                ArrayList arrayList = new ArrayList();
                for (bzyn bzyn : bzye.f171856a) {
                    bzyl bzyl = bzyn.f171902c;
                    if (bzyl == null) {
                        bzyl = bzyl.f171890c;
                    }
                    String str4 = bzyl.f171892a;
                    bzyl bzyl2 = bzyn.f171902c;
                    if (bzyl2 == null) {
                        bzyl2 = bzyl.f171890c;
                    }
                    axxi axxi = new axxi(axue.m83239a(str4, bzyl2.f171893b));
                    axxi.f96647b = new axxf(bzyn.f171900a, bzyn.f171901b);
                    axxi.f96653h = bzyn.f171904e;
                    axxi.f96651f = bzyn.f171905f;
                    axxi.f96648c = bzyn.f171906g;
                    if (!bzyn.f171907h.isEmpty()) {
                        axxi.f96650e = bzyn.f171907h;
                    }
                    if (!bxtx.m123258a(bzyn.f171903d).mo73779j()) {
                        axxi.f96647b.f96642d = Base64.decode(bzyn.f171903d, 2);
                    }
                    for (bzyo bzyo : bzyn.f171908i) {
                        axxi.f96647b.mo53711a(bzyo.f171911a, axuh.m83243a(bzyo.f171912b));
                    }
                    arrayList.add(axxi);
                }
                if (bzye.f171857b > 0) {
                    z2 = true;
                }
                axwk axwk = new axwk(arrayList, z2);
                this.f96622b.mo53759a(":getDataItems", str2);
                return axwk;
            } catch (chuw e) {
                e = e;
                try {
                    throw new axwq("Error reading gRPC response.", e);
                } catch (Throwable th) {
                    th = th;
                    this.f96622b.mo53759a(":getDataItems", str2);
                    throw th;
                }
            }
        } catch (chuw e2) {
            e = e2;
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th2) {
            th = th2;
            this.f96622b.mo53759a(":getDataItems", str2);
            throw th;
        }
    }

    /* renamed from: a */
    public final axwl mo53690a(String str, Iterator it, int i) {
        boolean z;
        String str2 = "";
        this.f96622b.mo53758a(":putDataItems");
        try {
            bxvd da = bzyg.f171863f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyg) da.f164949b).f171868d = 2;
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyg) da.f164949b).f171865a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((bzyg) da.f164949b).f171866b = a;
            List a2 = axwr.m83416a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyg bzyg = (bzyg) da.f164949b;
            if (!bzyg.f171869e.mo73666a()) {
                bzyg.f171869e = bxvk.m124021a(bzyg.f171869e);
            }
            bxsy.m123078a(a2, bzyg.f171869e);
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((bzyg) da.f164949b).f171867c.size() >= i) {
                    break;
                } else {
                    axxi axxi = (axxi) it.next();
                    bxvd da2 = bzyn.f171898j.mo74144da();
                    bxvd da3 = bzyl.f171890c.mo74144da();
                    String str3 = axxi.f96646a.f96379c;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzyl bzyl = (bzyl) da3.f164949b;
                    str3.getClass();
                    bzyl.f171893b = str3;
                    String str4 = axxi.f96646a.f96377a;
                    str4.getClass();
                    bzyl.f171892a = str4;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzyl bzyl2 = (bzyl) da3.mo74062i();
                    bzyl2.getClass();
                    ((bzyn) da2.f164949b).f171902c = bzyl2;
                    String str5 = axxi.f96647b.f96639a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzyn bzyn = (bzyn) da2.f164949b;
                    str5.getClass();
                    bzyn.f171900a = str5;
                    axxf axxf = axxi.f96647b;
                    String str6 = axxf.f96640b;
                    str6.getClass();
                    bzyn.f171901b = str6;
                    bzyn.f171904e = axxi.f96653h;
                    bzyn.f171905f = axxi.f96651f;
                    bzyn.f171906g = axxi.f96648c;
                    String str7 = axxi.f96650e;
                    if (str7 != null) {
                        str7.getClass();
                        bzyn.f171907h = str7;
                    }
                    byte[] bArr = axxf.f96642d;
                    if (bArr != null) {
                        String encodeToString = Base64.encodeToString(bArr, 2);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        encodeToString.getClass();
                        ((bzyn) da2.f164949b).f171903d = encodeToString;
                    }
                    for (Map.Entry entry : axxi.f96647b.mo53710a().entrySet()) {
                        bxvd da4 = bzyo.f171909c.mo74144da();
                        String str8 = (String) entry.getKey();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        str8.getClass();
                        ((bzyo) da4.f164949b).f171911a = str8;
                        String str9 = ((axuh) entry.getValue()).f96387b;
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        str9.getClass();
                        ((bzyo) da4.f164949b).f171912b = str9;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzyn bzyn2 = (bzyn) da2.f164949b;
                        bzyo bzyo = (bzyo) da4.mo74062i();
                        bzyo.getClass();
                        if (!bzyn2.f171908i.mo73666a()) {
                            bzyn2.f171908i = bxvk.m124021a(bzyn2.f171908i);
                        }
                        bzyn2.f171908i.add(bzyo);
                    }
                    bzyn bzyn3 = (bzyn) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzyg bzyg2 = (bzyg) da.f164949b;
                    bzyn3.getClass();
                    if (!bzyg2.f171867c.mo73666a()) {
                        bzyg2.f171867c = bxvk.m124021a(bzyg2.f171867c);
                    }
                    bzyg2.f171867c.add(bzyn3);
                }
            }
            bzxx bzxx = this.f96621a;
            bzyg bzyg3 = (bzyg) da.mo74062i();
            long h = chnj.m149032h();
            if (bzxx.f171817g == null) {
                bzxx.f171817g = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/PutDataItems", ciie.m150370a(bzyg.f171863f), ciie.m150370a(bzyh.f171870d));
            }
            bzyh bzyh = (bzyh) bzxx.f171820a.mo25554a(bzxx.f171817g, bzyg3, h, TimeUnit.MILLISECONDS);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(((bzyg) da.f164949b).f171867c.size());
            if (bzyh.f171873b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            String format = String.format(locale, "numItems: %d, hasPendingAssets=%b", objArr);
            try {
                if (Log.isLoggable("CloudNode", 2)) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = format;
                    objArr2[1] = Long.valueOf(bzyh.f171872a);
                    bzyr bzyr = bzyh.f171874c;
                    if (bzyr == null) {
                        bzyr = bzyr.f171921b;
                    }
                    StringBuilder sb = new StringBuilder("{");
                    for (bzyp bzyp : bzyr.f171923a) {
                        sb.append(str2);
                        sb.append(bzyp.f171915a);
                        sb.append(":");
                        sb.append(bzyp.f171916b);
                        str2 = ", ";
                    }
                    sb.append("}");
                    objArr2[2] = sb.toString();
                    Log.v("CloudNode", String.format(locale2, "putDataItems %s, seqId=%d, syncTable=%s", objArr2));
                }
                axwl axwl = new axwl();
                axwl.f96606a = bzyh.f171872a;
                bzyr bzyr2 = bzyh.f171874c;
                if (bzyr2 != null) {
                    axwl.f96607b = m83418a(bzyr2);
                }
                if (bzyh.f171873b.size() > 0) {
                    axwl.mo53688a(m83419a(bzyh.f171873b));
                }
                this.f96622b.mo53759a(":putDataItems", format);
                return axwl;
            } catch (chuw e) {
                e = e;
                str2 = format;
                try {
                    throw new axwq("Error reading gRPC response.", e);
                } catch (Throwable th) {
                    th = th;
                    this.f96622b.mo53759a(":putDataItems", str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = format;
                this.f96622b.mo53759a(":putDataItems", str2);
                throw th;
            }
        } catch (chuw e2) {
            e = e2;
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th3) {
            th = th3;
            this.f96622b.mo53759a(":putDataItems", str2);
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo53691a(long j, String str, String str2) {
        this.f96622b.mo53758a(":createNetwork");
        try {
            bxvd da = bzxy.f171821e.mo74144da();
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzxy bzxy = (bzxy) da.f164949b;
            a.getClass();
            bzxy.f171823a = a;
            bzxy.f171824b = j;
            str.getClass();
            bzxy.f171825c = str;
            str2.getClass();
            bzxy.f171826d = str2;
            bzxy bzxy2 = (bzxy) da.mo74062i();
            bzxx bzxx = this.f96621a;
            long h = chnj.m149032h();
            if (bzxx.f171812b == null) {
                bzxx.f171812b = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/CreateNetwork", ciie.m150370a(bzxy.f171821e), ciie.m150370a(bzxz.f171827b));
            }
            long j2 = ((bzxz) bzxx.f171820a.mo25554a(bzxx.f171812b, bzxy2, h, TimeUnit.MILLISECONDS)).f171829a;
            if (j2 != 0) {
                String l = Long.toString(j2);
                this.f96622b.mo53760b(":createNetwork");
                return l;
            }
            throw new axwq(3, "createNetwork error: networkId is empty");
        } catch (chuw e) {
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th) {
            this.f96622b.mo53760b(":createNetwork");
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53692a(String str, String str2) {
        this.f96622b.mo53758a(":revokeNode");
        try {
            bxvd da = bzyi.f171875d.mo74144da();
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyi) da.f164949b).f171877a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyi bzyi = (bzyi) da.f164949b;
            a.getClass();
            bzyi.f171878b = a;
            str2.getClass();
            bzyi.f171879c = str2;
            bzyi bzyi2 = (bzyi) da.mo74062i();
            bzxx bzxx = this.f96621a;
            long h = chnj.m149032h();
            if (bzxx.f171814d == null) {
                bzxx.f171814d = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/RevokeNode", ciie.m150370a(bzyi.f171875d), ciie.m150370a(bxuo.f164865a));
            }
            bxuo bxuo = (bxuo) bzxx.f171820a.mo25554a(bzxx.f171814d, bzyi2, h, TimeUnit.MILLISECONDS);
            this.f96622b.mo53760b(":revokeNode");
        } catch (chuw e) {
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th) {
            this.f96622b.mo53760b(":revokeNode");
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53693a(String str, String str2, long j, String str3, String str4) {
        this.f96622b.mo53758a(":enrollNode");
        try {
            bxvd da = bzya.f171830g.mo74144da();
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzya) da.f164949b).f171832a = parseLong;
            String a = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzya bzya = (bzya) da.f164949b;
            a.getClass();
            bzya.f171833b = a;
            str2.getClass();
            bzya.f171835d = str2;
            bzya.f171834c = j;
            str4.getClass();
            bzya.f171836e = str4;
            str3.getClass();
            bzya.f171837f = str3;
            bzya bzya2 = (bzya) da.mo74062i();
            bzxx bzxx = this.f96621a;
            long h = chnj.m149032h();
            if (bzxx.f171813c == null) {
                bzxx.f171813c = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/EnrollNode", ciie.m150370a(bzya.f171830g), ciie.m150370a(bxuo.f164865a));
            }
            bxuo bxuo = (bxuo) bzxx.f171820a.mo25554a(bzxx.f171813c, bzya2, h, TimeUnit.MILLISECONDS);
            this.f96622b.mo53760b(":enrollNode");
        } catch (chuw e) {
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th) {
            this.f96622b.mo53760b(":enrollNode");
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53694a(String str, String str2, Set set) {
        bnic a = bnic.m109489a(new axwj(str2, set));
        this.f96622b.mo53758a(":putAssetAcls");
        try {
            bxvd da = bzyf.f171858d.mo74144da();
            long parseLong = Long.parseLong(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bzyf) da.f164949b).f171860a = parseLong;
            String a2 = m83417a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((bzyf) da.f164949b).f171861b = a2;
            bnrd a3 = ((bnpg) a).iterator();
            while (a3.hasNext()) {
                axwj axwj = (axwj) a3.next();
                bxvd da2 = bzym.f171894c.mo74144da();
                String str3 = axwj.f96602a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str3.getClass();
                ((bzym) da2.f164949b).f171896a = str3;
                for (axue axue : axwj.f96603b) {
                    bxvd da3 = bzyl.f171890c.mo74144da();
                    String str4 = axue.f96377a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzyl bzyl = (bzyl) da3.f164949b;
                    str4.getClass();
                    bzyl.f171892a = str4;
                    String str5 = axue.f96379c;
                    str5.getClass();
                    bzyl.f171893b = str5;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzym bzym = (bzym) da2.f164949b;
                    bzyl bzyl2 = (bzyl) da3.mo74062i();
                    bzyl2.getClass();
                    if (!bzym.f171897b.mo73666a()) {
                        bzym.f171897b = bxvk.m124021a(bzym.f171897b);
                    }
                    bzym.f171897b.add(bzyl2);
                }
                bzym bzym2 = (bzym) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzyf bzyf = (bzyf) da.f164949b;
                bzym2.getClass();
                if (!bzyf.f171862c.mo73666a()) {
                    bzyf.f171862c = bxvk.m124021a(bzyf.f171862c);
                }
                bzyf.f171862c.add(bzym2);
            }
            bzxx bzxx = this.f96621a;
            bzyf bzyf2 = (bzyf) da.mo74062i();
            long h = chnj.m149032h();
            if (bzxx.f171819i == null) {
                bzxx.f171819i = chtv.m149566a(chtu.UNARY, "google.internal.android.wear.cloudsync.v1.CloudSyncService/PutAssetAcls", ciie.m150370a(bzyf.f171858d), ciie.m150370a(bxuo.f164865a));
            }
            bxuo bxuo = (bxuo) bzxx.f171820a.mo25554a(bzxx.f171819i, bzyf2, h, TimeUnit.MILLISECONDS);
            this.f96622b.mo53759a(":putAssetAcls", String.format(Locale.US, "numAcls: %d", 1));
        } catch (chuw e) {
            throw new axwq("Error reading gRPC response.", e);
        } catch (Throwable th) {
            this.f96622b.mo53759a(":putAssetAcls", "");
            throw th;
        }
    }
}
