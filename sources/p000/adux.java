package p000;

import com.google.android.gms.languageprofile.LanguagePreference;
import java.util.Comparator;

/* renamed from: adux */
public final /* synthetic */ class adux implements Comparator {

    /* renamed from: a */
    public static final Comparator f62781a = new adux();

    private adux() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((LanguagePreference) obj2).f79272b, ((LanguagePreference) obj).f79272b);
    }
}
