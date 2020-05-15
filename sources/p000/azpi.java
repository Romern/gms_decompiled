package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: azpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azpi {

    /* renamed from: a */
    public static final /* synthetic */ int f99824a = 0;

    /* renamed from: b */
    private static final bmxr f99825b = bmxr.m108544a(",");

    /* renamed from: a */
    public static int m86057a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 += i5;
            }
        }
        return i5;
    }

    /* renamed from: b */
    public static int m86074b(int i) {
        return Math.round(TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics()));
    }

    /* renamed from: b */
    public static boolean m86080b(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    /* renamed from: c */
    private static Drawable m86081c(int i, int i2, Context context) {
        Drawable a = C1163lk.m19268a(context.getResources(), i2, (Resources.Theme) null);
        Drawable.ConstantState constantState = a.getConstantState();
        if (constantState != null) {
            a = constantState.newDrawable(context.getResources()).mutate();
        }
        a.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return a;
    }

    /* renamed from: d */
    public static Integer m86086d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            azoj.m85931a("Utils", e, "Failed to parse color from string %s", str);
            return null;
        }
    }

    /* renamed from: e */
    public static int[] m86087e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = TextUtils.split(str, ",");
        int i = 0;
        for (String str2 : split) {
            try {
                arrayList.add(Integer.valueOf(str2));
            } catch (Exception e) {
                azoj.m85933c("Utils", "Failed to parse %s", str2);
            }
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static int m86058a(Activity activity) {
        int identifier;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.y;
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        if (i2 <= 0 && (identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            i2 = activity.getResources().getDimensionPixelSize(identifier);
        }
        return ((i - i2) - (activity.getResources().getDimensionPixelSize(C0126R.dimen.swipe_view_container_padding_top) + activity.getResources().getDimensionPixelSize(C0126R.dimen.swipe_view_container_padding_bottom))) - ((Integer) m86061a(activity.findViewById(C0126R.C0129id.swipe_to_dismiss)).second).intValue();
    }

    /* renamed from: b */
    public static int m86075b(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(C0126R.dimen.swipe_view_container_padding_horizontal);
        return i - (dimensionPixelSize + dimensionPixelSize);
    }

    /* renamed from: c */
    public static String m86082c(int i) {
        if (i < 1024) {
            StringBuilder sb = new StringBuilder(17);
            sb.append(i);
            sb.append(" bytes");
            return sb.toString();
        } else if (i >= 1048576) {
            return String.format(Locale.US, "%.1f MB", Float.valueOf(((float) i) / 1048576.0f));
        } else {
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append(i >> 10);
            sb2.append(" KB");
            return sb2.toString();
        }
    }

    /* renamed from: b */
    public static Bitmap m86076b(Context context) {
        Drawable drawable = context.getResources().getDrawable(C0126R.C0127drawable.ms_default_app_icon);
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: c */
    public static String m86083c(String str) {
        return C1211nd.m19661a().mo15491a(str);
    }

    /* renamed from: c */
    public static boolean m86084c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: a */
    public static long m86059a(int i) {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        instance.set(11, i);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis2 = instance.getTimeInMillis() - timeInMillis;
        return timeInMillis2 <= 0 ? timeInMillis2 + 86400000 : timeInMillis2;
    }

    /* renamed from: b */
    private static LayerDrawable m86077b(int i, int i2, Context context) {
        Drawable a = C1163lk.m19268a(context.getResources(), i2, (Resources.Theme) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i != 0) {
            gradientDrawable.setColor(i);
        }
        gradientDrawable.setShape(1);
        return new LayerDrawable(new Drawable[]{gradientDrawable, a.getConstantState().newDrawable()});
    }

    /* renamed from: a */
    public static Drawable m86060a(int i, int i2, Context context) {
        switch (i) {
            case 30:
                return m86081c(C1133kh.m17843b(context, C0126R.color.ms_read_receipt), C0126R.C0127drawable.ms_ic_sending, context);
            case 31:
                return m86081c(C1133kh.m17843b(context, C0126R.color.ms_read_receipt), C0126R.C0127drawable.ms_ic_sent, context);
            case 32:
                return C1163lk.m19268a(context.getResources(), (int) C0126R.C0127drawable.ms_ic_fail, (Resources.Theme) null);
            case 33:
                return m86077b(i2, C0126R.C0127drawable.ms_ic_delivered, context);
            case 34:
                return m86077b(i2, C0126R.C0127drawable.ms_ic_read, context);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static boolean m86085c(Context context, String str) {
        if (!cfeo.f183719a.mo6606a().mo80915B()) {
            return rfz.m33557a(context).mo24610b(str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m86078b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m86079b(String str) {
        for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) cfeo.f183719a.mo6606a().mo81042bw())) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Pair m86061a(View view) {
        if (view == null) {
            return new Pair(0, 0);
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        if (measuredHeight != 0 || measuredWidth != 0 || view.getVisibility() != 0) {
            return new Pair(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        }
        view.measure(0, 0);
        return new Pair(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
    }

    /* renamed from: a */
    public static String m86062a(long j) {
        Date date = new Date(j);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        return new SimpleDateFormat((instance.get(5) == instance2.get(5) && instance.get(2) == instance2.get(2) && instance.get(1) == instance2.get(1)) ? "h:mm aa" : "MMM d", Locale.getDefault()).format(date);
    }

    /* renamed from: a */
    public static String m86063a(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        if (i <= 120) {
            return "ldpi";
        }
        if (i <= 160) {
            return "mdpi";
        }
        if (i <= 240) {
            return "hdpi";
        }
        if (i <= 320) {
            return "xhdpi";
        }
        if (i <= 480) {
            return "xxhdpi";
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i <= 640) {
            return "xxxhdpi";
        }
        return "hdpi";
    }

    /* renamed from: a */
    public static String m86064a(Context context, aznz aznz, int i, LocalEntityId localEntityId) {
        azox.m85982b();
        return i != 0 ? m86065a(context, aznz, localEntityId) : "";
    }

    /* renamed from: a */
    public static String m86065a(Context context, aznz aznz, LocalEntityId localEntityId) {
        String str;
        azox.m85982b();
        azdi a = DatabaseProvider.m94522a(context.getContentResolver(), localEntityId);
        if (!aznz.mo55107e()) {
            String c = azny.m85888c(context, localEntityId);
            if (TextUtils.isEmpty(c)) {
                c = localEntityId.f111074a;
                if (a == null) {
                    azoj.m85933c("Utils", "ProfileData is null", new Object[0]);
                    if (localEntityId.f111075b == 1) {
                        return azot.m85964a(localEntityId.f111074a, (TelephonyManager) context.getSystemService("phone"));
                    }
                } else if (!TextUtils.isEmpty(a.f99079e)) {
                    String str2 = a.f99079e;
                    String str3 = a.f99080f;
                    if (TextUtils.isEmpty(str3) || str3.equals(str2)) {
                        return str2;
                    }
                    String c2 = m86083c(str3);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(c2).length());
                    sb.append(str2);
                    sb.append(" (");
                    sb.append(c2);
                    sb.append(")");
                    return sb.toString();
                }
            }
            return c;
        }
        if (a == null) {
            str = "";
        } else {
            str = a.f99080f;
        }
        return TextUtils.isEmpty(str) ? aznz.f99777d : str;
    }

    /* renamed from: a */
    public static String m86066a(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public static String m86067a(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return "";
        }
        int[] iArr2 = (int[]) iArr.clone();
        Arrays.sort(iArr2);
        return f99825b.mo66874a((Iterable) bqcn.m112586b(iArr2));
    }

    /* renamed from: a */
    public static void m86068a(Context context, String str) {
        azox.m85981a();
        Toast.makeText(context, str, 1).show();
    }

    /* renamed from: a */
    public static boolean m86069a(Context context, LocalEntityId localEntityId) {
        if (cfeo.f183719a.mo6606a().mo81046c()) {
            return true;
        }
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cfeo.f183719a.mo6606a().mo81047cA())) {
            if (str.equals(localEntityId.f111074a)) {
                return true;
            }
        }
        if (azdj.m85399a(context).mo54722b(localEntityId) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m86070a(Context context, String str, Long l) {
        try {
            long j = (long) context.getPackageManager().getPackageInfo(str, 0).versionCode;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("version of ");
            sb.append(str);
            sb.append(" = ");
            sb.append(j);
            azoj.m85930a("Utils", sb.toString(), new Object[0]);
            return j >= l.longValue();
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m86071a(LocalEntityId localEntityId) {
        for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cfeo.f183719a.mo6606a().mo81090s())) {
            if (str.equals(localEntityId.f111074a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m86072a(cbhy cbhy) {
        bxtx bxtx;
        bxtx bxtx2;
        if (cbhy.f177216a == 1) {
            bxtx = (bxtx) cbhy.f177217b;
        } else {
            bxtx = bxtx.f164797b;
        }
        if (bxtx.mo73744a() <= 0) {
            return null;
        }
        if (cbhy.f177216a == 1) {
            bxtx2 = (bxtx) cbhy.f177217b;
        } else {
            bxtx2 = bxtx.f164797b;
        }
        return bxtx2.mo73780k();
    }

    /* renamed from: a */
    public static byte[] m86073a(String str) {
        int i = Build.VERSION.SDK_INT;
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
