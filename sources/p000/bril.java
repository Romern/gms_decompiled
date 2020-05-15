package p000;

import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: bril */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bril {

    /* renamed from: a */
    public final MutateRequest f142871a;

    /* renamed from: b */
    public final aucf f142872b = new aucf();

    /* renamed from: c */
    final /* synthetic */ brim f142873c;

    public bril(brim brim, MutateRequest mutateRequest) {
        this.f142873c = brim;
        this.f142871a = mutateRequest;
    }

    /* renamed from: a */
    public final void mo69564a() {
        boolean z;
        synchronized (this.f142873c.f142875b) {
            if (this.f142873c.f142876c == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f142873c.f142876c = 1;
        }
        this.f142873c.f142874a.mo24732b(new brik(this)).mo50379a(this.f142873c, new brii(this));
    }
}
