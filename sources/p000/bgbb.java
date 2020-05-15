package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: bgbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgbb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f115964a;

    /* renamed from: b */
    final /* synthetic */ LocationSettingsRequest f115965b;

    /* renamed from: c */
    final /* synthetic */ aeke f115966c;

    /* renamed from: d */
    final /* synthetic */ bgbc f115967d;

    public bgbb(bgbc bgbc, String str, LocationSettingsRequest locationSettingsRequest, aeke aeke) {
        this.f115967d = bgbc;
        this.f115964a = str;
        this.f115965b = locationSettingsRequest;
        this.f115966c = aeke;
    }

    public final void run() {
        PendingIntent pendingIntent;
        String str;
        bgba bgba = new bgba(this.f115967d.f115968a, new bgav(this.f115967d.f115968a), this.f115964a);
        bgba.mo62590a(this.f115965b.mo43567a());
        bgba.f115958a = this.f115965b.f79363b;
        bgaz a = bgba.mo62589a();
        int a2 = a.mo62587a();
        if (a2 == 6) {
            aerj aerj = new aerj();
            aerj.f63669a = this.f115965b;
            aerj.f63670b = this.f115964a;
            Intent a3 = aerj.mo34488a();
            bgbc bgbc = this.f115967d;
            pendingIntent = PendingIntent.getActivity(bgbc.f115968a, bgbc.f115969b.getAndIncrement(), a3, 134217728);
        } else {
            pendingIntent = null;
        }
        switch (a2) {
            case 8500:
            case 8501:
            case 8503:
            case 8505:
                str = "INTERNAL_LOCATION_SETTINGS_STATUS_CODE";
                break;
            case 8502:
                str = "SETTINGS_CHANGE_UNAVAILABLE";
                break;
            case 8504:
            default:
                str = rjs.m33677c(a2);
                break;
        }
        try {
            this.f115966c.mo34245a(new LocationSettingsResult(new Status(a2, str, pendingIntent), a.f115953b));
        } catch (RemoteException e) {
        }
    }
}
