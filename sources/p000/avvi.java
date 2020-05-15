package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: avvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvi extends sbm {

    /* renamed from: b */
    public static final /* synthetic */ int f93970b = 0;

    /* renamed from: a */
    public final AtomicReference f93971a = new AtomicReference();

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return avtu.f93905c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof avuv) {
            return (avuv) queryLocalInterface;
        }
        return new avut(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12600000;
    }

    /* renamed from: j */
    public final void mo14032j() {
        try {
            avur avur = (avur) this.f93971a.getAndSet(null);
            if (avur != null) {
                ((avuv) mo25289B()).mo51633b(avur, new avvc());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.mo14032j();
    }

    public avvi(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 41, sat, rjz, rka);
    }

    /* renamed from: a */
    public final void mo51637a(avur avur, avur avur2, rlf rlf) {
        avvg avvg = new avvg((avuv) mo25289B(), rlf, null, avur2);
        if (avur != null) {
            ((avuv) mo25289B()).mo51634c(avur, avvg);
        } else if (avur2 != null) {
            ((avuv) mo25289B()).mo51629a(avur2, avvg);
        } else {
            rlf.mo9482a((Object) Status.f30107a);
        }
    }

    /* renamed from: a */
    public final void mo51638a(String str, byte[] bArr, String str2, int[] iArr, int i, Context context, ConsentInformation consentInformation, aucf aucf) {
        if (chdw.f188506a.mo6606a().mo85154a()) {
            ((avuv) mo25289B()).mo51631a(str, new avvb((avuv) mo25289B(), str, bArr, str2, iArr, i, context, aucf));
        } else {
            ((avuv) mo25289B()).mo51632a(str2, consentInformation, new avve(str, bArr, iArr, i, context, aucf));
        }
    }
}
