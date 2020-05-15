package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: bcde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcde extends C1140ko {

    /* renamed from: a */
    public final bmxj f103980a;

    /* renamed from: b */
    public final Uri f103981b;

    /* renamed from: c */
    final Uri f103982c;

    /* renamed from: d */
    final String[] f103983d;

    /* renamed from: e */
    final String f103984e;

    /* renamed from: f */
    final String[] f103985f;

    /* renamed from: g */
    final String f103986g;

    /* renamed from: h */
    final String f103987h;

    /* renamed from: i */
    public boolean f103988i = false;

    /* renamed from: j */
    final /* synthetic */ bcdf f103989j;

    /* renamed from: k */
    private final bcdd f103990k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bcde(bcdf bcdf, Context context, bmxj bmxj, Uri uri) {
        super(context);
        String[] strArr;
        this.f103989j = bcdf;
        this.f103980a = bmxj;
        this.f103981b = uri;
        bngx b = bcdf.f103993c.mo56687b();
        bngx d = bcdf.f103993c.mo56689d();
        this.f103982c = bcdf.f103993c.mo56686a();
        String[] strArr2 = null;
        if (b != null) {
            strArr = (String[]) b.toArray(new String[b.size()]);
        } else {
            strArr = null;
        }
        this.f103983d = strArr;
        this.f103984e = bcdf.f103993c.mo56688c();
        this.f103985f = d != null ? (String[]) d.toArray(new String[d.size()]) : strArr2;
        this.f103986g = bcdf.f103993c.mo56690e();
        this.f103987h = bcdf.m88812a(bcdf.f103993c.mo56693g(), bcdf.f103993c.mo56692f());
        this.f103990k = new bcdd(this);
        bcdp.m88848a().mo56718a(uri, this.f103990k);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        if (!this.f103988i) {
            this.f103988i = true;
            new bcdc(this).executeOnExecutor(this.f103989j.f103991a, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (takeContentChanged() || !this.f103989j.mo56712d().mo66813a()) {
            forceLoad();
        }
    }
}
