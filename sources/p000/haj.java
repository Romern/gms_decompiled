package p000;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Callable;

/* renamed from: haj */
final /* synthetic */ class haj implements Callable {

    /* renamed from: a */
    private final hav f19347a;

    public haj(hav hav) {
        this.f19347a = hav;
    }

    public final Object call() {
        hav hav = this.f19347a;
        adag a = adag.m50069a((Account) hav.f19363b.f19384h.mo2448b(), hav.f19363b.f19381e.f10224a);
        a.mo33288a(true);
        a.mo33290b(true);
        a.mo33283a(5);
        a.mo33287a(hav.f19363b.f19380d, hav.mo12365a());
        a.mo33285a(iyb.GRANTED);
        String str = hav.f19369h.mo13425a(a.mo33282a()).f10727d;
        bmxv a2 = adad.m50067a(str);
        if (a2.mo66813a()) {
            adac adac = (adac) a2.mo66814b();
            return new SignInCredential((String) adac.f61194e.mo66814b(), (String) adac.f61191b.mo66815c(), (String) adac.f61192c.mo66815c(), (String) adac.f61193d.mo66815c(), (Uri) adac.f61195f.mo66815c(), null, str);
        }
        throw new IllegalStateException("Invalid token");
    }
}
