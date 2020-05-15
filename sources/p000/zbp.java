package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.DebugInfoRequest;
import com.google.android.gms.fitness.request.GetFileUriRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import com.google.android.gms.fitness.result.DataReadResult;

/* renamed from: zbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbp extends dck implements zbq {

    /* renamed from: a */
    final /* synthetic */ zne f54905a;

    /* renamed from: b */
    private final ytu f54906b;

    public zbp() {
        super("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    /* renamed from: a */
    public final void mo30910a(DataDeleteRequest dataDeleteRequest) {
        this.f54906b.mo30771a(2, dataDeleteRequest);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbp(zne zne, ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        this.f54905a = zne;
        this.f54906b = ytu;
    }

    /* renamed from: a */
    public final void mo30911a(DataInsertRequest dataInsertRequest) {
        this.f54906b.mo30771a(1, dataInsertRequest);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final void mo30912a(DataReadRequest dataReadRequest) {
        try {
            zne zne = this.f54905a;
            srn srn = zne.f55533d;
            Context context = zne.f55428a;
            bnia j = bnic.m109500j();
            j.mo67752b(bnjd.m109575a((Iterable) dataReadRequest.f32215a, zmz.f55521a));
            j.mo67752b(bnjd.m109575a((Iterable) dataReadRequest.f32216b, zna.f55522a));
            zdk.m45325a(context, j.mo67751a(), this.f54906b.f54621a);
            this.f54906b.mo30771a(0, dataReadRequest);
        } catch (zdj e) {
            zax zax = dataReadRequest.f32229o;
            sdo.m34959a(zax);
            zax.mo30899a(DataReadResult.m23714a(new Status(5025), dataReadRequest.f32215a, dataReadRequest.f32216b));
        }
    }

    /* renamed from: a */
    public final void mo30913a(GetSyncInfoRequest getSyncInfoRequest) {
        this.f54905a.mo31237b(this.f54906b.f54621a);
        this.f54906b.mo30771a(3, getSyncInfoRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo30912a((DataReadRequest) dcl.m8163a(parcel, DataReadRequest.CREATOR));
                break;
            case 2:
                mo30911a((DataInsertRequest) dcl.m8163a(parcel, DataInsertRequest.CREATOR));
                break;
            case 3:
                mo30910a((DataDeleteRequest) dcl.m8163a(parcel, DataDeleteRequest.CREATOR));
                break;
            case 4:
                mo30913a((GetSyncInfoRequest) dcl.m8163a(parcel, GetSyncInfoRequest.CREATOR));
                break;
            case 5:
                this.f54905a.mo31237b(this.f54906b.f54621a);
                this.f54906b.mo30771a(4, (ReadStatsRequest) dcl.m8163a(parcel, ReadStatsRequest.CREATOR));
                break;
            case 6:
                this.f54905a.mo31237b(this.f54906b.f54621a);
                this.f54906b.mo30771a(5, (ReadRawRequest) dcl.m8163a(parcel, ReadRawRequest.CREATOR));
                break;
            case 7:
                this.f54906b.mo30771a(6, (DailyTotalRequest) dcl.m8163a(parcel, DailyTotalRequest.CREATOR));
                break;
            case 8:
                this.f54905a.mo31237b(this.f54906b.f54621a);
                this.f54906b.mo30771a(7, (DataInsertRequest) dcl.m8163a(parcel, DataInsertRequest.CREATOR));
                break;
            case 9:
                this.f54906b.mo30771a(8, (DataUpdateRequest) dcl.m8163a(parcel, DataUpdateRequest.CREATOR));
                break;
            case 10:
                this.f54906b.mo30771a(9, (DataUpdateListenerRegistrationRequest) dcl.m8163a(parcel, DataUpdateListenerRegistrationRequest.CREATOR));
                break;
            case 11:
                this.f54906b.mo30771a(10, (DataUpdateListenerUnregistrationRequest) dcl.m8163a(parcel, DataUpdateListenerUnregistrationRequest.CREATOR));
                break;
            case 12:
                this.f54905a.mo31237b(this.f54906b.f54621a);
                this.f54906b.mo30771a(11, (GetFileUriRequest) dcl.m8163a(parcel, GetFileUriRequest.CREATOR));
                break;
            case 13:
                this.f54905a.mo31237b(this.f54906b.f54621a);
                this.f54906b.mo30771a(12, (DebugInfoRequest) dcl.m8163a(parcel, DebugInfoRequest.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
