package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwAccountChangedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwChooserShownEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.OwUserFoundToHavePreAuthEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqs extends awqu {

    /* renamed from: a */
    String f94872a;

    /* renamed from: b */
    public final bxvd f94873b;

    public awqs() {
        this.f94873b = bpjl.f137879m.mo74144da();
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof OwMaskedWalletRequestedEvent) {
            OwMaskedWalletRequestedEvent owMaskedWalletRequestedEvent = (OwMaskedWalletRequestedEvent) walletAnalyticsEvent;
            mo52467a(owMaskedWalletRequestedEvent.f109993c, context);
            this.f94877l = owMaskedWalletRequestedEvent.f109919b;
            bxvd bxvd = this.f94873b;
            boolean a = awxj.m81403a(owMaskedWalletRequestedEvent.f109993c);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpjl bpjl = (bpjl) bxvd.f164949b;
            bpjl bpjl2 = bpjl.f137879m;
            bpjl.f137881a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpjl.f137888h = a;
            bxvd bxvd2 = this.f94873b;
            boolean z = owMaskedWalletRequestedEvent.f109994d;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpjl bpjl3 = (bpjl) bxvd2.f164949b;
            bpjl3.f137881a |= 8192;
            bpjl3.f137891k = z;
            this.f94872a = owMaskedWalletRequestedEvent.f109918a;
        } else if (walletAnalyticsEvent instanceof OwMwAccountChangedEvent) {
            this.f94872a = ((OwMwAccountChangedEvent) walletAnalyticsEvent).f109918a;
        } else if (walletAnalyticsEvent instanceof OwMwUnsuccessfulEvent) {
            OwMwUnsuccessfulEvent owMwUnsuccessfulEvent = (OwMwUnsuccessfulEvent) walletAnalyticsEvent;
            bxvd bxvd3 = this.f94873b;
            int i = owMwUnsuccessfulEvent.f109995c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bpjl bpjl4 = (bpjl) bxvd3.f164949b;
            bpjl bpjl5 = bpjl.f137879m;
            bpjl4.f137881a |= 8;
            bpjl4.f137885e = i;
            bxvd bxvd4 = this.f94873b;
            int i2 = owMwUnsuccessfulEvent.f109999g;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bpjl bpjl6 = (bpjl) bxvd4.f164949b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bpjl6.f137884d = i3;
                bpjl6.f137881a |= 4;
                bxvd bxvd5 = this.f94873b;
                int a2 = bpij.m111956a(owMwUnsuccessfulEvent.f109997e);
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bpjl bpjl7 = (bpjl) bxvd5.f164949b;
                int i4 = a2 - 1;
                if (a2 != 0) {
                    bpjl7.f137889i = i4;
                    bpjl7.f137881a |= 512;
                    bxvd bxvd6 = this.f94873b;
                    String a3 = awjn.m80013a(owMwUnsuccessfulEvent.f109998f);
                    if (bxvd6.f164950c) {
                        bxvd6.mo74035c();
                        bxvd6.f164950c = false;
                    }
                    bpjl bpjl8 = (bpjl) bxvd6.f164949b;
                    a3.getClass();
                    bpjl8.f137881a |= 128;
                    bpjl8.f137887g = a3;
                    bxvd bxvd7 = this.f94873b;
                    int i5 = owMwUnsuccessfulEvent.f109996d;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bpjl bpjl9 = (bpjl) bxvd7.f164949b;
                    bpjl9.f137881a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bpjl9.f137892l = i5;
                    return;
                }
                throw null;
            }
            throw null;
        } else if (walletAnalyticsEvent instanceof OwUserFoundToHavePreAuthEvent) {
            bxvd bxvd8 = this.f94873b;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bpjl bpjl10 = (bpjl) bxvd8.f164949b;
            bpjl bpjl11 = bpjl.f137879m;
            bpjl10.f137881a |= 1;
            bpjl10.f137882b = true;
        } else if (walletAnalyticsEvent instanceof OwMwChooserShownEvent) {
            bxvd bxvd9 = this.f94873b;
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            bpjl bpjl12 = (bpjl) bxvd9.f164949b;
            bpjl bpjl13 = bpjl.f137879m;
            bpjl12.f137881a |= 2;
            bpjl12.f137883c = true;
        } else if (walletAnalyticsEvent instanceof OwMaskedWalletReceivedEvent) {
            OwMaskedWalletReceivedEvent owMaskedWalletReceivedEvent = (OwMaskedWalletReceivedEvent) walletAnalyticsEvent;
            bxvd bxvd10 = this.f94873b;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            bpjl bpjl14 = (bpjl) bxvd10.f164949b;
            bpjl bpjl15 = bpjl.f137879m;
            bpjl14.f137884d = 1;
            bpjl14.f137881a |= 4;
            bxvd bxvd11 = this.f94873b;
            boolean z2 = owMaskedWalletReceivedEvent.f109989c;
            if (bxvd11.f164950c) {
                bxvd11.mo74035c();
                bxvd11.f164950c = false;
            }
            bpjl bpjl16 = (bpjl) bxvd11.f164949b;
            bpjl16.f137881a |= 64;
            bpjl16.f137886f = z2;
            bxvd bxvd12 = this.f94873b;
            int a4 = bpij.m111956a(owMaskedWalletReceivedEvent.f109990d);
            if (bxvd12.f164950c) {
                bxvd12.mo74035c();
                bxvd12.f164950c = false;
            }
            bpjl bpjl17 = (bpjl) bxvd12.f164949b;
            int i6 = a4 - 1;
            if (a4 != 0) {
                bpjl17.f137889i = i6;
                bpjl17.f137881a |= 512;
                bxvd bxvd13 = this.f94873b;
                String str = owMaskedWalletReceivedEvent.f109991e;
                if (bxvd13.f164950c) {
                    bxvd13.mo74035c();
                    bxvd13.f164950c = false;
                }
                bpjl bpjl18 = (bpjl) bxvd13.f164949b;
                str.getClass();
                bpjl18.f137881a |= 128;
                bpjl18.f137887g = str;
                bxvd bxvd14 = this.f94873b;
                int i7 = owMaskedWalletReceivedEvent.f109992f;
                if (bxvd14.f164950c) {
                    bxvd14.mo74035c();
                    bxvd14.f164950c = false;
                }
                bpjl bpjl19 = (bpjl) bxvd14.f164949b;
                bpjl19.f137881a |= 4096;
                bpjl19.f137890j = i7;
                return;
            }
            throw null;
        } else {
            String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
            Log.e("OwMwSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
        }
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94872a;
    }

    public awqs(bjvz bjvz) {
        super(bjvz);
        bpjl bpjl = (bpjl) bjvz.mo65576a((bxxk) bpjl.f137879m.mo74142c(7), bpjl.f137879m);
        bxvd bxvd = (bxvd) bpjl.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bpjl);
        this.f94873b = bxvd;
        this.f94872a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94873b.mo74062i());
        bjwa.mo65582a(this.f94872a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bxvd bxvd2 = this.f94873b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpjl bpjl = (bpjl) bxvd2.mo74062i();
        bpik bpik2 = bpik.f137757s;
        bpjl.getClass();
        bpik.f137764f = bpjl;
        bpik.f137759a |= 16;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(((bpjl) this.f94873b.f164949b).f137884d);
        return (a == 0 || a == 1) ? false : true;
    }
}
