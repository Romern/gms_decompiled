package p000;

import android.view.View;
import android.widget.TextView;

/* renamed from: sve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sve extends sva {

    /* renamed from: t */
    private final TextView f45213t;

    public sve(View view) {
        super(view);
        this.f45213t = (TextView) view.findViewById(16908310);
        if (cdlk.f181194a.mo6606a().mo77860b()) {
            view.setFocusable(false);
        } else {
            view.setFocusable(true);
        }
        view.setFocusableInTouchMode(false);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        if (svc instanceof svf) {
            this.f45213t.setText(((svf) svc).f45211f);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultSettingsCategory");
    }
}
