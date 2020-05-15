package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActionUpdatedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActivityClosedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntrySubmittedEvent;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryValidationEvent;
import com.google.android.gms.wallet.analytics.events.OcrActivityLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OcrEnabledStateEvent;
import com.google.android.gms.wallet.analytics.events.OcrResultReceivedEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqg extends awqu {

    /* renamed from: a */
    public bphn f94849a;

    /* renamed from: b */
    String f94850b;

    public awqg() {
        this.f94849a = bphn.f137664E;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        boolean z;
        bphn bphn = this.f94849a;
        bxvd bxvd = (bxvd) bphn.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bphn);
        boolean z2 = false;
        if (walletAnalyticsEvent instanceof CreditCardEntryLaunchedEvent) {
            CreditCardEntryLaunchedEvent creditCardEntryLaunchedEvent = (CreditCardEntryLaunchedEvent) walletAnalyticsEvent;
            mo52467a(creditCardEntryLaunchedEvent.f109927d, context);
            bpje bpje = this.f94876k;
            bxvd bxvd2 = (bxvd) bpje.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bpje);
            String str = creditCardEntryLaunchedEvent.f109926c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpje bpje2 = (bpje) bxvd2.f164949b;
            bpje bpje3 = bpje.f137845k;
            str.getClass();
            bpje2.f137847a |= 32;
            bpje2.f137853g = str;
            this.f94876k = (bpje) bxvd2.mo74062i();
            this.f94877l = creditCardEntryLaunchedEvent.f109919b;
            int i = creditCardEntryLaunchedEvent.f109929f;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn2 = (bphn) bxvd.f164949b;
            bphn bphn3 = bphn.f137664E;
            bphn2.f137695z = i - 1;
            int i2 = bphn2.f137670a | 16777216;
            bphn2.f137670a = i2;
            bphn2.f137667B = creditCardEntryLaunchedEvent.f109928e.f137811u;
            bphn2.f137670a = i2 | 67108864;
            this.f94850b = creditCardEntryLaunchedEvent.f109918a;
        } else if (walletAnalyticsEvent instanceof CreditCardEntryActivityClosedEvent) {
            int i3 = ((CreditCardEntryActivityClosedEvent) walletAnalyticsEvent).f109925c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn4 = (bphn) bxvd.f164949b;
            int i4 = i3 - 1;
            bphn bphn5 = bphn.f137664E;
            if (i3 != 0) {
                bphn4.f137694y = i4;
                bphn4.f137670a |= 8388608;
            } else {
                throw null;
            }
        } else if (walletAnalyticsEvent instanceof CreditCardEntrySubmittedEvent) {
            CreditCardEntrySubmittedEvent creditCardEntrySubmittedEvent = (CreditCardEntrySubmittedEvent) walletAnalyticsEvent;
            int a = bphm.m111933a(creditCardEntrySubmittedEvent.f109930a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn6 = (bphn) bxvd.f164949b;
            int i5 = a - 1;
            bphn bphn7 = bphn.f137664E;
            if (a != 0) {
                bphn6.f137672c = i5;
                bphn6.f137670a |= 2;
                int a2 = bphm.m111933a(creditCardEntrySubmittedEvent.f109931b);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bphn bphn8 = (bphn) bxvd.f164949b;
                int i6 = a2 - 1;
                if (a2 != 0) {
                    bphn8.f137677h = i6;
                    bphn8.f137670a |= 64;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else if (walletAnalyticsEvent instanceof CreditCardEntryValidationEvent) {
            CreditCardEntryValidationEvent creditCardEntryValidationEvent = (CreditCardEntryValidationEvent) walletAnalyticsEvent;
            if (this.f94849a.f137674e || creditCardEntryValidationEvent.f109932a) {
                z = true;
            } else {
                z = false;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn9 = (bphn) bxvd.f164949b;
            bphn bphn10 = bphn.f137664E;
            int i7 = bphn9.f137670a | 8;
            bphn9.f137670a = i7;
            bphn9.f137674e = z;
            if (this.f94849a.f137679j || creditCardEntryValidationEvent.f109933b) {
                z2 = true;
            }
            bphn9.f137670a = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bphn9.f137679j = z2;
        } else if (walletAnalyticsEvent instanceof OcrActivityLaunchedEvent) {
            int i8 = this.f94849a.f137689t;
            if (i8 >= 0) {
                int i9 = i8 + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bphn bphn11 = (bphn) bxvd.f164949b;
                bphn bphn12 = bphn.f137664E;
                bphn11.f137670a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                bphn11.f137689t = i9;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bphn bphn13 = (bphn) bxvd.f164949b;
                bphn bphn14 = bphn.f137664E;
                bphn13.f137670a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                bphn13.f137689t = 1;
            }
        } else if (walletAnalyticsEvent instanceof OcrEnabledStateEvent) {
            OcrEnabledStateEvent ocrEnabledStateEvent = (OcrEnabledStateEvent) walletAnalyticsEvent;
            boolean z3 = ocrEnabledStateEvent.f109952a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn15 = (bphn) bxvd.f164949b;
            bphn bphn16 = bphn.f137664E;
            int i10 = 1 | bphn15.f137670a;
            bphn15.f137670a = i10;
            bphn15.f137671b = z3;
            int i11 = ocrEnabledStateEvent.f109953b;
            bphn15.f137670a = 33554432 | i10;
            bphn15.f137666A = i11;
        } else if (walletAnalyticsEvent instanceof OcrResultReceivedEvent) {
            OcrResultReceivedEvent ocrResultReceivedEvent = (OcrResultReceivedEvent) walletAnalyticsEvent;
            int i12 = ocrResultReceivedEvent.f109957d;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn17 = (bphn) bxvd.f164949b;
            int i13 = i12 - 1;
            bphn bphn18 = bphn.f137664E;
            if (i12 != 0) {
                bphn17.f137690u = i13;
                int i14 = bphn17.f137670a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                bphn17.f137670a = i14;
                boolean z4 = ocrResultReceivedEvent.f109954a;
                int i15 = i14 | 32;
                bphn17.f137670a = i15;
                bphn17.f137676g = z4;
                boolean z5 = ocrResultReceivedEvent.f109955b;
                int i16 = i15 | 4;
                bphn17.f137670a = i16;
                bphn17.f137673d = z5;
                boolean z6 = ocrResultReceivedEvent.f109956c;
                bphn17.f137670a = i16 | 128;
                bphn17.f137678i = z6;
            } else {
                throw null;
            }
        } else if (walletAnalyticsEvent instanceof CreditCardEntryActionUpdatedEvent) {
            CreditCardEntryAction creditCardEntryAction = ((CreditCardEntryActionUpdatedEvent) walletAnalyticsEvent).f109924a;
            int a3 = bphm.m111933a(creditCardEntryAction.f151725b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bphn bphn19 = (bphn) bxvd.f164949b;
            int i17 = a3 - 1;
            bphn bphn20 = bphn.f137664E;
            if (a3 != 0) {
                bphn19.f137672c = i17;
                int i18 = bphn19.f137670a | 2;
                bphn19.f137670a = i18;
                boolean z7 = creditCardEntryAction.f151727d;
                int i19 = i18 | 8;
                bphn19.f137670a = i19;
                bphn19.f137674e = z7;
                boolean z8 = creditCardEntryAction.f151724a;
                int i20 = i19 | 1;
                bphn19.f137670a = i20;
                bphn19.f137671b = z8;
                boolean z9 = creditCardEntryAction.f151726c;
                int i21 = i20 | 4;
                bphn19.f137670a = i21;
                bphn19.f137673d = z9;
                boolean z10 = creditCardEntryAction.f151728e;
                bphn19.f137670a = i21 | 16;
                bphn19.f137675f = z10;
                int a4 = bphm.m111933a(creditCardEntryAction.f151730g);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bphn bphn21 = (bphn) bxvd.f164949b;
                int i22 = a4 - 1;
                if (a4 != 0) {
                    bphn21.f137677h = i22;
                    int i23 = bphn21.f137670a | 64;
                    bphn21.f137670a = i23;
                    boolean z11 = creditCardEntryAction.f151732i;
                    int i24 = i23 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bphn21.f137670a = i24;
                    bphn21.f137679j = z11;
                    boolean z12 = creditCardEntryAction.f151729f;
                    int i25 = i24 | 32;
                    bphn21.f137670a = i25;
                    bphn21.f137676g = z12;
                    boolean z13 = creditCardEntryAction.f151731h;
                    int i26 = i25 | 128;
                    bphn21.f137670a = i26;
                    bphn21.f137678i = z13;
                    boolean z14 = creditCardEntryAction.f151733j;
                    bphn21.f137670a = i26 | 512;
                    bphn21.f137680k = z14;
                    int a5 = bphm.m111933a(creditCardEntryAction.f151735l);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bphn bphn22 = (bphn) bxvd.f164949b;
                    int i27 = a5 - 1;
                    if (a5 != 0) {
                        bphn22.f137682m = i27;
                        int i28 = bphn22.f137670a | 2048;
                        bphn22.f137670a = i28;
                        boolean z15 = creditCardEntryAction.f151737n;
                        int i29 = i28 | 8192;
                        bphn22.f137670a = i29;
                        bphn22.f137684o = z15;
                        boolean z16 = creditCardEntryAction.f151734k;
                        int i30 = i29 | 1024;
                        bphn22.f137670a = i30;
                        bphn22.f137681l = z16;
                        boolean z17 = creditCardEntryAction.f151736m;
                        int i31 = i30 | 4096;
                        bphn22.f137670a = i31;
                        bphn22.f137683n = z17;
                        boolean z18 = creditCardEntryAction.f151738o;
                        int i32 = i31 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bphn22.f137670a = i32;
                        bphn22.f137685p = z18;
                        int i33 = creditCardEntryAction.f151747x;
                        int i34 = i32 | 134217728;
                        bphn22.f137670a = i34;
                        bphn22.f137668C = i33;
                        int i35 = creditCardEntryAction.f151742s;
                        bphn22.f137670a = i34 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bphn22.f137689t = i35;
                        int a6 = bphz.m111946a(creditCardEntryAction.f151743t);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bphn bphn23 = (bphn) bxvd.f164949b;
                        int i36 = a6 - 1;
                        if (a6 != 0) {
                            bphn23.f137690u = i36;
                            int i37 = bphn23.f137670a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                            bphn23.f137670a = i37;
                            int i38 = creditCardEntryAction.f151748y;
                            int i39 = i37 | 268435456;
                            bphn23.f137670a = i39;
                            bphn23.f137669D = i38;
                            int i40 = creditCardEntryAction.f151744u;
                            bphn23.f137670a = i39 | 1048576;
                            bphn23.f137691v = i40;
                            int a7 = bphz.m111946a(creditCardEntryAction.f151745v);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bphn bphn24 = (bphn) bxvd.f164949b;
                            int i41 = a7 - 1;
                            if (a7 != 0) {
                                bphn24.f137692w = i41;
                                bphn24.f137670a |= 2097152;
                                int a8 = bpiq.m111963a(creditCardEntryAction.f151746w);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bphn bphn25 = (bphn) bxvd.f164949b;
                                int i42 = a8 - 1;
                                if (a8 != 0) {
                                    bphn25.f137693x = i42;
                                    int i43 = bphn25.f137670a | 4194304;
                                    bphn25.f137670a = i43;
                                    long j = creditCardEntryAction.f151739p;
                                    int i44 = i43 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                    bphn25.f137670a = i44;
                                    bphn25.f137686q = j;
                                    boolean z19 = creditCardEntryAction.f151740q;
                                    int i45 = i44 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                    bphn25.f137670a = i45;
                                    bphn25.f137687r = z19;
                                    boolean z20 = creditCardEntryAction.f151741r;
                                    bphn25.f137670a = i45 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    bphn25.f137688s = z20;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
            Log.e("CreditCardSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
        }
        this.f94849a = (bphn) bxvd.mo74062i();
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94850b;
    }

    public awqg(bjvz bjvz) {
        super(bjvz);
        this.f94849a = (bphn) bjvz.mo65576a((bxxk) bphn.f137664E.mo74142c(7), bphn.f137664E);
        this.f94850b = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94849a);
        bjwa.mo65582a(this.f94850b);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bphn bphn = this.f94849a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bphn.getClass();
        bpik.f137761c = bphn;
        bpik.f137759a |= 2;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94849a.f137694y);
        return (a == 0 || a == 1) ? false : true;
    }
}
