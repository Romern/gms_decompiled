package p000;

import android.content.Intent;

/* renamed from: puo */
final /* synthetic */ class puo implements Runnable {

    /* renamed from: a */
    private final puu f40280a;

    /* renamed from: b */
    private final Intent f40281b;

    /* renamed from: c */
    private final alo f40282c;

    public puo(puu puu, Intent intent, alo alo) {
        this.f40280a = puu;
        this.f40281b = intent;
        this.f40282c = alo;
    }

    public final void run() {
        puu puu = this.f40280a;
        Intent intent = this.f40281b;
        put put = new put(intent, this.f40282c);
        if (intent.hasCategory("android.media.intent.category.REMOTE_PLAYBACK") || intent.hasCategory("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
            puu.mo23712a(put);
        }
    }
}
