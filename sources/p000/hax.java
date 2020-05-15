package p000;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: hax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hax extends C0058bp {

    /* renamed from: a */
    private final Application f19375a;

    /* renamed from: b */
    private final String f19376b;

    /* renamed from: c */
    private final GetSignInIntentRequest f19377c;

    /* renamed from: d */
    private final CharSequence f19378d;

    /* renamed from: e */
    private final Bitmap f19379e;

    public hax(Application application, String str, GetSignInIntentRequest getSignInIntentRequest, CharSequence charSequence, Bitmap bitmap) {
        this.f19375a = application;
        this.f19376b = str;
        this.f19377c = getSignInIntentRequest;
        this.f19378d = charSequence;
        this.f19379e = bitmap;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        boolean z;
        if (cls == hay.class) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "GoogleSignInViewModel.Factory can only be used to for GoogleSignInViewModel.");
        return new hay(this.f19375a, this.f19376b, this.f19377c, this.f19378d, this.f19379e);
    }
}
