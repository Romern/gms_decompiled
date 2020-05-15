package p000;

import android.net.Uri;
import java.io.IOException;

/* renamed from: bbeb */
final /* synthetic */ class bbeb implements bqeh {

    /* renamed from: a */
    private final bbec f102448a;

    /* renamed from: b */
    private final Uri f102449b;

    /* renamed from: c */
    private final Uri f102450c;

    public bbeb(bbec bbec, Uri uri, Uri uri2) {
        this.f102448a = bbec;
        this.f102449b = uri;
        this.f102450c = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Uri uri;
        int i;
        bbec bbec = this.f102448a;
        Uri uri2 = this.f102449b;
        Uri uri3 = this.f102450c;
        bavu bavu = (bavu) obj;
        if (bavu != null) {
            bavq a = bavq.m87609a(bavu.f101939c);
            if (a == null) {
                a = bavq.NONE;
            }
            if (a == bavq.DOWNLOAD_COMPLETE) {
                uri = bbfd.m87917a(bbec.f102451a, bbec.f102463m, bavu.f101938b, bbec.f102454d, bbec.f102461k);
                if (uri != null) {
                    bauo a2 = bauq.m87573a();
                    a2.f101791a = baup.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return bqga.m112777a((Throwable) a2.mo55987a());
                }
                try {
                    if (bbec.f102453c.mo60647c(uri2)) {
                        bbec.f102453c.mo60644a(uri2);
                    }
                    bbec.f102456f.mo56000a();
                    bbec.f102453c.mo60644a(uri3);
                    bxvd da = bpwz.f139594g.mo74144da();
                    String str = bbec.f102459i.f101919b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpwz bpwz = (bpwz) da.f164949b;
                    str.getClass();
                    int i2 = bpwz.f139596a | 1;
                    bpwz.f139596a = i2;
                    bpwz.f139597b = str;
                    int i3 = bbec.f102460j;
                    int i4 = 2 | i2;
                    bpwz.f139596a = i4;
                    bpwz.f139598c = i3;
                    String str2 = bbec.f102459i.f101920c;
                    str2.getClass();
                    bpwz.f139596a = i4 | 4;
                    bpwz.f139599d = str2;
                    bpwz bpwz2 = (bpwz) da.mo74062i();
                    bbep bbep = bbec.f102458h;
                    bauy bauy = bbec.f102455e;
                    long j = (long) bauy.f101852d;
                    long j2 = (long) bbec.f102457g.f101888c;
                    String str3 = bauy.f101850b;
                    int i5 = 0;
                    while (true) {
                        if (i5 < bbec.f102455e.f101859k.size()) {
                            if (bmwb.m108443a(((bavg) bbec.f102455e.f101859k.get(i5)).f101889d, bbec.f102457g.f101889d)) {
                                i = i5 + 1;
                                break;
                            }
                            i5++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    bbep.mo34982a(bpwz2, 4, j, j2, str3, i);
                    return bqga.m112775a((Object) null);
                } catch (IOException e) {
                    bbev.m87908a(e, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", bbec.f102457g.f101887b, bbec.f102455e.f101854f);
                    bbec.f102454d.mo55999a("Failed to decode delta file.", e);
                    bauo a3 = bauq.m87573a();
                    a3.f101791a = baup.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    a3.f101793c = e;
                    return bqga.m112777a((Throwable) a3.mo55987a());
                }
            }
        }
        uri = null;
        if (uri != null) {
        }
    }
}
