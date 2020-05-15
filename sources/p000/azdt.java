package p000;

import android.app.DownloadManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;

/* renamed from: azdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdt extends soa {

    /* renamed from: a */
    final /* synthetic */ String f99117a;

    /* renamed from: b */
    final /* synthetic */ azea f99118b;

    /* renamed from: c */
    final /* synthetic */ String f99119c;

    /* renamed from: d */
    final /* synthetic */ azeb f99120d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azdt(azeb azeb, String str, azea azea, String str2) {
        super(9);
        this.f99120d = azeb;
        this.f99117a = str;
        this.f99118b = azea;
        this.f99119c = str2;
    }

    public final void run() {
        int i;
        String str = this.f99117a;
        new Object[1][0] = str;
        if (!TextUtils.isEmpty(str)) {
            azeb azeb = this.f99120d;
            Uri uri = azeb.f99133a;
            azdf b = azcm.m85300a(azeb.f99137b).mo54657b(this.f99117a);
            if (b != null) {
                if (cfeo.m138870aa() || ((i = b.f99021c) != 2 && i != 1)) {
                    azcm.m85300a(this.f99120d.f99137b).mo54661c(b.f99019a);
                } else {
                    return;
                }
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.f99117a));
            String str2 = this.f99117a;
            Object[] objArr = {Uri.parse(str2).getPath(), str2};
            String valueOf = String.valueOf(Uri.parse(str2).getPath());
            String valueOf2 = String.valueOf(!TextUtils.isEmpty(null) ? this.f99120d.mo54819a((String) null) : "");
            long a = this.f99120d.mo54818a(request, false, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), "preloaded_file_key");
            if (a >= 0) {
                azea azea = this.f99118b;
                if (azea != null) {
                    Long valueOf3 = Long.valueOf(a);
                    Object[] objArr2 = {azea, valueOf3};
                    azeb azeb2 = this.f99120d;
                    azea azea2 = this.f99118b;
                    if (azeb2.f99141f.isEmpty()) {
                        azeb2.mo54820a(azeb.f99133a, azeb2.f99144i);
                    }
                    azeb2.f99141f.put(valueOf3, azea2);
                }
                DatabaseProvider.m94529a(this.f99120d.f99137b.getContentResolver(), this.f99119c, this.f99117a, a);
            }
        }
    }
}
