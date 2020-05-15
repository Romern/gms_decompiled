package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.migrate.helper.ParcelableBrokerResponse;

/* renamed from: mqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqe extends dcj implements IInterface {
    public mqe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.backup.migrate.helper.ID2dMigrateHelperBrokerCallbacks");
    }

    /* renamed from: a */
    public final void mo20225a(ParcelableBrokerResponse parcelableBrokerResponse, mqc mqc) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelableBrokerResponse);
        dcl.m8164a(bj, mqc);
        mo8530c(1, bj);
    }
}
