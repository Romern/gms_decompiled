package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: cawg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cawg {

    /* renamed from: a */
    long f176226a = 0;

    /* renamed from: b */
    long f176227b;

    /* renamed from: c */
    public final int f176228c;

    /* renamed from: d */
    public final cawc f176229d;

    /* renamed from: e */
    public List f176230e;

    /* renamed from: f */
    public final cawe f176231f;

    /* renamed from: g */
    final cawd f176232g;

    /* renamed from: h */
    public final cawf f176233h = new cawf(this);

    /* renamed from: i */
    public final cawf f176234i = new cawf(this);

    /* renamed from: j */
    public cavl f176235j = null;

    public cawg(int i, cawc cawc, boolean z, boolean z2) {
        if (cawc != null) {
            this.f176228c = i;
            this.f176229d = cawc;
            this.f176227b = (long) cawc.f176207m.mo75036c();
            this.f176231f = new cawe(this, (long) cawc.f176206l.mo75036c());
            this.f176232g = new cawd(this);
            this.f176231f.f176223e = z2;
            this.f176232g.f176216b = z;
            return;
        }
        throw new NullPointerException("connection == null");
    }

    /* renamed from: d */
    private final boolean m127379d(cavl cavl) {
        synchronized (this) {
            if (this.f176235j != null) {
                return false;
            }
            if (this.f176231f.f176223e) {
                cawd cawd = this.f176232g;
                int i = cawd.f176214d;
                if (cawd.f176216b) {
                    return false;
                }
            }
            this.f176235j = cavl;
            notifyAll();
            this.f176229d.mo74990b(this.f176228c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75001a(long j) {
        this.f176227b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo75004b(cavl cavl) {
        if (m127379d(cavl)) {
            this.f176229d.mo74987a(this.f176228c, cavl);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r4.f176233h.mo75000b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    public final synchronized List mo75006c() {
        List list;
        this.f176233h.mo86273c();
        while (true) {
            if (this.f176230e != null) {
                break;
            } else if (this.f176235j == null) {
                mo75012h();
            }
        }
        this.f176233h.mo75000b();
        list = this.f176230e;
        if (list == null) {
            String valueOf = String.valueOf(this.f176235j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("stream was reset: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo75009e() {
        boolean a;
        synchronized (this) {
            this.f176231f.f176223e = true;
            a = mo75003a();
            notifyAll();
        }
        if (!a) {
            this.f176229d.mo74990b(this.f176228c);
        }
    }

    /* renamed from: f */
    public final void mo75010f() {
        boolean z;
        boolean a;
        synchronized (this) {
            cawe cawe = this.f176231f;
            z = true;
            if (!cawe.f176223e && cawe.f176222d) {
                cawd cawd = this.f176232g;
                int i = cawd.f176214d;
                if (!cawd.f176216b) {
                    if (cawd.f176215a) {
                    }
                }
                a = mo75003a();
            }
            z = false;
            a = mo75003a();
        }
        if (z) {
            mo75002a(cavl.CANCEL);
        } else if (!a) {
            this.f176229d.mo74990b(this.f176228c);
        }
    }

    /* renamed from: g */
    public final void mo75011g() {
        cawd cawd = this.f176232g;
        int i = cawd.f176214d;
        if (cawd.f176215a) {
            throw new IOException("stream closed");
        } else if (!cawd.f176216b) {
            cavl cavl = this.f176235j;
            if (cavl != null) {
                String valueOf = String.valueOf(cavl);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("stream was reset: ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* renamed from: h */
    public final void mo75012h() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: a */
    public final void mo75002a(cavl cavl) {
        if (m127379d(cavl)) {
            this.f176229d.mo74992b(this.f176228c, cavl);
        }
    }

    /* renamed from: b */
    public final boolean mo75005b() {
        return this.f176229d.f176197c == (this.f176228c & true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.f176215a == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r3.f176230e == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo75003a() {
        if (this.f176235j == null) {
            cawe cawe = this.f176231f;
            if (cawe.f176223e || cawe.f176222d) {
                cawd cawd = this.f176232g;
                int i = cawd.f176214d;
                if (!cawd.f176216b) {
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo75007c(cavl cavl) {
        if (this.f176235j == null) {
            this.f176235j = cavl;
            notifyAll();
        }
    }

    /* renamed from: d */
    public final ciqq mo75008d() {
        synchronized (this) {
            if (this.f176230e == null) {
                if (!mo75005b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f176232g;
    }
}
