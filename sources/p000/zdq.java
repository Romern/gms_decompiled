package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;

/* renamed from: zdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdq {

    /* renamed from: a */
    private static final srn f54966a = zvt.m46581a();

    /* renamed from: b */
    private static final yuw f54967b = yuq.m44880a(zdo.f54964a);

    /* renamed from: c */
    private static final yuw f54968c = yuq.m44880a(zdp.f54965a);

    /* renamed from: d */
    private final Context f54969d;

    /* renamed from: e */
    private final ysl f54970e;

    public zdq(Context context, String str, yst yst) {
        this.f54969d = context;
        this.f54970e = yst.mo30741b(str);
    }

    /* renamed from: a */
    public final bmxv mo30958a(String str) {
        try {
            ApplicationInfo applicationInfo = this.f54969d.getPackageManager().getApplicationInfo(str, 0);
            return bmxv.m108566b(new ClientIdentity(applicationInfo.uid, applicationInfo.packageName));
        } catch (PackageManager.NameNotFoundException e) {
            ((bnsl) f54966a.mo68388c()).mo68420a("Couldn't find package %s in PM.  Assuming uninstalled", str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public final boolean mo30960b(String str) {
        try {
            return this.f54969d.getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            ((bnsl) f54966a.mo68388c()).mo68420a("Couldn't find package %s in PM.  Assuming uninstalled", str);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo30961c(String str) {
        if (cdyr.f181940a.mo6606a().mo78486l()) {
            return ((bnic) f54968c.mo30787a()).contains(str);
        }
        return true;
    }

    /* renamed from: a */
    public final Status mo30959a(String str, cadr cadr) {
        Status status;
        if (((bnic) f54967b.mo30787a()).contains(str)) {
            return Status.f30107a;
        }
        if ((cadr.f172719a & 1) == 0) {
            caah a = yyo.m45042a(cadr);
            if (bzzn.m126363a(bzzn.f172102ao, a)) {
                return Status.f30107a;
            }
            status = this.f54970e.mo30725b(str, bnic.m109489a(a), 1);
        } else {
            caae caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            status = this.f54970e.mo30717a(str, bnic.m109489a(caae), 1);
        }
        return (status.mo17710c() || status.mo17709b() || !cdyr.f181940a.mo6606a().mo78476b()) ? status : Status.f30107a;
    }
}
