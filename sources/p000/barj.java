package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: barj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class barj implements barw {

    /* renamed from: a */
    private final cayo f101605a;

    /* renamed from: b */
    private final cayo f101606b;

    /* renamed from: c */
    private final babr f101607c;

    /* renamed from: d */
    private final Map f101608d;

    /* renamed from: e */
    private final cayo f101609e;

    /* renamed from: f */
    private final cayo f101610f;

    /* renamed from: g */
    private final cayo f101611g;

    /* renamed from: h */
    private final bamg f101612h;

    /* renamed from: i */
    private final Object f101613i = new Object();

    /* renamed from: j */
    private Set f101614j;

    /* renamed from: k */
    private final bang f101615k;

    /* renamed from: l */
    private final bamj f101616l;

    public barj(cayo cayo, cayo cayo2, babr babr, bang bang, Map map, cayo cayo3, cayo cayo4, cayo cayo5, bamg bamg, bamj bamj) {
        this.f101605a = cayo;
        this.f101606b = cayo2;
        this.f101607c = babr;
        this.f101615k = bang;
        this.f101608d = map;
        this.f101609e = cayo3;
        this.f101610f = cayo4;
        this.f101612h = bamg;
        this.f101616l = bamj;
        this.f101611g = cayo5;
    }

    /* renamed from: a */
    private final String m87448a(bygz bygz) {
        return ((babq) this.f101608d.get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz);
    }

    /* renamed from: b */
    private final Map m87451b(bygw bygw) {
        bnha h = bnhe.m109414h();
        bxwc bxwc = bygw.f166400a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bygv bygv = (bygv) bxwc.get(i);
            bygz bygz = bygv.f166392c;
            if (bygz == null) {
                bygz = bygz.f166410c;
            }
            if (bygy.m124802a(bygz.f166412a) == bygy.CHANNELID_NOT_SET) {
                ((achw) this.f101605a.mo16713a()).mo25414c("Skipping wipeout for unknown channel", new Object[0]);
            } else if (!this.f101608d.containsKey(bygy.m124802a(bygz.f166412a))) {
                ((achw) this.f101605a.mo16713a()).mo25416d("Skipping wipeout for unsupported channel: ", bygy.m124802a(bygz.f166412a));
            } else {
                h.mo67695b(m87448a(bygz), bygv);
            }
        }
        return h.mo67618b();
    }

    /* renamed from: c */
    private final boolean m87452c(Account account, bygz bygz) {
        try {
            ((baqf) this.f101610f.mo16713a()).mo55872a(bygz, account);
            ((babs) ((Map) this.f101611g.mo16713a()).get(bygy.m124802a(bygz.f166412a))).mo55565a(account, bygz);
            for (baog baog : ((baok) this.f101609e.mo16713a()).mo55826a(account, bygz)) {
                ((baok) this.f101609e.mo16713a()).mo55829a(baog.mo55814a(), account, bygz, baoi.WIPEOUT);
            }
            return true;
        } catch (Exception e) {
            achw achw = (achw) this.f101605a.mo16713a();
            ((achw) this.f101605a.mo16713a()).mo25418e("Failed to wipe local state", new Object[0]);
            m87450a(e);
            return false;
        }
    }

    /* renamed from: a */
    private final void m87449a() {
        if (this.f101607c.mo32684f()) {
            this.f101616l.mo55758a();
            return;
        }
        try {
            this.f101612h.mo55754a();
        } catch (banv e) {
            ((achw) this.f101605a.mo16713a()).mo25418e("Failed to clear wipeout metadata", new Object[0]);
            m87450a(e);
        }
    }

    /* renamed from: a */
    private final void m87450a(Exception exc) {
        ((acdc) this.f101606b.mo16713a()).mo32707a("MDH wipeout failure", exc);
    }

    /* renamed from: a */
    public final void mo55910a(Account account, bygz bygz) {
        Object obj;
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        Account account2 = account;
        bygz bygz2 = bygz;
        if (!this.f101607c.mo32699u()) {
            String a = m87448a(bygz2);
            try {
                SQLiteDatabase c = this.f101615k.mo55801c();
                c.beginTransaction();
                try {
                    query2 = c.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, a}, null, null, null);
                    if (query2 == null) {
                        ((achw) this.f101605a.mo16713a()).mo25418e("Query to %s returned null cursor.", "wipeout");
                        m87449a();
                        m87450a(new NullPointerException("Cursor is null"));
                        c.endTransaction();
                        return;
                    }
                    if (!query2.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("account", account2.name);
                        contentValues.put("channel_key", a);
                        contentValues.put("channel_id", bygz.serializeToBytes());
                        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        c.insert("wipeout", null, contentValues);
                    } else if (query2.isNull(0)) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                        c.update("wipeout", contentValues2, "account = ? AND channel_key = ?", new String[]{account2.name, a});
                    }
                    c.setTransactionSuccessful();
                    query2.close();
                    c.endTransaction();
                    return;
                } catch (SQLiteException e) {
                    try {
                        ((achw) this.f101605a.mo16713a()).mo25418e("Failed to mark remote data persisted", new Object[0]);
                        if (this.f101607c.mo32698t()) {
                            m87449a();
                            m87450a(e);
                        } else {
                            throw e;
                        }
                    } catch (Throwable th3) {
                        c.endTransaction();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bqye.m113761a(th2, th4);
                }
            } catch (banv e2) {
                ((achw) this.f101605a.mo16713a()).mo25418e("Failed to mark remote data persisted", new Object[0]);
                m87449a();
                m87450a(e2);
                return;
            }
        } else {
            String a2 = m87448a(bygz2);
            try {
                SQLiteDatabase c2 = this.f101615k.mo55801c();
                try {
                    Object obj2 = this.f101613i;
                    synchronized (obj2) {
                        try {
                            Set set = this.f101614j;
                            if (set != null) {
                                set.add(barh.m87441a(account2, a2));
                            }
                            c2.beginTransaction();
                            try {
                                obj = obj2;
                                try {
                                    query = c2.query("wipeout", new String[]{"last_sync_timestamp"}, "account = ? AND channel_key = ?", new String[]{account2.name, a2}, null, null, null);
                                    if (query != null) {
                                        if (!query.moveToFirst()) {
                                            ContentValues contentValues3 = new ContentValues();
                                            contentValues3.put("account", account2.name);
                                            contentValues3.put("channel_key", a2);
                                            contentValues3.put("channel_id", bygz.serializeToBytes());
                                            contentValues3.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            c2.insert("wipeout", null, contentValues3);
                                        } else if (query.isNull(0)) {
                                            ContentValues contentValues4 = new ContentValues();
                                            contentValues4.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            c2.update("wipeout", contentValues4, "account = ? AND channel_key = ?", new String[]{account2.name, a2});
                                        }
                                        c2.setTransactionSuccessful();
                                        query.close();
                                        c2.endTransaction();
                                        return;
                                    }
                                    throw new SQLiteException("Cursor is null");
                                } catch (Throwable th5) {
                                    th = th5;
                                    c2.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj = obj2;
                                c2.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            throw th;
                        }
                    }
                } catch (SQLiteException e3) {
                    ((achw) this.f101605a.mo16713a()).mo25418e("Failed to mark remote data persisted", new Object[0]);
                    if (this.f101607c.mo32698t()) {
                        m87449a();
                        m87450a(e3);
                        return;
                    }
                    throw e3;
                }
            } catch (banv e4) {
                ((achw) this.f101605a.mo16713a()).mo25418e("Failed to mark remote data persisted", new Object[0]);
                m87449a();
                m87450a(e4);
                return;
            }
        }
        throw th;
        throw th2;
    }

    /* renamed from: b */
    public final void mo55913b(Account account, bygz bygz) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_timestamp", Long.valueOf(System.currentTimeMillis()));
        if (!this.f101607c.mo32699u()) {
            String a = m87448a(bygz);
            try {
                SQLiteDatabase c = this.f101615k.mo55801c();
                c.beginTransaction();
                try {
                    if (c.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, a}) == 0) {
                        ContentValues contentValues2 = new ContentValues(contentValues);
                        contentValues2.put("account", account.name);
                        contentValues2.put("channel_key", a);
                        contentValues2.put("channel_id", bygz.serializeToBytes());
                        c.insert("wipeout", null, contentValues2);
                    }
                    c.setTransactionSuccessful();
                } catch (SQLiteException e) {
                    ((achw) this.f101605a.mo16713a()).mo25418e("Failed to update wipeout data", new Object[0]);
                    if (this.f101607c.mo32698t()) {
                        m87449a();
                        m87450a(e);
                    } else {
                        throw e;
                    }
                } catch (Throwable th) {
                    c.endTransaction();
                    throw th;
                }
                c.endTransaction();
            } catch (banv e2) {
                ((achw) this.f101605a.mo16713a()).mo25417e("Failed to update wipeout data", e2, new Object[0]);
                m87449a();
                m87450a(e2);
            }
        } else {
            String a2 = m87448a(bygz);
            try {
                SQLiteDatabase c2 = this.f101615k.mo55801c();
                try {
                    synchronized (this.f101613i) {
                        Set set = this.f101614j;
                        if (set != null) {
                            set.add(barh.m87441a(account, a2));
                        }
                        try {
                            c2.beginTransaction();
                            if (c2.update("wipeout", contentValues, "account = ? AND channel_key = ?", new String[]{account.name, a2}) == 0) {
                                ContentValues contentValues3 = new ContentValues(contentValues);
                                contentValues3.put("account", account.name);
                                contentValues3.put("channel_key", a2);
                                contentValues3.put("channel_id", bygz.serializeToBytes());
                                c2.insert("wipeout", null, contentValues3);
                            }
                            c2.setTransactionSuccessful();
                        } finally {
                            c2.endTransaction();
                        }
                    }
                } catch (SQLiteException e3) {
                    ((achw) this.f101605a.mo16713a()).mo25418e("Failed to update wipeout data", new Object[0]);
                    if (this.f101607c.mo32698t()) {
                        m87449a();
                        m87450a(e3);
                        return;
                    }
                    throw e3;
                }
            } catch (banv e4) {
                ((achw) this.f101605a.mo16713a()).mo25417e("Failed to update wipeout data", e4, new Object[0]);
                m87449a();
                m87450a(e4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ((p000.achw) r14.f101605a.mo16713a()).mo25417e("Failed to parse channel id proto.", r15, new java.lang.Object[0]);
        m87449a();
        m87450a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r2 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        throw r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x002d, B:15:0x007a] */
    /* renamed from: a */
    public final void mo55911a(bygw bygw) {
        try {
            try {
                Cursor query = this.f101615k.mo55800a().query("wipeout", new String[]{"account", "channel_key", "last_sync_timestamp", "channel_id"}, "last_sync_timestamp IS NOT NULL", null, null, null, null);
                if (query == null) {
                    ((achw) this.f101605a.mo16713a()).mo25418e("Query to %s returned null cursor.", "wipeout");
                    m87449a();
                    m87450a(new NullPointerException("Cursor is null"));
                    return;
                }
                Map b = m87451b(bygw);
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    Account account = new Account(query.getString(0), "com.google");
                    bygv bygv = (bygv) b.get(query.getString(1));
                    Long valueOf = Long.valueOf(query.getLong(2));
                    if (bygv == null) {
                        m87452c(account, (bygz) GeneratedMessageLite.m124014a(bygz.f166410c, query.getBlob(3)));
                    } else if (System.currentTimeMillis() - valueOf.longValue() > TimeUnit.DAYS.toMillis((long) bygv.f166395f)) {
                        bygz bygz = bygv.f166392c;
                        if (bygz == null) {
                            bygz = bygz.f166410c;
                        }
                        m87452c(account, bygz);
                    }
                    query.moveToNext();
                }
                query.close();
            } catch (SQLiteException e) {
                ((achw) this.f101605a.mo16713a()).mo25418e("Failed to enforce wipeout policy", new Object[0]);
                if (this.f101607c.mo32698t()) {
                    m87449a();
                    m87450a(e);
                    return;
                }
                throw e;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } catch (banv e2) {
            ((achw) this.f101605a.mo16713a()).mo25418e("Failed to enforce wipeout policy", new Object[0]);
            m87449a();
            m87450a(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0173, code lost:
        r3 = r1.f101613i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0175, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r11.removeAll(r1.f101614j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r4 = r1.f101615k.mo55801c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x018c, code lost:
        if (r0.hasNext() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x018e, code lost:
        r5 = (p000.barh) r0.next();
        r4.delete("wipeout", "account = ? AND channel_key = ?", new java.lang.String[]{r5.mo55905a().name, r5.mo55906b()});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ac, code lost:
        r4.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        ((p000.achw) r1.f101605a.mo16713a()).mo25418e("Failed to remove wipeout entries", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01cb, code lost:
        if (r1.f101607c.mo32698t() != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01cd, code lost:
        m87449a();
        m87450a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01da, code lost:
        ((p000.achw) r1.f101605a.mo16713a()).mo25417e("Failed to remove wipeout entries", r0, new java.lang.Object[0]);
        m87449a();
        m87450a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0208, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x020b, code lost:
        monitor-enter(r1.f101613i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r1.f101614j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0210, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((p000.achw) r1.f101605a.mo16713a()).mo25418e("Query to %s returned null cursor.", "wipeout");
        m87449a();
        m87450a(new java.lang.NullPointerException("Cursor is null"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        r2 = r1.f101613i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.f101614j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = m87451b(r18);
        r3.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r3.isAfterLast() != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r4 = new android.accounts.Account(r3.getString(0), "com.google");
        r5 = r3.getString(1);
        r6 = (p000.bygv) r0.get(r5);
        r7 = java.lang.Long.valueOf(r3.getLong(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r6 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (m87452c(r4, (p000.bygz) p000.GeneratedMessageLite.m124014a(p000.bygz.f166410c, r3.getBlob(3))) == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r11.add(p000.barh.m87441a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        ((p000.achw) r1.f101605a.mo16713a()).mo25417e("Failed to parse channel id proto.", r0, new java.lang.Object[0]);
        m87449a();
        m87450a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        monitor-enter(r1.f101613i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1.f101614j = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f9, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis((long) r6.f166395f)) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fb, code lost:
        r7 = r6.f166392c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fd, code lost:
        if (r7 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r7 = p000.bygz.f166410c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (m87452c(r4, r7) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        r11.add(p000.barh.m87441a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        if (r19.contains(r4) != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        r6 = r6.f166392c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        if (r6 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        r6 = p000.bygz.f166410c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        if (m87452c(r4, r6) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        r11.add(p000.barh.m87441a(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012b, code lost:
        r3.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0144, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0147, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0168, code lost:
        m87449a();
        m87450a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016e, code lost:
        if (r3 != null) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0200 A[SYNTHETIC, Splitter:B:146:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0204 A[SYNTHETIC, Splitter:B:150:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0168 A[Catch:{ all -> 0x0201 }] */
    /* renamed from: a */
    public final void mo55912a(bygw bygw, Set set) {
        Cursor cursor;
        Object obj;
        if (this.f101607c.mo32699u()) {
            try {
                SQLiteDatabase a = this.f101615k.mo55800a();
                HashSet hashSet = new HashSet();
                Set set2 = null;
                try {
                    synchronized (this.f101613i) {
                        try {
                            if (this.f101614j == null) {
                                this.f101614j = new HashSet();
                                cursor = a.query("wipeout", new String[]{"account", "channel_key", "last_sync_timestamp", "channel_id"}, "last_sync_timestamp IS NOT NULL", null, null, null, null);
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("Concurrent wipeout is not allowed.");
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = null;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    cursor = null;
                    try {
                        ((achw) this.f101605a.mo16713a()).mo25418e("Failed to enforce wipeout policy", new Object[0]);
                        if (!this.f101607c.mo32698t()) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (banv e2) {
                ((achw) this.f101605a.mo16713a()).mo25418e("Failed to enforce wipeout policy", new Object[0]);
                m87449a();
                m87450a(e2);
                return;
            }
        } else {
            mo55911a(bygw);
            return;
        }
        this.f101614j = null;
        synchronized (this.f101613i) {
            this.f101614j = null;
        }
    }
}
