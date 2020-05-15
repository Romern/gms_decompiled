package com.google.android.gms.gcm;

import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackgroundTaskService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if ("PersistConnectionInfos".equals(str)) {
            aakb a = aakb.m21381a();
            sdo.m34970a(aajg.m21343c());
            a.f28348i.mo17065a();
            return 0;
        } else if ("LogPhenotypeExperimentIds".equals(str)) {
            aakb a2 = aakb.m21381a();
            sdo.m34970a(aajg.m21343c());
            a2.f28346g.mo16931a(aaql.f28916c);
            return 0;
        } else {
            String valueOf = String.valueOf(str);
            Log.w("GCM", valueOf.length() == 0 ? new String("Unknown task: ") : "Unknown task: ".concat(valueOf));
            return 0;
        }
    }
}
