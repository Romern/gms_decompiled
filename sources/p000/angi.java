package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* renamed from: angi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angi extends dck implements angj {

    /* renamed from: a */
    private final aucf f76807a;

    public angi() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    /* renamed from: a */
    public final void mo41783a(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: b */
    public final void mo41790b(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: c */
    public final void mo41793c(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: d */
    public final void mo41794d(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: e */
    public final void mo41795e(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: f */
    public final void mo41796f(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: g */
    public final void mo41797g(Status status) {
        rpc.m34201a(status, this.f76807a);
    }

    /* renamed from: a */
    public final void mo41784a(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f76807a);
    }

    /* renamed from: b */
    public final void mo41791b(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f76807a);
    }

    public angi(aucf aucf) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f76807a = aucf;
    }

    /* renamed from: a */
    public final void mo41785a(Status status, Configurations configurations) {
        rpc.m34202a(status, configurations, this.f76807a);
    }

    /* renamed from: b */
    public final void mo41792b(Status status, Configurations configurations) {
        rpc.m34202a(status, configurations, this.f76807a);
    }

    /* renamed from: a */
    public final void mo41786a(Status status, DogfoodsToken dogfoodsToken) {
        rpc.m34202a(status, dogfoodsToken, this.f76807a);
    }

    /* renamed from: a */
    public final void mo41787a(Status status, ExperimentTokens experimentTokens) {
        rpc.m34202a(status, experimentTokens, this.f76807a);
    }

    /* renamed from: a */
    public final void mo41788a(Status status, Flag flag) {
        rpc.m34202a(status, flag, this.f76807a);
    }

    /* renamed from: a */
    public final void mo41789a(Status status, FlagOverrides flagOverrides) {
        rpc.m34202a(status, flagOverrides, this.f76807a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo41783a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo41790b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo41794d((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 4:
                mo41785a((Status) dcl.m8163a(parcel, Status.CREATOR), (Configurations) dcl.m8163a(parcel, Configurations.CREATOR));
                return true;
            case 5:
                mo41795e((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo41787a((Status) dcl.m8163a(parcel, Status.CREATOR), (ExperimentTokens) dcl.m8163a(parcel, ExperimentTokens.CREATOR));
                return true;
            case 7:
                mo41786a((Status) dcl.m8163a(parcel, Status.CREATOR), (DogfoodsToken) dcl.m8163a(parcel, DogfoodsToken.CREATOR));
                return true;
            case 8:
                mo41796f((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 9:
                mo41788a((Status) dcl.m8163a(parcel, Status.CREATOR), (Flag) dcl.m8163a(parcel, Flag.CREATOR));
                return true;
            case 10:
                mo41792b((Status) dcl.m8163a(parcel, Status.CREATOR), (Configurations) dcl.m8163a(parcel, Configurations.CREATOR));
                return true;
            case 11:
                mo41784a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 12:
                mo41797g((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 13:
                mo41789a((Status) dcl.m8163a(parcel, Status.CREATOR), (FlagOverrides) dcl.m8163a(parcel, FlagOverrides.CREATOR));
                return true;
            case 14:
                mo41793c((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 15:
                rpc.m34201a((Status) dcl.m8163a(parcel, Status.CREATOR), this.f76807a);
                return true;
            case 16:
                mo41791b((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            default:
                return false;
        }
    }
}
