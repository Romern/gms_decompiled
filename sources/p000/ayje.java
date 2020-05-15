package p000;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.p090ui.WearableManageSpaceChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ayje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayje extends AsyncTask {

    /* renamed from: a */
    final WeakReference f97754a;

    public ayje(WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity) {
        this.f97754a = new WeakReference(wearableManageSpaceChimeraActivity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Status mo54029a() {
        WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity = (WearableManageSpaceChimeraActivity) this.f97754a.get();
        if (isCancelled()) {
            return null;
        }
        if (wearableManageSpaceChimeraActivity.f111038e == null) {
            try {
                aucu.m76783a(sdl.m34954a(axqq.m82908a(axoz.m82853a(wearableManageSpaceChimeraActivity).f43165D)), 5, TimeUnit.SECONDS);
                return Status.f30107a;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return Status.f30109c;
            }
        } else {
            rjo rjo = axoz.f96226a;
            return (Status) axqq.m82908a(wearableManageSpaceChimeraActivity.f111038e).mo9456a(5, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo54029a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Status status = (Status) obj;
        if (!isCancelled()) {
            WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity = (WearableManageSpaceChimeraActivity) this.f97754a.get();
            if (!status.mo17710c()) {
                String valueOf = String.valueOf(status);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Error while clearing storage: ");
                sb.append(valueOf);
                Log.w("WearableSpaceActivity", sb.toString());
            }
            wearableManageSpaceChimeraActivity.mo60329a();
        }
    }
}
