package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtd */
final /* synthetic */ class aqtd implements View.OnClickListener {

    /* renamed from: a */
    private final aqtg f86743a;

    /* renamed from: b */
    private final Intent f86744b;

    public aqtd(aqtg aqtg, Intent intent) {
        this.f86743a = aqtg;
        this.f86744b = intent;
    }

    public void onClick(View view) {
        aqtg aqtg = this.f86743a;
        Intent intent = this.f86744b;
        if (intent.resolveActivity(aqtg.f86751a.getPackageManager()) != null) {
            aqtg.f86751a.startActivity(intent);
        }
    }
}
