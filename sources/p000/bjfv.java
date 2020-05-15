package p000;

import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfv {
    /* renamed from: a */
    public static Intent m103323a(bjfd bjfd) {
        return (Intent) bjfd.f122613a.getParcelableExtra("resultData");
    }

    /* renamed from: b */
    public static int m103325b(bjfd bjfd) {
        return bjfd.f122613a.getIntExtra("resultCode", -1);
    }

    /* renamed from: a */
    public static bjfc m103324a(Intent intent, WidgetConfig widgetConfig) {
        Intent intent2 = new Intent();
        intent2.putExtra("launchingIntent", intent);
        return new bjfc(bjfc.m103292a("startActivityForResult", widgetConfig, intent2));
    }
}
