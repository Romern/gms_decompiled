package p000;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: brou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brou implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpv f143098a;

    /* renamed from: b */
    final /* synthetic */ GetTokenResponse f143099b;

    /* renamed from: c */
    final /* synthetic */ brov f143100c;

    public brou(brov brov, brpv brpv, GetTokenResponse getTokenResponse) {
        this.f143100c = brov;
        this.f143098a = brpv;
        this.f143099b = getTokenResponse;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        List b = ((GetAccountInfoResponse) obj).mo72410b();
        if (b == null || b.isEmpty()) {
            this.f143098a.mo69750a("No users");
        } else {
            this.f143100c.f143101a.mo69761a(this.f143099b, (GetAccountInfoUser) b.get(0));
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143098a.mo69750a(str);
    }
}
