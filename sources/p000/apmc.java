package p000;

import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import java.util.Comparator;

/* renamed from: apmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apmc implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((AppIndexingUserActionInfo) obj2).f107353b).compareTo(Long.valueOf(((AppIndexingUserActionInfo) obj).f107353b));
    }
}
