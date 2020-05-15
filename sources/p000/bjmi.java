package p000;

import java.text.SimpleDateFormat;

/* renamed from: bjmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmi extends bjhs {

    /* renamed from: d */
    public SimpleDateFormat f122968d;

    /* renamed from: e */
    long f122969e = -1;

    /* renamed from: f */
    String f122970f = null;

    public bjmi() {
        super(bwnw.f160405e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65377a(long j) {
        if (j < 0) {
            j = -1;
        }
        this.f122969e = j;
        this.f122970f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        if (this.f122969e == -1) {
            return bwnw.f160404d;
        }
        bxvd da = bwnw.f160404d.mo74144da();
        int i = (int) this.f122969e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwnw bwnw = (bwnw) da.f164949b;
        bwnw.f160407a |= 1;
        bwnw.f160408b = i;
        String e = mo65378e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwnw bwnw2 = (bwnw) da.f164949b;
        e.getClass();
        bwnw2.f160407a |= 2;
        bwnw2.f160409c = e;
        return (bwnw) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo65378e() {
        if (this.f122970f == null) {
            long j = this.f122969e;
            if (j == -1) {
                this.f122970f = "";
            } else {
                try {
                    this.f122970f = this.f122968d.format(Long.valueOf(j));
                } catch (IllegalArgumentException e) {
                    this.f122969e = -1;
                    this.f122970f = "";
                }
            }
        }
        return this.f122970f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        long j;
        bwnw bwnw = (bwnw) bxxc;
        if ((bwnw.f160407a & 1) != 0) {
            j = (long) bwnw.f160408b;
        } else {
            j = -1;
        }
        mo65377a(j);
    }
}
