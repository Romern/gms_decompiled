package p000;

import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* renamed from: ajax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajax implements ajgp {

    /* renamed from: a */
    final /* synthetic */ ajaz f70287a;

    public ajax(ajaz ajaz) {
        this.f70287a = ajaz;
    }

    /* renamed from: a */
    public final void mo38311a(ahfv ahfv, byzy byzy) {
        List singletonList = Collections.singletonList(byzy);
        RemoteCallbackList remoteCallbackList = this.f70287a.f70289a;
        if (remoteCallbackList != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    bvhf bvhf = (bvhf) this.f70287a.f70289a.getBroadcastItem(i);
                    bxvd da = byva.f168407b.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byva byva = (byva) da.f164949b;
                    if (!byva.f168409a.mo73666a()) {
                        byva.f168409a = GeneratedMessageLite.m124021a(byva.f168409a);
                    }
                    bxsy.m123078a(singletonList, byva.f168409a);
                    byte[] k = ((byva) da.mo74062i()).serializeToBytes();
                    Parcel bj = bvhf.mo8529bj();
                    bj.writeByteArray(k);
                    bvhf.mo8530c(2, bj);
                } catch (RemoteException e) {
                } catch (Throwable th) {
                    this.f70287a.f70289a.finishBroadcast();
                    throw th;
                }
            }
            this.f70287a.f70289a.finishBroadcast();
        }
    }
}
