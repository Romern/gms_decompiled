package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;

/* renamed from: bcdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcdi extends bcdf {

    /* renamed from: e */
    public final bmxj f104000e;

    /* renamed from: h */
    private final bmxz f104001h;

    /* renamed from: i */
    private final bbqt f104002i;

    public bcdi(Context context, bmxj bmxj, bdae bdae, Uri uri, bcdo bcdo) {
        super(context, new bcdg(bmxj), bdae, uri, bcdo);
        bmxy.m108582a(bcdo.mo56694h(), "filterPredicate isn't valid in parent monitor");
        this.f104000e = bmxj;
        this.f104001h = bcdo.mo56694h();
        this.f104002i = bbqt.m88417a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final bngx mo56709a(bngx bngx) {
        return bngx.m109355a(bnjd.m109586b((Iterable) bngx, this.f104001h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo56707c() {
        bbov.m88299a();
        int f = this.f103993c.mo56692f();
        if (f == -1 || f < 0) {
            return Pair.create(mo56709a((bngx) ((Pair) super.mo56707c()).first), false);
        }
        if (f == 0) {
            bbos.m88294d("FilterLstMonitor", "limit==0 is meaningless. Please check!! returning (list=[], hasMore=true)");
            return Pair.create(bngx.m109376e(), true);
        }
        int intValue = ((Integer) this.f104002i.f103172n.mo58455c()).intValue();
        if (intValue <= 0) {
            intValue = ((Integer) this.f104002i.f103173o.mo58455c()).intValue() * f;
        }
        return (Pair) bcbb.m88741a(this.f103992b, new bcdh(this, intValue, new bngs(), f));
    }
}
