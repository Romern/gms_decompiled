package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.speech.VoiceUnlockState;

/* renamed from: asea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asea extends dcj implements IInterface {
    public asea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.speech.internal.IVoiceUnlockCallbacks");
    }

    /* renamed from: a */
    public final void mo49079a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo49080a(Status status, VoiceUnlockState voiceUnlockState) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, voiceUnlockState);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo49081a(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(3, bj);
    }
}
