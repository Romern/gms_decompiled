package p000;

import java.io.File;

/* renamed from: baxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxk implements bdbt {

    /* renamed from: a */
    private final aic f102036a;

    public baxk(aic aic) {
        this.f102036a = aic;
    }

    /* renamed from: a */
    public final void mo24151a(File file, long j) {
        file.getName();
        this.f102036a.mo749a((Object) null);
    }

    /* renamed from: a */
    public final void mo24152a(File file, bdbs bdbs) {
        baup baup;
        Object[] objArr = {"DownloadCompleteHandler", file.getName(), bdbs.f105286a};
        aic aic = this.f102036a;
        bauo a = bauq.m87573a();
        bdbr bdbr = bdbs.f105286a;
        bdbr bdbr2 = bdbr.UNKNOWN;
        switch (bdbr.ordinal()) {
            case 0:
                baup = baup.ANDROID_DOWNLOADER_UNKNOWN;
                break;
            case 1:
                baup = baup.ANDROID_DOWNLOADER_CANCELED;
                break;
            case 2:
                baup = baup.ANDROID_DOWNLOADER_INVALID_REQUEST;
                break;
            case 3:
                baup = baup.ANDROID_DOWNLOADER_HTTP_ERROR;
                break;
            case 4:
                baup = baup.ANDROID_DOWNLOADER_REQUEST_ERROR;
                break;
            case 5:
                baup = baup.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                break;
            case 6:
                baup = baup.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                break;
            case 7:
                baup = baup.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                break;
            case 8:
                baup = baup.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                break;
            case 9:
                baup = baup.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                break;
            case 10:
                baup = baup.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                break;
            case 11:
                baup = baup.ANDROID_DOWNLOADER_OAUTH_ERROR;
                break;
            default:
                baup = baup.UNKNOWN_ERROR;
                break;
        }
        a.f101791a = baup;
        String name = bdbs.f105286a.name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
        sb.append("ANDROID_DOWNLOADER_");
        sb.append(name);
        sb.append("; ");
        String sb2 = sb.toString();
        if (bdbs.f105287b >= 0) {
            String valueOf = String.valueOf(sb2);
            int i = bdbs.f105287b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb3.append(valueOf);
            sb3.append("HttpCode: ");
            sb3.append(i);
            sb3.append("; ");
            sb2 = sb3.toString();
        }
        if (bdbs.f105288c != null) {
            String valueOf2 = String.valueOf(sb2);
            String str = bdbs.f105288c;
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 11 + String.valueOf(str).length());
            sb4.append(valueOf2);
            sb4.append("Message: ");
            sb4.append(str);
            sb4.append("; ");
            sb2 = sb4.toString();
        }
        if (bdbs.f105289d != null) {
            String valueOf3 = String.valueOf(sb2);
            String str2 = bdbs.f105289d;
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 13 + String.valueOf(str2).length());
            sb5.append(valueOf3);
            sb5.append("AuthToken: ");
            sb5.append(str2);
            sb5.append("; ");
            sb2 = sb5.toString();
        }
        a.f101792b = sb2;
        aic.mo750a((Throwable) a.mo55987a());
    }
}
