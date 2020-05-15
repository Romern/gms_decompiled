package p000;

import android.content.SharedPreferences;

/* renamed from: bbci */
final /* synthetic */ class bbci implements bqeh {

    /* renamed from: a */
    private final bbda f102328a;

    /* renamed from: b */
    private final bavt f102329b;

    public bbci(bbda bbda, bavt bavt) {
        this.f102328a = bbda;
        this.f102329b = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbda bbda = this.f102328a;
        bavt bavt = this.f102329b;
        if (((bavu) obj) != null) {
            return bqga.m112775a((Object) true);
        }
        SharedPreferences a = bbfh.m87928a(bbda.f102391a, "gms_icing_mdd_shared_file_manager_metadata", bbda.f102400j);
        long j = a.getLong("next_file_name_v2", System.currentTimeMillis());
        if (!a.edit().putLong("next_file_name_v2", 1 + j).commit()) {
            bbev.m87906a("%s: Unable to update file name %s", "SharedFileManager", bavt);
            return bqga.m112775a((Object) false);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("datadownloadfile_");
        sb.append(j);
        String sb2 = sb.toString();
        bxvd da = bavu.f101935d.mo74144da();
        bavq bavq = bavq.SUBSCRIBED;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavu bavu = (bavu) da.f164949b;
        bavu.f101939c = bavq.f101915g;
        int i = bavu.f101937a | 2;
        bavu.f101937a = i;
        sb2.getClass();
        bavu.f101937a = 1 | i;
        bavu.f101938b = sb2;
        return bqdx.m112674a(bbda.f102393c.mo56080a(bavt, (bavu) da.mo74062i()), new bbcq(bavt), bbda.f102401k);
    }
}
