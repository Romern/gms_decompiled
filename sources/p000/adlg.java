package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: adlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlg {

    /* renamed from: a */
    public static final Pattern f62104a = Pattern.compile("https://instant\\.app/(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(?:\\.\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*)/(\\d+)/(\\d+)/(\\w+|[-])/(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(?:\\.\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*)");

    /* renamed from: a */
    public static boolean m50790a(String str) {
        return !TextUtils.isEmpty(str) && f62104a.matcher(str).matches();
    }
}
