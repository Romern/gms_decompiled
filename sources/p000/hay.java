package p000;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: hay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hay extends C1261p {

    /* renamed from: d */
    public final String f19380d;

    /* renamed from: e */
    public final GetSignInIntentRequest f19381e;

    /* renamed from: f */
    public final CharSequence f19382f;

    /* renamed from: g */
    public final Bitmap f19383g;

    /* renamed from: h */
    public final adch f19384h = new adch();

    /* renamed from: i */
    public final adch f19385i;

    /* renamed from: j */
    public Bitmap f19386j;

    /* renamed from: k */
    public hba f19387k;

    /* renamed from: l */
    public final C0034at f19388l = new C0034at();

    /* renamed from: m */
    public final C0034at f19389m;

    /* renamed from: n */
    public final C0034at f19390n;

    public hay(Application application, String str, GetSignInIntentRequest getSignInIntentRequest, CharSequence charSequence, Bitmap bitmap) {
        super(application);
        this.f19380d = str;
        this.f19381e = getSignInIntentRequest;
        this.f19382f = charSequence;
        this.f19383g = bitmap;
        C0034at atVar = new C0034at();
        this.f19389m = atVar;
        atVar.mo2450b((Object) false);
        this.f19385i = new adch();
        this.f19390n = new C0034at();
    }

    /* renamed from: a */
    public final void mo12366a(int i) {
        this.f19388l.mo2453l(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo12367a(haw haw) {
        this.f19385i.mo2453l(haw);
    }

    /* renamed from: a */
    public final void mo12368a(haz haz) {
        this.f19390n.mo2453l(haz);
    }

    /* renamed from: a */
    public final void mo12369a(boolean z) {
        this.f19389m.mo2453l(Boolean.valueOf(z));
    }
}
