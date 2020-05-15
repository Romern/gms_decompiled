package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import com.google.android.gms.languageprofile.LanguageFluencyParams;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;

/* renamed from: adwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adwi extends dck implements adwj {
    public adwi() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        adwh adwh = null;
        rnt rnt = null;
        rnt rnt2 = null;
        adwh adwh2 = null;
        adwh adwh3 = null;
        switch (i) {
            case 1:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeString(mo33863a());
                return true;
            case 2:
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    adwh = queryLocalInterface instanceof adwh ? (adwh) queryLocalInterface : new adwh(readStrongBinder);
                }
                mo33864a(readString, adwh);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString2 = parcel.readString();
                LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) dcl.m8163a(parcel, LanguagePreferenceParams.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    if (queryLocalInterface2 instanceof adwh) {
                        adwh3 = (adwh) queryLocalInterface2;
                    } else {
                        adwh3 = new adwh(readStrongBinder2);
                    }
                }
                mo33867a(readString2, languagePreferenceParams, adwh3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                LanguageFluencyParams languageFluencyParams = (LanguageFluencyParams) dcl.m8163a(parcel, LanguageFluencyParams.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
                    if (queryLocalInterface3 instanceof adwh) {
                        adwh2 = (adwh) queryLocalInterface3;
                    } else {
                        adwh2 = new adwh(readStrongBinder3);
                    }
                }
                mo33866a(readString3, languageFluencyParams, adwh2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString4 = parcel.readString();
                ClientLanguageSettings clientLanguageSettings = (ClientLanguageSettings) dcl.m8163a(parcel, ClientLanguageSettings.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface4;
                    } else {
                        rnt2 = new rnr(readStrongBinder4);
                    }
                }
                mo33865a(readString4, clientLanguageSettings, rnt2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface5;
                    } else {
                        rnt = new rnr(readStrongBinder5);
                    }
                }
                mo33868a(readString5, rnt);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
