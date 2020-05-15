package p000;

import android.content.Context;
import java.util.Locale;

/* renamed from: alph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alph extends alor {

    /* renamed from: a */
    private final long f74010a;

    /* renamed from: b */
    private final boolean f74011b;

    public alph(String str, int i, almp almp, long j, boolean z) {
        super(str, i, almp, "LoadRawContactImageByRawContactIdOperation");
        this.f74010a = j;
        this.f74011b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(this.f74010a), Boolean.valueOf(this.f74011b)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo40621d(Context context) {
        return altf.m61752a(context, this.f74010a, this.f74011b);
    }
}
