package androidx.core.app;

import android.app.PendingIntent;
import android.support.p001v4.app.RemoteActionCompat;
import android.support.p001v4.graphics.drawable.IconCompat;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(avb avb) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1023a = (IconCompat) avb.mo2688b(remoteActionCompat.f1023a, 1);
        remoteActionCompat.f1024b = avb.mo2689b(remoteActionCompat.f1024b, 2);
        remoteActionCompat.f1025c = avb.mo2689b(remoteActionCompat.f1025c, 3);
        remoteActionCompat.f1026d = (PendingIntent) avb.mo2687b(remoteActionCompat.f1026d, 4);
        remoteActionCompat.f1027e = avb.mo2693b(remoteActionCompat.f1027e, 5);
        remoteActionCompat.f1028f = avb.mo2693b(remoteActionCompat.f1028f, 6);
        return remoteActionCompat;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      avb.a(int, int):void
      avb.a(android.os.Parcelable, int):void
      avb.a(avg, int):void
      avb.a(java.lang.CharSequence, int):void
      avb.a(java.lang.String, int):void
      avb.a(boolean, int):void
      avb.a(java.lang.Object[], int):void
      avb.a(boolean, boolean):void */
    public static void write(RemoteActionCompat remoteActionCompat, avb avb) {
        avb.mo2682a(false, false);
        avb.mo2675a(remoteActionCompat.f1023a, 1);
        avb.mo2677a(remoteActionCompat.f1024b, 2);
        avb.mo2677a(remoteActionCompat.f1025c, 3);
        avb.mo2673a(remoteActionCompat.f1026d, 4);
        avb.mo2681a(remoteActionCompat.f1027e, 5);
        avb.mo2681a(remoteActionCompat.f1028f, 6);
    }
}
