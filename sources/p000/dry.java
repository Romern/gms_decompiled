package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: dry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dry extends drx {

    /* renamed from: c */
    private final doh f13914c;

    public dry(doh doh) {
        super("DeleteAccountOperation");
        this.f13914c = doh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        dwq.m9681y().mo9336c(this.f13914c);
        eel p = dwq.m9672p();
        ContextManagerClientInfo a = dwq.m9652a(this.f13914c, "DeleteAccountOperation");
        eez eez = p.f14778a;
        doh a2 = a.mo18066a();
        eez.mo10061a(a2);
        dwq.m9671o().mo10034b(a2);
        eew q = dwq.m9673q();
        tjr tjr = new tjr(this.f13914c);
        tkb tkb = new tkb();
        tkb.mo26624b();
        TimeFilterImpl a3 = tkb.mo26620a();
        for (int i : tjp.f46203a) {
            tjr.mo26596a(i, a3);
        }
        q.mo10056b(tjr.mo26595a());
        dtl E = dwq.m9648E();
        doh doh = this.f13914c;
        if (doh != null) {
            E.mo9565e();
            dto dto = E.f13991b;
            sdo.m34959a(doh);
            ArrayList arrayList = new ArrayList();
            for (dri dri : dto.f14001d.keySet()) {
                if (doh.equals(dri.mo9484a())) {
                    arrayList.add(dri);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                E.mo9556a((dri) arrayList.get(i2));
            }
        }
        dwq.m9674r().mo9722a(this.f13914c, (drb) null);
    }
}
