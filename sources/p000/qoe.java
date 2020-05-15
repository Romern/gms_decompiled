package p000;

import android.content.Context;
import java.io.File;

/* renamed from: qoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qoe implements bdbt {

    /* renamed from: a */
    final /* synthetic */ qog f41831a;

    /* renamed from: b */
    private final long f41832b;

    /* renamed from: c */
    private final String f41833c;

    public qoe(qog qog, long j, String str) {
        this.f41831a = qog;
        this.f41832b = j;
        this.f41833c = str;
    }

    /* renamed from: a */
    public final void mo24151a(File file, long j) {
        qlp.m32393a().mo8861a(this.f41831a.f41838b, 57, this.f41833c);
        this.f41831a.mo24158a(this.f41832b, j, 8);
    }

    /* renamed from: a */
    public final void mo24152a(File file, bdbs bdbs) {
        long length = file.length();
        qlp a = qlp.m32393a();
        Context context = this.f41831a.f41838b;
        String str = this.f41833c;
        String valueOf = String.valueOf(bdbs.f105286a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        String sb2 = sb.toString();
        if (bdbs.f105286a == bdbr.HTTP_ERROR) {
            String valueOf2 = String.valueOf(sb2);
            int i = bdbs.f105287b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb3.append(valueOf2);
            sb3.append(":");
            sb3.append(i);
            sb2 = sb3.toString();
        }
        String str2 = bdbs.f105288c;
        if (str2 != null) {
            String valueOf3 = String.valueOf(sb2);
            String substring = str2.substring(0, Math.min(str2.length(), 20));
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(substring).length());
            sb4.append(valueOf3);
            sb4.append(":");
            sb4.append(substring);
            sb2 = sb4.toString();
        }
        a.mo8861a(context, 58, sb2);
        this.f41831a.mo24158a(this.f41832b, length, 16);
    }
}
