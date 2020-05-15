package p000;

import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import java.util.ArrayList;

/* renamed from: nne */
final /* synthetic */ class nne {

    /* renamed from: a */
    private final noj f36084a;

    public nne(noj noj) {
        this.f36084a = noj;
    }

    /* renamed from: a */
    public final void mo21204a(CarUiInfo carUiInfo) {
        noj noj = this.f36084a;
        ArrayList arrayList = new ArrayList();
        for (nss nss : noj.f36217d) {
            try {
                nss.mo21545a(carUiInfo);
            } catch (RemoteException e) {
                bnsi c = noj.f36155b.mo68388c();
                c.mo68437a(e);
                c.mo68432a("noj", "a", 4327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Exception notifying carUiInfo changed");
                arrayList.add(nss);
            }
        }
        noj.f36217d.removeAll(arrayList);
    }
}
