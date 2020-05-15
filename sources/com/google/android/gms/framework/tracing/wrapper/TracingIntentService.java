package com.google.android.gms.framework.tracing.wrapper;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class TracingIntentService extends IntentService {

    /* renamed from: a */
    private aabl f32478a = null;

    public TracingIntentService(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6499a(Intent intent);

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f32478a = new aabl(context, getClass(), 11);
    }

    public final void onHandleIntent(Intent intent) {
        blji blji;
        aabl aabl = this.f32478a;
        if (aabl != null) {
            blji = aabl.mo16695a("onHandleIntent", intent);
        } else {
            blji = null;
        }
        try {
            mo6499a(intent);
            if (blji != null) {
                blji.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
