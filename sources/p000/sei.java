package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* renamed from: sei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sei extends dck implements IInterface {

    /* renamed from: a */
    private final Context f44088a;

    /* renamed from: b */
    private final String f44089b;

    public sei() {
        super("com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        seh seh;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            seh = queryLocalInterface instanceof seh ? (seh) queryLocalInterface : new seh(readStrongBinder);
        } else {
            seh = null;
        }
        Log.i("CommonService", "clearDefaultAccount");
        soz.m35799c(this.f44088a, this.f44089b);
        Parcel bj = seh.mo8529bj();
        bj.writeInt(0);
        seh.mo8528b(1, bj);
        return true;
    }

    public sei(Context context, String str) {
        super("com.google.android.gms.common.internal.service.ICommonService");
        sdo.m34959a(context);
        this.f44088a = context;
        sdo.m34959a((Object) str);
        this.f44089b = str;
    }
}
