package p000;

import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bexv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexv implements bgmd {

    /* renamed from: a */
    private final berg f112988a;

    /* renamed from: b */
    private List f112989b = new ArrayList();

    public bexv(berg berg) {
        this.f112988a = berg;
    }

    /* renamed from: a */
    private static boolean m96068a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActivityTransition activityTransition = (ActivityTransition) list.get(i2);
            if (activityTransition.f79305a == 22 && activityTransition.f79306b == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final synchronized void m96069b(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (m96068a(this.f112989b, 0)) {
            arrayList.add(new ActivityTransitionEvent(22, 0, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis)));
        }
        if (m96068a(this.f112989b, 1)) {
            arrayList.add(new ActivityTransitionEvent(22, 1, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis)));
        }
        if (!arrayList.isEmpty()) {
            this.f112988a.mo61012a(arrayList, i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo61243a(List list) {
        this.f112989b = list;
    }

    /* renamed from: a */
    public final void mo61065a(int i) {
        if (cets.f183427a.mo6606a().chreCcTransitionHealthEventEnabled() && cets.m138236b()) {
            m96069b(4);
        }
    }

    /* renamed from: a */
    public final boolean mo61066a(bgmc bgmc) {
        if (cets.m138236b() && bgmc.f116812f) {
            m96069b(0);
        }
        return false;
    }
}
