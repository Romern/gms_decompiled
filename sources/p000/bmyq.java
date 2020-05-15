package p000;

/* renamed from: bmyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyq extends bmwa {

    /* renamed from: g */
    final /* synthetic */ bmwz f131208g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bmyq(bmyx bmyx, CharSequence charSequence, bmwz bmwz) {
        super(bmyx, charSequence);
        this.f131208g = bmwz;
    }

    /* renamed from: a */
    public final int mo66819a(int i) {
        if (this.f131208g.f131160a.find(i)) {
            return this.f131208g.f131160a.start();
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo66820b(int i) {
        return this.f131208g.f131160a.end();
    }
}
