package p000;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: qav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qav extends ptx {

    /* renamed from: e */
    public final boolean f40840e = ccxv.m132091d();

    /* renamed from: f */
    public final Level f40841f;

    /* renamed from: g */
    public srn f40842g;

    /* renamed from: h */
    private final boolean f40843h = cczc.m132254b();

    public qav(String str) {
        super(str);
        this.f40841f = !this.f40843h ? Level.FINE : Level.INFO;
        if (this.f40840e) {
            this.f40842g = srn.m36125a(str);
        }
    }

    /* renamed from: a */
    public final void mo23856a(String str, Object obj) {
        if (!this.f40840e) {
            mo23862g(str, obj);
            return;
        }
        this.f40842g.mo26019b(this.f40841f).mo68420a(str, obj);
    }

    /* renamed from: b */
    public final void mo23861b(String str) {
        if (this.f40840e) {
            this.f40842g.mo26019b(this.f40841f).mo68405a(str);
        } else {
            mo23862g(str, new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo23862g(String str, Object... objArr) {
        if (this.f40843h) {
            Log.i(this.f40219b, mo23678e(str, objArr));
        } else {
            mo23678e(str, objArr);
        }
    }

    /* renamed from: a */
    public final void mo23857a(String str, Object obj, Object obj2) {
        if (!this.f40840e) {
            mo23862g(str, obj, obj2);
            return;
        }
        this.f40842g.mo26019b(this.f40841f).mo68424a(str, obj, obj2);
    }

    public qav(String str, byte[] bArr) {
        super(str, true);
        this.f40841f = !this.f40843h ? Level.FINE : Level.INFO;
        if (this.f40840e) {
            this.f40842g = srn.m36125a(str);
        }
    }

    /* renamed from: a */
    public final void mo23858a(String str, Object obj, Object obj2, Object obj3) {
        if (!this.f40840e) {
            mo23862g(str, obj, obj2, obj3);
            return;
        }
        this.f40842g.mo26019b(this.f40841f).mo68425a(str, obj, obj2, obj3);
    }

    /* renamed from: a */
    public final void mo23859a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!this.f40840e) {
            mo23862g(str, obj, obj2, obj3, obj4);
            return;
        }
        this.f40842g.mo26019b(this.f40841f).mo68426a(str, obj, obj2, obj3, obj4);
    }

    /* renamed from: a */
    public final void mo23860a(Throwable th, String str) {
        if (this.f40840e) {
            bnsl a = this.f40842g.mo26019b(this.f40841f);
            a.mo68437a(th);
            a.mo68405a(str);
        } else if (this.f40843h) {
            Log.i(this.f40219b, str, th);
        }
    }
}
