package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdb implements vdl {

    /* renamed from: a */
    private final vdu f49054a;

    /* renamed from: b */
    private final Context f49055b;

    /* renamed from: c */
    private final Map f49056c = new HashMap();

    public vdb(vdu vdu, Context context) {
        sdo.m34959a(vdu);
        this.f49054a = vdu;
        sdo.m34959a(context);
        this.f49055b = context;
    }

    /* renamed from: a */
    public final void mo28310a() {
    }

    /* renamed from: b */
    public final void mo28311b() {
        throw null;
    }

    /* renamed from: a */
    public final void mo28314a(vdk vdk) {
        vdt vdt;
        int i;
        String str = vdk.f49079d;
        synchronized (this.f49056c) {
            if (this.f49056c.containsKey(str)) {
                vdt = (vdt) this.f49056c.get(str);
            } else {
                if (str != null) {
                    i = 15;
                } else {
                    i = 5;
                }
                vdt vdt2 = new vdt(new bebs().mo58540a(this.f49054a.mo28315a(str), vdm.m40184a(i)), this.f49055b);
                vdt2.mo28310a();
                this.f49056c.put(str, vdt2);
                vdt = vdt2;
            }
        }
        vdt.mo28314a(vdk);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ vcy mo28312c() {
        return new vdk(this, this.f49055b);
    }
}
