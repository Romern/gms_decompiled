package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.Arrays;

/* renamed from: acfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfz implements afmu {

    /* renamed from: a */
    private final cayo f59734a;

    /* renamed from: b */
    private final int f59735b;

    /* renamed from: c */
    private final byte[] f59736c;

    /* renamed from: d */
    private FootprintsRecordingSetting f59737d;

    /* renamed from: e */
    private final afmr f59738e;

    public acfz(cayo cayo, afmr afmr, int i, byte[] bArr) {
        this.f59734a = cayo;
        this.f59738e = afmr;
        this.f59735b = i;
        this.f59736c = bArr;
    }

    /* renamed from: a */
    private final FootprintsRecordingSetting m49042a(MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        for (MdhFootprint mdhFootprint : mdhFootprintListSafeParcelable.f80015a) {
            if (Arrays.equals(this.f59736c, mdhFootprint.f79988b)) {
                try {
                    byip a = bafi.m86742a(mdhFootprint.f79987a);
                    return new FootprintsRecordingSetting(this.f59735b, a.f166590a, a.f166591b, mdhFootprint.f79989c);
                } catch (bxwf e) {
                    ((acdc) this.f59734a.mo16713a()).mo32707a("MDH Proto exception while parsing RecordingSettings", e);
                    return null;
                }
            }
        }
        return null;
    }

    public final IBinder asBinder() {
        return this.f59738e.f12819a;
    }

    /* renamed from: a */
    public final void mo32719a(rnt rnt, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        synchronized (this.f59738e) {
            this.f59737d = m49042a(mdhFootprintListSafeParcelable);
            rnt.mo11797a(Status.f30107a);
        }
    }

    /* renamed from: a */
    public final void mo32720a(rnt rnt, SyncStatus syncStatus) {
        synchronized (this.f59738e) {
            afmr afmr = this.f59738e;
            FootprintsRecordingSetting footprintsRecordingSetting = this.f59737d;
            Parcel bj = afmr.mo8529bj();
            dcl.m8164a(bj, rnt);
            dcl.m8165a(bj, footprintsRecordingSetting);
            dcl.m8165a(bj, syncStatus);
            afmr.mo8530c(1, bj);
        }
    }

    /* renamed from: a */
    public final void mo32721a(rnt rnt, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        synchronized (this.f59738e) {
            this.f59737d = m49042a(mdhFootprintListSafeParcelable);
            rnt.mo11797a(Status.f30107a);
        }
    }
}
