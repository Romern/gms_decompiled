package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;

/* renamed from: ambi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambi {

    /* renamed from: a */
    public static final String[] f74632a = {"contact_id", "display_name", "mimetype", "data1", "data2", "data3"};

    /* renamed from: b */
    private static boolean f74633b = false;

    /* renamed from: c */
    private static boolean f74634c = false;

    /* renamed from: a */
    public static final String m62532a() {
        int i = Build.VERSION.SDK_INT;
        return "((data_set IS NULL) OR (account_type='com.google' AND data_set!='plus'))";
    }

    /* renamed from: a */
    public static final void m62533a(ancr ancr) {
        ancr.mo41708b("(mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2'))");
    }

    /* renamed from: a */
    public static final void m62534a(ancr ancr, Context context) {
        int i = Build.VERSION.SDK_INT;
        if (m62536a(context)) {
            ancr.mo41708b("(contact_id IN (SELECT _id FROM default_directory))");
        }
        String a = m62532a();
        if (!TextUtils.isEmpty(a)) {
            ancr.mo41708b(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011  */
    /* renamed from: a */
    public static void m62535a(Cursor cursor) {
        if (!cursor.isAfterLast()) {
            long j = cursor.getLong(0);
            while (cursor.moveToNext() && j == cursor.getLong(0)) {
                while (cursor.moveToNext()) {
                    while (cursor.moveToNext()) {
                    }
                }
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r2 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* renamed from: a */
    private static final synchronized boolean m62536a(Context context) {
        boolean z;
        synchronized (ambi.class) {
            if (!f74634c) {
                f74634c = true;
                Cursor cursor = null;
                try {
                    cursor = context.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, null, "EXISTS (SELECT _id FROM default_directory LIMIT 1)", null, null);
                    if (cursor != null) {
                        try {
                            f74633b = true;
                        } catch (Exception e) {
                            e = e;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        amdk.m62658a("PeopleAggregator", "Error occurred when checking for %s table.", "default_directory");
                        e.getMessage();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            z = f74633b;
        }
        return z;
    }
}
