package p000;

import java.util.Collection;

/* renamed from: bhyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119925a;

    /* renamed from: b */
    final /* synthetic */ bhyu f119926b;

    /* renamed from: c */
    final /* synthetic */ bhzb f119927c;

    public bhyy(bhzb bhzb, Collection collection, bhyu bhyu) {
        this.f119927c = bhzb;
        this.f119925a = collection;
        this.f119926b = bhyu;
    }

    public final void run() {
        bhzb bhzb = this.f119927c;
        Collection collection = this.f119925a;
        bhzb.f119932a.execute(new bhza(this.f119926b, collection));
    }
}
