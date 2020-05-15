package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwt extends acm {

    /* renamed from: s */
    public final Context f66751s;

    /* renamed from: t */
    public final TextView f66752t;

    /* renamed from: u */
    public final TextView f66753u;

    public agwt(View view) {
        super(view);
        this.f66751s = view.getContext();
        this.f66752t = (TextView) view.findViewById(C0126R.C0129id.title_text);
        this.f66753u = (TextView) view.findViewById(C0126R.C0129id.price_text);
    }
}
