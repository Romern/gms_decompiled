package p000;

import android.content.Context;
import android.widget.Toast;

/* renamed from: bjkr */
final /* synthetic */ class bjkr implements Runnable {

    /* renamed from: a */
    private final Context f122864a;

    /* renamed from: b */
    private final String f122865b;

    /* renamed from: c */
    private final String f122866c;

    public bjkr(Context context, String str, String str2) {
        this.f122864a = context;
        this.f122865b = str;
        this.f122866c = str2;
    }

    public final void run() {
        Context context = this.f122864a;
        String str = this.f122865b;
        String str2 = this.f122866c;
        int i = bjku.f122880m;
        Toast.makeText(context, String.format("Overriding MCC/MNC with %s and subscriberId with %s", str, str2), 0).show();
    }
}
