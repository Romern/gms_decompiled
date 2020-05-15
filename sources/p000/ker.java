package p000;

import android.net.Uri;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Date;

/* renamed from: ker */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ker implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bqgy f23948a;

    /* renamed from: b */
    final /* synthetic */ C1130key f23949b;

    public ker(C1130key key, bqgy bqgy) {
        this.f23949b = key;
        this.f23948a = bqgy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        kek kek = (kek) obj;
        byte[] a = this.f23949b.f23958c.mo14436a(kek.f23936a);
        C1130key key = this.f23949b;
        kex kex = key.f23960e;
        Uri uri = key.f23957b;
        Date from = Date.from(key.f23959d.instant().plus((TemporalAmount) Duration.ofDays(30)));
        kex.f23955a.mo60631a(uri, behv.m95070a(a), new beer[0]);
        beeu beeu = kex.f23955a;
        beeu.f111457b.mo25819b(new beet(beeu, uri, new begn(2, from)));
        this.f23948a.mo69138b(kek);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) C1130key.f23956a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Failed to fetch data for data source.");
        this.f23948a.mo69136a(th);
    }
}
