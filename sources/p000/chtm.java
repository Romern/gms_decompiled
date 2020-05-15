package p000;

import java.util.Iterator;

/* renamed from: chtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chtm implements Iterable {

    /* renamed from: a */
    public final chtn f189125a;

    /* renamed from: b */
    public final int f189126b;

    /* renamed from: c */
    final /* synthetic */ chtr f189127c;

    public chtm(chtr chtr, chtn chtn, int i) {
        this.f189127c = chtr;
        this.f189125a = chtn;
        this.f189126b = i;
    }

    public final Iterator iterator() {
        return new chtl(this);
    }
}
