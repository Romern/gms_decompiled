package p000;

import java.util.Collection;

/* renamed from: bhyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f119922a;

    /* renamed from: b */
    final /* synthetic */ bhzb f119923b;

    /* renamed from: c */
    final /* synthetic */ bhyg f119924c;

    public bhyx(bhzb bhzb, Collection collection, bhyg bhyg) {
        this.f119923b = bhzb;
        this.f119922a = collection;
        this.f119924c = bhyg;
    }

    public final void run() {
        bhzb bhzb = this.f119923b;
        Collection collection = this.f119922a;
        bhzb.f119932a.execute(new bhyz(this.f119924c, collection));
    }
}
