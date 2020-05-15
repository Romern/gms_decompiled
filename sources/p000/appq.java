package p000;

import android.content.Context;

/* renamed from: appq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class appq extends rjx implements apox {

    /* renamed from: a */
    private static final rjo f84788a = new rjo("SearchIndex.CORPORA_API", f84790c, f84789b);

    /* renamed from: b */
    private static final rje f84789b = new rje();

    /* renamed from: c */
    private static final rjl f84790c = new appp();

    public appq(Context context, aplz aplz) {
        super(context, f84788a, aplz, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo47486a(String str, String str2) {
        roz b = rpa.m34196b();
        b.f43472a = new appm(str, str2);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final aucb mo47488b(String str, String str2) {
        roz b = rpa.m34196b();
        b.f43472a = new appn(str, str2);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo47487a(String str, String str2, long j) {
        roz b = rpa.m34196b();
        b.f43472a = new appl(str, str2, j);
        return mo24701a(b.mo24977a());
    }
}
