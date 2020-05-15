package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaApiChimeraService;

/* renamed from: aoqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoqw extends aaab {

    /* renamed from: a */
    final RecaptchaApiChimeraService f78713a;

    /* renamed from: b */
    private final aorg f78714b;

    public aoqw(RecaptchaApiChimeraService recaptchaApiChimeraService, aorg aorg) {
        super(205, "RecaptchaV3Close");
        this.f78713a = recaptchaApiChimeraService;
        this.f78714b = aorg;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean b = this.f78713a.mo46802b();
        aorg aorg = this.f78714b;
        if (aorg != null) {
            aorg.mo43190a(new Status(0), b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aorg.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      dcj.a(int, android.os.Parcel):android.os.Parcel
      aorg.a(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        aorg aorg = this.f78714b;
        if (aorg != null) {
            aorg.mo43190a(status, false);
        }
    }
}
