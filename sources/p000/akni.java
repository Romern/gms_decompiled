package p000;

import android.content.Context;
import java.util.List;

/* renamed from: akni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akni {

    /* renamed from: a */
    public static final Object f72303a = new Object();

    /* renamed from: b */
    public static long f72304b = 0;

    /* renamed from: c */
    private final Context f72305c;

    public akni(Context context) {
        this.f72305c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final int mo39584a(List list) {
        if (!list.isEmpty()) {
            return akmy.m60045a(this.f72305c).mo39568a(list, 1);
        }
        return 0;
    }
}
