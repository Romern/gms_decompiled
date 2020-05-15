package p000;

import android.content.Context;

/* renamed from: xnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xnk extends rjx implements xmo {

    /* renamed from: a */
    private static final rjo f52791a = new rjo("Fido.FIDO_CREDENTIAL_STORE_API", new xmr(), f52792b);

    /* renamed from: b */
    private static final rje f52792b = new rje();

    public xnk(Context context) {
        super(context, f52791a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo29951a(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new xnf(str);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo29952a(String str, long j) {
        roz b = rpa.m34196b();
        b.f43472a = new xng(str, j);
        mo24701a(b.mo24977a());
    }
}
