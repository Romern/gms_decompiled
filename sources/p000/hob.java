package p000;

import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hob */
final /* synthetic */ class hob implements bmxj {

    /* renamed from: a */
    static final bmxj f20108a = new hob();

    private hob() {
    }

    public final Object apply(Object obj) {
        Logger Logger = hoh.f20114a;
        bngs j = bngx.m109377j();
        bngz a = bnnm.m109864a((bngx) obj, hoc.f20109a);
        bnrd a2 = a.mo67316o().iterator();
        while (a2.hasNext()) {
            j.mo67668c((InternalCredentialWrapper) bnny.m109908a(hdv.m14230a(hod.f20110a)).mo68168d(a.mo67692g((String) a2.next())));
        }
        return j.mo67664a();
    }
}
