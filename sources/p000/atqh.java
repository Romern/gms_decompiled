package p000;

import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqh {

    /* renamed from: a */
    public int f90658a;

    /* renamed from: b */
    public String f90659b;

    /* renamed from: c */
    public String f90660c;

    /* renamed from: d */
    public AccountInfo f90661d;

    /* renamed from: e */
    public int f90662e;

    /* renamed from: f */
    public bpan f90663f = bpan.UNKNOWN_PROMPT_TYPE;

    /* renamed from: g */
    public String f90664g;

    /* renamed from: h */
    private Boolean f90665h;

    /* renamed from: a */
    public final atqi mo50117a() {
        sdo.m34959a(Integer.valueOf(this.f90658a));
        sdo.m34959a(Integer.valueOf(this.f90662e));
        sdo.m34959a(this.f90661d);
        sdo.m34959a(this.f90663f);
        sdo.m34959a(this.f90665h);
        sdo.m34959a((Object) this.f90664g);
        atqi atqi = new atqi();
        Bundle bundle = new Bundle();
        bundle.putInt("brandIconResId", this.f90658a);
        bundle.putString("title", this.f90660c);
        bundle.putString("message", this.f90659b);
        bundle.putParcelable("accountInfo", this.f90661d);
        bundle.putInt("requestCode", this.f90662e);
        bundle.putInt("promptType", this.f90663f.f135522y);
        bundle.putBoolean("shouldShowTos", this.f90665h.booleanValue());
        bundle.putString("positiveButtonText", this.f90664g);
        atqi.setArguments(bundle);
        return atqi;
    }

    /* renamed from: a */
    public final void mo50118a(boolean z) {
        this.f90665h = Boolean.valueOf(z);
    }
}
