package p000;

import com.google.android.gms.autofill.data.Credential;
import java.util.function.Function;

/* renamed from: lph */
final /* synthetic */ class lph implements Function {

    /* renamed from: a */
    private final lpk f26536a;

    public lph(lpk lpk) {
        this.f26536a = lpk;
    }

    public final Object apply(Object obj) {
        lpk lpk = this.f26536a;
        Credential credential = (Credential) ((kct) obj).mo14368a();
        kcz kcz = lpk.f26542f.mo14764a(lpk.f26554k.f11643c).f24746b;
        if (kcz == null) {
            kcz = kda.m17662a();
        }
        lqg f = lql.m19524f();
        f.mo15376b(credential.f11608a);
        f.mo15374a(bmzh.m108674a("•", credential.f11609b.f23889a.length()));
        f.mo15375a(new lqi(kcz));
        f.mo15373a(new lpi(lpk, credential));
        return f.mo15372a();
    }
}
