package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: ahje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahje extends aigt {

    /* renamed from: a */
    final /* synthetic */ aigi f67267a;

    public ahje(aigi aigi) {
        this.f67267a = aigi;
    }

    /* renamed from: a */
    public final void mo36573a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        aigi aigi = this.f67267a;
        int i = onStartAdvertisingResultParams.f80601a;
        String str = onStartAdvertisingResultParams.f80602b;
        Parcel bj = aigi.mo8529bj();
        bj.writeInt(i);
        bj.writeString(str);
        aigi.mo8528b(1009, bj);
    }
}
