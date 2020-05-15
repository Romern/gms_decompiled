package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;

/* renamed from: alqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alqw {

    /* renamed from: a */
    public static final String[] f74139a = {"_id"};

    /* renamed from: b */
    public static final String[] f74140b = {"_id"};

    /* renamed from: a */
    public static double m61542a() {
        try {
            return Double.parseDouble("20.15.15 (120300-{{cl}})".substring(0, "20.15.15 (120300-{{cl}})".indexOf(".", "20.15.15 (120300-{{cl}})".indexOf(".") + 1)));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            Log.e("ContactsLoggerCommonUtils", "Cannot parse GmsCore version.", e);
            return -1.0d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static int m61543a(Context context, Uri uri, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, strArr, null, null, null);
            if (cursor == null) {
                try {
                    Log.w("ContactsLoggerCommonUtils", "CP2 failed to fetch ReadOnlyRawContacts.");
                    return -1;
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        Log.e("ContactsLoggerCommonUtils", "CP2 Query Exception when fetching read-only-raw-contacts.", e);
                        if (cursor != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
            } else {
                int count = cursor.getCount();
                cursor.close();
                return count;
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("ContactsLoggerCommonUtils", "CP2 Query Exception when fetching read-only-raw-contacts.", e);
            if (cursor != null) {
                return -1;
            }
            cursor.close();
            return -1;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
