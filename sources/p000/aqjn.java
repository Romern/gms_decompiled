package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: aqjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjn extends aqjp {

    /* renamed from: a */
    public final aqkf f86221a;

    /* renamed from: b */
    public final boolean f86222b;

    public aqjn(Context context, aqkf aqkf, boolean z) {
        super(context, true);
        this.f86221a = aqkf;
        this.f86222b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        Settings.Secure.putInt(this.f86226g.getContentResolver(), "package_verifier_user_consent", z ? 1 : 0);
        Settings.Secure.putInt(this.f86226g.getContentResolver(), "package_verifier_enable", 1);
    }
}
