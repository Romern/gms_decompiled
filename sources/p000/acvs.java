package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: acvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvs {

    /* renamed from: a */
    public final TextView f60919a;

    /* renamed from: b */
    public final TextView f60920b;

    /* renamed from: c */
    public final ImageView f60921c;

    public acvs(View view) {
        this.f60919a = (TextView) view.findViewById(C0126R.C0129id.app_name);
        this.f60920b = (TextView) view.findViewById(C0126R.C0129id.app_package_name);
        this.f60921c = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
    }
}
