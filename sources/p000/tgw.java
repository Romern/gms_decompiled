package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: tgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgw {
    /* renamed from: a */
    static Intent m36950a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String valueOf = String.valueOf(Uri.encode(str));
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf)));
        return intent;
    }
}
