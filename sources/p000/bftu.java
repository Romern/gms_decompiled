package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: bftu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftu {

    /* renamed from: a */
    public final Deque f115267a = new ArrayDeque();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62262a() {
        this.f115267a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62263a(int i) {
        return !this.f115267a.isEmpty() && i == ((bftt) this.f115267a.getFirst()).f115266b;
    }
}
