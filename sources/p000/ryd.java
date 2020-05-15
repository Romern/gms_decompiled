package p000;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.download.DownloadDetails;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: ryd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryd {

    /* renamed from: a */
    public static final srn f43846a = srn.m36126a("DownloadServiceState", sgj.DOWNLOAD);

    /* renamed from: b */
    static final String[] f43847b = {"_id", "filename", "url", "sizeBytes", "sha1", "destination", "minVersion", "maxVersion", "dm_id"};

    /* renamed from: c */
    static final String[] f43848c = {"_id", "filename"};

    /* renamed from: d */
    public static final String[] f43849d = {"filename", "retries"};

    /* renamed from: e */
    static final String[] f43850e = {"filename", "enabled"};

    /* renamed from: f */
    public static final String[] f43851f = {"filename", "dm_id"};

    /* renamed from: g */
    public static final String[] f43852g = {"_id", "filename", "notificationTitle", "notificationDescription"};

    /* renamed from: h */
    public static final Object f43853h = new Object();

    /* renamed from: a */
    private static ContentValues m34633a(DownloadDetails downloadDetails) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", downloadDetails.f30175a);
        contentValues.put("url", downloadDetails.f30176b);
        contentValues.put("sizeBytes", Long.valueOf(downloadDetails.f30177c));
        contentValues.put("sha1", downloadDetails.f30178d);
        String str = downloadDetails.f30179e;
        if (str != null) {
            contentValues.put("destination", str);
        }
        int i = downloadDetails.f30180f;
        if (i != 0) {
            contentValues.put("minVersion", Integer.valueOf(i));
        }
        int i2 = downloadDetails.f30181g;
        if (i2 != Integer.MAX_VALUE) {
            contentValues.put("maxVersion", Integer.valueOf(i2));
        }
        return contentValues;
    }

    /* renamed from: b */
    static int m34643b(Context context, String str) {
        Uri a = m34636a(str);
        synchronized (f43853h) {
            Cursor query = context.getContentResolver().query(a, f43849d, null, null, null);
            if (query == null) {
                bnsl bnsl = (bnsl) f43846a.mo68387b();
                bnsl.mo68437a(new Exception());
                bnsl.mo68432a("ryd", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("getDownloadFailedCount Cursor was null");
                return 0;
            }
            try {
                if (query.moveToNext()) {
                    int i = query.getInt(1);
                    return i;
                }
                query.close();
                return 0;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    public static boolean m34646c(Context context, String str) {
        Cursor query = context.getContentResolver().query(m34636a(str), f43850e, null, null, null);
        boolean z = false;
        if (query == null) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(new Exception());
            bnsl.mo68432a("ryd", "c", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("isDownloadedFileEnabled Cursor was null");
            return false;
        }
        try {
            if (query.moveToNext() && query.getInt(1) == 1) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    /* renamed from: d */
    public static DownloadDetails m34647d(Context context, String str) {
        Cursor query = context.getContentResolver().query(m34636a(str), f43847b, null, null, null);
        DownloadDetails downloadDetails = null;
        if (query == null) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(new Exception());
            bnsl.mo68432a("ryd", "d", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getDownloadDetails Cursor was null");
            return null;
        }
        try {
            if (query.moveToNext()) {
                downloadDetails = m34638a(query);
            }
            return downloadDetails;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    static Pair m34648e(Context context, String str) {
        Cursor query = context.getContentResolver().query(m34636a(str), f43852g, null, null, null);
        Pair pair = null;
        if (query == null) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(new Exception());
            bnsl.mo68432a("ryd", "e", 546, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getNotification Cursor was null");
            return null;
        }
        try {
            if (!query.moveToNext()) {
                bnsl bnsl2 = (bnsl) f43846a.mo68388c();
                bnsl2.mo68432a("ryd", "e", 551, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("No pending download found.");
            } else if (!query.isNull(2) && !query.isNull(3)) {
                pair = new Pair(query.getString(2), query.getString(3));
            }
            return pair;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public static Cursor m34634a(DownloadManager downloadManager, DownloadManager.Query query) {
        try {
            return downloadManager.query(query);
        } catch (SQLException | IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ryd", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DownloadManager unexpectedly threw an exception:");
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static Uri m34635a(Context context, DownloadDetails downloadDetails, boolean z) {
        ContentValues a = m34633a(downloadDetails);
        if (z) {
            a.put("enabled", (Integer) 1);
        }
        return context.getContentResolver().insert(ryr.f43861a, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (((android.app.DownloadManager) r7.getSystemService("download")).remove(r8) != 0) goto L_0x002e;
     */
    /* renamed from: b */
    public static void m34644b(Context context, long j) {
        try {
        } catch (IllegalArgumentException e) {
        }
        bnsl bnsl = (bnsl) f43846a.mo68388c();
        bnsl.mo68432a("ryd", "b", 510, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to clear DownloadManager of id");
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("dm_id");
        if (context.getContentResolver().update(ryr.f43861a, contentValues, "dm_id=?", new String[]{String.valueOf(j)}) == 0) {
            bnsl bnsl2 = (bnsl) f43846a.mo68388c();
            bnsl2.mo68432a("ryd", "b", 523, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to clear DownloadManager id in DownloadService");
        }
    }

    /* renamed from: a */
    public static Uri m34636a(String str) {
        return Uri.withAppendedPath(ryr.f43861a, str);
    }

    /* renamed from: a */
    public static DownloadDetails m34637a(Context context, long j) {
        Cursor query = context.getContentResolver().query(ryr.f43861a, f43847b, "dm_id=?", new String[]{String.valueOf(j)}, null);
        if (query == null) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(new Exception());
            bnsl.mo68432a("ryd", "a", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getDownloadManagerDetails Cursor was null");
            return null;
        }
        try {
            if (!query.moveToNext()) {
                bnsl bnsl2 = (bnsl) f43846a.mo68388c();
                bnsl2.mo68432a("ryd", "a", 392, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68415a("No pending download found for id %d", j);
                return null;
            }
            DownloadDetails a = m34638a(query);
            query.close();
            return a;
        } finally {
            query.close();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: b */
    public static void m34645b(Context context, DownloadDetails downloadDetails, boolean z) {
        Uri a = m34636a(downloadDetails.f30175a);
        ContentValues a2 = m34633a(downloadDetails);
        if (z) {
            a2.put("enabled", (Integer) 1);
        }
        context.getContentResolver().update(a, a2, null, null);
    }

    /* renamed from: a */
    static DownloadDetails m34638a(Cursor cursor) {
        rxw rxw = new rxw(cursor.getString(1), cursor.getString(2), cursor.getLong(3), cursor.getString(4));
        if (!cursor.isNull(5)) {
            rxw.f43837e = cursor.getString(5);
        }
        if (!cursor.isNull(6)) {
            rxw.f43838f = cursor.getInt(6);
        }
        if (!cursor.isNull(7)) {
            rxw.f43839g = cursor.getInt(7);
        }
        return rxw.mo25246a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static void m34639a(Context context, DownloadDetails downloadDetails) {
        String str = downloadDetails.f30175a;
        Uri a = m34636a(str);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("retries", (Integer) 0);
        contentValues.put("enabled", (Integer) 1);
        contentValues.putNull("notificationTitle");
        contentValues.putNull("notificationDescription");
        if (context.getContentResolver().update(a, contentValues, null, null) == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("'");
            sb.append(str);
            sb.append("' was not in the DownloadService.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m34640a(Context context, String str) {
        Uri a = m34636a(str);
        synchronized (f43853h) {
            Cursor query = context.getContentResolver().query(a, f43849d, null, null, null);
            if (query == null) {
                bnsl bnsl = (bnsl) f43846a.mo68387b();
                bnsl.mo68437a(new Exception());
                bnsl.mo68432a("ryd", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("markDownloadFailed Cursor was null");
                return;
            }
            try {
                if (query.moveToNext()) {
                    int i = query.getInt(1);
                    query.close();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("retries", Integer.valueOf(i + 1));
                    context.getContentResolver().update(a, contentValues, null, null);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("'");
                sb.append(str);
                sb.append("' was not in the DownloadService.");
                throw new IllegalArgumentException(sb.toString());
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m34641a(Context context, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("dm_id", Long.valueOf(j));
        if (context.getContentResolver().update(m34636a(str), contentValues, null, null) == 0) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68432a("ryd", "a", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to update DownloadManager id");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ryd.a(android.content.Context, com.google.android.gms.common.download.DownloadDetails, boolean):android.net.Uri
     arg types: [android.content.Context, com.google.android.gms.common.download.DownloadDetails, int]
     candidates:
      ryd.a(android.content.Context, java.lang.String, long):void
      ryd.a(android.content.Context, com.google.android.gms.common.download.DownloadDetails, boolean):android.net.Uri */
    /* renamed from: a */
    public static DownloadDetails[] m34642a(Context context) {
        Cursor query;
        int i = 0;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            JSONArray jSONArray = new JSONArray(cdev.m132877b());
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    DownloadDetails downloadDetails = new DownloadDetails(jSONArray.getJSONObject(i2));
                    query = contentResolver.query(m34636a(downloadDetails.f30175a), f43848c, null, null, null);
                    if (query != null) {
                        if (query.getCount() == 0) {
                            m34635a(context, downloadDetails, true);
                        } else {
                            m34645b(context, downloadDetails, false);
                        }
                        query.close();
                    }
                }
            }
        } catch (JSONException e) {
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        Cursor query2 = context.getContentResolver().query(ryr.f43861a, f43847b, null, null, null);
        if (query2 == null) {
            bnsl bnsl = (bnsl) f43846a.mo68387b();
            bnsl.mo68437a(new Exception());
            bnsl.mo68432a("ryd", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getAllDownloadDetails Cursor was null");
            return new DownloadDetails[0];
        }
        try {
            DownloadDetails[] downloadDetailsArr = new DownloadDetails[query2.getCount()];
            while (query2.moveToNext()) {
                int i3 = i + 1;
                downloadDetailsArr[i] = m34638a(query2);
                i = i3;
            }
            return downloadDetailsArr;
        } finally {
            query2.close();
        }
    }
}
