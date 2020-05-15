package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: cavk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cavk {

    /* renamed from: a */
    public static final byte[] f176137a = new byte[0];

    /* renamed from: b */
    public static final String[] f176138b = new String[0];

    /* renamed from: c */
    public static final Charset f176139c = Charset.forName("UTF-8");

    /* renamed from: a */
    public static cipx m127303a(cipx cipx) {
        try {
            return cipx.m150786a(MessageDigest.getInstance("SHA-1").digest(cipx.mo86347f()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static ThreadFactory m127319b(String str) {
        return new cavj(str);
    }

    /* renamed from: b */
    public static String[] m127320b(String[] strArr, String str) {
        int length = strArr.length;
        int i = length + 1;
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[i - 1] = str;
        return strArr2;
    }

    /* renamed from: a */
    public static String m127304a(caue caue) {
        if (caue.f175992c == caue.m127217a(caue.f175990a)) {
            return caue.f175991b;
        }
        String str = caue.f175991b;
        int i = caue.f175992c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m127305a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt > 31 && codePointAt < 127) {
                i += Character.charCount(codePointAt);
            } else {
                cipu cipu = new cipu();
                cipu.mo86288a(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    int i2 = 63;
                    if (codePointAt2 > 31 && codePointAt2 < 127) {
                        i2 = codePointAt2;
                    }
                    cipu.mo86313g(i2);
                    i += Character.charCount(codePointAt2);
                }
                return cipu.mo86324k();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static List m127306a(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static List m127307a(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: a */
    public static Map m127308a(Map map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: a */
    public static void m127309a(long j, long j2) {
        if (j2 < 0 || j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static void m127310a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    public static void m127311a(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw th;
        } else {
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public static void m127312a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m127315a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m127313a(ciqr ciqr, int i, TimeUnit timeUnit) {
        long j;
        long nanoTime = System.nanoTime();
        if (ciqr.mo74997df().mo86357f()) {
            j = ciqr.mo74997df().mo86358g() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        ciqr.mo74997df().mo86355b(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            cipu cipu = new cipu();
            while (ciqr.mo74995c(cipu, 2048) != -1) {
                cipu.mo86328n();
            }
            if (j != Long.MAX_VALUE) {
                ciqr.mo74997df().mo86355b(nanoTime + j);
                return true;
            }
            ciqr.mo74997df().mo86360i();
            return true;
        } catch (InterruptedIOException e) {
            if (j != Long.MAX_VALUE) {
                ciqr.mo74997df().mo86355b(nanoTime + j);
                return false;
            }
            ciqr.mo74997df().mo86360i();
            return false;
        } catch (Throwable th) {
            if (j != Long.MAX_VALUE) {
                ciqr.mo74997df().mo86355b(nanoTime + j);
            } else {
                ciqr.mo74997df().mo86360i();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m127314a(ciqr ciqr, TimeUnit timeUnit) {
        try {
            return m127313a(ciqr, 100, timeUnit);
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m127315a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static boolean m127316a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m127317a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    /* renamed from: a */
    public static Object[] m127318a(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr2[i];
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }
}
