package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.secard.FelicaCardStateSyncTaskOperation;
import com.google.android.gms.tapandpay.secard.SeTransactionSyncTaskOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: atds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atds {

    /* renamed from: d */
    private static final srn f90149d = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: e */
    private static final AtomicInteger f90150e = new AtomicInteger();

    /* renamed from: a */
    public final atdz f90151a;

    /* renamed from: b */
    public final atgn f90152b;

    /* renamed from: c */
    public final atgf f90153c;

    /* renamed from: f */
    private final askf f90154f;

    private atds(atdz atdz, atgn atgn, askf askf) {
        this.f90151a = atdz;
        this.f90152b = atgn;
        this.f90154f = askf;
        this.f90153c = atgf.m75807a(askf.f89126d);
    }

    /* renamed from: a */
    public static atds m75666a(askf askf) {
        return new atds(new atdz(askf), atgn.m75827a(askf), askf);
    }

    /* renamed from: f */
    private final Context m75669f() {
        return this.f90154f.f89126d;
    }

    /* renamed from: g */
    private final String m75671g() {
        return this.f90154f.f89123a;
    }

    /* renamed from: h */
    private final String m75672h() {
        return this.f90154f.f89125c;
    }

    /* renamed from: b */
    public final asil mo49851b(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
        byte[] b = atxr.m76518b(sQLiteDatabase, "SELECT proto FROM ActivationMethodLimits WHERE billing_id=? AND account_id=? AND environment=? AND activation_method_handle=?", new String[]{str, m75671g(), m75672h(), Base64.encodeToString(bArr, 0)});
        if (b != null) {
            try {
                return (asil) bxvk.m124016a(asil.f89046d, b, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f90149d.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atds", "b", 704, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error parsing activation method limit");
            }
        }
        return asil.f89046d;
    }

    /* renamed from: c */
    public final void mo49857c() {
        mo49848a(true);
    }

    /* renamed from: d */
    public final void mo49859d() {
        mo49854b(true);
    }

    /* renamed from: e */
    public final SQLiteDatabase mo49861e() {
        return asko.m74292a(m75669f()).mo49214a();
    }

    /* renamed from: f */
    private final void m75670f(String str) {
        mo49846a(mo49861e(), str, new byte[0]);
    }

    /* renamed from: c */
    public final boolean mo49858c(String str) {
        atdz atdz = this.f90151a;
        return atdz.mo49875a(atdz.mo49886d(), str);
    }

    /* renamed from: d */
    public final void mo49860d(String str) {
        SQLiteDatabase e = mo49861e();
        e.beginTransaction();
        try {
            m75670f(str);
            e.execSQL("DELETE FROM ActivationMethodLimits WHERE billing_id=? AND account_id=? AND environment=?", new String[]{str, m75671g(), m75672h()});
            e.setTransactionSuccessful();
        } finally {
            e.endTransaction();
        }
    }

    /* renamed from: e */
    public final void mo49862e(String str) {
        try {
            m75670f(str);
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90149d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atds", "e", 604, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error clearing selected activation method");
        }
    }

    /* renamed from: a */
    public static void m75667a(Context context) {
        atdz.m75704b(context);
    }

    /* renamed from: a */
    public static byte[] m75668a(atds atds, String str) {
        bxvd da = btjf.f149105c.mo74144da();
        bxtx a = bxtx.m123261a(atea.m75731a(atds.f90154f));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btjf) da.f164949b).f149107a = a;
        btjq[] btjqArr = (btjq[]) ((btjg) atff.m75759a(atds.f90154f, "t/untokenizedcards/list", (btjf) da.mo74062i(), btjg.f149109e)).f149111a.toArray(new btjq[0]);
        for (btjq btjq : btjqArr) {
            if (str.equals(btjq.f149164a)) {
                return btjq.mo73642k();
            }
        }
        return null;
    }

    /* renamed from: b */
    public final CardInfo mo49852b() {
        return this.f90151a.mo49879b().f90168a;
    }

    /* renamed from: b */
    public final CardInfo mo49853b(String str) {
        CardInfo b = this.f90151a.mo49880b(str);
        if (b != null || !this.f90153c.mo49940a()) {
            return b;
        }
        atgu b2 = this.f90152b.mo49954b(str);
        if (b2 != null) {
            return b2.mo49971a();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06b3, code lost:
        if (r9 == 13) goto L_0x06b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ea A[SYNTHETIC, Splitter:B:140:0x02ea] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x062f A[Catch:{ all -> 0x0608, all -> 0x0624 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0645 A[Catch:{ atfh -> 0x06d3, all -> 0x0692, all -> 0x068d, all -> 0x06e1 }] */
    /* renamed from: b */
    public final void mo49854b(boolean z) {
        SQLiteDatabase d;
        boolean z2;
        boolean z3;
        SQLiteDatabase e;
        boolean z4;
        boolean z5;
        SQLiteDatabase f;
        boolean z6;
        com.felicanetworks.mfc.mfi.CardInfo cardInfo;
        Iterator it;
        com.felicanetworks.mfc.mfi.CardInfo cardInfo2;
        boolean z7;
        boolean z8;
        Map map;
        int i;
        boolean z9;
        boolean z10;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        boolean z11;
        int i2;
        boolean z12;
        boolean z13;
        com.felicanetworks.mfc.mfi.CardInfo cardInfo3;
        int i3;
        boolean z14;
        long j;
        f90150e.incrementAndGet();
        try {
            synchronized (atds.class) {
                try {
                    btje btje = (btje) atff.m75759a(this.f90154f, "t/tokenizedcards/list", btjd.f149100a, btje.f149102b);
                    for (btjk btjk : btje.f149104a) {
                        String str4 = btjk.f149128f;
                        if (btjk.f149134l == null) {
                            btpr btpr = btpr.f149879b;
                        }
                        String str5 = btjk.f149131i;
                    }
                    btjk[] btjkArr = (btjk[]) btje.f149104a.toArray(new btjk[0]);
                    int length = btjkArr.length;
                    ArrayList<btjk> arrayList = new ArrayList(length);
                    ArrayList<btjk> arrayList2 = new ArrayList(length);
                    for (btjk btjk2 : btjkArr) {
                        int a = btjl.m116841a(btjk2.f149127e);
                        if (a != 0) {
                            if (a == 12) {
                                arrayList2.add(btjk2);
                            }
                        }
                        int a2 = btjl.m116841a(btjk2.f149127e);
                        if (a2 == 0) {
                        }
                        arrayList.add(btjk2);
                    }
                    atdz atdz = this.f90151a;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    d = atdz.mo49886d();
                    d.beginTransaction();
                    List a3 = atdz.mo49870a(d);
                    Map a4 = atdz.m75702a(a3);
                    int i4 = 4;
                    if (a4.size() == arrayList.size()) {
                        for (btjk btjk3 : arrayList) {
                            btiy btiy = btjk3.f149123a;
                            if (btiy == null) {
                                btiy = btiy.f149054c;
                            }
                            atdt atdt = (atdt) a4.get(btiy.f149056a);
                            if (atdt != null) {
                                if (!atdt.f90155a.equals(btjk3)) {
                                }
                            }
                        }
                        d.endTransaction();
                        z2 = false;
                        if (z) {
                            try {
                                if (this.f90153c.mo49940a()) {
                                    atgn atgn = this.f90152b;
                                    long e2 = atgn.m75831e();
                                    List a5 = atgn.mo49946a();
                                    if (arrayList2.isEmpty() && a5.isEmpty()) {
                                        z4 = z2;
                                        z5 = false;
                                    } else {
                                        Map a6 = atgn.m75829a(a5);
                                        for (btjk btjk4 : arrayList2) {
                                            btiy btiy2 = btjk4.f149123a;
                                            if (btiy2 == null) {
                                                btiy2 = btiy.f149054c;
                                            }
                                            if (!a6.containsKey(btiy2.f149056a)) {
                                                atgn.mo49959g().startService(asju.m74251a(atgn.f90303c, btjk4.f149131i));
                                            }
                                        }
                                        try {
                                            List<com.felicanetworks.mfc.mfi.CardInfo> d2 = atgn.mo49957d();
                                            atgn.f90305e.mo49737a(2, 4);
                                            HashMap hashMap = new HashMap();
                                            for (com.felicanetworks.mfc.mfi.CardInfo cardInfo4 : d2) {
                                                hashMap.put(cardInfo4.getCid(), cardInfo4);
                                            }
                                            List<atgu> a7 = atgn.mo49946a();
                                            for (atgu atgu : a7) {
                                                if (!(!atgu.f90331h || (cardInfo3 = (com.felicanetworks.mfc.mfi.CardInfo) hashMap.get(atgu.f90324a.f149147y)) == null || cardInfo3.getCardPosition() == 0)) {
                                                    if (atgu.f90326c != atgt.QUICPAY) {
                                                        i3 = 3;
                                                    } else {
                                                        i3 = 2;
                                                    }
                                                    atam atam = atgn.f90305e;
                                                    bxvd g = atam.mo49765g(142);
                                                    bxvd da = boyo.f135332d.mo74144da();
                                                    if (da.f164950c) {
                                                        da.mo74035c();
                                                        da.f164950c = false;
                                                    }
                                                    boyo boyo = (boyo) da.f164949b;
                                                    boyo.f135335b = i3 - 1;
                                                    int i5 = boyo.f135334a | 1;
                                                    boyo.f135334a = i5;
                                                    boyo.f135336c = 1;
                                                    boyo.f135334a = i5 | 2;
                                                    if (g.f164950c) {
                                                        g.mo74035c();
                                                        g.f164950c = false;
                                                    }
                                                    bpbx bpbx = (bpbx) g.f164949b;
                                                    boyo boyo2 = (boyo) da.mo74062i();
                                                    bpbx bpbx2 = bpbx.f135635S;
                                                    boyo2.getClass();
                                                    bpbx.f135647K = boyo2;
                                                    bpbx.f135656b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                    atam.mo49741a((bpbx) g.mo74062i());
                                                }
                                            }
                                            f = atgn.mo49958f();
                                            f.beginTransaction();
                                            Map a8 = atgn.m75829a(a7);
                                            f.execSQL("DELETE FROM SePaymentCards WHERE account_id=? AND environment=?", atgn.mo49960h());
                                            Iterator it2 = arrayList2.iterator();
                                            boolean z15 = false;
                                            boolean z16 = false;
                                            while (it2.hasNext()) {
                                                btjk btjk5 = (btjk) it2.next();
                                                btiy btiy3 = btjk5.f149123a;
                                                if (btiy3 == null) {
                                                    btiy3 = btiy.f149054c;
                                                }
                                                atgu atgu2 = (atgu) a8.get(btiy3.f149056a);
                                                if (atgu2 != null) {
                                                    if (btjk5.f149147y.isEmpty()) {
                                                        bxvd bxvd = (bxvd) btjk5.mo74142c(5);
                                                        bxvd.mo73625a((bxvk) btjk5);
                                                        String str6 = atgu2.f90324a.f149147y;
                                                        it = it2;
                                                        if (bxvd.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd.f164950c = false;
                                                        }
                                                        btjk btjk6 = btjk.f149119C;
                                                        str6.getClass();
                                                        ((btjk) bxvd.f164949b).f149147y = str6;
                                                        btjk5 = (btjk) bxvd.mo74062i();
                                                    } else {
                                                        it = it2;
                                                    }
                                                    a7.remove(atgu2);
                                                } else {
                                                    it = it2;
                                                }
                                                if (!btjk5.f149147y.isEmpty()) {
                                                    cardInfo2 = (com.felicanetworks.mfc.mfi.CardInfo) hashMap.get(btjk5.f149147y);
                                                } else {
                                                    cardInfo2 = null;
                                                }
                                                if (cardInfo2 == null || cardInfo2.getCardPosition() != 0) {
                                                    z7 = false;
                                                } else {
                                                    z7 = true;
                                                }
                                                if (atgu2 != null) {
                                                    map = a8;
                                                    int i6 = atgu2.f90325b;
                                                    if (cardInfo2 != null) {
                                                        z8 = z2;
                                                        if (cardInfo2.getCardStatus() == 2) {
                                                            ((bnsl) atgn.f90301a.mo68390d()).mo68405a("Lost card detected");
                                                            z13 = true;
                                                            i2 = 2;
                                                        } else {
                                                            i2 = i6;
                                                            z13 = false;
                                                        }
                                                        int i7 = atgu2.f90325b;
                                                        if (i7 != 0) {
                                                            z11 = z13;
                                                            if (i7 != 1) {
                                                                if (!(i7 == 2 || i7 == 3)) {
                                                                    if (i7 != 4) {
                                                                        StringBuilder sb = new StringBuilder(29);
                                                                        sb.append("unexpected state: ");
                                                                        sb.append(i7);
                                                                        throw new AssertionError(sb.toString());
                                                                    }
                                                                }
                                                                z11 = true;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                        } else {
                                                            z11 = z13;
                                                            btpr btpr2 = btjk5.f149134l;
                                                            if (btpr2 == null) {
                                                                btpr2 = btpr.f149879b;
                                                            }
                                                            int b = btpq.m117019b(btpr2.f149881a);
                                                            if (b != 0) {
                                                                if (b == 6 && cardInfo2.getCardPosition() == 0) {
                                                                    i2 = 3;
                                                                    z11 = true;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        z8 = z2;
                                                        if (i6 != 1) {
                                                            ((bnsl) atgn.f90301a.mo68390d()).mo68405a("Third party deletion detected");
                                                            i2 = 2;
                                                            z11 = true;
                                                        } else {
                                                            i2 = i6;
                                                            z11 = false;
                                                        }
                                                    }
                                                    if (atyj.m76563a(btjk5, atgu2.f90324a) && i2 == atgu2.f90325b && z7 == atgu2.f90331h) {
                                                        z12 = false;
                                                    } else {
                                                        z12 = true;
                                                    }
                                                    i = i2;
                                                    z9 = z12;
                                                    z10 = z11;
                                                } else {
                                                    map = a8;
                                                    z8 = z2;
                                                    z10 = false;
                                                    z9 = true;
                                                    i = cardInfo2 == null ? 1 : 0;
                                                }
                                                if (atgu2 != null) {
                                                    str = atgu2.f90327d;
                                                } else {
                                                    str = null;
                                                }
                                                if (atgu2 != null) {
                                                    str2 = atgu2.f90328e;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (atgu2 != null) {
                                                    str3 = atgu2.f90329f;
                                                } else {
                                                    str3 = null;
                                                }
                                                if (atgu2 != null) {
                                                    bArr = atgu2.f90330g;
                                                } else {
                                                    bArr = null;
                                                }
                                                if (btjk5.f149134l == null) {
                                                    btpr btpr3 = btpr.f149879b;
                                                }
                                                f.insertOrThrow("SePaymentCards", null, atgn.mo49945a(btjk5, e2, i, z7, str, str2, str3, bArr));
                                                atgm atgm = new atgm(z9, z10);
                                                z15 = z6 | atgm.f90299a;
                                                z16 |= atgm.f90300b;
                                                it2 = it;
                                                a8 = map;
                                                z2 = z8;
                                            }
                                            z4 = z2;
                                            boolean z17 = z16;
                                            for (atgu atgu3 : a7) {
                                                if (!atgu3.f90324a.f149147y.isEmpty()) {
                                                    cardInfo = (com.felicanetworks.mfc.mfi.CardInfo) hashMap.get(atgu3.f90324a.f149147y);
                                                } else {
                                                    cardInfo = null;
                                                }
                                                if (cardInfo != null) {
                                                    f.insertOrThrow("SePaymentCards", null, atgn.mo49945a(atgu3.f90324a, e2, 2, atgu3.f90331h, atgu3.f90327d, atgu3.f90328e, atgu3.f90329f, atgu3.f90330g));
                                                    z6 = true;
                                                    z17 = true;
                                                } else {
                                                    z6 = true;
                                                }
                                            }
                                            f.setTransactionSuccessful();
                                            f.endTransaction();
                                            if (z17) {
                                                FelicaCardStateSyncTaskOperation.m93095b(atgn.mo49959g());
                                            }
                                            if (z6) {
                                                askf askf = atgn.f90303c;
                                                Context context = askf.f89126d;
                                                askf.mo49209a();
                                                SeTransactionSyncTaskOperation.m93098a(context, atgn.f90304d, atgn);
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                        } catch (bres e3) {
                                            z4 = z2;
                                            bnsl bnsl = (bnsl) atgn.f90301a.mo68387b();
                                            bnsl.mo68437a(e3);
                                            bnsl.mo68405a("Error retrieving list of cards from MFI");
                                            z5 = false;
                                        }
                                    }
                                    z3 = z4 | z5;
                                    if (!z3) {
                                        m75669f().startService(asju.m74251a(this.f90154f, (String) null));
                                        atkl.f90415a.mo50008a();
                                    }
                                    e = mo49861e();
                                    e.beginTransaction();
                                    e.execSQL("DELETE FROM ActivationMethodLimits WHERE account_id=? AND environment=? AND billing_id NOT IN (SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? UNION SELECT billing_id FROM SePaymentCards WHERE account_id=? AND environment=?)", new Object[]{m75671g(), m75672h(), m75671g(), m75672h(), m75671g(), m75672h()});
                                    e.setTransactionSuccessful();
                                    e.endTransaction();
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        z3 = z2;
                        if (!z3) {
                        }
                        e = mo49861e();
                        e.beginTransaction();
                        e.execSQL("DELETE FROM ActivationMethodLimits WHERE account_id=? AND environment=? AND billing_id NOT IN (SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? UNION SELECT billing_id FROM SePaymentCards WHERE account_id=? AND environment=?)", new Object[]{m75671g(), m75672h(), m75671g(), m75672h(), m75671g(), m75672h()});
                        e.setTransactionSuccessful();
                        e.endTransaction();
                    }
                    String b2 = atdz.mo49881b(d, elapsedRealtime);
                    d.execSQL("DELETE FROM PaymentCards WHERE account_id=? AND environment=?", atdz.mo49885c());
                    for (btjk btjk7 : arrayList) {
                        String str7 = b2;
                        btiy btiy4 = btjk7.f149123a;
                        if (btiy4 == null) {
                            btiy4 = btiy.f149054c;
                        }
                        atdt atdt2 = (atdt) a4.get(btiy4.f149056a);
                        long j2 = elapsedRealtime;
                        ContentValues contentValues = new ContentValues();
                        List list = a3;
                        contentValues.put("account_id", atdz.mo49890f());
                        contentValues.put("environment", atdz.mo49891g());
                        contentValues.put("card", btjk7.mo73642k());
                        btiy btiy5 = btjk7.f149123a;
                        if (btiy5 == null) {
                            btiy5 = btiy.f149054c;
                        }
                        contentValues.put("billing_id", btiy5.f149056a);
                        contentValues.put("last_modified", Long.valueOf(currentTimeMillis));
                        btpr btpr4 = btjk7.f149134l;
                        if (btpr4 == null) {
                            btpr4 = btpr.f149879b;
                        }
                        int b3 = btpq.m117019b(btpr4.f149881a);
                        if (b3 == 0) {
                            b3 = 1;
                        }
                        contentValues.put("token_state", Integer.valueOf(btpq.m117018a(b3)));
                        contentValues.put("should_present", Boolean.valueOf(btjk7.f149122B));
                        if (atdt2 != null) {
                            contentValues.put("is_selected", Boolean.valueOf(atdt2.mo49863a()));
                            contentValues.put("activation_method", atdt2.f90156b);
                            j = currentTimeMillis;
                            contentValues.put("last_tap_timestamp", Long.valueOf(atdt2.f90158d));
                        } else {
                            j = currentTimeMillis;
                        }
                        d.insertOrThrow("PaymentCards", null, contentValues);
                        b2 = str7;
                        elapsedRealtime = j2;
                        a3 = list;
                        currentTimeMillis = j;
                        i4 = 4;
                    }
                    Object[] objArr = new Object[i4];
                    objArr[0] = atdz.mo49890f();
                    objArr[1] = atdz.mo49891g();
                    objArr[2] = atdz.mo49890f();
                    objArr[3] = atdz.mo49891g();
                    d.execSQL("DELETE FROM PaymentBundles WHERE account_id=? AND environment=? AND bundle_id NOT IN (SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=?)", objArr);
                    atdz.mo49882b(d);
                    String b4 = atdz.mo49881b(d, elapsedRealtime);
                    d.setTransactionSuccessful();
                    d.endTransaction();
                    if (a4.size() == arrayList.size()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z2 = false;
                                break;
                            }
                            btjk btjk8 = (btjk) it3.next();
                            btiy btiy6 = btjk8.f149123a;
                            if (btiy6 == null) {
                                btiy6 = btiy.f149054c;
                            }
                            atdt atdt3 = (atdt) a4.get(btiy6.f149056a);
                            if (atdt3 != null) {
                                if (!atyj.m76563a(btjk8, atdt3.f90155a)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    boolean z18 = !Objects.equals(b2, b4);
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z14 = false;
                            break;
                        }
                        btjk btjk9 = (btjk) it4.next();
                        btpr btpr5 = btjk9.f149134l;
                        if (btpr5 == null) {
                            btpr5 = btpr.f149879b;
                        }
                        int b5 = btpq.m117019b(btpr5.f149881a);
                        if (b5 != 0 && b5 == 5) {
                            btiy btiy7 = btjk9.f149123a;
                            if (btiy7 == null) {
                                btiy7 = btiy.f149054c;
                            }
                            atdt atdt4 = (atdt) a4.get(btiy7.f149056a);
                            if (!(atdt4 == null || !atdt4.f90157c || atdt4.mo49866d() == 5)) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    if (z18) {
                        asuc.getInstance().mo49500a(atdz.mo49888e(), "syncCards");
                    }
                    atam atam2 = new atam(atdz.f90167b);
                    Map a9 = atdz.m75702a(a3);
                    for (btjk btjk10 : arrayList) {
                        btiy btiy8 = btjk10.f149123a;
                        if (btiy8 == null) {
                            btiy8 = btiy.f149054c;
                        }
                        atdt atdt5 = (atdt) a9.get(btiy8.f149056a);
                        btpr btpr6 = btjk10.f149134l;
                        if (btpr6 == null) {
                            btpr6 = btpr.f149879b;
                        }
                        int b6 = btpq.m117019b(btpr6.f149881a);
                        if (b6 != 0) {
                            if (b6 == 5 && atdt5 != null && atdt5.mo49866d() == 6) {
                                atam2.mo49741a(atam2.mo49735a(21, atdt5.mo49865c()));
                            }
                        }
                        btpr btpr7 = btjk10.f149134l;
                        if (btpr7 == null) {
                            btpr7 = btpr.f149879b;
                        }
                        int b7 = btpq.m117019b(btpr7.f149881a);
                        if (b7 != 0 && b7 == 6 && atdt5 != null && atdt5.mo49866d() == 5) {
                            atam2.mo49741a(atam2.mo49735a(20, atdt5.mo49865c()));
                        }
                    }
                    atbq atbq = new atbq();
                    askf askf2 = atdz.f90167b;
                    atbq.mo49781a();
                    String str8 = askf2.f89123a;
                    String str9 = askf2.f89125c;
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = "ready_for_pickup";
                    objArr2[1] = "requested";
                    objArr2[2] = str8;
                    objArr2[3] = str9;
                    objArr2[i4] = str8;
                    objArr2[5] = str9;
                    objArr2[6] = 3;
                    if (atxr.m76514a(atbm.m75382a(askf2.f89126d), "UPDATE PaymentBundles SET bundle_state = ? WHERE bundle_state = ? AND account_id = ? AND environment = ? AND bundle_id IN (SELECT billing_id FROM PaymentCards WHERE account_id = ? and environment = ? AND token_state = ?)", objArr2) <= 0) {
                        if (!z14) {
                            z2 = true;
                            if (z) {
                            }
                            z3 = z2;
                            if (!z3) {
                            }
                            e = mo49861e();
                            e.beginTransaction();
                            e.execSQL("DELETE FROM ActivationMethodLimits WHERE account_id=? AND environment=? AND billing_id NOT IN (SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? UNION SELECT billing_id FROM SePaymentCards WHERE account_id=? AND environment=?)", new Object[]{m75671g(), m75672h(), m75671g(), m75672h(), m75671g(), m75672h()});
                            e.setTransactionSuccessful();
                            e.endTransaction();
                        }
                    }
                    atbq.mo49783a(askf2.f89126d, askf2.f89125c);
                    z2 = true;
                    if (z) {
                    }
                    z3 = z2;
                    if (!z3) {
                    }
                    e = mo49861e();
                    e.beginTransaction();
                    e.execSQL("DELETE FROM ActivationMethodLimits WHERE account_id=? AND environment=? AND billing_id NOT IN (SELECT billing_id FROM PaymentCards WHERE account_id=? AND environment=? UNION SELECT billing_id FROM SePaymentCards WHERE account_id=? AND environment=?)", new Object[]{m75671g(), m75672h(), m75671g(), m75672h(), m75671g(), m75672h()});
                    e.setTransactionSuccessful();
                    e.endTransaction();
                } catch (atfh e4) {
                    new askt().mo49218a(this.f90154f, e4.f90231a);
                    throw e4;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } finally {
            f90150e.decrementAndGet();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final btiy mo49843a(String str) {
        boolean z;
        btjk a = this.f90151a.mo49868a(str);
        if (a == null && this.f90153c.mo49940a()) {
            atgu b = this.f90152b.mo49954b(str);
            a = b != null ? b.f90324a : null;
        }
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "no card with this id found");
        btiy btiy = a.f149123a;
        return btiy == null ? btiy.f149054c : btiy;
    }

    /* renamed from: a */
    public final CardInfo mo49844a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            CardInfo[] cardInfoArr = mo49845a().f108369a;
            for (CardInfo cardInfo : cardInfoArr) {
                if (str.equals(cardInfo.f108353n) && cardInfo.f108345f.f108458a.f108457b == i) {
                    return cardInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final GetAllCardsResponse mo49845a() {
        GetAllCardsResponse a = this.f90151a.mo49869a();
        if (!this.f90153c.mo49940a()) {
            return a;
        }
        GetAllCardsResponse b = this.f90152b.mo49955b();
        CardInfo[] cardInfoArr = a.f108369a;
        int length = cardInfoArr.length;
        int length2 = b.f108369a.length;
        CardInfo[] cardInfoArr2 = (CardInfo[]) Arrays.copyOf(cardInfoArr, length + length2);
        System.arraycopy(b.f108369a, 0, cardInfoArr2, length, length2);
        return new GetAllCardsResponse(cardInfoArr2, a.f108370b, a.f108371c, a.f108372d, b.f108373e);
    }

    /* renamed from: a */
    public final void mo49846a(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
        atdz atdz = this.f90151a;
        String[] strArr = {str, atdz.mo49890f(), atdz.mo49891g()};
        ContentValues contentValues = new ContentValues();
        contentValues.put("activation_method", Base64.encodeToString(bArr, 0));
        if (sQLiteDatabase.update("PaymentCards", contentValues, "billing_id=? AND account_id=? AND environment=?", strArr) <= 0 && this.f90153c.mo49940a()) {
            atgn atgn = this.f90152b;
            String[] strArr2 = {str, atgn.mo49961i(), atgn.mo49962j()};
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("activation_method", Base64.encodeToString(bArr, 0));
            sQLiteDatabase.update("SePaymentCards", contentValues2, "client_token_id=? AND account_id=? AND environment=?", strArr2);
        }
    }

    /* renamed from: a */
    public final void mo49847a(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr, asil asil) {
        String encodeToString = Base64.encodeToString(bArr, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", m75671g());
        contentValues.put("environment", m75672h());
        contentValues.put("billing_id", str);
        contentValues.put("activation_method_handle", encodeToString);
        contentValues.put("proto", asil.mo73642k());
        if (sQLiteDatabase.update("ActivationMethodLimits", contentValues, "billing_id=? AND account_id=? AND environment=? AND activation_method_handle=?", new String[]{str, m75671g(), m75672h(), encodeToString}) == 0) {
            sQLiteDatabase.insert("ActivationMethodLimits", null, contentValues);
        }
    }

    /* renamed from: a */
    public final void mo49848a(boolean z) {
        snp.m35704b(9).execute(new atdr(this, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r2 != null) goto L_0x0031;
     */
    /* renamed from: a */
    public final boolean mo49849a(long j) {
        if (f90150e.get() > 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        atdz atdz = this.f90151a;
        Cursor rawQuery = atdz.mo49886d().rawQuery("SELECT min(last_modified) from PaymentCards where account_id=? AND environment=?", atdz.mo49885c());
        try {
            long j2 = 0;
            if (rawQuery.moveToFirst()) {
                j2 = rawQuery.getLong(0);
            }
            rawQuery.close();
            if (currentTimeMillis - j2 < j) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo49850a(String str, byte[] bArr) {
        asii asii = mo49851b(mo49861e(), str, bArr).f89049b;
        return asii != null && asii.f89038b >= asii.f89037a;
    }

    /* renamed from: b */
    public final boolean mo49855b(String str, int i) {
        boolean z = false;
        if (this.f90151a.mo49868a(str) == null) {
            z = this.f90152b.mo49953a(str, i);
        } else {
            atdz atdz = this.f90151a;
            SQLiteDatabase d = atdz.mo49886d();
            atdt b = atdz.mo49878b(d, str);
            if (b == null) {
                bnsl bnsl = (bnsl) atdz.f90166a.mo68387b();
                bnsl.mo68432a("atdz", "a", 699, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("blockingDeleteToken error: card not found");
            } else {
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
                    atff.m75759a(atdz.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b);
                    atdz.mo49873a(str, d);
                    z = true;
                } catch (atfh e) {
                    atdz.mo49873a(str, d);
                } catch (IOException e2) {
                    d.beginTransaction();
                    srn srn = atbm.f90004a;
                    askf askf = atdz.f90167b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("bundle_state", "deleted");
                    contentValues.putNull("bundle_info");
                    contentValues.putNull("acknowledged_bundle");
                    contentValues.putNull("bundle_handle");
                    contentValues.putNull("encryption_parameters");
                    atbm.m75390a(askf.f89123a, askf.f89125c, str, contentValues, d);
                    atdz.mo49882b(d);
                    d.setTransactionSuccessful();
                    d.endTransaction();
                    atbq.m75407a(atdz.f90167b.f89126d);
                } catch (Throwable th) {
                    d.endTransaction();
                    throw th;
                }
                atdz.mo49872a(b, "blockingDeleteToken");
            }
        }
        mo49860d(str);
        atkl.f90415a.mo50008a();
        return z;
    }

    /* renamed from: b */
    public final boolean mo49856b(String str, byte[] bArr) {
        asij asij = mo49851b(mo49861e(), str, bArr).f89048a;
        return asij != null && asij.f89042b >= asij.f89041a;
    }
}
