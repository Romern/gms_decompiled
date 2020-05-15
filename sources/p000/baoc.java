package p000;

import android.accounts.Account;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: baoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baoc implements baok {

    /* renamed from: a */
    private static final String[] f101386a = {"app_id", "account", "channel", "value"};

    /* renamed from: b */
    private final Object f101387b = new Object();

    /* renamed from: c */
    private final cayo f101388c;

    /* renamed from: d */
    private final cayo f101389d;

    /* renamed from: e */
    private final barb f101390e;

    /* renamed from: f */
    private final Map f101391f;

    /* renamed from: g */
    private final cayo f101392g;

    /* renamed from: h */
    private final cayo f101393h;

    /* renamed from: i */
    private final babr f101394i;

    /* renamed from: j */
    private final bang f101395j;

    public baoc(cayo cayo, cayo cayo2, barb barb, bang bang, Map map, cayo cayo3, cayo cayo4, babr babr) {
        this.f101388c = cayo;
        this.f101389d = cayo2;
        this.f101390e = barb;
        this.f101395j = bang;
        this.f101391f = map;
        this.f101392g = cayo3;
        this.f101393h = cayo4;
        this.f101394i = babr;
    }

    /* renamed from: a */
    private final baog m87252a(String str, Account account, bygz bygz, baoa baoa) {
        byjh byjh;
        bygx bygx;
        baoa baoa2 = baoa;
        try {
            Cursor query = this.f101395j.mo55800a().query("subscription", new String[]{"value"}, "app_id = ? AND account = ? AND channel = ?", new String[]{str, account.name, m87253a(bygz)}, null, null, null);
            baog baog = null;
            if (query == null) {
                return null;
            }
            try {
                query.moveToFirst();
                if (query.isAfterLast()) {
                    achw achw = (achw) this.f101388c.mo16713a();
                    if (!this.f101394i.mo32677I()) {
                        achw.mo25414c("No subscription found for %s", str);
                    } else {
                        if (baoa2 == baoa.GET) {
                            ((bads) this.f101389d.mo16713a()).mo32744a(10021, baqz.m87422a(bygz));
                        }
                        achw.mo25414c("No subscription found for %s from %s", str, baoa2);
                    }
                } else {
                    byjb byjb = (byjb) bxvk.m124014a(byjb.f166629h, query.getBlob(0));
                    byjh byjh2 = byjb.f166632b;
                    if (byjh2 != null) {
                        byjh = byjh2;
                    } else {
                        byjh = byjh.f166649h;
                    }
                    bygx bygx2 = byjb.f166633c;
                    if (bygx2 != null) {
                        bygx = bygx2;
                    } else {
                        bygx = bygx.f166401c;
                    }
                    baog = baog.m87266a(str, account, bygz, byjh, bygx, byjb.f166635e, byjb.f166636f, byjb.f166637g);
                }
                query.close();
                return baog;
            } catch (bxwf e) {
                throw new baoh("Couldn't parse SubscriptionValue.", e);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (banv e2) {
            throw new baoh("Error accessing subscription database", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2 A[SYNTHETIC, Splitter:B:33:0x00f2] */
    /* renamed from: b */
    private final baog m87254b(String str, Account account, bygz bygz, byjh byjh, bygx bygx) {
        String str2 = str;
        Account account2 = account;
        bygz bygz2 = bygz;
        try {
            SQLiteStatement compileStatement = this.f101395j.mo55801c().compileStatement("INSERT OR REPLACE INTO subscription VALUES (?,?,?,?)");
            try {
                bxvd da = byjb.f166629h.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byjb byjb = (byjb) da.f164949b;
                byjh.getClass();
                byjb.f166632b = byjh;
                int i = byjb.f166631a | 1;
                byjb.f166631a = i;
                bygx.getClass();
                byjb.f166633c = bygx;
                int i2 = i | 2;
                byjb.f166631a = i2;
                bygz.getClass();
                byjb.f166634d = bygz2;
                byjb.f166631a = i2 | 4;
                if (((Boolean) acaw.f59302af.mo32596a()).booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byjb byjb2 = (byjb) da.f164949b;
                    byjb2.f166631a |= 32;
                    byjb2.f166637g = currentTimeMillis;
                    try {
                        int intValue = ((Integer) this.f101390e.mo32621a()).intValue();
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byjb byjb3 = (byjb) da.f164949b;
                            int i3 = byjb3.f166631a | 16;
                            byjb3.f166631a = i3;
                            byjb3.f166636f = intValue;
                            byjb3.f166631a = i3 | 8;
                            byjb3.f166635e = elapsedRealtime;
                        } catch (IOException e) {
                            e = e;
                            ((acdc) this.f101392g.mo16713a()).mo32707a("Failed to retrieve boot count", e);
                            compileStatement.bindString(1, str2);
                            compileStatement.bindString(2, account2.name);
                            compileStatement.bindString(3, m87253a(bygz2));
                            compileStatement.bindBlob(4, ((byjb) da.mo74062i()).mo73642k());
                            if (compileStatement.executeInsert() != -1) {
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        ((acdc) this.f101392g.mo16713a()).mo32707a("Failed to retrieve boot count", e);
                        compileStatement.bindString(1, str2);
                        compileStatement.bindString(2, account2.name);
                        compileStatement.bindString(3, m87253a(bygz2));
                        compileStatement.bindBlob(4, ((byjb) da.mo74062i()).mo73642k());
                        if (compileStatement.executeInsert() != -1) {
                        }
                    }
                }
                compileStatement.bindString(1, str2);
                compileStatement.bindString(2, account2.name);
                compileStatement.bindString(3, m87253a(bygz2));
                compileStatement.bindBlob(4, ((byjb) da.mo74062i()).mo73642k());
                if (compileStatement.executeInsert() != -1) {
                    return baog.m87266a(str, account, bygz, byjh, bygx, -1, -1, -1);
                }
                throw new baoh(String.format(Locale.ENGLISH, "Failed to set subscription for app=%s, account=%s, channel=%s", str2, account2, bygz2));
            } finally {
                compileStatement.close();
            }
        } catch (banv e3) {
            throw new baoh("Error accessing subscription database", e3);
        }
    }

    /* renamed from: a */
    private final String m87253a(bygz bygz) {
        return ((babq) this.f101391f.get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz);
    }

    /* renamed from: a */
    public final List mo55825a() {
        try {
            Cursor query = this.f101395j.mo55800a().query("subscription", f101386a, null, null, null, null, null);
            if (query == null) {
                return Collections.emptyList();
            }
            bngs j = bngx.m109377j();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    byjb byjb = (byjb) bxvk.m124014a(byjb.f166629h, query.getBlob(3));
                    Account account = new Account(string2, "com.google");
                    bygz bygz = byjb.f166634d;
                    if (bygz == null) {
                        bygz = bygz.f166410c;
                    }
                    byjh byjh = byjb.f166632b;
                    if (byjh == null) {
                        byjh = byjh.f166649h;
                    }
                    bygx bygx = byjb.f166633c;
                    if (bygx == null) {
                        bygx = bygx.f166401c;
                    }
                    j.mo67668c(baog.m87266a(string, account, bygz, byjh, bygx, byjb.f166635e, byjb.f166636f, byjb.f166637g));
                    query.moveToNext();
                }
                query.close();
                return j.mo67664a();
            } catch (bxwf e) {
                throw new baoh("Couldn't parse SubscriptionValue.", e);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (banv e2) {
            throw new baoh("Error accessing subscription database", e2);
        }
    }

    /* renamed from: b */
    public final baog mo55832b(String str, Account account, bygz bygz) {
        return m87252a(str, account, bygz, baoa.GET);
    }

    /* renamed from: a */
    public final List mo55826a(Account account, bygz bygz) {
        bygx bygx;
        try {
            Cursor query = this.f101395j.mo55800a().query("subscription", new String[]{"app_id", "value"}, "account = ? AND channel = ?", new String[]{account.name, m87253a(bygz)}, null, null, null);
            if (query == null) {
                return Collections.emptyList();
            }
            bngs j = bngx.m109377j();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    byjb byjb = (byjb) bxvk.m124014a(byjb.f166629h, query.getBlob(1));
                    byjh byjh = byjb.f166632b;
                    if (byjh == null) {
                        byjh = byjh.f166649h;
                    }
                    bygx bygx2 = byjb.f166633c;
                    if (bygx2 != null) {
                        bygx = bygx2;
                    } else {
                        bygx = bygx.f166401c;
                    }
                    j.mo67668c(baog.m87266a(string, account, bygz, byjh, bygx, byjb.f166635e, byjb.f166636f, byjb.f166637g));
                    query.moveToNext();
                }
                query.close();
                return j.mo67664a();
            } catch (bxwf e) {
                throw new baoh("Couldn't parse SubscriptionValue.", e);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (banv e2) {
            throw new baoh("Error accessing subscription database", e2);
        }
    }

    /* renamed from: a */
    public final void mo55827a(Account account, baoi baoi) {
        if (this.f101394i.mo32677I() && baoi != null) {
            achw achw = (achw) this.f101388c.mo16713a();
            ((achw) this.f101388c.mo16713a()).mo25414c("Deleting user subscriptions (reason=%s)", baoi);
        }
        synchronized (this.f101387b) {
            try {
                this.f101395j.mo55801c().delete("subscription", "account = ?", new String[]{account.name});
            } catch (banv e) {
                throw new baoh("Error accessing subscription database", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo55828a(String str, Account account, bygz bygz) {
        if ("com.google".equals(account.type)) {
            synchronized (this.f101387b) {
                baog a = m87252a(str, account, bygz, baoa.REFRESH);
                if (a != null) {
                    m87254b(str, account, bygz, a.mo55817d(), a.mo55818e());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }

    /* renamed from: a */
    public final void mo55829a(String str, Account account, bygz bygz, baoi baoi) {
        baog a;
        if (this.f101394i.mo32677I() && baoi != null) {
            achw achw = (achw) this.f101388c.mo16713a();
            ((achw) this.f101388c.mo16713a()).mo25414c("Deleting subscription (app=%s, reason=%s)", str, baoi);
        }
        synchronized (this.f101387b) {
            try {
                a = m87252a(str, account, bygz, baoa.DELETE);
                this.f101395j.mo55801c().delete("subscription", "app_id = ? AND account = ? AND channel = ?", new String[]{str, account.name, m87253a(bygz)});
            } catch (banv e) {
                throw new baoh("Error accessing subscription database", e);
            }
        }
        if (!ceny.f183130a.mo6606a().mo79475a() || a != null) {
            for (baoj baoj : (Set) this.f101393h.mo16713a()) {
                baoj.mo32729a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo55830a(String str, Account account, bygz bygz, byjh byjh, bygx bygx) {
        baog a;
        baog baog;
        if ("com.google".equals(account.type)) {
            synchronized (this.f101387b) {
                a = m87252a(str, account, bygz, baoa.SUBSCRIBE);
                if (a != null && a.mo55818e().equals(bygx)) {
                    if (a.mo55817d().equals(byjh)) {
                        baog = a;
                    }
                }
                baog = m87254b(str, account, bygz, byjh, bygx);
            }
            for (baoj baoj : (Set) this.f101393h.mo16713a()) {
                baoj.mo32730a(a, baog);
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }

    /* renamed from: a */
    public final void mo55831a(String str, baoi baoi) {
        if (this.f101394i.mo32677I() && baoi != null) {
            ((achw) this.f101388c.mo16713a()).mo25414c("Deleting app subscriptions (app=%s, reason=%s)", str, baoi);
        }
        synchronized (this.f101387b) {
            try {
                this.f101395j.mo55801c().delete("subscription", "app_id = ?", new String[]{str});
            } catch (banv e) {
                throw new baoh("Error accessing subscription database", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
