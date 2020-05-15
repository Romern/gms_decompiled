package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: arts */
final /* synthetic */ class arts implements aubq {

    /* renamed from: a */
    private final aruc f88284a;

    /* renamed from: b */
    private final arwd f88285b;

    public arts(aruc aruc, arwd arwd) {
        this.f88284a = aruc;
        this.f88285b = arwd;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int i;
        aruc aruc = this.f88284a;
        arwd arwd = this.f88285b;
        List list = (List) aucb.mo50386d();
        ArrayList arrayList = new ArrayList(list.size());
        Status status = Status.f30107a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aucb aucb2 = (aucb) it.next();
            if (!aucb2.mo50384b()) {
                aqxl aqxl = aruc.f88309e;
                if (aucb2.mo50387e() instanceof rjp) {
                    i = ((rjp) aucb2.mo50387e()).mo24655a();
                } else {
                    i = 10656;
                }
                aqxl.mo48203a(i);
                if (!cgpa.m146404e()) {
                    status = new Status(10656);
                    break;
                }
                aruc.f88303a.mo25415d("GetUserBootstrapInfo failed.", aucb2.mo50387e(), new Object[0]);
            } else {
                arrayList.add((UserBootstrapInfo) aucb2.mo50386d());
            }
        }
        if (cgpa.m146404e()) {
            if (arrayList.isEmpty()) {
                status = new Status(10656);
            } else {
                status = Status.f30107a;
            }
        }
        try {
            arwd.mo48868a(status, (UserBootstrapInfo[]) arrayList.toArray(new UserBootstrapInfo[0]));
        } catch (RemoteException e) {
            aruc.f88303a.mo25410a((Throwable) e);
        }
    }
}
