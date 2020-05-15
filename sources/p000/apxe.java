package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxe extends svj {

    /* renamed from: A */
    private final TextView f85042A;

    /* renamed from: B */
    private final TextView f85043B;

    /* renamed from: C */
    private final TextView f85044C;

    /* renamed from: D */
    private final ImageView f85045D;

    /* renamed from: E */
    private final ProgressBar f85046E;

    /* renamed from: y */
    private final ImageView f85047y;

    /* renamed from: z */
    private final ImageView f85048z;

    public apxe(View view) {
        super(view);
        this.f85047y = (ImageView) view.findViewById(C0126R.C0129id.top_icon);
        this.f85048z = (ImageView) view.findViewById(C0126R.C0129id.button_icon);
        this.f85042A = (TextView) view.findViewById(C0126R.C0129id.description);
        this.f85043B = (TextView) view.findViewById(C0126R.C0129id.action_link);
        this.f85044C = (TextView) view.findViewById(C0126R.C0129id.more_details);
        this.f85045D = (ImageView) view.findViewById(C0126R.C0129id.more_or_less_icon);
        this.f85046E = (ProgressBar) view.findViewById(C0126R.C0129id.loading_spinner);
        ((TextView) view.findViewById(16908310)).setSingleLine(false);
        view.findViewById(C0126R.C0129id.simple_setting).setBackgroundResource(0);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageView.getLayoutParams());
        layoutParams.width = view.getResources().getDimensionPixelSize(C0126R.dimen.verify_apps_icon_size);
        layoutParams.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        CharSequence charSequence;
        int i;
        apxb apxb;
        apxc apxc;
        apxg apxg = (apxg) svc;
        super.mo23819a((svc) apxg);
        apxd apxd = null;
        svj.m36444a(null, this.f85047y, apxg.f85051b);
        svj.m36444a(null, this.f85048z, apxg.f85052c);
        svj.m36445a(this.f85042A, apxg.f85055n);
        boolean z = true;
        if (apxg.f85057p != null && !apxg.f85058q) {
            z = false;
        }
        svj.m36445a(this.f85043B, z ? apxg.f85056o : null);
        TextView textView = this.f85044C;
        if (apxg.f85058q) {
            charSequence = apxg.f85057p;
        } else {
            charSequence = null;
        }
        svj.m36445a(textView, charSequence);
        ProgressBar progressBar = this.f85046E;
        if (!apxg.f85059r) {
            i = 8;
        } else {
            i = 0;
        }
        progressBar.setVisibility(i);
        if (apxg.f85052c != null) {
            apxb = new apxb(apxg);
        } else {
            apxb = null;
        }
        this.f85048z.setOnClickListener(apxb);
        if (apxg.f85056o != null) {
            apxc = new apxc(apxg);
        } else {
            apxc = null;
        }
        this.f85043B.setOnClickListener(apxc);
        Drawable drawable = apxg.f85057p != null ? apxg.f85058q ? apxg.f85053l : apxg.f85054m : null;
        svj.m36444a(null, this.f85045D, drawable);
        if (drawable != null) {
            apxd = new apxd(apxg);
        }
        this.f201a.setOnClickListener(apxd);
        if (apxd == null) {
            this.f201a.setClickable(false);
        }
    }
}
