package p000;

import android.content.Context;
import android.widget.Toast;

/* renamed from: akeq */
final /* synthetic */ class akeq implements Runnable {

    /* renamed from: a */
    private final akgy f71752a;

    /* renamed from: b */
    private final int f71753b;

    /* renamed from: c */
    private final String[] f71754c;

    /* renamed from: d */
    private final int f71755d;

    public akeq(akgy akgy, int i, String[] strArr, int i2) {
        this.f71752a = akgy;
        this.f71753b = i;
        this.f71754c = strArr;
        this.f71755d = i2;
    }

    public final void run() {
        akgy akgy = this.f71752a;
        int i = this.f71753b;
        String[] strArr = this.f71754c;
        int i2 = this.f71755d;
        Context context = akgy.f71939f;
        Toast.makeText(context, context.getString(i, (Object[]) strArr), i2).show();
    }
}
