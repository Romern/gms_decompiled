package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.security.spec.InvalidKeySpecException;

/* renamed from: ipq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipq implements ehw {

    /* renamed from: b */
    private static final Logger f21526b = new Logger(new String[]{"GroupKeyDatabaseOperation"}, (byte[]) null);

    /* renamed from: a */
    public final Context f21527a;

    public ipq(Context context) {
        this.f21527a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r6 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r16.endTransaction();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r6 == null) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* renamed from: b */
    public final ehx mo10154b(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        String str3 = str;
        String str4 = str2;
        ipp a = ipp.m15839a(this.f21527a);
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                cursor2 = writableDatabase.query(true, "group_keys", new String[]{"public_key", "private_key"}, "key_name = ? AND account = ?", new String[]{str3, str4}, null, null, null, null);
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            ehx a2 = m15842a(cursor2, str3, str4);
                            if (a2.f15027d != null && cursor2.getCount() == 2) {
                                cursor2.moveToNext();
                                a2 = m15842a(cursor2, str3, str4);
                            }
                            writableDatabase.setTransactionSuccessful();
                            cursor2.close();
                            writableDatabase.endTransaction();
                            a.close();
                            return a2;
                        }
                    } catch (InvalidKeySpecException e) {
                        e = e;
                        try {
                            f21526b.mo25417e("Key format error", e, new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                            }
                            writableDatabase.endTransaction();
                            a.close();
                            throw th;
                        }
                    }
                }
                f21526b.mo25418e("No key exists", new Object[0]);
            } catch (InvalidKeySpecException e2) {
                e = e2;
                cursor2 = null;
                f21526b.mo25417e("Key format error", e, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                writableDatabase.endTransaction();
                a.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            f21526b.mo25417e("Couldn't open database", e3, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static ehx m15842a(Cursor cursor, String str, String str2) {
        byte[] c = sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("public_key")));
        byte[] c2 = sqd.m35971c(cursor.getString(cursor.getColumnIndexOrThrow("private_key")));
        return new ehx(str, str2, ehv.m10473c(c), c2 != null ? ehv.m10474d(c2) : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (r6 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        r16.endTransaction();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r6 == null) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* renamed from: a */
    public final ehx mo10153a(String str, String str2) {
        Cursor cursor;
        String str3 = str;
        String str4 = str2;
        ipp a = ipp.m15839a(this.f21527a);
        Cursor cursor2 = null;
        try {
            SQLiteDatabase writableDatabase = a.getWritableDatabase();
            writableDatabase.beginTransaction();
            StringBuilder sb = new StringBuilder(56);
            sb.append("key_name = ? AND account = ? AND key_state = 1");
            try {
                cursor = writableDatabase.query(true, "group_keys", new String[]{"public_key", "private_key"}, sb.toString(), new String[]{str3, str4}, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            ehx a2 = m15842a(cursor, str3, str4);
                            writableDatabase.setTransactionSuccessful();
                            cursor.close();
                            writableDatabase.endTransaction();
                            a.close();
                            return a2;
                        }
                    } catch (InvalidKeySpecException e) {
                        e = e;
                        try {
                            f21526b.mo25417e("Key format error", e, new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            writableDatabase.endTransaction();
                            a.close();
                            throw th;
                        }
                    }
                }
                f21526b.mo25418e("No key exists", new Object[0]);
            } catch (InvalidKeySpecException e2) {
                e = e2;
                cursor = null;
                f21526b.mo25417e("Key format error", e, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                writableDatabase.endTransaction();
                a.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            f21526b.mo25417e("Couldn't open database", e3, new Object[0]);
            return null;
        }
    }
}
