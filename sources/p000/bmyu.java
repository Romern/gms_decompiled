package p000;

import java.util.Iterator;

/* renamed from: bmyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyu implements Iterable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f131212a;

    /* renamed from: b */
    final /* synthetic */ bmyx f131213b;

    public bmyu(bmyx bmyx, CharSequence charSequence) {
        this.f131213b = bmyx;
        this.f131212a = charSequence;
    }

    public final Iterator iterator() {
        return this.f131213b.mo66923b(this.f131212a);
    }

    public final String toString() {
        bmxr a = bmxr.m108544a(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        a.mo66877a(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
