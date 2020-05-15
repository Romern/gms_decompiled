package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asis {

    /* renamed from: a */
    public static final srn f89055a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static final int m74177a(Map map, String str) {
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0255 A[SYNTHETIC, Splitter:B:101:0x0255] */
    /* renamed from: a */
    public final void mo49194a(Context context) {
        Cursor rawQuery;
        Throwable th;
        Cursor rawQuery2;
        Throwable th2;
        String str;
        Context context2;
        boolean z;
        Context context3;
        boolean z2;
        Context context4;
        Context context5 = context;
        String str2 = "purgeOrphanedAccounts";
        String str3 = "orphaned_account_counts";
        try {
            atkm atkm = new atkm(context5);
            HashMap hashMap = new HashMap();
            String string = atkm.f90420c.getString(str3, null);
            int i = 0;
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        hashMap.put(jSONObject.getString("account_id_or_name"), Integer.valueOf(jSONObject.getInt("count")));
                    }
                } catch (JSONException e) {
                    bnsl bnsl = (bnsl) atkm.f90418a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("atkm", "i", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unexpected error parsing orphaned accounts JSON");
                    hashMap = new HashMap();
                }
            }
            asko a = asko.m74292a(context);
            SQLiteDatabase a2 = a.mo49214a();
            try {
                HashSet hashSet = new HashSet();
                int i3 = 2;
                String[] strArr = {"Wallets", "PaymentBundles", "PaymentCards", "SelectAidCache", "StorageKeys", "TapDoodleGroups", "ActivationMethodLimits", "SePaymentCards", "PaymentCardOverrides", "QuickAccessWalletCards"};
                while (i < 10) {
                    String str4 = str2;
                    String str5 = str3;
                    Context context6 = context5;
                    String valueOf = String.valueOf(strArr[i]);
                    rawQuery = a2.rawQuery(valueOf.length() == 0 ? new String("SELECT DISTINCT account_id FROM ") : "SELECT DISTINCT account_id FROM ".concat(valueOf), null);
                    while (rawQuery.moveToNext()) {
                        hashSet.add(rawQuery.getString(0));
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    i++;
                    context5 = context6;
                    str2 = str4;
                    str3 = str5;
                    i3 = 2;
                }
                try {
                    HashSet hashSet2 = new HashSet();
                    String[] strArr2 = new String[i3];
                    strArr2[0] = "TapInfos";
                    strArr2[1] = "DoodleRenderedInfos";
                    int i4 = 0;
                    while (i4 < i3) {
                        String str6 = str2;
                        String str7 = str3;
                        Context context7 = context5;
                        String valueOf2 = String.valueOf(strArr2[i4]);
                        rawQuery2 = a2.rawQuery(valueOf2.length() == 0 ? new String("SELECT DISTINCT account_name FROM ") : "SELECT DISTINCT account_name FROM ".concat(valueOf2), null);
                        while (rawQuery2.moveToNext()) {
                            hashSet2.add(rawQuery2.getString(0));
                        }
                        if (rawQuery2 != null) {
                            rawQuery2.close();
                        }
                        i4++;
                        context5 = context7;
                        str2 = str6;
                        str3 = str7;
                        i3 = 2;
                    }
                    if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                        HashSet hashSet3 = new HashSet();
                        HashSet hashSet4 = new HashSet();
                        Account[] a3 = adyd.m51363a(context).mo33916a("com.google");
                        int length = a3.length;
                        Account[] accountArr = a3;
                        int i5 = 0;
                        while (i5 < length) {
                            String str8 = str;
                            Context context8 = context2;
                            Account account = accountArr[i5];
                            String str9 = str2;
                            String b = asjg.m74215b(context8, account.name);
                            if (!TextUtils.isEmpty(b)) {
                                hashSet3.add(b);
                                hashMap.remove(b);
                                hashSet4.add(account.name);
                                hashMap.remove(account.name);
                            }
                            i5++;
                            context5 = context8;
                            str2 = str9;
                            str3 = str8;
                        }
                        HashSet hashSet5 = new HashSet(hashSet);
                        hashSet5.removeAll(hashSet3);
                        HashSet hashSet6 = new HashSet(hashSet2);
                        hashSet6.removeAll(hashSet4);
                        if (!hashSet5.isEmpty() || !hashSet6.isEmpty()) {
                            try {
                                Iterator it = hashSet5.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    try {
                                        String str10 = (String) it.next();
                                        Iterator it2 = it;
                                        int a4 = m74177a(hashMap, str10) + 1;
                                        z2 = z3;
                                        try {
                                            bnsl bnsl2 = (bnsl) f89055a.mo68388c();
                                            bnsl2.mo68432a("asis", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl2.mo68409a("Found orphaned account id, count: %d", a4);
                                            hashMap.put(str10, Integer.valueOf(a4));
                                            if (a4 >= 2) {
                                                try {
                                                    bnsl bnsl3 = (bnsl) f89055a.mo68388c();
                                                    bnsl3.mo68432a("asis", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl3.mo68405a("Purging orphaned account by id");
                                                    a.mo49215a(str10, (String) null, a2);
                                                    hashMap.remove(str10);
                                                    context2 = context;
                                                    it = it2;
                                                    z3 = true;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    context3 = context;
                                                    z = true;
                                                    if (z) {
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                context2 = context;
                                                it = it2;
                                                z3 = z2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            context4 = context;
                                            z = z2;
                                            if (z) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z2 = z3;
                                        context4 = context;
                                        z = z2;
                                        if (z) {
                                        }
                                        throw th;
                                    }
                                    try {
                                    } catch (Throwable th6) {
                                        th = th6;
                                        context4 = context2;
                                        z2 = z3;
                                        z = z2;
                                        if (z) {
                                        }
                                        throw th;
                                    }
                                }
                                z2 = z3;
                                Iterator it3 = hashSet6.iterator();
                                z = z2;
                                while (it3.hasNext()) {
                                    try {
                                        context3 = context;
                                        String str11 = (String) it3.next();
                                        int a5 = m74177a(hashMap, str11) + 1;
                                        Iterator it4 = it3;
                                        bnsl bnsl4 = (bnsl) f89055a.mo68388c();
                                        String str12 = str;
                                        bnsl4.mo68432a("asis", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl4.mo68409a("Found orphaned account by name, count: %d", a5);
                                        hashMap.put(str11, Integer.valueOf(a5));
                                        if (a5 >= 2) {
                                            try {
                                                bnsl bnsl5 = (bnsl) f89055a.mo68388c();
                                                bnsl5.mo68432a("asis", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl5.mo68405a("Purging orphaned account by name");
                                                a.mo49215a((String) null, str11, a2);
                                                hashMap.remove(str11);
                                                it3 = it4;
                                                str = str12;
                                                z = true;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                z = true;
                                                if (z) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            it3 = it4;
                                            str = str12;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        context3 = context;
                                        if (z) {
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
                                    if (z) {
                                        asuc.getInstance().mo49500a(context, str2);
                                        asiv.m74182a(context);
                                        return;
                                    }
                                    return;
                                } catch (JSONException e2) {
                                    context3 = context;
                                    throw new RuntimeException(e2);
                                } catch (Throwable th9) {
                                    th = th9;
                                    if (z) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                context3 = context2;
                                z = false;
                                if (z) {
                                    asuc.getInstance().mo49500a(context3, str2);
                                    asiv.m74182a(context);
                                }
                                throw th;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (SQLiteException e3) {
                    throw new asks(e3);
                } catch (Throwable th11) {
                    bqye.m113761a(th2, th11);
                }
                throw th2;
                throw th;
            } catch (SQLiteException e4) {
                throw new asks(e4);
            } catch (Throwable th12) {
                bqye.m113761a(th, th12);
            }
        } catch (SQLiteException e5) {
            throw new asks(e5);
        }
    }
}
