package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Comparator;

/* renamed from: ajiz */
public final /* synthetic */ class ajiz implements Comparator {

    /* renamed from: a */
    public static final Comparator f70730a = new ajiz();

    private ajiz() {
    }

    public final int compare(Object obj, Object obj2) {
        ShareTarget shareTarget = (ShareTarget) obj;
        ShareTarget shareTarget2 = (ShareTarget) obj2;
        if (shareTarget.f81038k) {
            if (!shareTarget2.f81038k) {
                return -1;
            }
        } else if (shareTarget2.f81038k) {
            return 1;
        }
        return shareTarget.f81029b.compareTo(shareTarget2.f81029b);
    }
}
