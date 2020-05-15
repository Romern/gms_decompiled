package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;

/* renamed from: ajfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfw extends buqn {

    /* renamed from: a */
    final /* synthetic */ UnpublishRequest f70542a;

    /* renamed from: b */
    final /* synthetic */ ajgf f70543b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfw(ajgf ajgf, String str, UnpublishRequest unpublishRequest) {
        super(str);
        this.f70543b = ajgf;
        this.f70542a = unpublishRequest;
    }

    public final void run() {
        aixw a = this.f70543b.mo38595a(this.f70542a.f80783g);
        UnpublishRequest unpublishRequest = this.f70542a;
        if (a.f70031e.mo38253c(unpublishRequest.f80779c)) {
            Message message = unpublishRequest.f80778b.f80742b;
            String a2 = aiye.m58198a(a.f70028b, message);
            srn srn = ahfq.f67120a;
            aixz aixz = new aixz(a.f70028b, 3);
            aiya aiya = a.f70030d;
            bxvd da = bywm.f168613n.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm = (bywm) da.f164949b;
            bywm.f168616b = 2;
            bywm.f168615a |= 1;
            bxvd da2 = bywg.f168570c.mo74144da();
            bywz a3 = aiya.mo38240a(message);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bywg bywg = (bywg) da2.f164949b;
            a3.getClass();
            bywg.f168573b = a3;
            bywg.f168572a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywm bywm2 = (bywm) da.f164949b;
            bywg bywg2 = (bywg) da2.mo74062i();
            bywg2.getClass();
            bywm2.f168620f = bywg2;
            bywm2.f168615a |= 16;
            aiya.mo38243a(aixz, (bywm) da.mo74062i());
            a.f70032f.mo38169a(ajdm.m58553a(ajdr.m58562a(a.f70028b, a2), a.mo38234a(unpublishRequest.f80779c, aixz)), a.mo38238b(unpublishRequest.f80779c), a.f70028b);
            a.f70034h.mo38402a(a2);
        }
    }
}
