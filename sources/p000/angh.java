package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* renamed from: angh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angh extends dcj implements angj {
    public angh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    /* renamed from: a */
    public final void mo41783a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo41790b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo41793c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(14, bj);
    }

    /* renamed from: d */
    public final void mo41794d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: e */
    public final void mo41795e(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: f */
    public final void mo41796f(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(8, bj);
    }

    /* renamed from: g */
    public final void mo41797g(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo41784a(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(0);
        mo8530c(11, bj);
    }

    /* renamed from: b */
    public final void mo41791b(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo41785a(Status status, Configurations configurations) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, configurations);
        mo8530c(4, bj);
    }

    /* renamed from: b */
    public final void mo41792b(Status status, Configurations configurations) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, configurations);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo41786a(Status status, DogfoodsToken dogfoodsToken) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, dogfoodsToken);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo41787a(Status status, ExperimentTokens experimentTokens) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, experimentTokens);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo41788a(Status status, Flag flag) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, flag);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo41789a(Status status, FlagOverrides flagOverrides) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, flagOverrides);
        mo8530c(13, bj);
    }
}
