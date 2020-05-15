package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;

/* renamed from: brmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmu extends brmj {

    /* renamed from: g */
    private final String f142990g;

    /* renamed from: h */
    private final String f142991h;

    public brmu(String str, String str2, brps brps, String str3, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "GetProviderForEmail");
        this.f142990g = str3;
        this.f142991h = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142990g;
        String str2 = this.f142991h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        brpz brpz = new brpz(str, str2);
        brph.f143125b.mo69774a(brpz, new CreateAuthUriResponse(), cdxz.m135248c(), "createAuthUri").mo50371a(new brll(new brnx(brpj)));
    }
}
