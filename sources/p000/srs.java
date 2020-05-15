package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: srs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srs {

    /* renamed from: a */
    private static final Uri f45050a = Uri.parse("content://com.google.settings/partner");

    /* renamed from: b */
    private static Boolean f45051b = null;

    /* renamed from: c */
    private static int f45052c = 2;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r10 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r1 = java.lang.Integer.parseInt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* renamed from: a */
    public static boolean m36149a(Context context) {
        int i;
        Throwable th;
        Cursor cursor;
        RuntimeException e;
        if (m36150b(context)) {
            int i2 = Build.VERSION.SDK_INT;
            i = f45052c;
            if (i != 1) {
                ContentResolver contentResolver = context.getContentResolver();
                String str = null;
                str = null;
                str = null;
                Cursor cursor2 = null;
                str = null;
                try {
                    cursor = contentResolver.query(f45050a, new String[]{"value"}, "name=?", new String[]{"use_location_for_services"}, null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToNext()) {
                                str = cursor.getString(0);
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            try {
                                if (Log.isLoggable("GoogleLocSettingHelper", 5)) {
                                    Log.w("GoogleLocSettingHelper", "Failed to get 'Use My Location' setting", e);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    cursor = null;
                    if (Log.isLoggable("GoogleLocSettingHelper", 5)) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
            if (i == 1) {
                return false;
            }
        }
        return true;
        f45052c = i;
        if (i == 1) {
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m36150b(Context context) {
        boolean booleanValue;
        boolean z;
        synchronized (srs.class) {
            if (f45051b == null) {
                if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f45051b = Boolean.valueOf(z);
            }
            booleanValue = f45051b.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    public static boolean m36151c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m36150b(context);
    }
}
