package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: akdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akdv {

    /* renamed from: a */
    public final String f71678a;

    /* renamed from: b */
    private final List f71679b = new ArrayList();

    /* renamed from: c */
    private boolean f71680c = true;

    /* renamed from: d */
    private ahfi f71681d;

    public akdv(String str) {
        this.f71678a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo39271a() {
        ahfi ahfi = this.f71681d;
        if (ahfi != null) {
            ahfi.mo36396b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo39276b() {
        this.f71680c = false;
        ahfi ahfi = this.f71681d;
        if (ahfi != null) {
            ahfi.mo36396b();
            this.f71681d = null;
        }
        List list = this.f71679b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            srn srn = ajvp.f71371a;
            ((Runnable) list.get(i)).run();
        }
        this.f71679b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo39272a(int i) {
        if (this.f71680c && i == 3) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdv", "a", 873, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Connection to endpoint %s has changed to a high quality medium.", this.f71678a);
            mo39276b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39273a(long j) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akdv", "a", 851, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("%s timed out for endpoint %s after %d ms.", "TransferManagerTimeoutAlarm", this.f71678a, Long.valueOf(j));
        mo39276b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo39274a(Runnable runnable) {
        if (this.f71680c) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akdv", "a", 819, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Connection to endpoint %s is waiting for a high quality medium, delaying payload transfer.", this.f71678a);
            this.f71679b.add(runnable);
            return;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo39275a(ScheduledExecutorService scheduledExecutorService) {
        if (this.f71680c && this.f71681d == null) {
            long br = cfov.f185185a.mo6606a().mo82370br();
            srn srn = ajvp.f71371a;
            this.f71681d = ahfi.m55635b(new akdu(this, br), br, scheduledExecutorService);
        }
    }
}
