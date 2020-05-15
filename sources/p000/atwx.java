package p000;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.tapandpay.p068ui.TokenizationSuccessChimeraActivity;

/* renamed from: atwx */
public final /* synthetic */ class atwx implements View.OnLayoutChangeListener {

    /* renamed from: a */
    private final TokenizationSuccessChimeraActivity f91065a;

    public atwx(TokenizationSuccessChimeraActivity tokenizationSuccessChimeraActivity) {
        this.f91065a = tokenizationSuccessChimeraActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        TokenizationSuccessChimeraActivity tokenizationSuccessChimeraActivity = this.f91065a;
        ImageView imageView = tokenizationSuccessChimeraActivity.f108963b;
        if (!tokenizationSuccessChimeraActivity.f108964c.canScrollVertically(1)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        imageView.setVisibility(i9);
    }
}
