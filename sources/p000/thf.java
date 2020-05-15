package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: thf */
final /* synthetic */ class thf implements View.OnClickListener {

    /* renamed from: a */
    private final thg f46012a;

    /* renamed from: b */
    private final Intent f46013b;

    public thf(thg thg, Intent intent) {
        this.f46012a = thg;
        this.f46013b = intent;
    }

    public void onClick(View view) {
        thg thg = this.f46012a;
        Intent intent = this.f46013b;
        if (intent.resolveActivity(thg.getActivity().getPackageManager()) != null) {
            thg.getActivity().startActivity(intent);
        }
    }
}
