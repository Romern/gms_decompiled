package p000;

import android.os.Bundle;

/* renamed from: antb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antb {

    /* renamed from: a */
    public final Bundle f77710a;

    public antb(Bundle bundle) {
        this.f77710a = bundle;
    }

    /* renamed from: a */
    public final String mo42214a() {
        return this.f77710a.getString("display_name");
    }

    /* renamed from: b */
    public final String mo42215b() {
        return this.f77710a.getString("profile_image_url");
    }

    public antb(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        this.f77710a = bundle;
        bundle.putString("display_name", str);
        this.f77710a.putString("profile_image_url", str2);
        this.f77710a.putBoolean("is_signed_up", z);
    }
}
