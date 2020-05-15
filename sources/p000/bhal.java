package p000;

import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;
import java.util.List;

/* renamed from: bhal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhal extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ RemoteDevice f118197a;

    /* renamed from: b */
    final /* synthetic */ boolean f118198b;

    /* renamed from: c */
    final /* synthetic */ LocationHistorySettingsChimeraActivity f118199c;

    public bhal(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity, RemoteDevice remoteDevice, boolean z) {
        this.f118199c = locationHistorySettingsChimeraActivity;
        this.f118197a = remoteDevice;
        this.f118198b = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            if (this.f118199c.f118185c != null) {
                String a = bgze.m100439a();
                LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.f118199c;
                return locationHistorySettingsChimeraActivity.f118185c.mo63305a(locationHistorySettingsChimeraActivity.f118186d, this.f118197a.f150869a, this.f118198b, a);
            }
            Log.w("GCoreLocationSettings", "Preference service disappeared (onSwitchChanged)");
            return null;
        } catch (RemoteException e) {
            Log.e("GCoreLocationSettings", "Pref service failed for remote device", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f118199c.mo70942a((List) obj);
    }
}
