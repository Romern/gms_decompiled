package p000;

import android.app.PendingIntent;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: arle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arle implements Callable {

    /* renamed from: a */
    final /* synthetic */ BootstrapProgressResult f87841a;

    /* renamed from: b */
    final /* synthetic */ arjb f87842b;

    public arle(arjb arjb, BootstrapProgressResult bootstrapProgressResult) {
        this.f87842b = arjb;
        this.f87841a = bootstrapProgressResult;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        areb areb = this.f87842b.f87787a;
        BootstrapProgressResult bootstrapProgressResult = this.f87841a;
        areb areb2 = ((arey) areb).f87552a;
        arps.f88090a.logVerbose("TargetBootstrapListener.onProgress()", new Object[0]);
        arpp arpp = (arpp) areb2;
        arps arps = arpp.f88084a;
        arps.f88094e = bootstrapProgressResult.f107855b;
        ArrayList parcelableArrayList = arps.f88094e.getParcelableArrayList("accounts");
        int i = bootstrapProgressResult.f107854a;
        if (i == 1) {
            PendingIntent pendingIntent = (PendingIntent) arpp.f88084a.f88094e.getParcelable("pendingIntent");
            if (pendingIntent != null) {
                arps arps2 = arpp.f88084a;
                arps2.f88100k.mo48890a(arps2, pendingIntent);
            } else {
                arps arps3 = arpp.f88084a;
                arps3.f88097h = true;
                if (parcelableArrayList != null) {
                    arps3.f88098i.mo48631a(10, parcelableArrayList.size());
                }
            }
        } else if (i == 2) {
            arps.f88090a.logVerbose("Wifi setup", new Object[0]);
        } else if (i == 3) {
            arpp.f88084a.f88099j = true;
        } else if (i == 4) {
            arps arps4 = arpp.f88084a;
            boolean z = arps4.f88099j;
            if (!z && parcelableArrayList != null) {
                arps4.f88098i.mo48631a(9, parcelableArrayList.size());
            } else if (z && parcelableArrayList != null) {
                arps4.f88098i.mo48631a(11, parcelableArrayList.size());
            }
        } else if (i == 5) {
            arpp.f88084a.f88098i.mo48630a(7);
        } else if (i != 7) {
            arps.f88090a.logVerbose("Unknown progress event", new Object[0]);
        } else {
            arpp.f88084a.f88098i.mo48630a(12);
        }
        return false;
    }
}
