package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: bhza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhza implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhyu f119930a;

    /* renamed from: b */
    final /* synthetic */ Collection f119931b;

    public bhza(bhyu bhyu, Collection collection) {
        this.f119930a = bhyu;
        this.f119931b = collection;
    }

    public final void run() {
        this.f119930a.mo64417a(new HashMap(), this.f119931b);
    }
}
