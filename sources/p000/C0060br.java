package p000;

/* renamed from: br */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0060br {

    /* renamed from: a */
    private final C0056bn f5395a;

    /* renamed from: b */
    private final C0061bs f5396b;

    public C0060br(C0061bs bsVar, C0056bn bnVar) {
        this.f5395a = bnVar;
        this.f5396b = bsVar;
    }

    /* renamed from: a */
    public final C0053bl mo3444a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            C0053bl blVar = (C0053bl) this.f5396b.f5523a.get(str);
            if (cls.isInstance(blVar)) {
                C0056bn bnVar = this.f5395a;
                if (bnVar instanceof C0059bq) {
                    C0059bq bqVar = (C0059bq) bnVar;
                    return blVar;
                }
            } else {
                C0056bn bnVar2 = this.f5395a;
                if (bnVar2 instanceof C0057bo) {
                    blVar = ((C0057bo) bnVar2).mo3317a();
                } else {
                    blVar = bnVar2.mo3261a(cls);
                }
                C0053bl blVar2 = (C0053bl) this.f5396b.f5523a.put(str, blVar);
                if (blVar2 != null) {
                    blVar2.mo3218f();
                    return blVar;
                }
            }
            return blVar;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
