package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;

/* renamed from: tpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tpl extends acm {

    /* renamed from: s */
    final View f46448s;

    /* renamed from: t */
    final FadeInImageView f46449t;

    /* renamed from: u */
    final ImageView f46450u;

    /* renamed from: v */
    final TextView f46451v;

    public tpl(View view) {
        super(view);
        this.f46448s = view.findViewById(C0126R.C0129id.blacklist_item_separator);
        this.f46449t = (FadeInImageView) view.findViewById(C0126R.C0129id.icon);
        this.f46450u = (ImageView) view.findViewById(C0126R.C0129id.delete_button);
        this.f46451v = (TextView) view.findViewById(C0126R.C0129id.text1);
    }
}
