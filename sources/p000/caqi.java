package p000;

import java.util.List;

/* renamed from: caqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqi implements caqz {

    /* renamed from: a */
    final /* synthetic */ caqj f175535a;

    public caqi(caqj caqj) {
        this.f175535a = caqj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74755a(caou caou) {
        throw new capk("Authentication is not supported for Magstripe!");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo74758b(List list) {
        caqj caqj = this.f175535a;
        cara cara = caqj.f175538c;
        cara.f175642d.f175564p = 3;
        caqj.f175539d = capy.m126944a(cara.mo74775a(), list);
        caqj caqj2 = this.f175535a;
        return caqj2.mo74761b(caqj2.mo74759a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74756a(List list) {
        if (!list.contains(cash.CONTEXT_NOT_MATCHING)) {
            caqj caqj = this.f175535a;
            cara cara = caqj.f175538c;
            cara.f175642d.f175564p = 5;
            caqj.f175539d = capy.m126945b(cara.mo74775a(), list);
            caqj caqj2 = this.f175535a;
            return caqj2.mo74761b(caqj2.mo74759a());
        }
        caqj caqj3 = this.f175535a;
        if (list.contains(cash.CONTEXT_NOT_MATCHING)) {
            caqj3.f175538c.f175642d.f175564p = 7;
        } else {
            caqj3.f175538c.f175642d.f175564p = 6;
        }
        caqj caqj4 = this.f175535a;
        caqj4.f175539d = capy.m126945b(caqj4.f175538c.mo74775a(), list);
        caqj caqj5 = this.f175535a;
        return caqj5.mo74761b(caqj5.mo74759a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74757a(List list, caou caou) {
        caqj caqj = this.f175535a;
        cara cara = caqj.f175538c;
        cara.f175642d.f175564p = 1;
        caqj.f175539d = capy.m126944a(cara.mo74775a(), list);
        caoz.m126908a();
        capb.m126909a(this.f175535a.f175540e);
        return this.f175535a.mo74760a(caou);
    }
}
