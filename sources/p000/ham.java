package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ham */
final /* synthetic */ class ham implements C1247om {

    /* renamed from: a */
    private final hav f19352a;

    /* renamed from: b */
    private final Context f19353b;

    public ham(hav hav, Context context) {
        this.f19352a = hav;
        this.f19353b = context;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        return new hab(this.f19353b, (int) this.f19352a.getResources().getDimension(C0126R.dimen.credentials_google_sign_in_consent_profile_avatar_size));
    }
}
