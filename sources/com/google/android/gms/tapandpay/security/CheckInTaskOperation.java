package com.google.android.gms.tapandpay.security;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckInTaskOperation implements aspm {

    /* renamed from: a */
    public static final srn f108654a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final AtomicBoolean f108655b = new AtomicBoolean(false);

    /* renamed from: a */
    private final void m93101a(askf askf, bxvd bxvd) {
        int i;
        int i2;
        if (cgwn.f187872a.mo6606a().mo84603R()) {
            try {
                rjx a = apfp.m70157a(askf.f89126d);
                boolean h = ((rkj) aucu.m76783a(a.mo24766t(), 10, TimeUnit.SECONDS)).mo24814h();
                if (h) {
                    i = ((rkj) aucu.m76783a(a.mo24767u(), 10, TimeUnit.SECONDS)).mo24813g().size();
                } else {
                    i = 0;
                }
                bxvd da = bpal.f135491d.mo74144da();
                if (!h) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpal bpal = (bpal) da.f164949b;
                bpal.f135494b = i2 - 1;
                int i3 = bpal.f135493a | 1;
                bpal.f135493a = i3;
                bpal.f135493a = i3 | 2;
                bpal.f135495c = i;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpbx bpbx = (bpbx) bxvd.f164949b;
                bpal bpal2 = (bpal) da.mo74062i();
                bpbx bpbx2 = bpbx.f135635S;
                bpal2.getClass();
                bpbx.f135651O = bpal2;
                bpbx.f135656b |= 4096;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                bxvd da2 = bpal.f135491d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpal bpal3 = (bpal) da2.f164949b;
                bpal3.f135494b = 0;
                bpal3.f135493a |= 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpbx bpbx3 = (bpbx) bxvd.f164949b;
                bpal bpal4 = (bpal) da2.mo74062i();
                bpbx bpbx4 = bpbx.f135635S;
                bpal4.getClass();
                bpbx3.f135651O = bpal4;
                bpbx3.f135656b |= 4096;
                bnsl bnsl = (bnsl) f108654a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.tapandpay.security.CheckInTaskOperation", "a", 326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Could not get Play Protect Status");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0618 A[SYNTHETIC, Splitter:B:262:0x0618] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ee  */
    /* renamed from: a */
    private final boolean m93102a(athh athh, Context context) {
        Cursor rawQuery;
        Throwable th;
        Cursor rawQuery2;
        Throwable th2;
        Context context2;
        List d;
        int i;
        int i2;
        CardEmulation f;
        int i3;
        atkm atkm;
        String str;
        boolean z;
        Context context3;
        boolean z2;
        Context context4;
        Context context5;
        String str2;
        int a;
        Iterator it;
        bnsl bnsl;
        Context context6 = context;
        String str3 = "purgeOrphanedAccounts";
        String str4 = "orphaned_account_counts";
        srn srn = asis.f89055a;
        try {
            atkm atkm2 = new atkm(context6);
            HashMap hashMap = new HashMap();
            String string = atkm2.f90420c.getString(str4, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        hashMap.put(jSONObject.getString("account_id_or_name"), Integer.valueOf(jSONObject.getInt("count")));
                    }
                } catch (JSONException e) {
                    bnsl bnsl2 = (bnsl) atkm.f90418a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("atkm", "i", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Unexpected error parsing orphaned accounts JSON");
                    hashMap = new HashMap();
                }
            }
            asko a2 = asko.m74292a(context);
            SQLiteDatabase a3 = a2.mo49214a();
            try {
                HashSet hashSet = new HashSet();
                int i5 = 2;
                String[] strArr = {"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                int i6 = 0;
                for (int i7 = 10; i6 < i7; i7 = 10) {
                    String str5 = str3;
                    String str6 = str4;
                    atkm atkm3 = atkm2;
                    Context context7 = context6;
                    String valueOf = String.valueOf(strArr[i6]);
                    rawQuery = a3.rawQuery(valueOf.length() == 0 ? new String("SELECT DISTINCT account_id FROM ") : "SELECT DISTINCT account_id FROM ".concat(valueOf), null);
                    while (rawQuery.moveToNext()) {
                        hashSet.add(rawQuery.getString(0));
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    i6++;
                    context6 = context7;
                    str4 = str6;
                    str3 = str5;
                    atkm2 = atkm3;
                    i5 = 2;
                }
                try {
                    HashSet hashSet2 = new HashSet();
                    String[] strArr2 = new String[i5];
                    strArr2[0] = "TapInfos";
                    strArr2[1] = "DoodleRenderedInfos";
                    int i8 = 0;
                    while (i8 < i5) {
                        String str7 = str3;
                        String str8 = str4;
                        atkm atkm4 = atkm2;
                        Context context8 = context6;
                        String valueOf2 = String.valueOf(strArr2[i8]);
                        rawQuery2 = a3.rawQuery(valueOf2.length() == 0 ? new String("SELECT DISTINCT account_name FROM ") : "SELECT DISTINCT account_name FROM ".concat(valueOf2), null);
                        while (rawQuery2.moveToNext()) {
                            hashSet2.add(rawQuery2.getString(0));
                        }
                        if (rawQuery2 != null) {
                            rawQuery2.close();
                        }
                        i8++;
                        context6 = context8;
                        str4 = str8;
                        str3 = str7;
                        atkm2 = atkm4;
                        i5 = 2;
                    }
                    if (hashSet.isEmpty()) {
                        if (hashSet2.isEmpty()) {
                            context2 = context6;
                            String b = askc.m74272b();
                            d = asix.m74203d(context2, b);
                            if (!d.isEmpty()) {
                                if (asit.m74179a(asjm.m74238a(context), context2, b, asko.m74292a(context).mo49214a())) {
                                    try {
                                        try {
                                            btiw a4 = athh.mo49987a(askg.m74277a(context));
                                            btnn a5 = asiy.m74204a(context);
                                            int size = d.size();
                                            CountDownLatch countDownLatch = new CountDownLatch(size + size);
                                            bqgj a6 = snp.m35702a(10);
                                            askt askt = new askt();
                                            int size2 = d.size();
                                            int i9 = 0;
                                            while (i9 < size2) {
                                                askf askf = new askf((AccountInfo) d.get(i9), b, context2);
                                                bxvd da = btot.f149799d.mo74144da();
                                                String str9 = a4.f149047b;
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                btot btot = (btot) da.f164949b;
                                                str9.getClass();
                                                btot.f149801a = str9;
                                                a4.getClass();
                                                btot.f149802b = a4;
                                                if (!cgwn.m147253c() || asiv.m74194d(askf)) {
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    a5.getClass();
                                                    ((btot) da.f164949b).f149803c = a5;
                                                }
                                                atff.m75765a(askf, "t/security/checkin", da.mo74062i(), btou.f149804a, new athf(askf, a6, askt, countDownLatch), null);
                                                snp.m35702a(10).execute(new athg(new athq(), countDownLatch, a4, askf));
                                                atds a7 = atds.m75666a(askf);
                                                atam atam = new atam(askf);
                                                btnn a8 = asiy.m74204a(askf.f89126d);
                                                CardInfo b2 = a7.mo49852b();
                                                String str10 = b;
                                                bxvd b3 = atam.mo49753b(28, b2);
                                                int i10 = b2 != null ? 2 : 1;
                                                btnn btnn = a5;
                                                m93101a(askf, b3);
                                                Context context9 = askf.f89126d;
                                                List list = d;
                                                bxvd da2 = boye.f135302m.mo74144da();
                                                btiw btiw = a4;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye = (boye) da2.f164949b;
                                                boye.f135305b = i10 - 1;
                                                boye.f135304a |= 1;
                                                int i11 = context9.getPackageManager().resolveActivity(new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY"), 0) != null ? 2 : 3;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye2 = (boye) da2.f164949b;
                                                boye2.f135308e = i11 - 1;
                                                int i12 = boye2.f135304a | 8;
                                                boye2.f135304a = i12;
                                                btnm btnm = a8.f149665e;
                                                if (btnm != null) {
                                                    String str11 = btnm.f149656c;
                                                    str11.getClass();
                                                    boye2.f135304a = i12 | 16;
                                                    boye2.f135309f = str11;
                                                }
                                                btng btng = a8.f149661a;
                                                if (btng != null) {
                                                    int a9 = btne.m116947a(btng.f149617i);
                                                    if (a9 != 0) {
                                                        if (a9 == 3) {
                                                            i3 = 2;
                                                            if (da2.f164950c) {
                                                                da2.mo74035c();
                                                                da2.f164950c = false;
                                                            }
                                                            boye boye3 = (boye) da2.f164949b;
                                                            boye3.f135311h = i3 - 1;
                                                            boye3.f135304a |= 64;
                                                        }
                                                    }
                                                    btng btng2 = a8.f149661a;
                                                    if (btng2 == null) {
                                                        btng2 = btng.f149607j;
                                                    }
                                                    int a10 = btne.m116947a(btng2.f149617i);
                                                    i3 = a10 == 0 ? 1 : a10 != 4 ? 1 : 3;
                                                    if (da2.f164950c) {
                                                    }
                                                    boye boye32 = (boye) da2.f164949b;
                                                    boye32.f135311h = i3 - 1;
                                                    boye32.f135304a |= 64;
                                                }
                                                int i13 = Build.VERSION.SDK_INT;
                                                int i14 = !((Boolean) ((bmyg) bmxv.m108566b(Boolean.valueOf(context9.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")))).f131198a).booleanValue() ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye4 = (boye) da2.f164949b;
                                                boye4.f135315l = i14 - 1;
                                                boye4.f135304a |= 1024;
                                                int i15 = !asjk.m74228b(context9) ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye5 = (boye) da2.f164949b;
                                                boye5.f135310g = i15 - 1;
                                                boye5.f135304a |= 32;
                                                int i16 = !atxx.m76529b(context9) ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye6 = (boye) da2.f164949b;
                                                boye6.f135306c = i16 - 1;
                                                boye6.f135304a |= 2;
                                                if (!asjw.m74256a(context9) || spn.m35859a()) {
                                                    i = 3;
                                                } else {
                                                    i = NfcAdapter.getDefaultAdapter(context9) == null ? 3 : 2;
                                                }
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye7 = (boye) da2.f164949b;
                                                boye7.f135313j = i - 1;
                                                boye7.f135304a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                int i17 = !C1178ly.m19617a(context9).mo15435b() ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye8 = (boye) da2.f164949b;
                                                boye8.f135312i = i17 - 1;
                                                boye8.f135304a |= 128;
                                                int g = atxx.m76534g(context9);
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye9 = (boye) da2.f164949b;
                                                boye9.f135307d = g - 1;
                                                boye9.f135304a |= 4;
                                                if (!asjw.m74256a(context9) || spn.m35859a() || (f = atxx.m76533f(context9)) == null) {
                                                    i2 = 3;
                                                } else {
                                                    i2 = !f.supportsAidPrefixRegistration() ? 3 : 2;
                                                }
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye10 = (boye) da2.f164949b;
                                                boye10.f135314k = i2 - 1;
                                                boye10.f135304a |= 512;
                                                if (b3.f164950c) {
                                                    b3.mo74035c();
                                                    b3.f164950c = false;
                                                }
                                                bpbx bpbx = (bpbx) b3.f164949b;
                                                boye boye11 = (boye) da2.mo74062i();
                                                bpbx bpbx2 = bpbx.f135635S;
                                                boye11.getClass();
                                                bpbx.f135669o = boye11;
                                                bpbx.f135655a |= 4096;
                                                bxvd da3 = bozb.f135362e.mo74144da();
                                                int i18 = !sey.m35126a(context9).mo25460a() ? 3 : 2;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bozb bozb = (bozb) da3.f164949b;
                                                bozb.f135365b = i18 - 1;
                                                bozb.f135364a |= 1;
                                                int g2 = new asqc(context9).mo49364g();
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bozb bozb2 = (bozb) da3.f164949b;
                                                int i19 = g2 - 1;
                                                if (g2 != 0) {
                                                    bozb2.f135366c = i19;
                                                    bozb2.f135364a |= 2;
                                                    int i20 = !alfj.m60866b(context9) ? 2 : 3;
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bozb bozb3 = (bozb) da3.f164949b;
                                                    bozb3.f135367d = i20 - 1;
                                                    bozb3.f135364a |= 4;
                                                    if (b3.f164950c) {
                                                        b3.mo74035c();
                                                        b3.f164950c = false;
                                                    }
                                                    bpbx bpbx3 = (bpbx) b3.f164949b;
                                                    bozb bozb4 = (bozb) da3.mo74062i();
                                                    bozb4.getClass();
                                                    bpbx3.f135678x = bozb4;
                                                    bpbx3.f135655a |= 16777216;
                                                    atam.mo49741a((bpbx) b3.mo74062i());
                                                    i9++;
                                                    a5 = btnn;
                                                    b = str10;
                                                    a4 = btiw;
                                                    d = list;
                                                } else {
                                                    throw null;
                                                }
                                            }
                                            try {
                                                countDownLatch.await(170, TimeUnit.SECONDS);
                                            } catch (InterruptedException e2) {
                                                bnsl bnsl3 = (bnsl) f108654a.mo68387b();
                                                bnsl3.mo68437a(e2);
                                                bnsl3.mo68432a("com.google.android.gms.tapandpay.security.CheckInTaskOperation", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl3.mo68405a("InterruptedException");
                                            }
                                            return true;
                                        } catch (atfh | IOException e3) {
                                            return false;
                                        }
                                    } catch (RuntimeException e4) {
                                        return true;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                    HashSet hashSet3 = new HashSet();
                    HashSet hashSet4 = new HashSet();
                    Account[] a11 = adyd.m51363a(context).mo33916a("com.google");
                    int length = a11.length;
                    Account[] accountArr = a11;
                    int i21 = 0;
                    while (i21 < length) {
                        String str12 = str;
                        atkm atkm5 = atkm;
                        Account account = accountArr[i21];
                        String str13 = str3;
                        String b4 = asjg.m74215b(context, account.name);
                        if (!TextUtils.isEmpty(b4)) {
                            hashSet3.add(b4);
                            hashMap.remove(b4);
                            hashSet4.add(account.name);
                            hashMap.remove(account.name);
                        }
                        i21++;
                        str4 = str12;
                        str3 = str13;
                        atkm2 = atkm5;
                    }
                    HashSet hashSet5 = new HashSet(hashSet);
                    hashSet5.removeAll(hashSet3);
                    HashSet hashSet6 = new HashSet(hashSet2);
                    hashSet6.removeAll(hashSet4);
                    if (!hashSet5.isEmpty() || !hashSet6.isEmpty()) {
                        try {
                            Iterator it2 = hashSet5.iterator();
                            boolean z3 = false;
                            while (it2.hasNext()) {
                                try {
                                    str2 = (String) it2.next();
                                    a = asis.m74177a(hashMap, str2) + 1;
                                    it = it2;
                                    bnsl = (bnsl) asis.f89055a.mo68388c();
                                    z2 = z3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z2 = z3;
                                    context4 = context;
                                    z = z2;
                                    if (z) {
                                    }
                                    throw th;
                                }
                                try {
                                    bnsl.mo68432a("asis", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68409a("Found orphaned account id, count: %d", a);
                                    hashMap.put(str2, Integer.valueOf(a));
                                    if (a >= 2) {
                                        try {
                                            bnsl bnsl4 = (bnsl) asis.f89055a.mo68388c();
                                            bnsl4.mo68432a("asis", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("Purging orphaned account by id");
                                            a2.mo49215a(str2, (String) null, a3);
                                            hashMap.remove(str2);
                                            it2 = it;
                                            z3 = true;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            context3 = context;
                                            z = true;
                                            if (z) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        z3 = z2;
                                        it2 = it;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    context4 = context;
                                    z = z2;
                                    if (z) {
                                    }
                                    throw th;
                                }
                                try {
                                } catch (Throwable th6) {
                                    th = th6;
                                    context4 = context;
                                    z2 = z3;
                                    z = z2;
                                    if (z) {
                                    }
                                    throw th;
                                }
                            }
                            z2 = z3;
                            Iterator it3 = hashSet6.iterator();
                            boolean z4 = z2;
                            while (it3.hasNext()) {
                                try {
                                    context3 = context;
                                    String str14 = str;
                                    String str15 = (String) it3.next();
                                    int a12 = asis.m74177a(hashMap, str15) + 1;
                                    Iterator it4 = it3;
                                    bnsl bnsl5 = (bnsl) asis.f89055a.mo68388c();
                                    atkm atkm6 = atkm;
                                    bnsl5.mo68432a("asis", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68409a("Found orphaned account by name, count: %d", a12);
                                    hashMap.put(str15, Integer.valueOf(a12));
                                    if (a12 >= 2) {
                                        try {
                                            bnsl bnsl6 = (bnsl) asis.f89055a.mo68388c();
                                            bnsl6.mo68432a("asis", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl6.mo68405a("Purging orphaned account by name");
                                            a2.mo49215a((String) null, str15, a3);
                                            hashMap.remove(str15);
                                            str = str14;
                                            it3 = it4;
                                            atkm = atkm6;
                                            z4 = true;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z = true;
                                            if (z) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        str = str14;
                                        it3 = it4;
                                        atkm = atkm6;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    context5 = context;
                                    z = z4;
                                    if (z) {
                                        asuc.getInstance().mo49500a(context3, str3);
                                        asiv.m74182a(context);
                                    }
                                    throw th;
                                }
                            }
                            SharedPreferences.Editor edit = atkm.f90420c.edit();
                            JSONArray jSONArray2 = new JSONArray();
                            try {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("account_id_or_name", entry.getKey());
                                    jSONObject2.put("count", entry.getValue());
                                    jSONArray2.put(jSONObject2);
                                }
                                edit.putString(str, jSONArray2.toString()).apply();
                                if (z4) {
                                    context2 = context;
                                    asuc.getInstance().mo49500a(context2, str3);
                                    asiv.m74182a(context);
                                } else {
                                    context2 = context;
                                }
                                String b5 = askc.m74272b();
                                d = asix.m74203d(context2, b5);
                                if (!d.isEmpty()) {
                                }
                                return true;
                            } catch (JSONException e5) {
                                context5 = context;
                                throw new RuntimeException(e5);
                            } catch (Throwable th9) {
                                th = th9;
                                z = z4;
                                if (z) {
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            context3 = context;
                            z = false;
                            if (z) {
                            }
                            throw th;
                        }
                    } else {
                        context2 = context;
                        String b52 = askc.m74272b();
                        d = asix.m74203d(context2, b52);
                        if (!d.isEmpty()) {
                        }
                        return true;
                    }
                } catch (SQLiteException e6) {
                    throw new asks(e6);
                } catch (Throwable th11) {
                    bqye.m113761a(th2, th11);
                }
                throw th;
                throw th2;
            } catch (SQLiteException e7) {
                throw new asks(e7);
            } catch (Throwable th12) {
                bqye.m113761a(th, th12);
            }
        } catch (SQLiteException e8) {
            throw new asks(e8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ca, code lost:
        if (p000.asiv.m74194d(r12) != false) goto L_0x02cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c2 A[Catch:{ asks -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03c3 A[Catch:{ asks -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0613 A[Catch:{ all -> 0x069f }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06c8 A[SYNTHETIC, Splitter:B:310:0x06c8] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06d3 A[Catch:{ SQLiteException -> 0x081f }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2 A[EDGE_INSN: B:36:0x00f2->B:37:? ?: BREAK  , SYNTHETIC, Splitter:B:36:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110 A[EDGE_INSN: B:41:0x0110->B:42:? ?: BREAK  , SYNTHETIC, Splitter:B:41:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0117 A[Catch:{ SQLiteException -> 0x0825 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0155 A[SYNTHETIC, Splitter:B:52:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a A[SYNTHETIC, Splitter:B:62:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed A[SYNTHETIC, Splitter:B:84:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0235 A[SYNTHETIC, Splitter:B:93:0x0235] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0254 A[Catch:{ asks -> 0x0821 }] */
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        String str;
        asks asks;
        SQLiteException sQLiteException;
        athh athh;
        String str2;
        asko a;
        String str3;
        HashSet hashSet;
        String str4;
        String[] strArr;
        int i;
        String[] strArr2;
        String str5;
        String str6;
        asko asko;
        String str7;
        String str8;
        athh athh2;
        Context context2;
        String str9;
        String str10;
        Cursor rawQuery;
        Throwable th;
        String str11;
        HashSet hashSet2;
        String str12;
        String[] strArr3;
        int i2;
        String str13;
        String str14;
        asko asko2;
        String str15;
        String str16;
        athh athh3;
        String str17;
        String str18;
        Cursor rawQuery2;
        Throwable th2;
        Context context3;
        List d;
        int i3;
        int i4;
        int i5;
        CardEmulation f;
        int i6;
        int length;
        int i7;
        String str19;
        String str20;
        String str21;
        String str22;
        HashSet hashSet3;
        String str23;
        boolean z;
        Context context4;
        Throwable th3;
        Iterator it;
        boolean z2;
        boolean z3;
        Context context5;
        String str24;
        String str25;
        Throwable th4;
        Iterator it2;
        boolean z4;
        String str26;
        String str27;
        Context context6;
        Throwable th5;
        JSONException jSONException;
        athh athh4;
        Context context7 = context;
        String str28 = "purgeOrphanedAccounts";
        String str29 = "orphaned_account_counts";
        if (!f108655b.compareAndSet(false, true)) {
            return 1;
        }
        try {
            athh athh5 = new athh();
            srn srn = asis.f89055a;
            try {
                atkm atkm = new atkm(context7);
                HashMap hashMap = new HashMap();
                String string = atkm.f90420c.getString(str29, null);
                String str30 = "count";
                String str31 = "account_id_or_name";
                if (!TextUtils.isEmpty(string)) {
                    str2 = "com.google.android.gms.tapandpay.security.CheckInTaskOperation";
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        int i8 = 0;
                        while (true) {
                            athh = athh5;
                            try {
                                if (i8 < jSONArray.length()) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i8);
                                    JSONArray jSONArray2 = jSONArray;
                                    hashMap.put(jSONObject.getString(str31), Integer.valueOf(jSONObject.getInt(str30)));
                                    i8++;
                                    athh5 = athh;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException e) {
                                e = e;
                                JSONException jSONException2 = e;
                                try {
                                    bnsl bnsl = (bnsl) atkm.f90418a.mo68387b();
                                    bnsl.mo68437a(jSONException2);
                                    bnsl.mo68432a("atkm", "i", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Unexpected error parsing orphaned accounts JSON");
                                    hashMap = new HashMap();
                                    a = asko.m74292a(context);
                                    SQLiteDatabase a2 = a.mo49214a();
                                    hashSet = new HashSet();
                                    str4 = "SELECT DISTINCT account_id FROM ";
                                    strArr = new String[]{"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                                    i = 0;
                                    while (true) {
                                        strArr2 = strArr;
                                        if (i < 10) {
                                        }
                                        i++;
                                        str4 = str9;
                                        str2 = str3;
                                        context7 = context2;
                                        str29 = str6;
                                        strArr = strArr2;
                                        str31 = str7;
                                        str30 = str8;
                                        str28 = str5;
                                        a = asko;
                                        athh = athh2;
                                    }
                                    hashSet2 = new HashSet();
                                    str12 = "SELECT DISTINCT account_name FROM ";
                                    strArr3 = new String[]{"TapInfos", "DoodleRenderedInfos"};
                                    i2 = 0;
                                    while (true) {
                                        String[] strArr4 = strArr3;
                                        if (i2 < 2) {
                                        }
                                        i2++;
                                        str2 = str11;
                                        str12 = str17;
                                        str29 = str14;
                                        strArr3 = r25;
                                        str31 = str15;
                                        str30 = str16;
                                        str28 = str13;
                                        a = asko2;
                                        athh = athh3;
                                    }
                                    if (hashSet.isEmpty()) {
                                    }
                                    HashSet hashSet4 = new HashSet();
                                    HashSet hashSet5 = new HashSet();
                                    String str32 = str28;
                                    String str33 = str29;
                                    Account[] a3 = adyd.m51363a(context).mo33916a("com.google");
                                    length = a3.length;
                                    Account[] accountArr = a3;
                                    i7 = 0;
                                    while (i7 < length) {
                                    }
                                    hashSet3 = new HashSet(hashSet);
                                    hashSet3.removeAll(hashSet4);
                                    HashSet hashSet6 = new HashSet(hashSet2);
                                    hashSet6.removeAll(hashSet5);
                                    if (hashSet3.isEmpty()) {
                                    }
                                    try {
                                        it = hashSet3.iterator();
                                        z2 = false;
                                        while (it.hasNext()) {
                                            try {
                                            } catch (Throwable th6) {
                                                context5 = context;
                                                z3 = z2;
                                                str24 = str2;
                                                str25 = str20;
                                                th4 = th6;
                                                z = z3;
                                                if (z) {
                                                }
                                                throw th3;
                                            }
                                        }
                                        it2 = hashSet6.iterator();
                                        while (it2.hasNext()) {
                                            try {
                                            } catch (Throwable th7) {
                                                th = th7;
                                                context6 = context;
                                                str26 = str20;
                                                z4 = z2;
                                                str27 = str2;
                                                th5 = th;
                                                z = z4;
                                                if (z) {
                                                    try {
                                                        asuc.getInstance().mo49500a(context4, str23);
                                                        asiv.m74182a(context);
                                                    } catch (SQLiteException e2) {
                                                        e = e2;
                                                        sQLiteException = e;
                                                        throw new asks(sQLiteException);
                                                    }
                                                }
                                                throw th3;
                                            }
                                        }
                                        SharedPreferences.Editor edit = atkm.f90420c.edit();
                                        JSONArray jSONArray3 = new JSONArray();
                                        try {
                                            while (r4.hasNext()) {
                                            }
                                            edit.putString(str19, jSONArray3.toString()).apply();
                                            if (!z2) {
                                            }
                                            String b = askc.m74272b();
                                            d = asix.m74203d(context3, b);
                                            if (!d.isEmpty()) {
                                            }
                                            i3 = 1;
                                            f108655b.set(false);
                                            return i3 ^ 1;
                                        } catch (JSONException e3) {
                                            context6 = context;
                                            str26 = str20;
                                            z4 = z2;
                                            str27 = str2;
                                            jSONException = e3;
                                            try {
                                                throw new RuntimeException(jSONException);
                                            } catch (Throwable th8) {
                                                th = th8;
                                                th5 = th;
                                                z = z4;
                                                if (z) {
                                                }
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        context4 = context;
                                        str = str2;
                                        str23 = str20;
                                        th3 = th9;
                                        z = false;
                                        if (z) {
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e4) {
                                    sQLiteException = e4;
                                    str = str2;
                                }
                            }
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        athh = athh5;
                        JSONException jSONException22 = e;
                        bnsl bnsl2 = (bnsl) atkm.f90418a.mo68387b();
                        bnsl2.mo68437a(jSONException22);
                        bnsl2.mo68432a("atkm", "i", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Unexpected error parsing orphaned accounts JSON");
                        hashMap = new HashMap();
                        a = asko.m74292a(context);
                        SQLiteDatabase a22 = a.mo49214a();
                        hashSet = new HashSet();
                        str4 = "SELECT DISTINCT account_id FROM ";
                        strArr = new String[]{"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                        i = 0;
                        while (true) {
                            strArr2 = strArr;
                            if (i < 10) {
                            }
                            i++;
                            str4 = str9;
                            str2 = str3;
                            context7 = context2;
                            str29 = str6;
                            strArr = strArr2;
                            str31 = str7;
                            str30 = str8;
                            str28 = str5;
                            a = asko;
                            athh = athh2;
                        }
                        hashSet2 = new HashSet();
                        str12 = "SELECT DISTINCT account_name FROM ";
                        strArr3 = new String[]{"TapInfos", "DoodleRenderedInfos"};
                        i2 = 0;
                        while (true) {
                            String[] strArr42 = strArr3;
                            if (i2 < 2) {
                            }
                            i2++;
                            str2 = str11;
                            str12 = str17;
                            str29 = str14;
                            strArr3 = r25;
                            str31 = str15;
                            str30 = str16;
                            str28 = str13;
                            a = asko2;
                            athh = athh3;
                        }
                        if (hashSet.isEmpty()) {
                        }
                        HashSet hashSet42 = new HashSet();
                        HashSet hashSet52 = new HashSet();
                        String str322 = str28;
                        String str332 = str29;
                        Account[] a32 = adyd.m51363a(context).mo33916a("com.google");
                        length = a32.length;
                        Account[] accountArr2 = a32;
                        i7 = 0;
                        while (i7 < length) {
                        }
                        hashSet3 = new HashSet(hashSet);
                        hashSet3.removeAll(hashSet42);
                        HashSet hashSet62 = new HashSet(hashSet2);
                        hashSet62.removeAll(hashSet52);
                        if (hashSet3.isEmpty()) {
                        }
                        it = hashSet3.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                        }
                        it2 = hashSet62.iterator();
                        while (it2.hasNext()) {
                        }
                        SharedPreferences.Editor edit2 = atkm.f90420c.edit();
                        JSONArray jSONArray32 = new JSONArray();
                        while (r4.hasNext()) {
                        }
                        edit2.putString(str19, jSONArray32.toString()).apply();
                        if (!z2) {
                        }
                        String b2 = askc.m74272b();
                        d = asix.m74203d(context3, b2);
                        if (!d.isEmpty()) {
                        }
                        i3 = 1;
                        f108655b.set(false);
                        return i3 ^ 1;
                    }
                    a = asko.m74292a(context);
                    SQLiteDatabase a222 = a.mo49214a();
                    try {
                        hashSet = new HashSet();
                        str4 = "SELECT DISTINCT account_id FROM ";
                        strArr = new String[]{"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                        i = 0;
                        while (true) {
                            strArr2 = strArr;
                            if (i < 10) {
                                try {
                                    break;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    str11 = str2;
                                    throw new asks(e);
                                }
                            } else {
                                str5 = str28;
                                str6 = str29;
                                asko = a;
                                str7 = str31;
                                str8 = str30;
                                str3 = str2;
                                athh2 = athh;
                                context2 = context7;
                                try {
                                    String valueOf = String.valueOf(strArr2[i]);
                                    if (valueOf.length() == 0) {
                                        str9 = str4;
                                        str10 = new String(str9);
                                    } else {
                                        str9 = str4;
                                        str10 = str9.concat(valueOf);
                                    }
                                    rawQuery = a222.rawQuery(str10, null);
                                    while (rawQuery.moveToNext()) {
                                        hashSet.add(rawQuery.getString(0));
                                    }
                                    if (rawQuery != null) {
                                        rawQuery.close();
                                    }
                                    i++;
                                    str4 = str9;
                                    str2 = str3;
                                    context7 = context2;
                                    str29 = str6;
                                    strArr = strArr2;
                                    str31 = str7;
                                    str30 = str8;
                                    str28 = str5;
                                    a = asko;
                                    athh = athh2;
                                } catch (SQLiteException e7) {
                                    e = e7;
                                } catch (Throwable th10) {
                                    bqye.m113761a(th, th10);
                                }
                            }
                        }
                        hashSet2 = new HashSet();
                        str12 = "SELECT DISTINCT account_name FROM ";
                        strArr3 = new String[]{"TapInfos", "DoodleRenderedInfos"};
                        i2 = 0;
                        while (true) {
                            String[] strArr422 = strArr3;
                            if (i2 < 2) {
                                break;
                            }
                            str13 = str28;
                            str14 = str29;
                            asko2 = a;
                            str15 = str31;
                            str16 = str30;
                            str11 = str2;
                            athh3 = athh;
                            String[] strArr5 = strArr422;
                            try {
                                String valueOf2 = String.valueOf(strArr5[i2]);
                                if (valueOf2.length() == 0) {
                                    str17 = str12;
                                    str18 = new String(str17);
                                } else {
                                    str17 = str12;
                                    str18 = str17.concat(valueOf2);
                                }
                                rawQuery2 = a222.rawQuery(str18, null);
                                while (rawQuery2.moveToNext()) {
                                    String[] strArr6 = strArr5;
                                    hashSet2.add(rawQuery2.getString(0));
                                    strArr5 = strArr6;
                                }
                                String[] strArr7 = strArr5;
                                if (rawQuery2 != null) {
                                    rawQuery2.close();
                                }
                                i2++;
                                str2 = str11;
                                str12 = str17;
                                str29 = str14;
                                strArr3 = strArr7;
                                str31 = str15;
                                str30 = str16;
                                str28 = str13;
                                a = asko2;
                                athh = athh3;
                            } catch (SQLiteException e8) {
                                e = e8;
                            } catch (Throwable th11) {
                                bqye.m113761a(th2, th11);
                            }
                        }
                        if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                            context3 = context;
                        } else {
                            HashSet hashSet422 = new HashSet();
                            HashSet hashSet522 = new HashSet();
                            String str3222 = str28;
                            String str3322 = str29;
                            Account[] a322 = adyd.m51363a(context).mo33916a("com.google");
                            length = a322.length;
                            Account[] accountArr22 = a322;
                            i7 = 0;
                            while (i7 < length) {
                                String str34 = str20;
                                String str35 = str19;
                                String str36 = str22;
                                String str37 = str21;
                                int i9 = length;
                                String str38 = str2;
                                asko asko3 = a;
                                Account account = accountArr22[i7];
                                athh athh6 = athh;
                                String b3 = asjg.m74215b(context, account.name);
                                if (!TextUtils.isEmpty(b3)) {
                                    hashSet422.add(b3);
                                    hashMap.remove(b3);
                                    hashSet522.add(account.name);
                                    hashMap.remove(account.name);
                                }
                                i7++;
                                str31 = str36;
                                str30 = str37;
                                str3222 = str34;
                                a = asko3;
                                athh = athh6;
                                str3322 = str35;
                                str2 = str38;
                                length = i9;
                            }
                            hashSet3 = new HashSet(hashSet);
                            hashSet3.removeAll(hashSet422);
                            HashSet hashSet622 = new HashSet(hashSet2);
                            hashSet622.removeAll(hashSet522);
                            if (hashSet3.isEmpty()) {
                                if (hashSet622.isEmpty()) {
                                    context3 = context;
                                }
                            }
                            it = hashSet3.iterator();
                            z2 = false;
                            while (it.hasNext()) {
                                try {
                                    String str39 = (String) it.next();
                                    int a4 = asis.m74177a(hashMap, str39) + 1;
                                    bnsl bnsl3 = (bnsl) asis.f89055a.mo68388c();
                                    Iterator it3 = it;
                                    bnsl3.mo68432a("asis", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68409a("Found orphaned account id, count: %d", a4);
                                    hashMap.put(str39, Integer.valueOf(a4));
                                    if (a4 >= 2) {
                                        try {
                                            bnsl bnsl4 = (bnsl) asis.f89055a.mo68388c();
                                            bnsl4.mo68432a("asis", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("Purging orphaned account by id");
                                            a.mo49215a(str39, (String) null, a222);
                                            hashMap.remove(str39);
                                            it = it3;
                                            z2 = true;
                                        } catch (Throwable th12) {
                                            context4 = context;
                                            th3 = th12;
                                            str = str2;
                                            str23 = str20;
                                            z = true;
                                            if (z) {
                                            }
                                            throw th3;
                                        }
                                    } else {
                                        it = it3;
                                    }
                                } catch (Throwable th13) {
                                    context5 = context;
                                    th4 = th13;
                                    z3 = z2;
                                    str24 = str2;
                                    str25 = str20;
                                    z = z3;
                                    if (z) {
                                    }
                                    throw th3;
                                }
                            }
                            it2 = hashSet622.iterator();
                            while (it2.hasNext()) {
                                context4 = context;
                                athh athh7 = athh;
                                str23 = str20;
                                boolean z5 = z2;
                                str = str2;
                                Iterator it4 = it2;
                                String str40 = (String) it2.next();
                                String str41 = str22;
                                int a5 = asis.m74177a(hashMap, str40) + 1;
                                String str42 = str21;
                                bnsl bnsl5 = (bnsl) asis.f89055a.mo68388c();
                                String str43 = str19;
                                bnsl5.mo68432a("asis", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl5.mo68409a("Found orphaned account by name, count: %d", a5);
                                hashMap.put(str40, Integer.valueOf(a5));
                                if (a5 >= 2) {
                                    try {
                                        bnsl bnsl6 = (bnsl) asis.f89055a.mo68388c();
                                        bnsl6.mo68432a("asis", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl6.mo68405a("Purging orphaned account by name");
                                        a.mo49215a((String) null, str40, a222);
                                        hashMap.remove(str40);
                                        str2 = str;
                                        athh4 = athh7;
                                        it2 = it4;
                                        str22 = str41;
                                        str21 = str42;
                                        z2 = true;
                                        str20 = str23;
                                        str19 = str43;
                                    } catch (Throwable th14) {
                                        th3 = th14;
                                        z = true;
                                        if (z) {
                                        }
                                        throw th3;
                                    }
                                } else {
                                    athh4 = athh7;
                                    it2 = it4;
                                    str22 = str41;
                                    str21 = str42;
                                    str20 = str23;
                                    str19 = str43;
                                    str2 = str;
                                    z2 = z5;
                                }
                            }
                            SharedPreferences.Editor edit22 = atkm.f90420c.edit();
                            JSONArray jSONArray322 = new JSONArray();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(str22, entry.getKey());
                                    jSONObject2.put(str21, entry.getValue());
                                    jSONArray322.put(jSONObject2);
                                } catch (JSONException e9) {
                                    context6 = context;
                                    jSONException = e9;
                                    str26 = str20;
                                    z4 = z2;
                                    str27 = str2;
                                } catch (Throwable th15) {
                                    context6 = context;
                                    th5 = th15;
                                    str26 = str20;
                                    z4 = z2;
                                    str27 = str2;
                                    z = z4;
                                    if (z) {
                                    }
                                    throw th3;
                                }
                            }
                            edit22.putString(str19, jSONArray322.toString()).apply();
                            if (!z2) {
                                context3 = context;
                                asuc.getInstance().mo49500a(context3, str20);
                                asiv.m74182a(context);
                            } else {
                                context3 = context;
                            }
                        }
                        String b22 = askc.m74272b();
                        d = asix.m74203d(context3, b22);
                        if (!d.isEmpty()) {
                            if (asit.m74179a(asjm.m74238a(context), context3, b22, asko.m74292a(context).mo49214a())) {
                                try {
                                    try {
                                        btiw a6 = athh.mo49987a(askg.m74277a(context));
                                        btnn a7 = asiy.m74204a(context);
                                        int size = d.size();
                                        CountDownLatch countDownLatch = new CountDownLatch(size + size);
                                        bqgj a8 = snp.m35702a(10);
                                        askt askt = new askt();
                                        Iterator it5 = d.iterator();
                                        while (it5.hasNext()) {
                                            try {
                                                askf askf = new askf((AccountInfo) it5.next(), b22, context3);
                                                bxvd da = btot.f149799d.mo74144da();
                                                String str44 = a6.f149047b;
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                btot btot = (btot) da.f164949b;
                                                str44.getClass();
                                                btot.f149801a = str44;
                                                a6.getClass();
                                                btot.f149802b = a6;
                                                if (!cgwn.m147253c()) {
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                a7.getClass();
                                                ((btot) da.f164949b).f149803c = a7;
                                                atff.m75765a(askf, "t/security/checkin", da.mo74062i(), btou.f149804a, new athf(askf, a8, askt, countDownLatch), null);
                                                snp.m35702a(10).execute(new athg(new athq(), countDownLatch, a6, askf));
                                                atds a9 = atds.m75666a(askf);
                                                atam atam = new atam(askf);
                                                btnn a10 = asiy.m74204a(askf.f89126d);
                                                CardInfo b4 = a9.mo49852b();
                                                bxvd b5 = atam.mo49753b(28, b4);
                                                int i10 = b4 != null ? 2 : 1;
                                                Iterator it6 = it5;
                                                m93101a(askf, b5);
                                                Context context8 = askf.f89126d;
                                                String str45 = b22;
                                                bxvd da2 = boye.f135302m.mo74144da();
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye = (boye) da2.f164949b;
                                                boye.f135305b = i10 - 1;
                                                boye.f135304a |= 1;
                                                btiw btiw = a6;
                                                int i11 = context8.getPackageManager().resolveActivity(new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY"), 0) == null ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye2 = (boye) da2.f164949b;
                                                boye2.f135308e = i11 - 1;
                                                int i12 = boye2.f135304a | 8;
                                                boye2.f135304a = i12;
                                                btnm btnm = a10.f149665e;
                                                if (btnm != null) {
                                                    String str46 = btnm.f149656c;
                                                    str46.getClass();
                                                    boye2.f135304a = i12 | 16;
                                                    boye2.f135309f = str46;
                                                }
                                                btng btng = a10.f149661a;
                                                if (btng != null) {
                                                    int a11 = btne.m116947a(btng.f149617i);
                                                    if (a11 != 0) {
                                                        if (a11 == 3) {
                                                            i6 = 2;
                                                            if (!da2.f164950c) {
                                                                da2.mo74035c();
                                                                da2.f164950c = false;
                                                            }
                                                            boye boye3 = (boye) da2.f164949b;
                                                            boye3.f135311h = i6 - 1;
                                                            boye3.f135304a |= 64;
                                                        }
                                                    }
                                                    btng btng2 = a10.f149661a;
                                                    if (btng2 == null) {
                                                        btng2 = btng.f149607j;
                                                    }
                                                    int a12 = btne.m116947a(btng2.f149617i);
                                                    if (a12 == 0) {
                                                        i6 = 1;
                                                    } else {
                                                        i6 = a12 != 4 ? 1 : 3;
                                                    }
                                                    if (!da2.f164950c) {
                                                    }
                                                    boye boye32 = (boye) da2.f164949b;
                                                    boye32.f135311h = i6 - 1;
                                                    boye32.f135304a |= 64;
                                                }
                                                int i13 = Build.VERSION.SDK_INT;
                                                int i14 = !((Boolean) ((bmyg) bmxv.m108566b(Boolean.valueOf(context8.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")))).f131198a).booleanValue() ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye4 = (boye) da2.f164949b;
                                                boye4.f135315l = i14 - 1;
                                                boye4.f135304a |= 1024;
                                                int i15 = !asjk.m74228b(context8) ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye5 = (boye) da2.f164949b;
                                                boye5.f135310g = i15 - 1;
                                                boye5.f135304a |= 32;
                                                int i16 = !atxx.m76529b(context8) ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye6 = (boye) da2.f164949b;
                                                boye6.f135306c = i16 - 1;
                                                boye6.f135304a |= 2;
                                                if (!asjw.m74256a(context8) || spn.m35859a()) {
                                                    i4 = 3;
                                                } else {
                                                    i4 = NfcAdapter.getDefaultAdapter(context8) == null ? 3 : 2;
                                                }
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye7 = (boye) da2.f164949b;
                                                boye7.f135313j = i4 - 1;
                                                boye7.f135304a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                int i17 = !C1178ly.m19617a(context8).mo15435b() ? 3 : 2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye8 = (boye) da2.f164949b;
                                                boye8.f135312i = i17 - 1;
                                                boye8.f135304a |= 128;
                                                int g = atxx.m76534g(context8);
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye9 = (boye) da2.f164949b;
                                                boye9.f135307d = g - 1;
                                                boye9.f135304a |= 4;
                                                if (!asjw.m74256a(context8) || spn.m35859a() || (f = atxx.m76533f(context8)) == null) {
                                                    i5 = 3;
                                                } else {
                                                    i5 = !f.supportsAidPrefixRegistration() ? 3 : 2;
                                                }
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                boye boye10 = (boye) da2.f164949b;
                                                boye10.f135314k = i5 - 1;
                                                boye10.f135304a |= 512;
                                                if (b5.f164950c) {
                                                    b5.mo74035c();
                                                    b5.f164950c = false;
                                                }
                                                bpbx bpbx = (bpbx) b5.f164949b;
                                                boye boye11 = (boye) da2.mo74062i();
                                                bpbx bpbx2 = bpbx.f135635S;
                                                boye11.getClass();
                                                bpbx.f135669o = boye11;
                                                bpbx.f135655a |= 4096;
                                                bxvd da3 = bozb.f135362e.mo74144da();
                                                int i18 = !sey.m35126a(context8).mo25460a() ? 3 : 2;
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bozb bozb = (bozb) da3.f164949b;
                                                bozb.f135365b = i18 - 1;
                                                bozb.f135364a |= 1;
                                                int g2 = new asqc(context8).mo49364g();
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                bozb bozb2 = (bozb) da3.f164949b;
                                                int i19 = g2 - 1;
                                                if (g2 != 0) {
                                                    bozb2.f135366c = i19;
                                                    bozb2.f135364a |= 2;
                                                    int i20 = !alfj.m60866b(context8) ? 2 : 3;
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bozb bozb3 = (bozb) da3.f164949b;
                                                    bozb3.f135367d = i20 - 1;
                                                    bozb3.f135364a |= 4;
                                                    if (b5.f164950c) {
                                                        b5.mo74035c();
                                                        b5.f164950c = false;
                                                    }
                                                    bpbx bpbx3 = (bpbx) b5.f164949b;
                                                    bozb bozb4 = (bozb) da3.mo74062i();
                                                    bozb4.getClass();
                                                    bpbx3.f135678x = bozb4;
                                                    bpbx3.f135655a |= 16777216;
                                                    atam.mo49741a((bpbx) b5.mo74062i());
                                                    it5 = it6;
                                                    a6 = btiw;
                                                    b22 = str45;
                                                } else {
                                                    throw null;
                                                }
                                            } catch (asks e10) {
                                                asks = e10;
                                                str = str2;
                                                try {
                                                    bnsl bnsl7 = (bnsl) f108654a.mo68387b();
                                                    bnsl7.mo68437a(asks);
                                                    bnsl7.mo68432a(str, "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl7.mo68405a("Failed to checkin");
                                                    f108655b.set(false);
                                                    return 2;
                                                } catch (Throwable th16) {
                                                    Throwable th17 = th16;
                                                    f108655b.set(false);
                                                    throw th17;
                                                }
                                            }
                                        }
                                        try {
                                            countDownLatch.await(170, TimeUnit.SECONDS);
                                            i3 = 1;
                                        } catch (InterruptedException e11) {
                                            InterruptedException interruptedException = e11;
                                            bnsl bnsl8 = (bnsl) f108654a.mo68387b();
                                            bnsl8.mo68437a(interruptedException);
                                            str = str2;
                                            try {
                                                bnsl8.mo68432a(str, "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl8.mo68405a("InterruptedException");
                                                i3 = 1;
                                            } catch (asks e12) {
                                                e = e12;
                                                asks = e;
                                                bnsl bnsl72 = (bnsl) f108654a.mo68387b();
                                                bnsl72.mo68437a(asks);
                                                bnsl72.mo68432a(str, "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl72.mo68405a("Failed to checkin");
                                                f108655b.set(false);
                                                return 2;
                                            }
                                        }
                                    } catch (atfh | IOException e13) {
                                        i3 = 0;
                                    }
                                } catch (RuntimeException e14) {
                                    i3 = 1;
                                }
                                f108655b.set(false);
                                return i3 ^ 1;
                            }
                        }
                        i3 = 1;
                        f108655b.set(false);
                        return i3 ^ 1;
                    } catch (SQLiteException e15) {
                        e = e15;
                        str3 = str2;
                        throw new asks(e);
                    }
                } else {
                    str2 = "com.google.android.gms.tapandpay.security.CheckInTaskOperation";
                    athh = athh5;
                }
                try {
                    a = asko.m74292a(context);
                    SQLiteDatabase a2222 = a.mo49214a();
                    hashSet = new HashSet();
                    str4 = "SELECT DISTINCT account_id FROM ";
                    strArr = new String[]{"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                    i = 0;
                    while (true) {
                        strArr2 = strArr;
                        if (i < 10) {
                        }
                        i++;
                        str4 = str9;
                        str2 = str3;
                        context7 = context2;
                        str29 = str6;
                        strArr = strArr2;
                        str31 = str7;
                        str30 = str8;
                        str28 = str5;
                        a = asko;
                        athh = athh2;
                    }
                    hashSet2 = new HashSet();
                    str12 = "SELECT DISTINCT account_name FROM ";
                    strArr3 = new String[]{"TapInfos", "DoodleRenderedInfos"};
                    i2 = 0;
                    while (true) {
                        String[] strArr4222 = strArr3;
                        if (i2 < 2) {
                        }
                        i2++;
                        str2 = str11;
                        str12 = str17;
                        str29 = str14;
                        strArr3 = strArr7;
                        str31 = str15;
                        str30 = str16;
                        str28 = str13;
                        a = asko2;
                        athh = athh3;
                    }
                    if (hashSet.isEmpty()) {
                        context3 = context;
                        String b222 = askc.m74272b();
                        d = asix.m74203d(context3, b222);
                        if (!d.isEmpty()) {
                        }
                        i3 = 1;
                        f108655b.set(false);
                        return i3 ^ 1;
                    }
                    HashSet hashSet4222 = new HashSet();
                    HashSet hashSet5222 = new HashSet();
                    String str32222 = str28;
                    String str33222 = str29;
                    Account[] a3222 = adyd.m51363a(context).mo33916a("com.google");
                    length = a3222.length;
                    Account[] accountArr222 = a3222;
                    i7 = 0;
                    while (i7 < length) {
                    }
                    hashSet3 = new HashSet(hashSet);
                    hashSet3.removeAll(hashSet4222);
                    HashSet hashSet6222 = new HashSet(hashSet2);
                    hashSet6222.removeAll(hashSet5222);
                    if (hashSet3.isEmpty()) {
                    }
                    it = hashSet3.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                    }
                    it2 = hashSet6222.iterator();
                    while (it2.hasNext()) {
                    }
                    SharedPreferences.Editor edit222 = atkm.f90420c.edit();
                    JSONArray jSONArray3222 = new JSONArray();
                    while (r4.hasNext()) {
                    }
                    edit222.putString(str19, jSONArray3222.toString()).apply();
                    if (!z2) {
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                    str = str2;
                    sQLiteException = e;
                    throw new asks(sQLiteException);
                }
            } catch (SQLiteException e17) {
                e = e17;
                str = "com.google.android.gms.tapandpay.security.CheckInTaskOperation";
                sQLiteException = e;
                throw new asks(sQLiteException);
            }
            try {
                String b2222 = askc.m74272b();
                d = asix.m74203d(context3, b2222);
                if (!d.isEmpty()) {
                }
                i3 = 1;
                f108655b.set(false);
                return i3 ^ 1;
            } catch (asks e18) {
                e = e18;
                str = str2;
                asks = e;
                bnsl bnsl722 = (bnsl) f108654a.mo68387b();
                bnsl722.mo68437a(asks);
                bnsl722.mo68432a(str, "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl722.mo68405a("Failed to checkin");
                f108655b.set(false);
                return 2;
            }
        } catch (asks e19) {
            e = e19;
            str = "com.google.android.gms.tapandpay.security.CheckInTaskOperation";
            asks = e;
            bnsl bnsl7222 = (bnsl) f108654a.mo68387b();
            bnsl7222.mo68437a(asks);
            bnsl7222.mo68432a(str, "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7222.mo68405a("Failed to checkin");
            f108655b.set(false);
            return 2;
        }
        throw th;
        throw th2;
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        int i = 0;
        aebl.mo34028b(0, cdny.m134341f() ? 1 : 0);
        aebl.mo34024a(0, cdny.m134340e() ? 1 : 0);
        if (cdny.m134337b()) {
            i = 2;
        }
        aebl.mo34027b(i);
        aebl.f63099k = "checkin_task";
        long seconds = TimeUnit.HOURS.toSeconds(24);
        long seconds2 = TimeUnit.HOURS.toSeconds(6);
        if (!cdny.m134352q()) {
            aebl.f63070a = seconds;
            aebl.f63071b = seconds2;
        } else {
            aebl.mo34009a(aebh.m51568a(seconds));
        }
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }
}
