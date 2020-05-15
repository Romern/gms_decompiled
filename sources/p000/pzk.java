package p000;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pzk extends sva {

    /* renamed from: t */
    private final TextView f40744t;

    public pzk(View view) {
        super(view);
        this.f40744t = (TextView) view.findViewById(C0126R.C0129id.text);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        pzm pzm = (pzm) svc;
        SpannableString spannableString = new SpannableString(pzm.f40747b);
        spannableString.setSpan(new pzj(pzm), (pzm.f40747b.length() - pzm.f40748c.length()) - 1, pzm.f40747b.length(), 33);
        this.f40744t.setText(spannableString);
        this.f40744t.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
