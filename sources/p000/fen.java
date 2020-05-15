package p000;

import java.util.Arrays;

/* renamed from: fen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fen {

    /* renamed from: a */
    public final bsxn f16396a;

    /* renamed from: b */
    public final bsxn f16397b;

    /* renamed from: c */
    public final bsxn f16398c;

    /* renamed from: d */
    public final bsxn f16399d;

    /* renamed from: e */
    public final fek f16400e;

    public fen(bsxn bsxn, bsxn bsxn2, bsxn bsxn3, bsxn bsxn4, fek fek) {
        this.f16396a = bsxn;
        this.f16397b = bsxn2;
        this.f16398c = bsxn3;
        this.f16399d = bsxn4;
        this.f16400e = fek;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fen)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        fen fen = (fen) obj;
        return bmxi.m108538a(this.f16396a, fen.f16396a) && bmxi.m108538a(this.f16397b, fen.f16397b) && bmxi.m108538a(this.f16398c, fen.f16398c) && bmxi.m108538a(this.f16399d, fen.f16399d) && bmxi.m108538a(this.f16400e, fen.f16400e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16396a, this.f16397b, this.f16398c, this.f16399d, this.f16400e});
    }
}
