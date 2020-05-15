package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: hdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hdp extends hdo {

    /* renamed from: s */
    final TextView f19541s;

    public hdp(View view, Bitmap bitmap) {
        super(view);
        this.f19541s = (TextView) view.findViewById(C0126R.C0129id.subtitle);
        ((ImageView) view.findViewById(C0126R.C0129id.app_icon)).setImageBitmap(bitmap);
    }

    /* renamed from: a */
    public final void mo12410a(aczd aczd, aczm aczm) {
        this.f19541s.setText(aczd.f61129c);
    }
}
