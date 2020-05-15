package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.update.execution.InstallationEventIntentOperation;

/* renamed from: avno */
public final /* synthetic */ class avno implements bmxj {

    /* renamed from: a */
    public static final bmxj f93525a = new avno();

    private avno() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return null;
     */
    public final Object apply(Object obj) {
        Integer num = (Integer) obj;
        sek sek = InstallationEventIntentOperation.f109495a;
        if (!avmt.f93427a.contains(Integer.valueOf(num.intValue()))) {
            InstallationEventIntentOperation.f109495a.mo25414c("Handling event of type %d.", num);
            avnm avnm = (avnm) avnm.f93517b.mo51589b();
            int intValue = num.intValue();
            new Bundle();
            synchronized (avnm.f93521f) {
                if (intValue == 102) {
                    avnm.f93519d.mo51606a(avnp.f93526a);
                    avnj avnj = avnm.f93523h;
                    if (avnj == null) {
                        avnm.mo51440b();
                        Context context = avnm.f93518c;
                        context.startService(avnh.m78872a(context));
                    } else {
                        avnm.f93524i = true;
                        avnj.mo51434b();
                    }
                } else {
                    avnj avnj2 = avnm.f93523h;
                    if (avnj2 == null) {
                        Context context2 = avnm.f93518c;
                        context2.startService(avnh.m78872a(context2));
                    } else if (!avnj2.mo51436d()) {
                        avnm.f93524i = true;
                    }
                }
            }
        } else {
            InstallationEventIntentOperation.f109495a.mo25409a("Ignoring event of type %d.", num);
            return null;
        }
    }
}
