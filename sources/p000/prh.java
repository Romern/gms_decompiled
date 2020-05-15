package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.firstparty.CastReceiver;
import com.google.android.gms.cast.firstparty.WifiRequestInfo;

/* renamed from: prh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prh extends dcj implements prj {
    public prh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.firstparty.internal.ICastFirstPartyService");
    }

    /* renamed from: a */
    public final void mo23555a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo23556a(String str, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23557a(String str, prf prf) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23559a(prg prg, WifiRequestInfo wifiRequestInfo, CastReceiver castReceiver) {
        throw null;
    }

    /* renamed from: b */
    public final void mo23562b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo23558a(String str, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8166a(bj, z);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo23560a(prm prm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, prm);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo23561a(prp prp) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, prp);
        mo8530c(2, bj);
    }
}
