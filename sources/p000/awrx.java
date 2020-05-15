package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: awrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrx {

    /* renamed from: A */
    private final awso f94954A;

    /* renamed from: B */
    private int f94955B = 1;

    /* renamed from: C */
    private int f94956C = 1;

    /* renamed from: a */
    public final Context f94957a;

    /* renamed from: b */
    public final awra f94958b;

    /* renamed from: c */
    public final ExecutorService f94959c;

    /* renamed from: d */
    public final rfz f94960d;

    /* renamed from: e */
    public final awua f94961e;

    /* renamed from: f */
    public final awwt f94962f;

    /* renamed from: g */
    public final awwo f94963g;

    /* renamed from: h */
    public final awta f94964h;

    /* renamed from: i */
    public final svq f94965i;

    /* renamed from: j */
    public final Bundle f94966j;

    /* renamed from: k */
    public final IsReadyToPayRequest f94967k;

    /* renamed from: l */
    public Account[] f94968l;

    /* renamed from: m */
    public BuyFlowConfig f94969m;

    /* renamed from: n */
    public List f94970n;

    /* renamed from: o */
    public List f94971o;

    /* renamed from: p */
    public List f94972p = Collections.EMPTY_LIST;

    /* renamed from: q */
    public Map f94973q = new HashMap();

    /* renamed from: r */
    public boolean f94974r;

    /* renamed from: s */
    public boolean f94975s;

    /* renamed from: t */
    public boolean f94976t;

    /* renamed from: u */
    public boolean f94977u;

    /* renamed from: v */
    public int f94978v;

    /* renamed from: w */
    public int f94979w;

    /* renamed from: x */
    public int f94980x = 0;

    /* renamed from: y */
    public int f94981y;

    /* renamed from: z */
    public long f94982z;

    public awrx(Context context, awra awra, ExecutorService executorService, rfz rfz, awua awua, awwt awwt, awwo awwo, awta awta, svq svq, awso awso, Bundle bundle, IsReadyToPayRequest isReadyToPayRequest) {
        this.f94957a = context;
        this.f94958b = awra;
        this.f94959c = executorService;
        this.f94960d = rfz;
        this.f94961e = awua;
        this.f94962f = awwt;
        this.f94963g = awwo;
        this.f94964h = awta;
        this.f94965i = svq;
        this.f94954A = awso;
        this.f94966j = bundle;
        this.f94967k = isReadyToPayRequest;
    }

    /* renamed from: a */
    private final bwki m80878a(Account account, int i, long j, boolean z) {
        long longValue = j + ((Long) awie.f94429y.mo58455c()).longValue();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < longValue) {
            bwki a = m80879a(this.f94963g.mo52680a(i, account), ((Long) awie.f94399B.mo58455c()).longValue());
            if (a != null || !z) {
                return a;
            }
            try {
                return (bwki) ((FutureTask) this.f94973q.get(account)).get(longValue - elapsedRealtime, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException("InstrumentAvailability fetch failed.", e);
            } catch (TimeoutException e2) {
                throw e2;
            }
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: a */
    public static boolean m80880a(IsReadyToPayRequest isReadyToPayRequest) {
        return (isReadyToPayRequest == null || isReadyToPayRequest.f109814f == null) ? false : true;
    }

    /* renamed from: b */
    private final boolean m80881b() {
        return ((Boolean) awie.f94423s.mo58455c()).booleanValue() && this.f94972p.contains("PAYPAL");
    }

    /* renamed from: c */
    private final int m80882c(awrw awrw) {
        boolean z;
        int i;
        int i2;
        CardInfo[] cardInfoArr;
        bwki bwki;
        awrw awrw2 = awrw;
        if (awrw2.f94953b.f43155b) {
            Account[] accountArr = this.f94968l;
            boolean z2 = false;
            int i3 = 0;
            for (Account account : accountArr) {
                GetActiveCardsForAccountResponse getActiveCardsForAccountResponse = (GetActiveCardsForAccountResponse) awrw2.f94952a.get(account);
                if (!(getActiveCardsForAccountResponse == null || (cardInfoArr = getActiveCardsForAccountResponse.f108367a) == null || cardInfoArr.length <= 0)) {
                    int i4 = 2;
                    if (this.f94971o.contains(2)) {
                        CardInfo[] cardInfoArr2 = getActiveCardsForAccountResponse.f108367a;
                        int length = cardInfoArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            CardInfo cardInfo = cardInfoArr2[i5];
                            int i6 = this.f94980x;
                            if (i6 != i4) {
                                if (i6 != 3) {
                                    int a = awrt.m80803a(cardInfo.f108344e);
                                    int i7 = cardInfo.f108357r;
                                    if (this.f94970n.contains(Integer.valueOf(a)) && i7 != 1) {
                                        break;
                                    }
                                    i5++;
                                    i4 = 2;
                                } else {
                                    OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = cardInfo.f108361v;
                                    for (OnlineAccountCardLinkInfo onlineAccountCardLinkInfo : onlineAccountCardLinkInfoArr) {
                                        if (onlineAccountCardLinkInfo.f108414a == 1 && onlineAccountCardLinkInfo.f108415b == 1) {
                                            break;
                                        }
                                    }
                                    continue;
                                    i5++;
                                    i4 = 2;
                                }
                            } else if (cardInfo.f108345f.f108458a.f108457b == 9) {
                                break;
                            } else {
                                i5++;
                                i4 = 2;
                            }
                        }
                        if (((Boolean) awie.f94430z.mo58455c()).booleanValue()) {
                            try {
                                bwki = m80878a(account, this.f94969m.f110418b.f110406a, this.f94982z, false);
                            } catch (TimeoutException e) {
                                return 13;
                            }
                        } else {
                            bwki = null;
                        }
                        if (!((Boolean) awie.f94430z.mo58455c()).booleanValue() || bwki == null) {
                            return 2;
                        }
                        int i8 = bwki.f159972a;
                        if ((i8 & 1) != 0 || (i8 & 4) == 0) {
                            return 2;
                        }
                        bwkh bwkh = bwki.f159973b;
                        if (bwkh == null) {
                            bwkh = bwkh.f159966b;
                        }
                        int a2 = bwkg.m122041a(bwkh.f159968a);
                        if (a2 == 0 || a2 != 3) {
                            return 2;
                        }
                        i3++;
                        z2 = true;
                    }
                    z2 = true;
                }
            }
            z = z2;
            i = i3;
        } else {
            i = 0;
            z = false;
        }
        if (m80883c()) {
            i2 = 9;
        } else if (m80881b()) {
            i2 = 9;
        } else if (i == this.f94968l.length) {
            return 14;
        } else {
            if (!z) {
                return 7;
            }
            return 9;
        }
        int d = m80884d();
        return (!z || d != 7) ? d : i2;
    }

    /* renamed from: d */
    private final int m80884d() {
        int a;
        int i;
        if (this.f94968l.length == 0) {
            return 6;
        }
        int i2 = 0;
        boolean z = false;
        loop0:
        while (true) {
            Account[] accountArr = this.f94968l;
            if (i2 >= accountArr.length) {
                return z ? 9 : 7;
            }
            try {
                bwki a2 = m80878a(accountArr[i2], this.f94969m.f110418b.f110406a, this.f94982z, true);
                if (a2 == null) {
                    Log.e("IsReadyToPayAction", "Error: InstrumentAvailability response was null.");
                } else {
                    int i3 = a2.f159972a;
                    if ((i3 & 1) == 0 && (i3 & 4) == 0 && a2.f159974c.size() != 0) {
                        bxwc bxwc = a2.f159974c;
                        if (m80883c()) {
                            HashSet hashSet = new HashSet();
                            int size = this.f94970n.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                Integer num = (Integer) awrt.f94942b.get(Integer.valueOf(((Integer) this.f94970n.get(i4)).intValue()));
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    i = Integer.MIN_VALUE;
                                }
                                hashSet.add(Integer.valueOf(i));
                            }
                            int size2 = bxwc.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    break;
                                }
                                bwkk bwkk = (bwkk) bxwc.get(i5);
                                int a3 = blwi.m107714a(bwkk.f159980a);
                                if ((a3 != 0 && a3 == 2) || (((Boolean) awie.f94424t.mo58455c()).booleanValue() && (a = blwi.m107714a(bwkk.f159980a)) != 0 && a == 4)) {
                                    for (bmfk bmfk : new bxvv(bwkk.f159981b, bwkk.f159977c)) {
                                        if (hashSet.contains(Integer.valueOf(bmfk.f129115j))) {
                                            break loop0;
                                        }
                                    }
                                    continue;
                                }
                                i5++;
                            }
                        }
                        if (m80881b()) {
                            int size3 = bxwc.size();
                            int i6 = 0;
                            while (i6 < size3) {
                                int a4 = blwi.m107714a(((bwkk) bxwc.get(i6)).f159980a);
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                i6++;
                                if (a4 == 4) {
                                    break loop0;
                                }
                            }
                        }
                        z = true;
                    }
                }
                i2++;
            } catch (TimeoutException e) {
                return 13;
            }
        }
        return 2;
    }

    /* renamed from: a */
    public final String mo52518a() {
        IsReadyToPayRequest isReadyToPayRequest = this.f94967k;
        String str = isReadyToPayRequest.f109811c;
        return str == null ? isReadyToPayRequest.f109814f : str;
    }

    /* renamed from: b */
    public final int mo52519b(awrw awrw) {
        int i = this.f94956C;
        if (i != 1) {
            return i;
        }
        int c = m80882c(awrw);
        this.f94956C = c;
        return c;
    }

    /* renamed from: a */
    public static bwki m80879a(byah byah, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (byah == null || (byah.f165258a & 4) == 0) {
            return null;
        }
        long j2 = byah.f165259b;
        if (currentTimeMillis >= j + j2 || j2 > currentTimeMillis) {
            return null;
        }
        bwki bwki = byah.f165260c;
        return bwki == null ? bwki.f159970e : bwki;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* renamed from: a */
    public final int mo52517a(awrw awrw) {
        int i = this.f94955B;
        if (i == 1) {
            if (soz.m35807f(this.f94957a)) {
                i = 8;
            } else if (rfy.m33553j(this.f94957a) < this.f94981y) {
                i = 11;
            } else if (awrw.f94953b.f43154a.mo17710c()) {
                int i2 = Build.VERSION.SDK_INT;
                sre.m36089i(this.f94957a);
                if (mo52518a() != null) {
                    if (this.f94977u) {
                        if (this.f94976t) {
                            if (m80880a(this.f94967k) && awrt.m80854a(this.f94965i, this.f94960d)) {
                                if (chjn.f188685a.mo6606a().mo85282a()) {
                                    awso awso = this.f94954A;
                                    awso.f95044c = mo52518a();
                                    awsn awsn = null;
                                    try {
                                        Intent intent = new Intent("com.google.android.apps.nbu.paisa.user.inapp.sdk.service.IS_READY_TO_PAY");
                                        intent.setPackage((String) awie.f94413i.mo58455c());
                                        awsn awsn2 = new awsn(awso);
                                        try {
                                            boolean a = skh.m35531a().mo25690a(awso.f95043b, intent, awsn2, 1);
                                            awso.f95045d = a;
                                            if (a) {
                                                awso.f95042a.await(chjn.f188685a.mo6606a().mo85283b(), TimeUnit.MILLISECONDS);
                                                boolean z = awso.f95046e;
                                                if (awso.f95045d) {
                                                    awso.f95045d = false;
                                                    skh.m35531a().mo25689a(awso.f95043b, awsn2);
                                                }
                                                if (z) {
                                                    i = 2;
                                                }
                                            }
                                        } catch (InterruptedException e) {
                                            awsn = awsn2;
                                            if (!awso.f95045d) {
                                                awso.f95045d = false;
                                                skh.m35531a().mo25689a(awso.f95043b, awsn);
                                                i = 15;
                                                this.f94955B = i;
                                                return i;
                                            }
                                            i = 15;
                                            this.f94955B = i;
                                            return i;
                                        } catch (Throwable th) {
                                            th = th;
                                            awsn = awsn2;
                                            if (awso.f95045d) {
                                                awso.f95045d = false;
                                                skh.m35531a().mo25689a(awso.f95043b, awsn);
                                            }
                                            throw th;
                                        }
                                    } catch (InterruptedException e2) {
                                        if (!awso.f95045d) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (awso.f95045d) {
                                        }
                                        throw th;
                                    }
                                    i = 15;
                                }
                            }
                        }
                    }
                    i = 12;
                }
                i = (!((Boolean) awie.f94398A.mo58455c()).booleanValue() || this.f94968l.length != 0) ? (m80883c() || m80881b()) ? 2 : mo52519b(awrw) : 6;
            } else {
                i = 4;
            }
            this.f94955B = i;
        }
        return i;
    }

    /* renamed from: c */
    private final boolean m80883c() {
        Boolean bool;
        if (this.f94980x != 0) {
            bool = (Boolean) awip.f94483c.mo58455c();
        } else {
            bool = (Boolean) awip.f94482b.mo58455c();
        }
        return bool.booleanValue() && this.f94971o.contains(1);
    }
}
