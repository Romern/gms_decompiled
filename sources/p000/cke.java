package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* renamed from: cke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cke implements cjq {

    /* renamed from: a */
    private final cjq f6976a;

    /* renamed from: b */
    private final Resources f6977b;

    public cke(Resources resources, cjq cjq) {
        this.f6977b = resources;
        this.f6976a = cjq;
    }

    /* renamed from: a */
    private final Uri m4392a(Integer num) {
        try {
            String resourcePackageName = this.f6977b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.f6977b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.f6977b.getResourceEntryName(num.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(valueOf);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        Uri a = m4392a((Integer) obj);
        if (a != null) {
            return this.f6976a.mo3930a(a, i, i2, cdk);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3931a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
