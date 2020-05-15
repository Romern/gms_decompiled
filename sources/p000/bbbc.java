package p000;

import android.content.SharedPreferences;

/* renamed from: bbbc */
final /* synthetic */ class bbbc implements bqeh {

    /* renamed from: a */
    private final bbch f102266a;

    /* renamed from: b */
    private final SharedPreferences f102267b;

    public bbbc(bbch bbch, SharedPreferences sharedPreferences) {
        this.f102266a = bbch;
        this.f102267b = sharedPreferences;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch = this.f102266a;
        SharedPreferences sharedPreferences = this.f102267b;
        if (!sharedPreferences.getBoolean("mdd_migrated_to_offroad", false)) {
            return bqdx.m112673a(bbch.mo56069e(), new bbbz(sharedPreferences), bbch.f102327n);
        }
        return bqga.m112775a((Object) null);
    }
}
