package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: auyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyo extends auxv {

    /* renamed from: c */
    public final TextView f92792c;

    /* renamed from: d */
    public final TextView f92793d;

    /* renamed from: e */
    private final TextView f92794e;

    /* renamed from: f */
    private final boolean f92795f;

    public auyo(Context context, boolean z) {
        super(context);
        this.f92795f = z;
        View inflate = this.f92753a.getLayoutInflater().inflate((int) C0126R.C0128layout.auth_trusted_places_home_menu_dialog_layout, (ViewGroup) null);
        setContentView(inflate);
        this.f92792c = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_home_menu_enable);
        this.f92793d = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_home_menu_disable);
        this.f92794e = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_home_menu_edit);
        if (this.f92795f) {
            this.f92792c.setVisibility(8);
            this.f92793d.setVisibility(0);
        } else {
            this.f92792c.setVisibility(0);
            this.f92793d.setVisibility(8);
        }
        this.f92794e.setOnClickListener(new auyl(this));
        this.f92792c.setOnClickListener(new auym(this));
        this.f92793d.setOnClickListener(new auyn(this));
    }
}
