package p000;

import java.util.Locale;

/* renamed from: bfky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfky extends RuntimeException {
    public bfky(String str, Thread thread, Thread thread2) {
        super(String.format(Locale.US, "%s has affinity to Thread[id=%d, name='%s'], but found on Thread[id=%d, name='%s'].", str, Long.valueOf(thread.getId()), thread.getName(), Long.valueOf(thread2.getId()), thread2.getName()));
    }
}
