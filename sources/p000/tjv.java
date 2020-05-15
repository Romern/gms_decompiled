package p000;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import java.util.ArrayList;

/* renamed from: tjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjv {

    /* renamed from: a */
    public final ArrayList f46220a = new ArrayList();

    /* renamed from: b */
    private static String[] m37111b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: a */
    public final KeyFilterImpl mo26612a() {
        return new KeyFilterImpl(this.f46220a);
    }

    /* renamed from: a */
    public final void mo26613a(String str) {
        this.f46220a.add(new KeyFilterImpl.Inclusion(m37111b(str), m37111b(null), m37111b(null)));
    }
}
