package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: adzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adzy implements LocationListener {

    /* renamed from: a */
    private final adzu f62973a;

    public adzy(String str, String str2) {
        adzu adzu = null;
        if (adzw.f62970c != null && ((Boolean) cdpb.f181500w.mo58455c()).booleanValue()) {
            adzu = adzw.f62971d.mo16697a(getClass(), 23, str, str2);
        }
        this.f62973a = adzu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9927a(Location location);

    public final void onLocationChanged(Location location) {
        blji blji;
        adzu adzu = this.f62973a;
        if (adzu != null) {
            blji = adzu.mo16696b("onLocationChanged");
        } else {
            blji = null;
        }
        try {
            mo9927a(location);
            if (blji != null) {
                blji.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onProviderDisabled(String str) {
        blji blji;
        adzu adzu = this.f62973a;
        if (adzu != null) {
            blji = adzu.mo16696b("onProviderDisabled");
        } else {
            blji = null;
        }
        if (blji != null) {
            blji.close();
        }
    }

    public final void onProviderEnabled(String str) {
        blji blji;
        adzu adzu = this.f62973a;
        if (adzu != null) {
            blji = adzu.mo16696b("onProviderEnabled");
        } else {
            blji = null;
        }
        if (blji != null) {
            blji.close();
        }
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        blji blji;
        adzu adzu = this.f62973a;
        if (adzu != null) {
            blji = adzu.mo16696b("onStatusChanged");
        } else {
            blji = null;
        }
        if (blji != null) {
            blji.close();
        }
    }
}
