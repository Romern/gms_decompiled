package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import java.util.List;

/* renamed from: evi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evi {
    /* renamed from: a */
    private static int m11169a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 5 ? C0126R.style.AsStyledTextAppearanceDescription : C0126R.style.AsStyledTextAppearanceCaption : C0126R.style.AsStyledTextAppearanceStatus : C0126R.style.AsStyledTextAppearanceTitle : C0126R.style.AsStyledTextAppearanceLabel;
    }

    /* renamed from: b */
    public static void m11188b(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.bottomMargin = i;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static int m11170a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m11171a(bzrt bzrt) {
        bxva bxva = bzrt.f171200d;
        if (bxva != null) {
            return Color.argb(Math.round(bxva.f164944a * 255.0f), Math.round(bzrt.f171197a * 255.0f), Math.round(bzrt.f171198b * 255.0f), Math.round(bzrt.f171199c * 255.0f));
        }
        return Color.rgb(Math.round(bzrt.f171197a * 255.0f), Math.round(bzrt.f171198b * 255.0f), Math.round(bzrt.f171199c * 255.0f));
    }

    /* renamed from: b */
    public static boolean m11189b(Context context) {
        Resources resources = context.getResources();
        return m11170a(resources.getConfiguration().screenHeightDp, context) >= resources.getDimensionPixelSize(C0126R.dimen.as_expanded_header_min_screen_height);
    }

    /* renamed from: a */
    public static void m11172a() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m11173a(Drawable drawable, bzrt bzrt) {
        if (drawable != null && bzrt != null) {
            int i = Build.VERSION.SDK_INT;
            int a = m11171a(bzrt);
            int i2 = Build.VERSION.SDK_INT;
            C1173lt.m19599a(drawable, a);
        }
    }

    /* renamed from: a */
    public static void m11174a(View view, bsxn bsxn, evl evl) {
        if (bsxn != null && bsxn.f147589b != 0) {
            view.setOnClickListener(new evg(evl, bsxn));
            view.setClickable(true);
            view.setFocusable(true);
        } else if (C1280ps.m19872G(view)) {
            view.setOnClickListener(null);
            view.setClickable(false);
            view.setFocusable(false);
        }
    }

    /* renamed from: a */
    public static void m11175a(View view, bsxn bsxn, evl evl, int i) {
        if (bsxn != null && bsxn.f147589b != 0) {
            view.setOnClickListener(new evh(evl, bsxn));
            view.setClickable(true);
            view.setFocusable(true);
            C1280ps.m19890a(view, C1133kh.m17836a(view.getContext(), i));
        } else if (C1280ps.m19872G(view)) {
            view.setOnClickListener(null);
            view.setBackgroundResource(0);
            view.setClickable(false);
            view.setFocusable(false);
        }
    }

    /* renamed from: a */
    public static void m11176a(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        linearLayout.getContext();
        m11172a();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (m11187a(linearLayout.getContext())) {
                    layoutParams.leftMargin = i;
                } else {
                    layoutParams.rightMargin = i;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m11177a(ProgressBar progressBar, bzrt bzrt, bzrt bzrt2) {
        Drawable drawable;
        Drawable mutate = progressBar.getContext().getResources().getDrawable(adyg.m51399a(progressBar.getContext(), (int) C0126R.attr.asProgressDrawable, (int) C0126R.C0127drawable.as_progress_drawable_light)).mutate();
        Drawable drawable2 = null;
        if (mutate instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) mutate;
            if (layerDrawable.getNumberOfLayers() == 2) {
                Drawable mutate2 = layerDrawable.getDrawable(0).mutate();
                drawable2 = layerDrawable.getDrawable(1).mutate();
                drawable = mutate2;
                m11173a(drawable2, bzrt);
                m11173a(drawable, bzrt2);
                Rect bounds = progressBar.getProgressDrawable().getBounds();
                progressBar.setProgressDrawable(mutate);
                progressBar.getProgressDrawable().setBounds(bounds);
            }
        }
        drawable = null;
        m11173a(drawable2, bzrt);
        m11173a(drawable, bzrt2);
        Rect bounds2 = progressBar.getProgressDrawable().getBounds();
        progressBar.setProgressDrawable(mutate);
        progressBar.getProgressDrawable().setBounds(bounds2);
    }

    /* renamed from: a */
    public static void m11178a(TextView textView, int i) {
        int a = m11169a(i);
        C1334rs.m20104a(textView, a);
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(a, eoi.f15390b);
        textView.setLineSpacing((float) obtainStyledAttributes.getDimensionPixelSize(1, 0), textView.getLineSpacingMultiplier());
        textView.setMinHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static void m11179a(TextView textView, bzrt bzrt) {
        if (bzrt != null) {
            textView.setTextColor(m11171a(bzrt));
        }
    }

    /* renamed from: a */
    public static void m11180a(TextView textView, String str) {
        if (!bmxx.m108577a(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public static void m11181a(TextView textView, String str, bsxn bsxn, evl evl) {
        if (bmxx.m108577a(str)) {
            textView.setClickable(false);
            textView.setFocusable(false);
            return;
        }
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(adyg.m51405b(textView.getContext(), C0126R.attr.colorPrimaryGoogle, C0126R.color.google_blue600)), length, str.length() + length, 33);
        textView.setOnClickListener(new evf(evl, bsxn));
        textView.setText(spannableStringBuilder);
        textView.setFocusable(true);
        textView.setClickable(true);
    }

    /* renamed from: a */
    public static void m11182a(TextView textView, String str, bzrt bzrt) {
        if (!bmxx.m108577a(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            m11179a(textView, bzrt);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static void m11183a(fgt fgt, LinearLayout linearLayout, List list) {
        boolean z;
        bzrt bzrt;
        Context context = linearLayout.getContext();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        boolean z2 = true;
        while (i < size) {
            bsyc bsyc = (bsyc) list.get(i);
            View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.as_card_styled_text_entry, (ViewGroup) linearLayout, false);
            FadeInImageView fadeInImageView = (FadeInImageView) inflate.findViewById(C0126R.C0129id.icon);
            if ((bsyc.f147654a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            bswh bswh = bsyc.f147657d;
            if (bswh == null) {
                bswh = bswh.f147430g;
            }
            m11184a(fgt, fadeInImageView, z, bswh);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.text);
            int a = bsyk.m116313a(bsyc.f147658e);
            if (a == 0) {
                a = 1;
            }
            m11178a(textView, a);
            m11180a(textView, bsyc.f147655b);
            if ((bsyc.f147654a & 2) != 0) {
                bzrt = bsyc.f147656c;
                if (bzrt == null) {
                    bzrt = bzrt.f171195e;
                }
            } else {
                bzrt = null;
            }
            m11179a(textView, bzrt);
            if ((bsyc.f147654a & 16) != 0) {
                bsyl bsyl = bsyc.f147659f;
                if (bsyl == null) {
                    bsyl = bsyl.f147684b;
                }
                if (bsyl.f147686a != 0) {
                    bsyl bsyl2 = bsyc.f147659f;
                    if (bsyl2 == null) {
                        bsyl2 = bsyl.f147684b;
                    }
                    textView.setMaxLines(bsyl2.f147686a);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            int a2 = bsyk.m116313a(bsyc.f147658e);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = m11169a(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            if (a3 != i2 && !z2) {
                layoutParams.setMargins(0, context.getResources().getDimensionPixelOffset(C0126R.dimen.as_styled_text_entry_vertical_margin), 0, 0);
            }
            inflate.setLayoutParams(layoutParams);
            linearLayout.addView(inflate);
            i++;
            i2 = a3;
            z2 = false;
        }
    }

    /* renamed from: a */
    public static void m11184a(fgt fgt, FadeInImageView fadeInImageView, boolean z, bswh bswh) {
        m11185a(fgt, fadeInImageView, z, bswh, -1);
    }

    /* renamed from: a */
    public static void m11185a(fgt fgt, FadeInImageView fadeInImageView, boolean z, bswh bswh, int i) {
        m11186a(fgt, fadeInImageView, z, bswh, i, 0.0f);
    }

    /* renamed from: a */
    public static void m11186a(fgt fgt, FadeInImageView fadeInImageView, boolean z, bswh bswh, int i, float f) {
        Drawable drawable;
        if (z && bswh != null) {
            DisplayMetrics displayMetrics = fadeInImageView.getContext().getResources().getDisplayMetrics();
            int i2 = bswh.f147435d;
            if (!(i2 == 0 || bswh.f147436e == 0)) {
                float f2 = f + f;
                int round = Math.round(TypedValue.applyDimension(1, (float) i2, displayMetrics) + f2);
                int round2 = Math.round(TypedValue.applyDimension(1, (float) bswh.f147436e, displayMetrics) + f2);
                ViewGroup.LayoutParams layoutParams = fadeInImageView.getLayoutParams();
                layoutParams.width = round;
                layoutParams.height = round2;
                if (i > 0) {
                    layoutParams.width = Math.min(layoutParams.width, i);
                    layoutParams.height = (int) (((float) layoutParams.height) * (((float) layoutParams.width) / ((float) round)));
                }
                fadeInImageView.setLayoutParams(layoutParams);
            }
            bswg a = bswg.m116252a(bswh.f147433b);
            if (!(a == null || eve.m11166a(fadeInImageView.getContext(), a) == 0)) {
                fadeInImageView.setImageResource(eve.m11166a(fadeInImageView.getContext(), a));
                if (cbro.m128200d() && (drawable = fadeInImageView.getDrawable()) != null) {
                    C1173lt.m19605a(drawable, eve.m11167a(a));
                }
            }
            if ((bswh.f147432a & 2) != 0) {
                fgt.mo10805a(bswh.f147434c, new evb(fadeInImageView));
            }
            if (f > 0.0f) {
                int round3 = Math.round(f);
                fadeInImageView.setPadding(round3, round3, round3, round3);
            }
            fadeInImageView.setContentDescription(bswh.f147437f);
            fadeInImageView.setVisibility(0);
            return;
        }
        fadeInImageView.setVisibility(8);
    }

    /* renamed from: a */
    public static boolean m11187a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
