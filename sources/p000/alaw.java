package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ConfigurationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: alaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alaw extends dck implements IInterface {

    /* renamed from: a */
    private final Context f73235a;

    public alaw() {
        super("com.google.android.gms.panorama.internal.IPanoramaService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        alav alav;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            alav = queryLocalInterface instanceof alav ? (alav) queryLocalInterface : new alav(readStrongBinder);
        } else {
            alav = null;
        }
        Uri uri = (Uri) dcl.m8163a(parcel, Uri.CREATOR);
        Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        boolean a = dcl.m8167a(parcel);
        sdo.m34959a(alav);
        sdo.m34959a(uri);
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) this.f73235a.getSystemService("activity")).getDeviceConfigurationInfo();
        if (deviceConfigurationInfo.reqGlEsVersion != 0) {
            int i2 = 2;
            if ((deviceConfigurationInfo.reqGlEsVersion >> 16) >= 2) {
                albz a2 = albz.m60832a(new alao(this.f73235a.getContentResolver(), uri));
                if (a2 == null || a2.f73384k) {
                    alav.mo40057a(0, (Intent) null);
                    return true;
                }
                Intent className = new Intent().setClassName(this.f73235a, "com.google.android.gms.panorama.PanoramaViewActivity");
                if (bundle != null) {
                    className.putExtras(bundle);
                }
                className.setData(uri);
                if (a) {
                    className.addFlags(1);
                }
                if (a2.f73377d != a2.f73375b) {
                    i2 = 1;
                } else if (a2.f73378e == a2.f73376c) {
                    i2 = 3;
                }
                alav.mo40057a(i2, className);
                return true;
            }
        }
        alav.mo40057a(0, (Intent) null);
        return true;
    }

    public alaw(Context context) {
        super("com.google.android.gms.panorama.internal.IPanoramaService");
        this.f73235a = context;
    }
}
