package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;

/* renamed from: tsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsu extends acm {

    /* renamed from: s */
    final View f46608s;

    /* renamed from: t */
    final FadeInImageView f46609t;

    /* renamed from: u */
    final TextView f46610u;

    /* renamed from: v */
    final TextView f46611v;

    public tsu(View view) {
        super(view);
        this.f46608s = view.findViewById(C0126R.C0129id.password_list_item_separator);
        this.f46609t = (FadeInImageView) view.findViewById(16908295);
        ImageView imageView = (ImageView) view.findViewById(16908296);
        this.f46610u = (TextView) view.findViewById(16908308);
        this.f46611v = (TextView) view.findViewById(16908309);
    }
}
