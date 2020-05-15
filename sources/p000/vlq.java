package p000;

import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: vlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vlq extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f49456a;

    public vlq(vlr vlr) {
        this.f49456a = new WeakReference(vlr);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        vlr vlr = (vlr) this.f49456a.get();
        DriveId driveId = null;
        if (vlr != null) {
            Intent intent = vlr.getActivity().getIntent();
            String stringExtra = intent.getStringExtra("callerPackageName");
            String stringExtra2 = intent.getStringExtra("accountName");
            rjy rjy = new rjy(vlr.getActivity());
            rjo rjo = twn.f46758d;
            twl twl = new twl();
            twl.f46753a.putInt("proxy_type", 2);
            rjy.mo24780a(rjo, twl.mo26841a());
            rjy.f43173b = stringExtra;
            rjy.mo24783a(intent.getStringArrayExtra("clientScopes"));
            rjy.mo24778a(stringExtra2);
            rkb b = rjy.mo24784b();
            if (b.mo24785a(5, TimeUnit.SECONDS).mo17671b()) {
                try {
                    DriveId driveId2 = vlr.f49458b;
                    txd txd = new txd(vlr.f49459c);
                    int i = vlr.f49461e;
                    ury ury = (ury) b.mo24795b(new urz(b, new txd(txd.f46905a), driveId2, vlr.f49460d, i)).mo9455a();
                    Status status = ury.f48581a;
                    vlr.f49457a.mo25369a("createFileFromUi completed with status %s", status);
                    if (status.mo17710c()) {
                        driveId = ury.f48582b;
                    }
                } finally {
                    b.mo24803g();
                }
            }
        }
        return driveId;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        DriveId driveId = (DriveId) obj;
        vlr vlr = (vlr) this.f49456a.get();
        if (vlr == null) {
            return;
        }
        if (driveId == null) {
            Activity activity = vlr.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.finish();
            }
            vlr.mo28620a(3);
            vlr.f49467k = false;
            return;
        }
        Activity activity2 = vlr.getActivity();
        if (activity2 != null) {
            Intent intent = new Intent();
            intent.putExtra("response_drive_id", driveId);
            activity2.setResult(-1, intent);
            activity2.finish();
        }
        vlr.mo28620a(0);
        vlr.f49467k = false;
    }
}
