package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0647f;

/* renamed from: com.google.android.gms.ads.internal.util.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0639d {
    /* renamed from: a */
    public static void m5679a(Context context) {
        boolean z;
        if (C0632g.m5654a(context)) {
            synchronized (C0632g.f8963a) {
                z = C0632g.f8964b;
            }
            if (!z) {
                bqgg b = new C0625c(context).mo6801b();
                C0633h.m5670c("Updating ad debug logging enablement.");
                C0647f.m5688a(b, "AdDebugLogUpdater.updateEnablement");
            }
        }
    }
}
