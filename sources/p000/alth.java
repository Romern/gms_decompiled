package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alth {
    /* renamed from: a */
    public static String m61758a(String str) {
        return String.format("DROP TABLE IF EXISTS %s;", str);
    }

    /* renamed from: b */
    public static String m61764b(String str) {
        return String.format("DROP INDEX IF EXISTS %s;", str);
    }

    /* renamed from: c */
    public static List m61767c(String... strArr) {
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArr) {
            arrayList.add(m61758a(str));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m61759a(String str, String str2, String str3) {
        return m61762a(bngx.m109356a(str), str2, bngx.m109356a(str3), 1);
    }

    /* renamed from: b */
    public static String m61765b(String str, String str2, String... strArr) {
        boolean z;
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Must provide at least one column.");
        return String.format("CREATE INDEX IF NOT EXISTS %s ON %s (%s);", str, str2, TextUtils.join(",", strArr));
    }

    /* renamed from: a */
    public static String m61760a(String str, String str2, String... strArr) {
        boolean z;
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Must provide at least one column.");
        return String.format("CREATE INDEX %s ON %s (%s);", str, str2, TextUtils.join(",", strArr));
    }

    /* renamed from: b */
    public static String m61766b(String... strArr) {
        sdo.m34975b(strArr.length > 0, "Must name at least one column.");
        return String.format("UNIQUE (%s) ON CONFLICT IGNORE", TextUtils.join(",", strArr));
    }

    /* renamed from: a */
    public static String m61761a(String str, String... strArr) {
        sdo.m34975b(strArr.length > 0, "Must define at least one column.");
        return String.format("CREATE TABLE %s (%s);", str, TextUtils.join(",", strArr));
    }

    /* renamed from: a */
    public static String m61762a(List list, String str, List list2, int i) {
        boolean z;
        String str2;
        sdo.m34975b(!list.isEmpty(), "Must have at least one column.");
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "Must have same number of columns in each table (%d vs. %d).", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.join(",", list);
        objArr[1] = str;
        objArr[2] = TextUtils.join(",", list2);
        if (i == 0) {
            str2 = "";
        } else {
            str2 = " ON DELETE CASCADE";
        }
        objArr[3] = str2;
        return String.format("FOREIGN KEY (%s) REFERENCES %s(%s)%s", objArr);
    }

    /* renamed from: a */
    public static String m61763a(String... strArr) {
        sdo.m34975b(strArr.length > 0, "Must name at least one column.");
        return String.format("UNIQUE (%s)", TextUtils.join(",", strArr));
    }
}
