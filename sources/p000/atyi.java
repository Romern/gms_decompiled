package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: atyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class atyi extends adzt {

    /* renamed from: a */
    private final WeakReference f91111a;

    public atyi(Context context) {
        this.f91111a = new WeakReference(context);
    }

    /* renamed from: a */
    public final void mo50317a() {
        this.f91111a.clear();
    }

    /* renamed from: b */
    public final Context mo50318b() {
        return (Context) this.f91111a.get();
    }
}
