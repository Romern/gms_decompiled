package p000;

import java.util.List;

/* renamed from: adqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adqf implements bmxj {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<Boolean> list = (List) obj;
        if (list == null) {
            return false;
        }
        Boolean bool = true;
        for (Boolean bool2 : list) {
            bool = Boolean.valueOf(bool.booleanValue() & bool2.booleanValue());
        }
        return bool;
    }
}
