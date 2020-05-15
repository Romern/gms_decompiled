package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: dzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzj extends dyg {

    /* renamed from: b */
    public static final dxr f14480b = new dxr(new dzi(), "InstalledAppsProducer", new int[]{39}, null);

    /* renamed from: k */
    private bxku f14481k;

    public dzj(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14480b, str, dqb);
    }

    /* renamed from: a */
    private final void m9885a(bxkv[] bxkvArr, long j) {
        bxvd da = bxku.f163794b.mo74144da();
        List asList = Arrays.asList(bxkvArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxku bxku = (bxku) da.f164949b;
        if (!bxku.f163797a.mo73666a()) {
            bxku.f163797a = bxvk.m124021a(bxku.f163797a);
        }
        bxsy.m123078a(asList, bxku.f163797a);
        this.f14481k = (bxku) da.mo74062i();
        tip tip = new tip(7, 39, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxku.f163795c, this.f14481k);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* renamed from: a */
    protected static bxkv[] m9886a(PackageManager packageManager) {
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        int size = installedPackages.size();
        bxkv[] bxkvArr = new bxkv[size];
        for (int i = 0; i < size; i++) {
            bxvd da = bxkv.f163798c.mo74144da();
            String str = installedPackages.get(i).packageName;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxkv bxkv = (bxkv) da.f164949b;
            str.getClass();
            bxkv.f163800a |= 1;
            bxkv.f163801b = str;
            bxkvArr[i] = (bxkv) da.mo74062i();
        }
        return bxkvArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m9885a(m9886a(this.f14388d.getPackageManager()), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14481k = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
            bxkv[] a = m9886a(this.f14388d.getPackageManager());
            if (!mo9861g()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dzj", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[InstalledAppsProducer] No ongoing data");
                m9885a(a, dwq.m9665i().mo20505a());
                return;
            }
            long a2 = dwq.m9665i().mo20505a();
            mo9846a(a2);
            m9885a(a, a2 + 1);
        }
    }
}
