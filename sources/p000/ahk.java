package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: ahk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahk {

    /* renamed from: a */
    public final Intent f545a;

    public ahk(Intent intent) {
        this.f545a = intent;
    }

    /* renamed from: a */
    public final void mo706a(Context context, Uri uri) {
        this.f545a.setData(uri);
        Intent intent = this.f545a;
        int i = Build.VERSION.SDK_INT;
        context.startActivity(intent, null);
    }
}
