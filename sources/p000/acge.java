package p000;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;

/* renamed from: acge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acge {

    /* renamed from: a */
    public final byhq f59751a;

    /* renamed from: b */
    public final MdhFootprint f59752b;

    /* renamed from: c */
    public final LatestFootprintFilter f59753c;

    /* renamed from: d */
    public final bngx f59754d;

    /* renamed from: e */
    public final SyncStatus f59755e;

    public acge(byhq byhq, MdhFootprint mdhFootprint) {
        this.f59751a = byhq;
        this.f59752b = mdhFootprint;
        this.f59753c = null;
        this.f59754d = null;
        this.f59755e = null;
    }

    public acge(LatestFootprintFilter latestFootprintFilter, Iterable iterable) {
        this.f59751a = null;
        this.f59752b = null;
        this.f59753c = latestFootprintFilter;
        this.f59754d = bngx.m109355a(iterable);
        this.f59755e = null;
    }

    public acge(SyncStatus syncStatus) {
        this.f59751a = null;
        this.f59752b = null;
        this.f59753c = null;
        this.f59754d = null;
        this.f59755e = syncStatus;
    }
}
