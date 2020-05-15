package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: avjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjm {
    /* renamed from: a */
    public static Intent m78614a() {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
    }

    /* renamed from: a */
    public static Intent m78615a(Context context, String str, String str2) {
        return new Intent("android.intent.action.VIEW").setData(avji.m78610a(str, Uri.parse("https://myaccount.google.com/activitycontrols").buildUpon().appendQueryParameter("target_user_id", str2).appendQueryParameter("hl", avef.m78366a(context)).build().toString()));
    }

    /* renamed from: a */
    public static Intent m78616a(String str) {
        return m78614a().putExtra("extra.accountName", str);
    }
}
