package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: jw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1120jw {

    /* renamed from: a */
    private final Intent f23387a;

    private C1120jw(Context context, ComponentName componentName) {
        C1244oj.m19766a(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f23387a = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        this.f23387a.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        this.f23387a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
        this.f23387a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        this.f23387a.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
    }

    /* renamed from: a */
    public static C1120jw m17408a(Activity activity) {
        C1244oj.m19766a(activity);
        return new C1120jw(activity, activity.getComponentName());
    }

    /* renamed from: b */
    public final void mo14163b(String str) {
        this.f23387a.setType(str);
    }

    /* renamed from: a */
    public final Intent mo14160a() {
        if ("android.intent.action.SEND_MULTIPLE".equals(this.f23387a.getAction())) {
            this.f23387a.setAction("android.intent.action.SEND");
            this.f23387a.removeExtra("android.intent.extra.STREAM");
        }
        return this.f23387a;
    }

    /* renamed from: a */
    public final void mo14161a(CharSequence charSequence) {
        this.f23387a.putExtra("android.intent.extra.TEXT", charSequence);
    }

    /* renamed from: a */
    public final void mo14162a(String str) {
        this.f23387a.putExtra("android.intent.extra.SUBJECT", str);
    }
}
