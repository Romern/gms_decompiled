package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: alsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsf {
    /* renamed from: a */
    public static ContentValues m61640a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/contact_event");
        m61643a(contentValues, "data1", str);
        m61644a(contentValues, "data2", "data3", i, str2, 0);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m61641a(int i, String str, String str2, String str3, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/email_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        m61643a(contentValues, "data1", str);
        m61643a(contentValues, "data4", str2);
        m61644a(contentValues, "data2", "data3", i, str3, 0);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m61642a(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/group_membership");
        m61643a(contentValues, "group_sourceid", str);
        return contentValues;
    }

    /* renamed from: a */
    public static void m61643a(ContentValues contentValues, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m61644a(ContentValues contentValues, String str, String str2, int i, String str3, int i2) {
        if (i2 == i && TextUtils.isEmpty(str3)) {
            contentValues.putNull(str);
            contentValues.putNull(str2);
            return;
        }
        contentValues.put(str, Integer.valueOf(i));
        m61643a(contentValues, str2, str3);
    }
}
