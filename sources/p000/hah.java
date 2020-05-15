package p000;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.concurrent.Callable;

/* renamed from: hah */
final /* synthetic */ class hah implements Callable {

    /* renamed from: a */
    private final hav f19345a;

    public hah(hav hav) {
        this.f19345a = hav;
    }

    public final Object call() {
        hav hav = this.f19345a;
        adag a = adag.m50068a((Account) hav.f19363b.f19384h.mo2448b(), adag.f61199a);
        a.mo33283a(5);
        a.mo33287a(hav.f19363b.f19380d, hav.mo12365a());
        TokenResponse a2 = hav.f19369h.mo13425a(a.mo33282a());
        boolean z = true;
        if (a2.mo7647b().equals(izj.SUCCESS)) {
            z = false;
        } else if (!a2.mo7647b().equals(izj.NEED_REMOTE_CONSENT) && !a2.mo7647b().equals(izj.NEED_PERMISSION)) {
            throw new IllegalStateException("This should never happen.");
        }
        return Boolean.valueOf(z);
    }
}
