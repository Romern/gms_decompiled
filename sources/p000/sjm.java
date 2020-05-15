package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Random;

/* renamed from: sjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sjm implements Runnable {

    /* renamed from: a */
    public final sji f44576a;

    /* renamed from: b */
    final /* synthetic */ sjn f44577b;

    /* renamed from: c */
    private final bdij f44578c = bdgs.m90764a().mo58027b();

    public sjm(sjn sjn, sji sji) {
        this.f44577b = sjn;
        this.f44576a = sji;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f0, code lost:
        p000.sjn.f44581c.execute(p000.bljx.m107269a(new p000.sjl(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        if (p000.cdoh.m134428b() != false) goto L_0x018b;
     */
    public final void run() {
        bljb a;
        bljb a2;
        blji a3;
        bdgs a4 = bdgs.m90764a();
        bdij bdij = this.f44578c;
        int i = this.f44576a.f44572c;
        StringBuilder sb = new StringBuilder(31);
        sb.append(i);
        sb.append("-AsyncOp-Dispatching");
        a4.mo58025a(bdij, sb.toString());
        Status status = Status.f30107a;
        try {
            bljb a5 = blkh.m107281a("AsyncOpTask");
            try {
                sjt sjt = this.f44577b.f44583e;
                synchronized (sjt.f44591b) {
                    int i2 = sjt.f44590a;
                    sjt.f44590a = i2 + 1;
                    if (i2 == 0) {
                        if (sjt.f44592c == null) {
                            sdo.m34959a(sjt.f44593d.getContainerService());
                            sjt.f44592c = spn.m35893h(sjt.f44593d.getContainerService().getClass().getName());
                        }
                        Intent intent = sjt.f44592c;
                        try {
                            sjt.f44593d.startService(intent);
                        } catch (IllegalStateException e) {
                            int i3 = Build.VERSION.SDK_INT;
                            if ((bmxx.m108577a(intent.getPackage()) || intent.getPackage().equals("com.google.android.gms")) && cdje.m133542b() && ((double) new Random().nextFloat()) < cdje.m133543c()) {
                                Log.e("LifecycleSync", "Google Play services is unable to start a service. Exiting.", e);
                                spn.m35884e();
                            }
                            throw e;
                        }
                    }
                }
                a = blkh.m107281a("GlobalPreProcessing");
                for (sjw sjw : sjn.f44579a) {
                    if (!sjw.mo25657b()) {
                        this.f44577b.f44583e.mo25652a();
                        if (a != null) {
                            a.close();
                        }
                        if (a5 != null) {
                            a5.close();
                        }
                        if (!cdoh.m134428b()) {
                            return;
                        }
                        sji sji = this.f44576a;
                        aaau.m21033a(sji.f44572c, sji.f44571b, status.f30115i);
                        return;
                    }
                }
                if (a != null) {
                    a.close();
                }
                a2 = blkh.m107281a("ServicePreProcessing");
                for (sjw sjw2 : this.f44577b.f44584f) {
                    if (!sjw2.mo25657b()) {
                        this.f44577b.f44583e.mo25652a();
                        if (a2 != null) {
                            a2.close();
                        }
                        if (a5 != null) {
                            a5.close();
                        }
                        if (!cdoh.m134428b()) {
                            return;
                        }
                        sji sji2 = this.f44576a;
                        aaau.m21033a(sji2.f44572c, sji2.f44571b, status.f30115i);
                        return;
                    }
                }
                if (a2 != null) {
                    a2.close();
                }
                a3 = aabs.f27896b.mo16701a(blkh.m107281a("AsyncOpImpl"));
                this.f44576a.mo11356a(this.f44577b.f44582d);
                if (a3 != null) {
                    a3.close();
                }
                if (a5 != null) {
                    a5.close();
                }
                throw th;
                throw th;
                throw th;
            } catch (Throwable th) {
                if (a5 != null) {
                    a5.close();
                }
                throw th;
            }
        } catch (sju e2) {
            sji sji3 = this.f44576a;
            Status status2 = e2.f44595a;
            int i4 = sji3.f44572c;
            String str = sji3.f44571b;
            StringBuilder sb2 = new StringBuilder(str.length() + 33);
            sb2.append("serviceID=");
            sb2.append(i4);
            sb2.append(", operation=");
            sb2.append(str);
            Log.e("AsyncOperation", sb2.toString(), e2);
            try {
                Parcel obtain = Parcel.obtain();
                rko.m33876a(status2, obtain, 0);
                obtain.setDataPosition(0);
                sji3.mo11357a((Status) Status.CREATOR.createFromParcel(obtain));
                obtain.recycle();
            } catch (RemoteException e3) {
            }
            if (cdoh.m134428b()) {
                sji sji4 = this.f44576a;
                aaau.m21033a(sji4.f44572c, sji4.f44571b, status2.f30115i);
            }
        } catch (RemoteException e4) {
            try {
                status = Status.f30113g;
            } finally {
                if (cdoh.m134428b()) {
                    sji sji5 = this.f44576a;
                    aaau.m21033a(sji5.f44572c, sji5.f44571b, status.f30115i);
                }
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
