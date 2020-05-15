package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgb */
final /* synthetic */ class tgb implements View.OnClickListener {

    /* renamed from: a */
    private final tgc f45907a;

    /* renamed from: b */
    private final Intent f45908b;

    public tgb(tgc tgc, Intent intent) {
        this.f45907a = tgc;
        this.f45908b = intent;
    }

    public void onClick(View view) {
        tgc tgc = this.f45907a;
        Intent intent = this.f45908b;
        if (intent != null && intent.resolveActivity(tgc.f45913e.f45914a.getContext().getPackageManager()) != null) {
            tgc.f45913e.f45916c.mo26568a(tio.GOOGLE_PLUS_POST_LINK, tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            tgc.f45913e.f45914a.getContext().startActivity(intent);
        }
    }
}
