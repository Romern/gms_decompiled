package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: pxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxy extends aaab {

    /* renamed from: a */
    final /* synthetic */ LaunchOptions f40604a;

    /* renamed from: b */
    final /* synthetic */ String f40605b;

    /* renamed from: c */
    final /* synthetic */ pyf f40606c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxy(pyf pyf, String str, LaunchOptions launchOptions, String str2) {
        super(str);
        this.f40606c = pyf;
        this.f40604a = launchOptions;
        this.f40605b = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        LaunchOptions launchOptions = this.f40604a;
        if (launchOptions == null) {
            launchOptions = new LaunchOptions();
        }
        pyf pyf = this.f40606c;
        pyf.f40622d.mo23673b("launchApplicationWithOptions: %s %s %s", pyf.f40621c, this.f40605b, launchOptions);
        if (!TextUtils.isEmpty(this.f40605b)) {
            if (this.f40606c.f40619a.equals(this.f40605b)) {
                qay.m31792d();
            }
            this.f40606c.f40624f.mo23201a(this.f40605b, launchOptions);
            return;
        }
        this.f40606c.mo23196d(2800);
    }
}
