package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.wallet.analytics.events.TapAndPayCallEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwt extends bjuq {
    public awwt(Context context, rjx rjx) {
        super(context, rjx, new awfw());
    }

    /* renamed from: a */
    public final bjux mo52690a(Object obj) {
        if (obj instanceof BuyFlowConfig) {
            ApplicationParameters applicationParameters = ((BuyFlowConfig) obj).f110418b;
            return ((applicationParameters != null && applicationParameters.f110406a == 22) || ((Boolean) awie.f94419o.mo58455c()).booleanValue()) ? this.f123364c : this.f123363b;
        }
        throw new IllegalArgumentException("Expect a BuyFlowConfig object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo52692b(Object obj) {
        if (!(obj instanceof BuyFlowConfig)) {
            throw new IllegalArgumentException("Expect a BuyFlowConfig object");
        } else if (((BuyFlowConfig) obj).f110418b.f110406a == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52691a(int i, String str, String str2, long j, rkk rkk, int i2, Object obj) {
        int i3;
        String str3 = str2;
        int i4 = i2;
        Object obj2 = obj;
        if (obj2 instanceof BuyFlowConfig) {
            int i5 = i - 1;
            int i6 = 3;
            if (i5 == 0) {
                i3 = 2;
            } else if (i5 != 1) {
                i3 = i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 8 : 7 : 6 : 5 : 4;
            } else {
                i3 = 3;
            }
            bxvd da = bpjw.f137917j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpjw bpjw = (bpjw) da.f164949b;
            bpjw.f137920b = i3 - 1;
            bpjw.f137919a |= 1;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpjw bpjw2 = (bpjw) da.f164949b;
            bpjw2.f137919a |= 2;
            bpjw2.f137921c = elapsedRealtime;
            int i7 = rkk.mo7183bo().f30115i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpjw bpjw3 = (bpjw) da.f164949b;
            int i8 = 8 | bpjw3.f137919a;
            bpjw3.f137919a = i8;
            bpjw3.f137922d = i7;
            if (str3 != null) {
                str2.getClass();
                bpjw3.f137919a = i8 | 16;
                bpjw3.f137923e = str3;
            }
            bpjw bpjw4 = (bpjw) da.mo74062i();
            bxvd bxvd = (bxvd) bpjw4.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bpjw4);
            if (i5 != 0) {
                if (i5 == 1) {
                    bxvd da2 = bpjv.f137913c.mo74144da();
                    if (i4 == 2) {
                        i6 = 4;
                    } else if (i4 == 3) {
                        i6 = 2;
                    } else if (i4 != 4) {
                        i6 = i4 != 5 ? 1 : 5;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpjv bpjv = (bpjv) da2.f164949b;
                    bpjv.f137916b = i6 - 1;
                    bpjv.f137915a |= 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpjw bpjw5 = (bpjw) bxvd.f164949b;
                    bpjv bpjv2 = (bpjv) da2.mo74062i();
                    bpjv2.getClass();
                    bpjw5.f137925g = bpjv2;
                    bpjw5.f137919a |= 64;
                } else if (i5 != 2) {
                    if (i5 == 4 && rkk.mo7183bo().mo17710c()) {
                        bxvd da3 = bpjr.f137907c.mo74144da();
                        boolean z = ((rjr) rkk).f43155b;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bpjr bpjr = (bpjr) da3.f164949b;
                        bpjr.f137909a |= 1;
                        bpjr.f137910b = z;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpjw bpjw6 = (bpjw) bxvd.f164949b;
                        bpjr bpjr2 = (bpjr) da3.mo74062i();
                        bpjr2.getClass();
                        bpjw6.f137927i = bpjr2;
                        bpjw6.f137919a |= 512;
                    }
                } else if (rkk.mo7183bo().mo17710c()) {
                    bxvd da4 = bpjp.f137899c.mo74144da();
                    int length = ((asmi) rkk).mo49240b().f108367a.length;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bpjp bpjp = (bpjp) da4.f164949b;
                    bpjp.f137901a |= 1;
                    bpjp.f137902b = length;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpjw bpjw7 = (bpjw) bxvd.f164949b;
                    bpjp bpjp2 = (bpjp) da4.mo74062i();
                    bpjp2.getClass();
                    bpjw7.f137926h = bpjp2;
                    bpjw7.f137919a |= 128;
                }
            } else if (rkk.mo7183bo().mo17710c()) {
                bxvd da5 = bpjq.f137903c.mo74144da();
                boolean z2 = ((rjr) rkk).f43155b;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpjq bpjq = (bpjq) da5.f164949b;
                bpjq.f137905a |= 1;
                bpjq.f137906b = z2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpjw bpjw8 = (bpjw) bxvd.f164949b;
                bpjq bpjq2 = (bpjq) da5.mo74062i();
                bpjq2.getClass();
                bpjw8.f137924f = bpjq2;
                bpjw8.f137919a |= 32;
            }
            awqc.m80662a(this.f123362a, new TapAndPayCallEvent((BuyFlowConfig) obj2, str, (bpjw) bxvd.mo74062i()));
            return;
        }
        throw new IllegalArgumentException("Expect a BuyFlowConfig object");
    }
}
