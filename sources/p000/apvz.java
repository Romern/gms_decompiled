package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apvz extends svj {
    public apvz(View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int dimension = (int) view.getResources().getDimension(C0126R.dimen.info_icon_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0126R.C0129id.icon_frame);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(linearLayout.getLayoutParams());
        layoutParams2.gravity = 49;
        linearLayout.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        super.mo23819a((svc) ((apwb) svc));
        this.f201a.setClickable(false);
    }
}
