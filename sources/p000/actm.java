package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: actm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class actm {

    /* renamed from: a */
    public final TextView f60750a;

    /* renamed from: b */
    public final TextView f60751b;

    /* renamed from: c */
    public final ImageView f60752c;

    /* renamed from: d */
    public final Context f60753d;

    public actm(Context context, View view) {
        this.f60753d = context;
        this.f60750a = (TextView) view.findViewById(C0126R.C0129id.app_name);
        this.f60751b = (TextView) view.findViewById(C0126R.C0129id.app_size);
        this.f60752c = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
    }
}
