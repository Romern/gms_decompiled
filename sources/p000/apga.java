package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: apga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface apga extends IInterface {
    /* renamed from: a */
    void mo47167a(Status status);

    /* renamed from: a */
    void mo47168a(Status status, AttestationData attestationData);

    /* renamed from: a */
    void mo47169a(Status status, HarmfulAppsInfo harmfulAppsInfo);

    /* renamed from: a */
    void mo47170a(Status status, RecaptchaResultData recaptchaResultData);

    /* renamed from: a */
    void mo47171a(Status status, RemoveHarmfulAppData removeHarmfulAppData);

    /* renamed from: a */
    void mo47172a(Status status, SafeBrowsingData safeBrowsingData);

    /* renamed from: a */
    void mo47166a(Status status, boolean z);

    /* renamed from: a */
    void mo47173a(String str);

    /* renamed from: b */
    void mo47174b(Status status, boolean z);
}
