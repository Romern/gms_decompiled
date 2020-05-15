package p000;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

/* renamed from: cauk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauk {

    /* renamed from: a */
    public final caue f176037a;

    /* renamed from: b */
    public final String f176038b;

    /* renamed from: c */
    public final cauc f176039c;

    /* renamed from: d */
    public final caul f176040d;

    /* renamed from: e */
    public final Object f176041e;

    /* renamed from: f */
    public volatile URL f176042f;

    /* renamed from: g */
    public volatile catm f176043g;

    /* renamed from: h */
    private volatile URI f176044h;

    public cauk(cauj cauj) {
        this.f176037a = cauj.f176032a;
        this.f176038b = cauj.f176033b;
        this.f176039c = cauj.f176034c.mo74866a();
        this.f176040d = cauj.f176035d;
        Object obj = cauj.f176036e;
        this.f176041e = obj == null ? this : obj;
    }

    /* renamed from: a */
    public final String mo74910a(String str) {
        return this.f176039c.mo74873a(str);
    }

    /* renamed from: b */
    public final cauj mo74912b() {
        return new cauj(this);
    }

    /* renamed from: c */
    public final boolean mo74913c() {
        return this.f176037a.f175990a.equals("https");
    }

    public final String toString() {
        String str = this.f176038b;
        String valueOf = String.valueOf(this.f176037a);
        Object obj = this.f176041e;
        if (obj == this) {
            obj = null;
        }
        String valueOf2 = String.valueOf(obj);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Request{method=");
        sb.append(str);
        sb.append(", url=");
        sb.append(valueOf);
        sb.append(", tag=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final URI mo74911a() {
        try {
            URI uri = this.f176044h;
            if (uri != null) {
                return uri;
            }
            URI b = this.f176037a.mo74886b();
            this.f176044h = b;
            return b;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }
}
