package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: aymn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymn {

    /* renamed from: a */
    public static final Uri f97980a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f97981b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f97982c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f97983d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f97984e = new AtomicBoolean();

    /* renamed from: f */
    static HashMap f97985f;

    /* renamed from: g */
    static final HashMap f97986g = new HashMap();

    /* renamed from: h */
    static final HashMap f97987h = new HashMap();

    /* renamed from: i */
    static final HashMap f97988i = new HashMap();

    /* renamed from: j */
    static final HashMap f97989j = new HashMap();

    /* renamed from: k */
    static String[] f97990k = new String[0];

    /* renamed from: l */
    private static Object f97991l;

    /* renamed from: m */
    private static boolean f97992m;

    /* renamed from: a */
    public static int m84260a(ContentResolver contentResolver, String str, int i) {
        Object a = m84262a(contentResolver);
        Integer num = (Integer) m84263a(f97987h, str, Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        String a2 = m84264a(contentResolver, str);
        if (a2 != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                num = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException e) {
            }
        }
        m84268a(a, f97987h, str, num);
        return i;
    }

    /* renamed from: b */
    private static void m84270b(ContentResolver contentResolver) {
        if (f97985f == null) {
            f97984e.set(false);
            f97985f = new HashMap();
            f97991l = new Object();
            f97992m = false;
            contentResolver.registerContentObserver(f97980a, true, new aymm());
        } else if (f97984e.getAndSet(false)) {
            f97985f.clear();
            f97986g.clear();
            f97987h.clear();
            f97988i.clear();
            f97989j.clear();
            f97991l = new Object();
            f97992m = false;
        }
    }

    /* renamed from: c */
    private static void m84272c(ContentResolver contentResolver, String[] strArr) {
        f97985f.putAll(m84266a(contentResolver, strArr));
        f97992m = true;
    }

    /* renamed from: b */
    public static void m84271b(ContentResolver contentResolver, String... strArr) {
        String[] strArr2;
        int length = strArr.length;
        if (length != 0) {
            synchronized (aymn.class) {
                m84270b(contentResolver);
                HashSet hashSet = new HashSet((((f97990k.length + length) * 4) / 3) + 1);
                hashSet.addAll(Arrays.asList(f97990k));
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (hashSet.add(str)) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    f97990k = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } else {
                    strArr2 = new String[0];
                }
                if (!f97992m || f97985f.isEmpty()) {
                    m84272c(contentResolver, f97990k);
                } else if (strArr2.length != 0) {
                    m84272c(contentResolver, strArr2);
                }
            }
        }
    }

    /* renamed from: a */
    public static long m84261a(ContentResolver contentResolver, String str, long j) {
        Object a = m84262a(contentResolver);
        Long l = (Long) m84263a(f97988i, str, Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        String a2 = m84264a(contentResolver, str);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException e) {
            }
        }
        m84268a(a, f97988i, str, l);
        return j;
    }

    /* renamed from: a */
    public static Object m84262a(ContentResolver contentResolver) {
        Object obj;
        synchronized (aymn.class) {
            m84270b(contentResolver);
            obj = f97991l;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return r4;
     */
    /* renamed from: a */
    private static Object m84263a(HashMap hashMap, String str, Object obj) {
        synchronized (aymn.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            Object obj2 = hashMap.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m84264a(ContentResolver contentResolver, String str) {
        return m84265a(contentResolver, str, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (p000.aymn.f97985f.isEmpty() != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r8 = r8.query(p000.aymn.f97980a, null, null, new java.lang.String[]{r9}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r8 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r8.moveToFirst() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0 = r8.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r0 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (r0.equals(r10) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        m84267a(r1, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        m84267a(r1, r9, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
        return r10;
     */
    /* renamed from: a */
    public static String m84265a(ContentResolver contentResolver, String str, String str2) {
        synchronized (aymn.class) {
            m84270b(contentResolver);
            Object obj = f97991l;
            if (!f97985f.containsKey(str)) {
                String[] strArr = f97990k;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (!str.startsWith(strArr[i])) {
                        i++;
                    } else {
                        if (!f97992m) {
                        }
                        m84272c(contentResolver, f97990k);
                        if (f97985f.containsKey(str)) {
                            String str3 = (String) f97985f.get(str);
                            if (str3 != null) {
                                str2 = str3;
                            }
                        }
                    }
                }
            } else {
                String str4 = (String) f97985f.get(str);
                if (str4 != null) {
                    str2 = str4;
                }
            }
        }
    }

    /* renamed from: a */
    public static Map m84266a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f97981b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    private static void m84267a(Object obj, String str, String str2) {
        synchronized (aymn.class) {
            if (obj == f97991l) {
                f97985f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static void m84268a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (aymn.class) {
            if (obj == f97991l) {
                hashMap.put(str, obj2);
                f97985f.remove(str);
            }
        }
    }

    /* renamed from: a */
    public static boolean m84269a(ContentResolver contentResolver, String str, boolean z) {
        Object a = m84262a(contentResolver);
        Boolean bool = (Boolean) m84263a(f97986g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = m84264a(contentResolver, str);
        if (a2 != null && !a2.equals("")) {
            if (f97982c.matcher(a2).matches()) {
                bool = true;
                z = true;
            } else if (f97983d.matcher(a2).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            }
        }
        m84268a(a, f97986g, str, bool);
        return z;
    }
}
