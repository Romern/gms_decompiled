package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wso extends acm {

    /* renamed from: s */
    private final TextView f51255s;

    /* renamed from: t */
    private ImageView f51256t;

    public wso(View view) {
        super(view);
        if (cfoj.m141543X()) {
            this.f51255s = (TextView) view.findViewById(C0126R.C0129id.title);
            this.f51256t = (ImageView) view.findViewById(16908294);
            view.findViewById(C0126R.C0129id.description).setVisibility(8);
            return;
        }
        this.f51255s = (TextView) view.findViewById(C0126R.C0129id.name);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29357a(Bitmap bitmap) {
        if (cfoj.m141543X()) {
            this.f51256t.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29358a(String str) {
        this.f51255s.setText(str);
    }
}
