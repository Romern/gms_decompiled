package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkrn {

    /* renamed from: a */
    public final bkqo f125156a;

    /* renamed from: b */
    public final bkqw f125157b;

    /* renamed from: c */
    public final List f125158c;

    public bkrn(bkqo bkqo, bkqw bkqw, List list) {
        this.f125156a = bkqo;
        this.f125157b = bkqw;
        this.f125158c = list;
    }

    /* renamed from: a */
    public abstract bkrn mo66284a(bkqo bkqo);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bkrn bkrn = (bkrn) obj;
        return bkwv.m106780a(this.f125157b, bkrn.f125157b, this.f125158c, bkrn.f125158c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125157b, this.f125158c});
    }
}
