package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: atgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgn {

    /* renamed from: a */
    public static final srn f90301a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public static final BigDecimal f90302b = new BigDecimal(1000000);

    /* renamed from: c */
    public final askf f90303c;

    /* renamed from: d */
    public final atgf f90304d;

    /* renamed from: e */
    public final atam f90305e;

    public atgn(askf askf, atgf atgf) {
        this.f90303c = askf;
        this.f90304d = atgf;
        this.f90305e = new atam(askf);
    }

    /* renamed from: a */
    public static atgn m75827a(askf askf) {
        return new atgn(askf, atgf.m75807a(askf.f89126d));
    }

    /* renamed from: c */
    private final String[] m75830c(String str) {
        return new String[]{str, mo49961i(), mo49962j()};
    }

    /* renamed from: k */
    private final String m75832k() {
        return this.f90303c.f89124b;
    }

    /* renamed from: b */
    public final atgu mo49954b(String str) {
        return (atgu) atxr.m76515a(mo49958f(), atgj.f90296a, null, "SELECT * FROM SePaymentCards WHERE client_token_id=? AND account_id=? AND environment=?", m75830c(str));
    }

    /* renamed from: d */
    public final List mo49957d() {
        bngx b = this.f90304d.mo49943b(this.f90303c.f89124b);
        b.size();
        bnre i = b.listIterator();
        while (i.hasNext()) {
            CardInfo cardInfo = (CardInfo) i.next();
            cardInfo.getCid();
            cardInfo.getCardStatus();
            cardInfo.getCardPosition();
        }
        return b;
    }

    /* renamed from: f */
    public final SQLiteDatabase mo49958f() {
        return asko.m74292a(mo49959g()).mo49214a();
    }

    /* renamed from: g */
    public final Context mo49959g() {
        return this.f90303c.f89126d;
    }

    /* renamed from: h */
    public final String[] mo49960h() {
        return new String[]{mo49961i(), mo49962j()};
    }

    /* renamed from: i */
    public final String mo49961i() {
        return this.f90303c.f89123a;
    }

    /* renamed from: j */
    public final String mo49962j() {
        return this.f90303c.f89125c;
    }

    /* renamed from: a */
    public static atgu m75828a(Cursor cursor) {
        boolean z;
        atgt a = atgt.m75867a(cursor.getInt(cursor.getColumnIndex("network_id")));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("card"));
        try {
            btjk btjk = (btjk) GeneratedMessageLite.m124016a(btjk.f149119C, blob, bxus.m123744c());
            int i = cursor.getInt(cursor.getColumnIndex("pending_state"));
            String string = cursor.getString(cursor.getColumnIndex("activation_method"));
            String string2 = cursor.getString(cursor.getColumnIndex("bundle_id"));
            String string3 = cursor.getString(cursor.getColumnIndex("session_id"));
            byte[] blob2 = cursor.getBlob(cursor.getColumnIndex("bundle_handle"));
            if (cursor.getInt(cursor.getColumnIndex("is_default")) == 1) {
                z = true;
            } else {
                z = false;
            }
            return new atgu(btjk, i, a, string, string2, string3, blob2, z);
        } catch (bxwf e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static long m75831e() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: c */
    public final boolean mo49956c() {
        brfb a = this.f90304d.mo49938a(atgt.QUICPAY);
        return (a instanceof cijv) && ((cijv) a).f190473g;
    }

    /* renamed from: b */
    public final GetAllCardsResponse mo49955b() {
        List a = mo49946a();
        com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr = new com.google.android.gms.tapandpay.firstparty.CardInfo[a.size()];
        SparseArray sparseArray = new SparseArray(atgt.values().length);
        for (int i = 0; i < a.size(); i++) {
            atgu atgu = (atgu) a.get(i);
            cardInfoArr[i] = atgu.mo49971a();
            if (atgu.f90331h) {
                int i2 = atgu.f90326c.f90320e;
                btiy btiy = atgu.f90324a.f149123a;
                if (btiy == null) {
                    btiy = btiy.f149054c;
                }
                sparseArray.put(i2, btiy.f149056a);
            }
        }
        return new GetAllCardsResponse(cardInfoArr, this.f90303c.mo49209a(), null, null, sparseArray);
    }

    /* renamed from: a */
    public static Map m75829a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atgu atgu = (atgu) it.next();
            btiy btiy = atgu.f90324a.f149123a;
            if (btiy == null) {
                btiy = btiy.f149054c;
            }
            hashMap.put(btiy.f149056a, atgu);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final int mo49944a(atgt atgt) {
        brfb a = this.f90304d.mo49938a(atgt);
        if (a == null) {
            return 0;
        }
        if (mo49955b().mo59225a(atgt.f90320e) != null) {
            return 1;
        }
        if (a.mo60893a() <= 1) {
            return a.mo60894b() ? 2 : 4;
        }
        return 3;
    }

    /* renamed from: a */
    public final ContentValues mo49945a(btjk btjk, long j, int i, boolean z, String str, String str2, String str3, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        btiy btiy = btjk.f149123a;
        if (btiy == null) {
            btiy = btiy.f149054c;
        }
        contentValues.put("client_token_id", btiy.f149056a);
        contentValues.put("account_id", mo49961i());
        contentValues.put("environment", mo49962j());
        contentValues.put("card", btjk.serializeToBytes());
        contentValues.put("last_modified_s", Long.valueOf(j));
        int a = btjl.m116841a(btjk.f149127e);
        if (a == 0) {
            a = 1;
        }
        contentValues.put("network_id", Integer.valueOf(atyj.m76565b(a)));
        contentValues.put("pending_state", Integer.valueOf(i));
        contentValues.put("is_default", Boolean.valueOf(z));
        contentValues.put("activation_method", str);
        contentValues.put("bundle_id", str2);
        contentValues.put("session_id", str3);
        contentValues.put("bundle_handle", bArr);
        return contentValues;
    }

    /* renamed from: a */
    public final List mo49946a() {
        return atxr.m76517a(mo49958f(), atgi.f90295a, "SELECT * FROM SePaymentCards WHERE account_id=? AND environment=?", mo49960h());
    }

    /* renamed from: a */
    public final Map mo49947a(List list, List list2) {
        atgu atgu;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atgu atgu2 = (atgu) it.next();
            String str = atgu2.f90324a.f149147y;
            if (!str.isEmpty()) {
                hashMap.put(str, atgu2);
            }
        }
        bnha bnha = new bnha();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            CardInfo cardInfo = (CardInfo) list2.get(i);
            if (cardInfo.getCardPosition() == 0 && (atgu = (atgu) hashMap.get(cardInfo.getCid())) != null) {
                bnha.mo67695b(atgu.f90326c, atgu);
            }
        }
        return bnha.mo67618b();
    }

    /* renamed from: a */
    public final void mo49948a(String str, int i, int i2) {
        mo49949a(str, i, i2, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49949a(String str, int i, int i2, Boolean bool) {
        boolean z;
        long e = m75831e();
        SQLiteDatabase f = mo49958f();
        f.beginTransaction();
        try {
            atgu atgu = (atgu) atxr.m76515a(f, atgk.f90297a, null, "SELECT * FROM SePaymentCards WHERE client_token_id=? AND account_id=? AND environment=?", str, mo49961i(), mo49962j());
            if (atgu != null) {
                btjk btjk = atgu.f90324a;
                bxvd bxvd = (bxvd) btjk.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) btjk);
                bxvd da = btpr.f149879b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btpr) da.f164949b).f149881a = btpq.m117018a(i);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                btpr btpr = (btpr) da.mo74062i();
                btjk btjk2 = btjk.f149119C;
                btpr.getClass();
                ((btjk) bxvd.f164949b).f149134l = btpr;
                atgu.f90324a = (btjk) bxvd.mo74062i();
                if (bool == null) {
                    z = atgu.f90331h;
                } else {
                    z = bool.booleanValue();
                }
                f.update("SePaymentCards", mo49945a(atgu.f90324a, e, i2, z, atgu.f90327d, atgu.f90328e, atgu.f90329f, atgu.f90330g), "account_id=? AND environment=? AND client_token_id=?", new String[]{mo49961i(), mo49962j(), str});
                f.setTransactionSuccessful();
            }
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: a */
    public final boolean mo49950a(atgu atgu, boolean z) {
        boolean z2;
        int i = 1;
        try {
            atgf atgf = this.f90304d;
            String k = m75832k();
            String str = atgu.f90324a.f149147y;
            if (atgf.mo49941a(k)) {
                if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                    SQLiteDatabase writableDatabase = atgf.f90289h.mo49984a().getWritableDatabase();
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.putNull("defaultSlot");
                    int update = writableDatabase.update("Cards", contentValues, "defaultSlot = ? AND cardId = ?", new String[]{Integer.toString(0), str});
                    if (update != 0) {
                        writableDatabase.setTransactionSuccessful();
                    }
                    writableDatabase.endTransaction();
                    z2 = update != 0;
                } else {
                    atfs atfs = new atfs(str);
                    atgf.f90290i.mo69517a(k, atfs);
                    atgp atgp = (atgp) atfs.mo49935a();
                    z2 = (atgp == null || atgp.mo49964a().getCardPosition() == 0) ? false : true;
                }
                if (z2) {
                    if (!z) {
                        btpr btpr = atgu.f90324a.f149134l;
                        if (btpr == null) {
                            btpr = btpr.f149879b;
                        }
                        int b = btpq.m117019b(btpr.f149881a);
                        if (b != 0) {
                            i = b;
                        }
                    } else {
                        i = 6;
                    }
                    btiy btiy = atgu.f90324a.f149123a;
                    if (btiy == null) {
                        btiy = btiy.f149054c;
                    }
                    mo49949a(btiy.f149056a, i, 0, false);
                }
                atkl.f90415a.mo50008a();
                return z2;
            }
            throw new bres(atgf.f90281c);
        } catch (bres e) {
            bnsl bnsl = (bnsl) f90301a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error while disabling card");
            z2 = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    public final boolean mo49951a(btjk btjk) {
        boolean z;
        if (!btjk.f149147y.isEmpty()) {
            btpr btpr = btjk.f149134l;
            if (btpr == null) {
                btpr = btpr.f149879b;
            }
            int b = btpq.m117019b(btpr.f149881a);
            int i = 1;
            if (b != 0 && b == 5) {
                atgf atgf = this.f90304d;
                String str = this.f90303c.f89124b;
                String str2 = btjk.f149147y;
                if (atgf.mo49941a(str)) {
                    if (!((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                        atfq atfq = new atfq(str2);
                        atgf.f90290i.mo69517a(str, atfq);
                        atgp atgp = (atgp) ((Pair) atfq.mo49935a()).first;
                        if (atgp == null || !atgp.mo49964a().getCid().equals(str2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = atgf.f90289h.mo49984a().mo60899a(str2);
                    }
                    if (z) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("is_default", (Boolean) false);
                        SQLiteDatabase f = mo49958f();
                        String[] strArr = new String[4];
                        strArr[0] = mo49961i();
                        strArr[1] = mo49962j();
                        int a = btjl.m116841a(btjk.f149127e);
                        if (a == 0) {
                            a = 1;
                        }
                        strArr[2] = String.valueOf(atyj.m76565b(a));
                        strArr[3] = "1";
                        f.update("SePaymentCards", contentValues, "account_id=? AND environment=? AND network_id=? AND is_default=?", strArr);
                        btiy btiy = btjk.f149123a;
                        if (btiy == null) {
                            btiy = btiy.f149054c;
                        }
                        String str3 = btiy.f149056a;
                        btpr btpr2 = btjk.f149134l;
                        if (btpr2 == null) {
                            btpr2 = btpr.f149879b;
                        }
                        int b2 = btpq.m117019b(btpr2.f149881a);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        mo49949a(str3, b2, 0, true);
                    }
                    atkl.f90415a.mo50008a();
                    return z;
                }
                throw new bres(atgf.f90281c);
            }
            bnsl bnsl = (bnsl) f90301a.mo68388c();
            btpr btpr3 = btjk.f149134l;
            if (btpr3 == null) {
                btpr3 = btpr.f149879b;
            }
            int b3 = btpq.m117019b(btpr3.f149881a);
            if (b3 != 0) {
                i = b3;
            }
            bnsl.mo68409a("Card is not active: state=%s", btpq.m117018a(i));
            return false;
        }
        ((bnsl) f90301a.mo68388c()).mo68405a("Card has no CID");
        return false;
    }

    /* renamed from: a */
    public final boolean mo49952a(String str) {
        return atxr.m76519c(mo49958f(), "SELECT * FROM SePaymentCards WHERE client_token_id=? AND account_id=? AND environment=?", m75830c(str)) > 0;
    }

    /* renamed from: a */
    public final boolean mo49953a(String str, int i) {
        atgu b = mo49954b(str);
        if (b != null) {
            atgt atgt = b.f90326c;
            String str2 = b.f90324a.f149147y;
            try {
                if (cgwn.m147272v() && !TextUtils.isEmpty(str2)) {
                    bxvd da = btld.f149350e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btld btld = (btld) da.f164949b;
                    str2.getClass();
                    btld.f149354c = str2;
                    btld.f149355d = btnw.m116966a(i);
                    btiy btiy = b.f90324a.f149123a;
                    if (btiy == null) {
                        btiy = btiy.f149054c;
                    }
                    if (btiy.f149056a.isEmpty()) {
                        int i2 = atgt.f90322g;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btld btld2 = (btld) da.f164949b;
                        btld2.f149353b = Integer.valueOf(btod.m116976a(i2));
                        btld2.f149352a = 4;
                    } else {
                        btiy btiy2 = b.f90324a.f149123a;
                        if (btiy2 == null) {
                            btiy2 = btiy.f149054c;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btld btld3 = (btld) da.f164949b;
                        btiy2.getClass();
                        btld3.f149353b = btiy2;
                        btld3.f149352a = 3;
                    }
                    this.f90304d.mo49939a(m75832k(), atgt, b.f90324a.f149147y, ((C1680btle) atff.m75759a(this.f90303c, "t/cardtokenization/getsecureelementcredentialdeletiondata", da.mo74062i(), C1680btle.f149356b)).f149358a);
                }
                btiy btiy3 = b.f90324a.f149123a;
                if (btiy3 == null) {
                    btiy3 = btiy.f149054c;
                }
                String str3 = btiy3.f149056a;
                btpr btpr = b.f90324a.f149134l;
                if (btpr == null) {
                    btpr = btpr.f149879b;
                }
                int b2 = btpq.m117019b(btpr.f149881a);
                if (b2 == 0) {
                    b2 = 1;
                }
                mo49948a(str3, b2, 2);
                bxvd da2 = btkj.f149261d.mo74144da();
                btiy btiy4 = b.f90324a.f149123a;
                if (btiy4 == null) {
                    btiy4 = btiy.f149054c;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btkj btkj = (btkj) da2.f164949b;
                btiy4.getClass();
                btkj.f149263a = btiy4;
                btkj.f149264b = btnw.m116966a(i);
                if (!cgwn.m147272v()) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str2.getClass();
                    ((btkj) da2.f164949b).f149265c = str2;
                }
                btkk btkk = (btkk) atff.m75759a(this.f90303c, "t/cardtokenization/deletetoken", da2.mo74062i(), btkk.f149266b);
                if (!cgwn.m147272v() && !TextUtils.isEmpty(str2)) {
                    this.f90304d.mo49939a(m75832k(), atgt, b.f90324a.f149147y, btkk.f149268a);
                }
                btiy btiy5 = b.f90324a.f149123a;
                if (btiy5 == null) {
                    btiy5 = btiy.f149054c;
                }
                String str4 = btiy5.f149056a;
                mo49958f().execSQL("DELETE FROM SePaymentCards WHERE account_id=? AND environment=? AND client_token_id=?", new String[]{mo49961i(), mo49962j(), str4});
                return true;
            } catch (atfh e) {
                bnsl bnsl = (bnsl) f90301a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("RPC error deleting card");
                return false;
            } catch (bres e2) {
                bnsl bnsl2 = (bnsl) f90301a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("SPSDK Error deleting card");
                return false;
            } catch (IOException e3) {
                bnsl bnsl3 = (bnsl) f90301a.mo68387b();
                bnsl3.mo68437a(e3);
                bnsl3.mo68405a("Error deleting card");
                return false;
            } catch (JSONException e4) {
                bnsl bnsl4 = (bnsl) f90301a.mo68387b();
                bnsl4.mo68437a(e4);
                bnsl4.mo68405a("JSON Error deleting card");
                return false;
            }
        } else {
            ((bnsl) f90301a.mo68388c()).mo68405a("Card not found");
            return false;
        }
    }
}
