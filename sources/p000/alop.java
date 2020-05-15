package p000;

import android.content.Context;

/* renamed from: alop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alop extends alor {

    /* renamed from: a */
    public final String f73969a;

    /* renamed from: b */
    private final boolean f73970b;

    public alop(String str, int i, String str2, almp almp, boolean z, String str3) {
        super(str, i, almp, str3, null);
        this.f73969a = str2;
        this.f73970b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        String str = this.f73969a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append("[url=");
        sb.append(str);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo40621d(Context context) {
        return almy.m61373a(context).mo40601a(this.f73969a, this.f73970b);
    }
}
