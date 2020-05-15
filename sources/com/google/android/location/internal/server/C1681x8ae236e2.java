package com.google.android.location.internal.server;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.location.internal.server.CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1681x8ae236e2 extends aacn {

    /* renamed from: a */
    private final bugr f150797a;

    public C1681x8ae236e2(bugr bugr) {
        super("location");
        this.f150797a = bugr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean l = ceze.m138467l();
        StringBuilder sb = new StringBuilder(29);
        sb.append("onReceive, configured : ");
        sb.append(l);
        sb.toString();
        if (l) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.CACHE_RESULT_PROTO");
            int length = byteArrayExtra.length;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Sending, to hub, NLP cache response, length ");
            sb2.append(length);
            sb2.toString();
            bugu a = this.f150797a.mo72641a(33, 0, byteArrayExtra);
            if (a != null) {
                a.mo72638a(new bgbm());
            }
        }
    }
}
