package p000;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: fzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fzk implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Collator f17737a;

    public fzk(Collator collator) {
        this.f17737a = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f17737a.compare(fzm.m12790a((ContactPerson) obj), fzm.m12790a((ContactPerson) obj2));
    }
}
