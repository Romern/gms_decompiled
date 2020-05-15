package p000;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: bjmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmh extends bjhy {

    /* renamed from: p */
    long f122964p;

    /* renamed from: q */
    boolean f122965q = false;

    /* renamed from: r */
    CountDownTimer f122966r;

    /* renamed from: s */
    private bwps f122967s;

    public bjmh(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m103919G() {
        bjmi bjmi = (bjmi) ((bjhy) this).f122754m;
        bjmi.f122969e = -1;
        bjmi.f122970f = null;
        m103920H();
        this.f122964p = -1;
    }

    /* renamed from: H */
    private final void m103920H() {
        CountDownTimer countDownTimer = this.f122966r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f122965q = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo65284E() {
        m103920H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putLong("timerStartMillis", this.f122964p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmi bjmi = (bjmi) ((bjhy) this).f122754m;
        return bjmi == null ? new bjmi() : bjmi;
    }

    /* renamed from: h */
    public final String mo65122h() {
        return ((bjmi) ((bjhy) this).f122754m).mo65378e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        int i;
        if (!this.f122965q) {
            int a = bwpr.m122192a(this.f122967s.f160599a);
            if (a == 0) {
                a = 1;
            }
            int i2 = this.f122967s.f160600b;
            if (a - 1 != 2) {
                i = 1;
            } else {
                i = 60;
            }
            long j = ((long) (i2 * i)) * 1000;
            if (this.f122964p != -1) {
                j -= SystemClock.elapsedRealtime() - this.f122964p;
            }
            if (j >= 0) {
                ((bjmi) ((bjhy) this).f122754m).mo65377a(j);
                this.f122966r = new bjmg(this, j);
                mo65121g();
                this.f122966r.start();
                this.f122965q = true;
                if (this.f122964p == -1) {
                    this.f122964p = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            }
            mo65255r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65259v() {
        m103919G();
        mo65121g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo65260w() {
        m103919G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65261x() {
        m103919G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        this.f122964p = -1;
        if (bundle != null && bundle.containsKey("timerStartMillis")) {
            this.f122964p = bundle.getLong("timerStartMillis");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        if (bwny == null) {
            mo65097a(new bjmj(this.f122639a));
        }
        bxvj bxvj = bwps.f160597e;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122967s = (bwps) b;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getTimeInstance();
        String str = this.f122967s.f160601c;
        if (TextUtils.isEmpty(str)) {
            str = "s";
        }
        simpleDateFormat.applyPattern(str);
        bjmi bjmi = (bjmi) ((bjhy) this).f122754m;
        bjmi.f122968d = simpleDateFormat;
        bjmi.f122970f = null;
    }
}
