package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.FloorChangeEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: besg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class besg extends berx {

    /* renamed from: k */
    private final List f112278k;

    public besg(berb berb) {
        this(berb, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo61092D() {
        mo61086j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61078a(long j) {
        if (!this.f112256b) {
            this.f112396d.f112186m.mo60960a(true);
            if (j == Long.MAX_VALUE) {
                mo61089m();
            } else if (!this.f112402j) {
                this.f112396d.mo60979b(SystemClock.elapsedRealtime() + j + (mo61079d().f112059a / 1000000));
            } else {
                mo61090n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo61076b() {
        return 36000000000L;
    }

    /* renamed from: c */
    public final void mo60950c(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.f112256b) {
            int a = activityRecognitionResult.mo43491a().mo43513a();
            List list = this.f112278k;
            Integer valueOf = Integer.valueOf(a);
            if (!list.contains(valueOf)) {
                this.f112278k.add(valueOf);
            } else {
                return;
            }
        }
        super.mo60950c(activityRecognitionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo61080e() {
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo61082f() {
        return "FullDetectorInPast";
    }

    /* renamed from: h */
    public final void mo61084h() {
        super.mo61084h();
        this.f112396d.mo60997m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo61086j() {
        this.f112278k.clear();
        super.mo61086j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo61087k() {
        if (!this.f112256b) {
            this.f112396d.f112186m.mo60960a(false);
            super.mo61087k();
        }
    }

    /* renamed from: p */
    public String mo61093p() {
        return "FullDetectingInPastState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final besc mo61079d() {
        if (!this.f112396d.f112114B.mo62860d()) {
            return this.f112396d.f112123K;
        }
        return null;
    }

    protected besg(berb berb, boolean z) {
        super(berb, z);
        this.f112278k = new ArrayList();
    }

    /* renamed from: b */
    public final void mo60949b(ActivityRecognitionResult activityRecognitionResult) {
        bxbm.m122539a(activityRecognitionResult);
        if (!this.f112256b) {
            this.f112396d.mo60967a(activityRecognitionResult);
            mo61081e(activityRecognitionResult);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61075a(String str) {
        if (!this.f112256b) {
            this.f112396d.f112186m.mo60960a(false);
            super.mo61075a(str);
        }
    }

    /* renamed from: a */
    public final void mo60948a(List list) {
        if (!this.f112256b) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                berf.m95534a(this.f112400h, (FloorChangeEvent) list.get(i));
            }
            this.f112398f.mo61011a(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61094a(boolean z) {
        new Object[1][0] = Boolean.valueOf(z);
        if (this.f112402j && this.f112396d.mo60976a(9)) {
            mo61107a((beti) new bese(this.f112396d));
        }
    }
}
