package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: antu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antu extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ aoac f77724a;

    public antu() {
        super("com.google.android.gms.plus.internal.IPlusOneDelegate");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public antu(aoac aoac) {
        super("com.google.android.gms.plus.internal.IPlusOneDelegate");
        this.f77724a = aoac;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        PendingIntent pendingIntent = null;
        if (i == 1) {
            aoac aoac = this.f77724a;
            Uri uri = aoac.f77977i;
            ConnectionResult connectionResult = aoac.f77999t;
            if (connectionResult != null) {
                pendingIntent = connectionResult.f30066d;
            }
            parcel2.writeNoException();
            dcl.m8169b(parcel2, pendingIntent);
        } else if (i == 2) {
            aoac aoac2 = this.f77724a;
            aoac2.f77943a = false;
            aoac2.mo42495a(aoac2.f77998s);
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            aoac aoac3 = this.f77724a;
            aoac3.f78003x = false;
            Uri uri2 = aoac.f77977i;
            aoac3.f77999t = null;
            if (aoac3.mo42508f() || this.f77724a.f77995p.mo24649q()) {
                this.f77724a.f77995p.mo14032j();
            }
            this.f77724a.f77995p.mo42332x();
            parcel2.writeNoException();
        }
        return true;
    }
}
