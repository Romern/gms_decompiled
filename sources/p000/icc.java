package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: icc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icc implements rkk {

    /* renamed from: a */
    public final Status f20721a;

    /* renamed from: b */
    public String f20722b;

    public icc(Status status) {
        sdo.m34959a(status);
        this.f20721a = status;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f20721a;
    }

    public icc(String str) {
        sdo.m34959a((Object) str);
        this.f20722b = str;
        this.f20721a = Status.f30107a;
    }
}
