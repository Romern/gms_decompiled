package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: tgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgg {
    /* renamed from: a */
    static bmxv m36932a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? bmvz.f131120a : bmxv.m108566b(new Intent(str).setData(Uri.parse(str2)));
    }
}
