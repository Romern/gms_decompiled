package p000;

import java.util.List;

/* renamed from: adog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adog extends cazu {

    /* renamed from: b */
    private final cazn f62262b;

    /* renamed from: c */
    private final cazn f62263c;

    /* renamed from: d */
    private final cazn f62264d;

    private adog(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adog.class), cijl);
        this.f62262b = cbac.m127643a(cazn);
        this.f62263c = cbac.m127643a(cazn2);
        this.f62264d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static adog m50903a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new adog(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Boolean bool = (Boolean) list.get(1);
        Boolean bool2 = (Boolean) list.get(2);
        if (((Boolean) list.get(0)).booleanValue() && bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return bqga.m112775a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62262b.mo75201b(), this.f62263c.mo75201b(), this.f62264d.mo75201b());
    }
}
