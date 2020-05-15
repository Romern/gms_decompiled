package p000;

/* renamed from: kra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kra {

    /* renamed from: a */
    private static final srn f24830a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final String f24831b;

    public kra(String str) {
        this.f24831b = str;
    }

    /* renamed from: a */
    public final kdf mo14821a(String str) {
        beao a = beao.m91670a();
        try {
            beat a2 = a.mo58483a(str, this.f24831b);
            return new kdf(a.mo58486a(a2, 1), a.mo58486a(a2, 2), a.mo58486a(a2, 3), String.valueOf(a2.f106841a), a.mo58485a(a2));
        } catch (bean e) {
            bnsl bnsl = (bnsl) f24830a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68448m();
            return null;
        }
    }
}
