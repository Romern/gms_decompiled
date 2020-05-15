package p000;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.setupdesign.GlifLayout;
import java.util.Locale;

/* renamed from: bjax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjax {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* renamed from: a */
    public static int m103131a(Context context) {
        char c;
        String c2 = biyk.m102977a(context).mo64871c(context, biyj.CONFIG_LAYOUT_GRAVITY);
        if (c2 == null) {
            return 0;
        }
        String lowerCase = c2.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals("start")) {
                c = 1;
                if (c == 0) {
                    return 17;
                }
                if (c != 1) {
                    return 0;
                }
                return 8388611;
            }
        } else if (lowerCase.equals("center")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    public static boolean m103132a(FrameLayout frameLayout) {
        if (!(frameLayout instanceof GlifLayout) || !((GlifLayout) frameLayout).f151482h) {
            return false;
        }
        return true;
    }
}
