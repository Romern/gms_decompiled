package p000;

/* renamed from: adoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adoq extends cazu {

    /* renamed from: b */
    private final cazn f62296b;

    public adoq(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(adoq.class), cijl);
        this.f62296b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f62296b.mo75201b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r7 != null) goto L_0x003a;
     */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        adrm adrm = (adrm) obj;
        long j = -1;
        long j2 = -1L;
        if (ceqm.m137877h()) {
            adrw b = adrm.mo33747b(0L, null);
            if (b != null) {
                try {
                    adsf adsf = (adsf) b.mo33754d();
                    if (adsf != null) {
                        if (adsf.mo33756b().booleanValue()) {
                            j = adsf.f62616g.longValue();
                        }
                        j2 = Long.valueOf(j);
                        b.close();
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        return bqga.m112775a(j2);
        throw th;
    }
}
