package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hij extends dcj implements hil {
    public hij(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
    }

    /* renamed from: a */
    public final void mo12488a(hih hih) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        mo8528b(7, bj);
    }

    /* renamed from: b */
    public final void mo12499b(hih hih, Account account, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        dcl.m8166a(bj, z);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo12489a(hih hih, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo12490a(hih hih, Account account, String str, Credential credential) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8165a(bj, credential);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo12491a(hih hih, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8165a(bj, credential);
        dcl.m8166a(bj, z);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo12492a(hih hih, Account account, String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo12493a(hih hih, Account account, String str, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo12494a(hih hih, Account account, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, account);
        dcl.m8166a(bj, z);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo12495a(hih hih, HintRequest hintRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        dcl.m8165a(bj, hintRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo12496a(hih hih, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        bj.writeString(str);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo12497a(hih hih, String str, CredentialRequest credentialRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        bj.writeString(str);
        dcl.m8165a(bj, credentialRequest);
        mo8528b(1, bj);
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
    public final void mo12498a(hih hih, String str, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hih);
        bj.writeString(str);
        dcl.m8166a(bj, true);
        mo8528b(10, bj);
    }
}
