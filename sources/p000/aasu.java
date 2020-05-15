package p000;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: aasu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aasu implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Collator.getInstance().compare(((Locale) obj).getDisplayCountry(), ((Locale) obj2).getDisplayCountry());
    }
}
