package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprint;
import java.io.IOException;
import java.util.List;

/* renamed from: acef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acef implements acjh {

    /* renamed from: a */
    private final rnt f59633a;

    /* renamed from: b */
    private final Account f59634b;

    /* renamed from: c */
    private final int f59635c;

    /* renamed from: d */
    private final int f59636d;

    /* renamed from: e */
    private final List f59637e;

    /* renamed from: f */
    private final bafu f59638f;

    public acef(rnt rnt, Account account, int i, int i2, List list, bafu bafu) {
        this.f59633a = rnt;
        this.f59634b = account;
        this.f59635c = i;
        this.f59636d = i2;
        this.f59637e = list;
        this.f59638f = bafu;
    }

    /* renamed from: a */
    public final void mo32708a() {
        bany b;
        try {
            bafv a = this.f59638f.mo55681a(this.f59634b, this.f59635c, this.f59636d);
            try {
                b = a.mo55696c().mo55799b();
                for (MdhFootprint mdhFootprint : this.f59637e) {
                    a.mo55689a(b, bxtx.m123261a(mdhFootprint.f79987a), mdhFootprint.f79989c);
                }
                b.mo55796b();
                b.close();
                if (a != null) {
                    a.close();
                }
                this.f59633a.mo11797a(Status.f30107a);
                return;
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException e) {
            this.f59633a.mo11797a(new Status(8, e.getMessage()));
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59633a.mo11797a(status);
    }
}
