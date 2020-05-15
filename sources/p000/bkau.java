package p000;

import android.app.Dialog;
import android.content.res.TypedArray;
import android.support.p002v7.widget.AppCompatImageView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import java.util.List;

/* renamed from: bkau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkau extends bkbq implements View.OnClickListener {

    /* renamed from: a */
    FlexboxLayout f123901a;

    /* renamed from: b */
    Button f123902b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final Dialog mo9306a() {
        Dialog dialog;
        ImageView imageView;
        List b = bjvp.m104742b(getArguments(), "keyLogosToDisplay", (bxxk) bmno.f130138m.mo74142c(7));
        LinearLayout linearLayout = (LinearLayout) mo65816c().inflate((int) C0126R.C0128layout.view_card_logo_grid_dialog, (ViewGroup) null, false);
        this.f123901a = (FlexboxLayout) linearLayout.findViewById(C0126R.C0129id.card_logo_grid);
        ContextThemeWrapper b2 = mo65815b();
        int dimensionPixelSize = b2.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_large_credit_card_icon_width);
        int dimensionPixelSize2 = b2.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_large_credit_card_icon_height);
        int dimensionPixelSize3 = b2.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_card_logo_grid_spacing);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            bmno bmno = (bmno) b.get(i);
            if (bjvn.m104718a(bmno.f130142c)) {
                imageView = new AppCompatImageView(b2);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                imageView = new ImageWithCaptionView(b2);
            }
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
            layoutParams.setMargins(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            imageView.setLayoutParams(layoutParams);
            if (imageView instanceof ImageWithCaptionView) {
                ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) imageView;
                imageWithCaptionView.mo71992a(bmno, bjvn.m104721b(b2.getApplicationContext()), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                imageWithCaptionView.mo71888a();
            } else {
                imageView.setImageResource(bkfr.m105586b(b2, bmno.f130142c));
            }
            this.f123901a.addView(imageView);
        }
        Button button = (Button) linearLayout.findViewById(C0126R.C0129id.close_button);
        this.f123902b = button;
        button.setOnClickListener(this);
        TypedArray obtainStyledAttributes = mo65815b().obtainStyledAttributes(new int[]{C0126R.attr.internalUicIsAppCompat});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            dialog = new C1374te(mo65815b(), 0);
        } else {
            dialog = new Dialog(mo65815b());
        }
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        return dialog;
    }

    public void onClick(View view) {
        if (view == this.f123902b) {
            dismiss();
        }
    }
}
