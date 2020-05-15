package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;

/* renamed from: atxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxl {
    /* renamed from: a */
    public static boolean m76501a(View view, String str) {
        view.setOnClickListener(new atxk(view.getContext(), str));
        Context context = view.getContext();
        if (!TextUtils.isEmpty(str)) {
            if (context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str), 0) != null) {
                return true;
            }
        }
        return false;
    }
}
