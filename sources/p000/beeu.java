package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: beeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beeu {

    /* renamed from: a */
    public final befa f111456a;

    /* renamed from: b */
    public final bqgj f111457b;

    public beeu(bqgj bqgj, List list) {
        befa befa = new befa(list, Collections.emptyList(), Collections.emptyList());
        this.f111457b = bqgj;
        this.f111456a = befa;
    }

    /* renamed from: a */
    public final bqgg mo60631a(Uri uri, beez beez, beer... beerArr) {
        return this.f111457b.mo25819b(new bees(this, uri, beez, beerArr));
    }
}
