package p000;

import android.content.Context;
import java.util.Locale;

/* renamed from: alpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpd extends alor {

    /* renamed from: a */
    private final long f74002a;

    /* renamed from: b */
    private final boolean f74003b;

    public alpd(String str, int i, almp almp, long j, boolean z) {
        super(str, i, almp, "LoadContactImageByContactId");
        this.f74002a = j;
        this.f74003b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(this.f74002a), Boolean.valueOf(this.f74003b)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo40621d(Context context) {
        return altf.m61754b(context, this.f74002a, this.f74003b);
    }
}
