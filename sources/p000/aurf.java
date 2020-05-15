package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aurf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurf implements aure {
    /* renamed from: a */
    public final int mo50814a() {
        return C0126R.string.trust_agent_onboarding_smartlock_text_title;
    }

    /* renamed from: b */
    public final int mo50816b() {
        return C0126R.string.trust_agent_onboarding_smartlock_text_body;
    }

    /* renamed from: c */
    public final int mo50817c() {
        return C0126R.string.trust_agent_onboarding_smartlock_challenge_screenlock;
    }

    /* renamed from: d */
    public final int mo50818d() {
        return C0126R.string.trust_agent_smartlock_needs_screenlock;
    }

    /* renamed from: e */
    public final int mo50819e() {
        return C0126R.string.common_next;
    }

    /* renamed from: a */
    public final Intent mo50815a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings");
        return intent;
    }
}
