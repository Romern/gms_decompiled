package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

/* renamed from: ajfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfv extends buqn {

    /* renamed from: a */
    final /* synthetic */ PublishRequest f70540a;

    /* renamed from: b */
    final /* synthetic */ ajgf f70541b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfv(ajgf ajgf, String str, PublishRequest publishRequest) {
        super(str);
        this.f70541b = ajgf;
        this.f70540a = publishRequest;
    }

    public final void run() {
        aixw a = this.f70541b.mo38595a(this.f70540a.f80751i);
        PublishRequest publishRequest = this.f70540a;
        aiyd aiyd = a.f70031e;
        int a2 = ClientAppContext.m67402a(publishRequest.f80752j, aiyd.f70048a.f80668c);
        if (aiyd.m58182a(a2, publishRequest.f80746d) && aiyd.mo38246a(publishRequest.f80746d) && aiyd.mo38247a(publishRequest.f80746d, publishRequest.f80745c) && aiyd.mo38250a("publish", publishRequest.f80746d, a2)) {
            int i = publishRequest.f80745c.f80692e;
            ajcg ajcg = publishRequest.f80746d;
            if (i != Integer.MAX_VALUE) {
                boolean b = publishRequest.f80744b.f80742b.mo44303b();
                if (b && !publishRequest.f80745c.mo44317b()) {
                    aixw.m58159a(new Status(10, "Discovery mode must be BROADCAST or DEFAULT for raw audio publish."), publishRequest.f80746d);
                } else if (aiyd.mo38248a(publishRequest.f80745c, b, publishRequest.f80746d)) {
                    Message message = publishRequest.f80744b.f80742b;
                    String a3 = aiye.m58198a(a.f70028b, message);
                    srn srn = ahfq.f67120a;
                    Strategy strategy = publishRequest.f80745c;
                    int i2 = strategy.f80692e;
                    int i3 = strategy.f80693f;
                    int i4 = strategy.f80696i;
                    String str = message.f80677c;
                    byte[] bArr = message.f80676b;
                    aixz aixz = new aixz(a.f70028b, 2);
                    aiya aiya = a.f70030d;
                    bxvd da = bywm.f168613n.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bywm bywm = (bywm) da.f164949b;
                    bywm.f168616b = 1;
                    bywm.f168615a |= 1;
                    bxvd da2 = bywa.f168547c.mo74144da();
                    bywz a4 = aiya.mo38240a(message);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bywa bywa = (bywa) da2.f164949b;
                    a4.getClass();
                    bywa.f168550b = a4;
                    bywa.f168549a = 1 | bywa.f168549a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bywm bywm2 = (bywm) da.f164949b;
                    bywa bywa2 = (bywa) da2.mo74062i();
                    bywa2.getClass();
                    bywm2.f168618d = bywa2;
                    bywm2.f168615a |= 4;
                    aiya.mo38243a(aixz, (bywm) da.mo74062i());
                    aiwp aiwp = a.f70032f;
                    aiye aiye = new aiye(a.f70028b, message, aixw.m58155a(publishRequest.f80745c, message.mo44303b(), false));
                    rkl a5 = a.mo38234a(publishRequest.f80746d, aixz);
                    sdo.m34959a(aiye);
                    aiwp.mo38169a(new ajdm(1, aiye, null, null, null, a5), a.mo38238b(publishRequest.f80746d), a.f70028b);
                    ajap ajap = a.f70034h;
                    int i5 = publishRequest.f80745c.f80692e;
                    ajck ajck = publishRequest.f80753k;
                    if (!(ajck == null || i5 == Integer.MAX_VALUE)) {
                        ajap.f70261a.mo38405a(a3, ajck);
                        String valueOf = String.valueOf(a3);
                        ajap.f70265e.mo72983a(new ajam(ajap, valueOf.length() == 0 ? new String("PublishSubscribeCallbackCache.publish:") : "PublishSubscribeCallbackCache.publish:".concat(valueOf), a3), (long) (i5 * 1000));
                    }
                    aiyb.m58178a(a.f70027a);
                }
            } else {
                aixw.m58159a(new Status(10, "TTL_SECONDS_INFINITE is not currently supported for publishes."), ajcg);
            }
        }
    }
}
