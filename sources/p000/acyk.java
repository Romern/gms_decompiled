package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: acyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyk extends dcj implements IInterface {
    public acyk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.accounts.service.IAccountDataCallbacks");
    }

    /* renamed from: a */
    public final void mo33241a(AccountData accountData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, accountData);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo33242a(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8528b(1, bj);
    }
}
