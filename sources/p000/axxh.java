package p000;

/* renamed from: axxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxh {

    /* renamed from: a */
    final /* synthetic */ axxi f96645a;

    public axxh(axxi axxi) {
        this.f96645a = axxi;
    }

    /* renamed from: a */
    private final axxf m83469a() {
        return this.f96645a.f96647b;
    }

    /* renamed from: b */
    private final axue m83470b() {
        return this.f96645a.f96646a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axxh axxh = (axxh) obj;
            return m83470b().equals(axxh.m83470b()) && m83469a().f96640b.equals(axxh.m83469a().f96640b) && m83469a().f96639a.equals(axxh.m83469a().f96639a);
        }
    }

    public final int hashCode() {
        return ((((((this.f96645a.f96646a.f96377a.hashCode() + 629) * 37) + this.f96645a.f96646a.f96379c.hashCode()) * 37) + this.f96645a.f96647b.f96639a.hashCode()) * 37) + this.f96645a.f96647b.f96640b.hashCode();
    }
}
