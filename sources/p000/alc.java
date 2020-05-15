package p000;

import android.os.Messenger;

/* renamed from: alc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alc {
    /* renamed from: a */
    public static boolean m998a(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException e) {
            }
        }
        return false;
    }
}
