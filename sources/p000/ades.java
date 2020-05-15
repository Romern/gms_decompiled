package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: ades */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ades implements adex {

    /* renamed from: a */
    final /* synthetic */ camj f61516a;

    /* renamed from: b */
    final /* synthetic */ Account f61517b;

    /* renamed from: c */
    final /* synthetic */ adet f61518c;

    public ades(adet adet, camj camj, Account account) {
        this.f61518c = adet;
        this.f61516a = camj;
        this.f61517b = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo33395a() {
        adff a = this.f61518c.f61522d.mo33416a();
        byte[] k = a.f61547a.mo73642k();
        if (k.length != 0 || !cepl.f183185a.mo6606a().mo79545p()) {
            bxvd da = btis.f149029f.mo74144da();
            bxtx a2 = bxtx.m123261a(k);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((btis) da.f164949b).f149034d = a2;
            long a3 = spn.m35843a(this.f61518c.f61520b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btis) da.f164949b).f149033c = a3;
            adet adet = this.f61518c;
            btio a4 = adet.mo33396a(a, adkx.m50779a(adet.f61520b));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((btis) da.f164949b).f149035e = a4;
            bxvd da2 = btiv.f149041b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((btiv) da2.f164949b).f149043a = true;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btiv btiv = (btiv) da2.mo74062i();
            btiv.getClass();
            ((btis) da.f164949b).f149031a = btiv;
            bxvd da3 = btiu.f149038b.mo74144da();
            camj camj = this.f61516a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((btiu) da3.f164949b).f149040a = camj.mo3214a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btiu btiu = (btiu) da3.mo74062i();
            btiu.getClass();
            ((btis) da.f164949b).f149032b = btiu;
            btis btis = (btis) da.mo74062i();
            new Object[1][0] = btis;
            try {
                String a5 = this.f61518c.f61525g.mo33389a(this.f61517b);
                if (a5 != null) {
                    this.f61518c.f61524f.mo17798a("auth_token", a5);
                    this.f61518c.mo33399c();
                    adet adet2 = this.f61518c;
                    adeu adeu = adet2.f61523e;
                    ClientContext clientContext = adet2.f61524f;
                    if (adeu.f61531d == null) {
                        adeu.f61531d = chtv.m149566a(chtu.UNARY, "google.internal.play.atoms.api.v1.WhApiService/UpdateUserPrefs", ciie.m150370a(btis.f149029f), ciie.m150370a(btit.f149036a));
                    }
                    return (btit) adeu.f61534a.mo25553a(adeu.f61531d, clientContext, btis, (long) adeu.f61529b, TimeUnit.MILLISECONDS);
                }
                throw new chuw(chuv.f189223j);
            } catch (adev | gid e) {
                adet.f61519a.mo33425a(e, "updateUserPrefs failed", new Object[0]);
                throw new chuw(chuv.f189223j);
            }
        } else {
            throw new IllegalArgumentException("Client cookie is empty");
        }
    }
}
