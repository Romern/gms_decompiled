package p000;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajmz */
final /* synthetic */ class ajmz implements Runnable {

    /* renamed from: a */
    private final ajna f70948a;

    /* renamed from: b */
    private final int f70949b;

    /* renamed from: c */
    private final ShareTarget f70950c;

    public ajmz(ajna ajna, int i, ShareTarget shareTarget) {
        this.f70948a = ajna;
        this.f70949b = i;
        this.f70950c = shareTarget;
    }

    public final void run() {
        ajna ajna = this.f70948a;
        int i = this.f70949b;
        ShareTarget shareTarget = this.f70950c;
        ajna.f70953b.mo36453a("nearby_sharing", i);
        ahhd.m55768a(ajna.f70952a, new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", i));
    }
}
