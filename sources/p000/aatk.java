package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: aatk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatk extends TextView implements View.OnClickListener {

    /* renamed from: a */
    private final Context f56546a;

    /* renamed from: b */
    private final bzqi f56547b;

    /* renamed from: c */
    private final aauj f56548c;

    public aatk(Context context, bzqi bzqi, aauj aauj) {
        super(context);
        this.f56546a = context;
        this.f56547b = bzqi;
        this.f56548c = aauj;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_vertical_padding), 0, 0);
        setLayoutParams(layoutParams);
        setText(context.getString(C0126R.string.gh_cuf_add_additional));
        setTextColor(context.getResources().getColor(C0126R.color.material_google_blue_500));
        setOnClickListener(this);
    }

    public void onClick(View view) {
        aauh aauh = new aauh(this.f56546a, null, this.f56547b, this.f56548c, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        aauh.setLayoutParams(layoutParams);
        aauj aauj = this.f56548c;
        ImageView imageView = new ImageView(aauj.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(C0126R.C0127drawable.gh_search_clear);
        LinearLayout linearLayout = new LinearLayout(aauj.getContext());
        linearLayout.addView(aauh);
        linearLayout.addView(imageView);
        aauj.addView(linearLayout, aauj.getChildCount() - 1);
        imageView.setContentDescription(imageView.getContext().getString(C0126R.string.common_ui_confirm_deleting_button));
        imageView.setOnClickListener(new aaui(aauj, aauh, linearLayout));
        if (aauj.f56604b == null) {
            aauj.f56604b = new ArrayList();
        }
        aauj.f56604b.add(aauh);
        aauh.requestFocus();
        aauj.mo31803a();
    }
}
