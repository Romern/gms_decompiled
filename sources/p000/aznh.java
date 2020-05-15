package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: aznh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznh implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f99718a;

    /* renamed from: b */
    final /* synthetic */ TextView f99719b;

    /* renamed from: c */
    final /* synthetic */ long f99720c;

    public aznh(View view, TextView textView, long j) {
        this.f99718a = view;
        this.f99719b = textView;
        this.f99720c = j;
    }

    public void onClick(View view) {
        if (this.f99718a.getVisibility() == 8) {
            TextView textView = this.f99719b;
            if (textView != null) {
                textView.setText(azpi.m86062a(this.f99720c / 1000));
            }
            this.f99718a.setVisibility(0);
            return;
        }
        this.f99718a.setVisibility(8);
    }
}
