package p000;

import android.os.Build;
import com.google.android.gms.common.api.Scope;

/* renamed from: ydi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydi {
    @Deprecated

    /* renamed from: a */
    public static final rjo f53658a = yzz.f54883b;

    /* renamed from: b */
    public static final Scope f53659b = new Scope("https://www.googleapis.com/auth/fitness.activity.write");

    static {
        sgj sgj = zas.f54897a;
        sgj sgj2 = zap.f54895a;
        sgj sgj3 = zav.f54899a;
        sgj sgj4 = zai.f54889a;
        sgj sgj5 = zaf.f54887a;
        sgj sgj6 = zac.f54885a;
        int i = Build.VERSION.SDK_INT;
        new Scope("https://www.googleapis.com/auth/fitness.activity.read");
        new Scope("https://www.googleapis.com/auth/fitness.location.read");
        new Scope("https://www.googleapis.com/auth/fitness.location.write");
        new Scope("https://www.googleapis.com/auth/fitness.body.read");
        new Scope("https://www.googleapis.com/auth/fitness.body.write");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.read");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.write");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.read");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.write");
    }
}
