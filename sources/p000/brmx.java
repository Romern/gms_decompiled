package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: brmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmx extends brmj {

    /* renamed from: g */
    private final String f142997g;

    /* renamed from: h */
    private final PhoneAuthCredential f142998h;

    public brmx(String str, String str2, brps brps, String str3, PhoneAuthCredential phoneAuthCredential, brpp brpp) {
        super(str, str2, brps, brpp, "LinkFederatedCredential");
        this.f142997g = str3;
        this.f142998h = phoneAuthCredential;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        brrp a = brky.m114105a(context, this.f142998h, "LinkFederatedCredential");
        if (a == null) {
            this.f142967a.mo69680a(new Status(17499, "Phone Number linking failed"));
            return;
        }
        String str = this.f142997g;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(a);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new brog(brph, a, context, brpj));
    }
}
