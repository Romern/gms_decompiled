package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: catk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catk {

    /* renamed from: a */
    public final caue f175826a;

    /* renamed from: b */
    public final catz f175827b;

    /* renamed from: c */
    public final SocketFactory f175828c;

    /* renamed from: d */
    public final List f175829d;

    /* renamed from: e */
    public final List f175830e;

    /* renamed from: f */
    public final ProxySelector f175831f;

    /* renamed from: g */
    public final Proxy f175832g;

    /* renamed from: h */
    public final SSLSocketFactory f175833h;

    /* renamed from: i */
    public final HostnameVerifier f175834i;

    /* renamed from: j */
    public final cato f175835j;

    /* renamed from: k */
    public final caxc f175836k;

    public catk(String str, int i, catz catz, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, cato cato, caxc caxc, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        caud caud = new caud();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        caud.mo74883c(str2);
        caud.mo74882b(str);
        caud.mo74879a(i);
        this.f175826a = caud.mo74881b();
        if (catz != null) {
            this.f175827b = catz;
            if (socketFactory != null) {
                this.f175828c = socketFactory;
                if (caxc != null) {
                    this.f175836k = caxc;
                    if (list != null) {
                        this.f175829d = cavk.m127306a(list);
                        if (list2 != null) {
                            this.f175830e = cavk.m127306a(list2);
                            if (proxySelector != null) {
                                this.f175831f = proxySelector;
                                this.f175832g = proxy;
                                this.f175833h = sSLSocketFactory;
                                this.f175834i = hostnameVerifier;
                                this.f175835j = cato;
                                return;
                            }
                            throw new IllegalArgumentException("proxySelector == null");
                        }
                        throw new IllegalArgumentException("connectionSpecs == null");
                    }
                    throw new IllegalArgumentException("protocols == null");
                }
                throw new IllegalArgumentException("authenticator == null");
            }
            throw new IllegalArgumentException("socketFactory == null");
        }
        throw new IllegalArgumentException("dns == null");
    }

    @Deprecated
    /* renamed from: a */
    public final String mo74845a() {
        return this.f175826a.f175991b;
    }

    @Deprecated
    /* renamed from: b */
    public final int mo74846b() {
        return this.f175826a.f175992c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof catk) {
            catk catk = (catk) obj;
            return this.f175826a.equals(catk.f175826a) && this.f175827b.equals(catk.f175827b) && this.f175836k.equals(catk.f175836k) && this.f175829d.equals(catk.f175829d) && this.f175830e.equals(catk.f175830e) && this.f175831f.equals(catk.f175831f) && cavk.m127316a(this.f175832g, catk.f175832g) && cavk.m127316a(this.f175833h, catk.f175833h) && cavk.m127316a(this.f175834i, catk.f175834i) && cavk.m127316a(this.f175835j, catk.f175835j);
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f175826a.hashCode() + 527) * 31) + this.f175827b.hashCode()) * 31) + this.f175836k.hashCode()) * 31) + this.f175829d.hashCode()) * 31) + this.f175830e.hashCode()) * 31) + this.f175831f.hashCode()) * 31;
        Proxy proxy = this.f175832g;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f175833h;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f175834i;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        cato cato = this.f175835j;
        if (cato != null) {
            i = cato.hashCode();
        }
        return hashCode4 + i;
    }
}
