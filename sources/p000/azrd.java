package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.ExecutionException;

/* renamed from: azrd */
final /* synthetic */ class azrd implements bmxj {

    /* renamed from: a */
    private final azrk f99932a;

    /* renamed from: b */
    private final bmxj f99933b;

    public azrd(azrk azrk, bmxj bmxj) {
        this.f99932a = azrk;
        this.f99933b = bmxj;
    }

    public final Object apply(Object obj) {
        azrk azrk = this.f99932a;
        bmxj bmxj = this.f99933b;
        azqf a = azqf.m86130a(azrk.f99942a);
        ContactId contactId = (ContactId) bmxj.apply(obj);
        try {
            return (bmxv) azbj.m85193a(a.f99879a).mo54563c().mo56342c(contactId).get();
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("LighterUtils", e, "Exception when trying to get AccountContext for user %s", contactId);
            return bmvz.f131120a;
        }
    }
}
