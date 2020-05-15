package p000;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;
import java.util.List;

/* renamed from: bhaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhaj extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ LocationHistorySettingsChimeraActivity f118195a;

    public bhaj(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.f118195a = locationHistorySettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.f118195a;
        bgxe bgxe = locationHistorySettingsChimeraActivity.f118185c;
        if (bgxe == null) {
            Log.w("GCoreLocationSettings", "Preference service disappeared (updateDevices)");
            return null;
        }
        try {
            return bgxe.mo63307b(locationHistorySettingsChimeraActivity.f118186d);
        } catch (Exception e) {
            Log.wtf("GCoreLocationSettings", "getRemote devices failed", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f118195a.mo70942a((List) obj);
    }
}
