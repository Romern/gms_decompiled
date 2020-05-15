package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjk extends aqjp {

    /* renamed from: a */
    public final aqkf f86214a;

    /* renamed from: b */
    public final boolean f86215b;

    public aqjk(Context context, aqkf aqkf, boolean z) {
        super(context, true);
        this.f86214a = aqkf;
        this.f86215b = z;
    }

    /* renamed from: c */
    public final aqje mo47923c() {
        if (this.f86214a == aqkf.AUTOMOTIVE) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return aqkg.m71752a(this.f86226g, C0126R.array.setupservices_google_services_location_sharing_details_v28, this.f86214a);
    }

    /* renamed from: a */
    public final aqje mo47921a() {
        int i = Build.VERSION.SDK_INT;
        return aqkg.m71752a(this.f86226g, C0126R.array.setupservices_google_services_location_sharing_title_v28, this.f86214a);
    }

    /* renamed from: b */
    public final aqje mo47922b() {
        int i = Build.VERSION.SDK_INT;
        return aqkg.m71752a(this.f86226g, C0126R.array.setupservices_google_services_location_sharing_v28, this.f86214a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        int i = Build.VERSION.SDK_INT;
        aeri.m52431a(this.f86226g, z, aerk.ALLOWED);
        sre.m36087g(this.f86226g);
        aeri.m52432a(this.f86226g, z, aerk.ALLOWED, 7, ((bsrz) mo47921a().f86195b.get(0)).f146819b, ((bsrz) mo47922b().f86195b.get(0)).f146819b, ((bsrz) mo47923c().f86195b.get(0)).f146819b);
    }
}
