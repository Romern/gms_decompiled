package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: axp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axp extends axn {
    public axp() {
    }

    /* renamed from: a */
    public final void mo2837a(axp axp) {
        if (axp != null) {
            mo2830b(axp.f2502a | this.f2502a);
        }
    }

    /* renamed from: b */
    public final void mo2840b(boolean z) {
        mo2828a(16, z);
    }

    /* renamed from: c */
    public final void mo2831c(int i) {
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) > 0 && (i & 512) > 0) {
            throw new awn("IsStruct and IsArray options are mutually exclusive", ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new awn("Structs and arrays can't have \"value\" options", ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo2827d() {
        return -2147475470;
    }

    /* renamed from: e */
    public final boolean mo2845e() {
        return mo2829a(2048);
    }

    /* renamed from: f */
    public final boolean mo2846f() {
        return mo2829a(4096);
    }

    /* renamed from: g */
    public final boolean mo2847g() {
        return mo2829a(Integer.MIN_VALUE);
    }

    /* renamed from: h */
    public final boolean mo2848h() {
        return (this.f2502a & 768) > 0;
    }

    /* renamed from: i */
    public final void mo2849i() {
        mo2828a(512, true);
    }

    /* renamed from: j */
    public final void mo2850j() {
        mo2828a(4096, true);
    }

    /* renamed from: k */
    public final void mo2851k() {
        mo2828a(2048, true);
    }

    /* renamed from: l */
    public final void mo2852l() {
        mo2828a(1024, true);
    }

    public axp(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo2838a(boolean z) {
        mo2828a(64, z);
    }

    /* renamed from: b */
    public final boolean mo2841b() {
        return mo2829a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* renamed from: d */
    public final void mo2844d(boolean z) {
        mo2828a(PSKKeyManager.MAX_KEY_LENGTH_BYTES, z);
    }

    /* renamed from: a */
    public final boolean mo2839a() {
        return mo2829a(64);
    }

    /* renamed from: c */
    public final void mo2842c(boolean z) {
        mo2828a(128, z);
    }

    /* renamed from: c */
    public final boolean mo2843c() {
        return mo2829a(512);
    }
}
