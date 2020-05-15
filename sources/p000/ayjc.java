package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ayjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayjc {

    /* renamed from: a */
    public final TextView f97747a;

    /* renamed from: b */
    public final TextView f97748b;

    /* renamed from: c */
    public final ImageView f97749c;

    /* renamed from: d */
    public final Context f97750d;

    public ayjc(Context context, View view) {
        this.f97750d = context;
        this.f97747a = (TextView) view.findViewById(C0126R.C0129id.app_name);
        this.f97748b = (TextView) view.findViewById(C0126R.C0129id.app_size);
        this.f97749c = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
    }
}
