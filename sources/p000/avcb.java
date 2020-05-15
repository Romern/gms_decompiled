package p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.List;

/* renamed from: avcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avcb implements rkk {

    /* renamed from: a */
    public final Status f92942a;

    /* renamed from: b */
    public final List f92943b;

    public avcb(Status status, List list) {
        this.f92942a = status;
        this.f92943b = Collections.unmodifiableList(list);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f92942a;
    }
}
