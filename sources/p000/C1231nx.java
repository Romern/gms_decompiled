package p000;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: nx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1231nx {

    /* renamed from: a */
    private final LinkedHashMap f26775a;

    /* renamed from: b */
    private int f26776b;

    /* renamed from: c */
    private int f26777c;

    /* renamed from: d */
    private int f26778d;

    /* renamed from: e */
    private int f26779e;

    /* renamed from: f */
    private int f26780f;

    /* renamed from: g */
    private int f26781g;

    /* renamed from: h */
    private int f26782h;

    public C1231nx() {
        this(1);
    }

    /* renamed from: a */
    public static int m19731a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    /* renamed from: c */
    private final int m19732c(Object obj, Object obj2) {
        int b = mo15551b(obj, obj2);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15550a(Object obj, Object obj2, Object obj3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo15551b(Object obj, Object obj2) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo12888c(Object obj) {
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f26781g;
        i2 = this.f26782h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f26777c), Integer.valueOf(this.f26781g), Integer.valueOf(this.f26782h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    public C1231nx(int i) {
        if (i > 0) {
            this.f26777c = i;
            this.f26775a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4.f26779e++;
        r1 = r4.f26775a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4.f26776b += m19732c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r4.f26775a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        mo15549a(r4.f26777c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        mo15550a(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = mo12888c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        monitor-enter(r4);
     */
    /* renamed from: a */
    public final Object mo15546a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f26775a.get(obj);
                if (obj2 == null) {
                    this.f26782h++;
                } else {
                    this.f26781g++;
                    return obj2;
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    /* renamed from: b */
    public final Object mo15552b(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.f26775a.remove(obj);
                if (remove != null) {
                    this.f26776b -= m19732c(obj, remove);
                }
            }
            if (remove != null) {
                mo15550a(obj, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final synchronized Map mo15553b() {
        return new LinkedHashMap(this.f26775a);
    }

    /* renamed from: a */
    public final Object mo15547a(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f26778d++;
            this.f26776b += m19732c(obj, obj2);
            put = this.f26775a.put(obj, obj2);
            if (put != null) {
                this.f26776b -= m19732c(obj, put);
            }
        }
        if (put != null) {
            mo15550a(obj, put, obj2);
        }
        mo15549a(this.f26777c);
        return put;
    }

    /* renamed from: a */
    public final void mo15548a() {
        mo15549a(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo15549a(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                if (this.f26776b < 0 || (this.f26775a.isEmpty() && this.f26776b != 0)) {
                } else if (this.f26776b <= i || this.f26775a.isEmpty()) {
                    break;
                } else {
                    Map.Entry entry = (Map.Entry) this.f26775a.entrySet().iterator().next();
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f26775a.remove(key);
                    this.f26776b -= m19732c(key, value);
                    this.f26780f++;
                }
            }
            mo15550a(key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
