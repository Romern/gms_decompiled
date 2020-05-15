package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: aagz */
public final /* synthetic */ class aagz implements Callable {

    /* renamed from: a */
    private final aahd f28101a;

    public aagz(aahd aahd) {
        this.f28101a = aahd;
    }

    public final Object call() {
        Context context = this.f28101a.f28105a;
        return aagl.m21220a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
