package p000;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: axwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwz extends axud {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axwz(Context context, axwi axwi, ayak ayak, ayae ayae, axxv axxv, axzm axzm) {
        super(context, axwi, ayak, ayae, axxv, axzm);
        new aydq(context);
        mo53562b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53556a(String str) {
        synchronized (this.f96367d) {
            Log.i("CloudSync", "Disabling cloud sync.");
            mo53569h();
            axuc axuc = this.f96370g;
            String str2 = str.length() == 0 ? new String("Cloud sync is disabled: ") : "Cloud sync is disabled: ".concat(str);
            List list = axuc.f96363a;
            String a = ayjl.m84111a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(str2).length());
            sb.append(a);
            sb.append(", ");
            sb.append(str2);
            list.add(0, sb.toString());
            if (axuc.f96363a.size() > 20) {
                List list2 = axuc.f96363a;
                list2.remove(list2.size() - 1);
            }
        }
    }

    /* renamed from: j */
    public final void mo53571j() {
        synchronized (this.f96367d) {
            if (!this.f96364a) {
                mo53556a("not opted in");
            } else if (!this.f96365b) {
                mo53556a("disabled in setting");
            } else if (chnj.m149030f()) {
                mo53556a("disabled via gservices");
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        super.mo53558a(ssb, z, z2);
        ssb.println("--------------");
        ssb.println("Cloud Sync Activity History: ");
        ssb.mo26034a();
        ssb.println(this.f96370g.toString());
        ssb.mo26035b();
    }
}
