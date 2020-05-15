package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aqjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjs extends aqjp {

    /* renamed from: a */
    public final boolean f86234a;

    public aqjs(Context context, boolean z) {
        super(context, true);
        this.f86234a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        Intent intent = new Intent("com.google.android.systemui.GRANT_WALLPAPER_PERMISSIONS");
        intent.setPackage("com.android.systemui");
        intent.putExtra("opted_in", z);
        this.f86226g.sendBroadcast(intent);
    }
}
