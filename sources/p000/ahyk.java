package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: ahyk */
final /* synthetic */ class ahyk implements View.OnClickListener {

    /* renamed from: a */
    private final ahym f68351a;

    /* renamed from: b */
    private final Intent f68352b;

    public ahyk(ahym ahym, Intent intent) {
        this.f68351a = ahym;
        this.f68352b = intent;
    }

    public void onClick(View view) {
        ahym ahym = this.f68351a;
        Intent intent = this.f68352b;
        ahym.f68354a.setVisibility(4);
        ahym.getActivity().startService(intent);
    }
}
