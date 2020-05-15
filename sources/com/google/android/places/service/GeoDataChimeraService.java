package com.google.android.places.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeoDataChimeraService extends zzx {

    /* renamed from: a */
    public sbc f151361a;

    /* renamed from: b */
    public bhql f151362b;

    /* renamed from: k */
    private final bqgj f151363k;

    /* renamed from: l */
    private bhqa f151364l;

    /* renamed from: m */
    private bidx f151365m;

    /* renamed from: n */
    private BroadcastReceiver f151366n;

    public GeoDataChimeraService() {
        super(65, "com.google.android.gms.location.places.GeoDataApi", Collections.singleton("android.permission-group.LOCATION"), 3, 10);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        bqgj a = snp.m35702a(10);
        this.f151363k = a;
        if (a instanceof soc) {
            ((soc) a).setRejectedExecutionHandler(discardPolicy);
        }
    }

    /* renamed from: a */
    public final void mo71303a() {
        this.f151364l.mo64153a(System.currentTimeMillis());
        this.f151361a.mo25326a();
        SharedPreferences.Editor edit = super.getSharedPreferences("GEO_DATA_SERVICE_STORE", 0).edit();
        edit.putString("LOCALE", Locale.getDefault().toString());
        edit.commit();
    }

    /* renamed from: b */
    public final bhqa mo71304b() {
        this.f151364l.mo64155b(System.currentTimeMillis());
        return this.f151364l;
    }

    public final void onCreate() {
        this.f151361a = new sbc(1000, 1, 1, TimeUnit.HOURS);
        if (!cggp.f186889a.mo6606a().mo83755g()) {
            this.f151364l = new bhqd();
        } else if (cggp.f186889a.mo6606a().mo83751c()) {
            this.f151364l = new bhqb(this, "geo");
        } else {
            this.f151364l = new bhqc();
        }
        String string = super.getSharedPreferences("GEO_DATA_SERVICE_STORE", 0).getString("LOCALE", null);
        if (string == null || !Locale.getDefault().toString().equals(string)) {
            mo71303a();
        }
        C16831 r0 = new aacn("places") {
            /* class com.google.android.places.service.GeoDataChimeraService.C16831 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                    GeoDataChimeraService.this.mo71303a();
                }
            }
        };
        this.f151366n = r0;
        super.registerReceiver(r0, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.f151365m = new bidx(1);
        this.f151362b = new bhql(rpr.m34216b().getRequestQueue(), super.getFilesDir());
    }

    public final void onDestroy() {
        super.unregisterReceiver(this.f151366n);
        this.f151364l.mo64152a();
        this.f151363k.shutdown();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new bidj(this, new aaag(this, this.f56354e, this.f56355f), this, getServiceRequest.f30230d, this.f151365m, this.f151363k));
    }
}
