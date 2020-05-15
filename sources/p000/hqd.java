package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Map;

/* renamed from: hqd */
final /* synthetic */ class hqd implements bmxj {

    /* renamed from: a */
    static final bmxj f20220a = new hqd();

    private hqd() {
    }

    public final Object apply(Object obj) {
        Logger Logger = hql.f20228a;
        bngs j = bngx.m109377j();
        bnre i = bnny.m109908a(hdv.m14230a(hqf.f20222a)).mo67377a().mo67379b(((bnht) bnnm.m109864a((bngx) obj, hqe.f20221a)).f131642b.entrySet()).listIterator();
        while (i.hasNext()) {
            j.mo67668c((Credential) bnny.m109908a(hdv.m14230a(hqg.f20223a)).mo68168d((Iterable) ((Map.Entry) i.next()).getValue()));
        }
        return j.mo67664a();
    }
}
