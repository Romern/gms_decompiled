package p000;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: akiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akiq {
    /* renamed from: a */
    public static String m59843a(Context context, String str) {
        if (URLUtil.isValidUrl(str)) {
            return "url";
        }
        int i = Build.VERSION.SDK_INT;
        TextClassification classifyText = ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier().classifyText(str, 0, str.length(), new LocaleList(Locale.US));
        String entity = classifyText.getEntityCount() <= 0 ? "" : classifyText.getEntity(0);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akiq", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Text %s classified as %s", str, entity);
        return entity;
    }

    /* renamed from: a */
    public static String m59844a(Intent intent) {
        if (TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.TEXT"))) {
            int i = Build.VERSION.SDK_INT;
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                CharSequence charSequence = resultsFromIntent.getCharSequence("android.intent.extra.TEXT");
                if (!TextUtils.isEmpty(charSequence)) {
                    return charSequence.toString();
                }
            }
            if (!TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.PHONE_NUMBER"))) {
                return intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
            }
            return null;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            return stringExtra;
        }
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = cfov.f185185a.mo6606a().mo82361bi().f165797a;
        int size = bxwc.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Pattern.compile((String) bxwc.get(i3), 40));
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Matcher matcher = ((Pattern) arrayList.get(i2)).matcher(stringExtra);
            i2++;
            if (matcher.find()) {
                return stringExtra.substring(matcher.start(1), matcher.end());
            }
        }
        return stringExtra;
    }

    /* renamed from: a */
    public static String m59845a(String str, int i) {
        boolean z;
        String trim = str.trim();
        int a = akid.m59786a(trim);
        if (a <= i) {
            return trim;
        }
        int a2 = akid.m59786a("…");
        if (i >= a2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        while (a + a2 > i && a > 0) {
            int codePointCount = trim.codePointCount(0, trim.length());
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < codePointCount - 1; i2++) {
                sb.appendCodePoint(trim.codePointAt(trim.offsetByCodePoints(0, i2)));
            }
            trim = sb.toString().trim();
            a = akid.m59786a(trim);
        }
        return String.valueOf(trim).concat("…");
    }
}
