package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tfx */
final /* synthetic */ class tfx implements View.OnClickListener {

    /* renamed from: a */
    private final tfy f45897a;

    /* renamed from: b */
    private final Intent f45898b;

    public tfx(tfy tfy, Intent intent) {
        this.f45897a = tfy;
        this.f45898b = intent;
    }

    public void onClick(View view) {
        tfy tfy = this.f45897a;
        Intent intent = this.f45898b;
        if (intent.resolveActivity(tfy.f45900b.getContext().getPackageManager()) != null) {
            tfy.f45899a.mo26568a(tio.SEE_ALL_LINK, tio.SMART_PROFILE_PHOTOS_CARD);
            tfy.f45900b.getContext().startActivity(intent);
        }
    }
}
