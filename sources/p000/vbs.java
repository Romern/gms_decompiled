package p000;

import java.util.Date;

/* renamed from: vbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbs extends vbk {

    /* renamed from: a */
    private final uli f48964a;

    /* renamed from: b */
    private final vci f48965b;

    /* renamed from: c */
    private String f48966c;

    public vbs(uli uli, vci vci) {
        super(vci);
        sdo.m34959a(uli);
        this.f48964a = uli;
        sdo.m34959a(vci);
        this.f48965b = vci;
    }

    /* renamed from: a */
    public final void mo28192a(uos uos) {
        Long l;
        sdo.m34970a(uos.mo27778b());
        Date a = this.f48965b.mo28225a();
        uli uli = this.f48964a;
        String str = this.f48966c;
        if (str != null) {
            l = Long.valueOf(a.getTime());
        } else {
            l = null;
        }
        uli.mo27689a(str, l);
        uos.f48426a.mo27414a(this.f48964a);
        super.mo28192a(uos);
    }

    /* renamed from: a */
    public final void mo28193a(uos uos, vkw vkw) {
        super.mo28193a(uos, vkw);
        this.f48966c = vkw.f49422b;
    }
}
