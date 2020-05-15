package p000;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aevq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevq extends aevz {

    /* renamed from: a */
    public int f63915a = C0126R.C0127drawable.quantum_ic_more_horiz_grey600_24;

    public aevq(aevy aevy) {
        super(null, aevy);
    }

    /* renamed from: a */
    public final void mo34615a(Context context, TextView textView, ImageView imageView) {
        imageView.setImageResource(this.f63915a);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackgroundResource(C0126R.C0127drawable.location_sharing_more_background);
        textView.setText((int) C0126R.string.common_more);
    }
}
