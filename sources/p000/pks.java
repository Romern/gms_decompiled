package p000;

import java.util.Locale;

/* renamed from: pks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pks {
    /* renamed from: a */
    public static String m30741a(int i) {
        if (i == 0) {
            return "Disconnected";
        }
        if (i == 1) {
            return "Connecting";
        }
        if (i == 2) {
            return "Connected";
        }
        if (i == 3) {
            return "Disconnecting";
        }
        if (i == 4) {
            return "Disposed";
        }
        return String.format(Locale.ROOT, "\"%d Unknown state\"", Integer.valueOf(i));
    }
}
