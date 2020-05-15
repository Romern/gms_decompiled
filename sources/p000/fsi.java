package p000;

import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;

/* renamed from: fsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsi {
    /* renamed from: a */
    public static cixk m12248a(String str, UsageInfo usageInfo) {
        cixm cixm;
        DocumentContents documentContents;
        DocumentSection a;
        if (usageInfo == null || (documentContents = usageInfo.f9698e) == null || (a = documentContents.mo7167a(".private:action")) == null) {
            cixm = null;
        } else {
            try {
                cixm = (cixm) GeneratedMessageLite.m124016a(cixm.f191686d, a.f9546f, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("SchemaOrgUtils", "Unabled to parse the provided action.");
                cixm = null;
            }
        }
        if (cixm == null) {
            return null;
        }
        bxwc bxwc = cixm.f191690c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            cixk cixk = (cixk) bxwc.get(i);
            int i2 = cixk.f191683a;
            if ((i2 & 1) != 0 && (i2 & 2) != 0 && cixk.f191684b.equals(str)) {
                return cixk;
            }
        }
        return null;
    }
}
