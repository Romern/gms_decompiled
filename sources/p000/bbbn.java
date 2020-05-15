package p000;

import android.content.SharedPreferences;

/* renamed from: bbbn */
final /* synthetic */ class bbbn implements bqeh {

    /* renamed from: a */
    private final bbch f102282a;

    public bbbn(bbch bbch) {
        this.f102282a = bbch;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch = this.f102282a;
        bbda bbda = bbch.f102319f;
        SharedPreferences a = bbfh.m87928a(bbda.f102391a, "gms_icing_mdd_shared_file_manager_metadata", bbda.f102400j);
        if (a.contains("migrated_to_new_file_key")) {
            if (a.getBoolean("migrated_to_new_file_key", false)) {
                bbbb.m87771c(bbda.f102391a);
            }
            a.edit().remove("migrated_to_new_file_key").commit();
        }
        return bqdx.m112674a(bqga.m112775a((Object) true), new bbbx(bbch), bbch.f102327n);
    }
}
