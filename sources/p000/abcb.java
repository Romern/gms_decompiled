package p000;

import android.app.Activity;
import android.content.Context;

/* renamed from: abcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcb extends rjx {

    /* renamed from: a */
    public static final aarf f57033a = new abca();

    /* renamed from: b */
    public final Activity f57034b;

    public abcb(Activity activity) {
        super(activity, aarj.f56366a, (rjk) null, rjw.f43159a);
        this.f57034b = activity;
    }

    public abcb(Context context) {
        super(context, aarj.f56366a, (rjk) null, rjw.f43159a);
        this.f57034b = null;
    }

    public abcb(com.google.android.chimera.Activity activity) {
        super(activity, aarj.f56366a, rjw.f43159a);
        this.f57034b = activity.getContainerActivity();
    }
}
