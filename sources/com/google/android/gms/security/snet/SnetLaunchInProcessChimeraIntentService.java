package com.google.android.gms.security.snet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetLaunchInProcessChimeraIntentService extends IntentOperation {

    /* renamed from: a */
    private String f107586a;

    /* renamed from: b */
    private String f107587b;

    /* renamed from: c */
    private aqdu f107588c;

    /* renamed from: d */
    private ArrayList f107589d;

    /* renamed from: e */
    private String f107590e;

    /* renamed from: f */
    private byte[] f107591f;

    /* renamed from: g */
    private Bundle f107592g;

    /* renamed from: h */
    private ArrayList f107593h;

    static {
        SnetLaunchInProcessChimeraIntentService.class.getSimpleName();
    }

    /* renamed from: a */
    public static ComponentName m92435a(Context context, int i, String str, String str2, String str3, apyq apyq, Bundle bundle) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetLaunchInProcessChimeraIntentService.class, str3);
        if (startIntent == null) {
            return null;
        }
        startIntent.putExtra("snet.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.intent.extra.UUID", str);
        startIntent.putExtra("snet.intent.extra.SHARED_UUID", str2);
        startIntent.putStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES", null);
        startIntent.putExtra("snet.intent.extra.CACHED_LOGS", apyq.mo73642k());
        startIntent.putExtra("snet.intent.extra.SNET_FLAGS", bundle);
        startIntent.putParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES", apyv.m71200a(context).mo47709a());
        return context.startService(startIntent);
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            this.f107590e = action;
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                this.f107588c = new aqdu(this, intent.getIntExtra("snet.intent.extra.GMS_CORE_VERSION", -1));
                this.f107586a = intent.getStringExtra("snet.intent.extra.UUID");
                this.f107587b = intent.getStringExtra("snet.intent.extra.SHARED_UUID");
                this.f107589d = intent.getStringArrayListExtra("snet.intent.extra.SNET_API_PACKAGES");
                this.f107591f = intent.getByteArrayExtra("snet.intent.extra.CACHED_LOGS");
                this.f107592g = intent.getBundleExtra("snet.intent.extra.SNET_FLAGS");
                if (!TextUtils.isEmpty(this.f107586a)) {
                    this.f107588c.f85799m = this.f107586a;
                }
                if (!TextUtils.isEmpty(this.f107587b)) {
                    this.f107588c.f85800n = this.f107587b;
                }
                if (!TextUtils.isEmpty(cgkt.m145932d())) {
                    this.f107588c.f85801o = cgkt.m145932d();
                }
                this.f107593h = intent.getParcelableArrayListExtra("snet.intent.extra.DEX_INFO_BUNDLES");
                try {
                    Bundle a = apui.m71030a(this);
                    if (!TextUtils.isEmpty(this.f107586a)) {
                        a.putString("snet_uuid", this.f107586a);
                    }
                    if (!TextUtils.isEmpty(this.f107587b)) {
                        a.putString("snet_shared_uuid", this.f107587b);
                    }
                    a.putBoolean("snet_is_sidewinder_device", sre.m36080a(this));
                    a.putStringArrayList("snet_verify_apps_api_usage", this.f107589d);
                    a.putByteArray("snet_cached_logs", this.f107591f);
                    a.putBundle("snet.intent.extra.SNET_FLAGS", this.f107592g);
                    a.putParcelableArrayList("snet.intent.extra.DEX_INFO_BUNDLES", this.f107593h);
                    if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(this.f107590e) && cgkt.m145941m()) {
                        if (cgkt.m145935g()) {
                            aqfs.m71511b(this, a);
                        }
                    }
                    try {
                        SnetWatchdogChimeraIntentService.m92441a(this, this.f107590e);
                    } catch (RuntimeException e) {
                    }
                } catch (RuntimeException e2) {
                    aqdu.m71410a(e2);
                    try {
                        this.f107588c.mo47765a(3);
                    } catch (RuntimeException e3) {
                    }
                    try {
                        SnetWatchdogChimeraIntentService.m92441a(this, this.f107590e);
                    } catch (RuntimeException e4) {
                    }
                } catch (Throwable th) {
                    try {
                        SnetWatchdogChimeraIntentService.m92441a(this, this.f107590e);
                    } catch (RuntimeException e5) {
                    }
                    throw th;
                }
            }
        }
    }
}
