package p000;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: hph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hph implements hep {

    /* renamed from: a */
    public final ixl f20160a;

    /* renamed from: b */
    public final bqgj f20161b = sne.m35694a(4, 9);

    /* renamed from: c */
    public final String f20162c;

    /* renamed from: d */
    private final Context f20163d;

    /* renamed from: e */
    private final bngx f20164e;

    /* renamed from: f */
    private final rjx f20165f;

    public hph(Context context, rjx rjx, String str, List list) {
        sdo.m34959a(context);
        this.f20163d = context;
        sdo.m34959a(rjx);
        this.f20165f = rjx;
        sdo.m34977c(str);
        this.f20162c = str;
        this.f20164e = bngx.m109368a((Collection) list);
        this.f20160a = aczw.m50063a(context);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ID_TOKEN_SIGN_IN_CREDENTIALS;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hox]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        int i = spn.m35897i(this.f20163d, this.f20162c);
        if (i != -1) {
            bqgg a = adax.m50094a(bnjd.m109575a((Iterable) this.f20164e, (bmxj) new hox(this, i)), hoy.f20144a);
            bqgg a2 = new hnz(this.f20165f, this.f20164e).mo12291a(hez);
            return bqga.m112786c(a, a2).mo69216a(new hoz(a2, a), bqfb.INSTANCE);
        }
        throw adbe.m50106a(28442);
    }
}
