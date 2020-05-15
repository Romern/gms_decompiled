package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.FinishAddAccountSessionController;

/* renamed from: jvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinishAddAccountSessionController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Parcel parcel2 = parcel;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcel2.readParcelable(systemClassLoader);
        String readString = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        rrq a = rrq.m34308a((Bundle) parcel2.readParcelable(systemClassLoader));
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        String readString5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        Account account = (Account) parcel2.readParcelable(systemClassLoader);
        String readString6 = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new FinishAddAccountSessionController(accountAuthenticatorResponse, readString, z, z2, a, readString2, readString3, readString4, z3, z4, readString5, z5, z6, z7, account, readString6, z8, z9, z10, parcel.readString());
    }
}
