package p000;

import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: bfsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsh extends bfsf implements bgnt {

    /* renamed from: b */
    final /* synthetic */ bfsl f115118b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfsh(bfsl bfsl) {
        super(bfsl);
        this.f115118b = bfsl;
    }

    /* renamed from: E */
    public final void mo61097E() {
        bfsl bfsl = this.f115118b;
        bfsl.f115127b = 3;
        mo62204a(bfsl.f115132g);
    }

    /* renamed from: a */
    public final void mo62205a(ActivityRecognitionResult activityRecognitionResult) {
        int a = activityRecognitionResult.mo43491a().mo43513a();
        if (a == 0 || a == 1) {
            bfsl bfsl = this.f115118b;
            bfsl.f115127b = 1;
            mo62204a(bfsl.f115134i);
        } else if (a == 2) {
            bfsl bfsl2 = this.f115118b;
            bfsl2.f115127b = 2;
            mo62204a(bfsl2.f115132g);
        }
    }

    /* renamed from: b */
    public final void mo62207b() {
        bfsk bfsk = this.f115118b.f115135j;
        if (bfsk != null) {
            bfov bfov = (bfov) bfsk;
            if (!bfov.f114725d && bfov.f114724c) {
                bfov.f114723b.mo26010a(26, bfov.f114722a.f115126a);
                bfov.f114725d = true;
                ((bfsm) bfsk).mo62065f();
            }
        }
        bfsl bfsl = this.f115118b;
        bfvq bfvq = bfsl.f115128c;
        Looper looper = bfsl.f115129d;
        bfvq.f115433a = this;
        bfvq.f115434b = new adzt(looper);
        this.f115118b.f115128c.mo62309b();
        bfsl bfsl2 = this.f115118b;
        bfsl2.f115127b = 0;
        bfsl2.f115138m = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo62208c() {
        this.f115118b.f115128c.mo62323e();
        bfsk bfsk = this.f115118b.f115135j;
        if (bfsk != null) {
            bfov bfov = (bfov) bfsk;
            if (bfov.f114725d) {
                bfov.f114723b.mo26010a(27, bfov.f114722a.f115127b);
                bfov.f114725d = false;
                ((bfsm) bfsk).mo62065f();
            }
        }
        this.f115118b.f115126a = 0;
    }

    /* renamed from: d */
    public final void mo62209d() {
        mo62204a(this.f115118b.f115132g);
    }

    /* renamed from: a */
    public final void mo62206a(List list) {
        if (((double) ((Location) list.get(list.size() - 1)).getSpeed()) >= cewd.m138341d()) {
            bfsl bfsl = this.f115118b;
            bfsl.f115127b = 4;
            mo62204a(bfsl.f115134i);
        }
    }
}
