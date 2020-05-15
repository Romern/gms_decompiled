package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.net.URISyntaxException;

/* renamed from: arsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsq {
    /* renamed from: a */
    private static Intent m73408a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("intent:")) {
            try {
                return Intent.parseUri(str, 1);
            } catch (URISyntaxException e) {
                return null;
            }
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            return intent;
        }
    }

    /* renamed from: a */
    public static boui m73409a(Context context, PostTransferAction postTransferAction) {
        if (postTransferAction == null) {
            return boui.NONE;
        }
        boui boui = (boui) m73410a(context.getPackageManager(), postTransferAction).f26798a;
        return boui == null ? boui.NONE : boui;
    }

    /* renamed from: a */
    public static C1240of m73410a(PackageManager packageManager, PostTransferAction postTransferAction) {
        Intent a = m73408a(postTransferAction.f107909c);
        Intent a2 = m73408a(postTransferAction.f107910d);
        boolean a3 = m73411a(packageManager, a);
        boolean a4 = m73411a(packageManager, a2);
        boolean z = false;
        if (cgrq.f187602a.mo6606a().mo84362d()) {
            String str = postTransferAction.f107911e;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (packageManager.getPackageInfo(str, 0) != null) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        if ((a4 || z) && cgrq.f187602a.mo6606a().mo84361c()) {
            return C1240of.m19758a(boui.OEM_APP, a2);
        }
        if (a3 && ccom.m131019b()) {
            return C1240of.m19758a(boui.WIFI_D2D, a);
        }
        return C1240of.m19758a(boui.NONE, null);
    }

    /* renamed from: a */
    private static boolean m73411a(PackageManager packageManager, Intent intent) {
        return (intent == null || packageManager.resolveActivity(intent, 0) == null) ? false : true;
    }
}
