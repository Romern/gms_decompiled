package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfz */
final /* synthetic */ class tfz implements View.OnClickListener {

    /* renamed from: a */
    private final tgd f45904a;

    /* renamed from: b */
    private final Intent f45905b;

    public tfz(tgd tgd, Intent intent) {
        this.f45904a = tgd;
        this.f45905b = intent;
    }

    public void onClick(View view) {
        tgd tgd = this.f45904a;
        Intent intent = this.f45905b;
        if (intent.resolveActivity(tgd.f45914a.getContext().getPackageManager()) != null) {
            tgd.f45916c.mo26568a(tio.SEE_ALL_LINK, tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD);
            tgd.f45914a.getContext().startActivity(intent);
        }
    }
}
