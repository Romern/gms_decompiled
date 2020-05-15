package p000;

import android.content.SharedPreferences;

/* renamed from: asfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfu extends asft {

    /* renamed from: a */
    public static asfu f88863a = null;

    /* renamed from: a */
    public final void mo49140a(int i, boolean z, boolean z2, bxvd bxvd) {
        if (!cgtd.m146970b()) {
            f88860c.mo24383c("DisabledEastworldProcessorEastworldStatsProcessor").mo24359a();
            f88860c.mo24388e();
        } else if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f88861d.getLong(":eastwroldStatsLastPeriodicUploadWallclockTime", 0) > cgtd.f187715a.mo6606a().mo84476e()) {
                bxvd da = calg.f175118j.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                calg calg = (calg) da.f164949b;
                calg.f175121b = 1;
                calg.f175120a = 1 | calg.f175120a;
                cala cala = (cala) bxvd.mo74062i();
                cala.getClass();
                calg.f175128i = cala;
                calg.f175120a |= 512;
                asft.m74000a(da, "EastworldStatsProcessor", "EASTWORLD_STATS", (int) cgtd.f187715a.mo6606a().mo84477f(), bxvd);
                SharedPreferences.Editor edit = f88861d.edit();
                edit.putLong(":eastwroldStatsLastPeriodicUploadWallclockTime", currentTimeMillis);
                edit.apply();
            }
        }
    }
}
