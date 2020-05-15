package com.google.android.gms.auth.managed.p029ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.chimera.Loader;

/* renamed from: com.google.android.gms.auth.managed.ui.ManagingAppInstallBroadcastReceiver */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManagingAppInstallBroadcastReceiver extends aacn {

    /* renamed from: a */
    static final IntentFilter f11071a = new IntentFilter("com.google.android.gms.auth.DM_PACKAGE_INSTALLED");

    /* renamed from: b */
    static final IntentFilter f11072b;

    /* renamed from: c */
    private final Context f11073c;

    /* renamed from: d */
    private final jgv f11074d;

    /* renamed from: e */
    private final camd f11075e;

    /* renamed from: f */
    private boolean f11076f;

    /* renamed from: g */
    private boolean f11077g;

    /* renamed from: h */
    private boolean f11078h;

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        f11072b = intentFilter;
        intentFilter.addDataScheme("package");
    }

    public ManagingAppInstallBroadcastReceiver(Context context, jgv jgv, camd camd) {
        super("auth_managed");
        sdo.m34959a(context);
        this.f11073c = context;
        sdo.m34959a(jgv);
        this.f11074d = jgv;
        sdo.m34959a(camd);
        this.f11075e = camd;
    }

    /* renamed from: a */
    public final synchronized void mo7766a() {
        if (!this.f11078h) {
            this.f11073c.registerReceiver(this, f11071a);
            this.f11073c.registerReceiver(this, f11072b);
            this.f11078h = true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo7767b() {
        if (this.f11078h) {
            this.f11073c.unregisterReceiver(this);
            this.f11078h = false;
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.auth.DM_PACKAGE_INSTALLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
            if (intExtra == 0) {
                this.f11076f = true;
            } else if (intExtra == -1) {
                jgv jgv = this.f11074d;
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (intent2 == null) {
                    jgw.f22448a.mo25418e("User action intent missing!", new Object[0]);
                    ((jgw) jgv).deliverResult((Integer) -1);
                } else if (((Loader) jgv).isStarted()) {
                    ((jgw) jgv).mo13720a(intent2);
                } else {
                    ((jgw) jgv).f22449b = intent2;
                }
            } else if (intExtra != 3) {
                jgv jgv2 = this.f11074d;
                jgw.f22448a.mo25418e("Managing app installation failed.", new Object[0]);
                ((jgw) jgv2).deliverResult((Integer) -1);
            } else {
                ((jgw) this.f11074d).deliverResult((Integer) -2);
            }
        } else if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (this.f11075e.f175248b.equals(data != null ? data.getSchemeSpecificPart() : null)) {
                this.f11077g = true;
            }
        } else {
            return;
        }
        if (this.f11077g && this.f11076f) {
            mo7767b();
            jgv jgv3 = this.f11074d;
            jgw.f22448a.mo25414c("onInstallCompleted", new Object[0]);
            ((jgw) jgv3).deliverResult((Integer) 101);
        }
    }
}
