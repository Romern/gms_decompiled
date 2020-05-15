package p000;

import android.content.Context;
import android.text.Html;
import android.widget.FrameLayout;

/* renamed from: aoai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoai extends FrameLayout {

    /* renamed from: a */
    public ansz f78033a;

    /* renamed from: b */
    public anuy f78034b;

    public aoai(Context context) {
        super(context, null, 0);
    }

    /* renamed from: a */
    public static String m65701a(String str) {
        if (str != null) {
            return Html.fromHtml(str).toString();
        }
        return null;
    }
}
