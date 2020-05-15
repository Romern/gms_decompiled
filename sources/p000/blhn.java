package p000;

/* renamed from: blhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blhn {

    /* renamed from: a */
    public blho f126546a = blho.KIND_NOT_SET;

    /* renamed from: b */
    public Object f126547b = null;

    /* renamed from: a */
    public final blhp mo66550a() {
        blhp blhp = new blhp(this);
        if (this.f126546a == blho.JSON) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.REFERENCED_ID) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.MAP) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.LIST) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.STRING) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.INDEX_REFERENCE) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        if (this.f126546a == blho.CUSTOM) {
            this.f126546a = blho.KIND_NOT_SET;
            this.f126547b = null;
        }
        return blhp;
    }

    /* renamed from: a */
    public final void mo66551a(blgm blgm) {
        this.f126546a = blho.JSON;
        this.f126547b = blgm;
    }

    /* renamed from: a */
    public final void mo66552a(String str) {
        this.f126546a = blho.REFERENCED_ID;
        this.f126547b = str;
    }
}
