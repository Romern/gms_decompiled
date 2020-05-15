package p000;

import android.content.Context;
import com.google.android.gms.cast.JoinOptions;

/* renamed from: pxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxx extends aaab {

    /* renamed from: a */
    final /* synthetic */ JoinOptions f40600a;

    /* renamed from: b */
    final /* synthetic */ String f40601b;

    /* renamed from: c */
    final /* synthetic */ String f40602c;

    /* renamed from: d */
    final /* synthetic */ pyf f40603d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxx(pyf pyf, String str, JoinOptions joinOptions, String str2, String str3) {
        super(str);
        this.f40603d = pyf;
        this.f40600a = joinOptions;
        this.f40601b = str2;
        this.f40602c = str3;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        JoinOptions joinOptions = this.f40600a;
        if (joinOptions == null) {
            joinOptions = new JoinOptions();
        } else if (joinOptions.f29736a != 0) {
            pyf pyf = this.f40603d;
            if (!qay.m31782a(pyf.f40620b, pyf.f40621c)) {
                pyf pyf2 = this.f40603d;
                pyf2.f40622d.mo23675c("Calling package (%s) is not signed by Google; switching to STRONG connection type", pyf2.f40621c);
                joinOptions.mo17516a(0);
            }
        }
        pyf pyf3 = this.f40603d;
        pyf3.f40622d.mo23670a("joinApplication: %s %s %s %s", pyf3.f40621c, this.f40601b, this.f40602c, joinOptions);
        this.f40603d.f40624f.mo23205a(this.f40601b, this.f40602c, joinOptions);
    }
}
