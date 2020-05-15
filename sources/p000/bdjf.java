package p000;

/* renamed from: bdjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjf {

    /* renamed from: a */
    public final bdkc f105732a;

    /* renamed from: b */
    public final ayte f105733b;

    /* renamed from: c */
    public final cijl f105734c;

    /* renamed from: d */
    public final bdjh f105735d;

    public bdjf(cijl cijl, bdkc bdkc, ayte ayte, bmxv bmxv) {
        this.f105732a = bdkc;
        this.f105733b = ayte;
        bdji bdji = new bdji();
        bdji.f105741b = bdjh.f105739a;
        bdji.f105740a = false;
        String str = bdji.f105740a == null ? " enabled" : "";
        str = bdji.f105741b == null ? str.concat(" metricExtensionProvider") : str;
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        this.f105735d = ((bdjj) bmxv.mo66812a(new bdjd(bdji.f105740a.booleanValue(), bdji.f105741b))).mo58079b();
        this.f105734c = cijl;
    }
}
