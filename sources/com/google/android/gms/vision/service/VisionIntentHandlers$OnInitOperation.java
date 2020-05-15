package com.google.android.gms.vision.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VisionIntentHandlers$OnInitOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        if (chec.f188519a.mo6606a().mo85165a()) {
            avye.m79530a(avzc.m79539a(this));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avzo.a(android.content.Context, java.util.Set, boolean):void
     arg types: [com.google.android.gms.vision.service.VisionIntentHandlers$OnInitOperation, java.util.Set, int]
     candidates:
      avzo.a(android.content.Context, java.lang.String, boolean):void
      avzo.a(android.content.Context, java.util.Set, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        avzo.m79550a((Context) this, avzo.m79551b(getBaseContext()), true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.vision.service.VisionIntentHandlers$OnInitOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        spn.m35856a((Context) this, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy", true);
    }
}
