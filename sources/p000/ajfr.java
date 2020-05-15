package p000;

/* renamed from: ajfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfr extends buqn {

    /* renamed from: a */
    final /* synthetic */ String[] f70534a;

    /* renamed from: b */
    final /* synthetic */ ajfs f70535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfr(ajfs ajfs, String str, String[] strArr) {
        super(str);
        this.f70535b = ajfs;
        this.f70534a = strArr;
    }

    public final void run() {
        for (String str : this.f70534a) {
            bngx a = this.f70535b.f70536a.mo44371a(str);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                ajgf ajgf = (ajgf) a.get(i);
                ajgf.f70563b.mo72987c(new ajgd(ajgf, "onSystemPermissionsChanged"));
            }
        }
    }
}
