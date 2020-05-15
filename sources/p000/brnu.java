package p000;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: brnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brnu implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpu f143035a;

    /* renamed from: b */
    final /* synthetic */ brpj f143036b;

    /* renamed from: c */
    final /* synthetic */ GetTokenResponse f143037c;

    /* renamed from: d */
    final /* synthetic */ brra f143038d;

    /* renamed from: e */
    final /* synthetic */ brph f143039e;

    public brnu(brph brph, brpu brpu, brpj brpj, GetTokenResponse getTokenResponse, brra brra) {
        this.f143039e = brph;
        this.f143035a = brpu;
        this.f143036b = brpj;
        this.f143037c = getTokenResponse;
        this.f143038d = brra;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        List b = ((GetAccountInfoResponse) obj).mo72410b();
        if (b == null || b.isEmpty()) {
            this.f143035a.mo69750a("No users");
        } else {
            this.f143039e.mo69752a(this.f143036b, this.f143037c, (GetAccountInfoUser) b.get(0), this.f143038d, this.f143035a);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143035a.mo69750a(str);
    }
}
