package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: ajcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajcp {
    /* renamed from: a */
    public static String m58515a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    /* renamed from: a */
    public static void m58516a(Intent intent, String str, ReflectedParcelable reflectedParcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(str, reflectedParcelable);
        intent.putExtra(str, bundle);
    }
}
