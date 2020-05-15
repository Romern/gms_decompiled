package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.notifications.TapAndPayGcmRegistrationTaskOperation;
import java.io.IOException;

/* renamed from: asiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asiv {

    /* renamed from: a */
    public static final /* synthetic */ int f89057a = 0;

    /* renamed from: b */
    private static final srn f89058b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static void m74182a(Context context) {
        Intent startIntent;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.tapandpay.WALLET_CHANGED");
        context.sendBroadcast(intent);
        if (cgwn.f187872a.mo6606a().mo84587B() && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.pay.account.cache.PayWalletChangedIntentOperation", "com.google.android.gms.tapandpay.WALLET_CHANGED")) != null) {
            context.startService(startIntent);
        }
    }

    /* renamed from: b */
    private static String m74190b(Context context) {
        try {
            return qdf.m31915b(context);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f89058b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asiv", "b", 459, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not get device version info.");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* renamed from: c */
    public static boolean m74193c(askf askf) {
        return m74189a("SELECT receives_transaction_notifications from Wallets WHERE account_id = ? AND environment = ?;", askf, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* renamed from: d */
    public static boolean m74194d(askf askf) {
        return m74189a("SELECT device_info_sent FROM Wallets WHERE account_id = ? AND environment = ?;", askf, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: e */
    public static boolean m74195e(askf askf) {
        boolean z = true;
        if (!cgwn.f187872a.mo6606a().mo84644y()) {
            return true;
        }
        if (DatabaseUtils.queryNumEntries(asko.m74292a(askf.f89126d).mo49214a(), "Wallets", "wallet_id IS NOT NULL AND account_id = ? AND environment = ?", new String[]{askf.f89123a, askf.f89125c}) != 1) {
            return false;
        }
        if (m74194d(askf)) {
            return true;
        }
        try {
            bxvd da = btoj.f149763b.mo74144da();
            btnn a = asiy.m74204a(askf.f89126d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((btoj) da.f164949b).f149765a = a;
            atff.m75759a(askf, "t/setup/postdeviceinfo", da.mo74062i(), btok.f149766a);
            SQLiteDatabase a2 = asko.m74292a(askf.f89126d).mo49214a();
            a2.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("device_info_sent", (Integer) 1);
                if (a2.update("Wallets", contentValues, "wallet_id IS NOT NULL AND account_id = ? AND environment = ?", new String[]{askf.f89123a, askf.f89125c}) != 1) {
                    z = false;
                }
                a2.setTransactionSuccessful();
                return z;
            } finally {
                a2.endTransaction();
            }
        } catch (atfh e) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* renamed from: b */
    public static boolean m74191b(askf askf) {
        return m74189a("SELECT is_payments_enabled from Wallets WHERE account_id = ? AND environment = ?;", askf, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, askf, boolean):boolean
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, askf, int]
     candidates:
      asiv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, askf):boolean
      asiv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, askf, boolean):boolean */
    /* renamed from: b */
    public static boolean m74192b(askf askf, boolean z) {
        SQLiteDatabase a = asko.m74292a(askf.f89126d).mo49214a();
        a.beginTransaction();
        boolean z2 = true;
        try {
            boolean a2 = m74187a(a, "SELECT receives_transaction_notifications from Wallets WHERE account_id = ? AND environment = ?;", askf, true);
            boolean a3 = m74188a(a, "UPDATE Wallets SET receives_transaction_notifications = ? WHERE account_id = ? AND environment = ?;", z, askf);
            a.setTransactionSuccessful();
            if (!a3) {
                z2 = false;
            } else if (a2 == z) {
                z2 = false;
            }
            return z2;
        } finally {
            a.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static final void m74183a(askf askf, String str, String str2) {
        String str3;
        Context context = askf.f89126d;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        long a2 = asjm.m74238a(askf.f89126d);
        if (asit.m74179a(a2, context, askf.f89125c, a)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_id", askf.f89123a);
            contentValues.put("is_active_wallet", (Integer) 0);
            contentValues.put("environment", askf.f89125c);
            a.insertWithOnConflict("Wallets", null, contentValues, 4);
            sdo.m34963a(a2);
            if (TextUtils.isEmpty(asix.m74200a(askf))) {
                String str4 = askf.f89125c;
                bxvd da = btol.f149768e.mo74144da();
                if (!cgwn.m147253c()) {
                    btnn a3 = asiy.m74204a(askf.f89126d);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a3.getClass();
                    ((btol) da.f164949b).f149770a = a3;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str.getClass();
                    ((btol) da.f164949b).f149772c = str;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str2.getClass();
                    ((btol) da.f164949b).f149773d = str2;
                }
                try {
                    str3 = qdf.m31915b(askf.f89126d);
                } catch (Exception e) {
                    bnsl bnsl = (bnsl) f89058b.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("asiv", "b", 459, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Could not get device version info.");
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str3.getClass();
                    ((btol) da.f164949b).f149771b = str3;
                }
                btom btom = (btom) atff.m75759a(askf, "t/setup/registerwallet", da.mo74062i(), btom.f149774c);
                a.beginTransaction();
                try {
                    a.execSQL("UPDATE Wallets SET wallet_id = ? WHERE account_id = ? AND environment = ?;", new String[]{btom.f149776a, askf.f89123a, str4});
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("key_id", "stable_device_id");
                    contentValues2.put("value", btom.f149777b);
                    contentValues2.put("environment", str4);
                    a.insertWithOnConflict("GlobalValues", null, contentValues2, 5);
                    asjm.m74240a(a2, str4, a);
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    atam atam = new atam(askf);
                    atam.mo49741a(atam.mo49734a(23));
                    TapAndPayGcmRegistrationTaskOperation.m93075a(askf);
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            }
        } else {
            throw new IOException("Failed to register wallet due to missing androidId");
        }
    }

    /* renamed from: a */
    public static void m74184a(askf askf, boolean z) {
        m74186a("UPDATE Wallets SET fails_attestation = ? WHERE account_id = ? AND environment = ?;", z, askf);
    }

    /* renamed from: a */
    public static void m74185a(String str, askf askf) {
        asko.m74292a(askf.f89126d).mo49214a().execSQL("UPDATE Wallets SET gcm_id = ? WHERE account_id = ? AND environment = ?;", new String[]{str, askf.f89123a, askf.f89125c});
    }

    /* renamed from: a */
    public static void m74186a(String str, boolean z, askf askf) {
        m74188a(asko.m74292a(askf.f89126d).mo49214a(), str, z, askf);
    }

    /* renamed from: a */
    private static boolean m74187a(SQLiteDatabase sQLiteDatabase, String str, askf askf, boolean z) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, new String[]{askf.f89123a, askf.f89125c});
        try {
            if (rawQuery.moveToFirst()) {
                if (rawQuery.getInt(0) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                    return z;
                }
            } else if (rawQuery != null) {
                rawQuery.close();
                return z;
            }
            return z;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static boolean m74188a(SQLiteDatabase sQLiteDatabase, String str, boolean z, askf askf) {
        String[] strArr = new String[3];
        strArr[0] = !z ? "0" : "1";
        strArr[1] = askf.f89123a;
        strArr[2] = askf.f89125c;
        return atxr.m76514a(sQLiteDatabase, str, strArr) == 1;
    }

    /* renamed from: a */
    public static boolean m74189a(String str, askf askf, boolean z) {
        return m74187a(asko.m74292a(askf.f89126d).mo49214a(), str, askf, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo49195a(askf askf) {
        Context context = askf.f89126d;
        String str = askf.f89125c;
        SQLiteDatabase a = asko.m74292a(context).mo49214a();
        m74183a(askf, (String) null, (String) null);
        a.beginTransaction();
        try {
            String[] strArr = {askf.f89123a, str};
            a.execSQL("UPDATE Wallets SET is_active_wallet = 0 WHERE account_id != ? AND environment = ?", strArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_active_wallet", (Integer) 1);
            int update = a.update("Wallets", contentValues, "account_id = ? AND environment = ? AND is_active_wallet = 0", strArr);
            a.setTransactionSuccessful();
            if (update == 0) {
                bnsl bnsl = (bnsl) f89058b.mo68390d();
                bnsl.mo68432a("asiv", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Active account did not change.");
                return;
            }
            asuc.getInstance().mo49500a(context, "setActiveAccount");
            atkl.f90415a.mo50008a();
            m74182a(context);
        } finally {
            a.endTransaction();
        }
    }
}
