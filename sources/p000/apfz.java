package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: apfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apfz extends dck implements apga {
    public apfz() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* renamed from: a */
    public void mo47167a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo47174b(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo47168a(Status status, AttestationData attestationData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo47169a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo47170a(Status status, RecaptchaResultData recaptchaResultData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo47171a(Status status, RemoveHarmfulAppData removeHarmfulAppData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo47172a(Status status, SafeBrowsingData safeBrowsingData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo47166a(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo47173a(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo47168a((Status) dcl.m8163a(parcel, Status.CREATOR), (AttestationData) dcl.m8163a(parcel, AttestationData.CREATOR));
        } else if (i == 2) {
            mo47173a(parcel.readString());
        } else if (i == 3) {
            mo47172a((Status) dcl.m8163a(parcel, Status.CREATOR), (SafeBrowsingData) dcl.m8163a(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            mo47166a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
        } else if (i == 6) {
            mo47170a((Status) dcl.m8163a(parcel, Status.CREATOR), (RecaptchaResultData) dcl.m8163a(parcel, RecaptchaResultData.CREATOR));
        } else if (i == 8) {
            mo47169a((Status) dcl.m8163a(parcel, Status.CREATOR), (HarmfulAppsInfo) dcl.m8163a(parcel, HarmfulAppsInfo.CREATOR));
        } else if (i == 15) {
            mo47171a((Status) dcl.m8163a(parcel, Status.CREATOR), (RemoveHarmfulAppData) dcl.m8163a(parcel, RemoveHarmfulAppData.CREATOR));
        } else if (i == 10) {
            mo47174b((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
        } else if (i != 11) {
            return false;
        } else {
            mo47167a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
