package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountController;

/* renamed from: juz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddAccountController[i];
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
        boolean z11;
        boolean z12;
        boolean z13;
        Account account;
        rrl rrl;
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
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Intent intent = (Intent) parcel2.readParcelable(systemClassLoader);
        Account account2 = (Account) parcel2.readParcelable(systemClassLoader);
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Intent intent2 = (Intent) parcel2.readParcelable(systemClassLoader);
        String readString7 = parcel.readString();
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
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str = readString7;
        String readString8 = parcel.readString();
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
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        String str2 = readString8;
        ManagedAuthOptions a2 = ManagedAuthOptions.m6596a(parcel.createByteArray());
        D2dOptions a3 = D2dOptions.m6592a(parcel.createByteArray());
        Bundle bundle = (Bundle) parcel2.readParcelable(rrl.class.getClassLoader());
        if (bundle != null) {
            account = account2;
            rrl = rrl.m34298a(Integer.valueOf(bundle.getInt("desired_flow", 0)));
        } else {
            account = account2;
            rrl = new rrl(0);
        }
        jva a4 = AddAccountController.m6918a();
        a4.f23288a = new imw(rpr.m34216b());
        a4.f23289b = new jvl(rpr.m34216b());
        a4.f23290c = accountAuthenticatorResponse;
        a4.f23291d = readString;
        a4.f23292e = z;
        a4.f23293f = z2;
        a4.f23294g = a;
        a4.f23295h = z3;
        a4.f23296i = readString2;
        a4.f23297j = readString3;
        a4.f23298k = readString4;
        a4.f23299l = createStringArray;
        a4.f23300m = readString5;
        a4.f23301n = readString6;
        a4.f23302o = Process.myUserHandle().isOwner();
        a4.f23303p = z4;
        a4.f23304q = intent;
        a4.f23305r = account;
        a4.f23306s = z5;
        a4.f23307t = intent2;
        a4.f23308u = str;
        a4.f23309v = z6;
        a4.f23310w = z7;
        a4.f23311x = z8;
        a4.f23312y = str2;
        a4.f23313z = z9;
        a4.f23281A = z10;
        a4.f23282B = z11;
        a4.f23283C = z12;
        a4.f23284D = z13;
        a4.f23285E = a2;
        a4.f23286F = a3;
        a4.f23287G = rrl;
        return a4.mo14142a();
    }
}
