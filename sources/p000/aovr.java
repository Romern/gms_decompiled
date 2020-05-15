package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aovr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovr extends aove {

    /* renamed from: b */
    private final String f83694b;

    public aovr(aost aost, String str) {
        super(aost, "GetCustomizedSnoozePreset");
        this.f83694b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0031 A[ExcHandler: all (r10v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0026] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        new Object[1][0] = this;
        DataHolder b = sgq.m35237b(context, aosy.f83568a, new String[]{"morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, "account_name=?", new String[]{this.f83694b}, null);
        try {
            this.f83667a.mo46831a(b, Status.f30107a);
        } catch (RemoteException e) {
            this.f83667a.mo46831a((DataHolder) null, Status.f30109c);
        } catch (Throwable th) {
        }
        b.close();
        if (!aowz.m69769a(context)) {
            aowz.m69770b(context);
        }
    }
}
