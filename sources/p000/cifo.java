package p000;

import java.io.IOException;
import java.net.Socket;

/* renamed from: cifo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifo implements ciqq {

    /* renamed from: a */
    public final Object f190012a = new Object();

    /* renamed from: b */
    public final cipu f190013b = new cipu();

    /* renamed from: c */
    public final cifp f190014c;

    /* renamed from: d */
    public boolean f190015d = false;

    /* renamed from: e */
    public boolean f190016e = false;

    /* renamed from: f */
    public ciqq f190017f;

    /* renamed from: g */
    public Socket f190018g;

    /* renamed from: h */
    private final ciep f190019h;

    /* renamed from: i */
    private boolean f190020i = false;

    public cifo(ciep ciep, cifp cifp) {
        bmxy.m108582a(ciep, "executor");
        this.f190019h = ciep;
        bmxy.m108582a(cifp, "exceptionHandler");
        this.f190014c = cifp;
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        bmxy.m108582a(cipu, "source");
        if (!this.f190020i) {
            int i = ciix.f190424a;
            synchronized (this.f190012a) {
                this.f190013b.mo74930a(cipu, j);
                if (!this.f190015d && !this.f190016e && this.f190013b.mo86302d() > 0) {
                    this.f190015d = true;
                    this.f190019h.execute(new cifk(this));
                    return;
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void close() {
        if (!this.f190020i) {
            this.f190020i = true;
            this.f190019h.execute(new cifm(this));
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return ciqt.f191261f;
    }

    public final void flush() {
        if (!this.f190020i) {
            int i = ciix.f190424a;
            synchronized (this.f190012a) {
                if (!this.f190016e) {
                    this.f190016e = true;
                    this.f190019h.execute(new cifl(this));
                    return;
                }
                return;
            }
        }
        throw new IOException("closed");
    }
}
