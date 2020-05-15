package p000;

import java.util.List;

/* renamed from: yky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yky {

    /* renamed from: a */
    public boolean f53999a;

    /* renamed from: b */
    public boolean f54000b;

    /* renamed from: c */
    public boolean f54001c;

    /* renamed from: d */
    public boolean f54002d;

    /* renamed from: e */
    public boolean f54003e;

    /* renamed from: f */
    public List f54004f = ykz.f54007a;

    /* renamed from: g */
    public List f54005g = bngx.m109376e();

    /* renamed from: h */
    public List f54006h = bngx.m109376e();

    /* renamed from: a */
    public final ykz mo30593a() {
        return new ykz(this);
    }

    /* renamed from: b */
    public final void mo30595b() {
        this.f54003e = true;
    }

    /* renamed from: b */
    public final void mo30596b(List list) {
        bmxy.m108582a(list, "Cannot set stream name order to null");
        this.f54005g = list;
    }

    /* renamed from: a */
    public final void mo30594a(List list) {
        bmxy.m108582a(list, "Device type order cannot be null");
        this.f54004f = list;
    }
}
