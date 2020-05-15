package p000;

/* renamed from: cieo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cieo extends ciem {
    /* renamed from: a */
    public final boolean mo86010a(ciep ciep) {
        synchronized (ciep) {
            if (ciep.f189971a != 0) {
                return false;
            }
            ciep.f189971a = -1;
            return true;
        }
    }

    /* renamed from: b */
    public final void mo86011b(ciep ciep) {
        synchronized (ciep) {
            ciep.f189971a = 0;
        }
    }
}
