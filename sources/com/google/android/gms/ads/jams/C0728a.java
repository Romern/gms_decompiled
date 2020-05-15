package com.google.android.gms.ads.jams;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.task.C0907a;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.google.android.gms.ads.jams.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0728a implements C0907a {

    /* renamed from: a */
    private final C0730c f9135a;

    public C0728a(C0730c cVar) {
        this.f9135a = cVar;
    }

    /* renamed from: c */
    static void m5913c() {
        aeat a = aeat.m51532a(rpr.m34216b());
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.ads.jams.NegotiationService";
        aebi.mo34004a(0, cbvt.m128578d());
        aebi.f63099k = "jams-negotiation-task";
        aebi.mo34027b(1);
        a.mo33984a(aebi.mo33974b());
        StringBuilder sb = new StringBuilder(62);
        sb.append("[JAMS] Next negotiation to run in 0 seconds");
        C0633h.m5664a(sb.toString());
    }

    /* renamed from: a */
    public final void mo6524a() {
        if (new C0731d(rpr.m34216b()).mo7028c()) {
            m5913c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0328 A[SYNTHETIC, Splitter:B:124:0x0328] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d2  */
    /* renamed from: b */
    public final int mo6525b() {
        LinkedHashMap linkedHashMap;
        String str;
        Context context;
        boolean z;
        Iterator it;
        long j;
        String str2;
        dax dax;
        C0730c cVar;
        bxvd bxvd;
        String str3;
        String str4;
        String str5;
        bxvd da;
        C0729b bVar;
        bqkk bqkk;
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2;
        String str6;
        Exception exc;
        String str7;
        Exception exc2;
        bxvd bxvd2;
        int i;
        C0730c cVar2 = this.f9135a;
        String valueOf = String.valueOf(Calendar.getInstance().getTime());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("[JAMS] Negotiator starts running at ");
        sb.append(valueOf);
        C0633h.m5664a(sb.toString());
        C0729b bVar2 = cVar2.f9140a;
        String str8 = "temporal_cookie_expiration_timestamp";
        int i2 = 1;
        char c = 0;
        if (!bVar2.mo7023b()) {
            if (bVar2.f9138c.f9141a.contains("scheduled_next_negotiation_timestamp")) {
                long j2 = bVar2.f9138c.f9141a.getLong("scheduled_next_negotiation_timestamp", 0) - System.currentTimeMillis();
                if (j2 >= TimeUnit.SECONDS.toMillis(1)) {
                    C0633h.m5664a("[JAMS] Too early to perform negotiation");
                    bVar2.mo7022a(TimeUnit.MILLISECONDS.toSeconds(j2));
                }
            }
            Account[] a = bVar2.f9137b.mo33916a("com.google");
            HashSet<String> hashSet = new HashSet();
            Set<String> a2 = bVar2.f9138c.mo7025a();
            linkedHashMap = new LinkedHashMap();
            for (Account account : a) {
                hashSet.add(account.name);
            }
            for (String str9 : a2) {
                if (!hashSet.contains(str9)) {
                    if (!str9.equals(bVar2.f9138c.f9141a.getString("default_account_name", ""))) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    if (bVar2.f9138c.mo7029d() || i == 3) {
                        linkedHashMap.put(str9, Integer.valueOf(i - 1));
                    }
                    bVar2.f9138c.mo7024a(str9).edit().clear().apply();
                }
            }
            for (String str10 : hashSet) {
                int i3 = a.length > i2 ? !str10.equals(a[c].name) ? 4 : 2 : 1;
                SharedPreferences a3 = bVar2.f9138c.mo7024a(str10);
                if (a3.contains(str8) && a3.getLong(str8, 0) < System.currentTimeMillis()) {
                    bVar2.f9138c.mo7024a(str10).edit().remove("temporal_cookie").remove(str8).apply();
                }
                if (bVar2.f9138c.mo7029d() || i3 != 4) {
                    linkedHashMap.put(str10, Integer.valueOf(i3 - 1));
                }
                i2 = 1;
                c = 0;
            }
            if (a.length > 0) {
                bVar2.f9138c.f9141a.edit().putString("default_account_name", a[0].name).apply();
            } else {
                C0731d dVar = bVar2.f9138c;
                for (String str11 : dVar.mo7025a()) {
                    Context context2 = dVar.f9142b;
                    String valueOf2 = String.valueOf(str11);
                    context2.getSharedPreferences(valueOf2.length() == 0 ? new String("jams.prefs.") : "jams.prefs.".concat(valueOf2), 0).edit().clear().apply();
                }
                dVar.f9141a.edit().clear().apply();
            }
            bVar2.f9138c.f9141a.edit().putStringSet("all_account_names", hashSet).apply();
            if (linkedHashMap != null) {
                return 0;
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            boolean z2 = false;
            long j3 = 0;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str12 = (String) entry.getKey();
                int a4 = bqki.m112948a(((Integer) entry.getValue()).intValue());
                C0729b bVar3 = cVar2.f9140a;
                if (!str12.isEmpty()) {
                    try {
                        str = gie.m13189a(bVar3.f9136a, str12, "oauth2:https://www.googleapis.com/auth/ads_measurement");
                    } catch (Exception e) {
                        String valueOf3 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 34);
                        sb2.append("[JAMS] Failed to get OAuth token: ");
                        sb2.append(valueOf3);
                        C0633h.m5668b(sb2.toString());
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str != null || !cVar2.f9140a.mo7021a().booleanValue()) {
                    C0729b bVar4 = cVar2.f9140a;
                    if (cbvt.m128577c()) {
                        context = rpr.m34216b();
                    } else {
                        context = bVar4.f9136a;
                    }
                    int i4 = dbc.f12730h;
                    dbb.m8110b(context);
                    dbb.m8108a("", context);
                    dbc dbc = new dbc(context, "");
                    if (dbb.m8109a()) {
                        it = it2;
                        z = z2;
                        dbb.f12724c.execute(new dba(context));
                    } else {
                        it = it2;
                        z = z2;
                    }
                    if (!dcc.m8146a() || !((Boolean) C0371o.f8207U.mo6604a()).booleanValue()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        boolean booleanValue = ((Boolean) C0371o.f8198L.mo6604a()).booleanValue();
                        if (!booleanValue) {
                            j = j3;
                            dax = null;
                            str2 = null;
                        } else {
                            if (day.f12720a != null) {
                                j = j3;
                                dax = day.f12720a.f12776l;
                            } else {
                                j = j3;
                                dax = null;
                            }
                            str2 = !((Boolean) C0371o.f8205S.mo6604a()).booleanValue() ? "te" : "be";
                        }
                        try {
                            bxvd a5 = dbc.mo8481a(context);
                            if (!booleanValue) {
                                bxvd2 = a5;
                                cVar = cVar2;
                            } else if (dax != null) {
                                try {
                                    bxvd2 = a5;
                                    cVar = cVar2;
                                    try {
                                        dax.mo8480a(1000, System.currentTimeMillis() - currentTimeMillis, str2);
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    bxvd2 = a5;
                                    cVar = cVar2;
                                    exc2 = e;
                                    bxvd = bxvd2;
                                    dax.mo8479a(1001, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc2);
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    if (bxvd != null) {
                                    }
                                    str5 = Integer.toString(5);
                                    da = bqkj.f140987g.mo74144da();
                                    if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                                    }
                                    if (da.f164950c) {
                                    }
                                    bqkj bqkj = (bqkj) da.f164949b;
                                    str5.getClass();
                                    int i5 = bqkj.f140989a | 2;
                                    bqkj.f140989a = i5;
                                    bqkj.f140991c = str5;
                                    int i6 = a4 - 1;
                                    if (a4 != 0) {
                                    }
                                }
                            } else {
                                bxvd2 = a5;
                                cVar = cVar2;
                            }
                            bxvd = bxvd2;
                        } catch (Exception e4) {
                            cVar = cVar2;
                            exc2 = e4;
                            bxvd = null;
                            if (booleanValue && dax != null) {
                                dax.mo8479a(1001, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc2);
                            }
                            long currentTimeMillis22 = System.currentTimeMillis();
                            if (bxvd != null) {
                            }
                            str5 = Integer.toString(5);
                            da = bqkj.f140987g.mo74144da();
                            if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                            }
                            if (da.f164950c) {
                            }
                            bqkj bqkj2 = (bqkj) da.f164949b;
                            str5.getClass();
                            int i52 = bqkj2.f140989a | 2;
                            bqkj2.f140989a = i52;
                            bqkj2.f140991c = str5;
                            int i62 = a4 - 1;
                            if (a4 != 0) {
                            }
                        }
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (bxvd != null) {
                            try {
                                C0152c cVar3 = (C0152c) bxvd.mo74062i();
                                int i7 = cVar3.f164961ai;
                                str3 = str8;
                                if (i7 == -1) {
                                    try {
                                        i7 = bxxm.f165037a.mo74228a(cVar3).mo74223b(cVar3);
                                        cVar3.f164961ai = i7;
                                    } catch (Exception e5) {
                                        exc = e5;
                                        str4 = "time_to_next_negotiation_mins";
                                    }
                                }
                                if (i7 != 0) {
                                    try {
                                        str5 = dae.m8079a((C0152c) bxvd.mo74062i());
                                        if (!booleanValue) {
                                            str4 = "time_to_next_negotiation_mins";
                                        } else if (dax != null) {
                                            str4 = "time_to_next_negotiation_mins";
                                            try {
                                                dax.mo8480a(1004, System.currentTimeMillis() - currentTimeMillis222, str2);
                                            } catch (Exception e6) {
                                                e = e6;
                                            }
                                        } else {
                                            str4 = "time_to_next_negotiation_mins";
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        str4 = "time_to_next_negotiation_mins";
                                        exc = e;
                                        str5 = Integer.toString(7);
                                        dax.mo8479a(1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, exc);
                                        da = bqkj.f140987g.mo74144da();
                                        if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                                        }
                                        if (da.f164950c) {
                                        }
                                        bqkj bqkj22 = (bqkj) da.f164949b;
                                        str5.getClass();
                                        int i522 = bqkj22.f140989a | 2;
                                        bqkj22.f140989a = i522;
                                        bqkj22.f140991c = str5;
                                        int i622 = a4 - 1;
                                        if (a4 != 0) {
                                        }
                                    }
                                    da = bqkj.f140987g.mo74144da();
                                    if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                                        String string = bVar4.f9138c.mo7024a(str12).getString("temporal_cookie", "");
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bqkj bqkj3 = (bqkj) da.f164949b;
                                        string.getClass();
                                        bqkj3.f140989a |= 1;
                                        bqkj3.f140990b = string;
                                    }
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bqkj bqkj222 = (bqkj) da.f164949b;
                                    str5.getClass();
                                    int i5222 = bqkj222.f140989a | 2;
                                    bqkj222.f140989a = i5222;
                                    bqkj222.f140991c = str5;
                                    int i6222 = a4 - 1;
                                    if (a4 != 0) {
                                        bqkj222.f140994f = i6222;
                                        int i8 = i5222 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        bqkj222.f140989a = i8;
                                        String str13 = a4 != 1 ? "uds-gmscore" : "gmscore";
                                        str13.getClass();
                                        bqkj222.f140989a = i8 | 4;
                                        bqkj222.f140992d = str13;
                                        bxvd da2 = bqkm.f141006h.mo74144da();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bqkm bqkm = (bqkm) da2.f164949b;
                                        "20141203-01".getClass();
                                        bqkm.f141008a |= 1;
                                        bqkm.f141009b = "20141203-01";
                                        if (bVar4.f9138c.f9141a.contains(str4)) {
                                            int i9 = (int) bVar4.f9138c.f9141a.getLong(str4, 0);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bqkm bqkm2 = (bqkm) da2.f164949b;
                                            bqkm2.f141008a |= 2;
                                            bqkm2.f141010c = i9;
                                        }
                                        if (bVar4.f9138c.f9141a.contains("retry_count")) {
                                            int e8 = (int) bVar4.f9138c.mo7030e();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bqkm bqkm3 = (bqkm) da2.f164949b;
                                            bVar = bVar4;
                                            bqkm3.f141008a |= 4;
                                            bqkm3.f141011d = e8;
                                        } else {
                                            bVar = bVar4;
                                        }
                                        if (bVar.f9138c.f9141a.contains("ideal_next_negotiation_timestamp")) {
                                            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(Math.max(0L, System.currentTimeMillis() - bVar.f9138c.f9141a.getLong("ideal_next_negotiation_timestamp", 0)));
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bqkm bqkm4 = (bqkm) da2.f164949b;
                                            bqkm4.f141008a |= 8;
                                            bqkm4.f141012e = minutes;
                                        }
                                        int b = stu.m36316b();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bqkm bqkm5 = (bqkm) da2.f164949b;
                                        bqkm5.f141008a |= 32;
                                        bqkm5.f141013f = b;
                                        bxvd da3 = bqkl.f141000e.mo74144da();
                                        long b2 = cbvt.m128576b();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bqkl bqkl = (bqkl) da3.f164949b;
                                        bqkl.f141002a |= 1;
                                        bqkl.f141003b = b2;
                                        boolean c2 = cbvt.m128577c();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bqkl bqkl2 = (bqkl) da3.f164949b;
                                        bqkl2.f141002a |= 2;
                                        bqkl2.f141004c = c2;
                                        long e9 = cbvt.m128579e();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bqkl bqkl3 = (bqkl) da3.f164949b;
                                        bqkl3.f141002a |= 4;
                                        bqkl3.f141005d = e9;
                                        bqkl bqkl4 = (bqkl) da3.mo74062i();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bqkm bqkm6 = (bqkm) da2.f164949b;
                                        bqkl4.getClass();
                                        bqkm6.f141014g = bqkl4;
                                        bqkm6.f141008a |= 64;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bqkj bqkj4 = (bqkj) da.f164949b;
                                        bqkm bqkm7 = (bqkm) da2.mo74062i();
                                        bqkm7.getClass();
                                        bqkj4.f140993e = bqkm7;
                                        bqkj4.f140989a |= 32;
                                        bqkj bqkj5 = (bqkj) da.mo74062i();
                                        C0730c cVar4 = cVar;
                                        C0729b bVar5 = cVar4.f9140a;
                                        shr.m35316b(260);
                                        try {
                                            byte[] k = bqkj5.mo73642k();
                                            if (!bVar5.mo7021a().booleanValue()) {
                                                str6 = "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit?key=AIzaSyAF4QL5fUEwz9gUpsIySsmqqr9pVow3MuU";
                                            } else {
                                                str6 = "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit";
                                            }
                                            httpsURLConnection = (HttpsURLConnection) stp.m36306a(new URL(str6), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                            try {
                                                httpsURLConnection.setConnectTimeout((int) cbvt.f178377a.mo6606a().mo75458d());
                                                httpsURLConnection.setReadTimeout((int) cbvt.f178377a.mo6606a().mo75459e());
                                                httpsURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                                                httpsURLConnection.setRequestProperty("Content-type", "application/x-protobuf");
                                                int length = k.length;
                                                httpsURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                                                if (str != null) {
                                                    httpsURLConnection.setRequestProperty("Authorization", str.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str));
                                                }
                                                httpsURLConnection.setDoInput(true);
                                                httpsURLConnection.setDoOutput(true);
                                                int i10 = bqkj5.f164961ai;
                                                if (i10 == -1) {
                                                    i10 = bxxm.f165037a.mo74228a(bqkj5).mo74223b(bqkj5);
                                                    bqkj5.f164961ai = i10;
                                                }
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
                                                byteArrayOutputStream.write(k, 0, length);
                                                byteArrayOutputStream.writeTo(httpsURLConnection.getOutputStream());
                                                byteArrayOutputStream.close();
                                                if (httpsURLConnection.getResponseCode() != 200) {
                                                    stp.m36307a(httpsURLConnection);
                                                    shr.m35312a();
                                                    bqkk = null;
                                                    if (bqkk == null) {
                                                        C0729b bVar6 = cVar4.f9140a;
                                                        if ((bqkk.f140997a & 1) == 0 || ((bVar6.f9138c.mo7027b() != 0 && bqkk.f140998b.isEmpty()) || bqkk.f140999c < cbvt.f178377a.mo6606a().mo75463i() || bqkk.f140999c > cbvt.f178377a.mo6606a().mo75462h())) {
                                                            C0633h.m5672d("[JAMS] Got an invalid response");
                                                            cVar2 = cVar4;
                                                            str8 = str3;
                                                            j3 = j;
                                                            it2 = it;
                                                            z2 = true;
                                                        } else {
                                                            cVar4.f9140a.f9138c.mo7024a(str12).edit().putString("temporal_cookie", bqkk.f140998b).putLong(str3, System.currentTimeMillis() + cbvt.m128579e()).apply();
                                                            j3 = Math.max(bqkk.f140999c, j);
                                                            cVar2 = cVar4;
                                                            str8 = str3;
                                                            it2 = it;
                                                            z2 = z;
                                                        }
                                                    } else {
                                                        C0633h.m5672d("[JAMS] Failed to negotiate");
                                                        cVar2 = cVar4;
                                                        str8 = str3;
                                                        j3 = j;
                                                        it2 = it;
                                                        z2 = true;
                                                    }
                                                } else {
                                                    bqkk = (bqkk) bxvk.m124011a(bqkk.f140995d, httpsURLConnection.getInputStream(), bxus.m123744c());
                                                    stp.m36307a(httpsURLConnection);
                                                    shr.m35312a();
                                                    if (bqkk == null) {
                                                    }
                                                }
                                            } catch (Exception e10) {
                                            } catch (Throwable th) {
                                                th = th;
                                                httpsURLConnection2 = httpsURLConnection;
                                                stp.m36307a(httpsURLConnection2);
                                                shr.m35312a();
                                                throw th;
                                            }
                                        } catch (Exception e11) {
                                            httpsURLConnection = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            httpsURLConnection2 = null;
                                            stp.m36307a(httpsURLConnection2);
                                            shr.m35312a();
                                            throw th;
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    str7 = "time_to_next_negotiation_mins";
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str4 = "time_to_next_negotiation_mins";
                                str3 = str8;
                                exc = e;
                                str5 = Integer.toString(7);
                                if (booleanValue && dax != null) {
                                    dax.mo8479a(1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, exc);
                                }
                                da = bqkj.f140987g.mo74144da();
                                if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                                }
                                if (da.f164950c) {
                                }
                                bqkj bqkj2222 = (bqkj) da.f164949b;
                                str5.getClass();
                                int i52222 = bqkj2222.f140989a | 2;
                                bqkj2222.f140989a = i52222;
                                bqkj2222.f140991c = str5;
                                int i62222 = a4 - 1;
                                if (a4 != 0) {
                                }
                            }
                        } else {
                            str7 = "time_to_next_negotiation_mins";
                            str3 = str8;
                        }
                        try {
                            str5 = Integer.toString(5);
                        } catch (Exception e13) {
                            exc = e13;
                            str5 = Integer.toString(7);
                            dax.mo8479a(1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, exc);
                            da = bqkj.f140987g.mo74144da();
                            if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                            }
                            if (da.f164950c) {
                            }
                            bqkj bqkj22222 = (bqkj) da.f164949b;
                            str5.getClass();
                            int i522222 = bqkj22222.f140989a | 2;
                            bqkj22222.f140989a = i522222;
                            bqkj22222.f140991c = str5;
                            int i622222 = a4 - 1;
                            if (a4 != 0) {
                            }
                        }
                        da = bqkj.f140987g.mo74144da();
                        if (bVar4.f9138c.mo7024a(str12).contains("temporal_cookie")) {
                        }
                        if (da.f164950c) {
                        }
                        bqkj bqkj222222 = (bqkj) da.f164949b;
                        str5.getClass();
                        int i5222222 = bqkj222222.f140989a | 2;
                        bqkj222222.f140989a = i5222222;
                        bqkj222222.f140991c = str5;
                        int i6222222 = a4 - 1;
                        if (a4 != 0) {
                        }
                    } else {
                        throw new IllegalStateException("The caller must not be called from the UI thread.");
                    }
                } else {
                    z2 = true;
                }
            }
            C0730c cVar5 = cVar2;
            String str14 = "time_to_next_negotiation_mins";
            long j4 = j3;
            if (!z2) {
                C0729b bVar7 = cVar5.f9140a;
                if (bVar7.mo7023b()) {
                    C0633h.m5664a("[JAMS] Drop negotiation response");
                    return 0;
                }
                bVar7.f9138c.f9141a.edit().putLong(str14, j4).apply();
                bVar7.f9138c.mo7026a(0);
                bVar7.f9138c.f9141a.edit().putLong("ideal_next_negotiation_timestamp", System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(j4)).apply();
                bVar7.mo7022a(TimeUnit.MINUTES.toSeconds(Math.max(cbvt.m128576b(), j4)));
                return 0;
            }
            C0729b bVar8 = cVar5.f9140a;
            if (bVar8.mo7023b()) {
                C0633h.m5664a("[JAMS] Ignore negotiation failure");
                return 0;
            }
            long a6 = cbvt.f178377a.mo6606a().mo75455a();
            long g = cbvt.f178377a.mo6606a().mo75461g();
            long e14 = bVar8.f9138c.mo7030e();
            double pow = Math.pow(2.0d, (double) Math.max(0L, Math.min(e14, 20L)));
            double d = (double) a6;
            Double.isNaN(d);
            double min = Math.min(d * pow, (double) g);
            C0633h.m5664a("[JAMS] Scheduling retry...");
            bVar8.mo7022a(TimeUnit.MINUTES.toSeconds((long) min));
            bVar8.f9138c.mo7026a(e14 + 1);
            return 0;
        }
        linkedHashMap = null;
        if (linkedHashMap != null) {
        }
    }
}
