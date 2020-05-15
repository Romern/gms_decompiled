package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpe extends aaab {

    /* renamed from: a */
    public final aqpg f86471a;

    /* renamed from: b */
    public final aqoc f86472b;

    /* renamed from: c */
    private final SignInRequest f86473c;

    /* renamed from: d */
    private final aqpc f86474d;

    public aqpe(aqpg aqpg, aqoc aqoc, SignInRequest signInRequest, aqpc aqpc) {
        super(44, "SignIn");
        this.f86471a = aqpg;
        this.f86472b = aqoc;
        this.f86473c = signInRequest;
        this.f86474d = aqpc;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        new aqoy(this.f86471a, this.f86473c.f107709b, new scs(this, context), this.f86474d).mo6502a(context);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f86472b.mo24903a(new SignInResponse());
    }
}
