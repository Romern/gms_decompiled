package p000;

import android.content.Context;

/* renamed from: npc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class npc {

    /* renamed from: a */
    public final String f36290a;

    /* renamed from: b */
    public String f36291b;

    public npc(String str) {
        this.f36290a = str;
    }

    /* renamed from: a */
    public abstract String mo21374a(Context context);

    /* renamed from: b */
    public abstract void mo21375b(Context context);

    /* renamed from: c */
    public abstract void mo21376c(Context context);

    public final String toString() {
        String str = this.f36290a;
        String str2 = this.f36291b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
        sb.append("(");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
