package p000;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: wdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdn {

    /* renamed from: a */
    public final Activity f50555a;

    /* renamed from: b */
    private final bycs f50556b;

    /* renamed from: c */
    private final bmyl f50557c;

    public wdn(bycs bycs, Activity activity, bmyl bmyl) {
        this.f50556b = bycs;
        this.f50555a = activity;
        this.f50557c = bmyl;
    }

    /* renamed from: b */
    private final Intent m41806b(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(this.f50556b.f165689h);
        intent.putExtra("com.android.browser.application_id", this.f50556b.f165689h);
        return intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29047a(Uri uri) {
        this.f50557c.mo12292a(new wdm(this, m41806b(uri)));
    }

    /* renamed from: a */
    public final boolean mo29048a() {
        return this.f50555a.getPackageManager().queryIntentActivities(m41806b(Uri.parse(this.f50556b.f165688g)), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).size() > 0;
    }

    /* renamed from: b */
    public final void mo29049b() {
        mo29047a(Uri.parse(this.f50556b.f165688g));
    }
}
