package p000;

import android.os.Bundle;
import com.google.android.gms.auth.frp.FrpSnapshot;

/* renamed from: jwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwm {

    /* renamed from: a */
    public Boolean f23406a = null;

    /* renamed from: b */
    public Boolean f23407b = null;

    /* renamed from: c */
    public FrpSnapshot f23408c = null;

    /* renamed from: d */
    public boolean f23409d = false;

    /* renamed from: e */
    public Long f23410e = null;

    /* renamed from: f */
    public boolean f23411f = false;

    /* renamed from: g */
    public volatile boolean f23412g = false;

    /* renamed from: h */
    private final Runnable f23413h;

    public jwm(Bundle bundle, Runnable runnable) {
        boolean z;
        byte[] byteArray;
        bmxy.m108581a(runnable);
        this.f23413h = runnable;
        if (bundle == null || !bundle.getBoolean("state.is_challenge_started", false)) {
            z = false;
        } else {
            z = true;
        }
        this.f23412g = z;
        if (bundle != null) {
            if (bundle.containsKey("state.create_time")) {
                this.f23410e = Long.valueOf(bundle.getLong("state.create_time"));
            }
            if (bundle.containsKey("state.checkin_result")) {
                this.f23406a = Boolean.valueOf(bundle.getBoolean("state.checkin_result", false));
            }
            if (bundle.containsKey("state.challenge_result")) {
                this.f23407b = Boolean.valueOf(bundle.getBoolean("state.challenge_result", false));
            }
            if (bundle.containsKey("state.frp_snapshot") && (byteArray = bundle.getByteArray("state.frp_snapshot")) != null) {
                this.f23408c = (FrpSnapshot) sef.m35069a(byteArray, FrpSnapshot.CREATOR);
            }
            this.f23409d = bundle.getBoolean("state.is_fre_unlocked", false);
            this.f23411f = bundle.getBoolean("state.phenotype_sync", false);
        }
    }

    /* renamed from: a */
    public final void mo14169a() {
        this.f23411f = true;
        mo14172b();
    }

    /* renamed from: b */
    public final void mo14172b() {
        if (this.f23409d || (this.f23406a != null && this.f23407b != null && this.f23408c != null && this.f23411f)) {
            this.f23413h.run();
        }
    }

    /* renamed from: a */
    public final void mo14170a(FrpSnapshot frpSnapshot) {
        this.f23408c = frpSnapshot;
        mo14172b();
    }

    /* renamed from: b */
    public final void mo14173b(boolean z) {
        this.f23407b = Boolean.valueOf(z);
        mo14172b();
    }

    /* renamed from: a */
    public final void mo14171a(boolean z) {
        this.f23406a = Boolean.valueOf(z);
        mo14172b();
    }
}
