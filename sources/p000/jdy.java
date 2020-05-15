package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionRequest;
import com.google.android.gms.auth.frp.UnlockFactoryResetProtectionResponse;

/* renamed from: jdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdy extends dck implements jdz {

    /* renamed from: a */
    private final ilw f22238a;

    /* renamed from: b */
    private final ixl f22239b;

    /* renamed from: c */
    private final Context f22240c;

    /* renamed from: d */
    private final adyd f22241d;

    /* renamed from: e */
    private final glh f22242e;

    public jdy() {
        super("com.google.android.gms.auth.frp.IFrpService");
    }

    /* renamed from: a */
    public final boolean mo13612a() {
        if (gli.m13382a(this.f22240c) || this.f22241d.mo33916a("com.google").length > 0) {
            return false;
        }
        if (this.f22242e.mo12015f() == null) {
            return this.f22242e.mo12010b().f10949c;
        }
        if (!this.f22242e.mo12013d()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo13613c() {
        return this.f22242e.mo12009a();
    }

    /* renamed from: d */
    public final FrpSnapshot mo13614d() {
        return this.f22242e.mo12010b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jdy(Context context) {
        super("com.google.android.gms.auth.frp.IFrpService");
        ilw ilw = new ilw(new ilq(context));
        ixl ixl = new ixl(context);
        adyd a = adyd.m51363a(context);
        glh a2 = glh.m13369a(context);
        sdo.m34959a(context);
        this.f22240c = context;
        sdo.m34959a(ilw);
        this.f22238a = ilw;
        sdo.m34959a(ixl);
        this.f22239b = ixl;
        sdo.m34959a(a);
        this.f22241d = a;
        sdo.m34959a(a2);
        this.f22242e = a2;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        AccountCredentials accountCredentials;
        UnlockFactoryResetProtectionResponse unlockFactoryResetProtectionResponse;
        String str;
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                int i3 = 0;
                if (i == 3) {
                    UnlockFactoryResetProtectionRequest unlockFactoryResetProtectionRequest = (UnlockFactoryResetProtectionRequest) dcl.m8163a(parcel, UnlockFactoryResetProtectionRequest.CREATOR);
                    this.f22238a.mo13128b(Binder.getCallingUid());
                    if (!TextUtils.isEmpty(unlockFactoryResetProtectionRequest.f10968d)) {
                        accountCredentials = new AccountCredentials(unlockFactoryResetProtectionRequest.f10968d);
                    } else {
                        accountCredentials = new AccountCredentials("com.google");
                    }
                    accountCredentials.f10829c = unlockFactoryResetProtectionRequest.f10966b;
                    accountCredentials.f10832f = unlockFactoryResetProtectionRequest.f10967c;
                    ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) this.f22239b.mo13426a(new ixg(accountCredentials));
                    int i4 = validateAccountCredentialsResponse.f10754b;
                    if (i4 != 0 || (str = validateAccountCredentialsResponse.f10755c) == null) {
                        if (i4 != 2) {
                            i2 = i4 != 3 ? 1 : 3;
                        }
                        unlockFactoryResetProtectionResponse = new UnlockFactoryResetProtectionResponse(i2);
                    } else {
                        CheckFactoryResetPolicyComplianceResponse a = this.f22239b.mo13424a(CheckFactoryResetPolicyComplianceRequest.m6563a(str));
                        if (a.f10600b) {
                            this.f22239b.mo13428a();
                        }
                        if (!a.f10600b) {
                            i3 = 4;
                        }
                        unlockFactoryResetProtectionResponse = new UnlockFactoryResetProtectionResponse(i3);
                    }
                    parcel2.writeNoException();
                    dcl.m8169b(parcel2, unlockFactoryResetProtectionResponse);
                } else if (i != 5) {
                    return false;
                } else {
                    FrpSnapshot d = mo13614d();
                    parcel2.writeNoException();
                    dcl.m8169b(parcel2, d);
                }
            } else {
                boolean c = mo13613c();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, c);
            }
        } else {
            boolean a2 = mo13612a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a2);
        }
        return true;
    }
}
