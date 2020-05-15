package p000;

import android.content.Context;

/* renamed from: mbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbz {

    /* renamed from: a */
    private static final lvn f33394a = new lvn("ComponentEnablerUtil");

    /* renamed from: b */
    private final Context f33395b;

    public mbz(Context context) {
        this.f33395b = context;
    }

    /* renamed from: a */
    public final void mo19843a(String str, boolean z) {
        int d = spn.m35876d(this.f33395b, str);
        if (!z) {
            if (d == 2) {
                return;
            }
        } else if (d == 1) {
            return;
        }
        try {
            spn.m35856a(this.f33395b, str, z);
        } catch (IllegalArgumentException e) {
            f33394a.mo25416d("Unable to set component '%s' to enabled=%b", str, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo19844a(String[] strArr, boolean z) {
        for (String str : strArr) {
            mo19843a(str, z);
        }
    }
}
