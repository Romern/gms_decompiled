package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtj */
final /* synthetic */ class aqtj implements View.OnClickListener {

    /* renamed from: a */
    private final aqtk f86761a;

    /* renamed from: b */
    private final Intent f86762b;

    /* renamed from: c */
    private final tio f86763c;

    public aqtj(aqtk aqtk, Intent intent, tio tio) {
        this.f86761a = aqtk;
        this.f86762b = intent;
        this.f86763c = tio;
    }

    public void onClick(View view) {
        aqtk aqtk = this.f86761a;
        Intent intent = this.f86762b;
        tio tio = this.f86763c;
        if (intent.resolveActivity(aqtk.f86764a.getPackageManager()) != null) {
            aqtk.f86765b.mo26568a(tio, tio.GENERIC_CARD);
            aqtk.f86764a.startActivity(intent);
        }
    }
}
