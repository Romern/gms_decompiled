package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: aaaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaaf implements Runnable {

    /* renamed from: a */
    public final aaab f27827a;

    /* renamed from: b */
    final /* synthetic */ aaag f27828b;

    /* renamed from: c */
    private final bdij f27829c = bdgs.m90764a().mo58027b();

    public aaaf(aaag aaag, aaab aaab) {
        this.f27828b = aaag;
        this.f27827a = aaab;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (p000.cdoh.m134428b() != false) goto L_0x009f;
     */
    public final void run() {
        bljb a;
        bljb a2;
        blji a3;
        bdgs a4 = bdgs.m90764a();
        bdij bdij = this.f27829c;
        int i = this.f27827a.f27821n;
        StringBuilder sb = new StringBuilder(31);
        sb.append(i);
        sb.append("-AsyncOp-Dispatching");
        a4.mo58025a(bdij, sb.toString());
        Status status = Status.f30107a;
        try {
            bljb a5 = blkh.m107281a("AsyncOpTask");
            try {
                this.f27828b.f27834e.onBeforeDispatching();
                a = blkh.m107281a("GlobalPreProcessing");
                for (adbp adbp : aaag.f27830a) {
                    adbp.mo33307a(this.f27827a);
                }
                if (a != null) {
                    a.close();
                }
                a2 = blkh.m107281a("ServicePreProcessing");
                for (adbp adbp2 : this.f27828b.f27835f) {
                    adbp2.mo33307a(this.f27827a);
                }
                if (a2 != null) {
                    a2.close();
                }
                a3 = aabs.f27896b.mo16701a(blkh.m107281a("AsyncOpImpl"));
                this.f27827a.mo6502a(this.f27828b.f27833d);
                if (a3 != null) {
                    a3.close();
                }
                if (a5 != null) {
                    a5.close();
                }
                throw th;
                throw th;
                aaag.f27832c.execute(bljx.m107269a(new aaae(this, status)));
                return;
                throw th;
            } catch (Throwable th) {
                if (a5 != null) {
                    a5.close();
                }
                throw th;
            }
        } catch (aaaj e) {
            aaab aaab = this.f27827a;
            Status status2 = e.f27843a;
            if (!e.f27844b) {
                int i2 = aaab.f27821n;
                String str = aaab.f27820m;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
                sb2.append("serviceID=");
                sb2.append(i2);
                sb2.append(", operation=");
                sb2.append(str);
                Log.e("AsyncOperation", sb2.toString(), e);
            }
            try {
                Parcel obtain = Parcel.obtain();
                rko.m33876a(status2, obtain, 0);
                obtain.setDataPosition(0);
                aaab.mo6503a((Status) Status.CREATOR.createFromParcel(obtain));
                obtain.recycle();
            } catch (RemoteException e2) {
            }
            if (cdoh.m134428b()) {
                aaab aaab2 = this.f27827a;
                aaau.m21033a(aaab2.f27821n, aaab2.f27820m, status2.f30115i);
            }
            status = status2;
        } catch (RemoteException e3) {
            try {
                status = Status.f30113g;
            } finally {
                if (cdoh.m134428b()) {
                    aaab aaab3 = this.f27827a;
                    aaau.m21033a(aaab3.f27821n, aaab3.f27820m, status.f30115i);
                }
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
