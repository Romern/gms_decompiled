package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;

/* renamed from: bkek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkek extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ TextView f124085a;

    /* renamed from: b */
    final /* synthetic */ MaterialFieldLayout f124086b;

    public bkek(MaterialFieldLayout materialFieldLayout, TextView textView) {
        this.f124086b = materialFieldLayout;
        this.f124085a = textView;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        MaterialFieldLayout materialFieldLayout = this.f124086b;
        materialFieldLayout.f152148c.setVisibility(materialFieldLayout.f152153h);
        TextView textView = this.f124085a;
        if (textView != null) {
            textView.setHint(this.f124086b.f152152g);
        }
    }
}
