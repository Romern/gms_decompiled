package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: adeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adeq implements adex {

    /* renamed from: a */
    final /* synthetic */ Collection f61508a;

    /* renamed from: b */
    final /* synthetic */ Account f61509b;

    /* renamed from: c */
    final /* synthetic */ adet f61510c;

    public adeq(adet adet, Collection collection, Account account) {
        this.f61510c = adet;
        this.f61508a = collection;
        this.f61509b = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo33395a() {
        this.f61510c.f61522d.mo33417b();
        adff a = this.f61510c.f61522d.mo33416a();
        bxvd da = btii.f148978e.mo74144da();
        adet adet = this.f61510c;
        btio a2 = adet.mo33396a(a, adkx.m50779a(adet.f61520b));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((btii) da.f164949b).f148980a = a2;
        boolean a3 = this.f61510c.mo33397a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btii) da.f164949b).f148981b = a3;
        boolean b = this.f61510c.mo33398b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btii btii = (btii) da.f164949b;
        btii.f148983d = b;
        Collection collection = this.f61508a;
        if (!btii.f148982c.mo73666a()) {
            btii.f148982c = bxvk.m124019a(btii.f148982c);
        }
        bxsy.m123078a(collection, btii.f148982c);
        btii btii2 = (btii) da.mo74062i();
        try {
            String a4 = this.f61510c.f61525g.mo33389a(this.f61509b);
            if (a4 != null) {
                this.f61510c.f61524f.mo17798a("auth_token", a4);
                this.f61510c.mo33399c();
                adfb a5 = this.f61510c.f61521c.mo33411a();
                try {
                    adet adet2 = this.f61510c;
                    adeu adeu = adet2.f61523e;
                    ClientContext clientContext = adet2.f61524f;
                    if (adeu.f61533f == null) {
                        adeu.f61533f = chtv.m149566a(chtu.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetIntentFilter", ciie.m150370a(btii.f148978e), ciie.m150370a(btik.f148985c));
                    }
                    btik btik = (btik) adeu.f61534a.mo25553a(adeu.f61533f, clientContext, btii2, (long) adeu.f61529b, TimeUnit.MILLISECONDS);
                    a5.mo33409a("RouterBackendClient.getIntentFilter.success");
                    return btik;
                } catch (gid e) {
                    a5.mo33409a("RouterBackendClient.getIntentFilter.authFailure");
                    throw new chuw(chuv.f189223j);
                }
            } else {
                throw new chuw(chuv.f189223j);
            }
        } catch (adev e2) {
            throw new chuw(chuv.f189223j);
        }
    }
}
