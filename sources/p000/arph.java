package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: arph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arph extends Fragment {

    /* renamed from: a */
    public int f88070a;

    /* renamed from: b */
    public int f88071b;

    /* renamed from: c */
    private int f88072c;

    /* renamed from: d */
    private boolean f88073d;

    /* renamed from: e */
    private boolean f88074e;

    /* renamed from: f */
    private boolean f88075f;

    /* renamed from: g */
    private arok f88076g;

    /* renamed from: a */
    private static final void m73262a(Bundle bundle, TextView textView, String str) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(4);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof arok) {
            this.f88076g = (arok) parentFragment;
        } else if (activity instanceof arok) {
            this.f88076g = (arok) activity;
        } else {
            throw new RuntimeException("Parent fragment or activity must implement ActionListener.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88070a = arguments.getInt("primaryActionId");
            this.f88071b = arguments.getInt("secondaryActionId");
            this.f88072c = arguments.getInt("illustrationResId");
            this.f88073d = arguments.getBoolean("adjustIllustrationBounds", false);
            this.f88074e = arguments.getBoolean("progressBarEnabled");
            this.f88075f = arguments.getBoolean("magicWand");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!this.f88075f) {
            i = C0126R.C0128layout.smartdevice_d2d_target_glif_fragment;
        } else {
            i = C0126R.C0128layout.magicwand_target_glif_fragment;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        if (!this.f88075f) {
            biyn biyn = (biyn) glifLayout.mo71342a(biyn.class);
            biyo biyo = new biyo(glifLayout.getContext());
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            biyp a = biyo.mo64882a();
            biyo biyo2 = new biyo(glifLayout.getContext());
            biyo2.f122328c = 7;
            biyo2.f122329d = 2132018230;
            biyp a2 = biyo2.mo64882a();
            biyn.mo52733a(a);
            biyn.mo52735b(a2);
        }
        return glifLayout;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GlifLayout glifLayout = (GlifLayout) view.findViewById(C0126R.C0129id.glif_layout);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        int i = arguments.getInt("iconResId");
        Activity activity = getActivity();
        if (i >= 0 && activity != null) {
            glifLayout.mo71362a(C1133kh.m17836a(activity, i));
        }
        String string = arguments.getString("title");
        if (!TextUtils.isEmpty(string)) {
            glifLayout.mo71363a(string);
        }
        boolean z = arguments.getBoolean("description_html");
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.description);
        String string2 = arguments.getString("description");
        CharSequence charSequence = string2;
        if (string2 != null) {
            if (z) {
                charSequence = Html.fromHtml(string2);
            }
            textView.setText(charSequence);
        }
        m73262a(arguments, (TextView) view.findViewById(C0126R.C0129id.body), "body");
        arpe arpe = new arpe(this);
        arpf arpf = new arpf(this);
        if (this.f88075f) {
            TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.primary_action);
            if (this.f88070a != 0) {
                textView2.setOnClickListener(arpe);
            }
            TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.secondary_action);
            if (this.f88071b != 0) {
                textView3.setOnClickListener(arpf);
            }
            m73262a(arguments, textView2, "primaryActionText");
            m73262a(arguments, textView3, "secondaryActionText");
        } else {
            biyn biyn = (biyn) glifLayout.mo71342a(biyn.class);
            if (this.f88070a != 0) {
                biyn.f122314f.f122336f = arpe;
            }
            if (this.f88071b != 0) {
                biyn.f122315g.f122336f = arpf;
            }
            m73263a(arguments, biyn.f122314f, "primaryActionText");
            m73263a(arguments, biyn.f122315g, "secondaryActionText");
        }
        String string3 = arguments.getString("bodyHtml");
        if (!TextUtils.isEmpty(string3)) {
            TextView textView4 = (TextView) view.findViewById(C0126R.C0129id.body);
            textView4.setText(Html.fromHtml(string3));
            textView4.setVisibility(0);
        }
        View findViewById = view.findViewById(C0126R.C0129id.illustration_container);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.illustration);
        if (imageView != null) {
            int i2 = this.f88072c;
            if (i2 > 0) {
                imageView.setImageResource(i2);
                imageView.setAdjustViewBounds(this.f88073d);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                if (this.f88073d) {
                    layoutParams.gravity = 81;
                } else {
                    layoutParams.gravity = 17;
                }
                findViewById.setVisibility(0);
                glifLayout.findViewById(C0126R.C0129id.body).setVisibility(8);
                glifLayout.findViewById(C0126R.C0129id.bold_centered_body).setVisibility(8);
            } else {
                findViewById.setVisibility(8);
            }
            if (this.f88074e) {
                glifLayout.mo71364b(true);
            } else {
                glifLayout.mo71364b(false);
            }
            if (activity != null) {
                asbr.m73757a(activity.getContainerActivity(), string);
            }
        }
    }

    /* renamed from: a */
    private static final void m73263a(Bundle bundle, biyp biyp, String str) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            biyp.mo64887a((CharSequence) string);
            biyp.mo64885a(0);
            return;
        }
        biyp.mo64885a(4);
    }

    /* renamed from: a */
    public final void mo48736a(int i) {
        this.f88076g.mo48707b(i, Bundle.EMPTY);
    }
}
