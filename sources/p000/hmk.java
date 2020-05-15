package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Collection;
import java.util.Collections;

/* renamed from: hmk */
final /* synthetic */ class hmk implements bmxj {

    /* renamed from: a */
    private final Credential f20024a;

    public hmk(Credential credential) {
        this.f20024a = credential;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnec.a(java.util.Collection, bmxz):java.util.Collection
     arg types: [bngx, hmq]
     candidates:
      bnec.a(java.util.Collection, bmxj):java.util.Collection
      bnec.a(java.util.Collection, java.lang.Object):boolean
      bnec.a(java.util.Collection, java.util.Collection):boolean
      bnec.a(java.util.Collection, bmxz):java.util.Collection */
    public final Object apply(Object obj) {
        Collection a = bnec.m109117a((Collection) ((bngx) obj), (bmxz) new hmq(this.f20024a));
        if (!a.isEmpty()) {
            return hmt.m14617a((qun) Collections.max(a, new hdu(hmr.f20040a)));
        }
        throw adbe.m50108a("Unable to find the matching credential.", 8).mo33303c();
    }
}
