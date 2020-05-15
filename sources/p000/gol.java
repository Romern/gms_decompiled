package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: gol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gol extends dcj implements gon {
    public gol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IAccountDataService");
    }

    /* renamed from: a */
    public final void mo12096a(gop gop, ClearTokenRequest clearTokenRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12097a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12098a(got got, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12099a(gou gou, Account account) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12101a(gpb gpb, Account account) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12102a(gpc gpc, TokenRequest tokenRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12103a(gpd gpd, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12100a(gpa gpa, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gpa);
        dcl.m8165a(bj, account);
        mo8528b(6, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo12104a(rnt rnt, Account account, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, account);
        dcl.m8166a(bj, false);
        mo8528b(1, bj);
    }
}
