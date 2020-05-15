package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.CheckInResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bifi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifi implements bieq {

    /* renamed from: a */
    public static final long f120445a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: b */
    public final CheckInReport f120446b;

    /* renamed from: c */
    private final avxg f120447c;

    public bifi(CheckInReport checkInReport, avxg avxg) {
        sdo.m34959a(checkInReport);
        sdo.m34959a(avxg);
        this.f120446b = checkInReport;
        this.f120447c = avxg;
    }

    /* renamed from: a */
    private final void m102239a(Status status, CheckInResponse checkInResponse) {
        try {
            this.f120447c.mo51684a(status, checkInResponse);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 3;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        boolean z;
        CheckInReport checkInReport = this.f120446b;
        if (checkInReport.f109555c != null) {
            z = true;
        } else {
            z = false;
        }
        int i = checkInReport.f109556d;
        bpqk a = bhqq.m101354a(placesParams, 7);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bxvd da = bprn.f138873d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprn bprn = (bprn) da.f164949b;
        int i2 = 1 | bprn.f138875a;
        bprn.f138875a = i2;
        bprn.f138876b = z;
        bprn.f138875a = i2 | 2;
        bprn.f138877c = i;
        bprn bprn2 = (bprn) da.mo74062i();
        bprw bprw = ((bpqk) bxvd.f164949b).f138754u;
        if (bprw == null) {
            bprw = bprw.f138909d;
        }
        bxvd bxvd2 = (bxvd) bprw.mo74142c(5);
        bxvd2.mo73625a((bxvk) bprw);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprw bprw2 = (bprw) bxvd2.f164949b;
        bprn2.getClass();
        bprw2.f138913c = bprn2;
        bprw2.f138911a |= 2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprw bprw3 = (bprw) bxvd2.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprw3.getClass();
        bpqk.f138754u = bprw3;
        bpqk.f138734a |= 1048576;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        CheckInResponse checkInResponse;
        Future a = bidp.mo64550a(this.f120446b, placesParams);
        bqgj a2 = snp.m35702a(10);
        try {
            if (cggg.f186820a.mo6606a().mo83698p()) {
                if (placesParams.f79574d != null) {
                    bhpt bhpt = new bhpt(context, new qws(context.getApplicationContext(), "LE", null), 1, a2);
                    checkInResponse = (CheckInResponse) aucu.m76782a(auzz.m78131a(context, new auzy(placesParams.f79574d)).mo24689a(new UdcCacheRequest(new int[]{1})).mo50365a(a2, new bifh(this, context, placesParams, bhpt)));
                    m102239a((Status) a.get(), checkInResponse);
                    a2.shutdown();
                }
            }
            checkInResponse = new avvw().mo51655a();
            m102239a((Status) a.get(), checkInResponse);
            a2.shutdown();
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage(), null, e2);
        } catch (Throwable th) {
            a2.shutdown();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102239a(status, null);
    }
}
