package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: pyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyq extends pyw {

    /* renamed from: a */
    final /* synthetic */ LaunchOptions f40670a;

    /* renamed from: b */
    final /* synthetic */ String f40671b;

    /* renamed from: c */
    final /* synthetic */ pyx f40672c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyq(pyx pyx, String str, LaunchOptions launchOptions, String str2) {
        super(str);
        this.f40672c = pyx;
        this.f40670a = launchOptions;
        this.f40671b = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        LaunchOptions launchOptions = this.f40670a;
        if (launchOptions == null) {
            launchOptions = new LaunchOptions();
        }
        pyx pyx = this.f40672c;
        pyx.f40684d.mo23673b("launchApplicationWithOptions: %s %s %s", pyx.f40683c, this.f40671b, launchOptions);
        if (!TextUtils.isEmpty(this.f40671b)) {
            if (this.f40672c.f40681a.equals(this.f40671b)) {
                qay.m31792d();
            }
            this.f40672c.f40686f.mo23201a(this.f40671b, launchOptions);
            return;
        }
        this.f40672c.mo23196d(2800);
    }
}
