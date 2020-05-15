package p000;

/* renamed from: aif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aif extends aib {

    /* renamed from: c */
    final /* synthetic */ aig f589c;

    public aif(aig aig) {
        this.f589c = aig;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo740a() {
        aic aic = (aic) this.f589c.f590a.get();
        if (aic == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + aic.f585a + "]";
    }
}
