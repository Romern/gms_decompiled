package p000;

import android.content.SharedPreferences;

/* renamed from: bbbi */
final /* synthetic */ class bbbi implements bqeh {

    /* renamed from: a */
    private final bbch f102277a;

    public bbbi(bbch bbch) {
        this.f102277a = bbch;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch = this.f102277a;
        Void voidR = (Void) obj;
        SharedPreferences a = bbfh.m87928a(bbch.f102315b, "gms_icing_mdd_manager_metadata", bbch.f102326m);
        if (!a.contains("gms_icing_mdd_reset_trigger")) {
            a.edit().putInt("gms_icing_mdd_reset_trigger", (int) ceni.m137525i()).commit();
        }
        int i = a.getInt("gms_icing_mdd_reset_trigger", 0);
        int i2 = (int) ceni.m137525i();
        if (i >= i2) {
            return bqga.m112775a((Object) null);
        }
        a.edit().putInt("gms_icing_mdd_reset_trigger", i2).commit();
        bbch.f102316c.mo34988b(1045);
        return bbch.mo56070f();
    }
}
