package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: apwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apwv extends sva {

    /* renamed from: t */
    public static final /* synthetic */ int f85026t = 0;

    /* renamed from: u */
    private final LinearLayout f85027u;

    /* renamed from: v */
    private final TextView f85028v;

    /* renamed from: w */
    private final TextView f85029w;

    /* renamed from: x */
    private final TextView f85030x;

    public apwv(View view) {
        super(view);
        this.f85027u = (LinearLayout) view.findViewById(C0126R.C0129id.app_icons);
        this.f85028v = (TextView) view.findViewById(16908310);
        this.f85029w = (TextView) view.findViewById(16908304);
        this.f85030x = (TextView) view.findViewById(C0126R.C0129id.app_count);
        view.setFocusable(true);
    }

    /* renamed from: a */
    private static void m71124a(View view, int i) {
        view.animate().alpha(1.0f).setDuration(300).setStartDelay((long) (i * 149));
    }

    /* renamed from: a */
    private static void m71125a(TextView textView, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        int i;
        int i2;
        Context context;
        svc svc2 = svc;
        if (svc2 instanceof apww) {
            apww apww = (apww) svc2;
            m71125a(this.f85028v, apww.f45211f);
            m71125a(this.f85029w, apww.f85033c);
            Context context2 = apww.f85031a;
            List list = apww.f85034l;
            boolean z = apww.f85035m;
            int childCount = this.f85027u.getChildCount();
            int i3 = 0;
            if (childCount > 1) {
                this.f85027u.removeViews(0, childCount - 1);
            }
            this.f85030x.setVisibility(8);
            if (list != null && !list.isEmpty()) {
                Resources resources = context2.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.verify_apps_icon_size);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C0126R.dimen.scanned_apps_icon_spacing);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(C0126R.dimen.scanned_apps_fallback_padding);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i4 = displayMetrics.widthPixels;
                int i5 = Build.VERSION.SDK_INT;
                try {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(16843709, typedValue, true);
                    i = (int) typedValue.getDimension(displayMetrics);
                } catch (Exception e) {
                    i = dimensionPixelSize3;
                }
                int i6 = Build.VERSION.SDK_INT;
                try {
                    TypedValue typedValue2 = new TypedValue();
                    context2.getTheme().resolveAttribute(16843710, typedValue2, true);
                    dimensionPixelSize3 = (int) typedValue2.getDimension(displayMetrics);
                } catch (Exception e2) {
                }
                int i7 = i4 - (i + dimensionPixelSize3);
                int i8 = dimensionPixelSize + dimensionPixelSize2;
                int i9 = (i7 + dimensionPixelSize2) / i8;
                if (i9 <= 0) {
                    i9 = 1;
                }
                int size = list.size();
                if (size > i9) {
                    this.f85030x.setText(context2.getString(C0126R.string.verify_apps_more_scanned_apps, Integer.valueOf(size - (i9 - 2))));
                    this.f85030x.setVisibility(0);
                    this.f85030x.setAlpha(!z ? 1.0f : 0.0f);
                    this.f85030x.measure(0, 0);
                    i2 = (i7 - this.f85030x.getMeasuredWidth()) / i8;
                    if (i2 <= 0) {
                        i2 = 1;
                    }
                    this.f85030x.setText(context2.getString(C0126R.string.verify_apps_more_scanned_apps, Integer.valueOf(size - i2)));
                } else {
                    i2 = size;
                }
                PackageManager packageManager = context2.getPackageManager();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.setMargins(0, 0, dimensionPixelSize2, 0);
                int i10 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(dimensionPixelSize2);
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    String str = (String) list.get(i11);
                    if (i3 >= i2) {
                        break;
                    }
                    try {
                        Drawable applicationIcon = packageManager.getApplicationIcon(str);
                        if (applicationIcon == null) {
                            context = context2;
                        } else {
                            ImageView imageView = new ImageView(context2);
                            context = context2;
                            try {
                                imageView.setContentDescription(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)));
                            } catch (Exception e3) {
                            }
                            imageView.setImageDrawable(applicationIcon);
                            int i12 = i3 + 1;
                            if (i12 == i2 && i2 == size) {
                                imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                            } else {
                                imageView.setLayoutParams(layoutParams);
                            }
                            if (z) {
                                imageView.setAlpha(0.0f);
                            }
                            this.f85027u.addView(imageView, i3);
                            if (z) {
                                m71124a(imageView, i12);
                            }
                            i3 = i12;
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        context = context2;
                    }
                    i11++;
                    context2 = context;
                }
                if (z) {
                    m71124a(this.f85030x, i2 + 1);
                }
            }
            apww.f85035m = false;
            this.f85027u.setOnTouchListener(new apwt(apww));
            this.f85030x.setOnTouchListener(new apwu(apww));
            return;
        }
        throw new IllegalArgumentException("settingItem must be ScannedAppsSettingItem");
    }
}
