package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.SmartProfileUtil$1;
import java.util.Locale;

/* renamed from: tey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tey {
    /* renamed from: a */
    public static int m36884a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: b */
    public static String m36894b(String str) {
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme()) || "http".equals(parse.getScheme())) {
            return str;
        }
        if (str.startsWith("//")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("https:") : "https:".concat(valueOf);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String("https://") : "https://".concat(valueOf2);
    }

    /* renamed from: c */
    public static String m36896c(String str) {
        return !TextUtils.isEmpty(str) ? Uri.parse(str).getQueryParameter("plid") : str;
    }

    /* renamed from: a */
    public static AlertDialog m36885a(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setPositiveButton(context.getResources().getString(C0126R.string.profile_communicate_entry_copy_label), new tex(context, str));
        return builder.create();
    }

    /* renamed from: b */
    public static void m36895b(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(100);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public static Bitmap m36886a(Bitmap bitmap, int i) {
        int i2;
        int i3 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        if (width < height) {
            i2 = (height / 2) - (width / 2);
        } else {
            i3 = (width / 2) - (height / 2);
            width = height;
            i2 = 0;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        float f = (float) (i / 2);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, (float) i3, (float) i2, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static BitmapFactory.Options m36887a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        return options;
    }

    /* renamed from: a */
    public static Drawable m36888a(Drawable drawable, int i) {
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public static Spanned m36889a(String str) {
        int i = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, 0);
    }

    /* renamed from: a */
    public static Integer m36890a(Intent intent) {
        Integer num;
        if (intent == null) {
            return 0;
        }
        if (intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR")) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.people.smart_profile.THEME_COLOR");
            if (!TextUtils.isEmpty(stringExtra)) {
                String valueOf = String.valueOf(stringExtra);
                if (valueOf.length() == 0) {
                    new String("Failed to parse theme color ");
                } else {
                    "Failed to parse theme color ".concat(valueOf);
                }
                try {
                    num = Integer.valueOf(Color.parseColor(stringExtra));
                } catch (IllegalArgumentException e) {
                    num = 0;
                }
                return (num.equals(0) || !intent.hasExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT")) ? num : Integer.valueOf(intent.getIntExtra("com.google.android.gms.people.smart_profile.THEME_COLOR_INT", 0));
            }
        }
        num = 0;
        if (num.equals(0)) {
        }
    }

    /* renamed from: a */
    public static void m36891a(Context context, TextView textView, String str, String str2) {
        int i;
        String str3;
        int i2;
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        if (C1221nn.m19678a(Locale.getDefault()) == 1) {
            String concat = String.valueOf(str2).concat(" • ");
            textView.setGravity(5);
            String valueOf = String.valueOf(concat);
            String valueOf2 = String.valueOf(str);
            str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            i2 = concat.length();
            i = 0;
        } else {
            String valueOf3 = String.valueOf(str2);
            String str4 = valueOf3.length() == 0 ? new String(" • ") : " • ".concat(valueOf3);
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(str4);
            String str5 = valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5);
            int length = str.length();
            i2 = str5.length();
            i = length;
            str3 = str5;
        }
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(C0126R.dimen.card_entry_small_text_size)), i, i2, 0);
        spannableString.setSpan(new ForegroundColorSpan(C1133kh.m17843b(context, C0126R.color.card_entry_light_text_color)), i, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        textView.setText(spannableString);
    }

    /* renamed from: a */
    public static void m36892a(Spannable spannable, int i) {
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new SmartProfileUtil$1(uRLSpan.getURL(), i), spanStart, spanEnd, 0);
        }
    }

    /* renamed from: a */
    public static void m36893a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(200);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }
}
