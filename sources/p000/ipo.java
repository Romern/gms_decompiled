package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: ipo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipo implements eia, isv {

    /* renamed from: a */
    static final byte[] f21518a = "hashedPk".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    public static final Logger f21519c = new Logger(new String[]{"CryptauthDatabaseOperation"}, (byte[]) null);

    /* renamed from: b */
    public final Context f21520b;

    public ipo(Context context) {
        this.f21520b = context;
    }

    /* renamed from: a */
    public static Cursor m15816a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2) {
        return sQLiteDatabase.query(true, str, strArr, str2, strArr2, null, null, null, null);
    }

    /* renamed from: b */
    static byte[] m15820b(Cursor cursor) {
        return sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("public_key")));
    }

    /* renamed from: c */
    static byte[] m15821c(Cursor cursor) {
        return sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("private_key")));
    }

    /* renamed from: d */
    static byte[] m15822d(Cursor cursor) {
        return sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("key_handle")));
    }

    /* renamed from: e */
    public static ehc m15823e(Cursor cursor) {
        return ehc.m10410a(cursor.getInt(cursor.getColumnIndexOrThrow("key_form")));
    }

    /* renamed from: f */
    public static bqmb m15824f(Cursor cursor) {
        return bqmb.m112991a(cursor.getString(cursor.getColumnIndexOrThrow("key_type")));
    }

    /* renamed from: g */
    public static ehp m15825g(Cursor cursor) {
        return ehp.m10432a(cursor.getInt(cursor.getColumnIndexOrThrow("active_status")));
    }

    /* renamed from: h */
    public static String m15826h(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("account"));
    }

    /* renamed from: i */
    static String m15827i(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("key_name"));
    }

    /* renamed from: j */
    public static long m15828j(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow("expiration_time"));
    }

    /* renamed from: k */
    public static long m15829k(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow("creation_time"));
    }

    /* renamed from: l */
    public static int m15830l(Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("exportable"));
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new ehy("Unrecognized value");
    }

    /* renamed from: m */
    public static final void m15831m(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static final itb m15817a(Cursor cursor, String str, String str2) {
        isz isz = new isz();
        isz.f21649d = str2;
        isz.f21648c = str;
        while (!cursor.isAfterLast()) {
            m15822d(cursor);
            byte[] a = m15819a(cursor);
            bqmb f = m15824f(cursor);
            try {
                ehp g = m15825g(cursor);
                ita ita = new ita(a, f, m15829k(cursor), m15828j(cursor));
                if (!g.equals(ehp.ACTIVE_KEY)) {
                    isz.f21646a.add(ita);
                } else {
                    isz.f21647b = ita;
                }
                cursor.moveToNext();
            } catch (ehy e) {
                f21519c.mo25415d(String.format("invalid attributes. key=%s", str), e, new Object[0]);
                cursor.moveToNext();
            }
        }
        bmxy.m108581a(isz.f21647b);
        bmxy.m108581a(isz.f21648c);
        bmxy.m108581a(isz.f21649d);
        return new itb(isz.f21646a, isz.f21647b);
    }

    /* renamed from: b */
    public final isy mo13221b(String str, Account account) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        int i;
        String str2 = str;
        Account account2 = account;
        f21519c.mo25412b("Querying signing active keys for [keyname=%s] and [account=%s].", str2, account2.name);
        ipp a = ipp.m15839a(this.f21520b);
        if (ccfj.m129447c()) {
            try {
                sQLiteDatabase = a.getReadableDatabase();
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new isu(valueOf.length() == 0 ? new String("failed to open db ") : "failed to open db ".concat(valueOf));
            }
        } else {
            sQLiteDatabase = a.getReadableDatabase();
        }
        sQLiteDatabase.beginTransaction();
        try {
            cursor = m15816a(sQLiteDatabase, "keys", new String[]{"key_handle", "key_type", "private_key", "public_key", "creation_time", "expiration_time", "exportable"}, "key_name = ? AND account = ? AND active_status = ? AND key_form = ?", new String[]{str2, account2.name, Integer.toString(ehp.ACTIVE_KEY.f14994e), Integer.toString(ehc.ASYMMETRIC_KEY.f14909e)});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        if (cursor.getCount() == 1) {
                            byte[] d = m15822d(cursor);
                            byte[] b = m15820b(cursor);
                            byte[] c = m15821c(cursor);
                            long j = m15828j(cursor);
                            long k = m15829k(cursor);
                            bqmb f = m15824f(cursor);
                            i = m15830l(cursor);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase2 = sQLiteDatabase;
                            try {
                                isy isy = new isy(str, d, b, c, f, ehp.ACTIVE_KEY, i, account2.name, k, j);
                                sQLiteDatabase2.endTransaction();
                                m15831m(cursor);
                                a.close();
                                return isy;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase2.endTransaction();
                                m15831m(cursor);
                                a.close();
                                throw th;
                            }
                        } else {
                            sQLiteDatabase2 = sQLiteDatabase;
                            int count = cursor.getCount();
                            StringBuilder sb = new StringBuilder(36);
                            sb.append("Found ");
                            sb.append(count);
                            sb.append(" keys. Should be 1.");
                            throw new isu(sb.toString());
                        }
                    }
                } catch (ehy e2) {
                    f21519c.mo25410a((Throwable) e2);
                    i = 1;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase2.endTransaction();
                    m15831m(cursor);
                    a.close();
                    throw th;
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
            sb2.append("No key for keyName=");
            sb2.append(str2);
            sb2.append(" found.");
            throw new isu(sb2.toString());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
            cursor = null;
            sQLiteDatabase2.endTransaction();
            m15831m(cursor);
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m15818a(ContentValues contentValues, ehp ehp) {
        contentValues.put("active_status", Integer.valueOf(ehp.f14994e));
    }

    /* renamed from: a */
    public static byte[] m15819a(Cursor cursor) {
        return sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("master_key")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0082=Splitter:B:25:0x0082, B:34:0x00cc=Splitter:B:34:0x00cc} */
    /* renamed from: a */
    public final ehr mo13217a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        Cursor cursor;
        int i;
        ehr ehr;
        int i2;
        String[] strArr2;
        int i3;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        try {
            Cursor a = m15816a(sQLiteDatabase2, "keys", new String[]{"key_handle", "private_key", "public_key", "creation_time", "expiration_time", "exportable"}, str2, strArr);
            if (a == null) {
                i = 0;
            } else {
                try {
                    if (a.moveToFirst()) {
                        try {
                            KeyPair keyPair = new KeyPair(ehv.m10473c(m15820b(a)), ehv.m10474d(m15821c(a)));
                            byte[] d = m15822d(a);
                            long k = m15829k(a);
                            long j = m15828j(a);
                            try {
                                i3 = m15830l(a);
                            } catch (ehy e) {
                                f21519c.mo25410a((Throwable) e);
                                i3 = 1;
                            }
                            i2 = 0;
                            try {
                                ehr = new ehr("PublicKey", str, d, bqmb.P256, ehp.ACTIVE_KEY, i3, keyPair, k, j);
                            } catch (InvalidKeySpecException e2) {
                                f21519c.mo25416d("Deleting invalid Authzen's PublicKey from db", new Object[i2]);
                                ehc ehc = ehc.ASYMMETRIC_KEY;
                                strArr2 = new String[3];
                                strArr2[i2] = "PublicKey";
                                strArr2[1] = str;
                                strArr2[2] = Integer.toString(ehc.f14909e);
                                if (sQLiteDatabase2.delete("keys", "key_name = ? AND account = ? AND key_form = ?", strArr2) > 0) {
                                    Logger Logger = f21519c;
                                    Object[] objArr = new Object[2];
                                    objArr[i2] = "PublicKey";
                                    objArr[1] = str;
                                    Logger.mo25412b("No rows found for [key=%s account=%s]", objArr);
                                    ehr = null;
                                } else {
                                    Logger logger2 = f21519c;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[i2] = "PublicKey";
                                    objArr2[1] = str;
                                    logger2.mo25412b("Deleted corrupted keys [key=%s account=%s]", objArr2);
                                    ehr = null;
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                m15831m(a);
                                return ehr;
                            }
                        } catch (InvalidKeySpecException e3) {
                            i2 = 0;
                            f21519c.mo25416d("Deleting invalid Authzen's PublicKey from db", new Object[i2]);
                            ehc ehc2 = ehc.ASYMMETRIC_KEY;
                            strArr2 = new String[3];
                            strArr2[i2] = "PublicKey";
                            strArr2[1] = str;
                            strArr2[2] = Integer.toString(ehc2.f14909e);
                            if (sQLiteDatabase2.delete("keys", "key_name = ? AND account = ? AND key_form = ?", strArr2) > 0) {
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            m15831m(a);
                            return ehr;
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        m15831m(a);
                        return ehr;
                    }
                    i = 0;
                } catch (Throwable th) {
                    th = th;
                    cursor = a;
                    m15831m(cursor);
                    throw th;
                }
            }
            f21519c.mo25418e("No key exists", new Object[i]);
            m15831m(a);
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m15831m(cursor);
            throw th;
        }
    }

    /* renamed from: a */
    public final isy mo13218a(byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        ehp ehp;
        int i;
        String d = sqd.m35972d(bArr);
        f21519c.mo25412b("Querying signing active keys for [keyHandle=%s].", d);
        ipp a = ipp.m15839a(this.f21520b);
        if (ccfj.m129447c()) {
            try {
                sQLiteDatabase = a.getReadableDatabase();
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new isu(valueOf.length() == 0 ? new String("failed to open db ") : "failed to open db ".concat(valueOf));
            }
        } else {
            sQLiteDatabase = a.getReadableDatabase();
        }
        sQLiteDatabase.beginTransaction();
        try {
            cursor = m15816a(sQLiteDatabase, "keys", new String[]{"key_name", "key_handle", "key_type", "account", "private_key", "public_key", "creation_time", "expiration_time", "exportable", "active_status"}, "key_handle = ? AND key_form = ?", new String[]{d, Integer.toString(ehc.ASYMMETRIC_KEY.f14909e)});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        if (cursor.getCount() == 1) {
                            String i2 = m15827i(cursor);
                            String h = m15826h(cursor);
                            byte[] b = m15820b(cursor);
                            byte[] c = m15821c(cursor);
                            long j = m15828j(cursor);
                            long k = m15829k(cursor);
                            bqmb f = m15824f(cursor);
                            ehp = m15825g(cursor);
                            try {
                                i = m15830l(cursor);
                            } catch (ehy e2) {
                                f21519c.mo25410a((Throwable) e2);
                                i = 1;
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            isy isy = new isy(i2, bArr, b, c, f, ehp, i, h, k, j);
                            sQLiteDatabase.endTransaction();
                            m15831m(cursor);
                            a.close();
                            return isy;
                        }
                        int count = cursor.getCount();
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Found ");
                        sb.append(count);
                        sb.append(" keys. Should be 1.");
                        throw new isu(sb.toString());
                    }
                } catch (ehy e3) {
                    f21519c.mo25410a((Throwable) e3);
                    ehp = ehp.UNKNOWN_KEY;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase.endTransaction();
                    m15831m(cursor);
                    a.close();
                    throw th;
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 28);
            sb2.append("No key for keyHandle=");
            sb2.append(d);
            sb2.append(" found.");
            throw new isu(sb2.toString());
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            sQLiteDatabase.endTransaction();
            m15831m(cursor);
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final itb mo13219a(String str, Account account) {
        return mo13220a(str, account.name);
    }

    /* renamed from: a */
    public final itb mo13220a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        ipp a = ipp.m15839a(this.f21520b);
        if (ccfj.m129447c()) {
            try {
                sQLiteDatabase = a.getReadableDatabase();
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new isu(valueOf.length() == 0 ? new String("Failed to open db ") : "Failed to open db ".concat(valueOf));
            }
        } else {
            sQLiteDatabase = a.getReadableDatabase();
        }
        sQLiteDatabase.beginTransaction();
        try {
            cursor = m15816a(sQLiteDatabase, "keys", new String[]{"key_handle", "key_type", "master_key", "active_status", "creation_time", "expiration_time"}, "key_name = ? AND account = ? AND key_form = ?", new String[]{str, str2, Integer.toString(ehc.SYMMETRIC_KEY.f14909e)});
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        sQLiteDatabase.setTransactionSuccessful();
                        itb a2 = m15817a(cursor, str, str2);
                        sQLiteDatabase.endTransaction();
                        m15831m(cursor);
                        a.close();
                        return a2;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase.endTransaction();
                    m15831m(cursor);
                    a.close();
                    throw th;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append("No key for keyName=");
            sb.append(str);
            sb.append(" found.");
            throw new isu(sb.toString());
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            sQLiteDatabase.endTransaction();
            m15831m(cursor);
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final List mo10156a(String str) {
        String i;
        ipp a = ipp.m15839a(this.f21520b);
        SQLiteDatabase readableDatabase = a.getReadableDatabase();
        readableDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            ArrayList arrayList = new ArrayList();
            Cursor a2 = m15816a(readableDatabase, "keys", new String[]{"key_handle", "key_form", "key_name", "account", "active_status", "public_key"}, "account = ?", new String[]{str});
            if (a2 != null) {
                try {
                    if (a2.getCount() == 0) {
                        f21519c.mo25412b("Found no rows for the table. Returning.", new Object[0]);
                    } else {
                        if (!a2.moveToFirst()) {
                            f21519c.mo25412b("Cursor didn't move to first row. Returning.", new Object[0]);
                        }
                        while (!a2.isAfterLast()) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            String h = m15826h(a2);
                            while (!a2.isAfterLast() && h.equals(m15826h(a2))) {
                                byte[] d = m15822d(a2);
                                i = m15827i(a2);
                                if (((Boolean) ipl.f21505o.mo58455c()).booleanValue()) {
                                    if ("PublicKey".equals(i)) {
                                        byte[] b = bnzi.m110896a().mo68722a(m15820b(a2)).mo68740b();
                                        ByteString a3 = ByteString.m123261a(f21518a);
                                        a3.mo73770a(ByteString.m123261a(b));
                                        d = a3.getKey();
                                    }
                                }
                                ehc e = m15823e(a2);
                                ehp g = m15825g(a2);
                                if (!hashMap.containsKey(i)) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(new ehl(d, g));
                                    hashMap.put(i, arrayList2);
                                    hashMap2.put(i, e);
                                } else {
                                    ((List) hashMap.get(i)).add(new ehl(d, g));
                                }
                                a2.moveToNext();
                            }
                            for (String str2 : hashMap.keySet()) {
                                ehc ehc = (ehc) hashMap2.get(str2);
                                ehm ehm = new ehm(str2, h);
                                List list = (List) hashMap.get(str2);
                                if (list != null) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < list.size()) {
                                            if (((ehl) list.get(i2)).f14977b.equals(ehp.ACTIVE_KEY)) {
                                                Collections.swap(list, 0, i2);
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            break;
                                        }
                                    }
                                    bmxy.m108581a(list);
                                    ehm.f14980c.addAll(list);
                                }
                                arrayList.add(ehm);
                            }
                        }
                        f21519c.mo25412b("Found %d different keys.", Integer.valueOf(arrayList.size()));
                    }
                    readableDatabase.endTransaction();
                    m15831m(a2);
                } catch (ehy e2) {
                    f21519c.mo25415d(String.format("invalid attributes. key=%s", i), e2, new Object[0]);
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    readableDatabase.endTransaction();
                    m15831m(cursor);
                    a.close();
                    throw th;
                }
            } else {
                readableDatabase.setTransactionSuccessful();
                readableDatabase.endTransaction();
                m15831m(null);
            }
            a.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            readableDatabase.endTransaction();
            m15831m(cursor);
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo10157a(ehm ehm, List list) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        ehm ehm2 = ehm;
        List list2 = list;
        char c = 0;
        f21519c.mo25412b("Updating status for key=%s", ehm2.f14978a);
        ipp a = ipp.m15839a(this.f21520b);
        if (ccfj.m129447c()) {
            try {
                sQLiteDatabase = a.getWritableDatabase();
            } catch (SQLiteException e) {
                Logger Logger = f21519c;
                String valueOf = String.valueOf(e.getMessage());
                Logger.mo25418e(valueOf.length() == 0 ? new String("failed to update key status ") : "failed to update key status ".concat(valueOf), new Object[0]);
                return;
            }
        } else {
            sQLiteDatabase = a.getWritableDatabase();
        }
        sQLiteDatabase.beginTransaction();
        int i = 0;
        while (i < ehm2.f14980c.size()) {
            try {
                if (!((ehp) list2.get(i)).equals(ehp.DELETED)) {
                    ContentValues contentValues = new ContentValues();
                    m15818a(contentValues, (ehp) list2.get(i));
                    String d = sqd.m35972d(ehm2.mo10150a(i).f14976a);
                    Logger logger2 = f21519c;
                    Object[] objArr = new Object[4];
                    objArr[c] = d;
                    objArr[1] = ehm2.f14979b;
                    objArr[2] = ehm2.f14978a;
                    objArr[3] = Integer.valueOf(((ehp) list2.get(i)).f14994e);
                    logger2.mo25412b("Updating key status for key=%s, account=%s, name=%s to %d", objArr);
                    int update = sQLiteDatabase.update("keys", contentValues, "key_name = ? AND key_handle = ? AND account = ?", new String[]{ehm2.f14978a, d, ehm2.f14979b});
                    if (update > 1) {
                        f21519c.mo25418e("Too many rows (%d) updated for [key=%s handle=%s]", Integer.valueOf(update), ehm2.f14978a, d);
                    } else if (update <= 0) {
                        f21519c.mo25418e("No rows found for for [key=%s handle=%s]", ehm2.f14978a, d);
                    } else {
                        f21519c.mo25412b("Successfully updated the keyStatus.", new Object[0]);
                    }
                } else {
                    if (!ehm2.f14978a.equals("PublicKey") || Arrays.equals(ehm2.mo10150a(i).f14976a, "device_key".getBytes(bmwy.f131158c))) {
                        str = sqd.m35972d(ehm2.mo10150a(i).f14976a);
                    } else {
                        str = sqd.m35972d("device_key".getBytes(bmwy.f131158c));
                    }
                    f21519c.mo25412b("Deleting key=%s, account=%s, name=%s", str, ehm2.f14979b, ehm2.f14978a);
                    if (sQLiteDatabase.delete("keys", "key_name = ? AND key_handle = ? AND account = ?", new String[]{ehm2.f14978a, str, ehm2.f14979b}) <= 0) {
                        f21519c.mo25418e("No rows found for for [key=%s handle=%s]", ehm2.f14978a, str);
                    } else {
                        f21519c.mo25412b("Successfully updated the keyStatus.", new Object[0]);
                        try {
                            if (ccfg.m129431b()) {
                                egx.m10385a(ehm2.mo10150a(i).f14976a);
                            }
                        } catch (ehf e2) {
                        }
                    }
                }
                i++;
                list2 = list;
                c = 0;
            } finally {
                sQLiteDatabase.endTransaction();
                a.close();
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
    }
}
