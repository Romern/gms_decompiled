package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: ror */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ror extends aqob implements rjz, rka {

    /* renamed from: h */
    private static final rjl f43454h = aqkq.f86295g;

    /* renamed from: a */
    public final Context f43455a;

    /* renamed from: b */
    public final Handler f43456b;

    /* renamed from: c */
    public final Set f43457c;

    /* renamed from: d */
    public final sat f43458d;

    /* renamed from: e */
    public aqkr f43459e;

    /* renamed from: f */
    public rnl f43460f;

    /* renamed from: g */
    public final rjl f43461g;

    public ror(Context context, Handler handler, sat sat) {
        rjl rjl = f43454h;
        this.f43455a = context;
        this.f43456b = handler;
        sdo.checkIfNull(sat, "ClientSettings must not be null");
        this.f43458d = sat;
        this.f43457c = sat.f43964b;
        this.f43461g = rjl;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f43459e.mo14032j();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f43459e.mo47937a(this);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f43460f.mo24943b(connectionResult);
    }

    /* renamed from: a */
    public final void mo24903a(SignInResponse signInResponse) {
        this.f43456b.post(new roq(this, signInResponse));
    }
}
