package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: lzo */
final /* synthetic */ class lzo implements bqeh {

    /* renamed from: a */
    private final lzt f33286a;

    /* renamed from: b */
    private final Bundle f33287b;

    public lzo(lzt lzt, Bundle bundle) {
        this.f33286a = lzt;
        this.f33287b = bundle;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Bundle bundle;
        lzt lzt = this.f33286a;
        Bundle bundle2 = this.f33287b;
        bnl bnl = (bnl) obj;
        bqgy c = bqgy.m112818c();
        try {
            lzt.f33292b.mo25412b("Requesting play to resume app updates", new Object[0]);
            Parcel bj = bnl.mo8529bj();
            dcl.m8165a(bj, bundle2);
            Parcel a = bnl.mo8526a(14, bj);
            Bundle bundle3 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
            a.recycle();
            if (bundle3 == null || (bundle = bundle3.getBundle("error")) == null) {
                c.mo69138b((Object) null);
            } else {
                String string = bundle.getString("error");
                lzt.f33292b.mo25418e("Error resuming app updates: %s", string);
                c.mo69136a((Throwable) new RemoteException(string));
            }
        } catch (RemoteException e) {
            lzt.f33292b.mo25417e("RemoteException when resuming app updates", e, new Object[0]);
            c.mo69136a((Throwable) e);
        }
        lzt.mo19788a(c);
        return c;
    }
}
