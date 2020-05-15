package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* renamed from: aoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoy implements C0011ai {

    /* renamed from: a */
    private final ape f1917a;

    public aoy(ape ape) {
        this.f1917a = ape;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        if (adVar == C0005ad.ON_CREATE) {
            akVar.getLifecycle().mo558b(this);
            apc savedStateRegistry = this.f1917a.getSavedStateRegistry();
            if (savedStateRegistry.f1921c) {
                Bundle bundle = savedStateRegistry.f1920b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    savedStateRegistry.f1920b.remove("androidx.savedstate.Restarter");
                    if (savedStateRegistry.f1920b.isEmpty()) {
                        savedStateRegistry.f1920b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        int size = stringArrayList.size();
                        int i = 0;
                        while (i < size) {
                            String str = stringArrayList.get(i);
                            try {
                                Class<? extends U> asSubclass = Class.forName(str, false, aoy.class.getClassLoader()).asSubclass(apa.class);
                                try {
                                    Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((apa) declaredConstructor.newInstance(new Object[0])).mo2253a();
                                        i++;
                                    } catch (Exception e) {
                                        throw new RuntimeException("Failed to instantiate " + str, e);
                                    }
                                } catch (NoSuchMethodException e2) {
                                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException("Class " + str + " wasn't found", e3);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
