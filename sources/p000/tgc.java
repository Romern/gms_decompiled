package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgc {

    /* renamed from: a */
    public final View f45909a;

    /* renamed from: b */
    public final ImageView f45910b;

    /* renamed from: c */
    public final TextView f45911c = ((TextView) this.f45909a.findViewById(C0126R.C0129id.text));

    /* renamed from: d */
    public final TextView f45912d = ((TextView) this.f45909a.findViewById(C0126R.C0129id.subtext));

    /* renamed from: e */
    final /* synthetic */ tgd f45913e;

    public tgc(tgd tgd, View view) {
        this.f45913e = tgd;
        this.f45909a = view;
        this.f45910b = (ImageView) view.findViewById(C0126R.C0129id.image);
    }

    /* renamed from: a */
    public final void mo26484a(int i) {
        this.f45909a.setVisibility(i);
    }
}
