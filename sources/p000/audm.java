package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.telephonyspam.SettingsLookupResult;
import com.google.android.gms.telephonyspam.SpamLookupResult;

/* renamed from: audm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audm extends dcj implements IInterface {
    public audm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
    }

    /* renamed from: a */
    public final void mo50430a(Status status, SettingsLookupResult settingsLookupResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, settingsLookupResult);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo50431a(Status status, SpamLookupResult spamLookupResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, spamLookupResult);
        mo8530c(2, bj);
    }
}
