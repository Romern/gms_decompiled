package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.RemoteException;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: swq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f45316a;

    /* renamed from: b */
    final /* synthetic */ long f45317b;

    /* renamed from: c */
    final /* synthetic */ swy f45318c;

    /* renamed from: d */
    final /* synthetic */ swo f45319d;

    /* renamed from: e */
    final /* synthetic */ byte[] f45320e;

    /* renamed from: f */
    final /* synthetic */ asfb f45321f;

    /* renamed from: g */
    final /* synthetic */ ConfigChimeraService f45322g;

    /* renamed from: h */
    private swp f45323h;

    public swq(ConfigChimeraService configChimeraService, swp swp, String str, long j, swy swy, swo swo, byte[] bArr, asfb asfb) {
        this.f45322g = configChimeraService;
        this.f45316a = str;
        this.f45317b = j;
        this.f45318c = swy;
        this.f45319d = swo;
        this.f45320e = bArr;
        this.f45321f = asfb;
        this.f45323h = swp;
    }

    /* renamed from: a */
    private final sxi m36532a(abop abop, sxf sxf) {
        IOException e;
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            URL url = new URL("https://cloudconfig.googleapis.com/config");
            shr.m35316b(1035);
            try {
                HttpURLConnection a = ((aboy) abop.f57803a).mo32271a(url);
                a.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                a.setRequestProperty("Content-Type", "application/x-protobuffer");
                a.setDoOutput(true);
                a.setConnectTimeout(this.f45323h.f45306f);
                a.setReadTimeout(this.f45323h.f45307g);
                if (a instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) a).setSSLSocketFactory(abop.mo32249a());
                }
                bobb a2 = bobb.m111033a();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(a.getOutputStream());
                    a2.mo68842a(gZIPOutputStream);
                    sxf.mo73638a(gZIPOutputStream);
                    a2.close();
                    a.connect();
                    int responseCode = a.getResponseCode();
                    if (responseCode != 200) {
                        String responseMessage = a.getResponseMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(responseMessage).length() + 38);
                        sb.append("bad response from server: ");
                        sb.append(responseCode);
                        sb.append(" ");
                        sb.append(responseMessage);
                        Log.w("FetchTask", sb.toString());
                        boax.m111029a((InputStream) null);
                        shr.m35312a();
                        return null;
                    }
                    gZIPInputStream = new GZIPInputStream(a.getInputStream());
                    try {
                        sxi sxi = (sxi) GeneratedMessageLite.m124011a(sxi.f45356d, gZIPInputStream, bxus.m123744c());
                        boax.m111029a((InputStream) gZIPInputStream);
                        shr.m35312a();
                        return sxi;
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
                            sb2.append("exception on config fetch: ");
                            sb2.append(valueOf);
                            Log.w("FetchTask", sb2.toString(), e);
                            boax.m111029a((InputStream) gZIPInputStream);
                            shr.m35312a();
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            gZIPInputStream2 = gZIPInputStream;
                            boax.m111029a((InputStream) gZIPInputStream2);
                            shr.m35312a();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    a2.close();
                    throw th2;
                }
            } catch (IOException e3) {
                e = e3;
                gZIPInputStream = null;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                sb22.append("exception on config fetch: ");
                sb22.append(valueOf2);
                Log.w("FetchTask", sb22.toString(), e);
                boax.m111029a((InputStream) gZIPInputStream);
                shr.m35312a();
                return null;
            } catch (Throwable th3) {
                th = th3;
                boax.m111029a((InputStream) gZIPInputStream2);
                shr.m35312a();
                throw th;
            }
        } catch (MalformedURLException e4) {
            Log.e("FetchTask", "bad config fetch url https://cloudconfig.googleapis.com/config");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, long):long
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      aymn.a(android.content.ContentResolver, java.lang.String, long):long */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
     arg types: [android.content.Context, java.lang.String, int, int]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07cc A[SYNTHETIC, Splitter:B:294:0x07cc] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0807 A[Catch:{ RemoteException -> 0x0838 }] */
    public final void run() {
        sxi sxi;
        swq swq;
        Map map;
        List list;
        swk swk;
        swk swk2;
        SQLiteDatabase sQLiteDatabase;
        IllegalStateException illegalStateException;
        int a;
        swk swk3;
        HashMap hashMap;
        HashMap hashMap2;
        Map map2;
        List list2;
        List list3;
        long j;
        byte[] bArr;
        HashMap hashMap3;
        swy swy;
        int i;
        long j2;
        byte[] bArr2;
        HashMap hashMap4;
        swp[] swpArr = {this.f45323h};
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("FetchTask");
        this.f45323h = swpArr[0];
        bxvd da = sxf.f45339o.mo74144da();
        Context applicationContext = this.f45323h.f45301a.getApplicationContext();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf = (sxf) da.f164949b;
        int i2 = sxf.f45341a | 16;
        sxf.f45341a = i2;
        sxf.f45346f = 3;
        sxf.f45341a = i2 | 512;
        sxf.f45351k = 1;
        int i3 = qdg.m31927h(applicationContext).f41394i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf2 = (sxf) da.f164949b;
        sxf2.f45341a |= 1024;
        sxf2.f45352l = i3;
        long a2 = aymn.m84261a(this.f45323h.f45301a.getContentResolver(), "android_id", 0L);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf3 = (sxf) da.f164949b;
        sxf3.f45341a |= 2;
        sxf3.f45342b = a2;
        long b = qdg.m31920b(this.f45323h.f45301a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf4 = (sxf) da.f164949b;
        sxf4.f45341a |= 8;
        sxf4.f45345e = b;
        String g = qdg.m31926g(this.f45323h.f45301a);
        if (g != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            sxf sxf5 = (sxf) da.f164949b;
            g.getClass();
            sxf5.f45341a |= 4;
            sxf5.f45344d = g;
        }
        int i4 = this.f45323h.f45304d.f45293b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf6 = (sxf) da.f164949b;
        int i5 = sxf6.f45341a | 32;
        sxf6.f45341a = i5;
        sxf6.f45347g = i4;
        int i6 = this.f45323h.f45304d.f45294c;
        sxf6.f45341a = i5 | 64;
        sxf6.f45348h = i6;
        String num = Integer.toString(i6);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf7 = (sxf) da.f164949b;
        num.getClass();
        int i7 = sxf7.f45341a | 2048;
        sxf7.f45341a = i7;
        sxf7.f45353m = num;
        swo swo = this.f45323h.f45304d;
        String str = swo.f45300i;
        str.getClass();
        int i8 = i7 | 4096;
        sxf7.f45341a = i8;
        sxf7.f45354n = str;
        String str2 = swo.f45295d;
        str2.getClass();
        int i9 = i8 | 128;
        sxf7.f45341a = i9;
        sxf7.f45349i = str2;
        String str3 = swo.f45296e;
        str3.getClass();
        sxf7.f45341a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        sxf7.f45350j = str3;
        bxvd da2 = sxl.f45372q.mo74144da();
        String str4 = this.f45323h.f45302b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        sxl sxl = (sxl) da2.f164949b;
        str4.getClass();
        int i10 = sxl.f45374a | 16;
        sxl.f45374a = i10;
        sxl.f45375b = str4;
        swp swp = this.f45323h;
        swo swo2 = swp.f45304d;
        int i11 = swo2.f45292a;
        int i12 = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        sxl.f45374a = i12;
        sxl.f45380g = i11;
        String str5 = swo2.f45299h;
        if (str5 != null) {
            str5.getClass();
            i12 |= 512;
            sxl.f45374a = i12;
            sxl.f45381h = str5;
        }
        String str6 = swo2.f45297f;
        if (str6 != null) {
            str6.getClass();
            i12 |= 32;
            sxl.f45374a = i12;
            sxl.f45376c = str6;
        }
        String str7 = swo2.f45298g;
        if (str7 != null) {
            str7.getClass();
            sxl.f45374a = i12 | 64;
            sxl.f45377d = str7;
        }
        Map map3 = swp.f45303c;
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                bxvd da3 = sxk.f45367d.mo74144da();
                String str8 = (String) entry.getKey();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                sxk sxk = (sxk) da3.f164949b;
                str8.getClass();
                sxk.f45369a |= 1;
                sxk.f45370b = str8;
                String str9 = (String) entry.getValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                sxk sxk2 = (sxk) da3.f164949b;
                str9.getClass();
                sxk2.f45369a |= 2;
                sxk2.f45371c = str9;
                sxk sxk3 = (sxk) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                sxl sxl2 = (sxl) da2.f164949b;
                sxk3.getClass();
                if (!sxl2.f45378e.mo73666a()) {
                    sxl2.f45378e = GeneratedMessageLite.m124021a(sxl2.f45378e);
                }
                sxl2.f45378e.add(sxk3);
            }
        }
        Map map4 = this.f45323h.f45305e;
        if (map4 != null) {
            for (Map.Entry entry2 : map4.entrySet()) {
                bxvd da4 = sxk.f45367d.mo74144da();
                String str10 = (String) entry2.getKey();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                sxk sxk4 = (sxk) da4.f164949b;
                str10.getClass();
                sxk4.f45369a |= 1;
                sxk4.f45370b = str10;
                String str11 = (String) entry2.getValue();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                sxk sxk5 = (sxk) da4.f164949b;
                str11.getClass();
                sxk5.f45369a |= 2;
                sxk5.f45371c = str11;
                sxk sxk6 = (sxk) da4.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                sxl sxl3 = (sxl) da2.f164949b;
                sxk6.getClass();
                if (!sxl3.f45379f.mo73666a()) {
                    sxl3.f45379f = GeneratedMessageLite.m124021a(sxl3.f45379f);
                }
                sxl3.f45379f.add(sxk6);
            }
        }
        List list4 = this.f45323h.f45308h;
        if (list4 != null) {
            int size = list4.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str12 = (String) list4.get(i13);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                sxl sxl4 = (sxl) da2.f164949b;
                str12.getClass();
                if (!sxl4.f45384k.mo73666a()) {
                    sxl4.f45384k = GeneratedMessageLite.m124021a(sxl4.f45384k);
                }
                sxl4.f45384k.add(str12);
            }
        }
        String str13 = this.f45323h.f45309i;
        if (str13 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            sxl sxl5 = (sxl) da2.f164949b;
            str13.getClass();
            sxl5.f45374a |= 1024;
            sxl5.f45382i = str13;
        }
        String str14 = this.f45323h.f45310j;
        if (str14 != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            sxl sxl6 = (sxl) da2.f164949b;
            str14.getClass();
            sxl6.f45374a |= 2048;
            sxl6.f45383j = str14;
        }
        int i14 = this.f45323h.f45311k;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        sxl sxl7 = (sxl) da2.f164949b;
        sxl7.f45374a |= 4096;
        sxl7.f45385l = i14;
        List list5 = this.f45323h.f45312l;
        if (list5 != null && !list5.isEmpty()) {
            List list6 = this.f45323h.f45312l;
            int size2 = list6.size();
            for (int i15 = 0; i15 < size2; i15++) {
                AnalyticsUserProperty analyticsUserProperty = (AnalyticsUserProperty) list6.get(i15);
                bxvd da5 = sxk.f45367d.mo74144da();
                String str15 = analyticsUserProperty.f30443a;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                sxk sxk7 = (sxk) da5.f164949b;
                str15.getClass();
                int i16 = sxk7.f45369a | 1;
                sxk7.f45369a = i16;
                sxk7.f45370b = str15;
                String str16 = analyticsUserProperty.f30444b;
                str16.getClass();
                sxk7.f45369a = i16 | 2;
                sxk7.f45371c = str16;
                sxk sxk8 = (sxk) da5.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                sxl sxl8 = (sxl) da2.f164949b;
                sxk8.getClass();
                if (!sxl8.f45386m.mo73666a()) {
                    sxl8.f45386m = GeneratedMessageLite.m124021a(sxl8.f45386m);
                }
                sxl8.f45386m.add(sxk8);
            }
        }
        int i17 = this.f45323h.f45313m;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        sxl sxl9 = (sxl) da2.f164949b;
        int i18 = sxl9.f45374a | 8192;
        sxl9.f45374a = i18;
        sxl9.f45387n = i17;
        swp swp2 = this.f45323h;
        int i19 = swp2.f45314n;
        int i20 = i18 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        sxl9.f45374a = i20;
        sxl9.f45389p = i19;
        int i21 = swp2.f45315o;
        sxl9.f45374a = i20 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        sxl9.f45388o = i21;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sxf sxf8 = (sxf) da.f164949b;
        sxl sxl10 = (sxl) da2.mo74062i();
        sxl10.getClass();
        if (!sxf8.f45343c.mo73666a()) {
            sxf8.f45343c = GeneratedMessageLite.m124021a(sxf8.f45343c);
        }
        sxf8.f45343c.add(sxl10);
        sxf sxf9 = (sxf) da.mo74062i();
        try {
            Context applicationContext2 = this.f45323h.f45301a.getApplicationContext();
            String valueOf = String.valueOf(Integer.toString(rfi.f42869b));
            sxi = m36532a(new abop(applicationContext2, valueOf.length() == 0 ? new String("ConfigFetchTask-") : "ConfigFetchTask-".concat(valueOf), false, true), sxf9);
            Thread.currentThread().setName(name);
        } catch (IOException e) {
            String valueOf2 = String.valueOf(this.f45323h.f45302b);
            Log.e("FetchTask", valueOf2.length() == 0 ? new String("Config fetch from backend failed for package: ") : "Config fetch from backend failed for package: ".concat(valueOf2), e);
            Thread.currentThread().setName(name);
            sxi = null;
        } catch (Throwable th) {
            Thread.currentThread().setName(name);
            throw th;
        }
        if (sxi != null && ((a = sxh.m36551a(sxi.f45358a)) == 0 || a == 1)) {
            ConfigChimeraService configChimeraService = this.f45322g;
            String str17 = this.f45316a;
            long j3 = this.f45317b;
            byte[] a3 = swo.m36531a(this.f45319d);
            byte[] bArr3 = this.f45320e;
            swy swy2 = this.f45318c;
            ArrayList arrayList = new ArrayList();
            synchronized (configChimeraService.f30432a) {
                swk3 = (swk) configChimeraService.f30434c.get(str17);
                Map map5 = configChimeraService.f30435d;
                if (map5 != null) {
                    hashMap = new HashMap(map5);
                } else {
                    hashMap = null;
                }
                Map map6 = configChimeraService.f30433b;
                if (map6 == null || map6.get(str17) == null) {
                    hashMap2 = null;
                } else {
                    hashMap2 = new HashMap((Map) configChimeraService.f30433b.get(str17));
                }
            }
            if (swk3 != null) {
                map2 = swk3.f45284a;
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (hashMap == null) {
                hashMap = new HashMap();
            } else {
                ConfigChimeraService.m22762a(hashMap, str17);
            }
            bxwc bxwc = sxi.f45359b;
            int i22 = 0;
            for (int size3 = bxwc.size(); i22 < size3; size3 = size3) {
                sxj sxj = (sxj) bxwc.get(i22);
                hashMap.put(sxj.f45364a, sxj.f45365b.getKey());
                i22++;
                bxwc = bxwc;
            }
            bxwc bxwc2 = sxi.f45360c;
            int size4 = bxwc2.size();
            int i23 = 0;
            while (i23 < size4) {
                sxb sxb = (sxb) bxwc2.get(i23);
                bxwc bxwc3 = bxwc2;
                if (str17.equals(sxb.f45327a)) {
                    Set keySet = hashMap2.keySet();
                    i = size4;
                    bxwc bxwc4 = sxb.f45328b;
                    HashSet<String> hashSet = new HashSet(keySet);
                    if (!hashSet.isEmpty()) {
                        swy = swy2;
                        int i24 = 0;
                        for (int size5 = bxwc4.size(); i24 < size5; size5 = size5) {
                            hashSet.remove(((sxe) bxwc4.get(i24)).f45334a);
                            i24++;
                        }
                    } else {
                        swy = swy2;
                    }
                    for (String str18 : hashSet) {
                        hashMap2.remove(str18);
                        map2.remove(str18);
                    }
                    bxwc bxwc5 = sxb.f45328b;
                    int size6 = bxwc5.size();
                    int i25 = 0;
                    while (i25 < size6) {
                        sxe sxe = (sxe) bxwc5.get(i25);
                        bxwc bxwc6 = bxwc5;
                        String str19 = sxe.f45334a;
                        int i26 = size6;
                        int a4 = sxd.m36547a(sxe.f45337d);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i27 = a4 - 1;
                        if (i27 != 0) {
                            hashMap4 = hashMap;
                            if (i27 == 2) {
                                map2.put(str19, sxe.f45335b);
                                bArr2 = bArr3;
                                j2 = j3;
                            } else if (i27 != 3) {
                                hashMap2.remove(str19);
                                map2.remove(str19);
                                bArr2 = bArr3;
                                j2 = j3;
                            } else {
                                hashMap2.put(str19, new TreeMap());
                                map2.put(str19, sxe.f45335b);
                                bArr2 = bArr3;
                                j2 = j3;
                            }
                        } else {
                            hashMap4 = hashMap;
                            TreeMap treeMap = new TreeMap();
                            bxwc bxwc7 = sxe.f45336c;
                            bArr2 = bArr3;
                            int size7 = bxwc7.size();
                            j2 = j3;
                            int i28 = 0;
                            while (i28 < size7) {
                                sxj sxj2 = (sxj) bxwc7.get(i28);
                                treeMap.put(sxj2.f45364a, sxj2.f45365b.getKey());
                                i28++;
                                bxwc7 = bxwc7;
                            }
                            hashMap2.put(str19, treeMap);
                            map2.put(str19, sxe.f45335b);
                        }
                        i25++;
                        bxwc5 = bxwc6;
                        size6 = i26;
                        hashMap = hashMap4;
                        bArr3 = bArr2;
                        j3 = j2;
                    }
                    hashMap3 = hashMap;
                    bArr = bArr3;
                    j = j3;
                    for (byte[] bArr4 : bxzj.f165164a.mo66860a((Iterable) sxb.f45329c)) {
                        arrayList.add(bArr4);
                    }
                } else {
                    hashMap3 = hashMap;
                    bArr = bArr3;
                    i = size4;
                    swy = swy2;
                    j = j3;
                }
                i23++;
                bxwc2 = bxwc3;
                size4 = i;
                swy2 = swy;
                hashMap = hashMap3;
                bArr3 = bArr;
                j3 = j;
            }
            HashMap hashMap5 = hashMap;
            byte[] bArr5 = bArr3;
            swy swy3 = swy2;
            long j4 = j3;
            if (swk3 != null) {
                list2 = swk3.f45287d;
            } else {
                list2 = null;
            }
            if (swk3 != null) {
                list3 = swk3.f45288e;
            } else {
                list3 = null;
            }
            List a5 = ConfigChimeraService.m22759a(list2, j4, configChimeraService.mo17956b(str17));
            ArrayList arrayList2 = arrayList;
            configChimeraService.mo17952a(str17, hashMap2, new swk(a5, list3, map2, a3, bArr5), hashMap5, arrayList2);
            if (swy3 != null) {
                try {
                    DataHolder b2 = configChimeraService.mo17958b(hashMap2);
                    DataHolder b3 = configChimeraService.mo17957b(arrayList2);
                    swy3.mo26197a(Status.f30107a, new FetchConfigIpcResponse(-6505, b2, b3));
                    if (b2 != null && !b2.mo17768b()) {
                        b2.close();
                    }
                    if (b3 == null) {
                        swq = this;
                    } else if (!b3.mo17768b()) {
                        b3.close();
                        swq = this;
                    } else {
                        swq = this;
                    }
                } catch (RemoteException e2) {
                    String valueOf3 = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 47);
                    sb.append("Failed to call callback method for fetchConfig.");
                    sb.append(valueOf3);
                    Log.e("ConfigChimeraService", sb.toString());
                    swq = this;
                }
            } else {
                swq = this;
            }
        } else {
            swq = this;
            synchronized (swq.f45322g.f30432a) {
                map = (Map) swq.f45322g.f30433b.get(swq.f45316a);
                list = (List) swq.f45322g.f30436e.get(swq.f45316a);
            }
            ConfigChimeraService configChimeraService2 = swq.f45322g;
            String str20 = swq.f45316a;
            long j5 = swq.f45317b;
            synchronized (configChimeraService2.f30432a) {
                swk = (swk) configChimeraService2.f30434c.get(str20);
            }
            if (swk != null) {
                swk2 = new swk(swk.f45287d, ConfigChimeraService.m22759a(swk.f45288e, j5, configChimeraService2.mo17960c(str20)), swk.f45284a, swk.f45285b, swk.f45286c);
            } else {
                swk2 = new swk(null, ConfigChimeraService.m22759a((List) null, j5, configChimeraService2.mo17960c(str20)), null, null, null);
            }
            try {
                sQLiteDatabase = configChimeraService2.f30440j.getWritableDatabase();
            } catch (IllegalStateException e3) {
                Log.e("ConfigChimeraService", "Database not in a state to be opened. We are probably being destroyed.", e3);
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase != null) {
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM fetch_metadata WHERE package = ?");
                SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("INSERT INTO fetch_metadata (package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest) VALUES (?, ?, ?, ?, ?, ?)");
                sQLiteDatabase.beginTransaction();
                try {
                    compileStatement.bindString(1, str20);
                    compileStatement.execute();
                    compileStatement2.bindString(1, str20);
                    compileStatement2.bindString(2, swk2.mo26202b());
                    compileStatement2.bindString(3, ConfigChimeraService.m22756a(swk2.f45287d));
                    compileStatement2.bindString(4, swk2.mo26200a());
                    byte[] bArr6 = swk2.f45285b;
                    if (bArr6 != null) {
                        compileStatement2.bindBlob(5, bArr6);
                    } else {
                        compileStatement2.bindNull(5);
                    }
                    byte[] bArr7 = swk2.f45286c;
                    if (bArr7 != null) {
                        compileStatement2.bindBlob(6, bArr7);
                    } else {
                        compileStatement2.bindNull(6);
                    }
                    compileStatement2.execute();
                    sQLiteDatabase.setTransactionSuccessful();
                    try {
                        synchronized (configChimeraService2.f30432a) {
                            Map map7 = configChimeraService2.f30434c;
                            if (map7 != null) {
                                map7.put(str20, swk2);
                            }
                        }
                    } catch (IllegalStateException e4) {
                        illegalStateException = e4;
                        Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                        if (map == null) {
                        }
                        if (swq.f45318c != null) {
                        }
                        swq.f45322g.mo17951a(swq.f45321f);
                    }
                } finally {
                    compileStatement.close();
                    compileStatement2.close();
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (IllegalStateException e5) {
                        illegalStateException = e5;
                        Log.e("ConfigChimeraService", "Exception while ending the db transaction.", illegalStateException);
                        if (map == null) {
                        }
                        if (swq.f45318c != null) {
                        }
                        swq.f45322g.mo17951a(swq.f45321f);
                    }
                }
            }
            if (map == null) {
                try {
                    if (swq.f45318c != null) {
                        DataHolder b4 = swq.f45322g.mo17958b((Map) null);
                        DataHolder b5 = swq.f45322g.mo17957b(list);
                        swq.f45318c.mo26197a(Status.f30107a, new FetchConfigIpcResponse(6503, b4, b5));
                        if (b4 != null && !b4.mo17768b()) {
                            b4.close();
                        }
                        if (b5 != null) {
                            if (!b5.mo17768b()) {
                                b5.close();
                            }
                        }
                    }
                } catch (RemoteException e6) {
                    String valueOf4 = String.valueOf(e6);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 47);
                    sb2.append("Failed to call callback method for fetchConfig.");
                    sb2.append(valueOf4);
                    Log.e("ConfigChimeraService", sb2.toString());
                }
            }
            if (swq.f45318c != null) {
                DataHolder b6 = swq.f45322g.mo17958b(map);
                DataHolder b7 = swq.f45322g.mo17957b(list);
                swq.f45318c.mo26197a(Status.f30107a, new FetchConfigIpcResponse(6504, b6, b7));
                if (b6 != null && !b6.mo17768b()) {
                    b6.close();
                }
                if (b7 != null && !b7.mo17768b()) {
                    b7.close();
                }
            }
        }
        swq.f45322g.mo17951a(swq.f45321f);
    }
}
