package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtt */
final /* synthetic */ class aqtt implements View.OnClickListener {

    /* renamed from: a */
    private final aqtx f86788a;

    /* renamed from: b */
    private final Intent f86789b;

    public aqtt(aqtx aqtx, Intent intent) {
        this.f86788a = aqtx;
        this.f86789b = intent;
    }

    public void onClick(View view) {
        aqtx aqtx = this.f86788a;
        Intent intent = this.f86789b;
        if (intent != null && intent.resolveActivity(aqtx.f86793a.getPackageManager()) != null) {
            aqtx.f86794b.mo26568a(tio.RECENT_INTERACTION_LINK, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            aqtx.f86793a.startActivity(intent);
        }
    }
}
