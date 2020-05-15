package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: bjhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhm extends bjil implements bjfg, bjhh, bjgm {

    /* renamed from: a */
    public final bjhi f122735a;

    /* renamed from: b */
    public final bjhl f122736b;

    /* renamed from: c */
    Intent f122737c;

    /* renamed from: d */
    public bwmh f122738d;

    /* renamed from: e */
    public bwmi f122739e;

    /* renamed from: f */
    public final bjfh f122740f;

    /* renamed from: g */
    public final GoogleAccountStateSnapshot f122741g;

    /* renamed from: h */
    public final ArrayList f122742h = new ArrayList(1);

    /* renamed from: i */
    public final C1225nr f122743i = new C1225nr();

    public bjhm(Activity activity, WidgetConfig widgetConfig, long j, bjhl bjhl, Bundle bundle) {
        long j2;
        aywn aywn;
        GoogleAccountStateSnapshot googleAccountStateSnapshot;
        WidgetConfig widgetConfig2 = widgetConfig;
        Bundle bundle2 = bundle;
        this.f122736b = bjhl;
        awef awef = (awef) bjhl;
        this.f122735a = new bjhi(widgetConfig, j, awef.f94200a, awef.f94209j, activity, awia.m79973a(), awef.f94204e, "com.google.android.gms.fileprovider", this);
        activity.getApplicationContext();
        bjie.m103593a(awef.f94208i, widgetConfig2.f151761b);
        bjfh a = this.f122735a.f122730g.mo65088a(this, bjil.m103603a(2, bundle2));
        this.f122740f = a;
        mo65286a(2, a);
        if (bundle2 == null) {
            bxvd da = bpsk.f138966h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk = (bpsk) da.f164949b;
            bpsk.f138968a |= 1;
            j2 = j;
            bpsk.f138971d = j2;
            bpsg bpsg = bpsg.EVENT_TYPE_SESSION_START;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk2 = (bpsk) da.f164949b;
            bpsk2.f138972e = bpsg.f138957l;
            bpsk2.f138968a |= 2;
            if (widgetConfig2.f151768i != 0 && bjhz.m103567a().mo65274j()) {
                bxvd da2 = bpso.f138990c.mo74144da();
                long j3 = widgetConfig2.f151768i;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpso bpso = (bpso) da2.f164949b;
                bpso.f138992a |= 1;
                bpso.f138993b = j3;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpsk bpsk3 = (bpsk) da.f164949b;
                bpso bpso2 = (bpso) da2.mo74062i();
                bpso2.getClass();
                bpsk3.f138970c = bpso2;
                bpsk3.f138969b = 11;
            }
            bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), widgetConfig.mo71762a());
        } else {
            j2 = j;
        }
        bxvd da3 = bpss.f139006d.mo74144da();
        bxvd da4 = bpsr.f139002c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bpsr bpsr = (bpsr) da4.f164949b;
        bpsr.f139004a |= 1;
        bpsr.f139005b = j2;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpss bpss = (bpss) da3.f164949b;
        bpsr bpsr2 = (bpsr) da4.mo74062i();
        bpsr2.getClass();
        bpss.f139010b = bpsr2;
        bpss.f139009a |= 1;
        Account account = widgetConfig2.f151760a;
        aywj a2 = bjie.f122757a.mo65277a().mo54505a(ayww.m84999a(activity.getContainerActivity()), 78272);
        a2.mo54480a(aywm.m84989a(bpst.f139012a, (bpss) da3.mo74062i()));
        if (account != null) {
            aywn = ayxb.m85017a(account.name);
        } else {
            bxvj bxvj = ayxg.f98679a;
            bxvd da5 = ayxf.f98675c.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ayxf ayxf = (ayxf) da5.f164949b;
            "".getClass();
            ayxf.f98677a |= 1;
            ayxf.f98678b = "";
            aywn = aywn.m84990a(bxvj, (ayxf) da5.mo74062i());
        }
        a2.mo54481a(aywn);
        a2.mo54478a();
        if (bundle2 != null) {
            this.f122738d = (bwmh) bjhq.m103511a(bundle2, "responseContext", bwmh.f160270d);
            this.f122739e = (bwmi) bjhq.m103511a(bundle2, "secureDataHeader", bwmi.f160277b);
            Bundle a3 = bjil.m103603a(1, bundle2);
            if (a3 != null) {
                m103495c(a3);
            }
            this.f122737c = (Intent) bundle2.getParcelable("networkRetryIntent");
            bjgn bjgn = (bjgn) this.f122735a.mo65228b().findFragmentByTag("networkErrorDialog");
            if (bjgn != null) {
                bjgn.f122670a = this;
            }
        }
        if (bundle2 == null) {
            googleAccountStateSnapshot = new GoogleAccountStateSnapshot();
            googleAccountStateSnapshot.f151759a = AccountManager.get(activity).getAccountsByType("com.google");
        } else {
            googleAccountStateSnapshot = (GoogleAccountStateSnapshot) bundle2.getParcelable("googleAccountStateSnapshot");
        }
        this.f122741g = googleAccountStateSnapshot;
        m103496e();
    }

    /* renamed from: c */
    private final bjgw m103495c(Bundle bundle) {
        bjgw bjgw = new bjgw(this.f122735a, ((awef) this.f122736b).f94203d, bundle);
        mo65286a(1, bjgw);
        return bjgw;
    }

    /* renamed from: e */
    private final void m103496e() {
        this.f122743i.clear();
        bwmh bwmh = this.f122738d;
        if (bwmh != null) {
            bxwc bxwc = bwmh.f160274c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                C1225nr nrVar = this.f122743i;
                bpsg a = bpsg.m112232a(((bxaz) bxwc.get(i)).f161769c);
                if (a == null) {
                    a = bpsg.EVENT_TYPE_UNKNOWN;
                }
                nrVar.add(a);
            }
            return;
        }
        this.f122743i.add(bpsg.EVENT_TYPE_API_REQUEST_START);
    }

    /* renamed from: a */
    public final void mo65221a() {
        if (!this.f122742h.isEmpty()) {
            ArrayList arrayList = this.f122742h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjhe) arrayList.get(i)).mo65221a();
            }
            return;
        }
        mo65237d();
    }

    /* renamed from: b */
    public final void mo65235b(int i) {
        if (this.f122743i.contains(bpsg.EVENT_TYPE_SESSION_START)) {
            bxvd da = bpsk.f138966h.mo74144da();
            long j = this.f122735a.f122725b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk = (bpsk) da.f164949b;
            bpsk.f138968a |= 1;
            bpsk.f138971d = j;
            bpsg bpsg = bpsg.EVENT_TYPE_SESSION_END;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk2 = (bpsk) da.f164949b;
            bpsk2.f138972e = bpsg.f138957l;
            int i2 = bpsk2.f138968a | 2;
            bpsk2.f138968a = i2;
            bpsk2.f138974g = i - 1;
            bpsk2.f138968a = i2 | 16;
            bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122735a.f122724a.mo71762a());
        }
    }

    /* renamed from: d */
    public final void mo65237d() {
        awef awef = (awef) this.f122736b;
        awef.f94201b.setResult(0);
        awef.f94201b.finish();
        mo65235b(4);
    }

    /* renamed from: c */
    public final bjgw mo65236c() {
        bjgw bjgw = (bjgw) mo65287b(1, bjgw.class);
        return bjgw == null ? m103495c((Bundle) null) : bjgw;
    }

    /* renamed from: a */
    public final void mo65149a(int i) {
        int intExtra = this.f122737c.getIntExtra("actionRequestType", 0);
        if (i != -2) {
            if (i == -1) {
                bjfh bjfh = this.f122740f;
                Intent intent = this.f122737c;
                WidgetConfig widgetConfig = this.f122735a.f122724a;
                GoogleAccountStateSnapshot googleAccountStateSnapshot = this.f122741g;
                Intent a = bjfc.m103290a("o2NetworkAction", widgetConfig);
                a.putExtras(intent);
                a.putExtra("googleAccountStateSnapshot", googleAccountStateSnapshot);
                bjfh.mo65084a(100, new bjfc(a));
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Does not support dialog button type %s click action", Integer.valueOf(i)));
            }
        } else if (intExtra == 0) {
            mo65237d();
        } else if (intExtra == 1 && mo65236c() != null) {
            mo65236c().mo65204f();
        }
        this.f122737c = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhm.a(bwzh, boolean):void
     arg types: [bwzh, int]
     candidates:
      bjhm.a(int, bjfd):void
      bjil.a(long, android.os.Bundle):android.os.Bundle
      bjil.a(long, bjil):void
      bjfg.a(int, bjfd):void
      bjhm.a(bwzh, boolean):void */
    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        int i2;
        int i3;
        if (i == 100) {
            Intent intent = bjfd.f122613a;
            if (bjfd.mo65080a() == 0) {
                if (mo65236c() != null && intent.getIntExtra("actionRequestType", 0) == 1) {
                    mo65236c().mo65204f();
                }
                mo65233a((bwzh) bjhq.m103512a(intent.getByteArrayExtra("bodyBytes"), (bxxk) bwzh.f161606d.mo74142c(7)), false);
                return;
            }
            this.f122737c = intent;
            if (((bjgn) this.f122735a.mo65228b().findFragmentByTag("networkErrorDialog")) == null) {
                switch (intent.getIntExtra("actionResponseErrorType", 1004)) {
                    case 1001:
                        i3 = C0126R.attr.b3NetworkErrorTitle;
                        i2 = C0126R.attr.b3NetworkErrorMessage;
                        break;
                    case 1002:
                        i3 = C0126R.attr.b3AuthErrorTitle;
                        i2 = C0126R.attr.b3AuthErrorMessage;
                        break;
                    case 1003:
                        i3 = C0126R.attr.b3NoConnectionErrorTitle;
                        i2 = C0126R.attr.b3NoConnectionErrorMessage;
                        break;
                    default:
                        i3 = C0126R.attr.b3TitlePossiblyRecoverableError;
                        i2 = C0126R.attr.b3UnknownError;
                        break;
                }
                int[] iArr = {i3, i2, C0126R.attr.b3Retry};
                Arrays.sort(iArr);
                ContextWrapper contextWrapper = this.f122735a.f122732i;
                TypedArray obtainStyledAttributes = contextWrapper.obtainStyledAttributes(iArr);
                String string = obtainStyledAttributes.getString(Arrays.binarySearch(iArr, i3));
                String string2 = obtainStyledAttributes.getString(Arrays.binarySearch(iArr, i2));
                String string3 = obtainStyledAttributes.getString(Arrays.binarySearch(iArr, (int) C0126R.attr.b3Retry));
                String string4 = contextWrapper.getString(17039360);
                obtainStyledAttributes.recycle();
                bjgl bjgl = new bjgl();
                bjgl.f122665a = string;
                bjgl.f122666b = string2;
                bjgl.f122667c = string3;
                bjgl.f122668d = string4;
                bjgl.f122669e = this.f122735a.f122724a;
                String str = bjgl.f122665a;
                String str2 = bjgl.f122666b;
                String str3 = bjgl.f122667c;
                String str4 = bjgl.f122668d;
                WidgetConfig widgetConfig = bjgl.f122669e;
                bmxy.m108582a(str, "Title is required.");
                bmxy.m108582a(str3, "Positive button is required.");
                Bundle bundle = new Bundle();
                bundle.putString("title", str);
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("message", str2);
                }
                bundle.putString("positiveButtonText", str3);
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("negativeButtonText", str4);
                }
                bundle.putParcelable("widgetConfig", widgetConfig);
                bjgn bjgn = new bjgn();
                bjgn.setArguments(bundle);
                bjgn.f122670a = this;
                bjgn.show(this.f122735a.mo65228b(), "networkErrorDialog");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        bundle.putParcelable("widgetConfig", this.f122735a.f122724a);
        bundle.putLong("clientSessionId", this.f122735a.f122725b);
        bwmh bwmh = this.f122738d;
        if (bwmh != null) {
            bjhq.m103514b(bundle, "responseContext", bwmh);
        }
        Intent intent = this.f122737c;
        if (intent != null) {
            bundle.putParcelable("networkRetryIntent", intent);
        }
        bwmi bwmi = this.f122739e;
        if (bwmi != null) {
            bjhq.m103514b(bundle, "secureDataHeader", bwmi);
        }
        bundle.putParcelable("googleAccountStateSnapshot", this.f122741g);
    }

    /* renamed from: a */
    public final void mo65225a(bjhe bjhe) {
        this.f122742h.remove(bjhe);
    }

    /* renamed from: a */
    public final void mo65233a(bwzh bwzh, boolean z) {
        bwoz bwoz;
        bwpa bwpa;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        bwzh bwzh2 = bwzh;
        bwmh bwmh = bwzh2.f161608a;
        if (bwmh == null) {
            bwmh = bwmh.f160270d;
        }
        this.f122738d = bwmh;
        bwmi bwmi = bwzh2.f161610c;
        if (bwmi == null) {
            bwmi = bwmi.f160277b;
        }
        this.f122739e = bwmi;
        m103496e();
        int i = 1;
        if (z && this.f122743i.contains(bpsg.EVENT_TYPE_PREFETCHED_INITIALIZE)) {
            bxvd da = bpsk.f138966h.mo74144da();
            long j = this.f122735a.f122725b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk = (bpsk) da.f164949b;
            bpsk.f138968a |= 1;
            bpsk.f138971d = j;
            bpsg bpsg = bpsg.EVENT_TYPE_PREFETCHED_INITIALIZE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk2 = (bpsk) da.f164949b;
            bpsk2.f138972e = bpsg.f138957l;
            bpsk2.f138968a |= 2;
            bxvd da2 = bpsn.f138986c.mo74144da();
            ByteString bxtx = this.f122738d.f160273b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpsn bpsn = (bpsn) da2.f164949b;
            bxtx.getClass();
            bpsn.f138988a |= 1;
            bpsn.f138989b = bxtx;
            bpsn bpsn2 = (bpsn) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk3 = (bpsk) da.f164949b;
            bpsn2.getClass();
            bpsk3.f138970c = bpsn2;
            bpsk3.f138969b = 10;
            bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122735a.f122724a.mo71762a());
        }
        bwoy bwoy = bwzh2.f161609b;
        if (bwoy == null) {
            bwoy = bwoy.f160503d;
        }
        int a = bwox.m122172a(bwoy.f160507c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            if (bwoy.f160505a == 2) {
                bwoz = (bwoz) bwoy.f160506b;
            } else {
                bwoz = bwoz.f160510b;
            }
            bjgw c = mo65236c();
            bwyz bwyz = bwoz.f160512a;
            if (bwyz == null) {
                bwyz = bwyz.f161561h;
            }
            c.mo65198a(bwyz);
        } else if (i2 == 2) {
            if (bwoy.f160505a == 3) {
                bwpa = (bwpa) bwoy.f160506b;
            } else {
                bwpa = bwpa.f160515b;
            }
            bjgw c2 = mo65236c();
            bwze bwze = bwpa.f160517a;
            if (bwze == null) {
                bwze = bwze.f161579i;
            }
            if (c2.f122792n == 3) {
                c2.mo65281B();
                z2 = true;
            } else {
                z2 = false;
            }
            bwyz bwyz2 = c2.f122699b;
            bxvd bxvd = (bxvd) bwyz2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bwyz2);
            bwyy bwyy = (bwyy) bxvd;
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = false;
            }
            bwyz bwyz3 = bwyz.f161561h;
            ((bwyz) bwyy.f164949b).f161566d = GeneratedMessageLite.m124030de();
            bwyz bwyz4 = c2.f122699b;
            bxvw bxvw = bwze.f161584d;
            bxwc bxwc = bwze.f161585e;
            bxwc bxwc2 = bwze.f161586f;
            bxwc bxwc3 = bwyz4.f161566d;
            int size = (bxwc.size() + bxwc3.size()) - bxvw.size();
            if (size > 0) {
                arrayList = new ArrayList(size);
                C1230nw nwVar = new C1230nw(bxwc2.size());
                int size2 = bxwc2.size();
                int i3 = 0;
                while (i3 < size2) {
                    bwog bwog = (bwog) bxwc2.get(i3);
                    nwVar.mo15540b(bwog.f160440b, bwog);
                    i3++;
                    z2 = z2;
                }
                C1225nr nrVar = new C1225nr(bxwc.size() + bxvw.size());
                int size3 = bxwc.size();
                int i4 = 0;
                while (i4 < size3) {
                    boolean z5 = z2;
                    bwog bwog2 = ((bwny) bxwc.get(i4)).f160417b;
                    if (bwog2 == null) {
                        bwog2 = bwog.f160437f;
                    }
                    nrVar.add(Long.valueOf(bwog2.f160440b));
                    i4++;
                    z2 = z5;
                }
                nrVar.addAll(bxvw);
                int size4 = bxwc3.size();
                int i5 = 0;
                while (i5 < size4) {
                    bwny bwny = (bwny) bxwc3.get(i5);
                    bwog bwog3 = bwny.f160417b;
                    if (bwog3 == null) {
                        bwog3 = bwog.f160437f;
                    }
                    boolean z6 = z2;
                    long j2 = bwog3.f160440b;
                    if (!nrVar.contains(Long.valueOf(j2))) {
                        if (!nwVar.mo15544d(j2)) {
                            arrayList.add(bwny);
                        } else {
                            bxvd bxvd2 = (bxvd) bwny.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) bwny);
                            bxvf bxvf = (bxvf) bxvd2;
                            bwog bwog4 = (bwog) nwVar.mo15534a(j2);
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            bwny bwny2 = (bwny) bxvf.f164949b;
                            bwny bwny3 = bwny.f160414k;
                            bwog4.getClass();
                            bwny2.f160417b = bwog4;
                            bwny2.f160416a |= 1;
                            arrayList.add((bwny) bxvf.mo74062i());
                        }
                    }
                    i5++;
                    z2 = z6;
                }
                z3 = z2;
                arrayList.addAll(bxwc);
                z4 = false;
            } else {
                z3 = z2;
                z4 = false;
                arrayList = new ArrayList(0);
            }
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = z4;
            }
            bwyz bwyz5 = (bwyz) bwyy.f164949b;
            bwyz5.mo73546a();
            bxsy.m123078a(arrayList, bwyz5.f161566d);
            bwxl bwxl = c2.f122699b.f161564b;
            if (bwxl == null) {
                bwxl = bwxl.f161383i;
            }
            bwxl a2 = bjjj.m103656a(bwze, bwxl, c2.f122698a.f122692a.f122726c);
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = false;
            }
            bwyz bwyz6 = (bwyz) bwyy.f164949b;
            a2.getClass();
            bwyz6.f161564b = a2;
            bwyz6.f161563a |= 1;
            bwyz6.f161565c = GeneratedMessageLite.m124030de();
            bxwc bxwc4 = c2.f122699b.f161565c;
            bjgo bjgo = c2.f122698a.f122692a.f122726c;
            ArrayList arrayList2 = new ArrayList((bxwc4.size() - bwze.f161583c.size()) + bwze.f161582b.size());
            int size5 = bxwc4.size();
            for (int i6 = 0; i6 < size5; i6++) {
                bwxl bwxl2 = (bwxl) bxwc4.get(i6);
                if (!bwze.f161583c.contains(Long.valueOf(bwxl2.f161386b))) {
                    arrayList2.add(bjjj.m103656a(bwze, bwxl2, bjgo));
                }
            }
            arrayList2.addAll(bwze.f161582b);
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = false;
            }
            bwyz bwyz7 = (bwyz) bwyy.f164949b;
            if (!bwyz7.f161565c.mo73666a()) {
                bwyz7.f161565c = GeneratedMessageLite.m124021a(bwyz7.f161565c);
            }
            bxsy.m123078a(arrayList2, bwyz7.f161565c);
            bxwc bxwc5 = bwze.f161588h;
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = false;
            }
            bwyz bwyz8 = (bwyz) bwyy.f164949b;
            if (!bwyz8.f161569g.mo73666a()) {
                bwyz8.f161569g = GeneratedMessageLite.m124021a(bwyz8.f161569g);
            }
            bxsy.m123078a(bxwc5, bwyz8.f161569g);
            c2.f122699b = (bwyz) bwyy.mo74062i();
            c2.mo65202d();
            c2.f122698a.f122695d.mo65147a(c2.f122699b.f161566d);
            bjkb bjkb = c2.f122698a.f122697f;
            bwzd bwzd = bwze.f161587g;
            if (bwzd == null) {
                bwzd = bwzd.f161575b;
            }
            bjkb.mo65335a(bwzd);
            c2.f122698a.f122693b.mo65132a(bwze.f161584d, bwze.f161585e, bwze.f161586f, null);
            c2.mo65200c();
            if (z3) {
                c2.mo65280A();
            }
            if (c2.f122704g) {
                c2.mo65203e();
            }
        } else if (i2 != 3) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a3 = bwox.m122172a(bwoy.f160507c);
            if (a3 != 0) {
                i = a3;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unknown flow instruction: %s", objArr));
        }
    }

    /* renamed from: a */
    public final void mo65234a(bxvd bxvd) {
        bjlc bjlc;
        int i;
        bxvd bxvd2 = bxvd;
        int i2 = this.f122735a.f122724a.f151767h;
        if (i2 == 1) {
            bjld bjld = new bjld();
            long a = bjld.mo65363a();
            long b = bjld.mo65364b();
            bxvf bxvf = (bxvf) bwog.f160437f.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bwog bwog = (bwog) bxvf.f164949b;
            bwog.f160439a |= 1;
            bwog.f160440b = b;
            int a2 = bwtp.f160982d.mo73900a();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bwog bwog2 = (bwog) bxvf.f164949b;
            bwog2.f160439a |= 16;
            bwog2.f160443e = a2;
            bxvj bxvj = bwtp.f160982d;
            bxvd da = bwtp.f160981c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwtp bwtp = (bwtp) da.f164949b;
            bwtp.f160985b = 2;
            bwtp.f160984a |= 1;
            bxvf.mo74125a(bxvj, (bwtp) da.mo74062i());
            bwog bwog3 = (bwog) bxvf.mo74062i();
            bxvf bxvf2 = (bxvf) bwny.f160414k.mo74144da();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            bwny bwny = (bwny) bxvf2.f164949b;
            bwog3.getClass();
            bwny.f160417b = bwog3;
            bwny.f160416a |= 1;
            int a3 = bwto.f160977d.mo73900a();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            bwny bwny2 = (bwny) bxvf2.f164949b;
            bwny2.f160416a |= 8;
            bwny2.f160423h = a3;
            bxvj bxvj2 = bwto.f160977d;
            bxvd da2 = bwto.f160976c.mo74144da();
            bxvd da3 = bwtj.f160961f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bwtj bwtj = (bwtj) da3.f164949b;
            bwtj.f160967e = 1;
            bwtj.f160963a |= 2;
            bwtj bwtj2 = (bwtj) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwto bwto = (bwto) da2.f164949b;
            bwtj2.getClass();
            bwto.f160980b = bwtj2;
            bwto.f160979a |= 1;
            bxvf2.mo74125a(bxvj2, (bwto) da2.mo74062i());
            bwny bwny3 = (bwny) bxvf2.mo74062i();
            bxvd da4 = bwxy.f161427d.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bwxy bwxy = (bwxy) da4.f164949b;
            bwxy.f161430b = 1;
            bwxy.f161429a |= 1;
            bxvd da5 = bwya.f161433d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bwya bwya = (bwya) da5.f164949b;
            bwya.f161436b = 1;
            int i3 = bwya.f161435a | 1;
            bwya.f161435a = i3;
            bwya.f161435a = i3 | 2;
            bwya.f161437c = 48.0f;
            bwya bwya2 = (bwya) da5.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bwxy bwxy2 = (bwxy) da4.f164949b;
            bwya2.getClass();
            bwxy2.f161431c = bwya2;
            bwxy2.f161429a |= 2;
            bwxy bwxy3 = (bwxy) da4.mo74062i();
            bxvf bxvf3 = (bxvf) bwxl.f161383i.mo74144da();
            if (bxvf3.f164950c) {
                bxvf3.mo74035c();
                bxvf3.f164950c = false;
            }
            bwxl bwxl = (bwxl) bxvf3.f164949b;
            int i4 = bwxl.f161385a | 1;
            bwxl.f161385a = i4;
            bwxl.f161386b = a;
            bwxl.f161385a = i4 | 4;
            bwxl.f161388d = b;
            int a4 = bwtq.f160987d.mo73900a();
            if (bxvf3.f164950c) {
                bxvf3.mo74035c();
                bxvf3.f164950c = false;
            }
            bwxl bwxl2 = (bwxl) bxvf3.f164949b;
            bwxl2.f161385a |= 16;
            bwxl2.f161390f = a4;
            bxvj bxvj3 = bwtq.f160987d;
            bxvd da6 = bwtq.f160986c.mo74144da();
            bxvd da7 = bwtt.f160992e.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bwtt bwtt = (bwtt) da7.f164949b;
            bwtt.f160995b = 1;
            bwtt.f160994a |= 1;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bwtq bwtq = (bwtq) da6.f164949b;
            bwtt bwtt2 = (bwtt) da7.mo74062i();
            bwtt2.getClass();
            bwtq.f160990b = bwtt2;
            bwtq.f160989a = 1;
            bxvf3.mo74125a(bxvj3, (bwtq) da6.mo74062i());
            bwxr bwxr = (bwxr) bwxs.f161407d.mo74144da();
            bxvd da8 = bwxq.f161401f.mo74144da();
            bxvd da9 = bwxv.f161421d.mo74144da();
            bxvd da10 = bwxj.f161360q.mo74144da();
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bwxj bwxj = (bwxj) da10.f164949b;
            bwxy3.getClass();
            bwxj.f161372k = bwxy3;
            int i5 = bwxj.f161362a | 32;
            bwxj.f161362a = i5;
            bwxy3.getClass();
            bwxj.f161369h = bwxy3;
            bwxj.f161362a = i5 | 4;
            bxvd da11 = bwwz.f161308d.mo74144da();
            bwwy bwwy = bwwy.ALIGNMENT_CENTER;
            if (da11.f164950c) {
                da11.mo74035c();
                da11.f164950c = false;
            }
            bwwz bwwz = (bwwz) da11.f164949b;
            bwwz.f161312c = bwwy.f161307i;
            bwwz.f161310a |= 2;
            bwwy bwwy2 = bwwy.ALIGNMENT_CENTER;
            if (da11.f164950c) {
                da11.mo74035c();
                da11.f164950c = false;
            }
            bwwz bwwz2 = (bwwz) da11.f164949b;
            bwwz2.f161311b = bwwy2.f161307i;
            bwwz2.f161310a |= 1;
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bwxj bwxj2 = (bwxj) da10.f164949b;
            bwwz bwwz3 = (bwwz) da11.mo74062i();
            bwwz3.getClass();
            bwxj2.f161376o = bwwz3;
            bwxj2.f161362a |= 512;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bwxv bwxv = (bwxv) da9.f164949b;
            bwxj bwxj3 = (bwxj) da10.mo74062i();
            bwxj3.getClass();
            bwxv.f161424b = bwxj3;
            bwxv.f161423a |= 1;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bwxq bwxq = (bwxq) da8.f164949b;
            bwxv bwxv2 = (bwxv) da9.mo74062i();
            bwxv2.getClass();
            bwxq.f161406e = bwxv2;
            bwxq.f161403a |= 1;
            bwxr.mo73538a(da8);
            if (bxvf3.f164950c) {
                bxvf3.mo74035c();
                bxvf3.f164950c = false;
            }
            bwxl bwxl3 = (bwxl) bxvf3.f164949b;
            bwxs bwxs = (bwxs) bwxr.mo74062i();
            bwxs.getClass();
            bwxl3.f161387c = bwxs;
            bwxl3.f161385a |= 2;
            bwxl bwxl4 = (bwxl) bxvf3.mo74062i();
            long a5 = bjld.mo65363a();
            long b2 = bjld.mo65364b();
            bxvf bxvf4 = (bxvf) bwog.f160437f.mo74144da();
            if (bxvf4.f164950c) {
                bxvf4.mo74035c();
                bxvf4.f164950c = false;
            }
            bwog bwog4 = (bwog) bxvf4.f164949b;
            bwog4.f160439a |= 1;
            bwog4.f160440b = b2;
            bwog bwog5 = (bwog) bxvf4.mo74062i();
            bxvf bxvf5 = (bxvf) bwny.f160414k.mo74144da();
            if (bxvf5.f164950c) {
                bxvf5.mo74035c();
                bxvf5.f164950c = false;
            }
            bwny bwny4 = (bwny) bxvf5.f164949b;
            bwog5.getClass();
            bwny4.f160417b = bwog5;
            bwny4.f160416a |= 1;
            int a6 = bwsx.f160924c.mo73900a();
            if (bxvf5.f164950c) {
                bxvf5.mo74035c();
                bxvf5.f164950c = false;
            }
            bwny bwny5 = (bwny) bxvf5.f164949b;
            bwny5.f160416a |= 8;
            bwny5.f160423h = a6;
            bxvj bxvj4 = bwsx.f160924c;
            bwsw bwsw = (bwsw) bwsx.f160923b.mo74144da();
            bwsw.mo73533a(b);
            bxvf5.mo74125a(bxvj4, (bwsx) bwsw.mo74062i());
            bwny bwny6 = (bwny) bxvf5.mo74062i();
            bxvf bxvf6 = (bxvf) bwxl.f161383i.mo74144da();
            if (bxvf6.f164950c) {
                bxvf6.mo74035c();
                bxvf6.f164950c = false;
            }
            bwxl bwxl5 = (bwxl) bxvf6.f164949b;
            int i6 = bwxl5.f161385a | 1;
            bwxl5.f161385a = i6;
            bwxl5.f161386b = a5;
            bwxl5.f161385a = i6 | 4;
            bwxl5.f161388d = b2;
            int a7 = bwsv.f160917e.mo73900a();
            if (bxvf6.f164950c) {
                bxvf6.mo74035c();
                bxvf6.f164950c = false;
            }
            bwxl bwxl6 = (bwxl) bxvf6.f164949b;
            bwxl6.f161385a |= 16;
            bwxl6.f161390f = a7;
            bxvj bxvj5 = bwsv.f160917e;
            bwss bwss = (bwss) bwsv.f160916d.mo74144da();
            bwss.mo73531a(bwxl4);
            if (bwss.f164950c) {
                bwss.mo74035c();
                bwss.f164950c = false;
            }
            bwsv bwsv = (bwsv) bwss.f164949b;
            bwsv.f160921c = 1;
            bwsv.f160919a |= 1;
            bxvf6.mo74125a(bxvj5, (bwsv) bwss.mo74062i());
            bwxr bwxr2 = (bwxr) bwxs.f161407d.mo74144da();
            bxvd da12 = bwxq.f161401f.mo74144da();
            bxvd da13 = bwxv.f161421d.mo74144da();
            bxvd da14 = bwxj.f161360q.mo74144da();
            bxvd da15 = bwxy.f161427d.mo74144da();
            if (da15.f164950c) {
                da15.mo74035c();
                da15.f164950c = false;
            }
            bwxy bwxy4 = (bwxy) da15.f164949b;
            bwxy4.f161430b = 2;
            bwxy4.f161429a |= 1;
            if (da14.f164950c) {
                da14.mo74035c();
                da14.f164950c = false;
            }
            bwxj bwxj4 = (bwxj) da14.f164949b;
            bwxy bwxy5 = (bwxy) da15.mo74062i();
            bwxy5.getClass();
            bwxj4.f161372k = bwxy5;
            bwxj4.f161362a |= 32;
            if (da13.f164950c) {
                da13.mo74035c();
                da13.f164950c = false;
            }
            bwxv bwxv3 = (bwxv) da13.f164949b;
            bwxj bwxj5 = (bwxj) da14.mo74062i();
            bwxj5.getClass();
            bwxv3.f161424b = bwxj5;
            bwxv3.f161423a |= 1;
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            bwxq bwxq2 = (bwxq) da12.f164949b;
            bwxv bwxv4 = (bwxv) da13.mo74062i();
            bwxv4.getClass();
            bwxq2.f161406e = bwxv4;
            bwxq2.f161403a |= 1;
            bwxr2.mo73538a(da12);
            if (bxvf6.f164950c) {
                bxvf6.mo74035c();
                bxvf6.f164950c = false;
            }
            bwxl bwxl7 = (bwxl) bxvf6.f164949b;
            bwxs bwxs2 = (bwxs) bwxr2.mo74062i();
            bwxs2.getClass();
            bwxl7.f161387c = bwxs2;
            bwxl7.f161385a |= 2;
            bwxl bwxl8 = (bwxl) bxvf6.mo74062i();
            long a8 = bjld.mo65363a();
            bxvf bxvf7 = (bxvf) bwxl.f161383i.mo74144da();
            if (bxvf7.f164950c) {
                bxvf7.mo74035c();
                bxvf7.f164950c = false;
            }
            bwxl bwxl9 = (bwxl) bxvf7.f164949b;
            bwxl9.f161385a |= 1;
            bwxl9.f161386b = a8;
            int a9 = bwpe.f160527d.mo73900a();
            if (bxvf7.f164950c) {
                bxvf7.mo74035c();
                bxvf7.f164950c = false;
            }
            bwxl bwxl10 = (bwxl) bxvf7.f164949b;
            bwxl10.f161385a |= 16;
            bwxl10.f161390f = a9;
            bxvj bxvj6 = bwpe.f160527d;
            bxvd da16 = bwpe.f160526c.mo74144da();
            if (da16.f164950c) {
                da16.mo74035c();
                da16.f164950c = false;
            }
            bwpe bwpe = (bwpe) da16.f164949b;
            bwxl8.getClass();
            bwpe.f160530b = bwxl8;
            bwpe.f160529a |= 1;
            bxvf7.mo74125a(bxvj6, (bwpe) da16.mo74062i());
            bwxl bwxl11 = (bwxl) bxvf7.mo74062i();
            bwyy bwyy = (bwyy) bwyz.f161561h.mo74144da();
            if (bwyy.f164950c) {
                bwyy.mo74035c();
                bwyy.f164950c = false;
            }
            bwyz bwyz = (bwyz) bwyy.f164949b;
            bwxl11.getClass();
            bwyz.f161564b = bwxl11;
            bwyz.f161563a |= 1;
            bwyy.mo73545a(bwny3);
            bwyy.mo73545a(bwny6);
            bwyz bwyz2 = (bwyz) bwyy.mo74062i();
            bxvd da17 = bwyw.f161544e.mo74144da();
            if (da17.f164950c) {
                da17.mo74035c();
                da17.f164950c = false;
            }
            bwyw bwyw = (bwyw) da17.f164949b;
            bwxl11.getClass();
            bwyw.f161549d = bwxl11;
            bwyw.f161546a |= 1;
            bxvd da18 = bwyx.f161551h.mo74144da();
            if (da18.f164950c) {
                da18.mo74035c();
                da18.f164950c = false;
            }
            bwyx bwyx = (bwyx) da18.f164949b;
            int i7 = bwyx.f161553a | 1;
            bwyx.f161553a = i7;
            bwyx.f161554b = 1;
            int i8 = i7 | 2;
            bwyx.f161553a = i8;
            bwyx.f161555c = a8;
            int i9 = i8 | 4;
            bwyx.f161553a = i9;
            bwyx.f161556d = a5;
            bwny6.getClass();
            bwyx.f161557e = bwny6;
            int i10 = i9 | 8;
            bwyx.f161553a = i10;
            int i11 = i10 | 16;
            bwyx.f161553a = i11;
            bwyx.f161558f = a;
            bwny3.getClass();
            bwyx.f161559g = bwny3;
            bwyx.f161553a = i11 | 32;
            if (da17.f164950c) {
                da17.mo74035c();
                da17.f164950c = false;
            }
            bwyw bwyw2 = (bwyw) da17.f164949b;
            bwyx bwyx2 = (bwyx) da18.mo74062i();
            bwyx2.getClass();
            bwyw2.f161548c = bwyx2;
            bwyw2.f161547b = 2;
            bjlc = new bjlc(bwyz2, (bwyw) da17.mo74062i());
        } else if (i2 == 2) {
            bjlc = bjlb.m103818a();
        } else {
            throw new IllegalArgumentException("Unknown loading UI style");
        }
        mo65236c().mo65198a(bjlc.f122918a);
        bwyw bwyw3 = bjlc.f122919b;
        if (bxvd2.f164950c) {
            bxvd.mo74035c();
            bxvd2.f164950c = false;
        }
        bwzf bwzf = (bwzf) bxvd2.f164949b;
        bwzf bwzf2 = bwzf.f161591f;
        bwyw3.getClass();
        bwzf.f161595c = bwyw3;
        bwzf.f161593a |= 2;
        bjfh bjfh = this.f122740f;
        WidgetConfig widgetConfig = this.f122735a.f122724a;
        byte[] k = ((bwzf) bxvd.mo74062i()).serializeToBytes();
        long j = this.f122735a.f122725b;
        boolean contains = this.f122743i.contains(bpsg.EVENT_TYPE_API_REQUEST_START);
        GoogleAccountStateSnapshot googleAccountStateSnapshot = this.f122741g;
        String c = bjje.m103646c(widgetConfig.f151762c);
        if (!contains) {
            i = 1;
        } else {
            i = 2;
        }
        bjfh.mo65084a(100, bjjf.m103648a(0, widgetConfig, c, k, null, null, j, i, googleAccountStateSnapshot));
    }

    /* renamed from: a */
    public final void mo65226a(String str) {
        this.f122735a.f122727d.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }
}
