package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfb */
final /* synthetic */ class tfb implements View.OnClickListener {

    /* renamed from: a */
    private final tfg f45813a;

    /* renamed from: b */
    private final Intent f45814b;

    public tfb(tfg tfg, Intent intent) {
        this.f45813a = tfg;
        this.f45814b = intent;
    }

    public void onClick(View view) {
        tfg tfg = this.f45813a;
        Intent intent = this.f45814b;
        if (intent.resolveActivity(tfg.f45825c.getContext().getPackageManager()) != null) {
            tfg.f45824b.mo26568a(tio.SMART_PROFILE_LINKS_CARD_LINK, tio.SMART_PROFILE_ABOUT_CARD);
            tfg.f45825c.getContext().startActivity(intent);
        }
    }
}
