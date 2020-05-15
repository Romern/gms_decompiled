package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: fjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjv extends fix {

    /* renamed from: a */
    public int f16756a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        fjv fjv = (fjv) fix;
        TextUtils.isEmpty(null);
        int i = this.f16756a;
        if (i != 0) {
            fjv.f16756a = i;
        }
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty(null)) {
            TextUtils.isEmpty(null);
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", null);
        hashMap.put("interstitial", false);
        hashMap.put("automatic", false);
        hashMap.put("screenId", Integer.valueOf(this.f16756a));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", null);
        hashMap.put("referrerUri", null);
        return fix.m11795a(hashMap);
    }

    public fjv() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        sdo.m34961a(leastSignificantBits);
        this.f16756a = leastSignificantBits;
    }
}
