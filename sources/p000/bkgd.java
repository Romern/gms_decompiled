package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bkgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgd {

    /* renamed from: a */
    public bjwk f124186a;

    /* renamed from: b */
    public final FragmentManager f124187b;

    /* renamed from: c */
    public final int f124188c;

    /* renamed from: d */
    public final Context f124189d;

    /* renamed from: e */
    public final LogContext f124190e;

    /* renamed from: f */
    public String f124191f;

    public bkgd(bkge bkge) {
        this.f124187b = bkge.getChildFragmentManager();
        this.f124190e = bkge.mo65980at();
        this.f124189d = bkge.f123962aG;
        this.f124188c = bkge.f123961aF;
    }

    public bkgd(FragmentManager fragmentManager, LogContext logContext, Context context, String str) {
        this.f124187b = fragmentManager;
        this.f124190e = logContext;
        this.f124189d = context;
        this.f124188c = C0126R.style.WalletEmptyStyle;
        this.f124191f = str;
    }
}
