package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: avvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f93994a;

    /* renamed from: b */
    final /* synthetic */ TextView f93995b;

    public avvt(TextView textView, TextView textView2) {
        this.f93994a = textView;
        this.f93995b = textView2;
    }

    public void onClick(View view) {
        this.f93994a.setVisibility(0);
        this.f93995b.setVisibility(0);
    }
}
