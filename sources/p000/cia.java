package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: cia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cia implements ThreadFactory {

    /* renamed from: a */
    final cic f6897a;

    /* renamed from: b */
    final boolean f6898b;

    /* renamed from: c */
    private final String f6899c;

    /* renamed from: d */
    private int f6900d;

    public cia(String str, cic cic, boolean z) {
        this.f6899c = str;
        this.f6897a = cic;
        this.f6898b = z;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        chz chz;
        String str = this.f6899c;
        int i = this.f6900d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(i);
        chz = new chz(this, runnable, sb.toString());
        this.f6900d++;
        return chz;
    }
}
