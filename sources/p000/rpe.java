package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: rpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpe {

    /* renamed from: a */
    public static final Status f43478a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    public static final BasePendingResult[] f43479b = new BasePendingResult[0];

    /* renamed from: c */
    public final Set f43480c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final rpd f43481d = new rpd(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24980a(BasePendingResult basePendingResult) {
        this.f43480c.add(basePendingResult);
        basePendingResult.mo17717a(this.f43481d);
    }
}
