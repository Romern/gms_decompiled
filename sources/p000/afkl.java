package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: afkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afkl extends rjx {
    public afkl(Context context) {
        super(context, afkf.f64306a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo34919a(String str, String str2) {
        return mo24701a((rpa) new afki(new FileGroupRequest(str, str2, null)));
    }

    /* renamed from: b */
    public final void mo34920b(String str, String str2) {
        FileGroupRequest fileGroupRequest = new FileGroupRequest(str, str2, null);
        roz b = rpa.m34196b();
        b.mo24978a(new afkg(fileGroupRequest));
        b.f43473b = new Feature[]{abpq.f57887e};
        mo24701a(b.mo24977a());
    }
}
