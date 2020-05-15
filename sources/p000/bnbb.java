package p000;

import java.io.Serializable;

/* renamed from: bnbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnbb implements Serializable, bmzu {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final bncb f131333a;

    public bnbb(bncb bncb) {
        this.f131333a = bncb;
    }

    /* renamed from: a */
    public final void mo66946a(Object obj, Object obj2) {
        this.f131333a.put(obj, obj2);
    }

    /* renamed from: b */
    public final Object mo66947b(Object obj) {
        bncb bncb = this.f131333a;
        bmxy.m108581a(obj);
        int a = bncb.mo67088a(obj);
        return bncb.mo67089a(a).mo67042a(obj, a);
    }

    /* renamed from: c */
    public final void mo66948c(Object obj) {
        bmxy.m108581a(obj);
        this.f131333a.remove(obj);
    }

    /* renamed from: f */
    public final long mo66949f() {
        return this.f131333a.mo67107j();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnbc(this.f131333a);
    }
}
