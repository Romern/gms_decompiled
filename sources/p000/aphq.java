package p000;

import android.content.Intent;

/* renamed from: aphq */
public final /* synthetic */ class aphq implements Runnable {

    /* renamed from: a */
    private final Intent f84397a;

    public aphq(Intent intent) {
        this.f84397a = intent;
    }

    public final void run() {
        String str;
        Intent intent = this.f84397a;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("com.google.android.gms.scheduler.intent.USER_UNLOCKED".equals(str)) {
            aytw.m84814b();
            if (apht.m70316b()) {
                apht.m70315a().mo47224a(rpr.m34216b(), srb.f45012a);
            }
        }
    }
}
