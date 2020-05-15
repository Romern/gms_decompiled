package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.processors.CreditCardRecognizer;
import java.util.Calendar;

/* renamed from: aktd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktd extends akuu {

    /* renamed from: a */
    private final Context f72710a;

    /* renamed from: b */
    private final CreditCardRecognizer f72711b;

    /* renamed from: c */
    private final Calendar f72712c;

    /* renamed from: d */
    private final akta f72713d;

    /* renamed from: e */
    private final boolean f72714e;

    /* renamed from: f */
    private final float f72715f;

    /* renamed from: g */
    private final float f72716g;

    /* renamed from: h */
    private final aksc f72717h;

    /* renamed from: i */
    private byte[] f72718i;

    public aktd(Context context, CreditCardRecognizer creditCardRecognizer, Calendar calendar, akta akta, boolean z, float f, float f2, aksc aksc) {
        this.f72710a = context;
        this.f72711b = creditCardRecognizer;
        this.f72712c = calendar;
        this.f72713d = akta;
        this.f72714e = z;
        this.f72715f = f;
        this.f72716g = f2;
        this.f72717h = aksc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72717h.mo39771e();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        aksy aksy = (aksy) obj;
        byte[] data = aksy.mo39890e().f81336b.getData();
        boolean z = true;
        ExpDateResult expDateResult = null;
        if (data != null) {
            int i = this.f72712c.get(1);
            CreditCardRecognizer creditCardRecognizer = this.f72711b;
            byte[] bArr = this.f72718i;
            creditCardRecognizer.f81311a.mo39895a();
            ExpDateResult nativeGetExpirationDate = creditCardRecognizer.nativeGetExpirationDate(data, bArr, i);
            if (nativeGetExpirationDate != null && this.f72714e) {
                if (!(nativeGetExpirationDate.f81297a == 0 || nativeGetExpirationDate.f81298b == null || !this.f72713d.mo39831a(nativeGetExpirationDate.mo44728b(), nativeGetExpirationDate.mo44727a()))) {
                    nativeGetExpirationDate.mo44729c();
                    if (nativeGetExpirationDate.f81298b.f72673a == 1) {
                    }
                }
            }
            expDateResult = nativeGetExpirationDate;
        }
        aksy.mo39825a(expDateResult);
        if (expDateResult == null) {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), aksy);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39836c(Object obj) {
        ((aksy) obj).mo39825a((ExpDateResult) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo39837d(Object obj) {
        aksy aksy = (aksy) obj;
        if (this.f72718i == null) {
            byte[] a = aktx.m60454a(this.f72710a, 2);
            this.f72718i = a;
            if (a.length > 0) {
                this.f72717h.mo39792u();
            }
        }
        return (this.f72718i.length <= 0 || aksy.mo39890e().f81335a == null || aksy.mo39890e().f81336b == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72717h.mo39770d(j);
    }
}
