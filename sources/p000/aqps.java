package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqps */
final /* synthetic */ class aqps implements View.OnClickListener {

    /* renamed from: a */
    private final aqpw f86526a;

    /* renamed from: b */
    private final Intent f86527b;

    public aqps(aqpw aqpw, Intent intent) {
        this.f86526a = aqpw;
        this.f86527b = intent;
    }

    public void onClick(View view) {
        aqpw aqpw = this.f86526a;
        Intent intent = this.f86527b;
        if (intent.resolveActivity(aqpw.f86552l.getPackageManager()) != null) {
            aqpw.f86552l.startActivity(intent);
        }
    }
}
