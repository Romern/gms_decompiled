package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: argx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argx {

    /* renamed from: a */
    private static final asco f87707a = ascp.m73787a("D2D", "AccountTransferSingleton");

    /* renamed from: b */
    private static final ArrayList f87708b;

    static {
        ArrayList arrayList = new ArrayList();
        f87708b = arrayList;
        arrayList.add("com.google");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static gtt m72748a(Context context, boolean z, boolean z2) {
        long j;
        iyv iyv;
        rex rex = new rex();
        try {
            skh.m35531a().mo25690a(context, new Intent().setClassName(context, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1);
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                iyv = !(queryLocalInterface instanceof iyv) ? new iyt(a) : (iyv) queryLocalInterface;
            } else {
                iyv = null;
            }
            j = iyv.mo13499c();
            skh.m35531a().mo25689a(context, rex);
        } catch (RemoteException | InterruptedException e) {
            f87707a.mo25417e("Could not get lockscreen duration", e, new Object[0]);
            skh.m35531a().mo25689a(context, rex);
            j = 0;
        } catch (Throwable th) {
            skh.m35531a().mo25689a(context, rex);
            throw th;
        }
        gud gud = new gud();
        gud.mo12233a(z);
        gud.mo12232a(j);
        DeviceAuthInfo a2 = gud.mo12231a();
        gts gts = new gts();
        gts.f19002a.putByteArray("deviceAuth", sef.m35074a(a2));
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(f87708b);
            String b = cgqs.f187523a.mo6606a().mo84316b();
            if (!TextUtils.isEmpty(b)) {
                if (b.contains(",")) {
                    Collections.addAll(arrayList, b.split(","));
                } else {
                    arrayList.add(b);
                }
                f87707a.mo25409a("AccountTypes allowed to challenge %s", arrayList);
            }
            if (!arrayList.isEmpty()) {
                gts.f19002a.putStringArrayList("accountTypes", arrayList);
            }
        }
        if (!gts.f19002a.containsKey("accountTypes")) {
            gts.f19002a.putStringArrayList("accountTypes", new ArrayList(0));
        }
        return new gtt(gts.f19002a);
    }
}
