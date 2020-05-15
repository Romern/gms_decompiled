package p000;

import java.util.Collection;

/* renamed from: bskr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bskr implements bsla {

    /* renamed from: a */
    private final bnhe f144890a;

    /* renamed from: b */
    private final String f144891b;

    public bskr(bnhe bnhe, String str) {
        this.f144890a = bnhe;
        this.f144891b = str;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo70665a(Collection r7) {
        int i;
        bmxy.m108589a(!r7.isEmpty(), "Cannot build a CredentialGroup with no passwords.");
        bske i2 = bskf.m115890i();
        i2.f144871b = bmxv.m108566b(this.f144891b);
        int size = r7.size();
        int i3 = 0;
        while (i3 < size) {
            bnre i4 = ((bskf) r7.get(i3)).mo70642a().listIterator();
            while (true) {
                i = i3 + 1;
                if (!i4.hasNext()) {
                    break;
                }
                i2.mo70657a((bskl) i4.next());
            }
            i3 = i;
        }
        return i2.mo70656a(this.f144890a);
    }
}
