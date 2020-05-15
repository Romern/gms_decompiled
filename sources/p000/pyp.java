package p000;

import android.content.Context;
import com.google.android.gms.cast.JoinOptions;

/* renamed from: pyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyp extends pyw {

    /* renamed from: a */
    final /* synthetic */ JoinOptions f40666a;

    /* renamed from: b */
    final /* synthetic */ String f40667b;

    /* renamed from: c */
    final /* synthetic */ String f40668c;

    /* renamed from: d */
    final /* synthetic */ pyx f40669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyp(pyx pyx, String str, JoinOptions joinOptions, String str2, String str3) {
        super(str);
        this.f40669d = pyx;
        this.f40666a = joinOptions;
        this.f40667b = str2;
        this.f40668c = str3;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        JoinOptions joinOptions = this.f40666a;
        if (joinOptions == null) {
            joinOptions = new JoinOptions();
        } else if (joinOptions.f29736a != 0) {
            pyx pyx = this.f40669d;
            if (!qay.m31782a(pyx.f40682b, pyx.f40683c)) {
                pyx pyx2 = this.f40669d;
                pyx2.f40684d.mo23675c("Calling package (%s) is not signed by Google; switching to STRONG connection type", pyx2.f40683c);
                joinOptions.mo17516a(0);
            }
        }
        pyx pyx3 = this.f40669d;
        pyx3.f40684d.mo23670a("joinApplication: %s %s %s %s", pyx3.f40683c, this.f40667b, this.f40668c, joinOptions);
        this.f40669d.f40686f.mo23205a(this.f40667b, this.f40668c, joinOptions);
    }
}
