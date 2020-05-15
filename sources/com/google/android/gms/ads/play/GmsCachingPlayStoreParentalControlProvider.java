package com.google.android.gms.ads.play;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.play.C0530a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsCachingPlayStoreParentalControlProvider extends aacn implements C0530a {

    /* renamed from: d */
    private static GmsCachingPlayStoreParentalControlProvider f9407d = null;

    /* renamed from: a */
    public final Object f9408a = new Object();

    /* renamed from: b */
    public bqgg f9409b;

    /* renamed from: c */
    public boolean f9410c = true;

    /* renamed from: e */
    private final AtomicBoolean f9411e = new AtomicBoolean(false);

    public GmsCachingPlayStoreParentalControlProvider() {
        super("admob");
    }

    /* renamed from: a */
    public static GmsCachingPlayStoreParentalControlProvider m6054a() {
        if (f9407d == null) {
            f9407d = new GmsCachingPlayStoreParentalControlProvider();
        }
        return f9407d;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* renamed from: a */
    public final bqgg mo6707a(Context context) {
        C0648g gVar;
        if (!this.f9411e.getAndSet(true)) {
            context.registerReceiver(this, new IntentFilter("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED"));
        }
        synchronized (this.f9408a) {
            if (!this.f9410c) {
                return this.f9409b;
            }
            C0633h.m5670c("Parental control value is stale. Refreshing.");
            Intent intent = new Intent("com.android.vending.contentfilters.IContentFiltersService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
            if (queryIntentServices != null) {
                if (!queryIntentServices.isEmpty()) {
                    C0648g gVar2 = new C0648g();
                    C0874c cVar = new C0874c(context, gVar2);
                    if (!skh.m35531a().mo25690a(context, intent, cVar, 1)) {
                        C0633h.m5672d("Connection to play store is not available for getting parental controls.");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("success", false);
                        bundle.putBoolean("is_cacheable", false);
                        bundle.putBoolean("is_service_available", true);
                        gVar2.mo6830a(bundle);
                        try {
                            skh.m35531a().mo25689a(context, cVar);
                        } catch (Exception e) {
                            C0633h.m5669b("Error while unbinding from parental controls connection", e);
                            gVar = gVar2;
                        }
                    }
                    gVar = gVar2;
                    gVar.mo741a(new C0872a(this, gVar), C0645d.f8973a);
                    return gVar;
                }
            }
            C0633h.m5672d("Play store is not installed or the service for parental controls is not available.");
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("success", false);
            bundle2.putBoolean("is_cacheable", true);
            bundle2.putBoolean("is_service_available", false);
            gVar = bqga.m112775a(bundle2);
            gVar.mo741a(new C0872a(this, gVar), C0645d.f8973a);
            return gVar;
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        synchronized (this.f9408a) {
            C0633h.m5670c("Change in parental control settings is detected. Marking the value as stale.");
            this.f9410c = true;
        }
    }
}
