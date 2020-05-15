package p000;

import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import java.util.Comparator;

/* renamed from: apma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apma implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((AppIndexingErrorInfo) obj2).f107349e).compareTo(Long.valueOf(((AppIndexingErrorInfo) obj).f107349e));
    }
}
