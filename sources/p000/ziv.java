package p000;

/* renamed from: ziv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ziv extends yuh {

    /* renamed from: a */
    final /* synthetic */ zgh f55165a;

    /* renamed from: b */
    final /* synthetic */ ziw f55166b;

    /* renamed from: c */
    final /* synthetic */ zgh f55167c;

    /* renamed from: d */
    final /* synthetic */ zix f55168d;

    public ziv(zix zix, zgh zgh, ziw ziw, zgh zgh2) {
        this.f55168d = zix;
        this.f55165a = zgh;
        this.f55166b = ziw;
        this.f55167c = zgh2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30783a() {
        bnsl bnsl = (bnsl) zix.f55171a.mo68388c();
        bnsl.mo68432a("ziv", "a", 171, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("could not register with input %s for %s", this.f55167c, this.f55165a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30784b() {
        zgg zgg;
        synchronized (this.f55168d) {
            zix zix = this.f55168d;
            srn srn = zix.f55171a;
            zgg = (zgg) zix.f55173c.put(this.f55165a.f55012b, this.f55166b);
        }
        if (zgg != null) {
            bnsl bnsl = (bnsl) zix.f55171a.mo68388c();
            bnsl.mo68432a("ziv", "b", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("duplicate reg: %s removed existing: %s", this.f55165a, zgg);
        }
    }
}
