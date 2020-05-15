package p000;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: cibk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cibk {

    /* renamed from: a */
    private static final long f189732a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List m149969a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* renamed from: b */
    public static List m149971b(Map map, String str) {
        List a = m149969a(map, str);
        if (a == null) {
            return null;
        }
        m149970a(a);
        return a;
    }

    /* renamed from: c */
    public static List m149972c(Map map, String str) {
        List a = m149969a(map, str);
        if (a == null) {
            return null;
        }
        int i = 0;
        while (i < a.size()) {
            if (a.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", a.get(i), Integer.valueOf(i), a));
            }
        }
        return a;
    }

    /* renamed from: d */
    public static Map m149973d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* renamed from: e */
    public static Double m149974e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", obj, str, map));
    }

    /* renamed from: f */
    public static Integer m149975f(Map map, String str) {
        Double e = m149974e(map, str);
        if (e == null) {
            return null;
        }
        int intValue = e.intValue();
        if (((double) intValue) == e.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Number expected to be integer: ");
        sb.append(valueOf);
        throw new ClassCastException(sb.toString());
    }

    /* renamed from: g */
    public static String m149976g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0110, code lost:
        if (r7 < 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0116, code lost:
        if (r7 <= 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0118, code lost:
        r2 = java.util.concurrent.TimeUnit.SECONDS.toNanos(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011e, code lost:
        r10 = r2 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0123, code lost:
        if ((r8 ^ r2) >= 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0125, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0127, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012b, code lost:
        if ((r2 ^ r10) < 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0131, code lost:
        if ((r0 | r1) != false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0133, code lost:
        r10 = (1 ^ (r10 >>> 63)) + Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0145, code lost:
        return java.lang.Long.valueOf(r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e2 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e3 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0116 A[Catch:{ IllegalArgumentException -> 0x0161, ParseException -> 0x0180 }] */
    /* renamed from: h */
    public static Long m149977h(Map map, String str) {
        boolean z;
        int i;
        String g = m149976g(map, str);
        if (g == null) {
            return null;
        }
        try {
            boolean z2 = false;
            if (!g.isEmpty()) {
                if (g.charAt(g.length() - 1) == 's') {
                    if (g.charAt(0) == '-') {
                        g = g.substring(1);
                        z = true;
                    } else {
                        z = false;
                    }
                    String substring = g.substring(0, g.length() - 1);
                    String str2 = "";
                    int indexOf = substring.indexOf(46);
                    if (indexOf != -1) {
                        str2 = substring.substring(indexOf + 1);
                        substring = substring.substring(0, indexOf);
                    }
                    long parseLong = Long.parseLong(substring);
                    if (!str2.isEmpty()) {
                        i = 0;
                        for (int i2 = 0; i2 < 9; i2++) {
                            i *= 10;
                            if (i2 < str2.length()) {
                                if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                                    throw new ParseException("Invalid nanoseconds.", 0);
                                }
                                i += str2.charAt(i2) - '0';
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (parseLong < 0) {
                        String valueOf = String.valueOf(g);
                        throw new ParseException(valueOf.length() == 0 ? new String("Invalid duration string: ") : "Invalid duration string: ".concat(valueOf), 0);
                    }
                    if (z) {
                        parseLong = -parseLong;
                        i = -i;
                    }
                    long j = (long) i;
                    if (j > (-f189732a)) {
                        if (j < f189732a) {
                            if (parseLong <= 0) {
                                if (i < 0) {
                                    i = (int) (((long) i) + f189732a);
                                    parseLong--;
                                }
                            }
                            if (parseLong >= 0) {
                                if (i > 0) {
                                    i = (int) (((long) i) - f189732a);
                                    parseLong++;
                                }
                            }
                            if (parseLong >= -315576000000L && parseLong <= 315576000000L) {
                                long j2 = (long) i;
                                if (j2 >= -999999999 && j2 < f189732a) {
                                    if (parseLong >= 0) {
                                    }
                                    if (parseLong <= 0) {
                                    }
                                }
                            }
                            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(parseLong), Integer.valueOf(i)));
                        }
                    }
                    parseLong = bqbs.m112525a(parseLong, j / f189732a);
                    i = (int) (j % f189732a);
                    if (parseLong <= 0) {
                    }
                    if (parseLong >= 0) {
                    }
                    long j22 = (long) i;
                    if (parseLong >= 0) {
                    }
                    if (parseLong <= 0) {
                    }
                    throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(parseLong), Integer.valueOf(i)));
                }
            }
            throw new ParseException(g.length() == 0 ? new String("Invalid duration string: ") : "Invalid duration string: ".concat(g), 0);
        } catch (IllegalArgumentException e) {
            throw new ParseException("Duration value is out of range.", 0);
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: i */
    public static Boolean m149978i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* renamed from: a */
    public static void m149970a(List list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }
}
