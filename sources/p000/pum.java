package p000;

/* renamed from: pum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pum implements dea {

    /* renamed from: a */
    final /* synthetic */ pun f40266a;

    public pum(pun pun) {
        this.f40266a = pun;
    }

    /* renamed from: a */
    public final void mo8555a(int i, int i2, int i3, Object obj) {
        if (i == 1) {
            this.f40266a.f40379n.mo23670a("Mirroring failed due to an error: major=%d, minor=%d", Integer.valueOf(i2), Integer.valueOf(i3));
            this.f40266a.mo23704b(true);
        } else if (i == 2) {
            this.f40266a.mo23698a(i2, i3, obj);
        }
    }
}
