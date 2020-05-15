package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.backup.common.play.PlaySetupServiceV2Proxy$2;

/* renamed from: lzn */
final /* synthetic */ class lzn implements bqeh {

    /* renamed from: a */
    private final lzt f33284a;

    /* renamed from: b */
    private final Bundle f33285b;

    public lzn(lzt lzt, Bundle bundle) {
        this.f33284a = lzt;
        this.f33285b = bundle;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Bundle bundle;
        lzt lzt = this.f33284a;
        Bundle bundle2 = this.f33285b;
        bnl bnl = (bnl) obj;
        bqgy c = bqgy.m112818c();
        try {
            lzt.f33292b.mo25412b("Requesting play to pause app updates", new Object[0]);
            PlaySetupServiceV2Proxy$2 playSetupServiceV2Proxy$2 = new PlaySetupServiceV2Proxy$2(lzt, new adzt(Looper.getMainLooper()), c);
            Parcel bj = bnl.mo8529bj();
            dcl.m8165a(bj, playSetupServiceV2Proxy$2);
            dcl.m8165a(bj, bundle2);
            Parcel a = bnl.mo8526a(13, bj);
            Bundle bundle3 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
            a.recycle();
            if (!(bundle3 == null || (bundle = bundle3.getBundle("error")) == null)) {
                String string = bundle.getString("error");
                lvn lvn = lzt.f33292b;
                String valueOf = String.valueOf(string);
                lvn.mo25418e(valueOf.length() == 0 ? new String("Error pausing app updates=") : "Error pausing app updates=".concat(valueOf), new Object[0]);
                c.mo69136a((Throwable) new RemoteException(string));
            }
        } catch (RemoteException e) {
            lzt.f33292b.mo25417e("RemoteException while pausing app updates", e, new Object[0]);
            c.mo69136a((Throwable) e);
        }
        lzt.mo19788a(c);
        return c;
    }
}
