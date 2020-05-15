package p000;

import android.content.Context;
import android.os.Parcel;

/* renamed from: qfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfn extends dck implements qfo {

    /* renamed from: a */
    private final Context f41121a;

    public qfn() {
        super("com.google.android.gms.checkin.internal.ICheckinService");
    }

    /* renamed from: a */
    public final String mo24013a() {
        return qdg.m31926g(this.f41121a);
    }

    /* renamed from: c */
    public final long mo24014c() {
        return qdg.m31929j(this.f41121a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String a = mo24013a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i == 2) {
            long c = mo24014c();
            parcel2.writeNoException();
            parcel2.writeLong(c);
        } else if (i != 3) {
            return false;
        } else {
            String i2 = qdg.m31928i(this.f41121a);
            parcel2.writeNoException();
            parcel2.writeString(i2);
        }
        return true;
    }

    public qfn(Context context) {
        super("com.google.android.gms.checkin.internal.ICheckinService");
        this.f41121a = context;
    }
}
