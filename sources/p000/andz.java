package p000;

import com.google.android.gms.phenotype.Flag;
import java.util.Comparator;

/* renamed from: andz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andz implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Flag flag = (Flag) obj;
        Flag flag2 = (Flag) obj2;
        int i = flag.f82106h;
        int i2 = flag2.f82106h;
        return i == i2 ? flag.f82099a.compareTo(flag2.f82099a) : i - i2;
    }
}
