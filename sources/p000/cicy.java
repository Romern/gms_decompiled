package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: cicy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cicy {

    /* renamed from: a */
    final Long f189864a;

    /* renamed from: b */
    final Boolean f189865b;

    /* renamed from: c */
    final Integer f189866c;

    /* renamed from: d */
    final Integer f189867d;

    /* renamed from: e */
    final ciek f189868e;

    /* renamed from: f */
    final ciah f189869f;

    public cicy(Map map) {
        boolean z;
        this.f189864a = cibk.m149977h(map, "timeout");
        this.f189865b = cibk.m149978i(map, "waitForReady");
        Integer f = cibk.m149975f(map, "maxResponseMessageBytes");
        this.f189866c = f;
        boolean z2 = true;
        if (f != null) {
            if (f.intValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108596a(z, "maxInboundMessageSize %s exceeds bounds", this.f189866c);
        }
        Integer f2 = cibk.m149975f(map, "maxRequestMessageBytes");
        this.f189867d = f2;
        if (f2 != null) {
            bmxy.m108596a(f2.intValue() < 0 ? false : z2, "maxOutboundMessageSize %s exceeds bounds", this.f189867d);
        }
        this.f189868e = ciek.f189959f;
        this.f189869f = ciah.f189659b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cicy) {
            cicy cicy = (cicy) obj;
            if (!bmxi.m108538a(this.f189864a, cicy.f189864a) || !bmxi.m108538a(this.f189865b, cicy.f189865b) || !bmxi.m108538a(this.f189866c, cicy.f189866c) || !bmxi.m108538a(this.f189867d, cicy.f189867d) || !bmxi.m108538a(this.f189868e, cicy.f189868e) || !bmxi.m108538a(this.f189869f, cicy.f189869f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189864a, this.f189865b, this.f189866c, this.f189867d, this.f189868e, this.f189869f});
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("timeoutNanos", this.f189864a);
        a.mo66885a("waitForReady", this.f189865b);
        a.mo66885a("maxInboundMessageSize", this.f189866c);
        a.mo66885a("maxOutboundMessageSize", this.f189867d);
        a.mo66885a("retryPolicy", this.f189868e);
        a.mo66885a("hedgingPolicy", this.f189869f);
        return a.toString();
    }
}
