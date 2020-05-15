package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: apfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfy extends dcj implements apga {
    public apfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* renamed from: a */
    public final void mo47167a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(11, bj);
    }

    /* renamed from: b */
    public final void mo47174b(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo47168a(Status status, AttestationData attestationData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, attestationData);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo47169a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, harmfulAppsInfo);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo47170a(Status status, RecaptchaResultData recaptchaResultData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, recaptchaResultData);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo47171a(Status status, RemoveHarmfulAppData removeHarmfulAppData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, removeHarmfulAppData);
        mo8530c(15, bj);
    }

    /* renamed from: a */
    public final void mo47172a(Status status, SafeBrowsingData safeBrowsingData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, safeBrowsingData);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo47166a(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo47173a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(2, bj);
    }
}
