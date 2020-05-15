package p000;

import java.net.ProtocolException;

/* renamed from: cayb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayb implements ciqq {

    /* renamed from: a */
    public final cipu f176373a;

    /* renamed from: b */
    private boolean f176374b;

    /* renamed from: c */
    private final int f176375c;

    public cayb() {
        this(-1);
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        if (!this.f176374b) {
            cavk.m127309a(cipu.f191213b, j);
            int i = this.f176375c;
            if (i == -1 || this.f176373a.f191213b <= ((long) i) - j) {
                this.f176373a.mo74930a(cipu, j);
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("exceeded content-length limit of ");
            sb.append(i);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f176374b) {
            this.f176374b = true;
            long j = this.f176373a.f191213b;
            int i = this.f176375c;
            if (j < ((long) i)) {
                StringBuilder sb = new StringBuilder(76);
                sb.append("content-length promised ");
                sb.append(i);
                sb.append(" bytes, but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return ciqt.f191261f;
    }

    public final void flush() {
    }

    public cayb(int i) {
        this.f176373a = new cipu();
        this.f176375c = i;
    }

    /* renamed from: a */
    public final void mo75067a(ciqq ciqq) {
        cipu cipu = new cipu();
        cipu cipu2 = this.f176373a;
        cipu2.mo86291b(cipu, cipu2.f191213b);
        ciqq.mo74930a(cipu, cipu.f191213b);
    }
}
