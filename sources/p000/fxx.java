package p000;

import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Comparator;

/* renamed from: fxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxx implements Comparator {

    /* renamed from: a */
    final /* synthetic */ fxy f17566a;

    public fxx(fxy fxy) {
        this.f17566a = fxy;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = this.f17566a.f17567a;
        return iArr[((ContactPerson.ContactMethod) obj).f9755a] - iArr[((ContactPerson.ContactMethod) obj2).f9755a];
    }
}
