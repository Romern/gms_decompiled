package p000;

import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;

/* renamed from: aien */
public final /* synthetic */ class aien implements aifh {

    /* renamed from: a */
    private final String f68843a;

    public aien(String str) {
        this.f68843a = str;
    }

    /* renamed from: a */
    public final void mo37458a(aieh aieh, rlf rlf) {
        String str = this.f68843a;
        int i = aifl.f68872b;
        aigv aigv = new aigv();
        aiee aiee = new aiee(rlf);
        InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = aigv.f68881a;
        initiateBandwidthUpgradeParams.f80566a = aiee;
        initiateBandwidthUpgradeParams.f80567b = str;
        ((aigl) aieh.mo25289B()).mo36594a(initiateBandwidthUpgradeParams);
    }
}
