package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.InfoMessageWithImageAndText;
import com.google.android.wallet.p097ui.common.WebViewLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: bkfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfr {

    /* renamed from: a */
    static final SparseIntArray f124159a;

    /* renamed from: b */
    private static final Interpolator f124160b = new AccelerateDecelerateInterpolator();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(67);
        f124159a = sparseIntArray;
        sparseIntArray.put(1, C0126R.attr.internalUicCreditCardAmexLogoDrawable);
        f124159a.put(2, C0126R.attr.internalUicCreditCardDiscoverLogoDrawable);
        f124159a.put(3, C0126R.attr.internalUicCreditCardJcbLogoDrawable);
        f124159a.put(4, C0126R.attr.internalUicCreditCardMastercardLogoDrawable);
        f124159a.put(5, C0126R.attr.internalUicCreditCardVisaLogoDrawable);
        f124159a.put(6, C0126R.attr.internalUicCreditCardDinersClubLogoDrawable);
        f124159a.put(15, C0126R.attr.internalUicCreditCardEloLogoDrawable);
        f124159a.put(25, C0126R.attr.internalUicCreditCardCartesBancairesLogoDrawable);
        f124159a.put(21, C0126R.attr.internalUicCreditCardUnknownLogoDrawable);
        f124159a.put(13, C0126R.attr.internalUicCreditCardCvcFrontDrawable);
        f124159a.put(14, C0126R.attr.internalUicCreditCardCvcBackDrawable);
        f124159a.put(34, C0126R.attr.internalUicCreditCardCvcFrontLargeDrawable);
        f124159a.put(35, C0126R.attr.internalUicCreditCardCvcBackLargeDrawable);
        f124159a.put(45, C0126R.attr.internalUicCarrierBillingDrawable);
        f124159a.put(337, C0126R.attr.internalUicCarrierBillingPhoenixPhoneDrawable);
        f124159a.put(26, C0126R.attr.internalUicPaypalLightDrawable);
        f124159a.put(342, C0126R.attr.internalUicPaypalLogoFullDrawable);
        f124159a.put(343, C0126R.attr.internalUicPaypalAccountLinkingAnimationDrawable);
        f124159a.put(344, C0126R.attr.internalUicCheckMarkAnimationDrawable);
        f124159a.put(149, C0126R.attr.internalUicAndroidPayAcceptanceMarkIconDrawable);
        f124159a.put(331, C0126R.attr.internalUicGoogleGLogoDrawable);
        f124159a.put(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, C0126R.attr.internalUicGoogleLogoHeroImageDrawable);
        f124159a.put(316, C0126R.attr.internalUicGoogleLogoColorHeroImageDrawable);
        f124159a.put(330, C0126R.attr.internalUicGPayLogoDrawable);
        f124159a.put(328, C0126R.attr.internalUicGPayPaypalHeroImageDrawable);
        f124159a.put(329, C0126R.attr.internalUicGPayVisaCheckoutHeroImageDrawable);
        f124159a.put(296, C0126R.attr.internalUicNfcIconDrawable);
        f124159a.put(47, C0126R.attr.internalUicSectionIconTaxInformationDrawable);
        f124159a.put(63, C0126R.attr.internalUicSectionIconLocationDrawable);
        f124159a.put(98, C0126R.attr.internalUicSectionIconNumberDrawable);
        f124159a.put(111, C0126R.attr.internalUicSectionIconAccountDrawable);
        f124159a.put(118, C0126R.attr.internalUicSectionIconDateDrawable);
        f124159a.put(119, C0126R.attr.internalUicSectionIconBillingDrawable);
        f124159a.put(ErrorInfo.TYPE_SDU_FAILED, C0126R.attr.internalUicInfoIconDrawable);
        f124159a.put(345, C0126R.attr.internalUicInfoIconRedDrawable);
        f124159a.put(109, C0126R.attr.internalUicFilledInfoIconDrawable);
        f124159a.put(333, C0126R.attr.internalUicDeleteIconDrawable);
        f124159a.put(348, C0126R.attr.internalUicBackArrowIconDrawable);
        f124159a.put(120, C0126R.attr.internalUicShippingMethodGroundIconDrawable);
        f124159a.put(MfiClientException.TYPE_MFICLIENT_NOT_FOUND, C0126R.attr.internalUicFingerprintStartIconDrawable);
        f124159a.put(MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, C0126R.attr.internalUicFingerprintSuccessIconDrawable);
        f124159a.put(MfiClientException.TYPE_MFICLIENT_STARTED, C0126R.attr.internalUicFingerprintFailedIconDrawable);
        f124159a.put(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, C0126R.attr.internalUicEditModeIconDrawable);
        f124159a.put(MfiClientException.TYPE_NO_ACCOUNT_INFO, C0126R.attr.internalUicSampleAccountNumberUsDrawable);
        f124159a.put(MfiClientException.TYPE_CARD_NOT_CACHED, C0126R.attr.internalUicSampleRoutingNumberUsDrawable);
        f124159a.put(ErrorInfo.TYPE_SDU_MEMORY_FULL, C0126R.attr.internalUicYodleeLinkedDrawable);
        f124159a.put(128, C0126R.attr.internalUicPromoIconDrawable);
        f124159a.put(164, C0126R.attr.internalUicBankAccountIconDarkDrawable);
        f124159a.put(126, C0126R.attr.internalUicSectionIconBillingAccountDrawable);
        f124159a.put(127, C0126R.attr.internalUicCreditCardUnknownLogoDrawable);
        f124159a.put(287, C0126R.attr.internalUicSectionIconListDrawable);
        f124159a.put(102, C0126R.attr.internalUicSectionIconCountryDrawable);
        f124159a.put(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, C0126R.attr.internalUicSectionIconLanguageDrawable);
        f124159a.put(305, C0126R.attr.internalUicSectionIconKeyDrawable);
        f124159a.put(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, C0126R.attr.internalUicUserIconDrawable);
        f124159a.put(332, C0126R.attr.internalUicUserDefaultAvatarDrawable);
        f124159a.put(189, C0126R.attr.internalUicSectionIconPermissionDrawable);
        f124159a.put(MfiClientException.TYPE_MFICLIENT_NOT_STARTED, C0126R.attr.internalUicEmailIconDrawable);
        f124159a.put(62, C0126R.attr.internalUicWarningRedIconDrawable);
        f124159a.put(311, C0126R.attr.internalUicFilterListWhiteIconDrawable);
        f124159a.put(182, C0126R.attr.internalUicDriveFormIconDrawable);
        f124159a.put(125, C0126R.attr.internalUicSectionIconContactDetailsDrawable);
        f124159a.put(190, C0126R.attr.internalUicPaginationPreviousDrawable);
        f124159a.put(191, C0126R.attr.internalUicPaginationNextDrawable);
        f124159a.put(326, C0126R.attr.internalUicCircleDoneIconBlueDrawable);
        f124159a.put(48, C0126R.attr.internalUicSectionIconBusinessInformationDrawable);
        f124159a.put(339, C0126R.attr.internalUicAccessTimeIconDrawable);
    }

    /* renamed from: a */
    public static float m105541a(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: a */
    public static CharSequence m105553a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    /* renamed from: b */
    public static int m105586b(Context context, String str) {
        if (bjvn.m104718a(str)) {
            return m105543a(context, blxd.m107743a(bjvn.m104720b(str)), -1);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid embedded image URI: ") : "Invalid embedded image URI: ".concat(valueOf));
    }

    /* renamed from: c */
    public static int m105599c(int i) {
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 3;
        }
        if (i == 10001) {
            return 2;
        }
        if (i == 10009) {
            return 4;
        }
        switch (i) {
            case 10003:
            case 10005:
            case 10006:
                return 4;
            case 10004:
                return 2;
            case 10007:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static int m105604d(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 7:
                return 4;
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public static int m105609e(int i) {
        if (i == 3 || i == 4) {
            return 1;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            return i != 7 ? 0 : 4;
        }
        return 3;
    }

    /* renamed from: f */
    static int m105613f(Context context, int i) {
        int i2 = i - 1;
        int i3 = C0126R.attr.internalUicMarginTypeMedium;
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 9:
            case 12:
            case 15:
            case 18:
                return 0;
            case 2:
            case 4:
                i3 = C0126R.attr.internalUicMarginTypeExtraSmall;
                break;
            case 5:
            case 7:
                i3 = C0126R.attr.internalUicMarginTypeSmall;
                break;
            case 11:
            case 13:
                i3 = C0126R.attr.internalUicMarginTypeLarge;
                break;
            case 14:
            case 16:
                i3 = C0126R.attr.internalUicMarginTypeXLarge;
                break;
            case 17:
            case 19:
                i3 = C0126R.attr.internalUicMarginTypeXXLarge;
                break;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: f */
    public static boolean m105615f(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: g */
    public static boolean m105617g(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 21:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                case 47:
                case 48:
                case 63:
                case 98:
                case 102:
                case ErrorInfo.TYPE_SDU_FAILED:
                case 109:
                case 111:
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                case 118:
                case 119:
                case 120:
                case 125:
                case 126:
                case 127:
                case 128:
                case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                case 164:
                case 182:
                case 189:
                case 190:
                case 191:
                case 287:
                case 305:
                    return true;
                default:
                    return false;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: h */
    public static boolean m105620h(int i) {
        return i == 3 || i == 13;
    }

    /* renamed from: i */
    public static boolean m105623i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicUsePlayVisDreTheme});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: j */
    public static TextView m105624j(Context context) {
        TextView textView = new TextView(context);
        int[] iArr = {C0126R.attr.internalUicColorMaterialPrimaryText, C0126R.attr.uicDialogBodyStartEndMargin, C0126R.attr.uicDialogBodyTopBottomMargin, C0126R.attr.internalUicGoogleSansMediumFont};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicColorMaterialPrimaryText));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicDialogBodyStartEndMargin), 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicDialogBodyTopBottomMargin), 0);
        int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicGoogleSansMediumFont), C0126R.font.google_sans_medium);
        obtainStyledAttributes.recycle();
        textView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
        textView.setTypeface(C1163lk.m19265a(context, resourceId));
        textView.setTextSize(2, 18.0f);
        textView.setTextColor(colorStateList);
        return textView;
    }

    /* renamed from: k */
    public static int m105625k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicUrlLinkDisplayType});
        int integer = obtainStyledAttributes.getInteger(0, 1);
        obtainStyledAttributes.recycle();
        return integer;
    }

    /* renamed from: l */
    public static BitmapDrawable m105626l(Context context) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_ic_credit_card_black_36);
        return new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), Math.round(((float) bitmapDrawable.getIntrinsicWidth()) * 0.8888889f), Math.round(((float) bitmapDrawable.getIntrinsicHeight()) * 0.8888889f), true));
    }

    /* renamed from: c */
    public static ColorStateList m105600c(Context context) {
        return m105606d(context, (int) C0126R.attr.colorAccent);
    }

    /* renamed from: d */
    public static ColorStateList m105605d(Context context) {
        int color = context.getResources().getColor(17170443);
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{color, color});
    }

    /* renamed from: e */
    static int m105610e(Context context, int i) {
        int i2 = i - 1;
        int i3 = C0126R.attr.internalUicMarginTypeMedium;
        switch (i2) {
            case 1:
            case 4:
            case 7:
            case 10:
            case 13:
            case 16:
            case 19:
                return 0;
            case 2:
            case 3:
                i3 = C0126R.attr.internalUicMarginTypeExtraSmall;
                break;
            case 5:
            case 6:
                i3 = C0126R.attr.internalUicMarginTypeSmall;
                break;
            case 11:
            case 12:
                i3 = C0126R.attr.internalUicMarginTypeLarge;
                break;
            case 14:
            case 15:
                i3 = C0126R.attr.internalUicMarginTypeXLarge;
                break;
            case 17:
            case 18:
                i3 = C0126R.attr.internalUicMarginTypeXXLarge;
                break;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: f */
    public static bjtd m105614f(Context context) {
        if (context instanceof bjte) {
            return ((bjte) context).mo51884l();
        }
        if (!(context instanceof ContextThemeWrapper)) {
            return null;
        }
        return m105614f(((ContextThemeWrapper) context).getBaseContext());
    }

    /* renamed from: g */
    public static boolean m105618g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE")) {
            int i = Build.VERSION.SDK_INT;
            return true;
        } else if (!packageManager.hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE")) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m105621h(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicUseGoogleMaterial2Theme});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: a */
    public static int m105542a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: c */
    public static ColorStateList m105601c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* renamed from: d */
    public static ColorStateList m105606d(Context context, int i) {
        return m105587b(m105542a(context, i));
    }

    /* renamed from: e */
    public static void m105611e(View view) {
        if (view.isFocusable()) {
            View view2 = null;
            while (view2 == null && view != null) {
                view = view.focusSearch(2);
                if (view != null && view.isFocusableInTouchMode()) {
                    view2 = view;
                }
            }
            if (view2 == null) {
                return;
            }
            if (!bjvb.m104683a(view.getContext()) || bjvb.m104682a()) {
                view2.requestFocus();
            } else {
                view2.postDelayed(new bkfq(view2), 750);
            }
        }
    }

    /* renamed from: a */
    public static int m105543a(Context context, int i, int i2) {
        int i3;
        int i4;
        if (i != 0) {
            i3 = f124159a.get(i - 1, -1);
        } else {
            i = 0;
            i3 = -1;
        }
        if (i3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                return resourceId;
            }
            if (i2 != -1) {
                return i2;
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Theme does not contain the requested embedded image: ");
            sb.append(i - 1);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 != -1) {
            return i2;
        } else {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            if (i != 0) {
                i4 = i - 1;
            } else {
                i4 = 0;
            }
            objArr[0] = Integer.valueOf(i4);
            throw new IllegalArgumentException(String.format(locale, "Invalid embedded image ID: %d Default resource id also not set.", objArr));
        }
    }

    /* renamed from: b */
    public static ColorStateList m105587b(int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{(Math.round(((float) Color.alpha(i)) * 0.3f) << 24) | (16777215 & i), i});
    }

    /* renamed from: c */
    public static void m105602c(View view) {
        m105563a(view, 0);
    }

    /* renamed from: d */
    public static void m105607d(View view) {
        View findViewById = view.findViewById(C0126R.C0129id.focus_stealer);
        if (findViewById != null) {
            findViewById.requestFocus();
        } else {
            view.clearFocus();
        }
    }

    /* renamed from: f */
    public static boolean m105616f(View view) {
        return ((view instanceof TextView) || (view instanceof InfoMessageView)) && !(view instanceof Button) && !m105619g(view);
    }

    /* renamed from: g */
    public static boolean m105619g(View view) {
        return (view instanceof EditText) || ((view instanceof TextView) && ((TextView) view).isInputMethodTarget());
    }

    /* renamed from: h */
    private static boolean m105622h(View view) {
        if (view instanceof bkbm) {
            return true;
        }
        Integer num = (Integer) view.getTag(C0126R.C0129id.field_type);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static void m105603c(View view, boolean z) {
        if ((view instanceof EditText) && !view.hasFocus()) {
            view.setFocusable(z);
            view.setFocusableInTouchMode(z);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m105603c(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: b */
    public static ColorStateList m105588b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842808, C0126R.attr.colorAccent});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[]{16842908}, new int[]{16842912}, new int[]{16843518}, new int[0]}, new int[]{colorStateList.getColorForState(new int[]{-16842910}, -16777216), color, color, color, color, colorStateList.getDefaultColor()});
    }

    /* renamed from: d */
    public static void m105608d(View view, boolean z) {
        if (!(view instanceof ViewGroup) || (view instanceof InfoMessageView)) {
            view.setEnabled(z);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m105608d(viewGroup.getChildAt(i), z);
        }
    }

    /* renamed from: e */
    public static boolean m105612e(Context context) {
        return !m105580a(context, bmap.DISABLE_ANIMATIONS);
    }

    /* renamed from: a */
    public static int m105544a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        return i + view.getHeight();
    }

    /* renamed from: b */
    public static Drawable m105589b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return C1391tv.m20459b(context, resourceId);
    }

    /* renamed from: a */
    public static int m105545a(View view, View view2) {
        int top = view.getTop();
        while (view.getParent() != view2 && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    /* renamed from: b */
    public static SpannableString m105590b(String str) {
        Spanned fromHtml = Html.fromHtml(str);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        SpannableString spannableString = new SpannableString(fromHtml);
        Linkify.addLinks(spannableString, 15);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.setSpan(uRLSpan, fromHtml.getSpanStart(uRLSpan), fromHtml.getSpanEnd(uRLSpan), fromHtml.getSpanFlags(uRLSpan));
        }
        return spannableString;
    }

    /* renamed from: a */
    public static Intent m105546a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        return intent;
    }

    /* renamed from: a */
    public static Bitmap m105547a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float width = ((float) bitmap.getWidth()) * 0.035714287f;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static String m105591b(String str, String str2) {
        return String.format(Locale.US, "id: %s - %s", str, str2);
    }

    /* renamed from: b */
    public static void m105592b() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public static void m105593b(Context context, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, 1.0f);
        ofFloat.setInterpolator(new bkfo(context.getResources().getDimension(C0126R.dimen.wallet_uic_shake_animation_delta)));
        ofFloat.start();
    }

    /* renamed from: a */
    public static View m105548a(LayoutInflater layoutInflater, int i, bmjf bmjf, bjxu bjxu) {
        InfoMessageView infoMessageView;
        if ((bmjf.f129687a & 2) != 0) {
            infoMessageView = (InfoMessageView) layoutInflater.inflate(i, (ViewGroup) null);
            infoMessageView.f152084h = bjxu;
            bmnr bmnr = bmjf.f129689c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
        } else {
            infoMessageView = null;
        }
        if (!bmjf.f129690d.isEmpty()) {
            WebViewLayout webViewLayout = (WebViewLayout) layoutInflater.inflate((int) C0126R.C0128layout.view_web_view_layout, (ViewGroup) null);
            webViewLayout.mo72119a(bmjf.f129690d, (String) null);
            if (infoMessageView != null) {
                if (webViewLayout.f152245h == null) {
                    webViewLayout.f152245h = infoMessageView;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = (int) webViewLayout.getResources().getDimension(C0126R.dimen.wallet_uic_web_view_layout_header_bottom_margin);
                    webViewLayout.f152245h.setLayoutParams(layoutParams);
                    int i2 = Build.VERSION.SDK_INT;
                    ((RelativeLayout.LayoutParams) webViewLayout.f152238a.getLayoutParams()).addRule(3, C0126R.C0129id.web_view_layout_header);
                    int i3 = Build.VERSION.SDK_INT;
                    ((RelativeLayout.LayoutParams) webViewLayout.f152243f.getLayoutParams()).addRule(3, C0126R.C0129id.web_view_layout_header);
                    int i4 = Build.VERSION.SDK_INT;
                    ((RelativeLayout.LayoutParams) webViewLayout.f152240c.getLayoutParams()).addRule(3, C0126R.C0129id.web_view_layout_header);
                    webViewLayout.f152245h.setId(C0126R.C0129id.web_view_layout_header);
                    webViewLayout.addView(webViewLayout.f152245h, 0);
                } else {
                    throw new IllegalArgumentException("Only a single header view is supported.");
                }
            }
            return webViewLayout;
        } else if (infoMessageView != null) {
            return infoMessageView;
        } else {
            throw new IllegalArgumentException("Unsupported legal message configuration.");
        }
    }

    /* renamed from: b */
    public static void m105594b(View view, int i) {
        m105565a(view, i, 0, 8, null);
    }

    /* renamed from: b */
    public static void m105595b(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
        } else {
            m105594b(view, 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: b */
    public static void m105596b(TextView textView, String str) {
        if (textView instanceof FormEditText) {
            ((FormEditText) textView).mo71832a((CharSequence) str, 9);
        } else {
            textView.setText(str);
        }
    }

    /* renamed from: b */
    public static void m105597b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: b */
    public static boolean m105598b(View view) {
        View b = bkft.m105641b(view);
        if (b instanceof bkdf) {
            ((bkdf) b).mo65800cN();
        } else if (b.hasFocus() || !b.requestFocus()) {
            m105602c(b);
        }
        return b.hasFocus();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static View m105549a(LayoutInflater layoutInflater, bmnr bmnr, ImageLoader imageLoader, ViewGroup viewGroup, bjxv bjxv, boolean z, bkdw bkdw) {
        if (bmnr.f130157c.size() == 1) {
            InfoMessageWithImageAndText infoMessageWithImageAndText = (InfoMessageWithImageAndText) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_with_image_and_text, viewGroup, false);
            if (bmnr.f130157c.size() == 1) {
                infoMessageWithImageAndText.f152097a = bmnr;
                infoMessageWithImageAndText.f152098b = (InfoMessageView) infoMessageWithImageAndText.findViewById(C0126R.C0129id.info_message_text_view);
                infoMessageWithImageAndText.f152098b.mo72002a((bkdw) infoMessageWithImageAndText);
                infoMessageWithImageAndText.f152099c = (ImageWithCaptionView) infoMessageWithImageAndText.findViewById(C0126R.C0129id.image_view);
                infoMessageWithImageAndText.f152098b.mo72003a(infoMessageWithImageAndText.f152097a);
                infoMessageWithImageAndText.f152098b.setId(bjxv.mo65614a());
                infoMessageWithImageAndText.f152099c.mo71992a((bmno) infoMessageWithImageAndText.f152097a.f130157c.get(0), imageLoader, z);
                infoMessageWithImageAndText.setId(bjxv.mo65614a());
                infoMessageWithImageAndText.f152100d = bkdw;
                return infoMessageWithImageAndText;
            }
            throw new IllegalArgumentException("InfoMessageWithImageAndText requires exactly one image.");
        } else if (bmnr.f130157c.size() == 0) {
            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_text, viewGroup, false);
            infoMessageView.mo72003a(bmnr);
            infoMessageView.setId(bjxv.mo65614a());
            infoMessageView.mo72002a(bkdw);
            return infoMessageView;
        } else {
            throw new IllegalArgumentException("InfoMessages with multiple images aren't supported");
        }
    }

    /* renamed from: a */
    public static View m105550a(bmdn bmdn, View view, LayoutInflater layoutInflater) {
        if (!(bmdn == null || view == null)) {
            int a = bmnh.m108199a(bmdn.f128841i);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (!(i2 == 0 || i2 == 2)) {
                if (i2 == 3) {
                    Resources resources = view.getResources();
                    int[] iArr = {C0126R.attr.internalUicFormDisplayTypeEmphasisColor, C0126R.attr.internalUicFormDisplayTypeEmphasisExtraHorizontalPadding};
                    Arrays.sort(iArr);
                    TypedArray obtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(iArr);
                    int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicFormDisplayTypeEmphasisColor), resources.getColor(C0126R.color.wallet_uic_form_emphasis_color_light));
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicFormDisplayTypeEmphasisExtraHorizontalPadding), resources.getDimensionPixelSize(C0126R.dimen.wallet_uic_form_emphasis_extra_horizontal_padding));
                    obtainStyledAttributes.recycle();
                    view.setBackgroundColor(color);
                    C1280ps.m19885a(view, C1280ps.m19925i(view) + dimensionPixelSize, view.getPaddingTop(), C1280ps.m19927j(view) + dimensionPixelSize, view.getPaddingBottom());
                } else if (i2 != 4) {
                    int a2 = bmnh.m108199a(bmdn.f128841i);
                    if (a2 != 0) {
                        i = a2;
                    }
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Ignoring unsupported Form DisplayType: ");
                    sb.append(i - 1);
                    Log.e("UiComponentUtils", sb.toString());
                    return view;
                } else {
                    TypedArray obtainStyledAttributes2 = layoutInflater.getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicFormDisplayTypeCardLayout});
                    int resourceId = obtainStyledAttributes2.getResourceId(0, C0126R.C0128layout.view_material_2_light_card_view);
                    obtainStyledAttributes2.recycle();
                    ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(resourceId, (ViewGroup) null);
                    viewGroup.addView(view);
                    return viewGroup;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public static atn m105551a() {
        atn atn = new atn();
        asd asd = new asd();
        asd.f2181i = atc.m2002a(asd.f2181i, "excludeViewFromChangeBounds");
        asd.f2175c = f124160b;
        atn.mo2491a(asd);
        bkit bkit = new bkit();
        bkit.f2175c = f124160b;
        atn.mo2491a(bkit);
        atn.mo2457a(400);
        atn.mo2493b(0);
        atn.mo2458a(f124160b);
        return atn;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo
     arg types: [bmbr, int, int, com.google.android.wallet.clientlog.LogContext]
     candidates:
      bjzp.a(int, bmbr, boolean, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo */
    /* renamed from: a */
    public static bjzp m105552a(bmbr bmbr, int i, LogContext logContext) {
        if (bmbr.f128577D) {
            return bjzo.m105002a(bmbr, i, false, logContext);
        }
        bjzp bjzp = new bjzp();
        bjzp.setArguments(bjzp.m105017a(i, bmbr, false, logContext));
        return bjzp;
    }

    /* renamed from: a */
    public static CharSequence m105554a(String str) {
        if (str != null) {
            return str.replace("<br>", "\n");
        }
        return null;
    }

    /* renamed from: a */
    public static String m105555a(Resources resources, List list) {
        if (list.isEmpty()) {
            return "";
        }
        String string = resources.getString(C0126R.string.wallet_uic_string_list_append_to_end);
        String str = (String) list.get(0);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            str = String.format(string, str, list.get(i));
        }
        return str;
    }

    /* renamed from: a */
    public static String m105556a(String str, int i, int i2, boolean z) {
        String str2;
        if (z) {
            int i3 = Build.VERSION.SDK_INT;
            str2 = "-rw";
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        return String.format(Locale.US, "%s=w%d-h%d-e365%s%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, sb.toString());
    }

    /* renamed from: a */
    public static String m105557a(String str, String str2) {
        int i = Build.VERSION.SDK_INT;
        return PhoneNumberUtils.formatNumber(str, str2);
    }

    /* renamed from: a */
    public static String m105558a(List list) {
        return TextUtils.join("\n", list);
    }

    /* renamed from: a */
    public static void m105559a(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && view != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m105560a(Context context, Button button) {
        int i = Build.VERSION.SDK_INT;
        if (button != null) {
            int a = m105542a(context, 16843829);
            C1280ps.m19887a(button, new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m105542a(context, (int) C0126R.attr.internalUicColorWalletButtonDisabled), a}));
            int i2 = Build.VERSION.SDK_INT;
            button.setActivated(!button.isActivated());
            button.setActivated(!button.isActivated());
        }
    }

    /* renamed from: a */
    public static void m105561a(Context context, bmnu bmnu, View view) {
        if (bmnu != null) {
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            } else if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int a = bmnt.m108211a(bmnu.f130172a);
            int i = 1;
            if (a != 0 && a == 21) {
                marginLayoutParams.topMargin = (int) m105541a((float) bmnu.f130174c);
                marginLayoutParams.bottomMargin = (int) m105541a((float) bmnu.f130175d);
            } else {
                int a2 = bmnt.m108211a(bmnu.f130172a);
                if (!(a2 == 0 || a2 == 1)) {
                    int a3 = bmnt.m108211a(bmnu.f130172a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    marginLayoutParams.topMargin = m105610e(context, a3);
                    int a4 = bmnt.m108211a(bmnu.f130172a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    marginLayoutParams.bottomMargin = m105613f(context, a4);
                }
            }
            int a5 = bmnt.m108211a(bmnu.f130173b);
            if (a5 != 0 && a5 == 21) {
                C1260oz.m19821a(marginLayoutParams, (int) m105541a((float) bmnu.f130176e));
                C1260oz.m19823b(marginLayoutParams, (int) m105541a((float) bmnu.f130177f));
            } else {
                int a6 = bmnt.m108211a(bmnu.f130173b);
                if (!(a6 == 0 || a6 == 1)) {
                    int a7 = bmnt.m108211a(bmnu.f130173b);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    C1260oz.m19821a(marginLayoutParams, m105610e(context, a7));
                    int a8 = bmnt.m108211a(bmnu.f130173b);
                    if (a8 != 0) {
                        i = a8;
                    }
                    C1260oz.m19823b(marginLayoutParams, m105613f(context, i));
                }
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    private static void m105562a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable.setId(i2, i2);
                layerDrawable.setDrawableByLayerId(i2, layerDrawable.getDrawable(i2).mutate());
            }
        } else {
            drawable.mutate();
        }
        int i3 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m105563a(View view, int i) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        rect.bottom += i;
        view.requestRectangleOnScreen(rect);
    }

    /* renamed from: a */
    public static void m105564a(View view, int i, int i2) {
        m105565a(view, i, i2, 4, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.c(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      bkfr.c(android.content.Context, int):android.content.res.ColorStateList
      bkfr.c(android.view.View, boolean):void */
    /* renamed from: a */
    public static void m105565a(View view, int i, int i2, int i3, Runnable runnable) {
        m105603c(view, false);
        view.setTranslationY((float) i);
        view.animate().translationY((float) i2).alpha(0.0f).setListener(new bkfn(view, i3, runnable)).start();
    }

    /* renamed from: a */
    public static void m105566a(View view, TypedValue typedValue) {
        if (typedValue == null || typedValue.type == 0) {
            view.setVisibility(8);
        } else if (typedValue.type < 28 || typedValue.type > 31) {
            view.setBackgroundResource(typedValue.resourceId);
        } else {
            view.setBackgroundColor(typedValue.data);
        }
    }

    /* renamed from: a */
    public static void m105567a(View view, CharSequence charSequence) {
        if (bjvb.m104683a(view.getContext())) {
            int i = Build.VERSION.SDK_INT;
            view.announceForAccessibility(charSequence);
        }
    }

    /* renamed from: a */
    public static void m105568a(View view, boolean z) {
        if (view.getVisibility() == 0) {
            return;
        }
        if (!z) {
            view.setVisibility(0);
        } else {
            bkcd.m105304a(view, 0);
        }
    }

    /* renamed from: a */
    public static void m105569a(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m105570a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m105571a(ImageView imageView, int i, Context context, CharSequence charSequence) {
        String str;
        int i2;
        if (i != 2) {
            str = context.getResources().getString(C0126R.string.wallet_uic_summary_edit_button_description);
            i2 = C0126R.attr.uicEditDrawable;
        } else {
            str = context.getResources().getString(C0126R.string.wallet_uic_summary_clear_button_description);
            i2 = C0126R.attr.uicClearDrawable;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i2, C0126R.attr.internalUicEditAndClearableIconColor});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        m105562a(drawable);
        C1173lt.m19601a(drawable, colorStateList);
        obtainStyledAttributes.recycle();
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(String.format(Locale.getDefault(), str, charSequence));
    }

    /* renamed from: a */
    public static void m105572a(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable = imageView.getDrawable();
        m105562a(drawable);
        C1173lt.m19601a(drawable, colorStateList);
        imageView.setImageDrawable(drawable);
        imageView.setImageState(new int[]{16843518}, true);
    }

    /* renamed from: a */
    public static void m105573a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    public static void m105574a(TextView textView, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            str = PhoneNumberUtils.formatNumber(str);
        }
        if (textView instanceof FormEditText) {
            ((FormEditText) textView).mo71832a((CharSequence) str, i);
        } else {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public static void m105575a(TextView textView, boolean z) {
        if (textView.requestFocus()) {
            if (z && (textView.getImeOptions() & 255) == 0) {
                textView.setImeOptions(textView.getImeOptions() | 5);
            }
            InputMethodManager inputMethodManager = (InputMethodManager) textView.getContext().getSystemService("input_method");
            if (!inputMethodManager.showSoftInput(textView, 1)) {
                int i = 300;
                if (!((Boolean) bjwe.f123504y.mo54082a()).booleanValue()) {
                    TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(new int[]{C0126R.attr.internalUicShowKeyboardDelayMs});
                    i = obtainStyledAttributes.getInteger(0, 300);
                    obtainStyledAttributes.recycle();
                }
                textView.postDelayed(new bkfp(inputMethodManager, textView), (long) i);
            }
        }
    }

    /* renamed from: a */
    public static void m105576a(Fragment fragment) {
        m105607d(fragment.getActivity().findViewById(16908290));
    }

    /* renamed from: a */
    public static void m105577a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: a */
    public static boolean m105578a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 7:
            case 11:
            case 16:
            case 17:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 36:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return false;
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 28:
            case 34:
            case 35:
            case FelicaException.TYPE_NOT_CLOSED:
                return true;
            case 23:
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown field type %d", Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static boolean m105579a(Context context) {
        if (context.getResources().getBoolean(C0126R.bool.wallet_uic_is_tablet) || context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m105580a(Context context, bmap bmap) {
        bngx a = bngx.m109356a(bmap);
        bjtd f = m105614f(context);
        if (f == null) {
            return false;
        }
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!f.mo65521a((bmap) a.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m105581a(Context context, int... iArr) {
        bjtd f = m105614f(context);
        if (f == null) {
            return false;
        }
        for (int i : iArr) {
            if (!f.f123268a[1].contains(Integer.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m105582a(bmav bmav) {
        return bmav.f128505d.size() > 0;
    }

    /* renamed from: a */
    public static boolean m105583a(Activity activity, TextView textView) {
        TelephonyManager telephonyManager;
        if (activity == null || !bjzc.m104960a(activity, "android.permission.READ_PHONE_STATE") || (telephonyManager = (TelephonyManager) activity.getSystemService("phone")) == null) {
            return false;
        }
        m105574a(textView, telephonyManager.getLine1Number(), 8);
        return true;
    }

    /* renamed from: a */
    public static boolean m105584a(FormEditText formEditText) {
        if ((formEditText.getImeOptions() & 301989888) == 0) {
            return m105579a(formEditText.getContext());
        }
        return false;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public static int[] m105585a(Context context, List list, bmot[] bmotArr, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        bkfl bkfl;
        bmot[] bmotArr2 = bmotArr;
        ViewGroup viewGroup2 = viewGroup;
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = -1;
            View view = (View) list.get(i2);
            View b = bkft.m105641b(view);
            if (bmotArr2 != null) {
                int length = bmotArr2.length;
                if (length != 0) {
                    if (i < length) {
                        bmot bmot = bmotArr2[i];
                        if (i2 >= bmot.f130257a) {
                            bxvt bxvt = bmot.f130259c;
                            Integer valueOf = Integer.valueOf(i2);
                            boolean contains = bxvt.contains(valueOf);
                            if (b instanceof TextView) {
                                int i3 = bmot.f130257a;
                                if (i2 != i3) {
                                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getChildAt(viewGroup.getChildCount() - 1);
                                    if (m105622h(b)) {
                                        iArr[i2] = viewGroup.getChildCount() - 1;
                                    }
                                    i++;
                                    linearLayout = viewGroup3;
                                } else if (bmot.f130258b == i3 + 1) {
                                    LinearLayout linearLayout2 = new LinearLayout(context);
                                    linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    linearLayout2.setOrientation(0);
                                    viewGroup2.addView(linearLayout2);
                                    linearLayout = linearLayout2;
                                } else {
                                    throw new IllegalArgumentException(String.format(Locale.US, "Field groupings must contain exactly 2 fields (%d, %d)", Integer.valueOf(bmot.f130257a), Integer.valueOf(bmot.f130258b)));
                                }
                                linearLayout.addView(view);
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                                if (!contains) {
                                    layoutParams.weight = 1.0f;
                                    layoutParams.width = 0;
                                } else {
                                    layoutParams.width = -2;
                                }
                                if (i2 != bmot.f130257a) {
                                    C1260oz.m19821a(layoutParams, C1260oz.m19820a(layoutParams) + viewGroup.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_horizontal_margin_between_fields_with_padding));
                                }
                                view.setLayoutParams(layoutParams);
                                if (view instanceof bkfl) {
                                    bkfl = (bkfl) view;
                                } else {
                                    if (view instanceof ViewGroup) {
                                        ViewGroup viewGroup4 = (ViewGroup) view;
                                        int childCount = viewGroup4.getChildCount();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= childCount) {
                                                break;
                                            }
                                            View childAt = viewGroup4.getChildAt(i4);
                                            if (childAt instanceof bkfl) {
                                                bkfl = (bkfl) childAt;
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    bkfl = null;
                                }
                                if (bkfl != null) {
                                    bkfl.mo65960a();
                                }
                                if (contains) {
                                    b.getLayoutParams().width = -2;
                                    b.setLayoutParams(b.getLayoutParams());
                                }
                            } else {
                                throw new IllegalArgumentException(String.format(Locale.US, "Field groupings are only supported for text and date ui fields. index %d view type: %s field grouping: %d-%d", valueOf, view.getClass().getName(), Integer.valueOf(bmot.f130257a), Integer.valueOf(bmot.f130258b)));
                            }
                        }
                    }
                }
            }
            viewGroup2.addView(view);
            if (m105622h(b)) {
                iArr[i2] = viewGroup.getChildCount() - 1;
            }
        }
        return iArr;
    }
}
