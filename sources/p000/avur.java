package p000;

import android.os.Parcel;

/* renamed from: avur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avur extends dck implements avus {

    /* renamed from: a */
    private final rod f93941a;

    public avur() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
    }

    /* renamed from: a */
    public final void mo51627a() {
        this.f93941a.mo24968a(new avvh());
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo51627a();
        return true;
    }

    public avur(rod rod) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.f93941a = rod;
    }
}
