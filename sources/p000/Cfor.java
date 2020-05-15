package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: for  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Cfor extends acm implements View.OnClickListener {

    /* renamed from: s */
    final TextView f17036s;

    /* renamed from: t */
    final TextView f17037t;

    /* renamed from: u */
    final /* synthetic */ fot f17038u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Cfor(fot fot, View view) {
        super(view);
        this.f17038u = fot;
        this.f17036s = (TextView) view.findViewById(16908308);
        this.f17037t = (TextView) view.findViewById(16908309);
    }

    public void onClick(View view) {
        int d;
        fos fos = this.f17038u.f17041e;
        if (fos != null && (d = mo323d()) != -1) {
            fos.mo7148a((smj) this.f17038u.f17040d.get(d));
        }
    }
}
