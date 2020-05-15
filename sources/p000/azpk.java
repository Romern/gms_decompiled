package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: azpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azpk {

    /* renamed from: e */
    private static azpk f99826e;

    /* renamed from: a */
    UUID f99827a;

    /* renamed from: b */
    String f99828b = "";

    /* renamed from: c */
    final Map f99829c;

    /* renamed from: d */
    int f99830d = 1;

    /* renamed from: f */
    private final azph f99831f;

    /* renamed from: g */
    private final Object f99832g = new Object();

    public azpk(Context context) {
        this.f99831f = azph.m85998a(context);
        mo55175a();
        this.f99829c = new HashMap();
    }

    /* renamed from: a */
    public static synchronized azpk m86089a(Context context) {
        azpk azpk;
        synchronized (azpk.class) {
            if (f99826e == null) {
                f99826e = new azpk(context.getApplicationContext());
            }
            azpk = f99826e;
        }
        return azpk;
    }

    /* renamed from: b */
    public final synchronized String mo55179b() {
        return this.f99827a.toString();
    }

    /* renamed from: b */
    public final synchronized void mo55181b(String str) {
        this.f99828b = str;
    }

    /* renamed from: c */
    public final synchronized String mo55182c() {
        return this.f99828b;
    }

    /* renamed from: d */
    public final void mo55184d() {
        synchronized (this.f99832g) {
            this.f99829c.clear();
            this.f99831f.mo55125a(392);
        }
    }

    /* renamed from: e */
    public final synchronized int mo55186e() {
        return this.f99830d;
    }

    /* renamed from: a */
    public final synchronized void mo55175a() {
        this.f99827a = UUID.randomUUID();
        this.f99830d = 1;
        this.f99828b = "";
    }

    /* renamed from: b */
    public final synchronized void mo55180b(int i) {
        if (i == 0) {
            azoj.m85933c("LTLogUtils", "Could not set null entry point", new Object[0]);
        } else {
            this.f99830d = i;
        }
    }

    /* renamed from: c */
    public final void mo55183c(String str) {
        qxo qxo;
        synchronized (this.f99832g) {
            qxo = (qxo) this.f99829c.remove(str);
        }
        if (qxo != null) {
            this.f99831f.mo55148a(394, str, qxo.mo24370a());
            new Object[1][0] = str;
            return;
        }
        azoj.m85932b("LTLogUtils", "Could not find timer for %s", str);
    }

    /* renamed from: d */
    public final void mo55185d(String str) {
        synchronized (this.f99832g) {
            if (this.f99829c.containsKey(str)) {
                azph azph = this.f99831f;
                long a = ((qxo) this.f99829c.get(str)).mo24370a();
                StringBuilder sb = new StringBuilder(str.length() + 22);
                sb.append(str);
                sb.append(": ");
                sb.append(a);
                azph.mo55171c(391, 64, sb.toString());
                this.f99829c.remove(str);
            }
            this.f99829c.put(str, this.f99831f.mo55123a(str));
            new Object[1][0] = str;
            qxo qxo = (qxo) this.f99829c.get(str);
        }
    }

    /* renamed from: e */
    public final void mo55187e(String str) {
        qxo qxo;
        synchronized (this.f99832g) {
            qxo = (qxo) this.f99829c.remove(str);
        }
        if (qxo == null) {
            azoj.m85932b("LTLogUtils", "Could not find timer for %s", str);
            return;
        }
        if (!cfgs.m139395O()) {
            this.f99831f.mo55148a(377, str, qxo.mo24370a());
            this.f99831f.mo55163a(qxo);
        }
        new Object[1][0] = str;
    }

    /* renamed from: a */
    public final synchronized void mo55176a(int i) {
        mo55180b(boqg.m111447a(i));
    }

    /* renamed from: a */
    public final synchronized void mo55177a(String str) {
        if (str == null) {
            azoj.m85933c("LTLogUtils", "Could not set null session ID", new Object[0]);
        } else {
            this.f99827a = UUID.fromString(str);
        }
    }

    /* renamed from: a */
    public final void mo55178a(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis > 0) {
            this.f99831f.mo55148a(377, str, currentTimeMillis);
            this.f99831f.mo55161a(str, currentTimeMillis);
            return;
        }
        this.f99831f.mo55172c(1814, String.valueOf(currentTimeMillis));
    }
}
