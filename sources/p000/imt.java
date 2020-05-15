package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* renamed from: imt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imt {
    /* renamed from: a */
    public static Intent m15732a(PendingIntent pendingIntent) {
        sdo.m34966a(pendingIntent, "The target cannot be null!");
        Intent intent = new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms");
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("intent://com.google.android.gms.auth.uiflows.common/");
        sb.append(valueOf);
        return intent.setData(Uri.parse(sb.toString())).putExtra("target", pendingIntent);
    }
}
