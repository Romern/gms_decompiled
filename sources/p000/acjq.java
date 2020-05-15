package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: acjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acjq extends cazu {

    /* renamed from: b */
    private final acjm f60007b;

    /* renamed from: c */
    private final cazn f60008c;

    /* renamed from: d */
    private final cazn f60009d;

    /* renamed from: e */
    private final cazn f60010e;

    /* renamed from: f */
    private final cazn f60011f;

    public acjq(acjm acjm, cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(acjq.class), cijl);
        this.f60007b = acjm;
        this.f60008c = cbac.m127643a(cazn);
        this.f60009d = cbac.m127643a(cazn2);
        this.f60010e = cbac.m127643a(cazn3);
        this.f60011f = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f60008c.mo75201b(), this.f60009d.mo75201b(), this.f60010e.mo75201b(), this.f60011f.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        acjm acjm = this.f60007b;
        Context context = (Context) list.get(0);
        acjj acjj = (acjj) list.get(1);
        acco acco = (acco) list.get(2);
        acjl acjl = (acjl) list.get(3);
        if (acco != acco.PASS) {
            acjj.mo32664a(new Status(10, String.format("App %s not authorized to perform %s on %s", acjm.f59996a, acjj.mo32665b(), acjj.mo32663a().toString())));
        } else if (acjl != acjl.PASS) {
            int ordinal = acjl.ordinal();
            if (ordinal == 1) {
                acjj.mo32664a(new Status(10, String.format("%s is not a valid account on this device.", acjj.mo32666c())));
            } else if (ordinal == 2) {
                acjj.mo32664a(new Status(10, String.format("%s is not of required account type %s.", acjj.mo32666c(), "com.google")));
            } else if (ordinal != 3) {
                acjj.mo32664a(new Status(8, String.format("%s is an unknown account check result.", Integer.valueOf(acjl.ordinal()))));
            } else {
                acjj.mo32664a(new Status(8, "Operation should not have an account."));
            }
        } else {
            acjj.mo32668e();
        }
        return bqga.m112775a((Object) null);
    }
}
