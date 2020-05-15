package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0424c implements C0426e {
    /* renamed from: a */
    public final void mo6625a(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        C0633h.m5670c(valueOf.length() == 0 ? new String("Received log message: ") : "Received log message: ".concat(valueOf));
    }
}
