package p000;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: xia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xia {

    /* renamed from: a */
    public final URL f52323a;

    private xia(URL url) {
        this.f52323a = url;
    }

    /* renamed from: a */
    public static xia m42981a(String str) {
        return new xia(new URL(str));
    }

    /* renamed from: b */
    public final String mo29779b() {
        return this.f52323a.getProtocol();
    }

    /* renamed from: c */
    public final String mo29780c() {
        return this.f52323a.getHost();
    }

    public final boolean equals(Object obj) {
        return bmxi.m108538a(this.f52323a, obj);
    }

    public final int hashCode() {
        return this.f52323a.hashCode();
    }

    public final String toString() {
        return this.f52323a.toString();
    }

    /* renamed from: a */
    public final URLConnection mo29778a() {
        return stp.m36306a(this.f52323a, 4096);
    }
}
