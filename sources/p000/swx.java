package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Map;

/* renamed from: swx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class swx extends dck implements swy {
    public swx() {
        super("com.google.android.gms.config.internal.IConfigCallbacks");
    }

    /* renamed from: a */
    public void mo26197a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        throw null;
    }

    /* renamed from: a */
    public final void mo26216a(Status status, Map map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo26217a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo26217a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
        } else if (i == 2) {
            mo26216a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8170c(parcel));
        } else if (i != 4) {
            return false;
        } else {
            mo26197a((Status) dcl.m8163a(parcel, Status.CREATOR), (FetchConfigIpcResponse) dcl.m8163a(parcel, FetchConfigIpcResponse.CREATOR));
        }
        return true;
    }
}
