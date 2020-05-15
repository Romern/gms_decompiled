package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* renamed from: atxk */
final /* synthetic */ class atxk implements View.OnClickListener {

    /* renamed from: a */
    private final Context f91080a;

    /* renamed from: b */
    private final String f91081b;

    public atxk(Context context, String str) {
        this.f91080a = context;
        this.f91081b = str;
    }

    public void onClick(View view) {
        Intent intent;
        Context context = this.f91080a;
        String str = this.f91081b;
        Context context2 = view.getContext();
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(str), 0);
        if (resolveActivity != null) {
            intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(new ComponentName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name)).setFlags(268435456);
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(TextUtils.isEmpty("") ? String.format("market://details?id=%s", str) : String.format("market://details?id=%s&url=%s", str, "")));
            intent = context.getPackageManager().resolveActivity(intent2, 0) != null ? intent2 : new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://play.google.com/store/apps/details?id=%s", str)));
        }
        context2.startActivity(intent);
    }
}
