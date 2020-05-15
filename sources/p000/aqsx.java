package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqsx */
final /* synthetic */ class aqsx implements View.OnClickListener {

    /* renamed from: a */
    private final aqtb f86728a;

    /* renamed from: b */
    private final Intent f86729b;

    public aqsx(aqtb aqtb, Intent intent) {
        this.f86728a = aqtb;
        this.f86729b = intent;
    }

    public void onClick(View view) {
        aqtb aqtb = this.f86728a;
        Intent intent = this.f86729b;
        if (intent.resolveActivity(aqtb.f86734a.getPackageManager()) != null) {
            aqtb.f86735b.mo26568a(tio.SMART_PROFILE_LINKS_CARD_LINK, tio.SMART_PROFILE_ABOUT_CARD);
            aqtb.f86734a.startActivity(intent);
        }
    }
}
