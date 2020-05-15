package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: aqnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqnv extends rjx implements rkc {
    public aqnv(Context context, aqkp aqkp) {
        super(context, aqkq.f86292d, aqkp, rjw.f43159a);
    }

    /* renamed from: g */
    public final sar mo24747g() {
        sar g = super.mo24747g();
        String string = ((aqkp) this.f43171z).f86288a.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (!TextUtils.isEmpty(string)) {
            g.f43959c = string;
        }
        return g;
    }
}
