package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: phm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ phq f39130a;

    public phm(phq phq) {
        this.f39130a = phq;
    }

    public void onClick(View view) {
        this.f39130a.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(phq.f39135a)));
    }
}
