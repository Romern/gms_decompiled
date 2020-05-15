package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.AccountState;

/* renamed from: aovq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovq extends aove {

    /* renamed from: b */
    private final String f83693b;

    public aovq(aost aost, String str) {
        super(aost, "GetAccountState");
        this.f83693b = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        new Object[1][0] = this;
        aosi a = aosf.m69445a(context, this.f83693b);
        if (a == null) {
            this.f83667a.mo46830a(new Status(6000));
            return;
        }
        aory aory = new aory();
        if (a.f83511e != null) {
            for (int i = 0; i < 64; i++) {
                aory.f83503a[i] = Boolean.valueOf(aowr.m69719a(a.f83511e.longValue(), i));
            }
        }
        aost aost = this.f83667a;
        boolean[] zArr = new boolean[64];
        boolean[] zArr2 = new boolean[64];
        for (int i2 = 0; i2 < 64; i2++) {
            Boolean bool = aory.f83503a[i2];
            if (bool != null) {
                zArr[i2] = bool.booleanValue();
                zArr2[i2] = true;
            }
        }
        AccountState accountState = new AccountState(zArr, zArr2);
        Status status = new Status(0);
        Parcel bj = aost.mo8529bj();
        dcl.m8165a(bj, accountState);
        dcl.m8165a(bj, status);
        aost.mo8528b(7, bj);
    }
}
