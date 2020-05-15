package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import java.util.ArrayList;
import java.util.List;

/* renamed from: artu */
final /* synthetic */ class artu implements aubq {

    /* renamed from: a */
    private final aruc f88287a;

    /* renamed from: b */
    private final arwd f88288b;

    public artu(aruc aruc, arwd arwd) {
        this.f88287a = aruc;
        this.f88288b = arwd;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        aruc aruc = this.f88287a;
        arwd arwd = this.f88288b;
        Status status = Status.f30107a;
        ArrayList arrayList = new ArrayList();
        for (aucb aucb2 : (List) aucb.mo50386d()) {
            if (aucb2.mo50384b()) {
                arrayList.add((Assertion) aucb2.mo50386d());
            }
        }
        if (arrayList.size() == 0) {
            aruc.f88303a.mo25418e("No assertion infos returned!", new Object[0]);
            status = new Status(10650);
            aruc.f88309e.mo48203a(status.f30115i);
        }
        try {
            arwd.mo48862a(status, (Assertion[]) arrayList.toArray(new Assertion[0]));
        } catch (RemoteException e) {
            aruc.f88303a.mo25410a((Throwable) e);
        }
    }
}
