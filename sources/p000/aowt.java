package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: aowt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowt {
    /* renamed from: a */
    public static String m69728a() {
        return m69729a("due_date_millis IS NOT NULL", "due_date_absolute_time_ms IS NULL");
    }

    /* renamed from: a */
    public static String m69729a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
        sb.append("(");
        sb.append(str);
        sb.append(") AND (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m69730a(Context context, Uri uri, String str) {
        long j;
        Cursor a = sgq.m35235a(context, uri, new String[]{str}, null, null, null);
        try {
            if (a.moveToFirst()) {
                j = a.getLong(0);
            } else {
                j = 0;
            }
            a.close();
            return j == 1;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static String[] m69731a(String[] strArr, String[] strArr2) {
        int length;
        int length2;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr2;
        }
        if (strArr2 == null || (length2 = strArr2.length) == 0) {
            return strArr;
        }
        String[] strArr3 = new String[(length + length2)];
        System.arraycopy(strArr, 0, strArr3, 0, length);
        System.arraycopy(strArr2, 0, strArr3, length, length2);
        return strArr3;
    }
}
