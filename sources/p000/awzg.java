package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awzg extends awzk implements bkdm, awgb {

    /* renamed from: a */
    private final bkcg f95349a = new awzf(this);

    /* renamed from: u */
    bkch f95350u;

    /* renamed from: v */
    boolean f95351v;

    /* renamed from: w */
    final Runnable f95352w = awgc.m79888a(this, "autoSubmit");

    /* renamed from: x */
    int f95353x = 1;

    /* renamed from: N */
    public final void mo52814N() {
        this.f95351v = false;
        this.f95398ak.f110452a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo52815O() {
        mo52808n(!this.f95398ak.f110452a);
    }

    /* renamed from: P */
    public final boolean mo52816P() {
        return bkde.m105347a(this.f95385aC);
    }

    /* renamed from: Q */
    public final boolean mo52817Q() {
        return bkde.m105349b(this.f95385aC);
    }

    /* renamed from: R */
    public final boolean mo52818R() {
        return bkde.m105350c(this.f95385aC);
    }

    /* renamed from: S */
    public final boolean mo52819S() {
        return bkde.m105351d(this.f95385aC);
    }

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return bkde.m105352e(this.f95385aC);
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        Object ar = mo65819ar();
        if (ar instanceof bkdw) {
            return (bkdw) ar;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo52822V() {
        if (this.f95398ak.f110452a && !this.f95351v) {
            if (mo52775bR()) {
                long j = 0;
                if (this.f95398ak.f110459h > 0) {
                    j = SystemClock.elapsedRealtime() - this.f95365I;
                }
                if (j >= this.f95398ak.f110459h) {
                    this.f95351v = true;
                    mo51903a();
                    return;
                }
                mo52881an().removeCallbacks(this.f95352w);
                mo52881an().postDelayed(this.f95352w, this.f95398ak.f110459h - j);
                return;
            }
            mo52070p();
        }
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        if (str == null) {
            str = getResources().getString(C0126R.string.wallet_uic_string_list_append_to_end);
        }
        return bkde.m105344a(this.f95385aC, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51903a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51908a(bmaf bmaf);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52828b(Bundle bundle) {
        super.mo52828b(bundle);
        bkch bkch = (bkch) getFragmentManager().findFragmentByTag("closeConfirm");
        this.f95350u = bkch;
        if (bkch != null) {
            bkch.f123992d = this.f95349a;
        }
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int size = this.f95385aC.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f95385aC.get(i)).f124039e;
            if ((obj instanceof bkdm) && !((bkdm) obj).mo52775bR()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bS */
    public final boolean mo52365bS() {
        return true;
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        return bkde.m105360m(this.f95385aC);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo52831c(awyy awyy) {
        boolean z;
        bmdx bmdx;
        bmbr bmbr;
        String str;
        bmdx bmdx2;
        bmdx bmdx3;
        bmbr bmbr2;
        bmdx bmdx4;
        bmbr bmbr3;
        bmdx bmdx5;
        bmdx bmdx6;
        bmbr bmbr4;
        bxvw bxvw = awyy.f95340b.f129973i;
        int size = bxvw.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            long longValue = ((Long) bxvw.get(i2)).longValue();
            bxxc a = mo52042a(longValue);
            if (a instanceof bmeb) {
                bmeb bmeb = (bmeb) a;
                if (awzs.m81801a(bmeb) && !((Boolean) awim.f94478d.mo58455c()).booleanValue()) {
                    if (bmeb.f128906c.size() == 1) {
                        z = ((bmea) bmeb.f128906c.get(0)).f128899a != 1;
                    } else {
                        z = false;
                    }
                    sdo.m34971a(z, (Object) "Simple forms containing an address form together with other fields are not supported.");
                    if (awyy.f95340b.f129973i.size() > 1) {
                        throw new IllegalArgumentException("Currently if a simple form containing an address form and no other fields, it should be the only component in the field group");
                    } else if (((Boolean) awim.f94477c.mo58455c()).booleanValue()) {
                        mo52852a(awyy, longValue);
                        ArrayList a2 = mo52847a(6, awzs.class);
                        int size2 = a2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            awzs awzs = (awzs) a2.get(i3);
                            long W = awzs.mo52837W();
                            bmdn bmdn = bmeb.f128905b;
                            if (bmdn == null) {
                                bmdn = bmdn.f128831k;
                            }
                            if (W == bmdn.f128835c) {
                                awzs.f124388I = awyy.f95340b;
                                int size3 = awzs.f124408j.size();
                                while (i < size3) {
                                    ((bkag) awzs.f124408j.get(i)).mo65666a(awzs.f124388I);
                                    i++;
                                }
                                return;
                            }
                        }
                        return;
                    } else {
                        bmea bmea = (bmea) bmeb.f128906c.get(0);
                        if (bmea.f128899a != 2) {
                            bmdx = bmdx.f128886d;
                        } else {
                            bmdx = (bmdx) bmea.f128900b;
                        }
                        if (bmdx.f128888a == 2) {
                            bmbr = (bmbr) bmdx.f128889b;
                        } else {
                            bmbr = bmbr.f128572L;
                        }
                        if ((bmbr.f128584a & 1048576) != 0) {
                            bmea bmea2 = (bmea) bmeb.f128906c.get(0);
                            if (bmea2.f128899a != 2) {
                                bmdx6 = bmdx.f128886d;
                            } else {
                                bmdx6 = (bmdx) bmea2.f128900b;
                            }
                            if (bmdx6.f128888a == 2) {
                                bmbr4 = (bmbr) bmdx6.f128889b;
                            } else {
                                bmbr4 = bmbr.f128572L;
                            }
                            str = bmbr4.f128578E;
                        } else {
                            str = null;
                        }
                        bxvd bxvd = (bxvd) bmeb.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) bmeb);
                        bmdz bmdz = (bmdz) bxvd;
                        bmea bmea3 = (bmea) bmeb.f128906c.get(0);
                        bxvd bxvd2 = (bxvd) bmea3.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) bmea3);
                        bmea bmea4 = (bmea) bmeb.f128906c.get(0);
                        if (bmea4.f128899a != 2) {
                            bmdx2 = bmdx.f128886d;
                        } else {
                            bmdx2 = (bmdx) bmea4.f128900b;
                        }
                        bxvd bxvd3 = (bxvd) bmdx2.mo74142c(5);
                        bxvd3.mo73625a((GeneratedMessageLite) bmdx2);
                        bmea bmea5 = (bmea) bmeb.f128906c.get(0);
                        if (bmea5.f128899a != 2) {
                            bmdx3 = bmdx.f128886d;
                        } else {
                            bmdx3 = (bmdx) bmea5.f128900b;
                        }
                        if (bmdx3.f128888a == 2) {
                            bmbr2 = (bmbr) bmdx3.f128889b;
                        } else {
                            bmbr2 = bmbr.f128572L;
                        }
                        bxvd bxvd4 = (bxvd) bmbr2.mo74142c(5);
                        bxvd4.mo73625a((GeneratedMessageLite) bmbr2);
                        bmbn bmbn = (bmbn) bxvd4;
                        String str2 = awyy.f95340b.f129970f;
                        if (bmbn.f164950c) {
                            bmbn.mo74035c();
                            bmbn.f164950c = false;
                        }
                        bmbr bmbr5 = (bmbr) bmbn.f164949b;
                        bxvu bxvu = bmbr.f128574y;
                        str2.getClass();
                        bmbr5.f128584a |= 1048576;
                        bmbr5.f128578E = str2;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        bmdx bmdx7 = (bmdx) bxvd3.f164949b;
                        bmbr bmbr6 = (bmbr) bmbn.mo74062i();
                        bmdx bmdx8 = bmdx.f128886d;
                        bmbr6.getClass();
                        bmdx7.f128889b = bmbr6;
                        bmdx7.f128888a = 2;
                        bmdx bmdx9 = (bmdx) bxvd3.mo74062i();
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bmea bmea6 = (bmea) bxvd2.f164949b;
                        bmea bmea7 = bmea.f128897c;
                        bmdx9.getClass();
                        bmea6.f128900b = bmdx9;
                        bmea6.f128899a = 2;
                        bmdz.mo66782a(0, bxvd2);
                        bmeb bmeb2 = (bmeb) bmdz.mo74062i();
                        mo52045a(longValue, bmeb2);
                        mo52852a(awyy, longValue);
                        bmea bmea8 = (bmea) bmeb2.f128906c.get(0);
                        if (bmea8.f128899a == 2) {
                            bmdx4 = (bmdx) bmea8.f128900b;
                        } else {
                            bmdx4 = bmdx.f128886d;
                        }
                        if (bmdx4.f128888a == 2) {
                            bmbr3 = (bmbr) bmdx4.f128889b;
                        } else {
                            bmbr3 = bmbr.f128572L;
                        }
                        bxvd bxvd5 = (bxvd) bmbr3.mo74142c(5);
                        bxvd5.mo73625a((GeneratedMessageLite) bmbr3);
                        bmbn bmbn2 = (bmbn) bxvd5;
                        if (str == null) {
                            if (bmbn2.f164950c) {
                                bmbn2.mo74035c();
                                bmbn2.f164950c = false;
                            }
                            bmbr bmbr7 = (bmbr) bmbn2.f164949b;
                            bmbr7.f128584a &= -1048577;
                            bmbr7.f128578E = bmbr.f128572L.f128578E;
                        } else {
                            if (bmbn2.f164950c) {
                                bmbn2.mo74035c();
                                bmbn2.f164950c = false;
                            }
                            bmbr bmbr8 = (bmbr) bmbn2.f164949b;
                            str.getClass();
                            bmbr8.f128584a = 1048576 | bmbr8.f128584a;
                            bmbr8.f128578E = str;
                        }
                        bxvd bxvd6 = (bxvd) bmeb2.mo74142c(5);
                        bxvd6.mo73625a((GeneratedMessageLite) bmeb2);
                        bmdz bmdz2 = (bmdz) bxvd6;
                        bmea bmea9 = (bmea) bmeb2.f128906c.get(0);
                        bxvd bxvd7 = (bxvd) bmea9.mo74142c(5);
                        bxvd7.mo73625a((GeneratedMessageLite) bmea9);
                        bmea bmea10 = (bmea) bmeb2.f128906c.get(0);
                        if (bmea10.f128899a == 2) {
                            bmdx5 = (bmdx) bmea10.f128900b;
                        } else {
                            bmdx5 = bmdx.f128886d;
                        }
                        bxvd bxvd8 = (bxvd) bmdx5.mo74142c(5);
                        bxvd8.mo73625a((GeneratedMessageLite) bmdx5);
                        if (bxvd8.f164950c) {
                            bxvd8.mo74035c();
                            bxvd8.f164950c = false;
                        }
                        bmdx bmdx10 = (bmdx) bxvd8.f164949b;
                        bmbr bmbr9 = (bmbr) bmbn2.mo74062i();
                        bmbr9.getClass();
                        bmdx10.f128889b = bmbr9;
                        bmdx10.f128888a = 2;
                        bmdx bmdx11 = (bmdx) bxvd8.mo74062i();
                        if (bxvd7.f164950c) {
                            bxvd7.mo74035c();
                            bxvd7.f164950c = false;
                        }
                        bmea bmea11 = (bmea) bxvd7.f164949b;
                        bmdx11.getClass();
                        bmea11.f128900b = bmdx11;
                        bmea11.f128899a = 2;
                        bmdz2.mo66782a(0, bxvd7);
                        mo52045a(longValue, (bmeb) bmdz2.mo74062i());
                        return;
                    }
                }
            }
            if (!(a instanceof bmfd) || ((Boolean) awim.f94476b.mo58455c()).booleanValue()) {
                i2++;
            } else if (awyy.f95340b.f129973i.size() > 1) {
                throw new IllegalArgumentException("Currently if there is a DynamicList and using it in field group is disabled, it should be the only component");
            } else {
                return;
            }
        }
        SummaryExpanderWrapper a3 = awgp.m79906a(awyy.f95340b, awyy.f95341c, this, this, true);
        a3.setId(this.f95376T.mo65614a());
        awyy.f95341c.addView(a3);
        this.f95406as.add(a3);
        awyy.f95343e.mo66032a((bkiq) a3);
        awyx a4 = awyy.mo52799a();
        a4.mo52798a(a3);
        awyy a5 = a4.mo52797a();
        bxvw bxvw2 = awyy.f95340b.f129973i;
        int size4 = bxvw2.size();
        while (i < size4) {
            mo52852a(a5, ((Long) bxvw2.get(i)).longValue());
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cc */
    public void mo52283cc() {
    }

    /* renamed from: d */
    public final bkjt mo52833d(List list) {
        bkjt d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) list.get(i)).f124039e;
            if (obj instanceof bkjt) {
                return (bkjt) obj;
            }
            if ((obj instanceof bkdx) && (d = mo52833d((List) ((bkdx) obj).mo52778bW())) != null) {
                return d;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        bkde.m105345a(this.f95385aC, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo51922f() {
        super.mo51922f();
        if (chjq.m148833b() && !this.f124195aJ && this.f95368L == 0 && mo52806b((List) null)) {
            this.f95363G.mo66041d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract List mo51923g();

    /* renamed from: h */
    public void mo52066h(Bundle bundle) {
        if ("autoSubmit".equals(awgc.m79889a(bundle))) {
            this.f95351v = true;
            mo51903a();
            mo52881an().removeCallbacks(this.f95352w);
        } else if ("scrollToTop".equals(awgc.m79889a(bundle))) {
            mo51917c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f95351v = bundle.getBoolean("doneAutoSubmitForThisPage", false);
            this.f95353x = bphx.m111944a(bundle.getInt("exitAction", 0));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("doneAutoSubmitForThisPage", this.f95351v);
        int i = this.f95353x;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("exitAction", i2);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo52070p() {
    }

    /* renamed from: a */
    public void mo51904a(int i) {
        bmav bmav;
        super.mo51904a(i);
        mo52822V();
        if (i == 1 && (bmav = this.f95398ak.f110468q) != null && bkfr.m105582a(bmav)) {
            mo52832c((List) bmav.f128505d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52829b(awyy awyy) {
        int a;
        int a2 = bmlu.m108157a(awyy.f95340b.f129968d);
        if ((a2 != 0 && a2 == 4) || ((a = bmlu.m108157a(awyy.f95340b.f129968d)) != 0 && a == 7)) {
            mo52831c(awyy);
        } else {
            super.mo52829b(awyy);
        }
    }

    /* renamed from: a */
    public void mo52044a(int i, int i2) {
        super.mo52044a(i, i2);
        if (i2 == 4) {
            if (i == 0 || i == 2) {
                mo52283cc();
                return;
            }
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unexpected button code: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    public void mo52065d(int i) {
        if (!bkfr.m105580a(this.f123962aG, bmap.ENABLE_CANCEL_CONFIRMATION_DIALOG) || mo52870ac() || this.f95370N || !mo52819S()) {
            super.mo52065d(i);
            return;
        }
        this.f95353x = i;
        bkch bkch = (bkch) getFragmentManager().findFragmentByTag("closeConfirm");
        this.f95350u = bkch;
        if (bkch == null) {
            ContextThemeWrapper contextThemeWrapper = this.f123962aG;
            int i2 = awzr.f95435a;
            bxvd da = bmde.f128780k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmde bmde = (bmde) da.f164949b;
            bmde.f128791j = 0;
            bmde.f128782a |= 128;
            String string = contextThemeWrapper.getString(C0126R.string.wallet_cancel_payment_title);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmde bmde2 = (bmde) da.f164949b;
            string.getClass();
            bmde2.f128782a |= 8;
            bmde2.f128786e = string;
            bxvd da2 = bmnr.f130153o.mo74144da();
            String string2 = contextThemeWrapper.getString(C0126R.string.wallet_cancel_payment_message);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmnr bmnr = (bmnr) da2.f164949b;
            string2.getClass();
            bmnr.f130155a |= 4;
            bmnr.f130159e = string2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmde bmde3 = (bmde) da.f164949b;
            bmnr bmnr2 = (bmnr) da2.mo74062i();
            bmnr2.getClass();
            if (!bmde3.f128787f.mo73666a()) {
                bmde3.f128787f = GeneratedMessageLite.m124021a(bmde3.f128787f);
            }
            bmde3.f128787f.add(bmnr2);
            String string3 = contextThemeWrapper.getString(17039379);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmde bmde4 = (bmde) da.f164949b;
            string3.getClass();
            bmde4.f128782a |= 32;
            bmde4.f128789h = string3;
            String string4 = contextThemeWrapper.getString(17039369);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmde bmde5 = (bmde) da.f164949b;
            string4.getClass();
            bmde5.f128782a |= 64;
            bmde5.f128790i = string4;
            this.f95350u = awzr.m81794a((bmde) da.mo74062i());
        }
        bkch bkch2 = this.f95350u;
        bkch2.f123992d = this.f95349a;
        bkch2.show(getFragmentManager(), "closeConfirm");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int]
     candidates:
      awzg.a(int, int):void
      awzg.a(int, android.os.Bundle):void
      awzg.a(java.util.List, boolean):boolean
      awzg.a(boolean, boolean):boolean
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void */
    /* renamed from: b */
    public final void mo52830b(PageDetails pageDetails, boolean z, String str) {
        boolean z2;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int ordinal = pageDetails.f110454c.ordinal();
        boolean z3 = false;
        if (ordinal != 2) {
            if (ordinal == 7) {
                pageDetails.f110452a = true;
            } else if (ordinal == 10) {
                bmav bmav = pageDetails.f110468q;
                if (bmav == null) {
                    Log.e("PageFormFragment", "No error provided for HANDLE_UI_ERROR instruction.");
                    mo52897g(-1);
                    return;
                } else if (bkfr.m105582a(bmav) && z) {
                    mo52862a(pageDetails, false);
                    this.f95368L = 1;
                    mo52880am();
                    z3 = true;
                } else if (bkfr.m105582a(pageDetails.f110468q)) {
                    mo52862a(pageDetails, true);
                    mo52808n(true);
                    mo52832c((List) pageDetails.f110468q.f128505d);
                    this.f95363G.mo66055n();
                    z3 = true;
                }
            }
        } else if (this.f95397aj == null) {
            Log.e("PageFormFragment", "No mActivePage for continue with current page instruction.");
            mo52897g(-1);
            return;
        } else {
            if (pageDetails.f110452a || this.f95398ak.f110452a) {
                z2 = true;
            } else {
                z2 = false;
            }
            pageDetails.f110452a = z2;
            if (pageDetails.f110459h == 0) {
                pageDetails.f110459h = this.f95398ak.f110459h;
            }
            if (pageDetails.f110469r == 1) {
                pageDetails.f110469r = this.f95398ak.f110469r;
            }
        }
        if (pageDetails.f110454c != bwgz.HANDLE_UI_ERROR || !z3) {
            super.mo52830b(pageDetails, z, str);
        }
    }

    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        int i2;
        if (i == 3) {
            String string = bundle.getString("EventListener.EXTRA_FORM_ID");
            int i3 = bundle.getInt("EventListener.EXTRA_FIELD_ID");
            List<bmaf> g = mo51923g();
            if (g != null) {
                for (bmaf bmaf : g) {
                    if (bmaf.f128438a.equals(string) && (i2 = bmaf.f128439b) != 0 && i2 == i3) {
                        mo51908a(bmaf);
                    }
                }
            }
        } else if (i == 4) {
            bkjt d = mo52833d((List) this.f95385aC);
            if (d != null && d.mo66099m() && !mo52075v()) {
                throw new IllegalStateException("Gaia password challenge not support in current flow.");
            } else if (bundle.getBoolean("EventListener.EXTRA_SHOULD_AUTO_SUBMIT", false)) {
                long j = bundle.getLong("EventListener.EXTRA_AUTO_SUBMIT_TIME_OUT_MILLIS", 0);
                PageDetails pageDetails = this.f95398ak;
                pageDetails.f110459h = j;
                pageDetails.f110452a = true;
            }
        } else if (i == 1 && mo52838X()) {
            mo51922f();
            mo52822V();
        }
        super.mo51905a(i, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52824a(awyy awyy) {
        int a;
        int a2 = bmlu.m108157a(awyy.f95340b.f129968d);
        if ((a2 != 0 && a2 == 4) || ((a = bmlu.m108157a(awyy.f95340b.f129968d)) != 0 && a == 7)) {
            mo52831c(awyy);
        } else {
            super.mo52824a(awyy);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzg.a(java.util.List, boolean):boolean
     arg types: [java.util.List, int]
     candidates:
      awzg.a(int, int):void
      awzg.a(int, android.os.Bundle):void
      awzg.a(boolean, boolean):boolean
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzg.a(java.util.List, boolean):boolean */
    /* renamed from: b */
    public final boolean mo52806b(List list) {
        return mo52826a(list, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52825a(awyy awyy, int i, long j) {
        if (i == 10) {
            boolean z = awyy.f95339a;
            axaj axaj = (axaj) getChildFragmentManager().findFragmentByTag("documentUploadForm");
            if (z || axaj == null) {
                int i2 = this.f123961aF;
                String str = this.f95359C;
                LogContext at = mo65980at();
                axaj axaj2 = new axaj();
                Bundle a = bkdx.m105383a(i2, (bmfb) mo52042a(j), at);
                a.putString("flowAnalyticsId", str);
                a.putInt("flowType", 8);
                axaj2.setArguments(a);
                getChildFragmentManager().beginTransaction().add(axaj2, "documentUploadForm").commit();
                axaj = axaj2;
            }
            axaj.f124196aK = this.f124196aK;
            mo52849a(10, axaj);
            this.f95385aC.add(new bkde(axaj));
        } else if (i == 24) {
            bmfs bmfs = (bmfs) mo52042a(j);
            this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_instrument_activation_holder, awyy.f95341c, true);
            FormHeaderView formHeaderView = (FormHeaderView) awyy.f95341c.findViewById(C0126R.C0129id.instrument_activation_fragment_form_header);
            if ((bmfs.f129157a & 1) != 0) {
                formHeaderView.setVisibility(0);
                bmdn bmdn = bmfs.f129160d;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                formHeaderView.mo71963a(bmdn, this.f123963aH, null, this.f95386aD);
                ArrayList arrayList = this.f95385aC;
                bmdn bmdn2 = bmfs.f129160d;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                arrayList.add(new bkde(bmdn2.f128835c, formHeaderView, null));
            } else {
                formHeaderView.setVisibility(8);
            }
            awyx a2 = awyy.mo52799a();
            a2.mo52798a((FrameLayout) awyy.f95341c.findViewById(C0126R.C0129id.instrument_activation_fragment_holder));
            mo52890c(a2.mo52797a(), j);
        } else if (bkfr.m105578a(i)) {
            mo52887b(awyy, j);
        } else {
            super.mo52825a(awyy, i, j);
        }
    }

    /* renamed from: a */
    public void mo52364a(PageDetails pageDetails, boolean z, String str) {
        if (pageDetails.f110468q == null) {
            this.f95351v = false;
        }
        super.mo52364a(pageDetails, z, str);
    }

    /* renamed from: a */
    public boolean mo52281a(bmas bmas) {
        int size = this.f95385aC.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f95385aC.get(i)).f124039e;
            if ((obj instanceof bkdm) && ((bkdm) obj).mo52281a(bmas)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzg.a(java.util.List, boolean):boolean
     arg types: [java.util.List, int]
     candidates:
      awzg.a(int, int):void
      awzg.a(int, android.os.Bundle):void
      awzg.a(boolean, boolean):boolean
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzg.a(java.util.List, boolean):boolean */
    /* renamed from: a */
    public final boolean mo52804a(List list) {
        boolean a = mo52826a(list, true);
        if (!a) {
            this.f95363G.mo66055n();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52826a(List list, boolean z) {
        return bkde.m105348a(this.f95385aC, list, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52827a(boolean z, boolean z2) {
        return z && (z2 || this.f95398ak.f110452a);
    }

    /* renamed from: c */
    public final void mo52832c(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            bmas bmas = (bmas) list.get(i);
            i++;
            if (!mo52281a(bmas)) {
                bmaf bmaf = bmas.f128496a;
                if (bmaf == null) {
                    bmaf = bmaf.f128436d;
                }
                String valueOf = String.valueOf(bmaf.f128438a);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("FormFieldMessage could not be applied: ") : "FormFieldMessage could not be applied: ".concat(valueOf));
            }
        }
    }
}
