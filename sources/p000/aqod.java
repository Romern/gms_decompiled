package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: aqod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqod extends dcj implements aqof {
    public aqod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo47997a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo48002a(ResolveAccountRequest resolveAccountRequest, sct sct) {
        throw null;
    }

    /* renamed from: c */
    public final void mo48008c() {
        throw null;
    }

    /* renamed from: a */
    public final void mo47998a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo47999a(int i, Account account, aqoc aqoc) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, account);
        dcl.m8164a(bj, aqoc);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo48000a(aqoc aqoc) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aqoc);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo48001a(AuthAccountRequest authAccountRequest, aqoc aqoc) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, authAccountRequest);
        dcl.m8164a(bj, aqoc);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo48003a(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, aqoc aqoc) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, recordConsentByConsentResultRequest);
        dcl.m8164a(bj, aqoc);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo48004a(RecordConsentRequest recordConsentRequest, aqoc aqoc) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, recordConsentRequest);
        dcl.m8164a(bj, aqoc);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo48005a(SignInRequest signInRequest, aqoc aqoc) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, signInRequest);
        dcl.m8164a(bj, aqoc);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo48006a(scb scb, int i, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, scb);
        bj.writeInt(i);
        dcl.m8166a(bj, z);
        mo8528b(9, bj);
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
    public final void mo48007a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, false);
        mo8528b(13, bj);
    }
}
