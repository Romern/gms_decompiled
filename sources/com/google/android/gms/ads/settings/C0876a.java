package com.google.android.gms.ads.settings;

import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.C0275b;
import com.google.android.gms.ads.identifier.internal.C0277d;
import com.google.android.gms.ads.identifier.settings.C0283a;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.settings.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0876a extends AsyncTask {

    /* renamed from: a */
    rfw f9423a;

    /* renamed from: b */
    String f9424b;

    /* renamed from: c */
    final /* synthetic */ AdsSettingsChimeraActivity f9425c;

    public C0876a(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.f9425c = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context applicationContext;
        rex a;
        C0277d dVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            applicationContext = this.f9425c.getApplicationContext();
            sdo.m34973b("Calling this from your main thread can lead to deadlock");
            a = C0283a.m5190a(applicationContext);
            IBinder a2 = a.mo24567a();
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                dVar = !(queryLocalInterface instanceof C0277d) ? new C0275b(a2) : (C0277d) queryLocalInterface;
            } else {
                dVar = null;
            }
            String a3 = dVar.mo6494a(applicationContext.getPackageName());
            skh.m35531a().mo25689a(applicationContext, a);
            this.f9424b = a3;
            return 0;
        } catch (RemoteException e) {
            Log.i("AdvertisingIdSettersClient", "GMS remote exception ", e);
            throw new IOException("Remote exception");
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (IOException e3) {
            Log.e("AdsSettingsActivity", "Could not clear advertising ID.", e3);
            return 2;
        } catch (rfv e4) {
            Log.wtf("AdsSettingsActivity", "Google Play services not available?", e4);
            return 2;
        } catch (rfw e5) {
            Log.w("AdsSettingsActivity", "Google Play services repairable.", e5);
            this.f9423a = e5;
            return 1;
        } catch (Throwable th) {
            skh.m35531a().mo25689a(applicationContext, a);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.f9425c.isFinishing()) {
            return;
        }
        if (num.intValue() == 0) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.f9425c;
            String str = this.f9424b;
            int i = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity.mo7100a(str);
        } else if (num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity2 = this.f9425c;
            rfw rfw = this.f9423a;
            int i2 = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity2.mo7101a(rfw);
        }
    }
}
