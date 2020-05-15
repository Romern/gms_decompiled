package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: cauz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauz implements Closeable {

    /* renamed from: a */
    static final Pattern f176094a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: i */
    public static final ciqq f176095i = new cauu();

    /* renamed from: b */
    public final cayk f176096b;

    /* renamed from: c */
    public final File f176097c;

    /* renamed from: d */
    public final int f176098d;

    /* renamed from: e */
    public int f176099e;

    /* renamed from: f */
    public boolean f176100f;

    /* renamed from: g */
    public boolean f176101g;

    /* renamed from: h */
    public boolean f176102h;

    /* renamed from: j */
    private final File f176103j;

    /* renamed from: k */
    private final File f176104k;

    /* renamed from: l */
    private final File f176105l;

    /* renamed from: m */
    private final int f176106m;

    /* renamed from: n */
    private final long f176107n;

    /* renamed from: o */
    private long f176108o = 0;

    /* renamed from: p */
    private cipv f176109p;

    /* renamed from: q */
    private final LinkedHashMap f176110q = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: r */
    private long f176111r = 0;

    /* renamed from: s */
    private final Executor f176112s;

    /* renamed from: t */
    private final Runnable f176113t = new caus(this);

    public cauz(cayk cayk, File file, long j, Executor executor) {
        this.f176096b = cayk;
        this.f176097c = file;
        this.f176106m = 1;
        this.f176103j = new File(file, "journal");
        this.f176104k = new File(file, "journal.tmp");
        this.f176105l = new File(file, "journal.bkp");
        this.f176098d = 1;
        this.f176107n = j;
        this.f176112s = executor;
    }

    /* renamed from: a */
    public static cauz m127267a(cayk cayk, File file, long j) {
        if (j > 0) {
            return new cauz(cayk, file, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), cavk.m127319b("OkHttp DiskLruCache")));
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: d */
    private static final void m127268d(String str) {
        if (!f176094a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r3.length() != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r3 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r3 = "unexpected journal line: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        throw new java.io.IOException(r3);
     */
    /* renamed from: f */
    private final void m127269f() {
        String l;
        String str;
        String[] split;
        cipw a = ciqh.m150828a(ciqh.m150832a(this.f176103j));
        try {
            String l2 = a.mo86326l();
            String l3 = a.mo86326l();
            String l4 = a.mo86326l();
            String l5 = a.mo86326l();
            String l6 = a.mo86326l();
            if (!"libcore.io.DiskLruCache".equals(l2) || !"1".equals(l3) || !Integer.toString(this.f176106m).equals(l4) || !Integer.toString(this.f176098d).equals(l5) || !"".equals(l6)) {
                StringBuilder sb = new StringBuilder(String.valueOf(l2).length() + 35 + String.valueOf(l3).length() + String.valueOf(l5).length() + String.valueOf(l6).length());
                sb.append("unexpected journal header: [");
                sb.append(l2);
                sb.append(", ");
                sb.append(l3);
                sb.append(", ");
                sb.append(l5);
                sb.append(", ");
                sb.append(l6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    l = a.mo86326l();
                    int indexOf = l.indexOf(32);
                    if (indexOf == -1) {
                        break;
                    }
                    int i2 = indexOf + 1;
                    int indexOf2 = l.indexOf(32, i2);
                    if (indexOf2 == -1) {
                        str = l.substring(i2);
                        if (indexOf == 6) {
                            if (l.startsWith("REMOVE")) {
                                this.f176110q.remove(str);
                                i++;
                            }
                        }
                    } else {
                        str = l.substring(i2, indexOf2);
                    }
                    caux caux = (caux) this.f176110q.get(str);
                    if (caux == null) {
                        caux = new caux(this, str);
                        this.f176110q.put(str, caux);
                    }
                    if (indexOf2 != -1 && indexOf == 5 && l.startsWith("CLEAN")) {
                        split = l.substring(indexOf2 + 1).split(" ");
                        caux.f176089e = true;
                        caux.f176090f = null;
                        if (split.length == caux.f176092h.f176098d) {
                            for (int i3 = 0; i3 < split.length; i3++) {
                                caux.f176086b[i3] = Long.parseLong(split[i3]);
                            }
                            i++;
                        } else {
                            throw caux.m127263a(split);
                        }
                    } else if (indexOf2 != -1 || indexOf != 5 || !l.startsWith("DIRTY")) {
                        if (indexOf2 == -1) {
                            if (indexOf != 4 || !l.startsWith("READ")) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    } else {
                        caux.f176090f = new cauw(this, caux);
                        i++;
                    }
                } catch (NumberFormatException e) {
                    throw caux.m127263a(split);
                } catch (EOFException e2) {
                    this.f176099e = i - this.f176110q.size();
                    if (a.mo86295b()) {
                        this.f176109p = m127270g();
                    } else {
                        mo74943b();
                    }
                    return;
                }
            }
            String valueOf = String.valueOf(l);
            throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
        } finally {
            cavk.m127310a(a);
        }
    }

    /* renamed from: g */
    private final cipv m127270g() {
        ciqq ciqq;
        File file = this.f176103j;
        try {
            ciqq = ciqh.m150839c(file);
        } catch (FileNotFoundException e) {
            file.getParentFile().mkdirs();
            ciqq = ciqh.m150839c(file);
        }
        return ciqh.m150827a(new caut(this, ciqq));
    }

    /* renamed from: h */
    private final synchronized void m127271h() {
        if (mo74947d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public final synchronized cauw mo74942b(String str) {
        mo74939a();
        m127271h();
        m127268d(str);
        caux caux = (caux) this.f176110q.get(str);
        if (caux != null) {
            if (caux.f176090f != null) {
                return null;
            }
        }
        cipv cipv = this.f176109p;
        cipv.mo86293b("DIRTY");
        cipv.mo86316h(32);
        cipv.mo86293b(str);
        cipv.mo86316h(10);
        this.f176109p.flush();
        if (this.f176100f) {
            return null;
        }
        if (caux == null) {
            caux = new caux(this, str);
            this.f176110q.put(str, caux);
        }
        cauw cauw = new cauw(this, caux);
        caux.f176090f = cauw;
        return cauw;
    }

    /* renamed from: c */
    public final synchronized void mo74944c(String str) {
        mo74939a();
        m127271h();
        m127268d(str);
        caux caux = (caux) this.f176110q.get(str);
        if (caux != null) {
            mo74941a(caux);
        }
    }

    public final synchronized void close() {
        if (this.f176101g && !this.f176102h) {
            for (caux caux : (caux[]) this.f176110q.values().toArray(new caux[this.f176110q.size()])) {
                cauw cauw = caux.f176090f;
                if (cauw != null) {
                    cauw.mo74934a();
                }
            }
            mo74948e();
            this.f176109p.close();
            this.f176109p = null;
        }
        this.f176102h = true;
    }

    /* renamed from: d */
    public final synchronized boolean mo74947d() {
        return this.f176102h;
    }

    /* renamed from: e */
    public final void mo74948e() {
        while (this.f176108o > this.f176107n) {
            mo74941a((caux) this.f176110q.values().iterator().next());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized cauy mo74938a(String str) {
        mo74939a();
        m127271h();
        m127268d(str);
        caux caux = (caux) this.f176110q.get(str);
        if (caux != null && caux.f176089e && (r0 = caux.mo74935a()) != null) {
            this.f176099e++;
            cipv cipv = this.f176109p;
            cipv.mo86293b("READ");
            cipv.mo86316h(32);
            cipv.mo86293b(str);
            cipv.mo86316h(10);
            if (mo74945c()) {
                this.f176112s.execute(this.f176113t);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo74945c() {
        int i = this.f176099e;
        return i >= 2000 && i >= this.f176110q.size();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final synchronized void mo74943b() {
        cipv cipv = this.f176109p;
        if (cipv != null) {
            cipv.close();
        }
        cipv a = ciqh.m150827a(this.f176096b.mo75171a(this.f176104k));
        try {
            a.mo86293b("libcore.io.DiskLruCache");
            a.mo86316h(10);
            a.mo86293b("1");
            a.mo86316h(10);
            a.mo86320i((long) this.f176106m);
            a.mo86316h(10);
            a.mo86320i((long) this.f176098d);
            a.mo86316h(10);
            a.mo86316h(10);
            for (caux caux : this.f176110q.values()) {
                if (caux.f176090f == null) {
                    a.mo86293b("CLEAN");
                    a.mo86316h(32);
                    a.mo86293b(caux.f176085a);
                    caux.mo74936a(a);
                    a.mo86316h(10);
                } else {
                    a.mo86293b("DIRTY");
                    a.mo86316h(32);
                    a.mo86293b(caux.f176085a);
                    a.mo86316h(10);
                }
            }
            a.close();
            if (this.f176103j.exists()) {
                this.f176096b.mo75172a(this.f176103j, this.f176105l);
            }
            this.f176096b.mo75172a(this.f176104k, this.f176103j);
            this.f176096b.mo75173b(this.f176105l);
            this.f176109p = m127270g();
            this.f176100f = false;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo74939a() {
        if (!this.f176101g) {
            if (this.f176105l.exists()) {
                if (this.f176103j.exists()) {
                    this.f176096b.mo75173b(this.f176105l);
                } else {
                    this.f176096b.mo75172a(this.f176105l, this.f176103j);
                }
            }
            if (this.f176103j.exists()) {
                try {
                    m127269f();
                    this.f176096b.mo75173b(this.f176104k);
                    Iterator it = this.f176110q.values().iterator();
                    while (it.hasNext()) {
                        caux caux = (caux) it.next();
                        if (caux.f176090f != null) {
                            caux.f176090f = null;
                            for (int i = 0; i < this.f176098d; i++) {
                                this.f176096b.mo75173b(caux.f176087c[i]);
                                this.f176096b.mo75173b(caux.f176088d[i]);
                            }
                            it.remove();
                        } else {
                            for (int i2 = 0; i2 < this.f176098d; i2++) {
                                this.f176108o += caux.f176086b[i2];
                            }
                        }
                    }
                    this.f176101g = true;
                    return;
                } catch (IOException e) {
                    cavh cavh = cavh.f176134a;
                    String valueOf = String.valueOf(this.f176097c);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    cavh.mo74959a(sb.toString());
                    close();
                    this.f176096b.mo75174c(this.f176097c);
                    this.f176102h = false;
                }
            }
            mo74943b();
            this.f176101g = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo74940a(cauw cauw, boolean z) {
        int i;
        int i2;
        caux caux = cauw.f176081a;
        if (caux.f176090f == cauw) {
            if (!z) {
                i = 0;
            } else if (caux.f176089e) {
                i = 0;
            } else {
                int i3 = 0;
                while (i3 < this.f176098d) {
                    if (!cauw.f176082b[0]) {
                        cauw.mo74934a();
                        StringBuilder sb = new StringBuilder(61);
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(0);
                        throw new IllegalStateException(sb.toString());
                    } else if (caux.f176088d[0].exists()) {
                        i3 = 1;
                    } else {
                        cauw.mo74934a();
                        return;
                    }
                }
                i = 0;
            }
            while (i < this.f176098d) {
                File file = caux.f176088d[0];
                if (!z) {
                    this.f176096b.mo75173b(file);
                    i2 = 1;
                } else {
                    if (file.exists()) {
                        File file2 = caux.f176087c[0];
                        this.f176096b.mo75172a(file, file2);
                        long j = caux.f176086b[0];
                        long length = file2.length();
                        caux.f176086b[0] = length;
                        this.f176108o = (this.f176108o - j) + length;
                    }
                    i2 = 1;
                }
            }
            this.f176099e++;
            caux.f176090f = null;
            if (!caux.f176089e && !z) {
                this.f176110q.remove(caux.f176085a);
                cipv cipv = this.f176109p;
                cipv.mo86293b("REMOVE");
                cipv.mo86316h(32);
                this.f176109p.mo86293b(caux.f176085a);
                this.f176109p.mo86316h(10);
            } else {
                caux.f176089e = true;
                cipv cipv2 = this.f176109p;
                cipv2.mo86293b("CLEAN");
                cipv2.mo86316h(32);
                this.f176109p.mo86293b(caux.f176085a);
                caux.mo74936a(this.f176109p);
                this.f176109p.mo86316h(10);
                if (z) {
                    long j2 = this.f176111r;
                    this.f176111r = 1 + j2;
                    caux.f176091g = j2;
                }
            }
            this.f176109p.flush();
            if (this.f176108o > this.f176107n || mo74945c()) {
                this.f176112s.execute(this.f176113t);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final void mo74941a(caux caux) {
        int i;
        cauw cauw = caux.f176090f;
        if (cauw != null) {
            cauw.f176083c = true;
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.f176098d) {
            this.f176096b.mo75173b(caux.f176087c[0]);
            long j = this.f176108o;
            long[] jArr = caux.f176086b;
            this.f176108o = j - jArr[0];
            jArr[0] = 0;
            i = 1;
        }
        this.f176099e++;
        cipv cipv = this.f176109p;
        cipv.mo86293b("REMOVE");
        cipv.mo86316h(32);
        cipv.mo86293b(caux.f176085a);
        cipv.mo86316h(10);
        this.f176110q.remove(caux.f176085a);
        if (mo74945c()) {
            this.f176112s.execute(this.f176113t);
        }
    }
}
