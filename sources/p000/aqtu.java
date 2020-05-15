package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtu */
final /* synthetic */ class aqtu implements View.OnClickListener {

    /* renamed from: a */
    private final aqtx f86790a;

    /* renamed from: b */
    private final Intent f86791b;

    public aqtu(aqtx aqtx, Intent intent) {
        this.f86790a = aqtx;
        this.f86791b = intent;
    }

    public void onClick(View view) {
        aqtx aqtx = this.f86790a;
        Intent intent = this.f86791b;
        if (intent != null && intent.resolveActivity(aqtx.f86793a.getPackageManager()) != null) {
            aqtx.f86794b.mo26568a(tio.RECENT_INTERACTION_LINK, tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
            aqtx.f86793a.startActivity(intent);
        }
    }
}
