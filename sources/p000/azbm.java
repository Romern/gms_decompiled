package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: azbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbm {

    /* renamed from: h */
    private static WeakReference f98905h = new WeakReference(null);

    /* renamed from: a */
    public final Context f98906a;

    /* renamed from: b */
    public final azbr f98907b = new azbr(this.f98906a);

    /* renamed from: c */
    public final azbt f98908c = new azbt(this.f98906a);

    /* renamed from: d */
    public final azbq f98909d = new azbq(this.f98906a);

    /* renamed from: e */
    public final azbs f98910e = new azbs(this.f98906a);

    /* renamed from: f */
    public final bdae f98911f = new azcn(this.f98906a);

    /* renamed from: g */
    public final azco f98912g = new azco(this.f98906a);

    private azbm(Context context) {
        this.f98906a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized azbm m85205a(Context context) {
        azbm azbm;
        synchronized (azbm.class) {
            azbm = (azbm) f98905h.get();
            if (azbm == null) {
                azbm = new azbm(context);
                f98905h = new WeakReference(azbm);
            }
        }
        return azbm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final azbl mo54572b() {
        return new azbl(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final azbk mo54571a() {
        return new azbk(this);
    }
}
