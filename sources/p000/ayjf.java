package p000;

import android.os.AsyncTask;
import android.text.format.Formatter;
import android.util.Log;
import android.widget.ListAdapter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import com.google.android.gms.wearable.p090ui.WearableManageSpaceChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ayjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjf extends AsyncTask {

    /* renamed from: a */
    final WeakReference f97755a;

    public ayjf(WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity) {
        this.f97755a = new WeakReference(wearableManageSpaceChimeraActivity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final axoo mo54032a() {
        WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity = (WearableManageSpaceChimeraActivity) this.f97755a.get();
        if (isCancelled()) {
            return null;
        }
        if (wearableManageSpaceChimeraActivity.f111038e == null) {
            try {
                return new ayjg((StorageInfoResponse) aucu.m76783a(axoz.m82853a(wearableManageSpaceChimeraActivity).mo24674F(), 30, TimeUnit.SECONDS), Status.f30107a);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return ayjg.f97756a;
            }
        } else {
            rjo rjo = axoz.f96226a;
            return (axoo) axqq.m82909b(wearableManageSpaceChimeraActivity.f111038e).mo9456a(30, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo54032a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        axoo axoo = (axoo) obj;
        if (!isCancelled()) {
            WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity = (WearableManageSpaceChimeraActivity) this.f97755a.get();
            if (!axoo.mo7183bo().mo17710c()) {
                String valueOf = String.valueOf(axoo.mo7183bo());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Error while retrieving storage info: ");
                sb.append(valueOf);
                Log.w("WearableSpaceActivity", sb.toString());
            } else {
                wearableManageSpaceChimeraActivity.f111037d.setAdapter((ListAdapter) new ayjd(wearableManageSpaceChimeraActivity, axoo));
                wearableManageSpaceChimeraActivity.f111035b.setText(Formatter.formatFileSize(wearableManageSpaceChimeraActivity.getApplicationContext(), axoo.mo53314b().f110967b));
            }
            wearableManageSpaceChimeraActivity.f111036c.setEnabled(true);
            wearableManageSpaceChimeraActivity.f111034a.setVisibility(4);
        }
    }
}
