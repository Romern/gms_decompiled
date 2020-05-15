package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.StartBleScanRequest;

/* renamed from: zht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zht extends zhv {

    /* renamed from: a */
    final /* synthetic */ StartBleScanRequest f55105a;

    /* renamed from: b */
    final /* synthetic */ zhw f55106b;

    /* renamed from: c */
    final /* synthetic */ zew f55107c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zht(zhw zhw, StartBleScanRequest startBleScanRequest, zew zew) {
        super(zhw);
        this.f55106b = zhw;
        this.f55105a = startBleScanRequest;
        this.f55107c = zew;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31141a() {
        try {
            zew zew = this.f55107c;
            zew.mo8530c(2, zew.mo8529bj());
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) zhw.f55111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Couldn't send callback to caller");
        }
        this.f55106b.f55113c.remove(this.f55107c.f12819a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31142a(cacv cacv) {
        try {
            BleDevice a = yvv.m44921a(cacv);
            StartBleScanRequest startBleScanRequest = this.f55105a;
            if (!startBleScanRequest.f32311a.isEmpty()) {
                for (DataType dataType : a.f31984d) {
                    if (startBleScanRequest.f32311a.contains(dataType)) {
                    }
                }
                return;
            }
            zew zew = this.f55107c;
            Parcel bj = zew.mo8529bj();
            dcl.m8165a(bj, a);
            zew.mo8530c(1, bj);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) zhw.f55111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Couldn't send callback to caller");
        }
    }
}
