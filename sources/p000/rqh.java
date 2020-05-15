package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.people.data.Audience;

/* renamed from: rqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqh extends dcj implements rqj {
    public rqh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceView");
    }

    public final vzr getView() {
        vzr vzr;
        Parcel a = mo8526a(8, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(readStrongBinder);
        } else {
            vzr = null;
        }
        a.recycle();
        return vzr;
    }

    public final void initialize(vzr vzr, vzr vzr2, rqm rqm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, vzr);
        dcl.m8164a(bj, vzr2);
        dcl.m8164a(bj, rqm);
        mo8528b(2, bj);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8528b(7, bj);
    }

    public final Bundle onSaveInstanceState() {
        Parcel a = mo8526a(6, mo8529bj());
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void setAudience(Audience audience) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, audience);
        mo8528b(5, bj);
    }

    public final void setEditMode(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(3, bj);
    }

    public final void setIsUnderageAccount(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(9, bj);
    }

    public final void setShowEmptyText(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(4, bj);
    }
}
