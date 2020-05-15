package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bkro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkro extends bkrn {

    /* renamed from: d */
    public final List f125159d = new ArrayList();

    /* renamed from: e */
    public final List f125160e;

    public bkro(bkqo bkqo, bkqw bkqw, List list, List list2) {
        super(bkqo, bkqw, list);
        this.f125160e = list2;
    }

    /* renamed from: a */
    public final bkrn mo66284a(bkqo bkqo) {
        return new bkro(bkqo, this.f125157b, this.f125158c, this.f125160e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bkro)) {
            return false;
        }
        bkro bkro = (bkro) obj;
        return bkwv.m106780a(this.f125156a.mo66247d(), bkro.f125156a.mo66247d(), this.f125159d, bkro.f125159d, this.f125157b, bkro.f125157b, this.f125158c, bkro.f125158c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125156a.mo66247d(), this.f125159d, this.f125157b, this.f125158c});
    }
}
