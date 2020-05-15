package com.google.android.gms.ads.settings;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.C0275b;
import com.google.android.gms.ads.identifier.internal.C0277d;
import com.google.android.gms.ads.identifier.settings.C0283a;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.settings.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0878c extends AsyncTask {

    /* renamed from: a */
    rfw f9429a;

    /* renamed from: b */
    private final AdsSettingsChimeraActivity f9430b;

    /* renamed from: c */
    private boolean f9431c;

    /* renamed from: d */
    private String f9432d;

    public C0878c(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.f9430b = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        Context applicationContext;
        rex a;
        C0277d dVar;
        Boolean[] boolArr = (Boolean[]) objArr;
        if (boolArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        boolean booleanValue = boolArr[0].booleanValue();
        this.f9431c = booleanValue;
        AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.f9430b;
        int i = AdsSettingsChimeraActivity.f9418f;
        adsSettingsChimeraActivity.f9422e.edit().putBoolean("ad_settings_cache_enable_debug_logging", booleanValue).apply();
        try {
            applicationContext = this.f9430b.getApplicationContext();
            boolean z2 = this.f9431c;
            sdo.m34973b("Calling this from your main thread can lead to deadlock");
            a = C0283a.m5190a(applicationContext);
            IBinder a2 = a.mo24567a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                dVar = !(queryLocalInterface instanceof C0277d) ? new C0275b(a2) : (C0277d) queryLocalInterface;
            } else {
                dVar = null;
            }
            String b = dVar.mo6496b(applicationContext.getPackageName(), z2);
            skh.m35531a().mo25689a(applicationContext, a);
            this.f9432d = b;
            this.f9430b.sendBroadcast(new Intent("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED"));
            return 0;
        } catch (RemoteException e) {
            Log.i("AdvertisingIdSettersClient", "GMS remote exception ", e);
            throw new IOException("Remote exception");
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (IOException e3) {
            Log.e("AdsSettingsActivity", "Could not set debug logging enablement.", e3);
            return 2;
        } catch (rfv e4) {
            Log.wtf("AdsSettingsActivity", "Google Play services not available?", e4);
            return 2;
        } catch (rfw e5) {
            Log.w("AdsSettingsActivity", "Google Play services repairable.", e5);
            this.f9429a = e5;
            return 1;
        } catch (Throwable th) {
            skh.m35531a().mo25689a(applicationContext, a);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.f9430b.isFinishing()) {
            return;
        }
        if (num.intValue() == 0) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.f9430b;
            String str = this.f9432d;
            int i = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity.mo7100a(str);
        } else if (num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity2 = this.f9430b;
            rfw rfw = this.f9429a;
            int i2 = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity2.mo7101a(rfw);
        }
    }
}
