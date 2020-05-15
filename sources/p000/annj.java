package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: annj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annj {
    /* renamed from: a */
    public static final CharSequence m64806a(CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        Annotation[] annotationArr = (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        anni anni = new anni(str);
        int length = annotationArr.length;
        for (int i = 0; i < length; i++) {
            spannableStringBuilder.setSpan(anni, spannableString.getSpanStart(annotationArr[i]), spannableString.getSpanEnd(annotationArr[i]), spannableString.getSpanFlags(anni));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static final boolean m64807a(String str, Activity activity, DialogInterface.OnClickListener onClickListener) {
        Intent intent;
        if (!TextUtils.isEmpty(str)) {
            intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        } else {
            intent = null;
        }
        if (intent == null || intent.resolveActivity(activity.getPackageManager()) == null) {
            new AlertDialog.Builder(activity).setPositiveButton((int) C0126R.string.plus_done, onClickListener).setMessage((int) C0126R.string.plus_list_moments_view_moment_url_error).setInverseBackgroundForced(true).show();
            return false;
        }
        activity.startActivity(intent);
        return true;
    }
}
