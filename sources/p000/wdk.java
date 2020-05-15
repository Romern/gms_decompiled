package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import java.util.List;

/* renamed from: wdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdk extends cazu {

    /* renamed from: b */
    private final cazn f50548b;

    /* renamed from: c */
    private final cazn f50549c;

    /* renamed from: d */
    private final cazn f50550d;

    /* renamed from: e */
    private final cazn f50551e;

    public wdk(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4) {
        super(cijl2, cbag.m127657a(wdk.class), cijl);
        this.f50548b = cbac.m127643a(cazn);
        this.f50549c = cbac.m127643a(cazn2);
        this.f50550d = cbac.m127643a(cazn3);
        this.f50551e = cbac.m127643a(cazn4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50548b.mo75201b(), this.f50549c.mo75201b(), this.f50550d.mo75201b(), this.f50551e.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return bqga.m112775a(gie.m13188a((Activity) list.get(1), (Account) list.get(0), (String) list.get(2), (Bundle) list.get(3)));
    }
}
