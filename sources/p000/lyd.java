package p000;

import android.net.Uri;
import java.io.InputStream;

/* renamed from: lyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lyd extends lyr {

    /* renamed from: a */
    final /* synthetic */ bzot f33181a;

    public lyd(bzot bzot) {
        this.f33181a = bzot;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19743a(InputStream inputStream) {
        return (bzoc) bxvk.m124010a(bzoc.f170793a, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19744a() {
        Uri.Builder appendPath = lye.m24636a().appendPath("backups");
        long j = this.f33181a.f170866b;
        StringBuilder sb = new StringBuilder(33);
        sb.append(j);
        sb.append(":updateConfig");
        Uri.Builder appendEncodedPath = appendPath.appendEncodedPath(sb.toString());
        bzoa bzoa = this.f33181a.f170865a;
        if (bzoa != null) {
            lye.m24637a(appendEncodedPath, bzoa);
        }
        return appendEncodedPath.build().toString();
    }
}
