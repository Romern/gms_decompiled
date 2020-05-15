package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxc extends dcj implements bgxe {
    public bgxc(IBinder iBinder) {
        super(iBinder, "com.google.android.location.reporting.service.IPreferenceService");
    }

    /* renamed from: a */
    public final AccountConfig mo63304a(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        Parcel a = mo8526a(2, bj);
        AccountConfig accountConfig = (AccountConfig) dcl.m8163a(a, AccountConfig.CREATOR);
        a.recycle();
        return accountConfig;
    }

    /* renamed from: b */
    public final List mo63307b(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        Parcel a = mo8526a(5, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(RemoteDevice.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List mo63305a(Account account, int i, boolean z, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        dcl.m8166a(bj, z);
        bj.writeString(str);
        Parcel a = mo8526a(6, bj);
        ArrayList createTypedArrayList = a.createTypedArrayList(RemoteDevice.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: b */
    public final void mo63308b(Account account, String str, boolean z, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        bj.writeString(str2);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo63306a(Account account, String str, boolean z, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8166a(bj, z);
        bj.writeString(str2);
        mo8528b(3, bj);
    }
}
