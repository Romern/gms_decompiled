package p000;

import android.content.Context;

/* renamed from: bbql */
public final /* synthetic */ class bbql {
    /* renamed from: a */
    public static String m88408a(Context context) {
        String valueOf = String.valueOf(context.getPackageName());
        return valueOf.length() == 0 ? new String("com.google.lighter.android#") : "com.google.lighter.android#".concat(valueOf);
    }
}
