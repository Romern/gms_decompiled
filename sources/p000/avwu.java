package p000;

import android.content.Context;
import com.google.android.gms.userlocation.internal.UserLocationClientIdentifier;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.HashMap;

/* renamed from: avwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avwu extends rjx {

    /* renamed from: b */
    private static final rjo f94044b = new rjo("UserLocation.SEMANTIC_LOCATION_PROVIDER_API", new avxl(), f94045c);

    /* renamed from: c */
    private static final rje f94045c = new rje();

    /* renamed from: a */
    public final UserLocationParameters f94046a;

    static {
        new HashMap();
    }

    public avwu(Context context, avww avww) {
        super(context, f94044b, avww, rjw.f43159a);
        this.f94046a = new UserLocationParameters(avww.f94050a, new UserLocationClientIdentifier(context.getPackageName(), avww.f94051b), avww.f94052c);
    }
}
