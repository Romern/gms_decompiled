package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.gms.tapandpay.util.TapAndPayUiUtils$3;

/* renamed from: atyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyg {

    /* renamed from: a */
    private static final srn f91109a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static ImageLoader f91110b;

    /* renamed from: a */
    public static int m76547a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: b */
    public static synchronized Bitmap m76555b(String str) {
        Bitmap bitmap;
        synchronized (atyg.class) {
            ImageLoader.ImageContainer imageContainer = m76548a().get(str, new atyd());
            bitmap = imageContainer != null ? imageContainer.getBitmap() : null;
        }
        return bitmap;
    }

    /* renamed from: a */
    public static synchronized ImageLoader m76548a() {
        ImageLoader imageLoader;
        synchronized (atyg.class) {
            if (f91110b == null) {
                f91110b = new ImageLoader(rpr.m34216b().getRequestQueue(), new atyf());
            }
            imageLoader = f91110b;
        }
        return imageLoader;
    }

    /* renamed from: a */
    public static void m76549a(Context context, TextView textView, String str, boolean z, Intent... intentArr) {
        atxj[] atxjArr = new atxj[intentArr.length];
        for (int i = 0; i < intentArr.length; i++) {
            atxjArr[i] = new atxj(context, intentArr[i]);
        }
        m76551a(textView, str, z, atxjArr);
    }

    /* renamed from: a */
    public static void m76550a(Context context, TextView textView, String str, Intent... intentArr) {
        m76549a(context, textView, str, false, intentArr);
    }

    /* renamed from: a */
    public static void m76551a(TextView textView, String str, boolean z, View.OnClickListener... onClickListenerArr) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
        int min = Math.min(onClickListenerArr.length, uRLSpanArr.length);
        for (int i = 0; i < min; i++) {
            View.OnClickListener onClickListener = onClickListenerArr[i];
            URLSpan uRLSpan = uRLSpanArr[i];
            spannableStringBuilder.setSpan(new TapAndPayUiUtils$3(uRLSpan.getURL(), onClickListener, z), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public static synchronized void m76552a(String str) {
        synchronized (atyg.class) {
            m76548a().get(str, new atyc());
        }
    }

    /* renamed from: a */
    public static void m76553a(String str, String str2, TextView textView, Intent intent) {
        SpannableString spannableString = new SpannableString(str);
        atye atye = new atye(textView.getContext(), intent);
        int indexOf = str.indexOf(str2);
        int length = str2.length() + indexOf;
        if (indexOf >= 0) {
            spannableString.setSpan(atye, indexOf, length, 33);
        } else {
            bnsl bnsl = (bnsl) f91109a.mo68387b();
            bnsl.mo68432a("atyg", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("cannot find link text: '%s' in text: '%s'", str2, str);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public static boolean m76554a(Context context) {
        return (context.getApplicationContext().getResources().getConfiguration().uiMode & 48) == 32;
    }
}
