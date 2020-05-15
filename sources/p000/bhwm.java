package p000;

/* renamed from: bhwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwm {

    /* renamed from: a */
    private final bhwk f119739a;

    /* renamed from: b */
    private final bhwi f119740b = new bhwi(new bhwf());

    public bhwm(C1245ok okVar) {
        this.f119739a = new bhwk(okVar);
    }

    /* renamed from: a */
    public final bhtz mo64357a(bhtx bhtx) {
        bhwi bhwi = this.f119740b;
        C1245ok a = bhwi.f119732a.mo64353a(bhtx);
        bhwg bhwg = bhwi.f119733b;
        bhwg.f119731a.removeFirst();
        bhwg.f119731a.offerLast(a);
        C1245ok okVar = (C1245ok) this.f119740b.f119733b.f119731a.getLast();
        boolean z = !okVar.containsKey(bhuf.f119634p);
        bhwk bhwk = this.f119739a;
        float f = 0.0f;
        if (!bhwk.f119736a.isEmpty()) {
            for (int i = 0; i < okVar.f26809h; i++) {
                if (bhwk.f119736a.containsKey(okVar.mo15620b(i))) {
                    f += ((Float) okVar.mo15621c(i)).floatValue() * ((Float) bhwk.f119736a.get(okVar.mo15620b(i))).floatValue();
                }
            }
            f = (float) (1.0d / (Math.exp((double) (-f)) + 1.0d));
        }
        bhuj.m101555a();
        String valueOf = String.valueOf(okVar);
        String valueOf2 = String.valueOf(bhtx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("OnTheGoProbability: ");
        sb.append(f);
        sb.append(" with OnTheGoFeatures ");
        sb.append(valueOf);
        sb.append("using signals: ");
        sb.append(valueOf2);
        sb.toString();
        return new bhtz(f, z);
    }
}
