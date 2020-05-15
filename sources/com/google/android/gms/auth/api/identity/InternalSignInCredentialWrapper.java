package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hve();

    /* renamed from: a */
    public static final Scope f10227a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f10228b = new Scope("email");

    /* renamed from: c */
    public static final Scope f10229c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f10230d = new Scope("https://www.googleapis.com/auth/userinfo.profile");

    /* renamed from: e */
    public static final Scope f10231e = new Scope("https://www.googleapis.com/auth/userinfo.email");

    /* renamed from: f */
    public final Account f10232f;

    /* renamed from: g */
    public final SignInCredential f10233g;

    /* renamed from: h */
    public final List f10234h;

    /* renamed from: i */
    public final boolean f10235i;

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z) {
        sdo.m34959a(account);
        this.f10232f = account;
        sdo.m34959a(signInCredential);
        this.f10233g = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f10253f)) {
            sdo.m34975b(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            sdo.m34975b(!z, "Converted credentials should not contain the original password");
        }
        sdo.m34959a(list);
        this.f10234h = list;
        this.f10235i = z;
    }

    /* renamed from: a */
    public final boolean mo7477a() {
        return this.f10235i || !TextUtils.isEmpty(this.f10233g.f10253f) || this.f10234h.contains(f10229c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalSignInCredentialWrapper) {
            InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
            if (this.f10235i != internalSignInCredentialWrapper.f10235i || !sdg.m34949a(this.f10232f, internalSignInCredentialWrapper.f10232f) || !sdg.m34949a(this.f10233g, internalSignInCredentialWrapper.f10233g) || !sdg.m34949a(this.f10234h, internalSignInCredentialWrapper.f10234h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10232f, this.f10233g, this.f10234h, Boolean.valueOf(this.f10235i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10232f, i, false);
        see.m35040a(parcel, 2, this.f10233g, i, false);
        see.m35066c(parcel, 3, this.f10234h, false);
        see.m35051a(parcel, 4, this.f10235i);
        see.m35062b(parcel, a);
    }
}
