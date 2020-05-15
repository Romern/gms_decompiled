package com.google.android.location.network;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import com.android.location.provider.LocationProviderBase;
import com.android.location.provider.ProviderPropertiesUnbundled;
import com.android.location.provider.ProviderRequestUnbundled;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkLocationProvider extends LocationProviderBase {

    /* renamed from: k */
    private static final ProviderPropertiesUnbundled f150823k = ProviderPropertiesUnbundled.create(false, false, false, false, true, true, true, 1, 2);

    /* renamed from: a */
    public final Context f150824a;

    /* renamed from: b */
    public final Handler f150825b;

    /* renamed from: c */
    public final aeri f150826c;

    /* renamed from: d */
    public final bhca f150827d;

    /* renamed from: e */
    public final bhbx f150828e = new bhbx();

    /* renamed from: f */
    public final aerh f150829f;

    /* renamed from: g */
    public final aerc f150830g;

    /* renamed from: h */
    public boolean f150831h = false;

    /* renamed from: i */
    public ProviderRequestUnbundled f150832i = null;

    /* renamed from: j */
    public WorkSource f150833j = null;

    /* renamed from: l */
    private long f150834l = Long.MAX_VALUE;

    public NetworkLocationProvider(Context context) {
        super("NLP", f150823k);
        this.f150824a = context;
        this.f150825b = new adzt(Looper.getMainLooper());
        this.f150826c = aeri.m52441e(context);
        this.f150827d = new bhca(context, new bgfe(this), this.f150825b.getLooper());
        this.f150829f = new bgff(this);
        this.f150830g = new bgfg(this);
    }

    /* renamed from: a */
    public final void mo70879a() {
        mo70880a(aeri.m52434a(this.f150824a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo70881b(boolean z) {
        long j;
        bxbi bxbi;
        boolean z2 = true;
        bmxy.m108600b(Looper.myLooper() == this.f150825b.getLooper());
        ProviderRequestUnbundled providerRequestUnbundled = this.f150832i;
        if (providerRequestUnbundled != null) {
            long interval = providerRequestUnbundled.getInterval();
            boolean z3 = interval > this.f150834l;
            this.f150834l = interval;
            if (interval < 20000) {
                interval = 20000;
            }
            if (this.f150831h) {
                long c = cesq.m138193c();
                if (interval < c) {
                    j = c;
                    if (!z || !this.f150828e.mo63541a(j, z3)) {
                        z2 = false;
                    }
                    Context context = this.f150824a;
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, "com.google.android.location.network.NetworkLocationService"));
                    PendingIntent service = PendingIntent.getService(context, 0, intent, 134217728);
                    bxbi = new bxbi(this.f150824a.getPackageName());
                    bxbi.mo73558c(z2);
                    bxbi.mo73550a(j, j, service, "NetworkLocationProvider");
                    bxbi.mo73552a(this.f150833j);
                    int i = Build.VERSION.SDK_INT;
                    bxbi.mo73556b(this.f150832i.isLocationSettingsIgnored());
                    if (bxbi.mo73549a(this.f150824a) != null) {
                        service.cancel();
                        return;
                    }
                    return;
                }
            }
            j = interval;
            z2 = false;
            Context context2 = this.f150824a;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(context2, "com.google.android.location.network.NetworkLocationService"));
            PendingIntent service2 = PendingIntent.getService(context2, 0, intent2, 134217728);
            bxbi = new bxbi(this.f150824a.getPackageName());
            bxbi.mo73558c(z2);
            bxbi.mo73550a(j, j, service2, "NetworkLocationProvider");
            bxbi.mo73552a(this.f150833j);
            int i2 = Build.VERSION.SDK_INT;
            try {
                bxbi.mo73556b(this.f150832i.isLocationSettingsIgnored());
            } catch (NoSuchMethodError e) {
            }
            if (bxbi.mo73549a(this.f150824a) != null) {
            }
        }
    }

    public final void onDisable() {
    }

    public final void onEnable() {
        int i = Build.VERSION.SDK_INT;
    }

    public final int onGetStatus(Bundle bundle) {
        return 2;
    }

    public final long onGetStatusUpdateTime() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onInit() {
        this.f150825b.post(new bgfh(this));
    }

    public final void onSetRequest(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        this.f150825b.post(new bgfi(this, providerRequestUnbundled, workSource));
    }

    /* renamed from: a */
    public final void mo70880a(boolean z) {
        bmxy.m108600b(Looper.myLooper() == this.f150825b.getLooper());
        setEnabled(z);
    }

    public final void setEnabled(boolean z) {
        int i = Build.VERSION.SDK_INT;
        try {
            NetworkLocationProvider.super.setEnabled(z);
        } catch (NoSuchMethodError e) {
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                return;
            }
            sdo.m34959a(aerk.ALLOWED);
            int i3 = Build.VERSION.SDK_INT;
            throw new UnsupportedOperationException("providers may not be controlled from Q and above");
        }
    }
}
