package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: mby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mby {

    /* renamed from: a */
    public static final Uri f33389a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    static final String[] f33390b = {"android_id"};

    /* renamed from: c */
    static final bnqj f33391c = new bnft(new LinkedHashMap());

    /* renamed from: d */
    private static final lvn f33392d = new lvn("CidGenerator");

    /* renamed from: e */
    private static final Object f33393e = new Object();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
     arg types: [java.util.Map, java.lang.String]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.lang.Iterable, bmxj):bnhe
      bnmt.a(java.util.Set, bmxj):java.util.Iterator
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bmxj):java.util.Map
      bnmt.a(java.util.Map, bnmk):java.util.Map
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0097  */
    /* renamed from: a */
    public static String m24844a(Context context, String str) {
        String str2;
        String a;
        Map map;
        Cursor cursor;
        SecurityException e;
        String str3 = null;
        Cursor cursor2 = null;
        r1 = null;
        r1 = null;
        Object obj = null;
        try {
            cursor = context.getContentResolver().query(f33389a, null, null, f33390b, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && cursor.getColumnCount() >= 2) {
                        str2 = cursor.getString(1);
                        cursor.close();
                        a = aytd.m84774a(str2);
                        if (a != null) {
                            synchronized (f33393e) {
                                bnqj bnqj = f33391c;
                                if (str != null) {
                                    if (!(str2 == null || (map = (Map) bnmt.m109793a(((bnds) bnqj).mo68267e(), (Object) str)) == null)) {
                                        obj = bnmt.m109793a(map, (Object) str2);
                                    }
                                }
                                str3 = (String) obj;
                                if (str3 == null) {
                                    try {
                                        str3 = aytd.m84775a(str, a);
                                    } catch (Exception e2) {
                                        f33392d.mo25417e(e2.getMessage(), e2, new Object[0]);
                                    }
                                    if (str3 != null) {
                                        f33391c.mo67370a(str, str2, str3);
                                    }
                                }
                            }
                        }
                        return str3;
                    }
                } catch (SecurityException e3) {
                    e = e3;
                    try {
                        f33392d.mo25417e("Unable to get android ID", e, new Object[0]);
                        if (cursor == null) {
                            str2 = null;
                            a = aytd.m84774a(str2);
                            if (a != null) {
                            }
                            return str3;
                        }
                        cursor.close();
                        str2 = null;
                        a = aytd.m84774a(str2);
                        if (a != null) {
                        }
                        return str3;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SecurityException e4) {
            e = e4;
            cursor = null;
            f33392d.mo25417e("Unable to get android ID", e, new Object[0]);
            if (cursor == null) {
            }
            cursor.close();
            str2 = null;
            a = aytd.m84774a(str2);
            if (a != null) {
            }
            return str3;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }
}
