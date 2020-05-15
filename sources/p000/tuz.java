package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import com.google.android.gms.credential.manager.util.LottieView;
import java.util.HashMap;

/* renamed from: tuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tuz extends Fragment {

    /* renamed from: a */
    private final HashMap f46705a = new HashMap();

    /* renamed from: a */
    public static tuz m37509a(Activity activity) {
        return (tuz) activity.getSupportFragmentManager().findFragmentByTag("RetainedCleanupFragment");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        FadeInImageView.m22917a();
        LottieView.m22921e();
        this.f46705a.clear();
    }

    /* renamed from: a */
    public final Object mo26821a(Class cls) {
        if (this.f46705a.containsKey(cls)) {
            return cls.cast(this.f46705a.get(cls));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26822a(Class cls, Object obj) {
        this.f46705a.containsKey(cls);
        this.f46705a.put(cls, obj);
    }
}
