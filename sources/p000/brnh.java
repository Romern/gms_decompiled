package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: brnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnh extends brmj {

    /* renamed from: g */
    private final PhoneAuthCredential f143013g;

    /* renamed from: h */
    private final String f143014h;

    public brnh(String str, String str2, brps brps, PhoneAuthCredential phoneAuthCredential, String str3, brpp brpp) {
        super(str, str2, brps, brpp, "SignInWithPhoneNumber");
        this.f143013g = phoneAuthCredential;
        this.f143014h = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        brrp a = brky.m114105a(context, this.f143013g, "SignInWithPhoneNumber");
        if (a == null) {
            this.f142967a.mo69680a(new Status(17499, "Phone Number instant validation failed!"));
            return;
        }
        a.f143268i = this.f143014h;
        brpj brpj = this.f142967a;
        sdo.m34959a(a);
        sdo.m34959a(brpj);
        brph.f143125b.mo69778a(context, a, new brod(brph, brpj));
    }
}
