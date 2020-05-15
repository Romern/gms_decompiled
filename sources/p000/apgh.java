package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: apgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apgh extends apfx {

    /* renamed from: a */
    protected final apga f84332a = new apgg(this);

    /* renamed from: b */
    final /* synthetic */ byte[] f84333b;

    /* renamed from: c */
    final /* synthetic */ String f84334c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apgh(rkb rkb, byte[] bArr, String str) {
        super(rkb);
        this.f84333b = bArr;
        this.f84334c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        apgp apgp = (apgp) rjd;
        apga apga = this.f84332a;
        byte[] bArr = this.f84333b;
        String str = this.f84334c;
        if (TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = apgp.f84344a.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(apgp.f84344a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null)) {
                    str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            str = null;
        }
        ((apgd) apgp.mo25289B()).mo47185a(apga, bArr, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new apgf(status, null);
    }
}
