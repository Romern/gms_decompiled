package p000;

/* renamed from: adot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adot implements bmxj {

    /* renamed from: a */
    final /* synthetic */ adsf f62301a;

    public adot(adsf adsf) {
        this.f62301a = adsf;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        Long l = null;
        if (bool == null) {
            return new adov(false, null);
        }
        if (ceqm.m137877h()) {
            adsf adsf = this.f62301a;
            if (adsf != null && adsf.mo33756b().booleanValue()) {
                l = this.f62301a.f62616g;
            }
        } else {
            adsf adsf2 = this.f62301a;
            if (adsf2 != null && adsf2.mo33755a().booleanValue()) {
                l = this.f62301a.f62615f;
            }
        }
        return new adov(bool, l);
    }
}
