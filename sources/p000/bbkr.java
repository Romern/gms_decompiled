package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: bbkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbkr {

    /* renamed from: a */
    private final Context f102824a;

    public bbkr(Context context) {
        this.f102824a = context;
    }

    /* renamed from: a */
    public final void mo56192a() {
        this.f102824a.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
    }

    /* renamed from: b */
    public final void mo56193b() {
        this.f102824a.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }
}
