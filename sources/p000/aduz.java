package p000;

import com.google.android.gms.languageprofile.LanguageFluency;
import java.util.Comparator;

/* renamed from: aduz */
public final /* synthetic */ class aduz implements Comparator {

    /* renamed from: a */
    public static final Comparator f62783a = new aduz();

    private aduz() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((LanguageFluency) obj2).f79266b, ((LanguageFluency) obj).f79266b);
    }
}
