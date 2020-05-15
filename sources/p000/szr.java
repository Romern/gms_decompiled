package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: szr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szr {

    /* renamed from: a */
    public static final sek f45526a = tea.m36798a("storage_manager");

    /* renamed from: b */
    private static WeakReference f45527b = new WeakReference(null);

    /* renamed from: c */
    private static final String[] f45528c = {"phone_number", "verification_time", "imsi", "sim_readable_number", "state", "verification_method"};

    /* renamed from: d */
    private static final String[] f45529d = {"event_proto"};

    /* renamed from: a */
    public static final long m36688a(int i, int i2) {
        String str;
        szo a = szo.m36665a(rpr.m34216b());
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        if (i != -1) {
            try {
                StringBuilder sb = new StringBuilder(34);
                sb.append(" AND subscription_id = ");
                sb.append(i);
                str = sb.toString();
            } catch (SQLiteException e) {
                f45526a.mo25417e("Error getting successful deactivation signals count", e, new Object[0]);
                a.close();
                return -1;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 85);
        sb2.append("SELECT COUNT(*) FROM signals_events WHERE event_type = ");
        sb2.append(i2);
        sb2.append(" AND ");
        sb2.append(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL);
        sb2.append(" = 1");
        sb2.append(str);
        long simpleQueryForLong = readableDatabase.compileStatement(sb2.toString()).simpleQueryForLong();
        a.close();
        return simpleQueryForLong;
    }

    /* renamed from: b */
    public static final List m36696b() {
        f45526a.mo25409a("Getting all verified phone numbers and verification timestamp", new Object[0]);
        szo a = szo.m36665a(rpr.m34216b());
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        try {
            ArrayList arrayList = new ArrayList();
            Cursor query = readableDatabase.query(true, "sim_verifications", new String[]{"phone_number", "verification_time"}, "phone_number IS NOT NULL AND verification_time IS NOT NULL ", null, null, null, null, null);
            while (query.moveToNext()) {
                arrayList.add(Pair.create(query.getString(0), Long.valueOf(query.getLong(1))));
            }
            query.close();
            a.close();
            return arrayList;
        } catch (SQLiteException e) {
            f45526a.mo25417e("Error getting phone number and its verification time.", e, new Object[0]);
            throw new tdw(e.getMessage(), 41, false);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: c */
    public static final Map m36698c() {
        f45526a.mo25409a("Getting all verified phone numbers and imsis", new Object[0]);
        szo a = szo.m36665a(rpr.m34216b());
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        try {
            HashMap hashMap = new HashMap();
            Cursor query = readableDatabase.query("sim_verifications", new String[]{"imsi", "phone_number"}, "imsi IS NOT NULL AND phone_number IS NOT NULL AND state = ?", new String[]{"3"}, null, null, null);
            while (query.moveToNext()) {
                String string = query.getString(1);
                if (!hashMap.containsKey(string)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(query.getString(0));
                    hashMap.put(string, arrayList);
                } else {
                    ((List) hashMap.get(string)).add(query.getString(0));
                }
            }
            query.close();
            a.close();
            return hashMap;
        } catch (SQLiteException e) {
            f45526a.mo25417e("Error getting IMSIs", e, new Object[0]);
            throw new tdw(e.getMessage(), 41, false);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: d */
    public static final List m36699d() {
        cbqn cbqn;
        cbqn cbqn2;
        f45526a.mo25409a("Getting all sim verification", new Object[0]);
        szo a = szo.m36665a(rpr.m34216b());
        try {
            Cursor query = a.getReadableDatabase().query("sim_verifications", f45528c, null, null, null, null, null);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    cbqy cbqy = (cbqy) hashMap.get(string);
                    if (cbqy == null) {
                        hashMap.put(string, m36690a(query, string));
                    } else {
                        bxvd bxvd = (bxvd) cbqy.mo74142c(5);
                        bxvd.mo73625a((bxvk) cbqy);
                        cbqw cbqw = (cbqw) bxvd;
                        cbqz cbqz = cbqy.f178085c;
                        if (cbqz == null) {
                            cbqz = cbqz.f178091c;
                        }
                        bxvd bxvd2 = (bxvd) cbqz.mo74142c(5);
                        bxvd2.mo73625a((bxvk) cbqz);
                        cbqz cbqz2 = cbqy.f178085c;
                        if (cbqz2 == null) {
                            cbqz2 = cbqz.f178091c;
                        }
                        if (cbqz2.f178093a == 1) {
                            cbqn = (cbqn) cbqz2.f178094b;
                        } else {
                            cbqn = cbqn.f178043d;
                        }
                        bxvd bxvd3 = (bxvd) cbqn.mo74142c(5);
                        bxvd3.mo73625a((bxvk) cbqn);
                        cbqm cbqm = (cbqm) bxvd3;
                        cbqz cbqz3 = cbqy.f178085c;
                        if (cbqz3 == null) {
                            cbqz3 = cbqz.f178091c;
                        }
                        if (cbqz3.f178093a == 1) {
                            cbqn2 = (cbqn) cbqz3.f178094b;
                        } else {
                            cbqn2 = cbqn.f178043d;
                        }
                        cbqp cbqp = cbqn2.f178045a;
                        if (cbqp == null) {
                            cbqp = cbqp.f178048c;
                        }
                        bxvd bxvd4 = (bxvd) cbqp.mo74142c(5);
                        bxvd4.mo73625a((bxvk) cbqp);
                        cbqo cbqo = (cbqo) bxvd4;
                        cbqo.mo75242a(query.getString(2));
                        if (cbqm.f164950c) {
                            cbqm.mo74035c();
                            cbqm.f164950c = false;
                        }
                        cbqp cbqp2 = (cbqp) cbqo.mo74062i();
                        cbqn cbqn3 = cbqn.f178043d;
                        cbqp2.getClass();
                        ((cbqn) cbqm.f164949b).f178045a = cbqp2;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cbqz cbqz4 = (cbqz) bxvd2.f164949b;
                        cbqn cbqn4 = (cbqn) cbqm.mo74062i();
                        cbqn4.getClass();
                        cbqz4.f178094b = cbqn4;
                        cbqz4.f178093a = 1;
                        if (cbqw.f164950c) {
                            cbqw.mo74035c();
                            cbqw.f164950c = false;
                        }
                        cbqz cbqz5 = (cbqz) bxvd2.mo74062i();
                        cbqz5.getClass();
                        ((cbqy) cbqw.f164949b).f178085c = cbqz5;
                        hashMap.put(string, (cbqy) cbqw.mo74062i());
                    }
                } else {
                    arrayList.add(m36690a(query, (String) null));
                }
            }
            arrayList.addAll(hashMap.values());
            query.close();
            a.close();
            return arrayList;
        } catch (SQLiteException e) {
            f45526a.mo25417e("Error getting verifications", e, new Object[0]);
            throw new tdw(e.getMessage(), 41, false);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: e */
    public static final bngx m36700e() {
        f45526a.mo25409a("Getting all verified phone numbers", new Object[0]);
        szo a = szo.m36665a(rpr.m34216b());
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        try {
            bngs j = bngx.m109377j();
            Cursor query = readableDatabase.query(true, "sim_verifications", new String[]{"phone_number"}, "phone_number IS NOT NULL AND state = ?", new String[]{"3"}, null, null, null, null);
            while (query.moveToNext()) {
                j.mo67668c(query.getString(0));
            }
            query.close();
            bngx a2 = j.mo67664a();
            a.close();
            return a2;
        } catch (SQLiteException e) {
            f45526a.mo25417e("Error getting verified phone numbers", e, new Object[0]);
            throw new tdw(e.getMessage(), 41, false);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static final Cursor m36689a(SQLiteDatabase sQLiteDatabase, int i, int i2, int i3) {
        String[] strArr;
        String str;
        if (i2 != -1) {
            str = "event_type = ? AND subscription_id = ?";
            strArr = new String[]{String.valueOf(i), String.valueOf(i2)};
        } else {
            str = "event_type = ?";
            strArr = new String[]{String.valueOf(i)};
        }
        return sQLiteDatabase.query("signals_events", f45529d, str, strArr, null, null, "event_time DESC", String.valueOf(i3));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final List m36697b(int i) {
        f45526a.mo25409a("Getting all ServiceStateEvents for subscriptionId %d", Integer.valueOf(i));
        szo a = szo.m36665a(rpr.m34216b());
        try {
            Cursor a2 = m36689a(a.getReadableDatabase(), 2, i, (int) cdfn.f180658a.mo6606a().mo77419u());
            ArrayList arrayList = new ArrayList();
            while (a2.moveToNext()) {
                try {
                    arrayList.add((cbpb) bxvk.m124016a(cbpb.f177888i, a2.getBlob(0), bxus.m123744c()));
                } catch (bxwf e) {
                    f45526a.mo25417e("Error parsing ServiceStateEvent proto.", e, new Object[0]);
                }
            }
            a2.close();
            a.close();
            return arrayList;
        } catch (SQLiteException e2) {
            f45526a.mo25417e("Error getting ServiceStateEvents", e2, new Object[0]);
            a.close();
            return new ArrayList();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static cbqy m36690a(Cursor cursor, String str) {
        bxyk a = tdo.m36764a(cursor.getLong(1));
        String string = cursor.getString(2);
        String string2 = cursor.getString(3);
        int b = cbqx.m128116b(cursor.getInt(4));
        bxvd da = cbqz.f178091c.mo74144da();
        cbqo cbqo = (cbqo) cbqp.f178048c.mo74144da();
        List asList = Arrays.asList(string.split(","));
        if (cbqo.f164950c) {
            cbqo.mo74035c();
            cbqo.f164950c = false;
        }
        cbqp cbqp = (cbqp) cbqo.f164949b;
        cbqp.mo75243c();
        bxsy.m123078a(asList, cbqp.f178050a);
        if (!TextUtils.isEmpty(string2)) {
            if (cbqo.f164950c) {
                cbqo.mo74035c();
                cbqo.f164950c = false;
            }
            string2.getClass();
            ((cbqp) cbqo.f164949b).f178051b = string2;
        }
        cbqw cbqw = (cbqw) cbqy.f178081i.mo74144da();
        cbqm cbqm = (cbqm) cbqn.f178043d.mo74144da();
        if (cbqm.f164950c) {
            cbqm.mo74035c();
            cbqm.f164950c = false;
        }
        cbqp cbqp2 = (cbqp) cbqo.mo74062i();
        cbqp2.getClass();
        ((cbqn) cbqm.f164949b).f178045a = cbqp2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbqz cbqz = (cbqz) da.f164949b;
        cbqn cbqn = (cbqn) cbqm.mo74062i();
        cbqn.getClass();
        cbqz.f178094b = cbqn;
        cbqz.f178093a = 1;
        if (cbqw.f164950c) {
            cbqw.mo74035c();
            cbqw.f164950c = false;
        }
        cbqz cbqz2 = (cbqz) da.mo74062i();
        cbqz2.getClass();
        ((cbqy) cbqw.f164949b).f178085c = cbqz2;
        if (cbqw.f164950c) {
            cbqw.mo74035c();
            cbqw.f164950c = false;
        }
        ((cbqy) cbqw.f164949b).f178086d = cbqx.m128115a(b);
        if (b == 5) {
            bxvd da2 = cbra.f178095c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbra cbra = (cbra) da2.f164949b;
            str.getClass();
            cbra.f178097a = str;
            a.getClass();
            cbra.f178098b = a;
            if (cbqw.f164950c) {
                cbqw.mo74035c();
                cbqw.f164950c = false;
            }
            cbqy cbqy = (cbqy) cbqw.f164949b;
            cbra cbra2 = (cbra) da2.mo74062i();
            cbra2.getClass();
            cbqy.f178084b = cbra2;
            cbqy.f178083a = 3;
            bxvd da3 = cbqe.f178010c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            "verification_method".getClass();
            ((cbqe) da3.f164949b).f178012a = "verification_method";
            String string3 = cursor.getString(5);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            string3.getClass();
            ((cbqe) da3.f164949b).f178013b = string3;
            cbqe cbqe = (cbqe) da3.mo74062i();
            if (cbqw.f164950c) {
                cbqw.mo74035c();
                cbqw.f164950c = false;
            }
            cbqy cbqy2 = (cbqy) cbqw.f164949b;
            cbqe.getClass();
            cbqy2.mo75245c();
            cbqy2.f178088f.add(cbqe);
        }
        return (cbqy) cbqw.mo74062i();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final List m36691a(int i) {
        f45526a.mo25409a("Getting all CellularNetworkEvents for subscriptionId %d", Integer.valueOf(i));
        szo a = szo.m36665a(rpr.m34216b());
        try {
            Cursor a2 = m36689a(a.getReadableDatabase(), 1, i, (int) cdfn.f180658a.mo6606a().mo77408j());
            ArrayList arrayList = new ArrayList();
            while (a2.moveToNext()) {
                try {
                    arrayList.add((cbox) bxvk.m124016a(cbox.f177875g, a2.getBlob(0), bxus.m123744c()));
                } catch (bxwf e) {
                    f45526a.mo25417e("Error parsing CellularNetworkEvent proto.", e, new Object[0]);
                }
            }
            a2.close();
            a.close();
            return arrayList;
        } catch (SQLiteException e2) {
            f45526a.mo25417e("Error getting CellularNetworkEvents", e2, new Object[0]);
            a.close();
            return new ArrayList();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static synchronized szr m36692a() {
        szr szr;
        synchronized (szr.class) {
            szr = (szr) f45527b.get();
            if (szr == null) {
                szr = new szr();
                f45527b = new WeakReference(szr);
            }
        }
        return szr;
    }

    /* renamed from: a */
    public static final void m36693a(ContentValues contentValues) {
        szo a = szo.m36665a(rpr.m34216b());
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                writableDatabase.insert("signals_events", null, contentValues);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
                a.close();
            }
        } catch (SQLiteException e) {
            f45526a.mo25417e("Error getting writable database.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m36694a(String str, String[] strArr) {
        szo a = szo.m36665a(rpr.m34216b());
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                writableDatabase.delete("signals_events", str, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (SQLiteException e) {
                f45526a.mo25417e("Error deleting CellularNetworkEvents table.", e, new Object[0]);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                a.close();
                throw th;
            }
            writableDatabase.endTransaction();
            a.close();
        } catch (SQLiteException e2) {
            f45526a.mo25417e("Error getting writable database.", e2, new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m36695a(List list) {
        cbqn cbqn;
        cbqn cbqn2;
        cbqn cbqn3;
        cbra cbra;
        f45526a.mo25409a("Delete all and insert new verifications", new Object[0]);
        szo a = szo.m36665a(rpr.m34216b());
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                writableDatabase.delete("sim_verifications", null, null);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cbqy cbqy = (cbqy) it.next();
                    bmxy.m108600b(writableDatabase.inTransaction());
                    cbqz cbqz = cbqy.f178085c;
                    if (cbqz == null) {
                        cbqz = cbqz.f178091c;
                    }
                    if (cbqz.f178093a == 1) {
                        ArrayList<ContentValues> arrayList = new ArrayList();
                        cbqz cbqz2 = cbqy.f178085c;
                        if (cbqz2 == null) {
                            cbqz2 = cbqz.f178091c;
                        }
                        if (cbqz2.f178093a == 1) {
                            cbqn = (cbqn) cbqz2.f178094b;
                        } else {
                            cbqn = cbqn.f178043d;
                        }
                        cbqp cbqp = cbqn.f178045a;
                        if (cbqp == null) {
                            cbqp = cbqp.f178048c;
                        }
                        for (String str : cbqp.f178050a) {
                            ContentValues contentValues = new ContentValues();
                            if (cbqy.f178083a == 3) {
                                contentValues.put("phone_number", ((cbra) cbqy.f178084b).f178097a);
                                if (cbqy.f178083a == 3) {
                                    cbra = (cbra) cbqy.f178084b;
                                } else {
                                    cbra = cbra.f178095c;
                                }
                                bxyk bxyk = cbra.f178098b;
                                if (bxyk == null) {
                                    bxyk = bxyk.f165095c;
                                }
                                contentValues.put("verification_time", Long.valueOf(tdo.m36763a(bxyk)));
                            }
                            contentValues.put("imsi", str);
                            cbqz cbqz3 = cbqy.f178085c;
                            if (cbqz3 == null) {
                                cbqz3 = cbqz.f178091c;
                            }
                            if (cbqz3.f178093a == 1) {
                                cbqn2 = (cbqn) cbqz3.f178094b;
                            } else {
                                cbqn2 = cbqn.f178043d;
                            }
                            cbqp cbqp2 = cbqn2.f178045a;
                            if (cbqp2 == null) {
                                cbqp2 = cbqp.f178048c;
                            }
                            if (!cbqp2.f178051b.isEmpty()) {
                                cbqz cbqz4 = cbqy.f178085c;
                                if (cbqz4 == null) {
                                    cbqz4 = cbqz.f178091c;
                                }
                                if (cbqz4.f178093a == 1) {
                                    cbqn3 = (cbqn) cbqz4.f178094b;
                                } else {
                                    cbqn3 = cbqn.f178043d;
                                }
                                cbqp cbqp3 = cbqn3.f178045a;
                                if (cbqp3 == null) {
                                    cbqp3 = cbqp.f178048c;
                                }
                                contentValues.put("sim_readable_number", cbqp3.f178051b);
                            }
                            Iterator it2 = cbqy.f178088f.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                cbqe cbqe = (cbqe) it2.next();
                                if (cbqe.f178012a.equals("verification_method")) {
                                    contentValues.put("verification_method", cbqe.f178013b);
                                    break;
                                }
                            }
                            int b = cbqx.m128116b(cbqy.f178086d);
                            if (b == 0) {
                                b = 1;
                            }
                            contentValues.put("state", Integer.valueOf(cbqx.m128115a(b)));
                            arrayList.add(contentValues);
                        }
                        for (ContentValues contentValues2 : arrayList) {
                            writableDatabase.insert("sim_verifications", null, contentValues2);
                        }
                    } else {
                        throw new tdw("Illegal verification being saved", 39, false);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                a.close();
            } catch (SQLiteException e) {
                throw new tdw("Verification not stored", 41, true, e);
            } catch (SQLiteException e2) {
                try {
                    throw new tdw(e2.getMessage(), 41, true, e2);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    a.close();
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            throw new tdw("Couldn't update verification", 41, true, e3);
        }
    }
}
