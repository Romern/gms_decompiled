package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;

/* renamed from: mil */
final /* synthetic */ class mil implements Runnable {

    /* renamed from: a */
    private final mio f33778a;

    /* renamed from: b */
    private final Bundle f33779b;

    /* renamed from: c */
    private final mhx f33780c;

    public mil(mio mio, Bundle bundle, mhx mhx) {
        this.f33778a = mio;
        this.f33779b = bundle;
        this.f33780c = mhx;
    }

    public final void run() {
        mio mio = this.f33778a;
        Bundle bundle = this.f33779b;
        mhx mhx = this.f33780c;
        mio.f33782a.mo25412b("executing #findCompatiblePackages", new Object[0]);
        byte[] byteArray = bundle.getByteArray("p2pdevicetoken");
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable("p2presultreceiver");
        try {
            if (mio.mo20077c()) {
                bnk bnk = mio.f33787f;
                Parcel bj = bnk.mo8529bj();
                bj.writeByteArray(byteArray);
                dcl.m8165a(bj, resultReceiver);
                Parcel a = bnk.mo8526a(2, bj);
                a.recycle();
                if (((Bundle) dcl.m8163a(a, Bundle.CREATOR)).getString(mip.f33791c) != null) {
                    mio.f33782a.mo25418e("Error response from play service", new Object[0]);
                    mhx.mo20038a();
                    return;
                }
                return;
            }
            mio.f33782a.mo25418e("PlayP2pRestoreService got disconnected", new Object[0]);
            mhx.mo20038a();
        } catch (RemoteException e) {
            mio.f33782a.mo25417e("Exception thrown", e, new Object[0]);
            mhx.mo20038a();
        }
    }
}
