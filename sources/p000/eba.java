package p000;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Comparator;

/* renamed from: eba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eba implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((ContextData) obj).mo18022j().mo18096c() - ((ContextData) obj2).mo18022j().mo18096c());
    }
}
