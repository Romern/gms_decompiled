package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfk */
final /* synthetic */ class tfk implements View.OnClickListener {

    /* renamed from: a */
    private final tfm f45854a;

    /* renamed from: b */
    private final Intent f45855b;

    public tfk(tfm tfm, Intent intent) {
        this.f45854a = tfm;
        this.f45855b = intent;
    }

    public void onClick(View view) {
        tfm tfm = this.f45854a;
        Intent intent = this.f45855b;
        if (intent.resolveActivity(tfm.f45863f.getPackageManager()) != null) {
            tfm.f45863f.startActivity(intent);
        }
    }
}
