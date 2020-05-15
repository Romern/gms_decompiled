package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.SQLException;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.HashMap;

/* renamed from: aymj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aymj implements BaseColumns {

    /* renamed from: a */
    static final HashMap f97975a = new HashMap();

    /* renamed from: a */
    private static ayml m84253a(ContentResolver contentResolver, Uri uri) {
        ayml ayml = (ayml) f97975a.get(uri);
        if (ayml == null) {
            ayml ayml2 = new ayml();
            f97975a.put(uri, ayml2);
            contentResolver.registerContentObserver(uri, true, new aymi(ayml2));
            return ayml2;
        } else if (!ayml.f97979c.getAndSet(false)) {
            return ayml;
        } else {
            synchronized (ayml) {
                ayml.f97977a.clear();
                ayml.f97978b = new Object();
            }
            return ayml;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r12 = r12.query(r13, new java.lang.String[]{"value"}, "name=?", new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r12 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r12.moveToFirst() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r3 = r12.getString(0);
        m84256a(r1, r0, r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        m84256a(r1, r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r12 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        r3 = r12;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        r0 = r12;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        android.util.Log.e("GoogleSettings", "Can't get key " + r14 + " from " + r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r3 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r3 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* renamed from: a */
    protected static String m84254a(ContentResolver contentResolver, Uri uri, String str) {
        ayml a;
        synchronized (aymj.class) {
            a = m84253a(contentResolver, uri);
        }
        synchronized (a) {
            Object obj = a.f97978b;
            if (a.f97977a.containsKey(str)) {
                String str2 = (String) a.f97977a.get(str);
                return str2;
            }
        }
    }

    /* renamed from: a */
    protected static void m84255a(ContentResolver contentResolver, Uri uri, String str, String str2) {
        ayml a;
        synchronized (aymj.class) {
            a = m84253a(contentResolver, uri);
        }
        synchronized (a) {
            a.f97977a.remove(str);
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("value", str2);
            contentResolver.insert(uri, contentValues);
        } catch (SQLException e) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e);
        } catch (IllegalArgumentException e2) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e2);
        }
    }

    /* renamed from: a */
    private static void m84256a(ayml ayml, Object obj, String str, String str2) {
        synchronized (ayml) {
            if (obj == ayml.f97978b) {
                ayml.f97977a.put(str, str2);
            }
        }
    }
}
