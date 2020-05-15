package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: adep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adep implements adex {

    /* renamed from: a */
    final /* synthetic */ byte[] f61503a;

    /* renamed from: b */
    final /* synthetic */ camh f61504b;

    /* renamed from: c */
    final /* synthetic */ Collection f61505c;

    /* renamed from: d */
    final /* synthetic */ Account f61506d;

    /* renamed from: e */
    final /* synthetic */ adet f61507e;

    public adep(adet adet, byte[] bArr, camh camh, Collection collection, Account account) {
        this.f61507e = adet;
        this.f61503a = bArr;
        this.f61504b = camh;
        this.f61505c = collection;
        this.f61506d = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo33395a() {
        this.f61507e.f61522d.mo33417b();
        adff a = this.f61507e.f61522d.mo33416a();
        bxvd da = btic.f148950j.mo74144da();
        adet adet = this.f61507e;
        btio a2 = adet.mo33396a(a, adkx.m50779a(adet.f61520b));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((btic) da.f164949b).f148953b = a2;
        ByteString a3 = ByteString.m123261a(this.f61503a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btic btic = (btic) da.f164949b;
        a3.getClass();
        btic.f148952a = a3;
        btic.f148955d = true;
        boolean a4 = this.f61507e.mo33397a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btic) da.f164949b).f148954c = a4;
        boolean b = this.f61507e.mo33398b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btic btic2 = (btic) da.f164949b;
        btic2.f148956e = b;
        btic2.f148957f = true;
        boolean b2 = ceqj.m137858b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btic btic3 = (btic) da.f164949b;
        btic3.f148959h = b2;
        btic3.f148958g = this.f61504b.mo3214a();
        Collection collection = this.f61505c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btic btic4 = (btic) da.f164949b;
        if (!btic4.f148960i.mo73666a()) {
            btic4.f148960i = GeneratedMessageLite.m124019a(btic4.f148960i);
        }
        bxsy.m123078a(collection, btic4.f148960i);
        btic btic5 = (btic) da.mo74062i();
        try {
            String a5 = this.f61507e.f61525g.mo33389a(this.f61506d);
            if (a5 != null) {
                this.f61507e.f61524f.mo17798a("auth_token", a5);
                this.f61507e.mo33399c();
                adfb a6 = this.f61507e.f61521c.mo33411a();
                try {
                    adet adet2 = this.f61507e;
                    adeu adeu = adet2.f61523e;
                    ClientContext clientContext = adet2.f61524f;
                    if (adeu.f61532e == null) {
                        adeu.f61532e = chtv.m149566a(chtu.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetDomainFilter", ciie.m150370a(btic.f148950j), ciie.m150370a(btih.f148964m));
                    }
                    btih btih = (btih) adeu.f61534a.mo25553a(adeu.f61532e, clientContext, btic5, (long) adeu.f61529b, TimeUnit.MILLISECONDS);
                    a6.mo33409a("RouterBackendClient.getDomainFilter.success");
                    return btih;
                } catch (gid e) {
                    a6.mo33409a("RouterBackendClient.getDomainFilter.authFailure");
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
