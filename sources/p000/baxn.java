package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* renamed from: baxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxn implements baxi {

    /* renamed from: a */
    public final bdce f102045a;

    /* renamed from: b */
    public final baxr f102046b;

    /* renamed from: c */
    private final Context f102047c;

    /* renamed from: d */
    private final befa f102048d;

    public baxn(Context context, bdce bdce, befa befa, baxr baxr) {
        this.f102047c = context;
        this.f102045a = bdce;
        this.f102048d = befa;
        this.f102046b = baxr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ IOException -> 0x00c3 }] */
    /* renamed from: a */
    public final bqgg mo56021a(baxh baxh) {
        char c;
        File file;
        baxc baxc = (baxc) baxh;
        String lastPathSegment = baxc.f102016a.getLastPathSegment();
        bmxy.m108581a(lastPathSegment);
        try {
            beft beft = new beft(this.f102047c);
            Uri uri = ((baxc) baxh).f102016a;
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode != -861391249) {
                if (hashCode == 3143036 && scheme.equals("file")) {
                    c = 1;
                    if (c == 0) {
                        file = beft.f111515a.mo60665b(uri);
                    } else if (c == 1) {
                        file = befs.m94980a(uri);
                    } else {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Couldn't convert URI to path: ");
                        sb.append(valueOf);
                        throw new begt(sb.toString());
                    }
                    File parentFile = file.getParentFile();
                    bmxy.m108581a(parentFile);
                    return aih.m807a(new baxl(this, baxh, parentFile, lastPathSegment, (bdch) this.f102048d.mo60643a(((baxc) baxh).f102016a, new behj(), new beer[0])));
                }
            } else if (scheme.equals("android")) {
                c = 0;
                if (c == 0) {
                }
                File parentFile2 = file.getParentFile();
                bmxy.m108581a(parentFile2);
                return aih.m807a(new baxl(this, baxh, parentFile2, lastPathSegment, (bdch) this.f102048d.mo60643a(((baxc) baxh).f102016a, new behj(), new beer[0])));
            }
            c = 65535;
            if (c == 0) {
            }
            File parentFile22 = file.getParentFile();
            bmxy.m108581a(parentFile22);
            try {
                return aih.m807a(new baxl(this, baxh, parentFile22, lastPathSegment, (bdch) this.f102048d.mo60643a(((baxc) baxh).f102016a, new behj(), new beer[0])));
            } catch (IOException e) {
                bbev.m87908a(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", baxc.f102016a);
                bauo a = bauq.m87573a();
                a.f101791a = baup.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                a.f101793c = e;
                return bqga.m112777a((Throwable) a.mo55987a());
            }
        } catch (IOException e2) {
            bbev.m87906a("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", baxc.f102016a);
            bauo a2 = bauq.m87573a();
            a2.f101791a = baup.MALFORMED_FILE_URI_ERROR;
            a2.f101793c = e2;
            return bqga.m112777a((Throwable) a2.mo55987a());
        }
    }
}
