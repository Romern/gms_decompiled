package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import java.util.HashSet;

/* renamed from: qpd */
final /* synthetic */ class qpd implements View.OnClickListener {

    /* renamed from: a */
    private final qpe f41910a;

    /* renamed from: b */
    private final Bundle f41911b;

    public qpd(qpe qpe, Bundle bundle) {
        this.f41910a = qpe;
        this.f41911b = bundle;
    }

    public void onClick(View view) {
        qpe qpe = this.f41910a;
        ModuleItem moduleItem = (ModuleItem) this.f41911b.getParcelable("chimera_module_item_key");
        Context context = view.getContext();
        if (moduleItem != null) {
            qpq a = qpq.m32626a(context);
            String str = moduleItem.f29996b;
            boolean z = moduleItem.f30003i;
            HashSet hashSet = new HashSet(a.f41922a.getStringSet("Chimera.starredModules", new C1225nr()));
            if (!z) {
                hashSet.add(str);
            } else {
                hashSet.remove(str);
            }
            SharedPreferences.Editor edit = a.f41922a.edit();
            edit.putStringSet("Chimera.starredModules", hashSet);
            edit.commit();
        }
        qpp qpp = qpe.f41912a;
        if (qpp != null) {
            qpp.mo17642h();
        }
    }
}
