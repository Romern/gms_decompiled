package p000;

/* renamed from: sbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sbb extends C1231nx {

    /* renamed from: a */
    final /* synthetic */ sbc f43980a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sbb(sbc sbc, int i) {
        super(i);
        this.f43980a = sbc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15550a(Object obj, Object obj2, Object obj3) {
        synchronized (this.f43980a.f43981a) {
            if (obj3 == null) {
                try {
                    if (this.f43980a.mo25328b()) {
                        this.f43980a.f43982b.remove(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj3 == null && this.f43980a.mo25329c()) {
                this.f43980a.f43983c.remove(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo15551b(Object obj, Object obj2) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo12888c(Object obj) {
        return null;
    }
}
