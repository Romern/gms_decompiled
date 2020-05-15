package p000;

import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfc {

    /* renamed from: a */
    public final Intent f122612a;

    public bjfc(Intent intent) {
        this.f122612a = intent;
        intent.setExtrasClassLoader(bjfc.class.getClassLoader());
    }

    /* renamed from: a */
    public static Intent m103290a(String str, WidgetConfig widgetConfig) {
        return m103291a(str, widgetConfig, -1, null);
    }

    /* renamed from: b */
    public final WidgetConfig mo65079b() {
        return (WidgetConfig) this.f122612a.getParcelableExtra("widgetConfig");
    }

    /* renamed from: a */
    public static Intent m103291a(String str, WidgetConfig widgetConfig, int i, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("requestAction", str);
        intent.putExtra("widgetConfig", widgetConfig);
        if (i != -1) {
            intent.putExtra("timeOut", i);
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m103292a(String str, WidgetConfig widgetConfig, Intent intent) {
        return m103291a(str, widgetConfig, -1, intent);
    }

    /* renamed from: a */
    public final String mo65078a() {
        return this.f122612a.getStringExtra("requestAction");
    }
}
