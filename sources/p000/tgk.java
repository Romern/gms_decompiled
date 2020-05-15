package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tgk {

    /* renamed from: a */
    public final TextView f45936a;

    /* renamed from: b */
    public final View f45937b;

    /* renamed from: c */
    final /* synthetic */ tgl f45938c;

    public tgk(tgl tgl, View view) {
        this.f45938c = tgl;
        this.f45937b = view;
        this.f45936a = (TextView) view.findViewById(C0126R.C0129id.display_name);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26491a(int i) {
        this.f45937b.setVisibility(i);
    }
}
