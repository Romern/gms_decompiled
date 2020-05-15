package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: bebk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebk {
    /* renamed from: a */
    static final void m91720a(Context context) {
        try {
            ahj ahj = new ahj();
            ahj.mo704a(Color.parseColor("#eeeeee"));
            ahj.mo703a().mo706a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException e) {
            throw new bebj();
        }
    }

    /* renamed from: a */
    public static final void m91721a(Activity activity, String str) {
        m91722a(null, activity, str);
    }

    /* renamed from: a */
    public static final void m91722a(Fragment fragment, Activity activity, String str) {
        if (str == null || str.isEmpty()) {
            m91720a(activity);
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str).putExtra("extra.screenId", 500);
        if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
            m91720a(activity);
        } else if (fragment == null) {
            activity.startActivityForResult(putExtra, 0);
        } else {
            fragment.startActivityForResult(putExtra, 0);
        }
    }
}
