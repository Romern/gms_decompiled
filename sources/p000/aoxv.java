package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aoxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoxv {

    /* renamed from: a */
    public static final Uri f83817a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    static final String[] f83818b = {"android_id"};

    /* renamed from: c */
    private static final aoyh f83819c = aoyh.m69805a("CidGenerator");

    /* renamed from: d */
    private static String f83820d;

    /* renamed from: e */
    private static final Map f83821e = new HashMap();

    /* renamed from: f */
    private static volatile boolean f83822f;

    public aoxv(Context context) {
        synchronized (aoxv.class) {
            if (f83820d == null) {
                f83820d = aytd.m84774a(m69794b(context));
            }
        }
    }

    /* renamed from: a */
    public static bmxv m69792a(Context context) {
        String b = m69794b(context);
        if (b == null) {
            return bmvz.f131120a;
        }
        try {
            return bmxv.m108566b(Long.valueOf(Long.parseLong(b)));
        } catch (NumberFormatException e) {
            if (cgjy.m145760g()) {
                f83819c.mo46980a(e, "Invalid Android Id");
            } else {
                f83819c.mo46987e("CidGenerator", "Invalid Android Id", e);
            }
            return bmvz.f131120a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC, Splitter:B:24:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* renamed from: b */
    private static String m69794b(Context context) {
        Cursor cursor;
        SecurityException e;
        Cursor cursor2 = null;
        try {
            cursor = context.getContentResolver().query(f83817a, null, null, f83818b, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && cursor.getColumnCount() >= 2) {
                        String string = cursor.getString(1);
                        cursor.close();
                        return string;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    try {
                        if (cgjy.m145760g()) {
                            f83819c.mo46987e("CidGenerator", "Unable to get android ID", e);
                        } else {
                            f83819c.mo46980a(e, "Unable to get android ID");
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (SecurityException e3) {
            e = e3;
            cursor = null;
            if (cgjy.m145760g()) {
            }
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return r1;
     */
    /* renamed from: a */
    public static final String m69793a(String str) {
        synchronized (aoxv.class) {
            if (f83820d == null) {
                return null;
            }
            String str2 = (String) f83821e.get(str);
            if (str2 == null) {
                try {
                    str2 = aytd.m84775a(str, f83820d);
                } catch (Exception e) {
                    if (!cgjy.m145760g()) {
                        f83819c.mo46987e("CidGenerator", e.getMessage(), e);
                    } else {
                        f83819c.mo46980a(e, "calculate failed");
                    }
                }
                f83821e.put(str, str2);
            }
        }
    }
}
