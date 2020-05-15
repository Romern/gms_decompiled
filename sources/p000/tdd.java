package p000;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/* renamed from: tdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdd extends svj {

    /* renamed from: y */
    final TextView f45686y;

    public tdd(View view) {
        super(view);
        this.f45686y = (TextView) view.findViewById(16908304);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        super.mo23819a(svc);
        this.f45686y.setMovementMethod(LinkMovementMethod.getInstance());
        this.f45686y.setClickable(true);
    }
}
