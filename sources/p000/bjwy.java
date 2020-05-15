package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.chimera.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bjwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwy implements bjww, bjwu {

    /* renamed from: a */
    static final long f123538a = TimeUnit.SECONDS.toMillis(300);

    /* renamed from: b */
    long f123539b;

    /* renamed from: c */
    String f123540c = "";

    /* renamed from: d */
    private final Activity f123541d;

    /* renamed from: e */
    private final NfcAdapter f123542e;

    /* renamed from: f */
    private final PendingIntent f123543f;

    /* renamed from: g */
    private final bjwu f123544g;

    /* renamed from: h */
    private bjwv f123545h;

    /* renamed from: i */
    private boolean f123546i;

    /* renamed from: j */
    private final Handler f123547j = new adzt();

    public bjwy(Activity activity, bjwu bjwu) {
        this.f123541d = activity;
        this.f123542e = NfcAdapter.getDefaultAdapter(activity);
        Activity activity2 = this.f123541d;
        this.f123543f = PendingIntent.getActivity(activity2, 0, new Intent(activity2, activity2.getContainerActivity().getClass()).addFlags(536870912), 0);
        this.f123544g = bjwu;
        this.f123546i = false;
    }

    /* renamed from: a */
    public final void mo65602a() {
        this.f123542e.enableForegroundDispatch(this.f123541d.getContainerActivity(), this.f123543f, null, null);
    }

    /* renamed from: b */
    public final void mo65604b() {
        this.f123542e.disableForegroundDispatch(this.f123541d.getContainerActivity());
    }

    /* renamed from: c */
    public final boolean mo65605c() {
        return this.f123542e.isEnabled();
    }

    /* renamed from: d */
    public final boolean mo65606d() {
        return this.f123546i;
    }

    /* renamed from: a */
    public final void mo39808a(int i, bjws bjws, long j) {
        this.f123546i = false;
        if (bjws != null) {
            if (!this.f123540c.equals(bjws.f123530a) || SystemClock.elapsedRealtime() - this.f123539b >= f123538a) {
                this.f123540c = bjws.f123530a;
            } else {
                mo65604b();
                this.f123547j.postDelayed(new bjwx(this), f123538a);
                i = 7;
                bjws = null;
            }
        }
        this.f123539b = SystemClock.elapsedRealtime();
        this.f123544g.mo39808a(i, bjws, j);
    }

    /* renamed from: a */
    public final void mo65603a(Intent intent) {
        this.f123546i = true;
        bjwv bjwv = new bjwv(this);
        this.f123545h = bjwv;
        bjwv.execute(intent);
    }
}
