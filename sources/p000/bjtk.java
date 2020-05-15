package p000;

import android.util.SparseArray;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: bjtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjtk implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Collator f123279a;

    /* renamed from: b */
    final /* synthetic */ SparseArray f123280b;

    public bjtk(Collator collator, SparseArray sparseArray) {
        this.f123279a = collator;
        this.f123280b = sparseArray;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f123279a.compare((String) this.f123280b.get(((Integer) obj).intValue()), (String) this.f123280b.get(((Integer) obj2).intValue()));
    }
}
