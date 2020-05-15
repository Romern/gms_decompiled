package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.FragmentManagerState;
import android.support.p001v4.app.FragmentState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1119jv {
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Object], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static List m17384a(Object r6, Class cls) {
        if (r6 == 0) {
            return null;
        }
        int size = r6.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj = r6.get(i);
            if (obj == null) {
                arrayList.add(null);
            } else {
                bmxy.m108588a(cls.isAssignableFrom(obj.getClass()));
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m17385a(Bundle bundle, C1050hj hjVar) {
        Bundle bundle2;
        Bundle bundle3 = null;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof FragmentManagerState) {
                FragmentManagerState fragmentManagerState = (FragmentManagerState) obj;
                if (hjVar != null) {
                    List d = hjVar.f19850a.mo12671d();
                    List a = m17384a(fragmentManagerState.f1003a, FragmentState.class);
                    if (a != null) {
                        for (int i = 0; i < d.size(); i++) {
                            C1018gh ghVar = (C1018gh) d.get(i);
                            if (ghVar == null) {
                                bmzs.m108698a(a.get(i) == null);
                            } else {
                                FragmentState fragmentState = (FragmentState) a.get(i);
                                if (fragmentState != null) {
                                    bundle2 = fragmentState.f1022m;
                                } else {
                                    bundle2 = null;
                                }
                                if (bundle2 != null) {
                                    m17385a(bundle2, ghVar.getChildFragmentManager());
                                }
                            }
                        }
                    }
                }
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                bundle3.putParcelable(str, (Parcelable) obj);
                bundle.putParcelable(str, null);
            }
        }
        if (bundle3 == null) {
            bundle.remove("_chimera_container_frag_state");
        } else {
            bundle.putBundle("_chimera_container_frag_state", bundle3);
        }
    }

    /* renamed from: a */
    public static void m17386a(Bundle bundle, ClassLoader classLoader, ClassLoader classLoader2) {
        List a;
        Bundle bundle2 = bundle.getBundle("_chimera_top_level_wrapper_state");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
            bundle.remove("_chimera_top_level_wrapper_state");
        }
        Bundle bundle3 = bundle.getBundle("_chimera_container_frag_state");
        if (bundle3 != null) {
            bundle3.setClassLoader(classLoader2);
            bundle.remove("_chimera_container_frag_state");
        }
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    bundle.putParcelable(str, (Parcelable) obj);
                }
            }
        }
        if (bundle3 != null) {
            for (String str2 : bundle3.keySet()) {
                Object obj2 = bundle3.get(str2);
                if (obj2 != null) {
                    bundle.putParcelable(str2, (Parcelable) obj2);
                    if ((obj2 instanceof FragmentManagerState) && (a = m17384a(((FragmentManagerState) obj2).f1003a, FragmentState.class)) != null) {
                        for (int i = 0; i < a.size(); i++) {
                            FragmentState fragmentState = (FragmentState) a.get(i);
                            if (fragmentState != null) {
                                Bundle bundle4 = fragmentState.f1022m;
                                if (bundle4 != null) {
                                    bundle4.setClassLoader(classLoader);
                                    m17386a(bundle4, classLoader, classLoader2);
                                }
                                Bundle bundle5 = fragmentState.f1019j;
                                if (bundle5 != null) {
                                    bundle5.setClassLoader(classLoader);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
