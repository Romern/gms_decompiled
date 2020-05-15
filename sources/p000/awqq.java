package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqq extends awqu {

    /* renamed from: a */
    String f94869a;

    /* renamed from: b */
    public final bxvd f94870b;

    public awqq() {
        this.f94870b = bpjh.f137858l.mo74144da();
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof OwFullWalletRequestedEvent) {
            OwFullWalletRequestedEvent owFullWalletRequestedEvent = (OwFullWalletRequestedEvent) walletAnalyticsEvent;
            bxvd bxvd = this.f94870b;
            boolean a = awxj.m81403a(owFullWalletRequestedEvent.f109975c);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpjh bpjh = (bpjh) bxvd.f164949b;
            bpjh bpjh2 = bpjh.f137858l;
            bpjh.f137860a |= 2048;
            bpjh.f137869j = a;
            mo52467a(owFullWalletRequestedEvent.f109975c, context);
            bxvd bxvd2 = this.f94870b;
            int i = owFullWalletRequestedEvent.f109984l;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpjh bpjh3 = (bpjh) bxvd2.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                bpjh3.f137861b = i2;
                bpjh3.f137860a |= 1;
                bxvd bxvd3 = this.f94870b;
                int i3 = owFullWalletRequestedEvent.f109976d;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bpjh bpjh4 = (bpjh) bxvd3.f164949b;
                bpjh4.f137860a |= 2;
                bpjh4.f137862c = i3;
                bxvd bxvd4 = this.f94870b;
                int a2 = bpjg.m111981a(owFullWalletRequestedEvent.f109977e);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bpjh bpjh5 = (bpjh) bxvd4.f164949b;
                int i4 = a2 - 1;
                if (a2 != 0) {
                    bpjh5.f137863d = i4;
                    bpjh5.f137860a |= 4;
                    bxvd bxvd5 = this.f94870b;
                    int i5 = owFullWalletRequestedEvent.f109979g;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bpjh bpjh6 = (bpjh) bxvd5.f164949b;
                    bpjh6.f137860a |= 32;
                    bpjh6.f137866g = i5;
                    bxvd bxvd6 = this.f94870b;
                    boolean z = owFullWalletRequestedEvent.f109980h;
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bpjh bpjh7 = (bpjh) bxvd6.f164949b;
                    bpjh7.f137860a |= 16;
                    bpjh7.f137865f = z;
                    bxvd bxvd7 = this.f94870b;
                    long j = owFullWalletRequestedEvent.f109981i;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bpjh bpjh8 = (bpjh) bxvd7.f164949b;
                    bpjh8.f137860a |= 128;
                    bpjh8.f137867h = j;
                    bxvd bxvd8 = this.f94870b;
                    int a3 = bpij.m111956a(owFullWalletRequestedEvent.f109982j);
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    bpjh bpjh9 = (bpjh) bxvd8.f164949b;
                    int i6 = a3 - 1;
                    if (a3 != 0) {
                        bpjh9.f137868i = i6;
                        bpjh9.f137860a |= 1024;
                        bxvd bxvd9 = this.f94870b;
                        String str = owFullWalletRequestedEvent.f109983k;
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        bpjh bpjh10 = (bpjh) bxvd9.f164949b;
                        str.getClass();
                        bpjh10.f137860a |= 8;
                        bpjh10.f137864e = str;
                        bxvd bxvd10 = this.f94870b;
                        int i7 = owFullWalletRequestedEvent.f109978f;
                        if (bxvd10.f164950c) {
                            bxvd10.mo74035c();
                            bxvd10.f164950c = false;
                        }
                        bpjh bpjh11 = (bpjh) bxvd10.f164949b;
                        bpjh11.f137860a |= 4096;
                        bpjh11.f137870k = i7;
                        this.f94877l = owFullWalletRequestedEvent.f109919b;
                        this.f94869a = owFullWalletRequestedEvent.f109918a;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("OwFullWalltSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94869a;
    }

    public awqq(bjvz bjvz) {
        super(bjvz);
        bpjh bpjh = (bpjh) bjvz.mo65576a((bxxk) bpjh.f137858l.mo74142c(7), bpjh.f137858l);
        bxvd bxvd = (bxvd) bpjh.mo74142c(5);
        bxvd.mo73625a((bxvk) bpjh);
        this.f94870b = bxvd;
        this.f94869a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94870b.mo74062i());
        bjwa.mo65582a(this.f94869a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bxvd bxvd2 = this.f94870b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpjh bpjh = (bpjh) bxvd2.mo74062i();
        bpik bpik2 = bpik.f137757s;
        bpjh.getClass();
        bpik.f137765g = bpjh;
        bpik.f137759a |= 32;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(((bpjh) this.f94870b.f164949b).f137861b);
        return (a == 0 || a == 1) ? false : true;
    }
}
