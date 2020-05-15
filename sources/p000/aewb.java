package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aewb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aewb extends acm {

    /* renamed from: u */
    public aevz f63931u;

    /* renamed from: v */
    public final TextView f63932v;

    /* renamed from: w */
    public final ImageView f63933w;

    public aewb(View view) {
        super(view);
        this.f63932v = (TextView) view.findViewById(C0126R.C0129id.share_item_label);
        this.f63933w = (ImageView) view.findViewById(C0126R.C0129id.share_item_icon);
    }

    /* renamed from: a */
    public void mo34617a(Context context, aevz aevz) {
        this.f63931u = aevz;
        aevz.mo34615a(context, this.f63932v, this.f63933w);
        this.f201a.setOnClickListener(new aewa(aevz));
    }
}
