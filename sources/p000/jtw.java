package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jtw extends jxx implements bjbh {

    /* renamed from: a */
    public static final imr f23204a = imr.m15727a("theme");

    /* renamed from: b */
    public static final imr f23205b = imr.m15727a("useImmersiveMode");

    /* renamed from: c */
    public final AtomicBoolean f23206c = new AtomicBoolean(true);

    /* renamed from: d */
    public bjby f23207d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "TargetActivity";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rrp.a(com.google.android.chimera.Activity, boolean, android.content.Context):void
     arg types: [jtw, int, jtw]
     candidates:
      rrp.a(com.google.android.chimera.Activity, java.lang.String, boolean):void
      rrp.a(com.google.android.chimera.Activity, boolean, android.content.Context):void */
    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public final void mo7716ba() {
        if (cbzk.m128961c()) {
            rrp.m34303a(this, (String) mo14202g().mo13146a(f23204a));
            rrp.m34305a((Activity) this, false, (Context) this);
            return;
        }
        rrp.m34304a(this, (String) mo14202g().mo13146a(f23204a), ((Boolean) mo14202g().mo13147a(f23205b, false)).booleanValue());
    }

    /* renamed from: bb */
    public final boolean mo14094bb() {
        return this.f23206c.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7860c() {
        this.f23207d.mo64987a();
        mo7874a(1, null);
    }

    public final void onBackPressed() {
        this.f23207d.f122495a.overridePendingTransition(C0126R.anim.sud_slide_back_in, C0126R.anim.sud_slide_back_out);
        mo7874a(0, null);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23207d = new bjby(getContainerActivity());
    }
}
