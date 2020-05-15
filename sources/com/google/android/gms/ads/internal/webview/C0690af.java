package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.ads.internal.webview.af */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0690af extends MutableContextWrapper {

    /* renamed from: a */
    public Activity f9032a;

    /* renamed from: b */
    public Context f9033b;

    /* renamed from: c */
    private Context f9034c;

    public C0690af(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.f9033b.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Activity activity;
        this.f9034c = context.getApplicationContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f9032a = activity;
        this.f9033b = context;
        super.setBaseContext(this.f9034c);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f9032a;
        if (activity == null) {
            intent.setFlags(268435456);
            this.f9034c.startActivity(intent);
            return;
        }
        activity.startActivity(intent);
    }
}
