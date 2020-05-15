package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqth */
final /* synthetic */ class aqth implements View.OnClickListener {

    /* renamed from: a */
    private final aqtk f86758a;

    /* renamed from: b */
    private final Intent f86759b;

    public aqth(aqtk aqtk, Intent intent) {
        this.f86758a = aqtk;
        this.f86759b = intent;
    }

    public void onClick(View view) {
        aqtk aqtk = this.f86758a;
        Intent intent = this.f86759b;
        if (intent.resolveActivity(aqtk.f86764a.getPackageManager()) != null) {
            aqtk.f86765b.mo26568a(tio.GENERIC_CARD_ENTRY, tio.GENERIC_CARD);
            aqtk.f86764a.startActivity(intent);
        }
    }
}
