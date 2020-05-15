package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hik extends dck implements hil {

    /* renamed from: a */
    public final Context f19829a;

    /* renamed from: b */
    private final het f19830b;

    /* renamed from: c */
    private final String f19831c;

    public hik() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
    }

    /* renamed from: a */
    private final void m14388a(hep hep, hih hih) {
        bqga.m112781a(this.f19830b.mo12446a(hep, this.f19831c), new hpw(hih, false), bqfb.INSTANCE);
    }

    /* renamed from: b */
    private final void m14389b(hep hep, hih hih) {
        bqga.m112781a(this.f19830b.mo12446a(hep, this.f19831c), new hpx(hih, bmvz.f131120a), bqfb.INSTANCE);
    }

    /* renamed from: c */
    private final void m14390c(hep hep, hih hih) {
        bqga.m112781a(this.f19830b.mo12446a(hep, this.f19831c), new hpy(hih, bngx.m109376e()), bqfb.INSTANCE);
    }

    public hik(Context context, String str) {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        this.f19829a = context;
        this.f19830b = (het) het.f19617a.mo33309a();
        if (TextUtils.isEmpty(str)) {
            str = adbv.m50143a();
        } else {
            bmxy.m108581a(str);
        }
        this.f19831c = str;
    }

    /* renamed from: a */
    public final void mo12488a(hih hih) {
        m14388a(new hqp(this.f19829a), hih);
    }

    /* renamed from: a */
    public final void mo12489a(hih hih, Account account) {
        m14389b(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_GET_ACCOUNT_SETTINGS, new hpq(this, account)), hih);
    }

    /* renamed from: b */
    public final void mo12499b(hih hih, Account account, boolean z) {
        m14388a(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED, new hps(this, account, z)), hih);
    }

    /* renamed from: a */
    public final void mo12490a(hih hih, Account account, String str, Credential credential) {
        m14389b(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_SAVE_CREDENTIAL, new hpp(this, account, str, credential)), hih);
    }

    /* renamed from: a */
    public final void mo12491a(hih hih, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        m14389b(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_GET_FULL_CREDENTIAL, new hpo(this, account, str, credential, z, str2, str3)), hih);
    }

    /* renamed from: a */
    public final void mo12492a(hih hih, Account account, String str, String str2, String str3) {
        m14389b(new hqn(this.f19829a, account, str, str2, str3), hih);
    }

    /* renamed from: a */
    public final void mo12493a(hih hih, Account account, String str, boolean z) {
        m14388a(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_SET_APP_NEVER_SAVE, new hpu(this, account, str, z)), hih);
    }

    /* renamed from: a */
    public final void mo12494a(hih hih, Account account, boolean z) {
        m14388a(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_SET_SERVICE_ENABLED, new hpr(this, account, z)), hih);
    }

    /* renamed from: a */
    public final void mo12495a(hih hih, HintRequest hintRequest) {
        m14390c(new hql(this.f19829a, hintRequest), hih);
    }

    /* renamed from: a */
    public final void mo12496a(hih hih, String str) {
        m14388a(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_DISABLE_YOLO_SAVE_DIALOG_FOR_APP, new hpv(str)), hih);
    }

    /* renamed from: a */
    public final void mo12497a(hih hih, String str, CredentialRequest credentialRequest) {
        m14390c(new hqb(this.f19829a, str, credentialRequest), hih);
    }

    /* renamed from: a */
    public final void mo12498a(hih hih, String str, boolean z) {
        m14388a(hex.m14287a(adbj.AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED_FOR_APP, new hpt(str, z)), hih);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        hih hih;
        hih hih2;
        hih hih3 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface instanceof hih) {
                        hih3 = (hih) queryLocalInterface;
                    } else {
                        hih3 = new hif(readStrongBinder);
                    }
                }
                mo12497a(hih3, parcel.readString(), (CredentialRequest) dcl.m8163a(parcel, CredentialRequest.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    hih3 = queryLocalInterface2 instanceof hih ? (hih) queryLocalInterface2 : new hif(readStrongBinder2);
                }
                mo12495a(hih3, (HintRequest) dcl.m8163a(parcel, HintRequest.CREATOR));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface3 instanceof hih) {
                        hih = (hih) queryLocalInterface3;
                        mo12491a(hih, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), (Credential) dcl.m8163a(parcel, Credential.CREATOR), dcl.m8167a(parcel), parcel.readString(), parcel.readString());
                        break;
                    } else {
                        hih3 = new hif(readStrongBinder3);
                    }
                }
                hih = hih3;
                mo12491a(hih, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), (Credential) dcl.m8163a(parcel, Credential.CREATOR), dcl.m8167a(parcel), parcel.readString(), parcel.readString());
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface4 instanceof hih) {
                        hih2 = (hih) queryLocalInterface4;
                        mo12492a(hih2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readString());
                        break;
                    } else {
                        hih3 = new hif(readStrongBinder4);
                    }
                }
                hih2 = hih3;
                mo12492a(hih2, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface5 instanceof hih) {
                        hih3 = (hih) queryLocalInterface5;
                    } else {
                        hih3 = new hif(readStrongBinder5);
                    }
                }
                mo12490a(hih3, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), (Credential) dcl.m8163a(parcel, Credential.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface6 instanceof hih) {
                        hih3 = (hih) queryLocalInterface6;
                    } else {
                        hih3 = new hif(readStrongBinder6);
                    }
                }
                mo12489a(hih3, (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface7 instanceof hih) {
                        hih3 = (hih) queryLocalInterface7;
                    } else {
                        hih3 = new hif(readStrongBinder7);
                    }
                }
                mo12488a(hih3);
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface8 instanceof hih) {
                        hih3 = (hih) queryLocalInterface8;
                    } else {
                        hih3 = new hif(readStrongBinder8);
                    }
                }
                mo12494a(hih3, (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8167a(parcel));
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface9 instanceof hih) {
                        hih3 = (hih) queryLocalInterface9;
                    } else {
                        hih3 = new hif(readStrongBinder9);
                    }
                }
                mo12499b(hih3, (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8167a(parcel));
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface10 instanceof hih) {
                        hih3 = (hih) queryLocalInterface10;
                    } else {
                        hih3 = new hif(readStrongBinder10);
                    }
                }
                mo12498a(hih3, parcel.readString(), dcl.m8167a(parcel));
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface11 instanceof hih) {
                        hih3 = (hih) queryLocalInterface11;
                    } else {
                        hih3 = new hif(readStrongBinder11);
                    }
                }
                mo12493a(hih3, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), dcl.m8167a(parcel));
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks");
                    if (queryLocalInterface12 instanceof hih) {
                        hih3 = (hih) queryLocalInterface12;
                    } else {
                        hih3 = new hif(readStrongBinder12);
                    }
                }
                mo12496a(hih3, parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
