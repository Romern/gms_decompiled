package com.google.android.gms.common.p037ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.ui.LinkSpan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinkSpan extends URLSpan {

    /* renamed from: a */
    private static final Typeface f30395a = Typeface.create("sans-serif-medium", 0);

    private LinkSpan(String str) {
        super(str);
    }

    /* renamed from: a */
    public static void m22734a(TextView textView, String... strArr) {
        List asList = Arrays.asList(strArr);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString = new SpannableString(textView.getText());
        Annotation[] annotationArr = (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        for (Annotation annotation : annotationArr) {
            if ("id".equals(annotation.getKey())) {
                String value = annotation.getValue();
                if (asList.contains(value)) {
                    int spanStart = spannableString.getSpanStart(annotation);
                    int spanEnd = spannableString.getSpanEnd(annotation);
                    LinkSpan linkSpan = new LinkSpan(value);
                    spannableStringBuilder.setSpan(linkSpan, spanStart, spanEnd, spannableString.getSpanFlags(linkSpan));
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 41);
                    sb.append("No such policy while creating link, id='");
                    sb.append(value);
                    sb.append("'");
                    Log.w("LinkSpan", sb.toString());
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public void onClick(View view) {
        Context context = view.getContext();
        if (context != null) {
            Intent intent = new Intent("com.google.android.setupwizard.LINK_SPAN_CLICKED");
            intent.putExtra("id", getURL());
            aki.m919a(context).mo874a(intent);
        }
        view.cancelPendingInputEvents();
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(f30395a);
    }
}
