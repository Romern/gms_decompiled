package p000;

import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: afab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afab extends TelephonyManager.CellInfoCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f64079a;

    public afab(bqgy bqgy) {
        this.f64079a = bqgy;
    }

    public final void onCellInfo(List list) {
        this.f64079a.mo69138b(list);
    }
}
