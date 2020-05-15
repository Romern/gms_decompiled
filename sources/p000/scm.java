package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;

/* renamed from: scm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class scm extends Binder implements scn {
    public scm() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16737a(int i, sck sck, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25272a(sck sck) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: sci} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: sci} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sci} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: android.os.IBinder} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        sck sck;
        String str;
        String str2;
        String str3;
        IBinder iBinder;
        Bundle bundle;
        String[] strArr;
        String str4;
        String str5;
        String[] strArr2;
        Bundle bundle2;
        String str6;
        Bundle bundle3;
        int i3 = i;
        Parcel parcel3 = parcel;
        if (i3 > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel3.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        IBinder readStrongBinder = parcel.readStrongBinder();
        GetServiceRequest getServiceRequest = null;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            sck = queryLocalInterface instanceof sck ? (sck) queryLocalInterface : new sci(readStrongBinder);
        } else {
            sck = null;
        }
        if (i3 == 46) {
            if (parcel.readInt() != 0) {
                getServiceRequest = (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(parcel3);
            }
            mo25273a(sck, getServiceRequest);
        } else if (i3 != 47) {
            int readInt = parcel.readInt();
            if (i3 != 4) {
                str = parcel.readString();
            } else {
                str = null;
            }
            if (i3 != 1) {
                if (!(i3 == 2 || i3 == 23 || i3 == 25 || i3 == 27)) {
                    if (i3 != 30) {
                        if (i3 != 34) {
                            if (!(i3 == 41 || i3 == 43 || i3 == 37 || i3 == 38)) {
                                switch (i3) {
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                        break;
                                    case 9:
                                        str4 = parcel.readString();
                                        strArr = parcel.createStringArray();
                                        String readString = parcel.readString();
                                        iBinder = parcel.readStrongBinder();
                                        String readString2 = parcel.readString();
                                        if (parcel.readInt() == 0) {
                                            str2 = readString2;
                                            str3 = readString;
                                            bundle = null;
                                            break;
                                        } else {
                                            str2 = readString2;
                                            str3 = readString;
                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                            break;
                                        }
                                    case 10:
                                        str4 = parcel.readString();
                                        strArr = parcel.createStringArray();
                                        bundle = null;
                                        iBinder = null;
                                        str3 = null;
                                        str2 = null;
                                        break;
                                    case 19:
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (parcel.readInt() != 0) {
                                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                                            strArr = null;
                                            str3 = null;
                                        } else {
                                            strArr = null;
                                            bundle = null;
                                            str3 = null;
                                        }
                                        str2 = str3;
                                        iBinder = readStrongBinder2;
                                        str4 = str2;
                                        break;
                                    case 20:
                                        break;
                                    default:
                                        str4 = null;
                                        strArr = null;
                                        bundle = null;
                                        iBinder = null;
                                        str3 = null;
                                        str2 = null;
                                        break;
                                }
                            }
                        } else {
                            str4 = parcel.readString();
                            strArr = null;
                            bundle = null;
                            iBinder = null;
                            str3 = null;
                            str2 = null;
                        }
                    }
                    String[] createStringArray = parcel.createStringArray();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                        str6 = null;
                    } else {
                        bundle3 = null;
                        str6 = null;
                    }
                    str3 = str6;
                    str2 = str3;
                    strArr = createStringArray;
                    str4 = readString3;
                    iBinder = str6;
                }
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                    str4 = null;
                    strArr2 = null;
                    str5 = null;
                } else {
                    str4 = null;
                    strArr2 = null;
                    bundle2 = null;
                    str5 = null;
                }
                str3 = str5;
                str2 = str3;
                iBinder = str5;
            } else {
                String readString4 = parcel.readString();
                strArr = parcel.createStringArray();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    iBinder = null;
                    str2 = null;
                    str3 = readString4;
                    str4 = readString5;
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel3);
                } else {
                    iBinder = null;
                    str2 = null;
                    str3 = readString4;
                    str4 = readString5;
                    bundle = null;
                }
            }
            mo16737a(i, sck, readInt, str, str4, strArr, bundle, iBinder, str3, str2);
        } else {
            if (parcel.readInt() != 0) {
                ValidateAccountRequest validateAccountRequest = (ValidateAccountRequest) ValidateAccountRequest.CREATOR.createFromParcel(parcel3);
            }
            mo25272a(sck);
        }
        parcel2.writeNoException();
        return true;
    }
}
