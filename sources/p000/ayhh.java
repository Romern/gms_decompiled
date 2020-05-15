package p000;

import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.Map;

/* renamed from: ayhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhh extends ayfu {

    /* renamed from: c */
    final /* synthetic */ PutDataRequest f97586c;

    /* renamed from: d */
    final /* synthetic */ axrs f97587d;

    /* renamed from: e */
    final /* synthetic */ ayja f97588e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhh(ayja ayja, String str, PutDataRequest putDataRequest, axrs axrs) {
        super(str);
        this.f97588e = ayja;
        this.f97586c = putDataRequest;
        this.f97587d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        axuh axuh;
        PutDataRequest putDataRequest = this.f97586c;
        String str = this.f97588e.mo54021a().f96814a;
        axxf axxf = null;
        if (putDataRequest != null) {
            String host = putDataRequest.f110874a.getHost();
            if (!TextUtils.isEmpty(host)) {
                str = host;
            }
            long j = 0;
            if (putDataRequest.f110877d != 0) {
                j = chnj.f188812a.mo6606a().mo85384J();
            }
            axxf axxf2 = new axxf(str, putDataRequest.f110874a.getPath(), SystemClock.elapsedRealtime() + j);
            for (Map.Entry entry : putDataRequest.mo60251a().entrySet()) {
                String str2 = (String) entry.getKey();
                Asset asset = (Asset) entry.getValue();
                if (asset != null) {
                    String str3 = asset.f110861b;
                    if (str3 != null) {
                        axuh = axuh.m83243a(str3);
                    } else {
                        byte[] bArr = asset.f110860a;
                        if (bArr != null) {
                            axuh = new axuh(bArr, null, null);
                        } else {
                            ParcelFileDescriptor parcelFileDescriptor = asset.f110862c;
                            if (parcelFileDescriptor != null) {
                                axuh = new axuh(null, null, parcelFileDescriptor);
                            } else {
                                String valueOf = String.valueOf(asset);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                                sb.append("Unconvertable asset: ");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                } else {
                    axuh = null;
                }
                axxf2.mo53711a(str2, axuh);
            }
            axxf2.f96642d = putDataRequest.f110876c;
            axxf = axxf2;
        }
        ayja ayja = this.f97588e;
        if (!ayja.f97741t) {
            axxf.f96643e = -1;
        }
        axxr a = ayja.f97727f.mo53728a(ayja.f97726e, axxf);
        a.mo741a(new ayhg(this, a), bqgs.m112810a());
    }
}
