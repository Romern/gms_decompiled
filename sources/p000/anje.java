package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: anje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anje {

    /* renamed from: a */
    final qws f76990a;

    public anje(Context context) {
        String str;
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        if (a.length > 0) {
            str = a[0].name;
        } else {
            str = null;
        }
        this.f76990a = new qws(context, "PHONESKY_RECOVERY", str);
    }

    /* renamed from: a */
    public final void mo41866a(int i) {
        mo41867a(i, 2);
    }

    /* renamed from: a */
    public final void mo41867a(int i, int i2) {
        bxvd da = bvzu.f158579d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvzu bvzu = (bvzu) da.f164949b;
        bvzu.f158582b = i - 1;
        int i3 = bvzu.f158581a | 1;
        bvzu.f158581a = i3;
        bvzu.f158583c = i2 - 1;
        bvzu.f158581a = i3 | 2;
        this.f76990a.mo24333a(da.mo74062i()).mo24327b();
    }
}
