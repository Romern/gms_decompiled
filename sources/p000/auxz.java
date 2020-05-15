package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: auxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxz extends auxv {

    /* renamed from: c */
    public final String f92758c;

    /* renamed from: d */
    public final String f92759d;

    /* renamed from: e */
    public final String f92760e;

    /* renamed from: f */
    private final TextView f92761f;

    /* renamed from: g */
    private final TextView f92762g;

    /* renamed from: h */
    private final TextView f92763h;

    public auxz(Context context, String str, String str2, String str3) {
        super(context);
        this.f92758c = str;
        this.f92759d = str2;
        this.f92760e = str3;
        View inflate = this.f92753a.getLayoutInflater().inflate((int) C0126R.C0128layout.auth_trusted_places_custom_places_menu_dialog_layout, (ViewGroup) null);
        setContentView(inflate);
        this.f92761f = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_custom_places_menu_delete_this_location);
        this.f92762g = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_custom_places_menu_rename_this_location);
        this.f92763h = (TextView) inflate.findViewById(C0126R.C0129id.trusted_places_custom_places_menu_edit_location_address);
        this.f92761f.setOnClickListener(new auxw(this));
        this.f92762g.setOnClickListener(new auxx(this));
        this.f92763h.setOnClickListener(new auxy(this));
    }
}
