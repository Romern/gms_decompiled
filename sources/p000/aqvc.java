package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqvc */
final /* synthetic */ class aqvc implements View.OnClickListener {

    /* renamed from: a */
    private final aqvd f86894a;

    /* renamed from: b */
    private final Intent f86895b;

    public aqvc(aqvd aqvd, Intent intent) {
        this.f86894a = aqvd;
        this.f86895b = intent;
    }

    public void onClick(View view) {
        aqvd aqvd = this.f86894a;
        Intent intent = this.f86895b;
        if (intent.resolveActivity(aqvd.getActivity().getPackageManager()) != null) {
            aqvd.getActivity().startActivity(intent);
        }
    }
}
