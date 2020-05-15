package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: thc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thc {
    /* renamed from: a */
    public static Intent m36957a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        return intent;
    }

    /* renamed from: a */
    public static Intent m36958a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("fromAccountString", str2);
        return intent;
    }
}
