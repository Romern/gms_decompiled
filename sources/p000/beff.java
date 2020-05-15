package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: beff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beff extends behz {

    /* renamed from: a */
    private final befu f111482a;

    /* renamed from: b */
    private final Context f111483b;

    /* renamed from: c */
    private final beoa f111484c;

    /* renamed from: d */
    private final befb f111485d;

    /* renamed from: e */
    private final Object f111486e = new Object();

    /* renamed from: f */
    private String f111487f;

    public beff(befe befe) {
        this.f111482a = new befu(befe.f111481d);
        this.f111483b = befe.f111478a;
        this.f111484c = befe.f111479b;
        this.f111485d = befe.f111480c;
    }

    /* renamed from: a */
    public static befe m94940a(Context context) {
        return new befe(context);
    }

    /* renamed from: d */
    private static final void m94941d() {
        throw new begf("Android backend cannot perform remote operations without a remote backend");
    }

    /* renamed from: n */
    private final boolean m94942n(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.f111483b.getPackageName().equals(uri.getAuthority());
    }

    /* renamed from: a */
    public final String mo36259a() {
        return "android";
    }

    /* renamed from: b */
    public final InputStream mo36264b(Uri uri) {
        if (!m94942n(uri)) {
            return this.f111482a.mo36264b(mo60655l(uri));
        }
        m94941d();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final behy mo60654c() {
        return this.f111482a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Uri mo60655l(Uri uri) {
        if (!m94942n(uri)) {
            File k = mo36273k(uri);
            befq a = befr.m94979a();
            a.mo60671a(k);
            return a.mo60670a();
        }
        throw new begt("Operation across authorities is not allowed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Uri mo60656m(Uri uri) {
        try {
            befh a = befi.m94962a(this.f111483b);
            a.mo60661a(uri.getPath(), this.f111485d);
            return a.mo60657a();
        } catch (IllegalArgumentException e) {
            throw new begt(e);
        }
    }

    /* renamed from: k */
    public final File mo36273k(Uri uri) {
        String str;
        if (!m94942n(uri)) {
            File b = befj.m94964a(this.f111483b, this.f111485d).mo60665b(uri);
            if (!aytw.m84815b(this.f111483b)) {
                synchronized (this.f111486e) {
                    if (this.f111487f == null) {
                        this.f111487f = befg.m94952b(this.f111483b).getAbsolutePath();
                    }
                    str = this.f111487f;
                }
                if (!b.getAbsolutePath().startsWith(str)) {
                    throw new begf("Cannot access credential-protected data from direct boot");
                }
            }
            return b;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    /* renamed from: a */
    public final void mo36261a(Uri uri, begn begn) {
        beny beny;
        if (this.f111484c != null) {
            if (begn.mo60697a()) {
                beny = beny.f111906a;
            } else if (begn.f111545b == 2) {
                beny = new beny(2, begn.f111544a);
            } else {
                throw new IllegalStateException("GcParam is not an expiration");
            }
            beoa beoa = this.f111484c;
            beoa.f111916b.mo60835a(mo36273k(uri), beny);
            return;
        }
        throw new begf("Android backend was not initialized with a garbage collector");
    }

    /* renamed from: a */
    public final boolean mo36262a(Uri uri) {
        if (!m94942n(uri)) {
            return this.f111482a.mo36262a(mo60655l(uri));
        }
        m94941d();
        throw null;
    }
}
