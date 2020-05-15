package p000;

/* renamed from: blgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgp {

    /* renamed from: a */
    public blgq f126454a = blgq.KIND_NOT_SET;

    /* renamed from: b */
    public Object f126455b = null;

    /* renamed from: a */
    public final blgr mo66504a() {
        blgr blgr = new blgr(this);
        if (this.f126454a == blgq.MAP) {
            this.f126454a = blgq.KIND_NOT_SET;
            this.f126455b = null;
        }
        if (this.f126454a == blgq.LIST) {
            this.f126454a = blgq.KIND_NOT_SET;
            this.f126455b = null;
        }
        if (this.f126454a == blgq.STRING) {
            this.f126454a = blgq.KIND_NOT_SET;
            this.f126455b = null;
        }
        if (this.f126454a == blgq.INDEX_REFERENCE) {
            this.f126454a = blgq.KIND_NOT_SET;
            this.f126455b = null;
        }
        if (this.f126454a == blgq.CUSTOM) {
            this.f126454a = blgq.KIND_NOT_SET;
            this.f126455b = null;
        }
        return blgr;
    }
}
