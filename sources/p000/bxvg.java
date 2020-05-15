package p000;

/* renamed from: bxvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxvg extends bxvk implements bxvh {

    /* renamed from: m */
    public bxux f164952m = bxux.f164881c;

    /* renamed from: a */
    public final void mo74135a(bxvj bxvj) {
        if (bxvj.f164955a != ((bxvk) mo74142c(6))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* renamed from: a */
    public final boolean mo74131a(bxuq bxuq) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final bxux mo74136c() {
        bxux bxux = this.f164952m;
        if (bxux.f164883b) {
            this.f164952m = bxux.clone();
        }
        return this.f164952m;
    }
}
