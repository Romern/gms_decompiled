package p000;

import java.net.ProtocolException;

/* renamed from: caxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxk implements ciqq {

    /* renamed from: a */
    final /* synthetic */ caxn f176317a;

    /* renamed from: b */
    private final ciqb f176318b = new ciqb(this.f176317a.f176327c.mo74932df());

    /* renamed from: c */
    private boolean f176319c;

    /* renamed from: d */
    private long f176320d;

    public caxk(caxn caxn, long j) {
        this.f176317a = caxn;
        this.f176320d = j;
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        if (!this.f176319c) {
            cavk.m127309a(cipu.f191213b, j);
            long j2 = this.f176320d;
            if (j <= j2) {
                this.f176317a.f176327c.mo74930a(cipu, j);
                this.f176320d -= j;
                return;
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("expected ");
            sb.append(j2);
            sb.append(" bytes but received ");
            sb.append(j);
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f176319c) {
            this.f176319c = true;
            if (this.f176320d <= 0) {
                caxn.m127472a(this.f176318b);
                this.f176317a.f176328d = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f176318b;
    }

    public final void flush() {
        if (!this.f176319c) {
            this.f176317a.f176327c.flush();
        }
    }
}
