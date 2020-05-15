package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: antv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antv extends dcj implements antx {
    public antv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusService");
    }

    /* renamed from: a */
    public final void mo42280a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, favaDiagnosticsEntity);
        dcl.m8165a(bj, favaDiagnosticsEntity2);
        mo8528b(46, bj);
    }
}
