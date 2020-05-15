package p000;

import com.google.android.gms.beacon.BleSettings;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aikr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikr extends airo {

    /* renamed from: a */
    public final BleSettings f69055a;

    /* renamed from: b */
    private final neg f69056b;

    /* renamed from: c */
    private final nej f69057c;

    /* renamed from: d */
    private final Runnable f69058d;

    /* renamed from: e */
    private final ScheduledExecutorService f69059e;

    /* renamed from: f */
    private ahfi f69060f;

    public aikr(neg neg, nej nej, BleSettings bleSettings, Runnable runnable, ScheduledExecutorService scheduledExecutorService, ahfk ahfk) {
        super(35, ahfk);
        this.f69056b = neg;
        this.f69057c = nej;
        this.f69055a = bleSettings;
        this.f69058d = runnable;
        this.f69059e = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo37566a() {
        ahfi ahfi = this.f69060f;
        if (ahfi != null) {
            ahfi.mo36396b();
            this.f69060f = null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        aucb a = this.f69056b.mo20513a(this.f69057c);
        a.mo50373a(aiko.f69052a);
        a.mo50372a(aikp.f69053a);
        a.mo50371a(new aikq(countDownLatch));
        try {
            countDownLatch.await(cfnv.m140794r(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikr", "a", 2800, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Failed to stop BLE Legacy only scanning, timed out after %d seconds.", cfnv.m140794r());
        }
    }

    /* renamed from: b */
    public final int mo37568b() {
        bqgy c = bqgy.m112818c();
        aucb a = this.f69056b.mo20514a(this.f69057c, this.f69055a);
        a.mo50373a(new aikm(c));
        a.mo50372a(new aikn(this, c));
        try {
            c.get(cfnv.m140793q(), TimeUnit.SECONDS);
            srn srn = ailf.f69111a;
            this.f69060f = ahfi.m55634a(this.f69058d, cfnv.m140791o(), this.f69059e);
            return 2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikr", "b", 2763, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while waiting to start BLE Legacy only scanning.");
            return 3;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aikr", "b", 2766, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to start BLE Legacy only scanning with settings %s.", this.f69055a);
            return 4;
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("aikr", "b", 2769, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68423a("Failed to start BLE Legacy only scanning with settings %s in %d seconds.", this.f69055a, cfnv.m140793q());
            return 4;
        }
    }
}
