package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: bhyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119928a;

    /* renamed from: b */
    final /* synthetic */ bhyg f119929b;

    public bhyz(bhyg bhyg, Collection collection) {
        this.f119929b = bhyg;
        this.f119928a = collection;
    }

    public final void run() {
        this.f119929b.mo64416a(new HashMap(), this.f119928a);
    }
}
