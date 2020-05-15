package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.service.orchestration.GetInstrumentAvailabilityServerRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;

/* renamed from: awsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsu implements awpl {

    /* renamed from: a */
    private final Context f95061a;

    /* renamed from: b */
    private final awua f95062b;

    /* renamed from: c */
    private final awwo f95063c;

    public awsu(Context context) {
        this.f95061a = context;
        this.f95062b = new awvy(context, new awgj(rpr.m34216b().getRequestQueue()));
        this.f95063c = new awwo(context);
    }

    /* renamed from: a */
    public final int mo52449a(aecc aecc) {
        int b = (int) chjz.m148852b();
        Account[] a = adyd.m51363a(this.f95061a).mo33916a("com.google");
        int i = 0;
        for (Account account : a) {
            byah a2 = this.f95063c.mo52680a(b, account);
            if (!(a2 == null || (a2.f165258a & 16) == 0)) {
                byaf byaf = a2.f165262e;
                if (byaf == null) {
                    byaf = byaf.f165243d;
                }
                if (byaf.f165246b) {
                    bxvd bxvd = (bxvd) a2.mo74142c(5);
                    bxvd.mo73625a((bxvk) a2);
                    if (mo52542a(account, b, (byae) bxvd, 4) == 2) {
                        i = 2;
                    }
                }
            }
        }
        return i;
    }

    public awsu(Context context, awua awua, awwo awwo) {
        this.f95061a = context;
        this.f95062b = awua;
        this.f95063c = awwo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo52542a(Account account, int i, byae byae, int i2) {
        int i3;
        awyb a = BuyFlowConfig.m94175a();
        a.mo52751b("com.google.android.gms");
        a.mo52752c("flow_instantbuy");
        awxz a2 = ApplicationParameters.m94173a();
        a2.mo52739a(account);
        a2.mo52744b(i);
        a.mo52749a(a2.f95270a);
        BuyFlowConfig a3 = a.mo52748a();
        bxvd da = bpik.f137757s.mo74144da();
        bxvd da2 = bpjd.f137839e.mo74144da();
        int i4 = i2 - 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpjd bpjd = (bpjd) da2.f164949b;
        int i5 = 2;
        bpjd.f137841a |= 2;
        bpjd.f137843c = i4;
        bpjd bpjd2 = (bpjd) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpik bpik = (bpik) da.f164949b;
        bpjd2.getClass();
        bpik.f137774p = bpjd2;
        bpik.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bxvd da3 = bwke.f159958f.mo74144da();
        bmaj bmaj = bmaj.f128452m;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bwke bwke = (bwke) da3.f164949b;
        bmaj.getClass();
        bwke.f159961b = bmaj;
        int i6 = bwke.f159960a | 1;
        bwke.f159960a = i6;
        bwke.f159962c = i4;
        bwke.f159960a = i6 | 2;
        if (byae != null) {
            byah byah = (byah) byae.f164949b;
            if ((byah.f165258a & 4) != 0) {
                bwki bwki = byah.f165260c;
                if (bwki == null) {
                    bwki = bwki.f159970e;
                }
                bxtx bxtx = bwki.f159975d;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bwke bwke2 = (bwke) da3.f164949b;
                bxtx.getClass();
                bwke2.f159960a |= 4;
                bwke2.f159963d = bxtx;
            }
        }
        byah byah2 = (byah) byae.f164949b;
        if ((byah2.f165258a & 16) != 0 && i2 == 4) {
            byaf byaf = byah2.f165262e;
            if (byaf == null) {
                byaf = byaf.f165243d;
            }
            bxtx bxtx2 = byaf.f165247c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bwke bwke3 = (bwke) da3.f164949b;
            bxtx2.getClass();
            bwke3.f159960a |= 8;
            bwke3.f159964e = bxtx2;
        }
        try {
            ServerResponse a4 = this.f95062b.mo52588a(a3, new GetInstrumentAvailabilityServerRequest(account, (bwke) da3.mo74062i()));
            bpjd bpjd3 = ((bpik) da.f164949b).f137774p;
            if (bpjd3 == null) {
                bpjd3 = bpjd.f137839e;
            }
            bxvd bxvd = (bxvd) bpjd3.mo74142c(5);
            bxvd.mo73625a((bxvk) bpjd3);
            int c = a4.mo60050c();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpjd bpjd4 = (bpjd) bxvd.f164949b;
            bpjd4.f137841a |= 4;
            bpjd4.f137844d = c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpik bpik2 = (bpik) da.f164949b;
            bpjd bpjd5 = (bpjd) bxvd.mo74062i();
            bpjd5.getClass();
            bpik2.f137774p = bpjd5;
            bpik2.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            if (a4.mo60050c() != 76) {
                Log.e("RefreshInstrAvlGcmTask", String.format(Locale.US, "Error: Unexpected ServerResponse %d in for account %s", Integer.valueOf(a4.mo60050c()), account.name));
                i3 = 2;
            } else {
                bwki bwki2 = (bwki) a4.mo60052e();
                if ((bwki2.f159972a & 1) != 0) {
                    Log.e("RefreshInstrAvlGcmTask", String.format(Locale.US, "Error: Error in getInstrumentAvailabilityResponse for account = %s", account.name));
                    i3 = 2;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (byae.f164950c) {
                        byae.mo74035c();
                        byae.f164950c = false;
                    }
                    byah byah3 = (byah) byae.f164949b;
                    byah byah4 = byah.f165256g;
                    int i7 = byah3.f165258a | 1;
                    byah3.f165258a = i7;
                    byah3.f165259b = currentTimeMillis;
                    bwki2.getClass();
                    byah3.f165260c = bwki2;
                    int i8 = i7 | 4;
                    byah3.f165258a = i8;
                    if ((i8 & 16) != 0) {
                        byaf byaf2 = byah3.f165262e;
                        if (byaf2 == null) {
                            byaf2 = byaf.f165243d;
                        }
                        bxvd bxvd2 = (bxvd) byaf2.mo74142c(5);
                        bxvd2.mo73625a((bxvk) byaf2);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        byaf byaf3 = (byaf) bxvd2.f164949b;
                        byaf3.f165245a |= 1;
                        byaf3.f165246b = false;
                        if (byae.f164950c) {
                            byae.mo74035c();
                            byae.f164950c = false;
                        }
                        byah byah5 = (byah) byae.f164949b;
                        byaf byaf4 = (byaf) bxvd2.mo74062i();
                        byaf4.getClass();
                        byah5.f165262e = byaf4;
                        byah5.f165258a |= 16;
                    }
                    this.f95063c.mo52681a(a3.f110418b.f110406a, account, (byah) byae.mo74062i());
                    i3 = 0;
                }
            }
            bpjd bpjd6 = ((bpik) da.f164949b).f137774p;
            if (bpjd6 == null) {
                bpjd6 = bpjd.f137839e;
            }
            bxvd bxvd3 = (bxvd) bpjd6.mo74142c(5);
            bxvd3.mo73625a((bxvk) bpjd6);
            if (i3 != 0) {
                i5 = 5;
            }
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bpjd bpjd7 = (bpjd) bxvd3.f164949b;
            bpjd7.f137842b = i5 - 1;
            bpjd7.f137841a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpik bpik3 = (bpik) da.f164949b;
            bpjd bpjd8 = (bpjd) bxvd3.mo74062i();
            bpjd8.getClass();
            bpik3.f137774p = bpjd8;
            bpik3.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            SimpleAnalyticsEvent.m93844a(this.f95061a, a3, (bpik) da.mo74062i(), account);
            return i3;
        } catch (RemoteException e) {
            throw new RuntimeException("Unexpected remote exception", e);
        }
    }
}
