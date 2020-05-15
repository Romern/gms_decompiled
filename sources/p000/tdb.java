package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdb extends sva {

    /* renamed from: t */
    final TextView f45675t;

    /* renamed from: u */
    final Button f45676u;

    /* renamed from: v */
    final TextView f45677v;

    public tdb(View view) {
        super(view);
        this.f45675t = (TextView) view.findViewById(C0126R.C0129id.app_name);
        this.f45676u = (Button) view.findViewById(C0126R.C0129id.app_button);
        this.f45677v = (TextView) view.findViewById(C0126R.C0129id.app_steps);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        if (svc instanceof tdc) {
            tdc tdc = (tdc) svc;
            boolean z = tdc.f45685o;
            this.f45675t.setText(tdc.f45680b);
            this.f45675t.setCompoundDrawables(tdc.f45681c, null, null, null);
            this.f45675t.setCompoundDrawablePadding(tdc.f45683m);
            this.f45676u.setEnabled(z);
            this.f45676u.setOnClickListener(tdc);
            this.f45676u.setText((int) C0126R.string.c11n_open);
            this.f45677v.setText(tdc.f45682l);
            return;
        }
        throw new IllegalArgumentException("settingItem must be ConnectedAppsSettingItem");
    }
}
