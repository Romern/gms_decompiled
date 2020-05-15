package p000;

/* renamed from: bkuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkuo implements bktf {

    /* renamed from: a */
    private final bkun f125299a = new bkun();

    /* renamed from: b */
    private final bkul f125300b = new bkul();

    /* renamed from: a */
    public final void mo66346a(bkxh bkxh, blhp blhp) {
        blho blho = blho.KIND_NOT_SET;
        int ordinal = blhp.f126558b.ordinal();
        if (ordinal == 1) {
            this.f125299a.mo66346a(bkxh, blhp);
        } else if (ordinal == 2) {
            this.f125300b.mo66346a(bkxh, blhp);
        } else {
            throw new IllegalArgumentException(blhp.toString());
        }
    }
}
