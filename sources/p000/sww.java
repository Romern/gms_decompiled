package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Map;

/* renamed from: sww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sww extends dcj implements swy {
    public sww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.config.internal.IConfigCallbacks");
    }

    /* renamed from: a */
    public final void mo26197a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, fetchConfigIpcResponse);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo26216a(Status status, Map map) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeMap(map);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo26217a(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
