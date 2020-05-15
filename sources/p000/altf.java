package p000;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: altf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altf {

    /* renamed from: a */
    static final String[] f74209a = {"photo_id"};

    /* renamed from: b */
    static final String[] f74210b = {"data15"};

    /* renamed from: c */
    private static final String[] f74211c = {"_id"};

    /* renamed from: d */
    private static final String[] f74212d = {"contact_id"};

    /* renamed from: a */
    public static long m61750a(Context context, String str, String str2) {
        return m61751a(context, str, str2, f74211c);
    }

    /* renamed from: b */
    public static long m61753b(Context context, String str, String str2) {
        return m61751a(context, str, str2, f74212d);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static long m61751a(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String m = ancm.m64024m(str2);
        int i = Build.VERSION.SDK_INT;
        Cursor query = context.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, strArr, "account_name=?1 AND account_type='com.google' AND sourceid=?2 AND data_set IS NULL", new String[]{str, m}, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int i2 = query.getInt(0);
                    query.close();
                    return (long) i2;
                }
                query.close();
                return -1;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
            return -1;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static byte[] m61754b(Context context, long j, boolean z) {
        if (!z) {
            Log.w("PeopleCp2Helper", "Large contact picture not supported yet.");
        }
        Cursor query = context.getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), f74209a, null, null, null);
        long j2 = -1;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    j2 = (long) i;
                } else {
                    query.close();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
        }
        byte[] bArr = null;
        if (j2 < 0) {
            return null;
        }
        Cursor query2 = context.getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, j2), f74210b, null, null, null);
        if (query2 != null) {
            try {
                if (query2.moveToFirst()) {
                    bArr = query2.getBlob(0);
                }
            } finally {
                query2.close();
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m61752a(Context context, long j, boolean z) {
        if (!z) {
            Log.w("PeopleCp2Helper", "Large contact picture not supported yet.");
        }
        Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, f74210b, "mimetype='vnd.android.cursor.item/photo' AND raw_contact_id=?", new String[]{String.valueOf(j)}, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getBlob(0);
                }
                query.close();
                return null;
            } finally {
                query.close();
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
            return null;
        }
    }
}
