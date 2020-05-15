package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: atdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdz {

    /* renamed from: a */
    public static final srn f90166a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final askf f90167b;

    public atdz(askf askf) {
        this.f90167b = askf;
    }

    /* renamed from: a */
    public static atdt m75701a(Cursor cursor) {
        boolean z;
        try {
            btjk btjk = (btjk) GeneratedMessageLite.m124016a(btjk.f149119C, cursor.getBlob(3), bxus.m123744c());
            if (cursor.getInt(4) == 1) {
                z = true;
            } else {
                z = false;
            }
            return new atdt(btjk, z, cursor.getString(6), cursor.getInt(12) == 1, cursor.getLong(10));
        } catch (bxwf e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    static void m75704b(Context context) {
        asko.m74292a(context).mo49214a().execSQL("DELETE FROM PaymentCardOverrides");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    private final atdt m75705f(String str) {
        SQLiteDatabase d = mo49886d();
        d.beginTransaction();
        try {
            atdt b = mo49878b(d, str);
            if (b != null) {
                d.execSQL("DELETE FROM PaymentBundles WHERE bundle_id=? AND account_id=? AND environment=?", mo49889e(str));
                mo49882b(d);
                d.setTransactionSuccessful();
                d.endTransaction();
                mo49872a(b, "deleteToken");
                return b;
            }
            bnsl bnsl = (bnsl) f90166a.mo68387b();
            bnsl.mo68432a("atdz", "f", 793, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("deleteToken error: card not found");
            d.endTransaction();
            return null;
        } catch (Throwable th) {
            d.endTransaction();
            throw th;
        }
    }

    /* renamed from: c */
    public final String mo49883c(SQLiteDatabase sQLiteDatabase) {
        return atxr.m76516a(sQLiteDatabase, "SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? AND token_state = 3 AND EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) AND is_selected = 1 ", mo49885c());
    }

    /* renamed from: d */
    public final SQLiteDatabase mo49886d() {
        return asko.m74292a(mo49888e()).mo49214a();
    }

    /* renamed from: e */
    public final Context mo49888e() {
        return this.f90167b.f89126d;
    }

    /* renamed from: f */
    public final String mo49890f() {
        return this.f90167b.f89123a;
    }

    /* renamed from: g */
    public final String mo49891g() {
        return this.f90167b.f89125c;
    }

    /* renamed from: b */
    public final atdt mo49878b(SQLiteDatabase sQLiteDatabase, String str) {
        return (atdt) atxr.m76515a(sQLiteDatabase, atdu.f90160a, null, "SELECT PaymentCards.*, EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) AS has_bundle FROM PaymentCards WHERE billing_id=? AND account_id=? AND environment=?", mo49889e(str));
    }

    /* renamed from: c */
    public final boolean mo49884c(String str) {
        return atxr.m76519c(mo49886d(), "SELECT PaymentCards.*, EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) AS has_bundle FROM PaymentCards WHERE billing_id=? AND account_id=? AND environment=?", mo49889e(str)) > 0;
    }

    /* renamed from: d */
    public final void mo49887d(String str) {
        atdt b = mo49878b(mo49886d(), str);
        if (b == null) {
            bnsl bnsl = (bnsl) f90166a.mo68387b();
            bnsl.mo68432a("atdz", "d", 769, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("tryDeleteTokenRpc error: card not found");
            return;
        }
        bxvd da = btkj.f149261d.mo74144da();
        btiy btiy = b.f90155a.f149123a;
        if (btiy == null) {
            btiy = btiy.f149054c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btkj btkj = (btkj) da.f164949b;
        btiy.getClass();
        btkj.f149263a = btiy;
        btkj.f149264b = btnw.m116966a(2);
        atff.m75759a(this.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b);
    }

    /* renamed from: e */
    public final String[] mo49889e(String str) {
        return new String[]{str, mo49890f(), mo49891g()};
    }

    /* renamed from: c */
    public final String[] mo49885c() {
        return new String[]{mo49890f(), mo49891g()};
    }

    /* renamed from: b */
    public final ateb mo49879b() {
        CardInfo cardInfo;
        atdy a = mo49867a(mo49886d(), SystemClock.elapsedRealtime());
        String str = a.f90164a;
        if (str != null) {
            cardInfo = mo49880b(str);
        } else {
            cardInfo = null;
        }
        return new ateb(cardInfo, a.f90165b);
    }

    /* renamed from: a */
    public static Map m75702a(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atdt atdt = (atdt) it.next();
            btiy btiy = atdt.f90155a.f149123a;
            if (btiy == null) {
                btiy = btiy.f149054c;
            }
            hashMap.put(btiy.f149056a, atdt);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m75703a(Context context) {
        return DatabaseUtils.queryNumEntries(asko.m74292a(context).mo49214a(), "PaymentCards") > 0;
    }

    /* renamed from: a */
    public final atdy mo49867a(SQLiteDatabase sQLiteDatabase, long j) {
        String valueOf = String.valueOf(j);
        return (atdy) atxr.m76515a(sQLiteDatabase, atdx.f90163a, new atdy(null, 0), "SELECT billing_id, pco.priority_override_realtime_max FROM PaymentCards pc LEFT JOIN PaymentCardOverrides pco ON pc.account_id = pco.account_id AND pc.environment = pco.environment AND pc.billing_id = pco.client_token_id JOIN PaymentBundles pb ON pc.account_id = pb.account_id AND pc.environment = pb.environment AND pc.billing_id = pb.bundle_id WHERE pc.account_id= ? AND pc.environment= ? AND token_state = 3 AND bundle_state NOT IN ('new', 'deleted') AND (is_selected = 1 OR (priority_override_realtime_min <= ? AND priority_override_realtime_max > ?)) ORDER BY priority DESC, priority_override_realtime_max DESC LIMIT 1", mo49890f(), mo49891g(), valueOf, valueOf);
    }

    /* renamed from: b */
    public final CardInfo mo49880b(String str) {
        atdt b = mo49878b(mo49886d(), str);
        if (b != null) {
            return b.mo49865c();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo49881b(SQLiteDatabase sQLiteDatabase, long j) {
        return mo49867a(sQLiteDatabase, j).f90164a;
    }

    /* renamed from: b */
    public final boolean mo49882b(SQLiteDatabase sQLiteDatabase) {
        String a;
        if (mo49883c(sQLiteDatabase) != null || (a = atxr.m76516a(sQLiteDatabase, "SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? AND token_state = 3 AND EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) ", mo49885c())) == null) {
            return false;
        }
        sQLiteDatabase.execSQL("UPDATE PaymentCards SET is_selected=(billing_id=?) WHERE account_id=? AND environment=?", mo49889e(a));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final btjk mo49868a(String str) {
        atdt b = mo49878b(mo49886d(), str);
        if (b != null) {
            return b.f90155a;
        }
        return null;
    }

    /* renamed from: a */
    public final GetAllCardsResponse mo49869a() {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SQLiteDatabase d = mo49886d();
        d.beginTransaction();
        try {
            boolean b = mo49882b(d);
            List a = mo49870a(d);
            String c = mo49883c(d);
            String b2 = mo49881b(d, elapsedRealtime);
            d.setTransactionSuccessful();
            if (b) {
                asuc.getInstance().mo49500a(mo49888e(), "getCardsLocally");
            }
            if (!Objects.equals(c, b2)) {
                str = b2;
            } else {
                str = null;
            }
            int size = a.size();
            CardInfo[] cardInfoArr = new CardInfo[size];
            for (int i = 0; i < size; i++) {
                cardInfoArr[i] = ((atdt) a.get(i)).mo49865c();
            }
            return new GetAllCardsResponse(cardInfoArr, this.f90167b.mo49209a(), c, str, new SparseArray(0));
        } finally {
            d.endTransaction();
        }
    }

    /* renamed from: a */
    public final List mo49870a(SQLiteDatabase sQLiteDatabase) {
        return atxr.m76517a(sQLiteDatabase, atdv.f90161a, "SELECT PaymentCards.*, EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted')) AS has_bundle FROM PaymentCards WHERE account_id=? AND environment=?", mo49885c());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo49871a(long j, int i) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (j != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime + j;
            String valueOf = String.valueOf(elapsedRealtime);
            SQLiteDatabase d = mo49886d();
            d.beginTransaction();
            try {
                d.delete("PaymentCardOverrides", "priority_override_realtime_max <= ?", new String[]{valueOf});
                Integer valueOf2 = Integer.valueOf(i);
                d.execSQL("UPDATE PaymentCardOverrides SET priority_override_realtime_min = ?, priority_override_realtime_max = ? WHERE account_id = ? AND environment = ? AND priority = ?", new Object[]{Long.valueOf(elapsedRealtime), Long.valueOf(j2), mo49890f(), mo49891g(), valueOf2});
                atdy a = mo49867a(d, elapsedRealtime);
                d.setTransactionSuccessful();
                d.endTransaction();
                bnsl bnsl = (bnsl) f90166a.mo68390d();
                bnsl.mo68432a("atdz", "a", 534, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68425a("updateCardOverrideDuration: priority %s timeout %s selected %s", valueOf2, Long.valueOf(j / 1000), a.f90164a);
                asuc.getInstance().mo49501a(mo49888e(), a.f90164a, a.f90165b, "updateDuration");
            } catch (Throwable th) {
                d.endTransaction();
                throw th;
            }
        } else {
            mo49874a(i);
        }
    }

    /* renamed from: a */
    public final void mo49872a(atdt atdt, String str) {
        if (atdt.mo49863a()) {
            asuc.getInstance().mo49500a(mo49888e(), str);
        }
    }

    /* renamed from: a */
    public final void mo49873a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DELETE FROM PaymentBundles WHERE bundle_id=? AND account_id=? AND environment=?", mo49889e(str));
            mo49882b(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void */
    /* renamed from: a */
    public final boolean mo49874a(int i) {
        CardInfo cardInfo;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SQLiteDatabase d = mo49886d();
        d.beginTransaction();
        try {
            String b = mo49881b(d, elapsedRealtime);
            d.delete("PaymentCardOverrides", "account_id=? AND environment=? AND priority = ?", new String[]{mo49890f(), mo49891g(), String.valueOf(i)});
            atdy a = mo49867a(d, elapsedRealtime);
            d.setTransactionSuccessful();
            d.endTransaction();
            String str = a.f90164a;
            asuc.getInstance().mo49501a(mo49888e(), str, a.f90165b, "restoreDefaultCard");
            bnsl bnsl = (bnsl) f90166a.mo68390d();
            bnsl.mo68432a("atdz", "a", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("restoreDefaultCard: priority %s old %s new %s", Integer.valueOf(i), b, str);
            if (!Objects.equals(b, str)) {
                if (str != null) {
                    cardInfo = mo49880b(str);
                } else {
                    cardInfo = null;
                }
                new atam(this.f90167b).mo49747a(cardInfo, true, i, 0L);
                atkl.f90415a.mo50008a();
            }
            return str != null;
        } catch (Throwable th) {
            d.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo49875a(SQLiteDatabase sQLiteDatabase, String str) {
        return atxr.m76519c(sQLiteDatabase, "SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? AND token_state = 3 AND EXISTS(SELECT * FROM PaymentBundles WHERE PaymentBundles.bundle_id = PaymentCards.billing_id AND PaymentBundles.account_id = PaymentCards.account_id AND PaymentBundles.environment = PaymentCards.environment AND PaymentBundles.bundle_state NOT IN ('new', 'deleted'))  AND billing_id = ?", new String[]{mo49890f(), mo49891g(), str}) == 1;
    }

    /* renamed from: a */
    public final boolean mo49876a(String str, int i) {
        SQLiteDatabase d = mo49886d();
        atdt b = mo49878b(d, str);
        boolean z = false;
        if (b != null) {
            try {
                bxvd da = btkj.f149261d.mo74144da();
                btiy btiy = b.f90155a.f149123a;
                if (btiy == null) {
                    btiy = btiy.f149054c;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btkj btkj = (btkj) da.f164949b;
                btiy.getClass();
                btkj.f149263a = btiy;
                btkj.f149264b = btnw.m116966a(i);
                atff.m75759a(this.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b);
                mo49873a(str, d);
                z = true;
            } catch (atfh e) {
                mo49873a(str, d);
            } catch (IOException e2) {
                d.beginTransaction();
                srn srn = atbm.f90004a;
                atbm.m75389a(this.f90167b, str, d);
                mo49882b(d);
                d.setTransactionSuccessful();
                d.endTransaction();
                atbq.m75407a(this.f90167b.f89126d);
            } catch (Throwable th) {
                d.endTransaction();
                throw th;
            }
            mo49872a(b, "blockingDeleteToken");
            return z;
        }
        bnsl bnsl = (bnsl) f90166a.mo68387b();
        bnsl.mo68432a("atdz", "a", 699, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("blockingDeleteToken error: card not found");
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int, int, long]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void */
    /* renamed from: a */
    public final boolean mo49877a(String str, long j, int i) {
        String str2 = str;
        sdo.m34970a(j > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime + j;
        String valueOf = String.valueOf(elapsedRealtime);
        SQLiteDatabase d = mo49886d();
        d.beginTransaction();
        try {
            if (mo49875a(d, str2)) {
                String b = mo49881b(d, elapsedRealtime);
                d.delete("PaymentCardOverrides", "priority_override_realtime_max <= ? OR priority = ?", new String[]{valueOf, String.valueOf(i)});
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_id", mo49890f());
                contentValues.put("environment", mo49891g());
                contentValues.put("client_token_id", str2);
                Integer valueOf2 = Integer.valueOf(i);
                contentValues.put("priority", valueOf2);
                contentValues.put("priority_override_realtime_min", Long.valueOf(elapsedRealtime));
                contentValues.put("priority_override_realtime_max", Long.valueOf(j2));
                d.insert("PaymentCardOverrides", null, contentValues);
                atdy a = mo49867a(d, elapsedRealtime);
                d.setTransactionSuccessful();
                d.endTransaction();
                bnsl bnsl = (bnsl) f90166a.mo68390d();
                bnsl.mo68432a("atdz", "a", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68427a("overrideDefaultCard: priority %s timeout %s old %s requested %s current %s", valueOf2, Long.valueOf(j / 1000), b, str, a.f90164a);
                asuc.getInstance().mo49501a(mo49888e(), a.f90164a, a.f90165b, "overrideDefaultCard");
                if (!Objects.equals(b, a.f90164a)) {
                    new atam(this.f90167b).mo49747a(mo49880b(a.f90164a), false, i, j);
                    atkl.f90415a.mo50008a();
                }
                return true;
            }
            d.endTransaction();
            return false;
        } catch (Throwable th) {
            d.endTransaction();
            throw th;
        }
    }
}
