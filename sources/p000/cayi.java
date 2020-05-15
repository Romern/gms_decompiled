package p000;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cayi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayi extends cayg {

    /* renamed from: a */
    private final cayh f176409a;

    public cayi(cayh cayh) {
        super(cayh);
        this.f176409a = cayh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final caua mo75080a() {
        caxt caxt = this.f176409a.f176402c;
        if (caxt != null) {
            return caxt.mo75061c() ? this.f176409a.f176402c.mo75062d().f176059e : this.f176409a.f176403d;
        }
        throw new IllegalStateException("Connection has not yet been established");
    }

    public final long getContentLengthLong() {
        return this.f176409a.getContentLengthLong();
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.f176409a.getHeaderFieldLong(str, j);
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f176409a.f176400a.f176008j;
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f176409a.f176400a.f176007i;
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.f176409a.setFixedLengthStreamingMode(j);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f176409a.f176400a.f176008j = hostnameVerifier;
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f176409a.f176400a.f176007i = sSLSocketFactory;
    }
}
