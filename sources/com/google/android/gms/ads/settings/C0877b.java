package com.google.android.gms.ads.settings;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.C0272d;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.settings.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0877b extends AsyncTask {

    /* renamed from: a */
    rfw f9426a;

    /* renamed from: b */
    C0271c f9427b;

    /* renamed from: c */
    final /* synthetic */ AdsSettingsChimeraActivity f9428c;

    public C0877b(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.f9428c = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            this.f9427b = C0272d.m5150a(this.f9428c.getApplicationContext());
            return 0;
        } catch (IOException e) {
            Log.e("AdsSettingsActivity", "Could not get advertising ID info.", e);
            return 2;
        } catch (rfv e2) {
            Log.wtf("AdsSettingsActivity", "Google Play services not available?", e2);
            return 2;
        } catch (rfw e3) {
            Log.w("AdsSettingsActivity", "Google Play services repairable.", e3);
            this.f9426a = e3;
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C0271c cVar;
        Integer num = (Integer) obj;
        if (this.f9428c.isFinishing()) {
            return;
        }
        if (num.intValue() == 0 && (cVar = this.f9427b) != null) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.f9428c;
            String str = cVar.f7985a;
            int i = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity.mo7100a(str);
            this.f9428c.f9420c.setChecked(this.f9427b.f7986b);
            this.f9428c.mo7103a(this.f9427b.f7986b);
        } else if (num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity2 = this.f9428c;
            rfw rfw = this.f9426a;
            int i2 = AdsSettingsChimeraActivity.f9418f;
            adsSettingsChimeraActivity2.mo7101a(rfw);
        }
    }
}
